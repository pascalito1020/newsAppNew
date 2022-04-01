package ac.at.fhcampuswien;



import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class AppController {


    private ArrayList<Article> articles = new ArrayList<Article>();

    public AppController() {

    }


    public void setArticles(List<Article> articles) {

        articles = this.articles;

    }

    public int getArticleCount() {
        if(articles != null) {

            return 0;
        }
        else
        return this.articles.size();
    }

    public List<Article> getTopHeadlinesAustria() {

        System.out.println("TESTSTTSTSTSTSTSTSTSTS");

        if(articles != null) {

            return null;
        }else
            return new ArrayList<Article>();

    }

    public List<Article> getAllNewsBitcoin() {

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
        mock.add(new Article("Pascal", "Dein Aquarium brennt"));
        mock.add(new Article("Christian", "Wecker kaufen, wo"));


        return mock;
    }

}
