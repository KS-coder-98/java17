package pl.krzysiek.inheritance;

/**
 * <h1>Subclass declaration syntax</h1>
 * <ul>
 *     <li>The extends keywords is followed by the parent class</li>
 *     <li>
 *         Only one immediate parent class is permitted
 *         <ul>
 *             <li>Multiple parents class exist as a chain of ancestors</li>
 *         </ul>
 *     </li>
 *     <li>If extends clause is omitted the parent is implicitly java.lang.Object</li>
 *     <li>If an implements clause is used, the extends clause must precede it</li>
 * </ul>
 * <h1>Subclassing can be controlled</h1>
 * <ul>
 *     <li>A class that is marked final cannot be subclassed</li>
 *     <li>A class that has only private constructors can be subclassed only by nested/inner classes</li>
 * </ul>
 * <p>
 *     Methods in a subclass that have the same simple name as those in a parent class will be overloads if the
 *     argument type-sequence differs, or attempts to override if not
 *     <ul>
 *         <li>Overloading methods are independent of one another</li>
 *     </ul>
 * </p>
 * <p>
 *     If an instance method is a subclass has the same name and argument type-sequence as a non-private instance method
 *     in parent, then it is an attempt to override. For this to succeed:
 *     <ul>
 *         <li>The parent method not be marked final</li>
 *     </ul>
 *     And for the overriding method:
 *     <ul>
 *         <li>The accessibility must not be less</li>
 *         <li>A reference return type be assignment compatible</li>
 *         <li>A primitive return type must be identical</li>
 *         <li>Checked expected from the parent method must be expected from the parent method</li>
 *         <li>@override may be used to verify overloading</li>
 *     </ul>
 * </p>
 * <h1>Hiding Static methods</h1>
 * <p>
 *     If static method in a subclass has the same name and argument type-sequence as non-private static method in the parent,
 *     then it is similar to overriding. For this to succeed:
 *     <ul>
 *         <li>The accessibility must not be less</li>
 *         <li>A reference return type be assignment compatible</li>
 *         <li>A primitive return type must be identical</li>
 *         <li>Checked exceptions declared by the subclass method must be expected from the parent method</li>
 *         <li>But, @override Cannot used in this case</li>
 *     </ul>
 * </p>

 * <h1>Subclass declaration syntax</h1>
 * <ul>
 *     <li>The extends keyword is followed by the parent class</li>
 *     <li>Only one immediate parent class is permitted</li>
 *     <li>If extends clause is omitted, the parent is implicitly java.lang.Object</li>
 * </ul>
 */
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

class A {}
class B extends A {} // Correct
// class C extends A, B {} // Incorrect - multiple inheritance is not allowed

class Example {} // Implicitly extends Object

/**
 * <h1>Subclassing can be controlled</h1>
 * <ul>
 *     <li>A class that is marked final cannot be subclassed</li>
 *     <li>A class with only private constructors can be subclassed only by nested/inner classes</li>
 * </ul>
 */
final class FinalClass {}
// class SubFinalClass extends FinalClass {} // Compilation error

class Outer {
    private Outer() {}
    static class Inner extends Outer {}
}

/**
 * <h1>Method Overloading and Overriding</h1>
 * <ul>
 *     <li>Methods in a subclass with the same name but different parameters are overloads</li>
 *     <li>Overriding requires matching method signature and a non-final parent method</li>
 * </ul>
 */
class MathUtils {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) { // Overloading
        return a + b + c;
    }
}

class Parent {
    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child method");
    }
}

/**
 * <h1>Hiding Static Methods</h1>
 * <ul>
 *     <li>Static methods can be hidden but not overridden</li>
 * </ul>
 */
class ParentStatic {
    static void display() {
        System.out.println("Parent static method");
    }
}

class ChildStatic extends ParentStatic {
    static void display() { // Hiding
        System.out.println("Child static method");
    }
}

public class Subclass {
}
