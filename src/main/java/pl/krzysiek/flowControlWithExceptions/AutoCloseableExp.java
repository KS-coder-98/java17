package pl.krzysiek.flowControlWithExceptions;

/**
 * <p>
 * A try with resources structure automatically closes resources
 *     <ul>
 *         <li>Those resources must implement AutoCloseable</li>
 *         <li>
 *             Many such resources actually implement Closeable
 *             <ul>
 *                 <li>Closeable extends AutoCloseable</li>
 *                 <li>
 *                     Closeable was used prior to Java 7, before
 *                     AutoCloseable and try-with-resources existed
 *                 </li>
 *             </ul>
 *         </li>
 *         <li>
 *             Closeable declares a compatible close() method
 *             <ul>
 *                 <li>Zero arguments</li>
 *                 <li>Return void</li>
 *                 <li>Closeable throws IOException</li>
 *                 <li>AutoCloseable throws Exception</li>
 *             </ul>
 *         </li>
 *     </ul>
 * </p>
 * <h2>Closing resources</h2>
 * <p>
 *     <ul>
 *         <li>If a resource throws an exception during close, other resources are still closed</li>
 *         <li>
 *             Resources are closed in reverse order of their listing
 *             <ul>
 *                 <li>Not necessarily the same as order of creation</li>
 *             </ul>
 *         </li>
 *         <li>
 *             A previously-declared resource can simply be named in the resource block, this will be closed too
 *             <ul>
 *                 <li>Such a resource must be effectively final</li>
 *             </ul>
 *         </li>
 *     </ul>
 * </p>
 */
public class AutoCloseableExp {

    public static void ownCloseableTest() {
        System.out.println("Starting");
        try (MyResource mr = new MyResource()) {
            System.out.println("using resources...");
        }
        System.out.println("Ending");
    }

    public static void orderClosingResource() {
        System.out.println("Starting");
        try (MyResource mr0 = new MyResource();
             MyResource mr1 = new MyResource();
             MyResource mr2 = new MyResource()) {
            System.out.println("using resource");
        }
        System.out.println("ending");
    }

    public static void orderClosingResource1() {
        System.out.println("Starting");
        MyResource mr2 = new MyResource();
        try (MyResource mr1 = new MyResource();
             mr2;
             MyResource mr3 = new MyResource()) {
            System.out.println("using resource");
        }
//        mr2=null; // must be final or effective final
        System.out.println("ending");
    }


}

class MyResource implements java.lang.AutoCloseable {

    private static int nextId = 0;
    private final int id = nextId++;

    {
        System.out.println("Initializing MyResource id=" + id);
    }

    @Override
    public void close() {
        System.out.println("Closing id:" + id);
    }
}
