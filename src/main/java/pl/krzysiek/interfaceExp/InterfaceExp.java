package pl.krzysiek.interfaceExp;

/**
 * <p>
 * An interface can declare several method types
 *     <ul>
 *         <li>
 *             Abstract methods. without a body, ending with semicolon
 *             <ul>
 *                 <li>which are public, instance methods</li>
 *             </ul>
 *         </li>
 *         <li>
 *             Static methods
 *             <ul>
 *                 <li>which may be public or private</li>
 *                 <li>and cannot be invoked using an instance prefix</li>
 *             </ul>
 *         </li>
 *         <li>
 *             Private methods
 *             <ul>
 *                 <li>which may be instance or static</li>
 *             </ul>
 *         </li>
 *         <li>
 *             Default methods
 *             <ul>
 *                 <li>which are public, instance, methods, and have a body</li>
 *             </ul>
 *         </li>
 *     </ul>
 * </p>
 */
public interface InterfaceExp {
    public void m1();

    //    protected void m2();
    void m3();

    //    private void m4();
    default public void m5() {
    }

//    protected void m6() {}

    default void m7() {}

    private void m8() {
    }
}
