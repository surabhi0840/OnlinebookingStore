package service;

import models.bookstore.Customer;
import models.bookstore.Order;

public class PaymentService {
    public static boolean processPayment( Order order,double amount) {
        // Logic for processing a payment
        System.out.println("Processed payment of $" + String.format("%.2f", amount) + " for " + order.getCustomer().getUsername());
        return true;
    }
}
