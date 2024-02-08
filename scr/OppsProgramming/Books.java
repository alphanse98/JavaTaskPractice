package OppsProgramming;

import java.util.ArrayList;

public class Books {
    int bookId;
    String  title;
    String  author;
    boolean isAvailable;

     Books( int bookId,String  title,String  author,boolean isAvailable){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
}

 class Library extends Books {

    public static ArrayList<Object> BooksList = new ArrayList<Object>();

    public static void main(String[] args) {

        addBook(1, "book one", "arun", true);
        addBook(2, "book two", "ram", true);
        addBook(3, "book three", "guru", true);

        removeBook(2);
    }

    // addBook create new book object then push in to new bookList array
   static Object addBook(int bookId,String  title,String  author,boolean isAvailable){
    return BooksList.add(new Books( bookId,  title,  author, isAvailable));
    }

    static void removeBook(int id){
        for(int i =0;i<BooksList.size();i++){            
            if (((Books) BooksList.get(i)).bookId == id) {
                ((Books) BooksList.get(i)).isAvailable = false;
                System.err.println("Book removed successfully.");
            }else{
                System.err.println("Book is not available.");
            }
        }
    }

    static void displayBook(){
        for (Object book : BooksList) {
            System.out.println("Book Title: " + ((Books) book).title);
        }
    }


    Library(int bookId, String title, String author, boolean isAvailable) {
        super(bookId, title, author, isAvailable);
    }

    
}
