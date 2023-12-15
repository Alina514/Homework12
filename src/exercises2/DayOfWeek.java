package exercises2;

public enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    static class NoActivityException extends RuntimeException {
        public NoActivityException(String message) {
            super(message);
        }
    }
}
