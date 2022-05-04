package ac.at.fhcampuswien;

import java.util.ArrayList;
import java.util.List;

public class NewsResponse {

    String status;
    int totalResults;
    public ArrayList<Article> articles;

  /** public NewsResponse(String status, int totalResults, List<Article> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = (ArrayList<Article>) articles;
    } */

    public int articleCount() {
        return  articles.size();
    }

    public String print(){
        return this.status;
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
