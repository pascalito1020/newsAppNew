package ac.at.fhcampuswien;

import ac.at.fhcampuswien.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void myFirstTest(){
        Main myApp = new Main();

        String actual = myApp.welcomeMessage();
        assertEquals("Hello World!", actual);
    }


}
