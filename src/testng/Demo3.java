package testng;

import org.testng.annotations.*;

public class Demo3 {
    //@BeforeSuite、@AfterSuite、@BeforeTest、@AfterTest整个测试下都会生效（例如testng.xml下都会生效）
    @BeforeSuite
    public void f1(){
        System.out.println("@BeforeSuite...");
    }
    @AfterSuite
    public void f2(){
        System.out.println("@AfterSuite...");
    }
    @BeforeTest
    public void f3(){
        System.out.println("@BeforeTest...");
    }
    @AfterTest
    public void f4(){
        System.out.println("@AfterTest");
    }
    //@BeforeClass、@AfterClass、@BeforeMethod、@AfterMethod只针对当前测试项有效
    @BeforeClass
    public void f5(){
        System.out.println("@BeforeClass...");
    }
    @AfterClass
    public void f6(){
        System.out.println("@AfterClass...");
    }
    @BeforeMethod
    public void f7(){
        System.out.println("@BeforeMethod...");
    }
    @AfterMethod
    public void f8(){
        System.out.println("@AfterMethod...");
    }
    @Test
    public void test1(){
        System.out.println("testng.Demo3...test1.....");
    }
    @Test
    public void test2(){
        System.out.println("testng.Demo3...test2...");
    }
}
