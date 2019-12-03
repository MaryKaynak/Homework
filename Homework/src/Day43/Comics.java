package Day43;

public class Comics extends Book {

    public Comics(String name, int edition, boolean hardcover) {
        super(name, edition, hardcover);
    }
    @Override
    public int price() {
        return super.price() + 5;
    }
}
