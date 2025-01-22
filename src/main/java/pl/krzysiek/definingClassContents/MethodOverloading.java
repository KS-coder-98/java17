package pl.krzysiek.definingClassContents;

/**
 * The "full name" of a method is made up of
 * <ul>
 *     <li>the fully qualified classname</li>
 *     <li>the method's short name</li>
 *     <li>the type-sequence of the arguments</li>
 * </ul>
 * <p>
 *     Two methods in different classes are always different methods, though they might have a special relationship
 * </p>
 * <p>
 *     Two methods in the same class with the same name, but different argument type sequences are different methods,
 *     and have no syntactic relationship --this is overloading
 * </p>
 * <p>
 *     Some argument types are not actually different
 *     <ul>
 *         <li>Array forms: [] and ...</li>
 *         <li>Generic variations: List.TypeA and List.TypeB</li>
 *     </ul>
 * </p>
 * <p>
 *     Method modifiers don't count as differences either:
 *     <ul>
 *         <li>synchronized, strictfp, native</li>
 *         <li>final</li>
 *         <li>access control (public etc.)</li>
 *     </ul>
 * </p>
 * <p>
 *     There's no difference in the call site, so the compiler cannot distinguish the intended target
 * </p>
 * <p>
 *     Overload resolution follows an order:
 * </p>
 * <ul>
 *     <li>
 *         A perfect match of arguments type and count always wins
 *         <ul>
 *             <li>widening promotions may be applied</li>
 *             <li>look for the nearest/shortest promotion</li>
 *             <li>ambiguity causes compilation failure</li>
 *         </ul>
 *     </li>
 *     <li>
 *         Autoboxing/unboxing may be tried
 *         <ul>
 *             <li>will not change basic type</li>
 *             <li>ambiguity causes compilation failure</li>
 *         </ul>
 *     </li>
 *     <li>
 *         Varargs may be tried
 *         <ul><li>ambiguity causes compilation failure</li></ul>
 *     </li>
 * </ul>
 */
public class MethodOverloading {

    static void var(int x) {
        System.out.println("var 1");
    }

    static void var(Integer x) {
        System.out.println("var 4");
    }

    static void var(long x) {
        System.out.println("var 2");
    }

    static void var(char x) {
        System.out.println("var 3");
    }

    public static void main(String[] args) {
        var(1);
        var(1L);
        var('A');
        var(Integer.valueOf(2));
        var(null);
    }
}
