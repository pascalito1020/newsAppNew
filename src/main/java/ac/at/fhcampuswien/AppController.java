package ac.at.fhcampuswien;

import java.io.IOException;
import java.util.ArrayList;

public class AppController {

    static String T_HEADLINE = "https://newsapi.org/v2/top-headlines?apiKey=e809c2bfc1c7416887eb0c289ab6c540";
    static String ALL_NEWS = "https://newsapi.org/v2/everything?q=bitcoin&apiKey=e809c2bfc1c7416887eb0c289ab6c540";

    public String setUrl(String q) {

        return T_HEADLINE + "&q=" + q;


    }

    public void getTopHeadlinesAustria() {

        try {
            System.out.println(NewsApi.run(setUrl(T_HEADLINE)));
        }catch(IOException e){
            System.out.println("Fehler");
        }
    }
    public void getAllNewsBitcoin() {

        try {
            System.out.println(NewsApi.run(ALL_NEWS));
        }catch(IOException e){
            System.out.println("Fehler");
        }
    }

    public void articleCount() {

        try{
            NewsResponse response = NewsApi.run("https://newsapi.org/v2/top-headlines?q=corona&apiKey=e809c2bfc1c7416887eb0c289ab6c540");
            ArrayList<Article> articles = response.getArticles();
            int count = articles.size();
            System.out.println("Article Size:"+count);
        }catch(IOException e){
            System.out.println("Fehler");
        }

    }

}

