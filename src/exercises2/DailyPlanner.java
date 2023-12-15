package exercises2;

import java.util.ArrayList;
import java.util.List;

public class DailyPlanner {
    private List<DaySchedule> daySchedules = null;

    public DailyPlanner() {
        this.daySchedules = new ArrayList<>();
    }

    public List<DaySchedule> getDaySchedules() {
        return daySchedules;
    }

    public void addActivities(DayOfWeek day, String activity) throws NoActivityException {
        if (activity == null) {
            throw new NoActivityException("Activity cannot be null");
        }
    }
}

