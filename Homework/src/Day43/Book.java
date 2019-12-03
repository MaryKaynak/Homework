package Day43;

public class Book {

    private String name;
    private int edition;
    private boolean hardcover;

    public int price() {
        return 25;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public boolean isHardcover() {
        return hardcover;
    }

    public void setHardcover(boolean hardcover) {
        this.hardcover = hardcover;
    }

    public Book(String name, int edition, boolean hardcover) {
        this.name = name;
        this.edition = edition;
        this.hardcover = hardcover;
    }
     public String onlineBook(){
              return "Book name : " + name + "\n" +
                      "Book Editions : " + edition + "\n" +
                      "Book is hardcover : " + hardcover + "\n" +
                      "Book Price : " + price();

     }

}

