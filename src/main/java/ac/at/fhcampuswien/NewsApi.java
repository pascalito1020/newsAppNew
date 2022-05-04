package ac.at.fhcampuswien;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import javax.print.DocFlavor;
import java.io.IOException;

public class NewsApi {

    final static String T_Headline = "https://newsapi.org/v2/top-headlines?apiKey=e809c2bfc1c7416887eb0c289ab6c540";
    final static String ALL_News = "https://newsapi.org/v2/everything?apiKey=e809c2bfc1c7416887eb0c289ab6c540";

    public static NewsResponse run(String url) throws IOException {

        Gson gson = new Gson();
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {

            String json = response.body().string();
            return gson.fromJson(json, NewsResponse.class);

        } catch (IOException e) {
            System.out.println("Fehler");
            throw new RuntimeException(e);
        }
    }

    public static NewsResponse query1(String g) throws IOException {
            return run(T_Headline + "&q=" + g);
    }

}
