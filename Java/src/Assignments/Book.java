package Assignments;


    // Book.java
    class Book {

        // Private instance variables
        private String isbn;
        private String title;
        private String author;
        private double price;
        private boolean isAvailable;

        // Static variable
        static int totalBooksCreated = 0;

        // Default constructor
        Book() {
            this("0000000000000", "Unknown", "Unknown", 0.0);
        }

        // Partial constructor
        Book(String isbn, String title) {
            this(isbn, title, "Unknown", 0.0);
        }

        // Full constructor
        Book(String isbn, String title, String author, double price) {
            setIsbn(isbn);
            setTitle(title);
            setAuthor(author);
            setPrice(price);

            isAvailable = true;
            totalBooksCreated++;
        }

        // Getters
        public String getIsbn() {
            return isbn;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public double getPrice() {
            return price;
        }

        public boolean getIsAvailable() {
            return isAvailable;
        }

        // Setters with validation
        public void setIsbn(String isbn) {
            if (isbn.length() == 13) {
                this.isbn = isbn;
            } else {
                System.out.println("ISBN must be 13 digits.");
            }
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setPrice(double price) {
            if (price >= 0) {
                this.price = price;
            } else {
                System.out.println("Price cannot be negative.");
            }
        }

        // Methods
        public void borrowBook() {
            if (isAvailable) {
                isAvailable = false;
                System.out.println(title + " borrowed successfully.");
            } else {
                System.out.println(title + " is not available.");
            }
        }

        public void returnBook() {
            isAvailable = true;
            System.out.println(title + " returned successfully.");
        }

        // Static methods
        public static int getTotalBooks() {
            return totalBooksCreated;
        }

        public static void displayAllBooks() {
            System.out.println("Total Books Created: " + totalBooksCreated);
        }

        // Display method
        public void displayBook() {
            System.out.println("\nISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
            System.out.println("Available: " + isAvailable);
        }

        // Main method
        public static void main(String[] args) {

            // Using default constructor
            Book b1 = new Book();

            // Using partial constructor
            Book b2 = new Book("9781234567890", "Java Basics");

            // Using full constructor
            Book b3 = new Book(
                    "9789876543210",
                    "Data Structures",
                    "Anmol",
                    850.0
            );

            b1.displayBook();
            b2.displayBook();
            b3.displayBook();

            b3.borrowBook();
            b3.returnBook();

            System.out.println("\nTotal Books: " + Book.getTotalBooks());

            Book.displayAllBooks();
        }
    }

