package pl.krzysiek.flowControlWithExceptions;

/**
 * <h2>Own exception</h2>
 * <p>Defining our own exceptions is easy</p>
 * <ul>
 *     <li>Simply subclass something in the Throwable hierarchy</li>
 * </ul>
 * <p>Representing a program bug?</p>
 * <ul>
 *     <li>Subclass something in the RunTimeException subtree</li>
 * </ul>
 * <p>Representing a catastrophe?</p>
 * <ul>
 *     <li>Subclass something in the Error subtree</li>
 * </ul>
 * <p>RePresenting something recoverable/want a checked exception?</p>
 * <ul>
 *     <li>Subclass something in the Exception subtree</li>
 * </ul>
 * <p>Unless local conventions dictate otherwise</p>
 * <h2>Parent Class Initialization</h2>
 * <p>
 *     Most existing exceptions define several constructor variations initializing these aspects
 *     <ul>
 *         <li>String message</li>
 *         <li>Throwable cause</li>
 *     </ul>
 * </p>
 * <p>It's good style to provide constructor options to pass these up to the parent class</p>
 */
public class CustomException {
}

class BadCreditLimitException extends IllegalArgumentException {
    BadCreditLimitException(String msg, Throwable cause) {
        super(msg, cause);
    }

    ;
}
