import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Scanner;

public class StuSysTest {

    StuSys stuSys = new StuSys();
    Scanner sc = new Scanner(System.in);

    @Before
    public void setUp() throws Exception {
        System.out.println("测试开始");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }

    @Test
    public void insertStu() {
        stuSys.insertStu(sc);
    }

    @Test
    public void delateStu() {
        stuSys.delateStu(sc);
    }

    @Test
    public void updateStu() {
        stuSys.updateStu(sc);
    }

    @Ignore
    public void showStuInfo() {
        stuSys.showStuInfo(sc);
    }

    @Test
    public void showAllStuInfo() {
        stuSys.showAllStuInfo();
    }
}