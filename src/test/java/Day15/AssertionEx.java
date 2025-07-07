package Day15;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionEx {
    @Test
    public void assertEx(){
        Assert.assertEquals(10,10);
//        Assert.assertEquals("Automation","automation");
//        Assert.assertTrue(false,"Given condition is not matched");
//        Assert.assertFalse(true,"Element is visible");
        if (1==2){
            System.out.println("Pass");
        }
        else{
            Assert.fail("Values are not matched");
        }

    }
}
