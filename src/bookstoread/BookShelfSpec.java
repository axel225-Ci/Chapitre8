import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import bookstoread.BookShelf;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@Nested
class bookShelfSpec {
    @Test
    public void shelfEmptyWhenNoBookAdded() throws Exception {
        bookstoread.BookShelf shelf = new bookstoread.BookShelf();
        List<String> books = shelf.books();
        assertTrue(books.isEmpty(), () -> "BookShelf should be empty.");
    }

}
@Test
void bookshelfContainsTwoBooksWhenTwoBooksAdded() {
    BookShelf shelf = new BookShelf();
    shelf.add("Effective Java");
    shelf.add("Code Complete");
    List<String> books = shelf.books();
    assertEquals(2, books.size(), () -> "BookShelf should have two books.");
}

void main() {
}
@Test
public void emptyBookShelfWhenAddIsCalledWithoutBooks() {
    BookShelf shelf = new BookShelf();
    shelf.add();
    List<String> books = shelf.books();
    assertTrue(books.isEmpty(), () -> "BookShelf should be empty.");
}