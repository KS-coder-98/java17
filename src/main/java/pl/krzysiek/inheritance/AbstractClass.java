package pl.krzysiek.inheritance;

/**
 * Abstract type are abstract classes and interfaces, they both
 * <ul>
 *     <li>permit the declaration of abstract methods</li>
 *     <li>myst not be instantiated directly</li>
 * </ul>
 * Abstract classes
 * <ul>
 *     <li>cannot be final</li>
 *     <li>
 *         <li>provide constructors tu support initialization by their subclasses</li>
 *         <ul>
 *             <li>perhaps the default constructor</li>
 *             <li>private constructor only support nested subclasses</li>
 *         </ul>
 *     </li>
 * </ul>
 * May define
 * <ul>
 *     <li>static and instance fields, with any accessibility</li>
 *     <li>concrete methods, both static and instance, with any accessibility</li>
 *     <li>nested classes, both static and instance, with any accessibility</li>
 *     <li>nested interfaces, which are implicitly static, whit any accessibility</li>
 * </ul>
 * abstract classes are still classes, and any subclass is still restricted to a single parent, whether abstract or not
 * <h2>Abstract methods must</h2>
 * <ul>
 *     <li>be non-final</li>
 *     <li>be non-private</li>
 *     <li>be instance methods</li>
 *     <li>be terminated with a semicolon rather than a method body</li>
 * </ul>
 * <h3>note that keyword default applies to methods only in interfaces</h3>
 */
abstract class AbstractClassExp {
    protected String name;

    // Constructor
    public AbstractClassExp(String name) {
        this.name = name;
    }

    // Abstract method that must be implemented by subclasses
    public abstract void displayInfo();

    // Concrete method
    public void showName() {
        System.out.println("Name: " + name);
    }
}

// Concrete class extending the abstract class
class ConcreteClass extends AbstractClassExp {

    public ConcreteClass(String name) {
        super(name);
    }

    // Implementation of the abstract method
    @Override
    public void displayInfo() {
        System.out.println("This is a concrete class with name: " + name);
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        // Creating an instance of the concrete class
        ConcreteClass obj = new ConcreteClass("Example");

        // Calling methods
        obj.showName();
        obj.displayInfo();
    }
}
