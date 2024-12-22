package pl.krzysiek.javaClass;

public class ComponentsClass {
    /*
    Static Block
    The static block is executed once, when the class is loaded into memory by the Java Virtual Machine (JVM).
    It runs before any instance of the class is created.
    In this case, when the class ComponentsClass is loaded, the console will print: hello
     */
    static {
        System.out.println("Hello");
    }

    /*
    Instance Initialization Block
    This block is executed every time an instance of the class is created. It runs before the constructor is called.
    If you create an object of ComponentsClass, the console will also print: hello
     */
    {
        System.out.println("Hello");
    }

    /*
    Static Inner Class
    This is a static inner class. It does not have a reference to the enclosing class ComponentsClass.
    ComponentsClass.A obj = new ComponentsClass.A();
     */
    static class A {
    }

    /*
    Non-static Inner Class
    This is a non-static inner class. It has a reference to an instance of the outer class ComponentsClass.
    You must create an instance of ComponentsClass before you can create an object of class B.
    ComponentsClass outer = new ComponentsClass();
    ComponentsClass.B inner = outer.new B();
     */
    class B {
    }

    static enum X {} //static is redundant

    static interface Y { //static is redundant
    }
}
