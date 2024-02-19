package lessons.lesson10.mysql_impl_demo.to_do_list_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TodosService {

    public TodosService() {}

    public void insert(ToDo data) {
        String INSERT_SQL = "insert into todos (title, due, description) values(?, ?, ?);";
        try (Connection connection = MySQLConnector.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL)) {
            
            preparedStatement.setString(1, data.getTitle());
            preparedStatement.setString(2, data.getDue());
            preparedStatement.setString(3, data.getDescription());

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.execute();
            connection.close();
        } catch (SQLException e) {
            // print SQL exception information
            e.printStackTrace();
        }
    }

}
