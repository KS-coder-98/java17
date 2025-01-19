package pl.krzysiek.definingClassContents;

import java.util.List;

/**
 * <h1>Fields Declaration syntax</h1>
 * <p>
 * Fields in types have a general declaration form:
 * modifiers Type Identifier initialization
 * </p>
 * <ul>
 *     <li>Modifiers are annotations, public/protected/private, static, final, transient, and volatile</li>
 *     <ul>
 *         <li>no repetitions</li>
 *         <li>order is not significant (but is guided by convention)</li>
 *     </ul>
 *     <li>Type can include generic information</li>
 *     <ul><li>e.g.: ListString or ListE</li></ul>
 *     <li>Initialization uses simple assignment from an expression</li>
 *     <li>
 *         for multiple variables of the same type, use a comma separated list of everything right of the Type
 *     </li>
 * </ul>
 */
public class FieldDeclarationSyntax {
    //List<E> le, lf = null, List<string> ls; Compilations fails, different types must have have separate declarations

    //final static public @Deprecated List<String> le; Compilations fails final variables must be definitely, explicitly, initialized
}
