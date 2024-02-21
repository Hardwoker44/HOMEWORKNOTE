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



}
