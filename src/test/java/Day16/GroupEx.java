package Day16;

import org.testng.annotations.Test;

public class GroupEx {
    @Test(groups = {"smoke"})
    public void test1(){
        System.out.println("Test1 executed");
    }
    @Test(groups = {"regression"})
    public void test2(){
        System.out.println("Test2 executed");
    }
    @Test(groups = {"sanity"})
    public void test3(){
        System.out.println("Test3 executed");
    }
    @Test(groups = {"smoke","regression"})
    public void test4(){
        System.out.println("Test4 executed");
    }
    @Test(groups = {"smoke","sanity"})
    public void test5(){
        System.out.println("Test5 executed");
    }
    @Test(groups = {"smoke","sanity","regression"})
    public void test6(){
        System.out.println("Test6 executed");
    }
}
