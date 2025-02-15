public class Library {
    public String libraryName ;
    public Book book1 ;
    public Book book2 ;
    public Book book3 ;
    public void addBook(Book book, int slot) {
        switch (slot) {
            case 1 : book1 = book ; break ;
            case 2 : book2 = book ; break ;
            case 3 : book3 = book ; break ;
            default : System.out.println("No book in this slot.");
        }
    }
    public void removeBook(int slot) {
        switch (slot) {
            case 1 : book1 = null ; break ;
            case 2 : book2 = null ; break ;
            case 3 : book3 = null ; break ;
            default : System.out.println("No book in this slot.");
        }
    }
    public void printLibraryDetails() {
        System.out.println("Library: " + libraryName);
        System.out.println();
        if (book1 == null) {
            System.out.println("No book in this slot.");
        }
        else {
            book1.printDetails() ;
        }
        System.out.println();
        if (book2 == null) {
            System.out.println("No book in this slot.");
        }
        else {
            book2.printDetails() ;
        }
        System.out.println();
        if (book3 == null) {
            System.out.println("No book in this slot.");
        }
        else {
            book3.printDetails() ;
        }
    }
    public void checkBookAvailability(int slot) {
        String result = "No book in this slot." ;
        switch (slot) {
            case 1 : result = book1.isAvailable == false ? "Book in slot" + slot + "in not available" : book1.title + "is available" ; break ;
            case 2 : result = book2.isAvailable == false ? "Book in slot" + slot + "in not available" : book2.title + "is available" ; break ;
            case 3 : result = book3.isAvailable == false ? "Book in slot" + slot + "in not available" : book3.title + "is available" ; break ;
        }
        System.out.println(result);
    }
    public void updateBookPrice(int slot, double newPrice) {
        switch (slot) {
            case 1 :
                if (book1 == null) {
                    System.out.println("No book in this slot.");
                }
                else {
                    book1.updatePrice(newPrice);
                    System.out.println("Updated price of " + book1.title + " to $" + book1.price + ".");
                }
                break ;
            case 2 :
                if (book2 == null) {
                    System.out.println("No book in this slot.");
                }
                else {
                    book2.updatePrice(newPrice);
                    System.out.println("Updated price of " + book2.title + " to $" + book2.price + ".");
                }
                break ;
            case 3 :
                if (book3 == null) {
                    System.out.println("No book in this slot.");
                }
                else {
                    book3.updatePrice(newPrice);
                    System.out.println("Updated price of " + book3.title + " to $" + book3.price + ".");
                }
                break ;
            default :
                System.out.println("No book in this slot.");
        }
    }
    public void printBookDetails(Book book) {
        if (book != null) {
            book.printDetails();
        }
        else {
            System.out.println("No book in this slot.");
        }
    }
}
