package pl.krzysiek.definingClassContents;

/**
 * <ul>
 *     <li>
 *         Do not have the static modifier.
 *         Non-static methods are associated with an instance of a class and cannot be marked as static.
 *         This means they must be invoked on a specific instance of the class.
 *     </li>
 *     <li>
 *         The firs (usually implicit) argument is
 *         <ul>
 *             <li>
 *                 called this -> it represents the object on which the method is invoked
 *             </li>
 *             <li>
 *                 It is of the enclosing type (the type of the class in which the method is defined)
 *             </li>
 *             <li>
 *                 It is "effectively final" – meaning the reference this cannot be reassigned within the method.
 *             </li>
 *         </ul>
 *     </li>
 *     <li>
 *         Must be invoked with an instance of the enclosing type
 *         Invoking a non-static method requires a reference to an instance of the class. This can happen in the following ways:
 *         <ul>
 *             <li>
 *                 Implicitly through the this value – within the same class, the method can be invoked directly without specifying the object.
 *             </li>
 *             <li>
 *                 Explicitly through the this value – by explicitly using this, for example, this.methodName().
 *             </li>
 *             <li>
 *                 Any non-null expression referring to an instance – by using any valid reference to an instance of the class, such as objectInstance.methodName().
 *             </li>
 *         </ul>
 *     </li>
 * </ul>
 * <h3>
 *     Summary
 * </h3>
 * <p>
 *     In summary, non-static methods are tied to specific instances of a class, use the this reference for context,
 *     and must be invoked on an appropriate object. Let me know if you'd like further clarification!
 * </p>
 */
public class InstanceMethods {

    //Instance variable
    private String name;

    public InstanceMethods(String name) {
        this.name = name;
    }

    //Non-static method
    public void greet() {
        // Implicit use of 'this' to call another instance method
        printMessage("Hello, " + this.name + "!");
    }

    //Another non-static method
    private void printMessage(String message) {
        System.out.println(message);
    }

    // Method that explicitly demonstrates the use of 'this'
    public void demonstrateThisUsage() {
        System.out.println("Demonstrating 'this':");
        System.out.println("Name of this object " + this.name); // Explicitly using 'this' to refer to the instance variable
    }

    public static void main(String[] args) {
        // Create an instance of the class
        InstanceMethods instance1 = new InstanceMethods("Alice");

        // 1. Implicit invocation of a non-static method
        instance1.greet();

        // 2. Explicit invocation using 'this' (inside the method)
        instance1.demonstrateThisUsage();

        // 3. Invocation using a valid reference to the instance
        InstanceMethods instance2 = new InstanceMethods("Bob");
        instance2.greet();

        // 4. Demonstrating chaining instance methods
        System.out.println("\nChaining methods using 'this':");
        instance1.chainExample().chainExample().greet(); // Chain calls on the same instance
    }

    // Example of chaining methods using 'this'
    public InstanceMethods chainExample() {
        System.out.println("Chaining instance method invoked on: " + this.name);
        return this; // Returning the current instance
    }

}
