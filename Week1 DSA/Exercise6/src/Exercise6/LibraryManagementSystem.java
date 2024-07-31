package Exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Sample data
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("1", "The Great Gatsby", "F. Scott Fitzgerald"));
        bookList.add(new Book("2", "1984", "George Orwell"));
        bookList.add(new Book("3", "To Kill a Mockingbird", "Harper Lee"));

        // Convert to sorted array for binary search
        Book[] sortedBooks = bookList.toArray(new Book[0]);
        Arrays.sort(sortedBooks, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Search by Title (Linear Search)");
            System.out.println("2. Search by Title (Binary Search)");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title to search: ");
                    String linearSearchTitle = scanner.nextLine();
                    Book foundBookLinear = LinearSearch.searchByTitle(bookList, linearSearchTitle);
                    if (foundBookLinear != null) {
                        System.out.println("Book found: " + foundBookLinear);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Book Title to search: ");
                    String binarySearchTitle = scanner.nextLine();
                    Book foundBookBinary = BinarySearch.searchByTitle(sortedBooks, binarySearchTitle);
                    if (foundBookBinary != null) {
                        System.out.println("Book found: " + foundBookBinary);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
