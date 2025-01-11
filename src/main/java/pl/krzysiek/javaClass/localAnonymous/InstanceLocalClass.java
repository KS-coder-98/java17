package pl.krzysiek.javaClass.localAnonymous;

public class InstanceLocalClass {
    private String message = "Message from the outer class";

    public void displayMessage() {
        int x=2;
        class LocalClass {
            void printMessage() {
                //x=3; //x must be final or effective final
                // Access to the field of the outer class using this
                System.out.println(InstanceLocalClass.this.message + x);
            }
        }
        LocalClass local = new LocalClass();
        local.printMessage();

    }

    public static void main(String[] args) {
        InstanceLocalClass example = new InstanceLocalClass();
        example.displayMessage();
    }
}
