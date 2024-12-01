package pl.krzysiek;

import java.time.*;

/**
 * Class demonstrating different types of time representations in Java.
 * <p>
 * Java provides various ways to work with time, depending on the context and precision requirements.
 * These can be categorized as follows:
 * </p>
 *
 * <h2>1. Absolute moments in history:</h2>
 * <ul>
 *     <li>{@link java.time.Instant} – Represents a point in time as the number of seconds since the Unix epoch (01-01-1970, 00:00:00 UTC).</li>
 *     <li>{@link java.time.ZonedDateTime} – Represents a specific moment in time, including date, time, and time zone information.</li>
 * </ul>
 *
 * <h2>2. Points of human reference (not absolute):</h2>
 * <p>These representations do not include time zone or UTC offset information.</p>
 * <ul>
 *     <li>{@link java.time.LocalDate} – Represents a date (year, month, day) without time or time zone information.</li>
 *     <li>{@link java.time.LocalTime} – Represents a time (hour, minute, second) without a date or time zone.</li>
 *     <li>{@link java.time.LocalDateTime} – Combines date and time but does not include time zone information.</li>
 * </ul>
 *
 * <h2>3. Elapsed time:</h2>
 * <p>These types represent the difference between two points in time:</p>
 * <ul>
 *     <li>{@link java.time.Duration} – Represents elapsed time in units of high precision, such as seconds and nanoseconds.</li>
 *     <li>{@link java.time.Period} – Represents elapsed time in terms of human-readable units such as years, months, and days.</li>
 * </ul>
 *
 * <h2>4. Time zones:</h2>
 * <p>Java provides support for working with time zones, either by offset or by ID.</p>
 * <ul>
 *     <li>{@link java.time.ZoneOffset} – Represents a time zone offset from UTC (e.g., +02:00).</li>
 *     <li>{@link java.time.ZoneId} – Represents a time zone ID (e.g., "Europe/Paris").</li>
 * </ul>
 */


public class Main {
    public static void main(String[] args) {

        Instant i1 = Instant.now();
        System.out.println(i1);

        ZonedDateTime zdt = ZonedDateTime.ofInstant(i1, ZoneId.of("America/Denver"));
        System.out.println(zdt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        Duration dur = Duration.ofMinutes(30);
        System.out.println(dur);

        Period per = Period.of(1, 12, 503);
        System.out.println(per);
        System.out.println(per.normalized());
    }
}