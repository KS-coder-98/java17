package pl.krzysiek.definingClassContents;

/**
 * The JVM, for security reasons, does not permit an unspecified number of arguments to a method call
 * <ul>
 *     <li>
 *         Simple Solution: pass an array
 *     </li>
 *     <li>
 *         This is a single argument containing "any number"
 *     </li>
 *     <li>
 *         The length of the array is known by the array, so avoiding any chance of accessing or mutating a non-existent argument
 *     </li>
 *     <li>
 *         Often called "varargs"
 *     </li>
 * </ul>
 * <p>To specify a variable length argument list</p>
 * <ul>
 *     <li>
 *         This must be the last element of the method's formal parameters
 *         <ul>
 *             <li>
 *                  which also implies only one varargs element is permitted
 *             </li>
 *         </ul>
 *     </li>
 *     <li>
 *         Declare the formal parameter using the ellipsis format -> String... v
 *     </li>
 * </ul>
 * <p>
 *     A variable length argument list receives a single array
 * </p>
 * <ul>
 *     <li>
 *         Processing is exactly the same as any other array
 *         <ul>
 *             <li>
 *                 use the length field
 *             </li>
 *             <li>
 *                 access the elements with subscripts
 *             </li>
 *             <li>
 *                 iterate with enhanced for
 *             </li>
 *         </ul>
 *     </li>
 * </ul>
 * <p>
 *     A varargs method is usually invoked with a comma separated list of items
 *     <ul>
 *         <li>
 *             The compiler creates an array for this
 *         </li>
 *         <li>
 *             Alternative, the caller can explicitly pass an array
 *         </li>
 *     </ul>
 * </p>
 */
public class VariableLengthArgumentsList {

    void showAll(int x, String... v) {
        System.out.println("There are " + v.length + " items");
        for (String s : v) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        new VariableLengthArgumentsList().showAll(3, "fred", "nina", "antek");
        String[] names = {"fred", "nina", "antek"};
        new VariableLengthArgumentsList().showAll(2, names);
    }
}
