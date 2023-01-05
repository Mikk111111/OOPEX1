package org.example;

public class Book {
    private String title;
    private int pages;
    private int releaseYear;
    Book()
    {

    }

    /**
     *
     * @param title of book
     * @param pages of book
     * @param releaseYear of book
     */
    Book(String title,int pages,int releaseYear)
    {
        this.title=title;
        this.pages=pages;
        this.releaseYear=releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPages(){
        return title;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        String ret = "";
        ret = "Book: "+title+", "+pages+" pages long, release date: "+releaseYear;
        return ret;
    }
}
