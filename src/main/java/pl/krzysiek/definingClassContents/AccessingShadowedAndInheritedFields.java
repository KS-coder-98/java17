package pl.krzysiek.definingClassContents;

public class AccessingShadowedAndInheritedFields {
    interface I {
        int value = 10;
    }

    class J {
        public static int value = 11;
    }

    public class X extends J implements I {
        public static int value = 12;

        public void doStuff() {
            J j = new J();
            System.out.println(J.value);
            System.out.println(j.value);
            System.out.println(super.value);
            System.out.println(((J) this).value);
        }
    }


}
