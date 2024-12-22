package pl.krzysiek.flowControlWithExceptions;

import javax.sound.midi.MidiUnavailableException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

/**
 * <p>
 * Garbage collection recovers memory, but other resources can be in limited supply too
 *     <ul>
 *         <li>These must be released programmatically</li>
 *     </ul>
 *     The try with resources structure simplifies this
 *     Declare resources in parentheses after the try
 *     <ul>
 *         <li>They will be closed by compiler-generated finally</li>
 *         <li>Separate, or terminate, each with a semicolon</li>
 *     </ul>
 *     The auto-generated finally block means neither catch nor finally are required in the sorce code
 * </p>
 * <h2>Declaring resources</h2>
 * <p>
 *     Resources must:
 *     <ul>
 *         <li>implement AutoCloseable</li>
 *         <li>have effectively, or actually, final reference variables</li>
 *     </ul>
 *     They can be either:
 *     <ul>
 *         <li>Initialized declarations of a new variable, or</li>
 *         <li>A simple mention of an in-scope variable</li>
 *     </ul>
 * </p>
 * <h2>Effectively final</h2>
 * <p>
 *     In Java, a variable is effectively final if its value is assigned only once and never changed after the assignment.
 *     This means it behaves as if it were declared with the final keyword, even though it isn’t explicitly marked as such.
 *     Effectively final variables are important because they can be used in lambda expressions and anonymous classes,
 *     where immutability is required. If a variable is reassigned or modified, it is no longer effectively final,
 *     and the compiler will prevent its use in these contexts.
 * </p>
 */
public class TryWithResources {

    public static void exp1() {
        // this id valid
        //fr and fw are effectively final
        try (FileReader fr = new FileReader("");
             FileWriter fw = new FileWriter("");) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void exp2() throws FileNotFoundException {
        // this id valid
        //fr and fw are effectively final
        FileReader fr = new FileReader("");
        try (fr;
             FileWriter fw = new FileWriter("")) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void multiCatchSyntax() {
        try {
            if (Math.random() > 0.5) throw new FileNotFoundException();
            if (Math.random() > 0.5) throw new MidiUnavailableException();
        } catch (FileNotFoundException | MidiUnavailableException e) {
            //Types in multi-catch must not have a parent/child relationship
            //Not limited to two exception types
            //The type of reference ex will be closest ancestor
            System.out.println("Exception");
        }
    }

    //if a checked exception is rethrown from a catch block,
    //the method must include a throws clause
    //but
    //# if the catch is parent type, multi-catch
    //# and the catch parameter variable is final of effectively final
    //# and the thrown variable is the catch parameter
    //# then, the throws declaration can be specific
    public static void exp3() throws SQLException, FileNotFoundException {
        try {
            if (Math.random() > 0.5) throw new FileNotFoundException();
            if (Math.random() > 0.5) throw new SQLException();
        } catch (FileNotFoundException | SQLException e) {
            throw e;
        }
    }

    public static void exp4() throws Exception {
        try {
            if (Math.random() > 0.5) throw new FileNotFoundException();
            if (Math.random() > 0.5) throw new SQLException();
        } catch (FileNotFoundException | SQLException e) {
            final Exception ee = e;
            throw ee;
        }
    }
}
