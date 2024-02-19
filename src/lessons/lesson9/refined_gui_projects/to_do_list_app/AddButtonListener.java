package lessons.lesson9.refined_gui_projects.to_do_list_app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddButtonListener extends Listener implements ActionListener {


    public AddButtonListener(JTextField inputField, JComboBox<String> dayComboBox, DefaultListModel<ToDo> listModel) {
        super(inputField, dayComboBox, listModel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String todoTitle = super.getInputField().getText().trim();
        String todoDue = (super.getDayComboBox().getSelectedItem()).toString();
        if (!todoTitle.isEmpty()) {
            ToDo todoObj = new ToDo(todoTitle, todoDue);
            super.getListModel().addElement(todoObj);
            super.getInputField().setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a valid to-do item.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
