package Day43;

public class ChildrenBook extends Book {


    public ChildrenBook(String name, int edition, boolean hardcover) {
        super(name, edition, hardcover);
    }
    @Override
    public int price() {
        return super.price() + 10;
    }

}



