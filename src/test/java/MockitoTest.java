import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;

public class MockitoTest {
    @Test
    public void testA(){
        //You can mock concrete classes, not just interfaces
        LinkedList mockList=mock(LinkedList.class);

        //using mock
        mockList.add("zm_once");

        mockList.add("zm_twice");
        mockList.add("zm_twice");

        mockList.add("zm_three times");
        mockList.add("zm_three times");
        mockList.add("zm_three times");

        //following two verifications work exactly the same - times(1) is used by default
        verify(mockList).add("zm_once");
        verify(mockList,times(1)).add("zm_once");

        //exact number of invocations verification
        verify(mockList, times(2)).add("zm_twice");

        verify(mockList,times(3)).add("zm_three times");

        //verification using never(). never() is an alias to times(0)
        verify(mockList,never()).add("never happend");

        //verification using atLeast()/atMost()
        verify(mockList,atLeastOnce()).add("zm_three times");
        verify(mockList,atLeast(2)).add("zm_three times");
        verify(mockList,atMost(5)).add("zm_three times");
    }

    @Test
    public void testB(){
        List list = new LinkedList();
        List spy = spy(list);

        //optionally, you can stub out some methods:
        when(spy.size()).thenReturn(100);

        //using the spy calls *real* methods
        spy.add("zm_zero"); //index从0开始
        spy.add("zm_one");
        spy.add(2,"zm_three");   //指定index

        //prints "one" - the first element of a list
        System.out.println("spy.index0: "+spy.get(0));

        System.out.println("spy.index1: "+spy.get(1));

        System.out.println("spy.index2: "+spy.get(2));

        //size() method was stubbed - 100 is printed
        System.out.println("Spy.size: "+ spy.size());

        //optionally, you can verify
        verify(spy).add("zm_zero");
        verify(spy).add("zm_one");
        verify(spy).add(2,"zm_three");
    }
}