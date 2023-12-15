package exercises2;

import java.util.List;

public class DaySchedule implements DaySchedules {
         DayOfWeek day;
        List<String> activities;

    public DaySchedule (DayOfWeek day, List<String> activities){
        this.day = day;
        this.activities = activities;
    }

    @Override
    public DayOfWeek day() {
        return day;
    }

    @Override
    public List<String> activities() {
        return activities;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void addActivity(String activity) {
        activities.add(activity);
    }

    public void removeActivity(String activity) {
        activities.remove(activity);
    }
}
