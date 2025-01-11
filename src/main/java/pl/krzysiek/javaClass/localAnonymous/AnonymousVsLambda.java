package pl.krzysiek.javaClass.localAnonymous;

import java.util.Comparator;

public class AnonymousVsLambda {
    public void example() {
        // Differences between an anonymous class and a lambda expression in Java:

        // 1. **Syntax**:
        // Anonymous class:
        Comparator<Integer> comparator1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        // Lambda:
        Comparator<Integer> comparator2 = (o1, o2) -> o1 - o2;

        // 2. **Flexibility**:
        // An anonymous class can implement more than one method and extend classes, providing greater flexibility.
        // A lambda expression is limited to functional interfaces (one abstract method).

        // 3. **Access to local variables**:
        // In both cases, access to local variables is only allowed if they are final or effectively final.

        // 4. **Readability**:
        // Lambda expressions are more concise and clearer, especially for simple cases.
        // Anonymous classes require more code, which can make the code harder to read.

        // 5. **Usage**:
        // Anonymous classes are better for more complex cases (multiple methods, extending classes).
        // Lambda expressions are best for simple implementations of functional interfaces.

        // 6. **Performance**:
        // Lambda expressions are generally more memory- and performance-efficient.
        // Anonymous classes can be less efficient due to the larger amount of code in memory.

        // 7. **Instances**:
        // An anonymous class creates a full-fledged class, which can increase memory usage.
        // A lambda is a function, not a full class, so instances are lighter.

    }
}
