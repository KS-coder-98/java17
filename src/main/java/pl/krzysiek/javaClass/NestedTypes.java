package pl.krzysiek.javaClass;

/**
 * <p>
 * A type declared inside another type is generally known as a nested type
 * </p>
 * <ul>
 *     Generally:
 *     <li>
 *         The name is effectively OuterName.NestedName
 *         <ul>
 *             <li>but this can be shortened in the scope of OuterName</li>
 *         </ul>
 *     </li>
 *     <li>
 *         Nested types can generally have any accessibility: public, protected, default, and private
 *     </li>
 *     <li>
 *         Enclosing and nested classes all share privileged access tu members
 *     </li>
 * </ul>
 * <h2>
 *     The Meaning of private
 * </h2>
 * <p>
 *     The visibility of a private member is often misunderstood
 *     <ul>
 *         <li>Only in the same class -> nope!!! wrong answer</li>
 *         <li>Anywhere inside the enclosing top-level curly braces surrounding the declaration</li>
 *     </ul>
 * </p>
 */
public class NestedTypes {
    private int outerX;

    class Nester1 {
        private int nester1x;

        void show() {
            Nester2 nester2 = new Nester2();
            nester2.nester2x = 2;
            outerX = 1;
        }
    }

    class Nester2 {
        private int nester2x;

        void show() {
            Nester1 nester1 = new Nester1();
            nester1.nester1x = 1;
            outerX = 1;
        }
    }
}
