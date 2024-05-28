import java.time.DayOfWeek;
import java.time.LocalDate;

public class NextSundayExample {
    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Get the day of the week for today
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        System.out.println("Today is " + dayOfWeek);
        // Calculate the number of days until the next Sunday
        int daysUntilNextSunday = DayOfWeek.SUNDAY.getValue() - dayOfWeek.getValue();

        // If today is Sunday or already after Sunday, calculate the days until next Sunday
        if (daysUntilNextSunday <= 0) {
            daysUntilNextSunday += 7;
        }

        // Calculate the date of the next Sunday
        LocalDate nextSunday = today.plusDays(daysUntilNextSunday);

        // Print the date of the next Sunday
        System.out.println("Today is: " + today);
        System.out.println("Next Sunday will be: " + nextSunday);
    }
}
