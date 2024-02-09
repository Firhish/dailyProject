package lessons.lesson5.innerClass;

public class Outer {
    class Inner {
        private String name;
        
        public Inner(String name) {
            this.name = name;
        }
        
        public String getName() {
            return name;
        }
    }
}
