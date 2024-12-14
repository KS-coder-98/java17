package pl.krzysiek.flowControl;

/**
 * <h1>Switch</h1>
 *
 * <p>
 * <h2>Values for case</h2>
 *     <ul>
 *         <li>must all be unique</li>
 *         <li>must be constant expression</li>
 *         <li>must be assignment compatible with the switch type</li>
 *         <li>must not be null</li>
 *         <li>may be listed in any order (including default)</li>
 *         <li>are matched using == except for String</li>
 *     </ul>
 *     <h2>Constraints</h2>
 *     <ul>
 *         <li>assignable to int (including boxed values)</li>
 *         <li>String</li>
 *         <li>an enum type</li>
 *     </ul>
 *     The switch value may be a constant expression
 *     If the switch expression evaluates to null, a NullPointerException is thrown
 *    <h2>Labels in switch</h2>
 *    Recall that labels may be added to any statement
 *    <li>this includes a switch</li>
 *    <li>continue can only refer to a loop label</li>
 *    <li>but break can refer to any in-scope label, including:</li>
 *    <ul>
 *        <li>that of switch</li>
 *        <li>or that of an enclosing statement such as a loop</li>
 *    </ul>
 *    <li>behavior is as expected</li>
 *
 *    <h2>default</h2>
 *    In a Java switch statement, the default block executes when none of the case
 *    labels match the value of the switch expression. It acts as a fallback and is optional.
 *    <h2>with out break</h2>
 * <p>
 * <p>
 *     In C-style behavior (also applicable to Java), if a case in a switch statement lacks a break,
 *     execution "falls through" to subsequent cases,
 *     executing their code until a break or the end of the switch is encountered.
 *     This allows multiple cases to share logic but can lead to unintended behavior if not used carefully.
 * </p>
 */
public class SwitchStatement {
/* compile error
    public static void switchError() {
        final char x = 1;
        int offset = 0;
        switch (x) {
            case 65_536: //to big to char
                System.out.println("Big");
                break;
            case offset + 1: //offset not final
                System.out.println("Off + 1");
            default:
                System.out.println("Something else");
        }
    }
 */

    public static void switchExample() {
        final char x = 1;
        final int offset = 0;
        switch (x) {
            case 65_52: //to big to char
                System.out.println("Big");
                break;
            case offset + 2: //offset not final
                System.out.println("Off + 1");
                break;
            default:
                System.out.println("Something else");
        }
    }

    public static void switchBehaviorWithLabel() {
        int x = 1;
        outer:
        {
            switch (x) {
                case 1:
                    System.out.println("Case 1");
                    break outer;
                case 2:
                    System.out.println("Case 2");
                    break;
            }
            System.out.println("After switch"); // Executed only if there was no break outer
        }

        System.out.println("#########");
        x = 2;
        outer:
        {
            switch (x) {
                case 1:
                    System.out.println("Case 1");
                    break outer;
                case 2:
                    System.out.println("Case 2");
                    break;
            }
            System.out.println("After switch"); // Executed only if there was no break outer
        }
    }

}
