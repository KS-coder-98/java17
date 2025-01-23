package pl.krzysiek.definingClassContents;

/**
 * <h1>Java Method Overriding Rules</h1>
 * <p>Overriding in Java means providing a new implementation for a method inherited from a base class. Below are the detailed rules and requirements for method overriding in Java:</p>
 * <h2>1. Method Signature</h2>
 * <p>The overriding method must have the <strong>same name</strong>, the same <strong>return type</strong> (or a <strong>covariant return type</strong>), and the <strong>same parameter list</strong> as the method in the base class.</p>
 * <h2>2. Access Modifier</h2>
 *      <ul>
 *         <li>The overriding method cannot have a more restrictive access modifier than the method in the base class:</li>
 *         <ul>
 *             <li>If the base class method is <code>public</code>, the overriding method must also be <code>public</code>.</li>
 *             <li>If the base class method is <code>protected</code>, the overriding method can be <code>protected</code> or <code>public</code>, but not <code>private</code>.</li>
 *         </ul>
 *     </ul>
 * <h2>3. <code>@Override</code> Annotation</h2>
 * <p>It is recommended to use the <code>@Override</code> annotation before the overriding method. This ensures the compiler checks whether the method truly overrides an existing one. If it doesn’t match any method in the base class, the compiler will throw an error.</p>
 * <h2>4. Static Methods Cannot Be Overridden</h2>
 * <p><code>static</code> methods cannot be overridden. Defining a <code>static</code> method with the same name in a subclass is called method hiding, not overriding.</p>
 *
 * <h2>5. Final Methods Cannot Be Overridden</h2>
 * <p>If a method in the base class is marked as <code>final</code>, it cannot be overridden in the subclass.</p>
 * <h2>6. Private Methods and Constructors Cannot Be Overridden</h2>
 * <p>Private methods are not visible in subclasses, so they cannot be overridden. Similarly, constructors cannot be overridden, as they are not inherited by subclasses.</p>
 *
 * <h2>7. Exception Handling</h2>
 * <p>The overriding method cannot throw broader exceptions than the method in the base class:</p>
 * <ul>
 *    <li>If the base class method declares exceptions, the overriding method can:</li>
 *       <ul>
 *           <li>Declare no exceptions.</li>
 *            <li>Declare exceptions that are subtypes of those declared in the base class.</li>
 *      </ul>
 *   <li>If the base class method declares no exceptions, the overriding method cannot declare any.</li>
 * </ul>
 * <h2>8. Constructors Cannot Be Overridden</h2>
 * <p>In Java, constructors are not inherited or overridden. Each class defines its own constructors.</p>
 *
 * <h2>9. Polymorphism with Overridden Methods</h2>
 * <p>Overriding allows for polymorphism in Java. The method called depends on the actual type of the object, not the reference type:</p>
 * <h2>10. Overriding in Abstract Classes and Interfaces</h2>
 * <p>A subclass inheriting from an abstract class or implementing an interface must override all abstract methods (unless the subclass itself is abstract).</p>
 */
public class MethodOverriding {

    class Parent {
        protected Object method() {
            System.out.println("Parent method");
            return "Parent method";
        }
    }

    class Child extends Parent {
        @Override
        public String method() throws IllegalArgumentException {
            System.out.println("Child method");
            return "Child result";
        }
    }

    public static void main(String[] args) {
        MethodOverriding test = new MethodOverriding();

        //Polymorphism: the reference type is Parent, but the object is Child
        Parent parentRef = test.new Child();

        try {
            // Method call through the Parent type (behavior depends on the actual object)
            Object result = parentRef.method();
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println();

        // Direct method call on the object of type Child
        Child child = test.new Child();
        String childResult = child.method();
        System.out.println("Child-specific result: " + childResult);


    }
}
