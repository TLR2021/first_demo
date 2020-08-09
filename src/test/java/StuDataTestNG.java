import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.junit.Assert.assertNotNull;
import static org.testng.Assert.*;

public class StuDataTestNG {

    @BeforeMethod
    public void setUp() {
        System.out.println("测试开始");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("测试结束");
    }

    StuData std = new StuData();
    byte a = 23;
    Student stu = new Student("SF1916019","张萌","女",a,100);

    @Test
    public void testInsertStu() {
        std.insertStu(stu);
    }

    @Test
    public void testCheckStuNo() {
        std.insertStu(stu);
        Student stu = std.checkStuNo("SF1916019");
        assertNotNull(stu);
    }

    @Test
    public void testDelateStu() {
        std.delateStu("SF1916019");
    }

    @Test
    public void testUpdateStu() {
        std.updateStu(stu);
    }

    @Test
    public void testPrintStu() {
        std.printStu(stu);
    }

    @Test
    public void testPrintAllstuInf() {
        std.printAllstuInf();
    }
}