package exercises1;

public class InvalidAgeException extends Throwable {
    public InvalidAgeException(String message) {
        super(message);
    }

    public int getNumber() {
        return 0;
    }
}
