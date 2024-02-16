package lessons.lesson8.assignments.a3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ToDoListManagerApp extends JFrame {
    private JTextField inputField;
    private JList<String> todoList;
    private DefaultListModel<String> listModel;

    ToDoListManagerApp(){

        // Basic setup
        setTitle("File Explorer App");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel mainPanel = new JPanel();
        JPanel upperPanel = new JPanel();
        JPanel lowerPanel = new JPanel();

        // upper panel content
        JLabel inputLabel = new JLabel("Enter todo: ");
        inputField = new JTextField(20);
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new AddButtonListener());

        // add to upper panel
        upperPanel.add(inputLabel);
        upperPanel.add(inputField);
        upperPanel.add(addButton);

        // lower panel content
        listModel = new DefaultListModel<>();
        todoList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(todoList);

        // add to lower panel
        lowerPanel.add(scrollPane);

        mainPanel.add(upperPanel);
        mainPanel.add(lowerPanel);
        add(mainPanel);
    }

    private class AddButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String todo = inputField.getText().trim();
            if (!todo.isEmpty()) {
                listModel.addElement(todo);
                inputField.setText("");
            }
        }
        
    }

     public static void main(String[] args) {
        // Using this method to generate GUI
        SwingUtilities.invokeLater(() -> {
            ToDoListManagerApp app = new ToDoListManagerApp();
            app.setVisible(true);
        });
    }
    
}
