package pl.krzysiek.flowControl;

/**
 * <h1>break</h1>
 *
 * <p>
 * The break keyword can be used in a loop
 *     <ul>
 *         <li>and also in a switch statement</li>
 *         <li>the effect is to jump out of loop</li>
 *     </ul>
 * </p>
 *
 * <h1>continue</h1>
 *
 * <p>
 *     The continue keyword can only be used in a loop
 *     <ul>
 *         <li>The effect is to move to the next iteration</li>
 *         <li>while and do-while restart at the test</li>
 *         <li>c-style for restarts with update</li>
 *     </ul>
 * </p>
 *
 * <h1>label</h1>
 *
 * <p>
 *     Java allows a label to be applied to any statement
 *     Scope of label is the statement that is labeled
 *     Namespace is specific to labels
 * </p>
 *
 * <h1>Labels with break and continue</h1>
 *
 * <p>
 *     In their simple form, break and continue relate to the
 *     immediately enclosing loop
 *     If used with nested, labeled, loops, the effect applies to the labeled loop
 * </p>
 */
public class BreakContinue {

//    public void continueFailCompile() {
//        for (int i=0;i<3;i++){
//            System.out.println(i++);
//            continue;
//            ++i; fail compile, because this step never can used
//        }
//    }

    public static void label1() {
        //compile ok
        //anther namespace for label and body of while statement
        myLoop:
        while (true) {
            int myLoop = 0;
        }

    }

    public static void label2() {
        //compile ok
        blockOne:
        {
            int x = 0;
        }

        blockOne:
        {
            int x = 0;
        }

    }

    public void label3() {
        //compile fail, one namespace include to blockOne
        blockOne:
        {
//            blockOne:
//            {
//                int x = 0;
//            }
        }
    }

    /*
    result:
        x=1, y=0:
        x=2, y=0: x=2, y=1:
        x=3, y=0: x=3, y=1: x=3, y=2:
        x=4, y=0: x=4, y=1: x=4, y=2: x=4, y=3:
     */
    public static void scopeContinueWithLabel() {
        outer:
        for (var x = 0; x < 5; System.out.println(), x++) {
            for (var y = 0; y < 5; y++) {
                if (y == x) continue outer; //skip loop with x, y loop break
                System.out.printf("x=%d, y=%d: ", x, y);
            }
        }
    }

    public static void breakAsGoTo() {
        skip:
        {
            if (Math.random() > 0.5) break skip;
            System.out.println("that was small number");
        }
        System.out.println("finished");
    }
}
