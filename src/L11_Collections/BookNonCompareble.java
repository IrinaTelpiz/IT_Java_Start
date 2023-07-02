package L11_Collections;

import java.time.Year;
import java.util.Objects;


public class BookNonCompareble {

    private String genre;
    private String author;
    private String name;
    private int yearOfEdition;
    private int numOfPages;
    private String publishHouse;
    private boolean isTranslated;

    public enum Genre {
        DETECTIVE,
        SCIENCE,
        ROMANCE,
        CLASSIC,
        HISTORICAL,
        FANTASY,
        HORROR
    }

    public BookNonCompareble(String name){
        this.name = name;
    }

    public BookNonCompareble(String author, String name){
        this(name);
        this.author = author;
    }

    public BookNonCompareble(String author, String name, short yearOfEdition){
        this(author, name);
        this.yearOfEdition = yearOfEdition;
    }

    public BookNonCompareble(String author, String name, short yearOfEdition, Genre genre){
        this(author, name, yearOfEdition);
        this.genre = String.valueOf(genre);
    }

    public int getAge() {
        return Year.now().getValue() - yearOfEdition;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfEdition() {
        return yearOfEdition;
    }

    public void setYearOfEdition(int yearOfEdition) {
        this.yearOfEdition = yearOfEdition;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getPublishHouse() {
        return publishHouse;
    }

    public void setPublishHouse(String publishHouse) {
        this.publishHouse = publishHouse;
    }

    public boolean isTranslated() {
        return isTranslated;
    }

    public void setTranslated(boolean translated) {
        isTranslated = translated;
    }

    @Override
    public String toString() {
        return "\nBook{" +
//                "genre='" + genre + '\'' +
                " author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", yearOfEdition=" + yearOfEdition +
                ", numOfPages=" + numOfPages +
                ", publishHouse='" + publishHouse + '\'' +
                ", isTranslated=" + isTranslated +
                ", isTranslated=" + genre +
                '}';
    }

//    @Override
//    public int compareTo(BookNonCompareble o) {
//        if (this.getYearOfEdition()>o.getYearOfEdition()){
//            return 1;
//        } else if (this.yearOfEdition < o.getYearOfEdition()){
//            return -1;
//        } else return 0;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookNonCompareble book = (BookNonCompareble) o;
        return yearOfEdition == book.yearOfEdition && Objects.equals(author, book.author) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, yearOfEdition, genre);
    }


}
