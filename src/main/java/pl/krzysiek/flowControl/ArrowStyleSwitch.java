package pl.krzysiek.flowControl;

/**
 * <h1>Avoiding break</h1>
 * <p>
 * Accidental omission of <b>break</b> in <b>switch</b> is a source of errors
 *     <ul>
 *         <li>Execution falls through to the following <b>case</b></li>
 *         <li>This provided for alternation and some hand-optimization</li>
 *     </ul>
 * </p>
 * <p>
 *     Java now has the "arrow form" for <b>case</b>
 *     <ul>
 *         <li>No break (generally)</li>
 *         <li>No fall-through</li>
 *         <li>Alternation is handled with commas</li>
 *         <li>This is also supported for colon form</li>
 *         <li>Each case takes a single "subordinate clause"</li>
 *         <li>statement, statement expression, or block</li>
 *     </ul>
 * </p>
 */
public class ArrowStyleSwitch {

    public static void switchExp() {
        int x = 99;
        switch (x) { //execute all statement
            case 97, 98, 99:
                System.out.println("ninety-nine");
            case 100:
                System.out.println("one hundred");
            default:
                System.out.println("other");
        }

        switch (x) {
            case 96, 98, 99 -> { //execute only one statement
                System.out.println("ninety-nine");
                x += 100;
            }
            case 100 -> System.out.println("one hundred");
            /*
            case 101 -> break;
            Break cannot be used in this way. If surrounded with curlies, it would be valid.
            If replaced with curlies, the result would be the same
             */
            case 101 -> {} //empty block
            default -> System.out.println("other");
        }
        System.out.println("x is:" + x);
    }
}
