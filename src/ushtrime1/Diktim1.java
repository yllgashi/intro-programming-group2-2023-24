package ushtrime1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;

public class Diktim1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        System.out.println(date);
        System.out.println(dateTime);
        System.out.println(gregorianCalendar.getTime());


    }
}
