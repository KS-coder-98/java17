package pl.krzysiek.instanceoOf;

// pattern variables
public class InstanceofExp {
    public static void main(String[] args) {
        Object thing = "Hello";
        if (thing instanceof String) {
            String stringThing = (String) thing;
            if (stringThing.length() > 4) {
                System.out.println("It's a longish string");
            }
        }

        if (thing instanceof String sthingThings) {
            if (sthingThings.length() > 4) {
                System.out.println("It's a longish string");
            }
        }

        if (thing instanceof String sthingThings && sthingThings.length() > 4) {
            System.out.println("It's a longish string");
        }
        TwoNums twoNums1 = new TwoNums(1, 2);
        TwoNums twoNums2 = new TwoNums(1, 2);

        System.out.println(twoNums1.equals(twoNums2));

    }

}

class TwoNums {
    int x, y;

    public TwoNums(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public final boolean equals(Object o) {
        return o instanceof TwoNums twoNums
                && this.x == twoNums.x
                && this.y == twoNums.y;
    }

}
