package pl.krzysiek.scope;

import static pl.krzysiek.scope.I.getNum;

interface I {
    static double getNum() {
        return 0.0;
    }
}

public class StaticInterface implements I {
    void doStuff() {
        double d = I.getNum();
        StaticInterface x = new StaticInterface();
        getNum();
    }
}
