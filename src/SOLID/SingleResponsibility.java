package SOLID;

public class SingleResponsibility {
    public static class Book {
        private String title;
        private String author;
        private double price;

        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }

    public static class BookPrinter{
        public void printBookDetials(Book book){
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Price: " + book.getPrice());
        }
    }

    public static class DiscountCalculator {
        public double calculateDiscount(Book book, double discountPercentage){
            return book.getPrice() * (1-discountPercentage/100);
        }
    }

    public static void main(String[] args) {

        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1000);
        DiscountCalculator discountCalculator = new DiscountCalculator();
        BookPrinter bookPrinter = new BookPrinter();
        bookPrinter.printBookDetials(book1);
        System.out.println("New price with 20% discount is " + discountCalculator.calculateDiscount(book1, 20));


    }
}
