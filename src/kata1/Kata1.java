package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        System.out.println("hola mundo");
         Date f= new Date(64,7,3);
        Person p1= new Person("Pedro", "Sánchez",f);
        System.out.println(p1.getBirth());
        System.out.println(p1.getAge());
        //Para los Date es  YY/MM/DD y los meses van de 0 a 11;
       
        System.out.println(p1.getFullName());
    }
}
