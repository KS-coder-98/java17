package pl.krzysiek.javaClass.localAnonymous;

/**
 * <h2>
 *     If class is to be declared and instantiated only at the point of declaration, no name is required. This is an anonymous class
 * </h2>
 * <ul>
 *     <li>Equivalent to "make this while handing over instructions" - main2</li>
 *     <li>Multiple instance can be made, but only by re-executing the same line of code</li>
 *     <li>Anonymous classes often occur in methods, but can be used in any assignment, including field initialization - main3</li>
 *     <li>
 *         Anonymous classes require a single generalized type (parent) to be indicated in the constructor syntax
 *         which can be class, abstract class, or interface type
 *     </li>
 * </ul>
 */
public class AnonymousClass {
    public static void main1(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is an anonymous class!");
            }
        };

        task.run();  // Uruchamiamy metodę run
    }

    public static void main2(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running via anonymous class!");
            }
        }).start();
    }

    public static void main3(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running task in method");
            }
        };
        task.run();
    }
}
