package ac.at.fhcampuswien;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class NewsResponse {


    String status;
    int totalResults;
    public ArrayList<Article> articles;

   public NewsResponse(String status, int totalResults, List<Article> articles) {

       this.totalResults = totalResults;
       this.articles = (ArrayList<Article>) articles;
   }

   public ArrayList<Article> getArticles(){
       return this.articles;
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
