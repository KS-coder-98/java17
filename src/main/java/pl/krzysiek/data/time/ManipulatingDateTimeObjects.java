package pl.krzysiek.data.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;

public class ManipulatingDateTimeObjects {

    public static void t() {
        LocalDate ld = LocalDate.now();
        //throw exception
//        LocalTime lt = LocalTime.from(ld);
        System.out.println(ld.getMonth());
        System.out.println(ld.get(ChronoField.MONTH_OF_YEAR));
        //throw exception
//        System.out.println(ld.get(ChronoField.HOUR_OF_DAY));
        System.out.println(ld.isSupported(ChronoField.MONTH_OF_YEAR));
        System.out.println(ld.isSupported(ChronoField.HOUR_OF_DAY));

        LocalDateTime ldt = ld.atTime(12, 13);
        System.out.println(ldt);
        System.out.println(ldt.getClass().getName());

        //The adjustInto() method in this case adjusts the date (or time) of the ldt object to the date of ld2,
        // changing the date to ld2 but leaving other aspects of the time (e.g., hour, minute, seconds) unchanged.
        LocalDate ld2 = LocalDate.of(2100, 1, 1);
        Temporal res = ld2.adjustInto(ldt);
        System.out.println(res);
        System.out.println(res.getClass().getName());

        Period thirsty = Period.ofDays(30);
        LocalDate feb14 = LocalDate.of(2023, 2, 14);
        System.out.println(feb14);
        System.out.println(feb14.plus(thirsty));

        Period oneMonths = Period.ofMonths(1);
        System.out.println(feb14);
        System.out.println(feb14.plus(oneMonths));

    }
}
