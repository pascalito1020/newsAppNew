package ac.at.fhcampuswien;

public class Article {

    private String author;
    private String title;


    public Article(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {


        return title;
    }

    @Override
    public String toString() {
        return "Article{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
