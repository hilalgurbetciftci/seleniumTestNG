package tests.Practice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C01_Notation {
    @Test(priority = 3)
    public void aHilal(){
        System.out.println("Hilal");

    }
    @Test(priority = 1)@Ignore
    public void bHalit(){
        System.out.println("Halit");

    }
    @Test(dependsOnMethods = "aHilal")
    public void cHilalHalit(){
        System.out.println("Hilal Halit");

    }
    @Test
    public void test05(){

    }

}
