package pl.krzysiek.InitializationOfObjects;

/**
 * <p>Java allows overloaded constructors</p>
 * <ul>
 *     <li>Argument type sequence must differ as for methods</li>
 *     <li>Delegate from one to another by invoking this(...)</li>
 *     <li>
 *         If delegation occurs, responsibility for superclass initialization is also delegated
 *         <ul>
 *             <li>Superclass initialization precedes instance initialization</li>
 *         </ul>
 *     </li>
 * </ul>
 * <p>All constructors start with one of:</p>
 * <ul>
 *     <li>explicit call to this(...)</li>
 *     <li>explicit call to super(...)</li>
 *     <li>implicit call to super()</li>
 * </ul>
 * <p>
 *     When delegating with this(...) or super(...)
 * </p>
 * <ul>
 *     <li>
 *         argument expressions must not use the this reference, either implicitly or explicitly
 *         <ul>
 *             <li>Java assumes the current object is not yet initialized</li>
 *             <li>Argument locals, static members, and external references are fine</li>
 *         </ul>
 *     </li>
 * </ul>
 */
public class OverloadConstructors {

    private String name;
    private int age;

    // Constructor without arguments
    public OverloadConstructors() {
        this("Unknown", 0); // Delegation to other constructions
        System.out.println("No-argument constructor called");
    }

    // Constructor with one argument (String)
    public OverloadConstructors(String name) {
        this(name, 0); // Delegation to other constructions
        System.out.println("Single-argument constructor called");
    }

    // Constructor with two arguments (String, int)
    public OverloadConstructors(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Two-argument constructor called");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Wywołanie różnych konstruktorów
        OverloadConstructors obj1 = new OverloadConstructors();
        System.out.println("Object 1 -> Name: " + obj1.getName() + ", Age: " + obj1.getAge());

        OverloadConstructors obj2 = new OverloadConstructors("Alice");
        System.out.println("Object 2 -> Name: " + obj2.getName() + ", Age: " + obj2.getAge());

        OverloadConstructors obj3 = new OverloadConstructors("Bob", 25);
        System.out.println("Object 3 -> Name: " + obj3.getName() + ", Age: " + obj3.getAge());
    }
}
