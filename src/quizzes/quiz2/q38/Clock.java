package quizzes.quiz2.q38;

public class Clock {
    private String model;
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}
}

// // model is public, hence it is not well encapsulated
// // the methods are basically useless since the model can be accessed and modified anyway from the outside
// public class Clock {
//     public String model;
//     public String getModel() {return model;}
//     public void setModel(String model) {this.model = model;}
// }

// // getModel method is private, hence it is not accessible
// public class Clock {
//     public String model;
//     private String getModel() {return model;}
//     public void setModel(String model) {this.model = model;}
// }

// // model is public, hence it is not well encapsulated
// public class Clock {
//     public String model;
// }