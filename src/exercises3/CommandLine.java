package exercises3;

import java.util.ArrayList;
import java.util.Scanner;

public class CommandLine {
    private ArrayList<String> activities;
    private Scanner scanner;

    public CommandLine() {
        activities = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void start() {
        int number;
        do {
            Menu();
            System.out.print("Please choose an option: ");
            number = scanner.nextInt();
            scanner.nextLine();

            switch (number) {
                case 1:
                    addActivity();
                    break;
                case 2:
                    removeActivity();
                    break;
                case 3:
                    listAllActivities();
                    break;
                case 4:
                    System.out.println("Ending planning. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (number != 4);
    }

    private void Menu() {
        System.out.println("Menu 1:");
        System.out.println("1) Add an activity");
        System.out.println("2) Remove an activity");
        System.out.println("3) List all activities");
        System.out.println("4) End planning");

    }

    private void listAllActivities() {
        System.out.println("List of all activities:");
        for (int i = 0; i < activities.size(); i++) {
            System.out.println(i + ") " + activities.get(i));
        }

    }
    private void removeActivity() {
        System.out.print("Enter the index of the activity to remove: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < activities.size()) {
            activities.remove(index);
            System.out.println("Activity removed successfully.");
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    private void addActivity() {
        System.out.print("Enter day: ");
        String day = scanner.nextLine();
        System.out.print("Enter activity: ");
        String activity = scanner.nextLine();
        activities.add(day + ": " + activity);
        System.out.println("Activity added successfully.");
    }

}
