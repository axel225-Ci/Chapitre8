import java.util.List;

import bookstoread.BookShelf;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Nested
class bookShelfSpec {
    @Test
    public void shelfEmptyWhenNoBookAdded() throws Exception {
        bookstoread.BookShelf shelf = new bookstoread.BookShelf();
        List<String> books = shelf.books();
        assertTrue(books.isEmpty(), () -> "BookShelf should be empty.");
    }
    @BeforeEach
    void init() throws Exception {
        BookShelf shelf = new BookShelf();
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
    shelf.add("Effective Java", "Code Complete");
    List<String> books = shelf.books();
    assertTrue(books.isEmpty(), () -> "BookShelf should be empty.");
}
@Test
void booksReturnedFromBookShelfIsImmutableForClient() {
    BookShelf shelf = new BookShelf();
    shelf.add("Effective Java", "Code Complete");
    List<String> books = shelf.books();
    try {
        books.add("The Mythical Man-Month");
        fail(() -> "Should not be able to add book to books");
    } catch (Exception e) {
        assertTrue(e instanceof UnsupportedOperationException, () -> "Should throw UnsupportedOperationException.");
    }
}