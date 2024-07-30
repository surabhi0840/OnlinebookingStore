package models.bookstore;

public class Book {

  private String title;
  private String author;
  private double price;
  private long id;
  private static int count = 0;

  public Book(String title, String author, double price) {
    this.title = title;
    this.author = author;
    this.price = price;
    count++;
    this.id = count;
  }

  public String getTitle() {
    return this.title;
  }

  public String getAuthor() {
    return this.author;
  }

  public double getPrice() {
    return this.price;
  }

  @Override
  public String toString() {
    return new StringBuilder().append(title).append(" by ").append(author).toString();
  }

}
