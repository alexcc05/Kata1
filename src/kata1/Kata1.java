package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        System.out.println("hola mundo");
        Calendar f1= GregorianCalendar.getInstance();
        f1.set(1964,7,3);
        Person p1= new Person("Pedro", "Sánchez",f1);
        System.out.println(p1.getBirth().getTime());
        System.out.println(p1.getAge());
        System.out.println(p1.getFullName());
    }
}
