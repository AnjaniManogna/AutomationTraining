package Day15;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyEx {
    @Test(priority = 1)
    public void startCar(){
        System.out.println("Car started");
    }
    @Test(priority = 2,dependsOnMethods = {"startCar"})
    public void driverCar(){

        Assert.fail("Unable to drive the car");
        System.out.println("Driving the car");
    }
    @Test(priority = 3,dependsOnMethods = {"driverCar"})
    public void stopCar(){
        System.out.println("Car stopped");
    }
    @Test(priority = 4, dependsOnMethods = {"driverCar","stopCar"},alwaysRun = true)
    public void parkCar(){
        System.out.println("Car parked");
    }
}
