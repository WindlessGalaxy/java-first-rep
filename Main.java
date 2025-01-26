public class Main {
    public static void main(String[] args) {
        // Output the name of the exercise
        System.out.println("Exercise 2 - Extending your Java Skills");

        // Creating books with no-argument constructor
        Book bookOne = new Book();
        Book bookTwo = new Book();
        Book bookThree = new Book();

        // Setting values for book one
        bookOne.setName("The Stand");
        bookOne.setAuthor("Stephen King");
        System.out.println(bookOne.getName());
        System.out.println(bookOne.getAuthor());

        // Setting values for book Two 
        bookTwo.setName("Insomnia");
        bookTwo.setAuthor("Stephen King");
        System.out.println(bookTwo.getName());
        System.out.println(bookTwo.getAuthor());

        // Setting values for book Three 
        bookThree.setName("Carrie");
        bookThree.setAuthor("Stephen King");
        System.out.println(bookThree.getName());
        System.out.println(bookThree.getAuthor());

        // Creating books with parameterized constructor
        Book bookFour = new Book("The Shining", "Stephen King");
        Book bookFive = new Book("It", "Stephen King");
        Book bookSix = new Book("Pet Sematary", "Stephen King");

        // outputting the books created with the parameterized constructor
        System.out.println ("Books created using the parameterized constructor:");
        System.out.println(bookFour.getName() + " by " + bookFour.getAuthor());
        System.out.println(bookFive.getName() + " by " + bookFive.getAuthor());
        System.out.println(bookSix.getName() + " by " + bookSix.getAuthor());
        
    }
}