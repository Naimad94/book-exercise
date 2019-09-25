

 /**A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
public class Book
{
     // The fields.
    private String author;
    private String title;
    private String refNumber;
    private int pages;
    private int borrowed;
    private boolean courseText;
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean courseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        this.courseText = courseText;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    //** Refrence number for the book.
    public String getRefNumber()
    {
        return refNumber;
    }
    
    // add methods here...
    //** accesor method for pages field.*/
    public int getPages()
    {
        return pages;
    }
    
    //** displays the authors name.*/
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    //** displays the books title.*/
    public void printTitle()
    {
        System.out.println(title);
    }
    
    //** Increment the number of times the book has been borrowed.
    public void borrowed()
    {
        borrowed++;
    }
    
    //**Gets the number of times a books been borrowed.
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public boolean iscourseText()
    {
        return courseText;
    }
    
    //** desplays the detail of the book.*/
    public void printDetails()
    {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
        System.out.println("Borrow: " + borrowed);
        
        String refNumberString;
        if(refNumber.length() > 0)
        {
           refNumberString = refNumber;
        }
        else
        {
           refNumberString = "ZZZ";
        }
        System.out.println("Refrence number: " + refNumberString);
    }
    
    public void setRefNumber(String ref)
    {
        if(ref.length() > 3)
        {
            refNumber = ref;
        }
        else
        {
            System.out.println("Error:Leave the field");
        }
    }
}
