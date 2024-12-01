package pl.krzysiek;

import java.time.*;
import java.time.temporal.ChronoField;

/**
 *
 * <h1>DateTime API</h1>
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
 * Demonstrates common API conventions used in the Java Date-Time API.
 * <p>
 * The Date-Time API in Java follows specific conventions to ensure consistency and ease of use.
 * These conventions are detailed below:
 * </p>
 *
 * <h2>1. Immutability:</h2>
 * <ul>
 *     <li>Most classes in the Date-Time API are immutable.</li>
 *     <li>Operations on these objects do not modify them but instead create new instances,
 *         similar to how {@link String} behaves in Java.</li>
 *     <li>Exceptions to this immutability principle may exist but are rare.</li>
 * </ul>
 *
 * <h2>2. Object Creation:</h2>
 * <p>Instead of using constructors directly, objects in the Date-Time API are created using factory methods.
 * This approach promotes clarity and ensures flexibility in object instantiation.</p>
 * <ul>
 *     <li><b>of(&lt;values&gt;):</b> Creates an object from specific values (e.g., year, month, day).</li>
 *     <li><b>parse(CharSequence cs):</b> Creates an object from a text representation, such as ISO-8601 strings.</li>
 *     <li><b>from(&lt;value&gt;):</b> Creates an object from a related type (e.g., converting from {@link java.time.Instant}
 *         to {@link java.time.LocalDate}).</li>
 * </ul>
 *
 *
 * <h1>Resume</h1>
 * <p>
 *     <h2>Absolute times:</h2>
 *     <ul>
 *         <li>ZoneDateTime</li>
 *         <li>Instant</li>
 *     </ul>
 *     <h2>Non-absolute time:</h2>
 *     <ul>
 *         <li>LocalDate</li>
 *         <li>LocalTime</li>
 *         <li>LocalDateTime</li>
 *     </ul>
 *     <h2>Distance</h2>
 *     <ul>
 *         <li>Duration - absolute</li>
 *         <li>Period - context dependent</li>
 *     </ul>
 * </p>
 *
 *
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

        LocalDate ld = LocalDate.of(2064, 4, 13);
        System.out.println(ld);
        System.out.println(ld.getMonth());
        ld.plusDays(10);
        LocalDate ld2 = ld.plusDays(10);
        System.out.println(ld);
        System.out.println(ld2);

        System.out.println(ld.with(ChronoField.MONTH_OF_YEAR, 7));

        LocalDate ld3 = LocalDate.parse("2003-04-14");
        System.out.println(ld3);

        LocalDateTime ldt2 = LocalDateTime.now();
        LocalDate ld4 = LocalDate.from(ldt2);
        System.out.println(ld2);
        System.out.println(ld4);

    }
}