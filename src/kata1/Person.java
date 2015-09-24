package kata1;

import java.util.Date;

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

    public Date getBirth() {
        return birth;
    }
    private final Date birth;

    public Person(String name, String surname, Date birth) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public int getAge() {
        Date today = new Date();

        return (int) milliseconds(today.getTime() - birth.getTime());
    }

    private long milliseconds(long millis) {
        return (millis / MILLIS_PER_YEAR);
    }
}
