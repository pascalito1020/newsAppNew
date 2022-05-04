package ac.at.fhcampuswien;

import java.io.IOException;
import java.util.ArrayList;

public class AppController {

    public void getTopHeadlinesAustria(String g) {

        try {
            System.out.println(NewsApi.query1(g));
        }catch(IOException e){
            System.out.println("Fehler");
        }
    }

    public void getAllNewsBitcoin() {

        try {
            System.out.println(NewsApi.run("https://newsapi.org/v2/everything?q=bitcoin&apiKey=e809c2bfc1c7416887eb0c289ab6c540"));
        }catch(IOException e){
            System.out.println("Fehler");
        }
    }

    public void articleCount(String g) {
        try{
            NewsResponse response = NewsApi.query1(g);
            ArrayList<Article> articles = response.getArticles();
            int count = articles.size();
            System.out.println("Search for: " + g + " Article size: " + count);
        }catch(IOException e){
            System.out.println("Fehler");
        }

    }

}

