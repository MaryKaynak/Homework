package Day43;

public class Main {
    public static void main(String[] args) {

        ChildrenBook childrenBook = new ChildrenBook("Diary of a Wimply Kid", 5, true);

        System.out.println(childrenBook.onlineBook());

        Comics comics = new Comics("Secret Wars", 3, false);

        System.out.println("============================================");

        System.out.println(comics.onlineBook());


    }
}
