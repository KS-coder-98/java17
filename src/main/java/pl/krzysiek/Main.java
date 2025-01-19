package pl.krzysiek;


import pl.krzysiek.data.time.BasicJavaDateTimeApi;
import pl.krzysiek.data.time.ManipulatingDateTimeObjects;
import pl.krzysiek.definingClassContents.AccessingShadowedAndInheritedFields;
import pl.krzysiek.javaClass.BuildMe;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        BasicJavaDateTimeApi.createJavaDataTimeObjects();
        ManipulatingDateTimeObjects.t();

        BuildMe qwer = BuildMe.builder().name("qwer").date(LocalDate.now()).build();
        System.out.println(qwer);

        AccessingShadowedAndInheritedFields accessingShadowedAndInheritedFields = new AccessingShadowedAndInheritedFields();
        AccessingShadowedAndInheritedFields.X x = accessingShadowedAndInheritedFields.new X();
        x.doStuff();
    }
}