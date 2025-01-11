package pl.krzysiek.javaClass.localAnonymous;

public class LocalClassExample {
    public void displayMessage() {
        // Definition of a local class inside a method
        class LocalClass {
            void printMessage() {
                System.out.println("Hello from a local class!");
            }
        }

        // Creation and usage of an instance of a local class
        LocalClass local = new LocalClass();
        local.printMessage();
    }

    public static void main(String[] args) {
        LocalClassExample example = new LocalClassExample();
        example.displayMessage();
    }
}
