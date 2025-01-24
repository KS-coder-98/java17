package pl.krzysiek.javaClass;

public class UsePS {
    public static void main(String[] args) {
        P p = new S();
        p.show(p);
        System.out.println(p.message);
        System.out.println(((S) p).message);
    }
}

class P {
    public String message = "p";

    void show(P p) {
        System.out.println(p.message);
    }
}

class S extends P {
    public String message = "s";

    @Override
    void show(P p) {
        System.out.println("sub says " + p.message);
    }
}
