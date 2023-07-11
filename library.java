package library_management;
import java.util.*;

class Book{
	public String name,author,issued_to,issued_on;
	public Book(String name,String author) {
		this.name=name;
		this.author=author;
	}
	public String toString() {
		return""+"Name of the book is:'"+name+'\''+
				", Author:' "+author+'\''+' ';
	}}

class Library{
	public ArrayList<Book>books;
	public Library(ArrayList<Book> books) {
		this.books=books;		
	}
	
	public void addBook(Book book) {
		System.out.println("The book has been added to the library!!");
		this.books.add(book);
	}
	
	public void issueBook(Book book,String issued_to) {
		System.out.println("The book has been issued from the library to:"+issued_to);
		this.books.remove(book);
	}
	
	public void returnBook(Book b) {
		System.out.println("The book has been returned!!");
		
			this.books.add(b);
		}
		
	}
public class Library_manage {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		ArrayList<Book> bk=new ArrayList<>();
		Book b1=new Book("book1","CLRS1");
        Book b2=new Book("book2","CLRS2");
		Library l=new Library(bk);
		while(true) {
	System.out.println("ENTER A CHOICE:"); 
	System.out.println("1.ADD A BOOK IN THE LIBRARY");
	System.out.println("2.ISSUE THE BOOK ");
	int z=sc.nextInt();
	if(z==1) {
		System.out.print("How many books do you want add:");
		int s=sc.nextInt();
		for(int i=0;i<s;i++) {
		System.out.println("ENTER NAME OF BOOK:");
		String book=sc.next();
		System.out.println("ENTER NAME OF AUTHOR:");
		String book2=sc.next();
		 l.addBook(new Book(book, book2));
	        System.out.println(l.books); }}   
	else {
        System.out.println(" ");
        System.out.println("Enter the name of the person who want to issue the book:");
        String o=sc.next();
        System.out.println("Enter the name of the book:");
        String a = sc.next();
        System.out.println("the name of the person is:"+o);
        System.out.println("The book which is issued is:"+a);
        System.out.println("Book issued is to:"+o);
		} }
	}}
