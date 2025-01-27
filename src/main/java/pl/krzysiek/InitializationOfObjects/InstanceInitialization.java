package pl.krzysiek.InitializationOfObjects;

/**
 * <p>Instance fields are initialized during  construction</p>
 * <ul>
 *     <li>To zero/zero-like values</li>
 *     <li>Using an assignment from an expression in the declaration</li>
 *     <li>In any number of instance initializer blocks</li>
 *     <li>In a constructor or constructors chained using this</li>
 * </ul>
 * <p>Notes</p>
 * <ul>
 *     <li>Initializations execute in order from top to bottom</li>
 *     <li>Must declare before making an unqualified read</li>
 *     <li>Only an initializer block can express flow control</li>
 *     <li>No checked exceptions can be unhandled</li>
 * </ul>
 *
 * <h2>Initialization using constructors</h2>
 * <p>Instance initialization can also be performed using constructors</p>
 * <ul>
 *     <li>These should perhaps be called 'initializers', since they do not perform construction</li>
 * </ul>
 * <p>
 *     When new Xxx(...) is invoked:
 * </p>
 * <ul>
 *     <li>memory is allocated and zeroed (as if by new)</li>
 *     <li>a constructor matching Xxx(...) is called</li>
 * </ul>
 * <p>The constructor:</p>
 * <ul>
 *     <li>(generally) passes control to the superclass</li>
 *     <li>runs the instance initializations</li>
 *     <li>completes tje body pf thr constructor</li>
 * </ul>
 * <h2>Order of executions - initialization</h2>
 * <ol>
 *     <li>Memory allocation</li>
 *     <li>Zeroing fields</li>
 *     <li>Superclass initialization</li>
 *     <li>Instance initializer block and filed initialization statements (top to bottom)</li>
 *     <li>Constructor body</li>
 * </ol>
 *
 *
 * <h2>A constructor in Java can use the return statement followed only by a semicolon (return;),
 * and it cannot return any value or expression.</h2>
 *
 * <p>If the source code does not declare any constructor - constructor creates the default constructor</p>
 * <p>A default constructor has these properties:</p>
 * <ul>
 *     <li>
 *         Accessibility matches the class
 *         <ul>
 *             <li>Except for enums, which are always private</li>
 *         </ul>
 *     </li>
 *     <li>Zero arguments(expect for inner classes)</li>
 *     <li>No throws clause</li>
 *     <li>Delegates to super() with zero arguments</li>
 * </ul>
 */
public class InstanceInitialization {
    public static void main(String[] args) {
        new InstanceInitialization();
    }

    public void go() {
        System.out.println(x + ", " + y + ", " + z);
    }

    int x;

    {
        System.out.println(x + ", " + this.y);
    }

    int y = 100;

    {
        System.out.println(x + ", " + this.y);
    }

    {
        x = y + 10;
    }

    int z = -1;
}
