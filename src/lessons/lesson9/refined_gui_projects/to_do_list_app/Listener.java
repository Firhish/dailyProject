package lessons.lesson9.refined_gui_projects.to_do_list_app;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public abstract class Listener {

    private JTextField inputField;
    private JComboBox<String> dayComboBox;
    private DefaultListModel<ToDo> listModel;

    public Listener(JTextField inputField, JComboBox<String> dayComboBox, DefaultListModel<ToDo> listModel) {
        this.inputField = inputField;
        this.dayComboBox = dayComboBox;
        this.listModel = listModel;
    }

    public JTextField getInputField() {
        return inputField;
    }

    public JComboBox<String> getDayComboBox() {
        return dayComboBox;
    }

    public DefaultListModel<ToDo> getListModel() {
        return listModel;
    }

    
}