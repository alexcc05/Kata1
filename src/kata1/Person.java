package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {

    private final String name;
    private final String surname;
    private static final long MILLIS_PER_YEAR = (long) (60 * 60 * 24 * 1000 * 365.25);

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Calendar getBirth() {
        return birth;
    }
    private final Calendar birth;

    public Person(String name, String surname, Calendar birth) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public int getAge() {
        Calendar today= GregorianCalendar.getInstance();
        return (int) milliseconds(today.getTimeInMillis() - birth.getTimeInMillis());
    }

    private long milliseconds(long millis) {
        return (millis / MILLIS_PER_YEAR);
    }
}
