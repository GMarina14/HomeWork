package skypro.lesson13;

public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Homer", "Ancient Greek");
        Author secondAuthor = new Author("Charles", "Dickens");

        Book firstBook = new Book("The Odyssey", firstAuthor, 1815);
        Book secondBook = new Book("Great expectations", secondAuthor, 1861);

        System.out.println("The first book is " + firstBook.getBookName() + " by " + firstAuthor.getFullName() + " published in " + firstBook.getYearOfPublishing());
        System.out.println();

        System.out.println("secondBook.getYearOfPublishing() = " + secondBook.getYearOfPublishing());
        secondBook.setYearOfPublishing(1914);
        System.out.println("secondBook.getYearOfPublishing() = " + secondBook.getYearOfPublishing());
        System.out.println();

        System.out.println(secondBook);
        System.out.println(firstAuthor);
        System.out.println("firstBook = " + firstBook);
        System.out.println("secondAuthor.equals(firstAuthor) = " + secondAuthor.equals(firstAuthor));
        System.out.println("firstBook.equals(secondBook) = " + firstBook.equals(secondBook));

    }
}
