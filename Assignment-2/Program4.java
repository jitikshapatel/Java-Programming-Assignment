import java.util.*;

class Book implements Comparable<Book> {
    int id;
    String name;
    double price;

    Book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int compareTo(Book b) {
        return this.id - b.id;
    }

    public String toString() {
        return id + " " + name + " " + price;
    }
}

class NameComparator implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        return b1.name.compareTo(b2.name);
    }
}

class PriceComparator implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        return Double.compare(b1.price, b2.price);
    }
}

public class Program4 {
    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList<>();

        list.add(new Book(3, "Java", 500));
        list.add(new Book(1, "Python", 400));
        list.add(new Book(2, "C++", 300));

        Collections.sort(list);
        System.out.println("Sorted by ID:");
        for (Book b : list)
            System.out.println(b);

        Collections.sort(list, new NameComparator());
        System.out.println("\nSorted by Name:");
        for (Book b : list)
            System.out.println(b);

        Collections.sort(list, new PriceComparator());
        System.out.println("\nSorted by Price:");
        for (Book b : list)
            System.out.println(b);
    }
}
