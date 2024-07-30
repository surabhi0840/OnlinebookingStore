package service;

import java.util.Map.Entry;
import models.bookstore.Book;
import models.bookstore.Order;

public class InvoiceService {

  public void generateInvoice(Order order, double totalPrice) {
    System.out.println("Generate invoice for customer " + order.getCustomer().getUsername() + "total: " + totalPrice);
  }

  public double getTotalPrice(Order order) {
    double totalPrice = 0;
    for (Entry<Book, Integer> cartItem : order.getPurchasedBooks().entrySet()) {
      totalPrice += cartItem.getKey().getPrice() * cartItem.getValue();
    }
    return totalPrice;
  }
}
