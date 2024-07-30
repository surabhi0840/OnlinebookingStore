import java.util.List;
import models.bookstore.Admin;
import models.bookstore.Book;
import models.bookstore.Cart;
import models.bookstore.Customer;
import models.bookstore.Order;
import models.bookstore.User;
import service.InventoryService;
import service.OrderService;
import service.UserService;

public class Bookstore {
    public static void main(String[] args) {

        UserService userService = new UserService();
        InventoryService inventoryService = new InventoryService();
        OrderService orderService = new OrderService(inventoryService);
        System.out.println("Registering users...");
        Admin admin = new Admin("admin1", "AdminUser", "admin@example.com");
        Customer customer1 = new Customer("cust1", "CustomerUser", "customer@example.com");
        userService.registerUser(admin);
        userService.registerUser(customer1);
        userService.registerUser(new Customer("user1", "user123", "user1@example.com"));
        userService.registerUser(new Customer("user2", "user456", "user2@example.com"));
        userService.registerUser(new Customer("user3", "user789", "user3@example.com"));
        Book[] books = {
            new Book("Java Programming", "John Doe", 29.99),
            new Book("Python for Beginners", "Jane Smith", 19.99),
            new Book("C++ Programming", "Alice Johnson", 34.99),
            new Book("Data Structures in Java", "Bob Wilson", 27.99),
            new Book("JavaScript Fundamentals", "Mary Brown", 24.99),
            new Book("SQL Essentials", "David Davis", 22.99),
            new Book("Algorithms and Complexity", "Eva Evans", 39.99),
            new Book("Web Development with React", "Frank Lee", 29.99),
            new Book("Artificial Intelligence", "Grace Adams", 44.99),
            new Book("Machine Learning Basics", "Henry Harris", 36.99)
        };
        // Add books to inventory
        System.out.println("Adding books to inventory...");
        for (Book book : books) {
            admin.addBookToStore(inventoryService,book);
        }
        // Simulate purchases and orders
        System.out.println("\nSimulating purchases and orders...");
        Cart cart1 = customer1.getCart();
        customer1.addToCart(books[0], 1);
        customer1.addToCart(books[1], 2);
        Order order1 = orderService.completeOrder(customer1, cart1);
        orderService.checkout(order1);

    }
}
