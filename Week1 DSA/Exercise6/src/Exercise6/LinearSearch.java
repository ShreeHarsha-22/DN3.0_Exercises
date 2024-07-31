package Exercise6;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static Book searchByTitle(List<Book> books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // If not found
    }
}

