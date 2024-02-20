package lessons.lesson10.mysql_impl_demo.to_do_list_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TodosService {

    public void insert(ToDo data) {
        // sql query for insert
        String INSERT_SQL = "insert into todos (title, due, description) values(?, ?, ?);";
        // get connection from MySQLConnector
        try (Connection connection = MySQLConnector.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL)) {

            // insert values into parameters for values() from the ToDo object
            preparedStatement.setString(1, data.getTitle());
            preparedStatement.setString(2, data.getDue());
            preparedStatement.setString(3, data.getDescription());

            System.out.println(preparedStatement);

            preparedStatement.execute();
            connection.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public ToDo[] getAll() {
        // Initialize an empty list to store ToDo objects
        ArrayList<ToDo> todosList = new ArrayList<>();

        try (Connection connection = MySQLConnector.getConnection()) {
            System.out.println("Connected to the database.");

            // Creating a statement
            try (Statement statement = connection.createStatement()) {
                // Executing a simple query to get the count of rows
                // Create rowCount column to hold the count result
                String countQuery = "SELECT COUNT(*) as rowCount FROM todos";
                try (ResultSet countResult = statement.executeQuery(countQuery)) {
                    // iterate through rows
                    if (countResult.next()) {
                        // get the value that "rowCount" column holds
                        int rowCount = countResult.getInt("rowCount");
                        // Ensure capacity for the ArrayList
                        todosList.ensureCapacity(rowCount);
                    }
                }

                // Executing the main query to get ToDo details
                String query = "SELECT * FROM todos";
                try (ResultSet resultSet = statement.executeQuery(query)) {
                    // Processing the result set
                    while (resultSet.next()) {
                        String title = resultSet.getString("title");
                        String due = resultSet.getString("due");
                        String description = resultSet.getString("description");
                        ToDo toDo = new ToDo(title, due, new ToDo.TaskDetails(description));
                        todosList.add(toDo);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Convert the ArrayList to an array
        ToDo[] todosArr = todosList.toArray(new ToDo[0]);
        return todosArr;
    }

    public ToDo delete(int idx) {
        try (Connection connection = MySQLConnector.getConnection()) {
            System.out.println("Connected to the database.");

            // Creating a PreparedStatement
            String query = "DELETE FROM expenses WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                // Setting the parameter value
                statement.setInt(1, idx);

                // Executing the delete statement
                int affectedRows = statement.executeUpdate();

                // Check if a row was affected
                if (affectedRows > 0) {
                    // If a row was deleted, fetch the deleted expense details
                    String selectQuery = "SELECT * FROM expenses WHERE id = ?";
                    try (PreparedStatement selectStatement = connection.prepareStatement(selectQuery)) {
                        selectStatement.setInt(1, idx);
                        try (ResultSet resultSet = selectStatement.executeQuery()) {
                            if (resultSet.next()) {
                                String title = resultSet.getString("title");
                                String due = resultSet.getString("due");
                                String description = resultSet.getString("description");
                                ToDo deletedToDo = new ToDo(title, due, new ToDo.TaskDetails(description));
                                return deletedToDo;
                            }
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
