package quizzes.quiz2.q24;

class A{}              // Parents
class B extends A{}    // Child to A

public class Test {

    // Valid
    A a1 = new A();   
    B b1 = new B(); 
    A a2 = new B();      // A parent class type variable can declared by instantiating its child object
 
    // Invalid
    // B b2 = new A();   // Cannot declare a variable with child class data by instantiating the parent class object
    
}
