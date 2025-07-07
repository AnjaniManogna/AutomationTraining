package Day15;

import org.testng.annotations.Test;

public class PriorityEx {
    @Test(priority = 1)
    public void bc(){
        System.out.println("Url launched");
    }
    @Test(priority = 3,invocationCount = 5)
    public void ca(){
        System.out.println("Verified title");
    }
    @Test(priority = 5,enabled = false)
    public void ac(){
        System.out.println("logged out from the app");
    }
}
