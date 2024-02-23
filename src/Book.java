import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int yearOfPublication;

    public Book(Author author, String title, int yearOfPublication){
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }
    public Author getAuthor(){
        return this.author;
    }
    public String getTitle(){
        return this.title;
    }
    public int getYearOfPublication(){
        return this.yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearOfPublication);
    }

    @Override
    public String toString() {
        return author + " " + title + " " + yearOfPublication;
    }
}
