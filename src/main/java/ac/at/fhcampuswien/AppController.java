package ac.at.fhcampuswien;



import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class AppController {


    public ArrayList<Article> articles = new ArrayList<>(); // EMPTY
    public ArrayList<Article> filledList = (ArrayList<Article>) generateMockList();


    public void setArticles(List<Article> filledList) {

        filledList = this.filledList;

    }

    public int getArticleCount() {

        System.out.println(filledList.size());
        if(filledList == null) {

            return 0;
        }
        else
            return this.filledList.size();
    }

    public List<Article> getTopHeadlinesAustria() {

        System.out.println(filledList);

        if(articles != null) {

            return articles;

        } else {
            return new ArrayList<>();
        }
    }

    public List<Article> getAllNewsBitcoin() {

        System.out.println(filterList("Bitcoin", filledList));

        return filterList("Bitcoin", this.filledList);

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
        mock.add(new Article("Paul", "Bitcoin"));

        return mock;
    }

    public List<Article> getArticles() {
        return this.articles;
    }
}

