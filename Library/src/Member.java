import java.util.ArrayList;
import java.util.List;

public class Member {
    private int id;
    private String name;
    private List<Book> borrowedBooks;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Method to borrow a book
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    // Method to return a book
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
    
 // Add a new member to the library
    public boolean addMember(Member member) {
        if (findMemberById(member.getId()) != null) {
            System.out.println("Member with ID " + member.getId() + " already exists.");
            return false;
        }
        members.add(member);
        return true;
    }

    // Add a new book to the library
    public boolean addBook(Book book) {
        if (findBookById(book.getId()) != null) {
            System.out.println("Book with ID " + book.getId() + " already exists.");
            return false;
        }
        books.add(book);
        return true;
    }
    
}
