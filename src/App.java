import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        HashSet<DaysOfWeek> days = new HashSet<DaysOfWeek>();
        DaysOfWeek day1 = (new DaysOfWeek("Monday", 3));
        DaysOfWeek day2 = (new DaysOfWeek("Tuesday", 4));
        DaysOfWeek day3 = (new DaysOfWeek("Wednesday", 5));
        DaysOfWeek day4 = (new DaysOfWeek("Thursday", 6));
        DaysOfWeek day5 = (new DaysOfWeek("Friday", 7));

        days.add(day1);
        days.add(day2);
        days.add(day3);
        days.add(day4);
        days.add(day5);

System.out.println(day1.equals(day5));

        for (DaysOfWeek day : days) {
            System.out.println(day);
        }
        ;
    }
}
