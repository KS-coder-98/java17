package pl.krzysiek.definingClassContents;

import java.util.Arrays;

public class VarArgsExp {
    static void process(String... v) {
        v[1] = "The name's James...";
    }

    public static void main(String[] args) {
        String[] names = {"Fred", "Jim", "Sheila"};
        process(names);
        System.out.println(Arrays.toString(names));
    }
}
