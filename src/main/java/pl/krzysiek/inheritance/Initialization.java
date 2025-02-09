package pl.krzysiek.inheritance;

class Y {
    {
        System.out.println("Initializing Y"); //1
    }
}

class X extends Y {
    {
        System.out.println("Initializing X"); //2
    }

    public X() {
        System.out.println("X()"); //3
    }

    public X(int x) {
        this();
        System.out.println("X(" + x + ")");
    }
}

public class Initialization {
    public static void main(String[] args) {
        new X(1);
    }
}
