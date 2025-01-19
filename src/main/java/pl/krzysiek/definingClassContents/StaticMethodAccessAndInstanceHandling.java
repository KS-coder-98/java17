package pl.krzysiek.definingClassContents;

import java.sql.SQLDataException;

/**
 * <p>
 * Method have a general declaration form:
 * modifiers header body
 * </p>
 * <ul>
 *     <li>
 *         modifiers are: annotations, public, protected, private, abstract, static, final, synchronized, native, strictfp
 *     </li>
 *     <li>
 *         header is generic-declarations return type name formal parameter list array throws
 *     </li>
 *     <li>
 *         formal parameter list is zero or more formal parameters, comma separated, inside parentheses
 *     </li>
 * </ul>
 */
public class StaticMethodAccessAndInstanceHandling {
    int x;

    static void doStuff() {
        System.out.println(new StaticMethodAccessAndInstanceHandling().x);
    }

    static void doStuff(StaticMethodAccessAndInstanceHandling staticMethodAccessAndInstanceHandling) {
        System.out.println(staticMethodAccessAndInstanceHandling.x);
    }

    static <E, F> void doStuff(String st, E e, F fff) throws SQLDataException {

    }
}
