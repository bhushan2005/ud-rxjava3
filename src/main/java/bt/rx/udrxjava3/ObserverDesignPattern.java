package bt.rx.udrxjava3;

public class ObserverDesignPattern {

    public static void main(String[] args) {

        Book book = new Book("Goosebumps", "Horror",
                "xyz", 200, "SoldOut");

        EndUser user1 = new EndUser("Bob", book);
        EndUser user2 = new EndUser("John", book);

        System.out.println(book.getInStock());

        book.setInStock("In Stock");

    }
}
