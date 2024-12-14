package pl.krzysiek.flowControl;

/**
 * <h1>Switch expression</h1>
 * <p>Java syntax expects an expression in certain places</p>
 * <ul>
 *     <li>On the right of an assignment</li>
 *     <li>As part of a larger expression</li>
 *     <li>As an actual parameter to a function invocation</li>
 *     <li>As the return value of a function</li>
 * </ul>
 * <p>
 *     A switch construct (colon or arrow form) becomes an
 *     expression when used in any of these places
 *     <ul>
 *         <li>It should produce a value at runtime</li>
 *         <li>it has a type known at compilation</li>
 *         <li>using the rules of conditional expression (query-colon ? :)</li>
 *     </ul>
 * </p>
 * <p>
 *     A switch expression must map all possible input values to a result, throw an exception:
 *     <ul>
 *         <li>Compiler cannot determine the semantic range of input</li>
 *         <li>Often necessary to use default to silence the error</li>
 *     </ul>
 * </p>
 * <h2>Syntax variations</h2>
 * <ul>
 *     <li>Arrow form with a single-expression</li>
 *     <li>Arrow form with a block</li>
 *     <li>Colon form</li>
 * </ul>
 * <p>
 *     A switch expression allows variations of form:
 *     <ul>
 *         <li>A block to the right of the arrow</li>
 *         <li>Tho colon form</li>
 *     </ul>
 * </p>
 * <p>
 *     A both require the yield to specify the result value
 *     <ul>
 *         <li>Cannot use break in exception</li>
 *         <li>can throw an exception, which aborts evaluation of the expression</li>
 *         <li>the colon form will still fall through useless yield, or throw, are used</li>
 *     </ul>
 * </p>
 */
public class SwitchExpression {

    public static void switchExpression() {
        int x = 10;
        var res = switch (x) {
            case 10 -> "ten";
            default -> "Wrong input";
        };
        System.out.println(res);
    }

    public static void switchExpressionException() {
        int x = 2;
        var res = switch (x) {
            case 10 -> "ten";
            default -> throw new IllegalArgumentException("wrong input");
        };
        System.out.println(res);
    }

    public static void switchExpressionEnumWithOutDefault() {
        Suit diamond = Suit.DIAMOND;
        var res = switch (diamond) {
            case SPADE -> "spade";
            case HEART -> "heart";
            case DIAMOND -> "diamond";
            case CLUB -> "club";
        };
        System.out.println(res);

        System.out.println("##################");
        System.out.println("Res of exp: " + switch (diamond) {
            case SPADE -> "spade";
            case HEART -> "heart";
            case DIAMOND -> "diamond";
            case CLUB -> "club";
        });
    }

    public static void switchExpressionBlockStatementsYield() {
        int yield = 12; //yield is content sensitive, this place don't have any mining
        int x = 0;
        var res = switch (x) {
            case 0 -> {
                System.out.println("calculating for zero...");
                yield "zero"; //like return, but we cant use return keyword
            }
//            case 1-> yield "not zero"; yield not permitted here
            case 1 -> {
                yield "one";
            }
            default -> throw new IllegalArgumentException("Bad value");
        };
        System.out.println(res);

        System.out.println("########");
        var res2 = switch (x) {
            case 0:
                System.out.println("calculating for zero...");
                yield "zero"; //like return, but we cant use return keyword

            case 1:
                yield "one"; //now is okey
            case 2: {
                yield "two";
            }
            default:
                throw new IllegalArgumentException("Bad value");
        };
        System.out.println(res2);
    }

    public static void yieldIsNotObligatory() {
        var msg = "zero ?";
        int x = 1;
        var res = switch (x) {
            case 0:
                System.out.println("calculating for zero");
            default:
                msg += "more computation";
                yield msg;
        };
        System.out.println(res);
    }

    enum Suit {
        SPADE, HEART, DIAMOND, CLUB;
    }
}
