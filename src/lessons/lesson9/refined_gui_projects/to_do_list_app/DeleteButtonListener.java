package lessons.lesson9.refined_gui_projects.to_do_list_app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextField;

class DeleteButtonListener extends Listener implements ActionListener {

    private JList<ToDo> todoList;

    public DeleteButtonListener(JTextField inputField, JComboBox<String> dayComboBox, DefaultListModel<ToDo> listModel,JList<ToDo> todoList) {
        super(inputField, dayComboBox, listModel);
        this.todoList = todoList;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int selectIndex = todoList.getSelectedIndex();
        if (selectIndex != -1) {
            super.getListModel().remove(selectIndex);
        }

    }

}
