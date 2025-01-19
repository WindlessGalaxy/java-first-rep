public class Main {
    public static void main(String[] args) {
        // Output the name of the exercise
        System.out.println("Exercise 2 - Extending your Java Skills");

        // Creating books
        Book bookOne = new Book();
        Book bookTwo = new Book();
        Book bookThree = new Book();

        // Setting values for bookOne
        bookOne.setName("The Stand");
        bookOne.setAuthor("Stephen King");
        System.out.println(bookOne.getName());
        System.out.println(bookOne.getAuthor());

        // Setting values for bookTwo
        bookTwo.setName("Insomnia");
        bookTwo.setAuthor("Stephen King");
        System.out.println(bookTwo.getName());
        System.out.println(bookTwo.getAuthor());

        // Setting values for bookThree
        bookThree.setName("Carrie");
        bookThree.setAuthor("Stephen King");
        System.out.println(bookThree.getName());
        System.out.println(bookThree.getAuthor());
    }
}
