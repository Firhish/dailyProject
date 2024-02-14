package lessons.lesson5.accessModifier.package2;

public class Parent {
    public String publicVar = "public";            // all can access
    protected String protectedVar = "protected";   // only class in the same package or subclasses can access
    String packagePrivate = "package-private";     // only class in the same package can access
    private String privateVar = "private";         // no one can access

    // Subclasses override this to get full access
    // public String getPackagePrivate() {
    //     return packagePrivate;
    // }

    // public String getProtectedVar() {
    //     return protectedVar;
    // }
    
    // public String getPrivateVar() {
    //     return privateVar;
    // }
}
