package domain;

/**
 * Created by Jeison on 06/03/2018.
 */
public class Book  extends Assets{
    private String ISBN;
    private String author;
    private String editorial;
    private String language;
    private int year;

    public Book(String id, String name, String isbn,String author,String editorial,String language,int year, int quantity) {
        super(id, name, quantity);
        this.author=author;
        this.editorial=editorial;
        this.ISBN=isbn;
        this.language=language;
        this.year=year;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
