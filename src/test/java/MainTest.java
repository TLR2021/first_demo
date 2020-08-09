import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    Main m = new Main();

    @Before
    public void setUp() throws Exception {
        System.out.println("测试开始");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }

    @Test
    public void showMenu() {
        m.showMenu();
    }
}