package pl.krzysiek.javaClass.localAnonymous;

public class StaticBehaviorLocalClass {
    public void staticBehaviorExample() {
        class LocalClass {
            void printStaticBehavior() {
                System.out.println("This local class behaves like a static class.");
            }
        }

        LocalClass local = new LocalClass();
        local.printStaticBehavior();
    }

    public static void main(String[] args) {
        StaticBehaviorLocalClass example = new StaticBehaviorLocalClass();
        example.staticBehaviorExample();
    }
}
