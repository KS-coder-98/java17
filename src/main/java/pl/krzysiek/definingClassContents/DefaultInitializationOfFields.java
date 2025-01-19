package pl.krzysiek.definingClassContents;

/**
 * <p>Fields receive default initialization</p>
 * <ul>
 *     <li>Value will be "zero-like": false, '\0', 0, 0.0., null</li>
 *     <li>Elements of an array are fields, and initialized as such</li>
 *     <li>This is not sufficient for final fields</li>
 * </ul>
 * <p>Default initialization occurs as an indivisible part of memory allocation</p>
 * <ul>
 *     <li>Attempts to read fields before explicit initialization generally show the default value</li>
 *     <li>Curious rules apply if using initializers, to read a field before it has been declared</li>
 * </ul>
 *
 * <h3>static block is executed from top to bottom</h3>
 */
public class DefaultInitializationOfFields {
    //DefaultInitializationOfFields.  required before declaration fields
    static {
        System.out.println("value of count is: " + DefaultInitializationOfFields.count);
        count = 99;
    }

    static int count;

    //DefaultInitializationOfFields.  not required after declaration fields
    static {
        System.out.println("value of count is: " + count);
        count = 99;
    }

    public static void main(String[] args) {
        /*
            int y;
            System.out.println(y);
            y is local variable, compilations fails because y is not initialized
         */
    }

    static {
        System.out.println("count is now: " + count);
    }
}
