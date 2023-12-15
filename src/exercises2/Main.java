package exercises2;

import java.util.List;

import static exercises2.DaySchedule.*;
import static java.util.Collections.addAll;
// nu imi printeaza nimic in consola, nu inteleg de ce.
public class Main extends Exception{
    public static void main(String[] args) throws NoActivityException {
        DailyPlanner dailyPlanner = new DailyPlanner();

        dailyPlanner.addActivities(DayOfWeek.MONDAY, "Meeting");
        dailyPlanner.addActivities(DayOfWeek.MONDAY, "Lunch");
        dailyPlanner.addActivities(DayOfWeek.TUESDAY, "Gym");
        dailyPlanner.addActivities(DayOfWeek.WEDNESDAY, "school");
        System.out.println(dailyPlanner.getDaySchedules());

    }
    private static void printDaySchedules(List<DaySchedule> DaySchedules) {
        for (DaySchedule daySchedule : DaySchedules) {
            System.out.print("Day: " + daySchedule.getDay() + ", ");
            System.out.print("Activities: " + daySchedule.getActivities());
            System.out.println();
        }
    }
}
