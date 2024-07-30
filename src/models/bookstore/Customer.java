package models.bookstore;

public class Customer extends User {
    private Cart cart;
    public Customer(String username, String password, String email) {
        super(username, password,email);
        this.cart = new Cart();
    }
    public void addToCart(Book book, int quantity) {
        cart.addItem(book, quantity);
    }

    public Cart getCart() {
        return cart;
    }

}
