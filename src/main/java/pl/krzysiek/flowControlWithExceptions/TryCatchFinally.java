package pl.krzysiek.flowControlWithExceptions;

import java.io.FileNotFoundException;

/**
 * <h1>Try</h1>
 * <p>
 * happy path
 * </p>
 * <h1>catch(XEception)</h1>
 * <p>
 * one catch block one kind of problem
 * </p>
 * <h1>finally</h1>
 * <p>
 * code that must execute whether we succeed, fail and recover, or fail
 * </p>
 * <p>
 *     <ul>
 *         <li>Exception may be thrown in try</li>
 *         <li>Caught by an applicable catch</li>
 *         <li>Potential multiple catch blocks</li>
 *         <ul>
 *             <li>One per problem</li>
 *             <li>Cannot have a catch for impossible exception</li>
 *         </ul>
 *         <li>A finally block "definitely executes"</li>
 *         <li>Both catch and finally are optional</li>
 *         <ul>
 *             <li>But in this form, one or the other must be present</li>
 *         </ul>
 *     </ul>
 * </p>
 * <h1>Flow</h1>
 * <h2>If no exception "happy path"</h2>
 * <ul>
 *     <li>The try blocks runs completely</li>
 *     <li>The finally block runs completely</li>
 *     <li>Flow continues after the finally</li>
 * </ul>
 * <h2>If an exception arises</h2>
 * <ul>
 *     <li>Flow jumps out of the try block</li>
 *     <li>
 *         Finds the first matching catch block
 *         <ul>
 *             <li>Matching as with instance of</li>
 *             <li>Runs the block</li>
 *         </ul>
 *     </li>
 *     <li>The finally block runs completely</li>
 *     <li>Flow continues after the finally</li>
 * </ul>
 * <h2>If an exception arises - no suitable catch</h2>
 * <ul>
 *     <li>Flow jumps out ot the try block</li>
 *     <li>
 *         <b>If no suitable catch is found</b>
 *     </li>
 *     <li>The finally block runs completely</li>
 *     <li>
 *         The exception is still "active"
 *         <ul>
 *             <li>This could be handed by an enclosing try block</li>
 *             <li>Or the exception will be passed to the caller od theis method</li>
 *         </ul>
 *     </li>
 * </ul>
 */
public class TryCatchFinally {

    public static void tryCatchFinally() {
        try {
            try {
                if (Math.random() > 0.5)
                    throw new FileNotFoundException();
            } finally {
                System.out.println("all done here");
            }
            System.out.println("Trundling along");
        } catch (FileNotFoundException fnfe) {
            System.out.println("aha");
        } finally {
            System.out.println("real done");
        }
        System.out.println("continuing");
    }
}