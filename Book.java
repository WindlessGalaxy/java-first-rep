public class Book {

    private String name;  
    private String author;
    
    //no argumnet constructor
    public Book() {
        name = "Unknown Title";
        author = "Unknown Author";
    }
 
    //Paratemised constructor
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    // Set name
    public void setName(String n) { 
        name = n;
    }

    // Set author
    public void setAuthor(String a) { 
        author = a;
    }

    // Get name
    public String getName() {
        return name; 
    }

    // Get author
    public String getAuthor() {
        return author; 
    }
}
