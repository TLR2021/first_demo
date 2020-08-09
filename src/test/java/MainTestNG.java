import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTestNG {

    @BeforeMethod
    public void setUp() {
        System.out.println("测试开始");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("测试结束");
    }

    @Test
    public void testShowMenu() {
        Main main = new Main();
        main.showMenu();
    }
}