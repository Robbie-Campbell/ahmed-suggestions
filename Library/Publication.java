package Library;

import java.util.ArrayList;

import Library.People.Author;


// FIRST I UNIMPLEMENTED THE INTERFACE SO IT IS EASIER TO MANIPULATE EVERYTHING ELSE
// DEFINE ALL OF THE GENERAL PURPOSE METHODS IN THIS CLASS NOT IN THE CHILDREN, KEEP THE CODE DRY
// REMOVED THE ENUM FOR AVAILABILITY AND REPLACED IT WITH A BOOLEAN

public abstract class Publication
{

    // create variables
    private String title;
    private Publisher publisher;
    private int id;

    // MAKE THIS A NEW VARIABLE
    private ArrayList<Author> authors;

    // THIS IS NOW A BOOLEAN
    private boolean isAvailable = true;
    protected String edition;
    private double price;

    // MAKE THIS A PROTECTED CLASS
    protected String returnDate = null;

    // ADDED AUTHOR AS A PARAMETER
    public Publication(String title, int id, ArrayList<Author> authors, String edition, double price)
    {
        this.authors = authors;
        this.title = title;
        this.id = id;
        this.edition = edition;
        this.price = price;
    }

    /**
     * @return String
     */
    public String getTitle() 
    {
        return this.title;
    }

    /**
     * @return int
     */
    public int getID() 
    {
        return this.id;
    }

    /**
     * @return String
     */
    public String getEdition() 
    {
        return this.edition;
    }

    
    public void setReturnDate(String returned) 
    {
        this.returnDate = returned;
    }

    public void setAvailability(boolean isAvailable) 
    {
        this.isAvailable = isAvailable;
    }

    public boolean getAvailability() 
    {
        return this.isAvailable;
    }

    public Publisher getPublisher() 
    {
        return this.publisher;
    }

    public String getReturnDate() 
    {
        return this.returnDate;
    }

    public ArrayList<Author> getAuthorName() 
    {
        return this.authors;
    }

    public void printDetails() 
    {
        System.out.println(getTitle() + ". " + "£" + this.price);
    }

    public double getPrice()
    {
        return this.price;
    }

    /**
     * @return String
     */

     // REMOVE THE NON EXISTANT METHOD GETISSUE(), THEN REFORMAT THE CODE TO MAKE THE PRICE 2 FLOATING POINTS
    public String details() 
    {
        return String.format("Edition: %s%nPaper Name: %s%nID Number: %d%nPrice: £%.2f", this.edition, this.title, this.id, this.getPrice());

    }
}
