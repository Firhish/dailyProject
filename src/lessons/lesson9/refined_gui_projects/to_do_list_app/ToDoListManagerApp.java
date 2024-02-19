package lessons.lesson9.refined_gui_projects.to_do_list_app;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class ToDoListManagerApp extends JFrame {
    private JTextField inputField;
    private JComboBox<String> dayComboBox;
    private JList<ToDo> todoList;
    private DefaultListModel<ToDo> listModel;

    ToDoListManagerApp(){

        // Basic setup
        setTitle("To-Do List Manager App");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel mainPanel = new JPanel();
        JPanel textPanel = new JPanel();
        JPanel dayPanel = new JPanel();
        JPanel displayPanel = new JPanel();

        // Add label and text input
        JLabel inputLabel = new JLabel("Enter todo: ");
        inputField = new JTextField(20);
        textPanel.add(inputLabel);
        textPanel.add(inputField);

        // Add day selection combo box
        JLabel dayLabel = new JLabel("Enter due date: ");
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        dayComboBox = new JComboBox<>(daysOfWeek);
        dayPanel.add(dayLabel);
        dayPanel.add(dayComboBox);

        // Add display panel
        listModel = new DefaultListModel<>();
        todoList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(todoList);
        displayPanel.add(scrollPane);

        // Add add button
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new AddButtonListener(inputField, dayComboBox, listModel));

        // delete button
        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new DeleteButtonListener(inputField, dayComboBox, listModel, todoList));
        displayPanel.add(deleteButton);

        // add all to main panel
        mainPanel.add(textPanel);
        mainPanel.add(dayPanel);
        mainPanel.add(addButton);
        mainPanel.add(displayPanel);

        add(mainPanel);
    }

}
