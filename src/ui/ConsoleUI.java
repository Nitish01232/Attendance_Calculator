package ui;

import model.Course;
import service.AttendanceService;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConsoleUI {

    private final Scanner scanner = new Scanner(System.in);
    private final DecimalFormat df = new DecimalFormat("#.##");

    public void start() {
        System.out.print("Enter attendance criteria (%): ");
        int criteria = scanner.nextInt();

        System.out.print("Number of courses: ");
        int courseCount = scanner.nextInt();
        scanner.nextLine();

        Course[] courses = new Course[courseCount];

        for (int i = 0; i < courseCount; i++) {
            System.out.print("\nCourse name: ");
            String name = scanner.nextLine();

            System.out.print("Attended classes: ");
            int attended = scanner.nextInt();

            System.out.print("Total classes: ");
            int total = scanner.nextInt();
            scanner.nextLine();

            courses[i] = new Course(name, attended, total);
        }

        AttendanceService service = new AttendanceService(criteria);

        System.out.println("\n------ Attendance Report ------");
        for (Course course : courses) {
            double percentage = course.getAttendancePercentage();
            System.out.println(course.getName() + ": " + df.format(percentage) + "%");

            int needToAttend = service.classesToAttend(course);

            if (needToAttend > 0) {
                System.out.println("Attend next " + needToAttend + " classes");
            } else {
                System.out.println("You can bunk next "
                        + service.classesCanBunk(course) + " classes");
            }
            System.out.println();
        }
    }
}
