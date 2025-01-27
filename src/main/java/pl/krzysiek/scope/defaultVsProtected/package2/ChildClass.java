package pl.krzysiek.scope.defaultVsProtected.package2;

import pl.krzysiek.scope.defaultVsProtected.pakage1.ParentClass;

public class ChildClass extends ParentClass {
    public void displayFields() {
//        System.out.println(defaultField); // BŁĄD - defaultField not visible in another package
        System.out.println(protectedField);  // DZIAŁA - protectedField visible due to inheritance
    }
}
