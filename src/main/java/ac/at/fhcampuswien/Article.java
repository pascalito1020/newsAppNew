package ac.at.fhcampuswien;

 public class Article {

    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;
    private String content;
    private String SubClassIdAndName;

  /**  public Article(String author, String title, String description, String url, String urlToImage, String publishedAt, String content) {
       this.author = author;
       this.title = title;
       this.description = description;
       this.url = url;
       this.urlToImage = urlToImage;
       this.publishedAt = publishedAt;
       this.content = content;
   } */

    @Override
    public String toString() {
        return "\nArticle \n" +
                "Author: " + author + "\n" +
                "Title: " + title + "\n" +
                "Description: " + description + "\n" +
                "URL: " + url + "\n" +
                "Image Link: " + urlToImage + "\n" +
                "published at: " + publishedAt + "\n" +
                "Content: " + content + "\n";
    }
}