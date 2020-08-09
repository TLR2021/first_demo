import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class StuDataTest {

    StuData stuData = new StuData();
    byte a = 23; //年龄
    Student stu = new Student("SF1916019","张萌","女",a,100);

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
        stuData.insertStu(stu);
    }

    @Test
    public void checkStuNo() {
        stuData.insertStu(stu);
        Student stu = stuData.checkStuNo("SF1916019");
        assertNotNull(stu);
    }

    @Test
    public void delateStu() {
        stuData.delateStu("SF1916019");
    }

    @Test
    public void updateStu() {
        stuData.updateStu(stu);
    }

    @Test
    public void printStu() {
        stuData.printStu(stu);
    }

    @Test
    public void printAllstuInf() {
        stuData.printAllstuInf();
    }
}