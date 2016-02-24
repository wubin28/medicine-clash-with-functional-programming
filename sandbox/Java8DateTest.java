import org.junit.*;
import static org.junit.Assert.*;
import java.time.Instant;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Java8DateTest {

    // TODO: the_1st_concept_is_Instant_which_is_a_point_on_the_time_line
    // TODO: the_2nd_concept_is_Duration_which_is_the_elapsed_time_between_two_instants

    @Test
    public void the_3rd_concept_is_LocalDate_which_covers_the_birthday_case() {
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(1970, Month.OCTOBER, 28);
        LocalDate oneMonthBeforeBirthday = birthday.minusDays(30);

        assertEquals(now.toString(), now.toString());
        assertEquals("1970-10-28", birthday.toString());
        assertEquals("1970-09-28", oneMonthBeforeBirthday.toString());
        assertTrue(birthday.isAfter(oneMonthBeforeBirthday));
        assertTrue(oneMonthBeforeBirthday.isBefore(birthday));
    }

    @Test
    public void the_4th_concept_is_Period_which_is_the_amount_of_time_between_two_LocalDate() {
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(1970, Month.OCTOBER, 28);

        assertEquals(45, birthday.until(now).getYears());
        assertEquals(16555, birthday.until(now, ChronoUnit.DAYS));
    }

    // TODO: the_5th_concept_is_DateAdjuster_which_is_useful_to_add_or_substract_an_amount_of_time_to_an_Instant_or_a_LocalDate() {
    // TODO: the_6th_concept_is_LocalTime_which_is_a_time_of_a_day
    // TODO: the_7th_concept_is_ZonedTime_which_is_the_time_zone_all_over_the_earth

    @Test
    public void the_1st_concept_is_Instant_which_is_a_point_on_the_time_line() {
        Instant now = Instant.now();

        assertEquals(now.toString(), now.toString());
    }

    @Test
    public void the_2nd_concept_is_Duration_which_is_the_elapsed_time_between_two_instants() {
        Instant start = Instant.now();
        for (int i = 0; i < 100000; i++) {
        }
        Instant end = Instant.now();

        Duration elapsed = Duration.between(start, end);;
        long milliseconds = elapsed.toMillis();

        assertEquals(milliseconds, milliseconds);
    }

}
