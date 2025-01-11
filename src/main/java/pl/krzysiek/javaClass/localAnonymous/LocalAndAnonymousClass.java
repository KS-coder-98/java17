package pl.krzysiek.javaClass.localAnonymous;

/**
 * <ul>
 *     <li>Java allows classes to be defined inside a block, like within a method</li>
 *     <li>These classes are limited to that block, so access control (like public, private isn't allowed)</li>
 *     <li>
 *         The behavior of these class depends on whether the block has a this reference:
 *         <ul>
 *             <li>If this is present, the class acts as instance class</li>
 *             <li>Otherwise, it behaves as static class (but without using the static keyword, which is not allowed here)</li>
 *         </ul>
 *     </li>
 *     <li>Additionally, Java 11 does not allow defining local enums or local interfaces</li>
 * </ul>
 */
public class LocalAndAnonymousClass {
}
