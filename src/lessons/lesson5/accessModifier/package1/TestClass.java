package lessons.lesson5.accessModifier.package1;

import lessons.lesson5.accessModifier.package2.Child2;
import lessons.lesson5.accessModifier.package3.Child;

public class TestClass {
    public static void main(String[] args) {

        Child child = new Child();                        // can access public and protected 
        System.out.println(child.publicVar);
        System.out.println(child.getProtectedVar());   
        
        Child2 child2 = new Child2();                     // can access public, protected and package-private
        System.out.println(child2.publicVar);
        System.out.println(child2.getProtectedVar());
        System.out.println(child2.getPackagePrivateVar()); 

        
        // Can access all var if use getter that overrides from parent
        // System.out.println(child.getProtectedVar());
        // System.out.println(child.getPackagePrivate());
        // System.out.println(child.getPrivateVar());
    }
}
