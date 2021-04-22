import java.util.ArrayList;

import Library.*;
import Library.People.*;

public class Application {
    
    /** 
     * @param args
     */
    public static void main(String[] args) 
    {

        // CREATE A SAMPLE ARRAY LIST OF AUTHORS
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("Test author", "March"));
        authors.add(new Author("Test author 2", "October"));
        Book book = new Book("test book", 14, authors, "2nd", 444, 66, 2, "It was good");
        
        // Book b = new Book(review, issue, isbn, title, id, edition, authorName)



        


        // Book book = new Book(review, issue, isbn, title, id, edition)

        //("title", 1, "edition", "author", 1, true, "publishe");
        // Newspaper np = new Newspaper("the sun", 1, "1st", "Rab", .99, true, "NP");
        // Magazine m = new Magazine("the sun", 1, "1st", "Rab", .99, true, "NP", "sport");
        // Author a = new Author("authorName", "10-05-1981");
        // m.setTitle();
        // m.setAuthor("ss");
        
        

        System.out.println(book.details());

        System.out.println("----------------------------------");

        // System.out.println(b.details());


        // System.out.println("----------------------------------");
        
        // System.out.println(np.details());
        // System.out.println("----------------------------------");
        // System.out.println(m.details());
        // System.out.println("----------------------------------");
        // System.out.println(a.getAuthor());
    }
}
