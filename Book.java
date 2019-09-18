
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
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
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
        System.out.println("Author: " + author);
    }
    
    //** displays the books title.*/
    public void printTitle()
    {
        System.out.println("Title: " + title);
    }
    
    //** desplays the detail of the book.*/
    public void printDetails()
    {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
    }
    
    
    
    
}
