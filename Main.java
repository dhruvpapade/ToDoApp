import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== TO-DO APP ===");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Mark Task Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String desc = scanner.nextLine();
                    manager.addTask(desc);
                    break;
                case 2:
                    manager.listTasks();
                    break;
                case 3:
                    System.out.print("Enter task number to mark completed: ");
                    int completeIndex = scanner.nextInt() - 1;
                    manager.markTaskCompleted(completeIndex);
                    break;
                case 4:
                    System.out.print("Enter task number to delete: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    manager.deleteTask(deleteIndex);
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
