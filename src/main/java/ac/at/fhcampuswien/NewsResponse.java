package ac.at.fhcampuswien;

import java.util.ArrayList;
import java.util.List;

public class NewsResponse {
    private final String status;
    private final int totalResults;
    private final ArrayList<Article> articles;

    public NewsResponse(String status, int totalResults, List<Article> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = (ArrayList<Article>) articles;
    }

    public String getStatus() {
        return status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    @Override
    public String toString() {
        return "NewsResponse{" +
                "status='" + status + '\'' +
                ", totalResults=" + totalResults +
                ", articles=" + articles +
                '}';



    }

}
