public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");

        // Static method calls
        sayHello();
        System.out.println("5 + 3 = " + addNumbers(5, 3));

        // Book class tests
        Book myBook = new Book("CS112 Rocks");
        System.out.println(myBook);

        Book copy = new Book(myBook); // using copy constructor
        System.out.println("Copy: " + copy);

        System.out.println("Are they equal? " + myBook.equals(copy));
    }

    // Static void method
    public static void sayHello() {
        System.out.println("Hello from a static method!");
    }

    // Static value-returning method with parameters
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}


class Book {
    private String title;

    // Default constructor
    public Book() {
        this.title = "Untitled";
    }

    // Full constructor
    public Book(String title) {
        this.title = title;
    }

    // Copy constructor (Hacker Challenge)
    public Book(Book other) {
        this.title = other.title;
    }

    // Setter (mutator)
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter (accessor)
    public String getTitle() {
        return title;
    }

    // toString method
    @Override
    public String toString() {
        return "Book title: " + title;
    }

    // equals method
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        return this.title.equals(other.title);
    }
}
