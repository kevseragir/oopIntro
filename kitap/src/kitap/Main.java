package kitap;

public class Main {

    public static void main(String[] args) {

        Author author = new Author("Victor Hugo", "Fransız");
        Author author2 = new Author("Reşat Nuri", "Türk");

        Book book= new Book("Sefiller", author ,570);
        Book book2 = new Book("Çalıkuşu", author2,123);
        Book book3 = new Book("Yaprak Dökümü", author2,350);

        User user= new User("Kevser","kevseragir@gmail.com","Aksaray");
        User user2 = new User("Emre","emreagir@gmail.com","Aksaray");
        User user3 = new User("Merve","merveagir@gmail.com","Aksaray");

        LibraryWorker worker = new LibraryWorker("Ayşe", "Müdür");

        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.addBook(book);
        librarySystem.addBook(book2);
        librarySystem.addBook(book3);
       //librarySystem.removeBook(book);
       // librarySystem.removeBook(book2);
       // librarySystem.removeBook(book3);

        librarySystem.listBooks();

        librarySystem.addAuthor(author);
        librarySystem.addAuthor(author2);
        librarySystem.listAuthors();

        librarySystem.addUser(user);
        librarySystem.addUser(user2);
        librarySystem.addUser(user3);
        librarySystem.listUsers();


        librarySystem.addWorker(worker);
        librarySystem.listWorkers();

    }
}