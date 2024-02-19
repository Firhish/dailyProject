package lessons.lesson9.refined_gui_projects.to_do_list_app;

public class ToDo {

    private String title;
    private String due;

    public ToDo(String title, String due){
        this.title = title;
        this.due = due;
    }

    public String getDue() {
        return due;
    }
    
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", title,due);
    }
}
