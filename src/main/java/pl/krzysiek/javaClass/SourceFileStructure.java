package pl.krzysiek.javaClass;

/**
 * <h2>A java source file:</h2>
 * <ul>
 *     <li>
 *         Contains at most one package statement
 *         <ul>
 *             <li>which must come first</li>
 *         </ul>
 *     </li>
 *     <li>
 *         Contains any number of import statements
 *         <ul>
 *             <li>which must come after any package statement</li>
 *         </ul>
 *     </li>
 *     <li>Declares types after all import statements</li>
 *     <li>
 *         Has a name that matches the base of any public type it contains
 *         <ul>
 *             <li>hence can contain at most one public type</li>
 *         </ul>
 *     </li>
 * </ul>
 * <h2>A top-level type can be</h2>
 * <ul>
 *     <li>
 *         a class which may be:
 *         <ul>
 *             <li>"regular", sealed, non-sealed, or final</li>
 *         </ul>
 *     </li>
 *     <li>an abstract class</li>
 *     <li>an enumeration</li>
 *     <li>a record</li>
 *     <li>an interface</li>
 *     <li>an annotation</li>
 * </ul>
 * <h2>A class declaration has an overall form</h2>
 * <p>
 *     'modifiers' class 'ClassName' "generalizations" "permits clause"{
 *         'body'
 *     }
 *     <h3>Legend</h3>
 *     <ul>
 *         <li>' --> obligatory</li>
 *         <li>" --> optional</li>
 *     </ul>
 * </p>
 * <ul>
 *     <li>Acceptable 'modifiers' depend on specifics of the class</li>
 *     <li>The 'ClassName' must be a valid identifier, unique among the types in the current package</li>
 *     <li>"generalizations" can be extends and implements clauses on class types</li>
 *     <li>A "permits clause" is allowed only for a sealed type</li>
 * </ul>
 * <p>There are nine possible modifiers for a class, but ot all can be used all situations and combinations</p>
 * <ul>
 *     <li>Annotations</li>
 *     <li>public - may be used on top-level and member classes but not for local orr anonymous classes</li>
 *     <li>protected, private - may only be used on member classes</li>
 *     <ul>
 *         <li>At most, one of public, protected, and private may appear</li>
 *     </ul>
 *     <li>static may be used on member classes</li>
 *     <li>
 *         An abstract class not prevent creation of valid concrete subtypes
 *         <ul>
 *             <li>Therefore it must not be final</li>
 *             <li>Its methods, including abstract ones, must validly coexist</li>
 *             <li>The name of an abstract class may not follow new</li>
 *         </ul>
 *     </li>
 *     <li>At most one of sealed, non-sealed, or final may appear</li>
 *     <ul>
 *         <li>A sealed type myst declare the children it permits</li>
 *         <li>Local types cannot be sealed or non-sealed</li>
 *         <li>A non-sealed type must have a parent type that is sealed</li>
 *     </ul>
 *     <li>The modifier strictfp is obsolete</li>
 * </ul>
 * <p>A regular or abstract class declared at the top-level of a source file can contain</p>
 * <ul>
 *     <li>static and instance fields</li>
 *     <li>static and instance methods</li>
 *     <li>static and instance initializers</li>
 *     <li>constructors</li>
 *     <li>static and instance classes</li>
 *     <ul>
 *         <li>Static classes are called "nested"</li>
 *         <li>Instance classes are called "inner"</li>
 *     </ul>
 *     <li>implicitly static enums</li>
 *     <li>implicitly static records</li>
 * </ul>
 * <h2>In terms of what they con contain</h2>
 * <ul>
 *     <li>Abstract classes, enum types, and records are classes</li>
 *     <ul>
 *         <li>Records have their own restrictions and syntax</li>
 *     </ul>
 *     <li>Annotations are interfaces</li>
 *     <li>Interfaces are abstract in nature</li>
 *     <li>
 *         Abstract things
 *         <ul>
 *             <li>cannot be final</li>
 *             <li>can contain abstract methods</li>
 *         </ul>
 *     </li>
 *     <li>
 *         Interface types have some unique rules too
 *         <ul>
 *             <li>Their fields and types can only be static, and are so by default</li>
 *         </ul>
 *     </li>
 * </ul>
 */
public class SourceFileStructure {

    interface Thing {
        int x = 99; //x is implicitly public, static and final
    }
}
