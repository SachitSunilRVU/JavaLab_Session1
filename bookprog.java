class Book {
    public String bname, colour, author, genre;
    public int pages;
    public Book (String bname, String colour, String author, String genre, int pages) {
        this.bname = bname;
        this.colour = colour;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
    }
    public void display () {
        System.out.println ("the book's name is: " + bname);
        System.out.println ("the colour of the cover is: " + colour);
        System.out.println ("the author is: " + author);
        System.out.println ("the genre is: " + genre);
        System.out.println ("the amount of pages in this book is:  " + pages);
    }
}
public class bookprog {
    public static void main (String args []) {
        Book bk1 = new Book ("ramayana", "blue", "author", "genre", 450);
        bk1.display();
    }
}

