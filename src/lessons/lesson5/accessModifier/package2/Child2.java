package lessons.lesson5.accessModifier.package2;

public class Child2 extends Parent{

    // If a subclass
    public String getProtectedVar() {
        return super.protectedVar;
    }

    public String getPackagePrivateVar() {
        return super.packagePrivate;
    }

    // If not a subclass 
    // public String getProtectedVar() {
    //     Parent parent = new Parent();
    //     return parent.protectedVar;
    // }

    // public String getPackagePrivateVar() {
    //     Parent parent = new Parent();
    //     return parent.packagePrivate;
    // }


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
