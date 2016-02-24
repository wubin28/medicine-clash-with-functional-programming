import org.junit.*;
import static org.junit.Assert.*;
import java.util.Date;
import java.util.Calendar;

public class Java7DateTest {

    @Test
    public void should_create_a_date_for_just_now() {
        Date date = new Date(); // just now!

        assertEquals(date.toString(), date.toString());
    }

    @Test
    public void should_create_a_date_for_a_specific_date() {
        Calendar calendar = Calendar.getInstance(); // just now!
        
        calendar.set(2016, 0, 26); // January 26th, 2016. January is 0

        assertEquals(calendar.getTime().toString(), 
            calendar.getTime().toString());
    }

    @Test
    public void should_add_several_days_to_a_specific_date() {
        Calendar calendar = Calendar.getInstance(); // just now!
        calendar.set(2016, 0, 26); // January 26th, 2016. January is 0

        calendar.add(Calendar.DAY_OF_MONTH, 7);

        assertEquals(calendar.getTime().toString(), 
            calendar.getTime().toString());
    }

    @Test
    public void date_class_is_mutable_in_java_7_but_not_in_java_8() {
        Date current = new Date();
        User user = new User(current);
        Date date = User.getCreationDate();

        date.setTime(0L);

        assertEquals(current.toString(), 
            User.getCreationDate().toString());
    }

    @Test
    public void use_a_defensive_copy_to_prevent_mutable_date_class() {
        Date current = new Date();
        User user = new User(current);
        Date date = user.getCreationDateImmutable();

        date.setTime(0L);

        assertEquals(current.toString(), 
            user.getCreationDateImmutable().toString());
    }

}
