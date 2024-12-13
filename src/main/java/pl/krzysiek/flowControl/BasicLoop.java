package pl.krzysiek.flowControl;

import java.util.List;

public class BasicLoop {
    /**
     * <h1>While loop</h1>
     *
     * <p>
     * A while loop controls a single "statement"
     * but not a declaration
     * usually a block
     * Might execute zero times
     * Control expression must be boolean type
     * Unboxing is allowed
     * And must be in parentheses
     * </p>
     */
    public static void whileLoop() {
        int x = 0;
        while (x < 3) {
            System.out.println("x is " + x);
            x++;
        }
    }

    /**
     * <h1>Do - while loop </h1>
     *
     * <p>
     * A do-while loop also controls a single "statement"
     * Executes at least once
     * Control expression must be followed with semicolon
     * </p>
     */
    public static void doWhileLoop() {
        int x = 0;
        do {
            System.out.println("x is " + x);
            x++;
        } while (x <= 1);
    }

    /**
     * <h1>C-style for loop</h1>
     *
     * <p>
     * A c-style for loop controls a single "statement"
     * Might execute zero times
     * Elements provide
     *     <ul>
     *         <li>Initialization</li>
     *         <li>Control expression</li>
     *         <li>Update</li>
     *     </ul>
     * </p>
     *
     * <h2>Initialization</h2>
     * <p>
     *     <ul>
     *         <li>A declaration of single base type - only one type</li>
     *         <li>Multiple declaration items separated with commas</li>
     *         <li>or, comma-separated statements</li>
     *     </ul>
     * </p>
     *
     * <h2>Updates</h2>
     * <p>Updates can be comma-separated statements</p>
     * <p>can not have declaration in this section</p>
     *
     * <h2>What can be omitted</h2>
     * <p>All three parts of the C-style for loop can be omitted</p>
     * <ul>
     *     <li>Individually, or in any combination</li>
     *     <li>Always include the semicolons</li>
     *     <li>Zero declaration</li>
     *     <li>missing condition evaluates true</li>
     *     <li>zero updates</li>
     * </ul>
     */
    public static void cStyleForLoop() {
        for (int x = 0; x < 3; x++) {
            System.out.println("x is " + x);
        }

        for (int x = 0, y = 2, z[] = {1, 2, 3};
             x < 3;
             x++, y--, System.out.println()) {
            System.out.printf("x: %1$d, y:%2d, z[%2$d]: %3$d", x, y, z[y]);
        }

        for (; ; ) {
            System.out.println("while (true)");
        }
    }

    /**
     * <h2>The enhanced for Loop</h2>
     *
     * <p>An enhanced-for loop takes item individually from "many"</p>
     * <ul>
     *     <li>"many" can be Iterable (e.g.List,Set, but not Map</li>
     *     <li>or can be array</li>
     *     <li>Iteration order is determined by the source</li>
     *     <li>No counter variable is maintained</li>
     * </ul>
     */
    public static void enhancedForLoop() {
        List<String> names = List.of("Fred", "Jim", "Sheila");
        for (String s : names) {
            System.out.println(s);
        }
    }

}
