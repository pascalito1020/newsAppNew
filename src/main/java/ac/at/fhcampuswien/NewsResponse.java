package ac.at.fhcampuswien;

import java.util.ArrayList;

public class NewsResponse {
    String status;
    int totalResults;



    public ArrayList<Article> articles = new ArrayList<>();


    public String getStatus() {
        return status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }
}
