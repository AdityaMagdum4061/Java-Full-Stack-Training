package combinedconcepts;

// Q4. Write a Java program that demonstrates the use of encapsulation, an abstract class, and an interface in a simple Library Management System.

interface IssueBook {
    void issueBook();
}

abstract class Library {
    abstract void showLibraryDetails();
}

class Book extends Library implements IssueBook {
    private int bookId;
    private String bookName;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    void showLibraryDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
    }

    public void issueBook() {
        System.out.println("Book Issued Successfully");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book b = new Book();

        b.setBookId(101);
        b.setBookName("Java Programming");

        b.showLibraryDetails();
        b.issueBook();
    }
}