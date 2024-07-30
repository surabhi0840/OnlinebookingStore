package models.bookstore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {

  private Map<Book, Integer> booksQuantity;

  public Inventory() {
    booksQuantity = new HashMap<>();
  }

  public void addBook(Book book) {

    booksQuantity.put(book, booksQuantity.getOrDefault(book, 0) + 1);
  }

  public List<Book> getAllBooks() {
    return booksQuantity.keySet().stream().toList();
  }


}