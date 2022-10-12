package Iterators_and_Comparators_Lab.P03ComparableBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {

    String title;
    int year;
    List<String> authors;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Book(String title, int year, String... authors){
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(List.of(authors));
    }

    private void setAuthors(String... authors){
        if (authors.length==0){
            this.authors = new ArrayList<String>();
        }else{
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }
    }

    @Override
    public int compareTo(Book other){
        int result = this.title.compareTo(other.getTitle());

        if (result == 0){
            result = Integer.compare(this.getYear(), other.getYear());
        }
        return result;
    }
}
