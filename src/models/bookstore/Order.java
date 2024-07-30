package models.bookstore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
    private Customer customer;
    private Map<Book,Integer> purchasedBooks = new HashMap<>();
    public Order(  Customer customer, Map<Book,Integer> purchasedBooks) {
        this.customer = customer;
        this.purchasedBooks = purchasedBooks;
    }

    public User getCustomer() {
        return this.customer;
    }

    public Map<Book, Integer> getPurchasedBooks() {
        return purchasedBooks;
    }

}
