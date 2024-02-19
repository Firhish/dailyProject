package lessons.lesson9.refined_gui_projects.to_do_list_app;

import javax.swing.SwingUtilities;

public class Main {
     public static void main(String[] args) {
        // Using this method to generate GUI
        SwingUtilities.invokeLater(() -> {
            ToDoListManagerApp app = new ToDoListManagerApp();
            app.setVisible(true);
        });
    }
    
}
