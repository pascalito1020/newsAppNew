package ac.at.fhcampuswien;

import java.io.IOException;
import java.util.List;

public class AppController {

    public void getTopHeadlinesAustria() {

        try {
            System.out.println(NewsApi.run("https://newsapi.org/v2/top-headlines?q=corona&apiKey=e809c2bfc1c7416887eb0c289ab6c540"));
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

    public void articleCount() {

        NewsResponse count = new NewsResponse();

        System.out.println(count.articleCount());


    }




}

