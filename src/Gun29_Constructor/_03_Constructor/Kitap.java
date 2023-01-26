package Gun29_Constructor._03_Constructor;

public class Kitap {
    String name;
    int publishYear;
    String author;

    public Kitap() {
    }

    public Kitap(String name, int publishYear) {
        this.name = name;
        this.publishYear = publishYear;
    }

    public Kitap(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", author='" + author + '\'' +
                '}';
    }
}
