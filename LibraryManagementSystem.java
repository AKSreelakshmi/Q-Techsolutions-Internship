import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Book 
{
    private String title;
    private String author;
    private boolean isAvailable;
    public Book(String title, String author) 
	{
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public String getTitle() 
	{
        return title;
    }
    public String getAuthor() 
	{
        return author;
    }
    public boolean isAvailable() 
	{
        return isAvailable;
    }
    public void setAvailable(boolean available) 
	{
        isAvailable = available;
    }
    @Override
    public String toString() 
	{
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
class User 
{
    private String name;
    public User(String name) 
	{
        this.name = name;
    }
    public String getName() 
	{
        return name;
    }
}
class Library 
{
    private List<Book> books;
    public Library() 
	{
        this.books = new ArrayList<>();
    }
    public void addBook(Book book) 
	{
        books.add(book);
        System.out.println("book added: " + book.getTitle());
    }
    public void removeBook(String title) 
	{
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
        System.out.println("book removed: " + title);
    }
    public void lendBook(String title, User user) 
	{
        for (Book book : books) 
		{
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) 
			{
                book.setAvailable(false);
                System.out.println("book lent to " + user.getName() + ": " + book.getTitle());
                return;
            }
        }
        System.out.println("book not available: " + title);
    }
    public void displayAvailableBooks() 
	{
        System.out.println("available books:");
        for (Book book : books) 
		{
            if (book.isAvailable()) 
			{
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}
public class LibraryManagementSystem 
{
    public static void main(String[] args) 
	{
        Library library = new Library();
        Scanner s = new Scanner(System.in);
        while (true) 
		{
            System.out.println("\nLibrary Management System");
            System.out.println("1.add book");
            System.out.println("2.remove book");
            System.out.println("3.lend book");
            System.out.println("4.display available books");
            System.out.println("5.exit");
            System.out.print("enter your choice: ");
            int choice = s.nextInt();
            s.nextLine(); 
            switch (choice) 
			{
                case 1:
                    System.out.print("enter book title: ");
                    String title = s.nextLine();
                    System.out.print("enter book author: ");
                    String author = s.nextLine();
                    library.addBook(new Book(title, author));
                    break;
                case 2:
                    System.out.print("enter book title to remove: ");
                    String removeTitle = s.nextLine();
                    library.removeBook(removeTitle);
                    break;
                case 3:
                    System.out.print("enter book title to lend: ");
                    String lendTitle = s.nextLine();
                    System.out.print("enter borrower name: ");
                    String borrowerName = s.nextLine();
                    library.lendBook(lendTitle, new User(borrowerName));
                    break;
                case 4:
                    library.displayAvailableBooks();
                    break;
                case 5:
                    System.out.println("exiting");
                    s.close();
                    return;
                default:
                    System.out.println("please try again");
            }
        }
    }
}
