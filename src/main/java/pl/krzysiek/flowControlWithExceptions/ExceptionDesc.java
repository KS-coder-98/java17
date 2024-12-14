package pl.krzysiek.flowControlWithExceptions;

/**
 * <p>
 *     Exception can arise for many reasons, nut wto broad categories
 *     <ul>
            <li>Program bugs</li>
            <li>External problems</li>
 *     </ul>
 * </p>
 * <h2>Java groups exceptions into two categories</h2>
 * <h3>Checked exception</h3>
 * <ul>
 *     <li>Generally external</li>
 *     <li>"Reasonable/polite" to try to recover</li>
 *     <li>Compiler expects some code for handling these</li>
 * </ul>
 * <h3>Unchecked exceptions</h3>
 * <ul>
 *     <li>Compiler entirely ignores these</li>
 *     <li>Bugs (null pointer, array index, etc)</li>
 *     <li>Impractical to recover (out of memory, etc.)</li>
 * </ul>
 * <p>
 *     The distinction is nt always exact, and must be the best guess of the code being called,
 *     not caller
 * </p>
 * <h2>If an exception arises in method</h2>
 * <ul>
 *     <li>and no applicable catch block is available</li>
 *     <li>then the method "completed abruptly"</li>
 *     <li>and the method throws that exception to its caller</li>
 * </ul>
 * <h2>If method might throw a checked exception</h2>
 * <ul>
 *     <li>it must declare that possibility with a throws clause</li>
 *     <li>declaring a superclass of the actual exception</li>
 * </ul>
 * <p>
 *     Constructor are subject to the same declare-or-handle rule as methods. What that means:
 *     Constructors are subject to the same "declare-or-handle" rule as methods.
 *     This means that if a constructor can throw a checked exception, it must explicitly declare
 *     it in its signature using the throws clause.
 * </p>
 * <p>
 *     Initializers are prohibited from throwing checked exception. What that means:
 *     Initializers (both static and instance initializers) are prohibited from throwing checked exceptions.
 *     This restriction exists because initializers cannot declare exceptions.
 *     However, they can throw unchecked exceptions, such as RuntimeException or Error.
 * </p>
 * <p>
 *     Checked exceptions must be declared
 *     <ul>
 *         <li>so the compiler always knows when they are possible</li>
 *         <li>this is how it can always enforce the declaration requirement</li>
 *     </ul>
 * </p>
 * <p>
 *     Declaring throws does not say the exception will arise, only that caller must be ready if it does
 *     It's common to declare an exception that cannot occur
 *     in the existing code to plan for future implementation
 *     or subclasses
 * </p>
 * <p>
 *     The compiler has no interest at all in unchecked exceptions.
 *     There's no need to declare them
 *     Declaring them is allowed but ignored by the compiler
 * </p>
 */
public class ExceptionDesc {
}
