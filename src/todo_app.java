import java.util.Scanner;
import java.util.ArrayList;

public class y {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<String> completed = new ArrayList<>();
        String task;
        int close;
        boolean t = true; // Main While loop
        boolean u = true; // Adding task loop

        System.out.println("1. To add tasks");
        System.out.println("2. To Show tasks");
        System.out.println("3. To Quit");
        System.out.println("4. To Delete the tasks");
        System.out.println("5. Mark AS Done");
        System.out.println("6. Show The Completed list");

        while (t) {
            int op = in.nextInt();
            in.nextLine();
            if (op == 1) {
                System.out.println("To exit Type I'm Done");
                while (u) {
                    task = in.nextLine();
                    if (!task.equalsIgnoreCase("I'M DONE")) {
                        tasks.add(task);
                    } else if (task.equalsIgnoreCase("I'm Done")) {
                        u = false;
                        System.out.println("OKAY");
                    }
                }

            } else if (op == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("The List Is Empty!");
                } else {
                    for (int i = 0; i < tasks.size(); i++) {    // To print all the item in the list
                        System.out.println(i + 1 + " " + tasks.get(i));
                    }
                }
            } else if (op == 3) {
                System.out.println("If u close the list then u will lose all u r list " +
                        "u sure u want to close it ? " +
                        "If yes press 1 else press any number");
                close = in.nextInt();
                if (close == 1) {
                    t = false;
                } else {
                    System.out.println("Okay.");
                }
            } else if (op == 4) {
                if (tasks.isEmpty()) {
                    System.out.println("There is Nothing to be Removed!");
                } else {
                    System.out.println("Which Task You Want to u Remove ?" +
                            "If U Don't want to remove anything then press Zero");
                    int remove = in.nextInt();
                    if (remove != 0) {
                        tasks.remove(remove - 1);
                        System.out.println("Task Removed Successfully");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(i + 1 + " " + tasks.get(i));
                        }
                    }
                }
            } else if (op == 5) {
                System.out.println("Which List You Wanna Mark As Done ?");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println(i + 1 + " " + tasks.get(i));
                }
                int remove = in.nextInt();
                completed.add(tasks.get(remove - 1));
                tasks.remove(remove - 1);
                System.out.println("Task Added To Completed List!");
            } else if (op == 6) {
                if (completed.isEmpty()) {
                    System.out.println("You Haven't Done Anything Yet!");
                } else {
                    for (int i = 0; i < completed.size(); i++) {
                        System.out.println(i + 1 + " " + completed.get(i));
                    }
                }
            }
        }
    }
}
