package ac.at.fhcampuswien;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class AppController {


    public List<Article> articles = generateMockList();


    public AppController() {

    }


    public void setArticles(List<Article> articles) {

        articles = this.articles;

    }

    public List<Article> getArticles(){
        return this.articles;
    }

    public int getArticleCount() {
        System.out.println(articles.size());
        if(articles == null) {

            return 0;
        }
        else

        return this.articles.size();
    }

    public List<Article> getTopHeadlinesAustria() {

        System.out.println(articles);

        if(articles != null) {

            return articles;
        }else
            return new ArrayList<>();

    }

    public List<Article> getAllNewsBitcoin() {
        System.out.println(filterList("bitcoin",articles));

        return filterList("Bitcoin", this.articles);

    }

    protected static List<Article> filterList(String query, List<Article> articles) {

        if (articles == null)
            return null;
        if (query == null || query.isEmpty())
            return articles;
        List<Article> result = new ArrayList<>();

        for (Article article : articles){
            if (Pattern.compile(Pattern.quote(query), Pattern.CASE_INSENSITIVE).matcher(article.getTitle()).find())
                result.add(article);
        }

        return result;

    }

    public static List<Article> generateMockList(){
        List<Article> mock = new ArrayList<>();

        mock.add(new Article("Patrick", "Solebox brennt ab"));
        mock.add(new Article("Ravin", "Solebox brennt immer noch"));
        mock.add(new Article("Pascal", "Dein Bitcoin-Aquarium brennt"));
        mock.add(new Article("Christian", "Wecker kaufen, wo"));


        return mock;
    }



}
