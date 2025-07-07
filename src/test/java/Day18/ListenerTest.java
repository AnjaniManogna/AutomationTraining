package Day18;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListenerEx.class)
public class ListenerTest {
    @Test
    public void test1(){
        Assert.assertEquals(10,10);
    }
    @Test
    public void test2(){
        Assert.assertEquals(10,20);
    }
    @Test
    public void test3(){
       throw new SkipException("The test is skipped");
    }
}
