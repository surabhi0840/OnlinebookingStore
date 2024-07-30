package models.bookstore;

import service.InventoryService;
import service.InvoiceService;

public class Admin extends User {

  public Admin(String userId, String name, String email) {
    super(userId, name, email);
  }

  public void addBookToStore(InventoryService inventoryService, Book book) {
    inventoryService.addBookToInventory(book);
    System.out.println("Book added to the store: " + book);
  }

}
