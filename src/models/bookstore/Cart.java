package models.bookstore;

import java.util.HashMap;
import java.util.Map;

public class Cart {

  private Map<Book,Integer> purchasedBooks = new HashMap<>();

  public void addItem(Book book, int quantity) {
    try {
      purchasedBooks.put(book, quantity);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  public Map<Book,Integer> getPurchasedBooks() {
    return purchasedBooks;
  }

}
