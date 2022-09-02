class Library {
    String[] books;
    int noOFBooks;

    Library() {
        this.books = new String[100];
        this.noOFBooks = 0;
    }

    public void addBook(String book) {
        this.books[noOFBooks] = book;
        noOFBooks++;
        System.out.println(book + "The book has been added");
    }

    public void Showavaiblebook() {
        System.out.println("AVAIBLE BOOKS ARE");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("*" + book);
        }
    }

    public void issuebook(String book) {
        for (int i = 0;i< this.books.length;i++)
        {
            if (this.books[i].equals(book)) {
                System.out.println("The book has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("The book does not exit");
    }
    public void returnbook(String book)
    {
        addBook(book);
    }
}
public class Online_Library {
    public static void main(String[] args){
        Library library=new Library();
        library.addBook("The mile stone");
        library.addBook("java");
        library.addBook("Data structure and algorithm");
        library.addBook("Python");
        library.Showavaiblebook();
        library.issuebook("java");
        library.Showavaiblebook();
    }
}
