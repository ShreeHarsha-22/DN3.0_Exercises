package Exercise5;
import java.util.*;
public class TaskLinkedList {
    private Node head;

    public TaskLinkedList() {
        this.head = null;
    }

    // Add a task to the end of the list
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    // Search for a task by ID
    public Task searchTaskById(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.getTask().getTaskId().equals(taskId)) {
                return current.getTask();
            }
            current = current.getNext();
        }
        return null; // If not found
    }

    // Traverse and display all tasks
    public void traverseTasks() {
        Node current = head;
        if (current == null) {
            System.out.println("No tasks to display.");
            return;
        }
        while (current != null) {
            System.out.println(current.getTask());
            current = current.getNext();
        }
    }

    // Delete a task by ID
    public void deleteTask(String taskId) {
        if (head == null) {
            System.out.println("No tasks to delete.");
            return;
        }

        // If the task to be deleted is the head
        if (head.getTask().getTaskId().equals(taskId)) {
            head = head.getNext();
            System.out.println("Task deleted successfully.");
            return;
        }

        // Search for the task to delete
        Node current = head;
        while (current.getNext() != null && !current.getNext().getTask().getTaskId().equals(taskId)) {
            current = current.getNext();
        }

        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Task ID not found.");
        }
    }

    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTask Management System");
            System.out.println("1. Add Task");
            System.out.println("2. Search Task");
            System.out.println("3. Traverse Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Task Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Status: ");
                    String status = scanner.nextLine();
                    Task task = new Task(id, name, status);
                    taskList.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter Task ID to search: ");
                    String searchId = scanner.nextLine();
                    Task foundTask = taskList.searchTaskById(searchId);
                    if (foundTask != null) {
                        System.out.println("Task found: " + foundTask);
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;
                case 3:
                    taskList.traverseTasks();
                    break;
                case 4:
                    System.out.print("Enter Task ID to delete: ");
                    String deleteId = scanner.nextLine();
                    taskList.deleteTask(deleteId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

