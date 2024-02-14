package lessons.lesson5.accessModifier.package3;

import lessons.lesson5.accessModifier.package2.Parent;

public class Child extends Parent {

    public String getProtectedVar() {
        return super.protectedVar;
    }

    // Override from parent
    // @Override
    // public String getProtectedVar() {
    //     return super.getProtectedVar();
    // }
    // @Override
    // public String getPackagePrivate() {
    //     return super.getPackagePrivate();
    // }
    // @Override
    // public String getPrivateVar() {
    //     return super.getPrivateVar();
    // }

    


    
}
