package pl.krzysiek.javaClass;

/**
 * <p>
 *     If a class is declared inside another class, but is neither labeled static nor declared in a static context:
 *     <ul>
 *         <li>This type of nested class is generally called an inner class</li>
 *         <li>Instance of this type have an embedded/implicit reference to an instance of the outer class</li>
 *         <li>Through that implicit reference, inner classes gain implicit access to the instance fields of that enclosing instance</li>
 *         <li>
 *             Nested interfaces and enums cannot express this directly
 *             <ul>
 *                 <li>they are implicitly static</li>
 *                 <li>The keyword static is permitted but redundant</li>
 *             </ul>
 *         </li>
 *     </ul>
 * </p>
 * <p>
 *     The enclosing instance can be referred to explicitly using a qualified this
 *     <ul>
 *         <li>Form is OuterName.this</li>
 *         <li>
 *             Usage is equivalent to regular this
 *             <ul>
 *                 <li>Reference to the outer object</li>
 *                 <li>Example: return OuterName.this</li>
 *             </ul>
 *         </li>
 *         <li>
 *             <ul>
 *                 <li>Unless the same name is used in both outer and inner</li>
 *                 <li>Poor style!</li>
 *             </ul>
 *         </li>
 *     </ul>
 * </p>
 * <p>
 *     In Java 11, inner classes cannot contain most static declarations
 *     <ul>
 *         No static fields, methods, nor types
 *         <li>but static final fields, initialized with constant expressions are OK</li>
 *         <li>e.g static final String name = "Inner"</li>
 *     </ul>
 * </p>
 */
public class InnerClass {
}
