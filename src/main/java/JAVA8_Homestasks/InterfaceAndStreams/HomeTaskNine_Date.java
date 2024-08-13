package JAVA8_Homestasks.InterfaceAndStreams;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class HomeTaskNine_Date
{
    public static void main(String[] args) {
        // 1. Predicate to check if a date is yesterday
        System.out.println("1 : Predicate to check if a date is yesterday");
        Predicate<LocalDate> isYesterday = date -> date.equals(LocalDate.now().minusDays(1));
        System.out.println("Is yesterday: " + isYesterday.test(LocalDate.now().minusDays(1))); // true
        System.out.println("Is yesterday: " + isYesterday.test(LocalDate.now())); // false

        // 2. Supplier to get date for next Thursday
        System.out.println("2 : Supplier to get date for next Thursday");
        Supplier<LocalDate> nextThursdaySupplier = () -> LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println("Next Thursday: " + nextThursdaySupplier.get());

        // 3. Supplier to get current time in EST timezone
        System.out.println("3 : Supplier to get current time in EST timezone");
        Supplier<String> estTimeSupplier = () ->
        {
            LocalTime estTime =ZonedDateTime.now(ZoneId.of("America/New_York")).toLocalTime();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
            return estTime.format(formatter);
        };
        System.out.println("Current time in EST: " + estTimeSupplier.get());

        // 4. Function to calculate the age of a person given date of birth
        System.out.println("4 : Function to calculate the age of a person given date of birth");
        Function<LocalDate, Integer> ageCalculator = birthDate -> Period.between(birthDate, LocalDate.now()).getYears();
        LocalDate birthDate = LocalDate.of(1990, 8, 15);
        System.out.println("Age: " + ageCalculator.apply(birthDate));
    }

}
