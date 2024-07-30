package service;

import java.util.List;
import java.util.Map;
import models.bookstore.Book;
import models.bookstore.Inventory;

public class InventoryService {

  Inventory inventory;


  public InventoryService() {
    this.inventory = new Inventory();
  }


  public void addBookToInventory(Book book) {
    inventory.addBook(book);
  }
}
