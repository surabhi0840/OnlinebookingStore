package service;

import models.bookstore.Book;
import models.bookstore.Cart;
import models.bookstore.Customer;
import models.bookstore.Order;
import models.bookstore.User;

public class OrderService {

  InventoryService inventoryService;

  InvoiceService invoiceService;

  PaymentService paymentService;

  public OrderService(InventoryService inventoryService) {
    this.inventoryService = inventoryService;
    this.invoiceService = new InvoiceService();
  }


  public Order completeOrder(Customer user, Cart cart) {
    Order order = new Order(user, cart.getPurchasedBooks());
    System.out.println("Order for " + order.getCustomer().getUsername() + " is complete.");
    System.out.println("Books purchased:");
    for (Book book : order.getPurchasedBooks().keySet()) {
      System.out.println(
          "- " + book.getTitle() + " by " + book.getAuthor() + " ($" + String.format("%.2f", book.getPrice()) + ")");
    }
    return order;
  }

  public double checkout(Order order){
    Double price = invoiceService.getTotalPrice(order);
    System.out.println("Total: $" + String.format("%.2f", price));
    System.out.println();
    if (paymentService.processPayment(order, price)) {
      System.out.println("Payment successful for " + order.getCustomer().getUsername() + " - $" + price);
    } else {
      System.out.println("Payment failed for " + order.getCustomer().getUsername());
    }
    return price;
  }
}
