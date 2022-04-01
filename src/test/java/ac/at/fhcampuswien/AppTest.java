package ac.at.fhcampuswien;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

    public class AppTest {
        List<Article> mock = null;


        @BeforeEach
        public void setUp() {
            mock = new ArrayList<>();
            List<Article> mock = new ArrayList<>();
            mock.add(new Article("Patrick", "Solebox brennt ab"));
            mock.add(new Article("Ravin", "Solebox brennt immer noch"));
            mock.add(new Article("Pascal", "Dein Aquarium brennt"));
            mock.add(new Article("Christian", "Wecker kaufen, wo"));
            mock.add(new Article("Paul", "Bitcoin"));
        }


        @Test
        public void setArticleTest(){
            AppController articleTest = new AppController();
            articleTest.setArticles(AppController.generateMockList());

            List<Article> newTestList = articleTest.getArticles();
            assertEquals(newTestList,AppController.generateMockList());
        }


        @Test
        public void articleCountTest() {
            AppController articleTest2 = new AppController();

            int actual = articleTest2.getArticleCount();
            int expected = 5;

            assertEquals(expected,actual);
        }

        @Test
        public void getTopHeadlineAustriaTest(){

            AppController mocks = new AppController();

            mocks.setArticles(mock);

            List<Article> actual = mocks.getTopHeadlinesAustria();

            assertEquals(mock, actual);
        }



//    @Test
//    public void setArticlesTest(){
//        AppController articletest = new AppController();
//        articletest.setArticles(moc);
//    }


    }


