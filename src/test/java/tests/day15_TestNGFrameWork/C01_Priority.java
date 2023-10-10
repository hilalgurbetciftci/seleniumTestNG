package tests.day15_TestNGFrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_Priority {
    @Test(priority = 80)
    public void carpmaTest(){
        int a= 10;
        int b= 20;
        // sayilarinin carpiminin 100Den buyuk oldugunu test edin
        Assert.assertTrue(a*b>100);

    }
    @Test(priority = -100)
    public void toplamaTest(){
        int a= 10;
        int b= 20;
        // sayilarinin toplaminin 0'den buyuk oldugunu test edin
        Assert.assertTrue(a+b>0);


}
    @Test(priority = 1)
    public void cikarmaTest(){
        int a= 10;
        int b= 20;
        // a ile b'nin farkinin mutlak degerinin 100'den kucuk oldugunu test edin
        Assert.assertTrue((a-b)>-100&& (a-b)<100);


    }

    //TestNG hic mudahale olmaz ise testleri isim sirasina gore calistirir
    // testlerin calisma sirasini istedigimiz gibi duzenleyebiliriz
    //test notasyonunun ardından (priority = -100) ile oncelik belirleriz
    // negatif pozitif farketmeksizin kucukten buyuge dogru calisir
    // onunde (priority =?) olmayan test notasyonunun priority'si default yani '0' kabul edillir
}