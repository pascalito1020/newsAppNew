package ac.at.fhcampuswien;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class NewsApi {

    public static NewsResponse run(String url) throws IOException {

        Gson gson = new Gson();
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {

            String json = response.body().string();
            return gson.fromJson(json, NewsResponse.class);

        }catch (IOException e){

            throw new RuntimeException(e);
        }
    }








}

