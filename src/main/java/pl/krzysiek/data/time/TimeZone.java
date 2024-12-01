package pl.krzysiek.data.time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZone {
    public static void tZone(){
        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        ZoneId zi = ZoneId.of("Europe/Warsaw");
        System.out.println(zi);

        ZoneId.of("Europe/Warsaw")
                .getRules().getTransitionRules()
                .forEach(System.out::println);

        System.out.println(zi.getRules().nextTransition(Instant.now()));
        //TransitionRule[Overlap +02:00 to +01:00, SUNDAY on or after OCTOBER 25 at 01:00 UTC, standard offset +01:00]
        //Transition[Gap at 2025-03-30T02:00+01:00 to +02:00]

        //Transition: Oznacza to, że wystąpiła zmiana w strefie czasowej, czyli przejście z jednej godziny na inną
        // (np. przejście z czasu standardowego na czas letni lub odwrotnie).

        //Gap: Słowo „Gap” wskazuje, że zmiana jest typu „przerwa” (gap), co oznacza, że w tym okresie nie istnieje żadna
        // konkretna godzina w czasie. Dzieje się tak, gdy zmiana strefy czasowej powoduje,
        // że pewna godzina nie istnieje (np. przestawienie zegarów na czas letni), w wyniku czego „dziura” w czasie
        // pojawia się w danym dniu.
        System.out.println(zi.getRules().previousTransition(Instant.now()));

        ZonedDateTime shiftTime = ZonedDateTime.parse("2023-03-25T00:00+01:00[Europe/Warsaw]");
        System.out.println(shiftTime);
        System.out.println(shiftTime.plusHours(24));
        System.out.println(shiftTime.plusHours(48));
        System.out.println(shiftTime.plusHours(72));

        System.out.println("-----------------");
        System.out.println(shiftTime.plusDays(1));
        System.out.println(shiftTime.plusDays(2));
        System.out.println(shiftTime.plusDays(3));

    }
}
