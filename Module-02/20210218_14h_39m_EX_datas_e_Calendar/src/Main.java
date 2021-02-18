import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2021-02-18T14:44:00Z"));

        System.out.println("sdf " + sdf.format(d));

        // O Calendar me ajuda a manipular datas
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4); // adicionando 4 horas

        d = cal.getTime();

        System.out.println("sdf " + sdf.format(d));

        int minutes = cal.get(Calendar.MINUTE);
        int hours = cal.get(Calendar.HOUR);
        int hoursDay = cal.get(Calendar.HOUR_OF_DAY);
        int month = 1 + cal.get(Calendar.MONTH); // começa do zero...
        int year = cal.get(Calendar.YEAR);

        System.out.println("minutes " + minutes);
        System.out.println("hours " + hours);
        System.out.println("hoursDay " + hoursDay);
        System.out.println("month " + month);
        System.out.println("year " + year);


    }
}
