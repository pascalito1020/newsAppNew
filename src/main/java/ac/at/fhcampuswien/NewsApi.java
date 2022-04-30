package ac.at.fhcampuswien;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.HttpURLConnection;

public class NewsApi {
    private static HttpURLConnection connection;

public static void TopNewsAustria(){

    BufferedReader reader;
    String line;
    StringBuffer responseContent= new StringBuffer();
        try {
            URL url = new URL("https://newsapi.org/v2/top-headlines?q=corona&apiKey=e809c2bfc1c7416887eb0c289ab6c540&country=at");
            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();
            //System.out.println(status);
            if(status > 299){
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while((line = reader.readLine())!=null){
                    responseContent.append(line);
                }
                reader.close();
            }else{
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while((line = reader.readLine())!=null){
                    responseContent.append(line);
                }
                reader.close();
            }
            System.out.println(responseContent.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
}

public static void AllNewsBitcoin(){
    BufferedReader reader;
    String line;
    StringBuffer responseContent= new StringBuffer();
    try {
        URL url = new URL("https://newsapi.org/v2/everything?q=bitcoin&apiKey=e809c2bfc1c7416887eb0c289ab6c540");
        connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);

        int status = connection.getResponseCode();
        //System.out.println(status);
        if(status > 299){
            reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            while((line = reader.readLine())!=null){
                responseContent.append(line);
            }
            reader.close();
        }else{
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            while((line = reader.readLine())!=null){
                responseContent.append(line);
            }
            reader.close();
        }
        System.out.println(responseContent.toString());

    } catch (MalformedURLException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
  }
}

