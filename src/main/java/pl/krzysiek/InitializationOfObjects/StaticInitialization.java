package pl.krzysiek.InitializationOfObjects;

public class StaticInitialization {

    public static void main(String[] args) {
        System.out.println(x + ", " + y + ", " + z);
    }

    static int x;

    static {
        System.out.println(x + ", " + StaticInitialization.y);
    }

    static int y = 100;

    static {
        System.out.println(x + ", " + StaticInitialization.y);
    }

    static {
        x = y + 10;
    }

    static int z = -1;
}
