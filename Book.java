
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
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookpages)
    {
        author = bookAuthor;
        title = bookTitle;
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
}
