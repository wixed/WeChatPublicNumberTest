package com.api.testcase;

import com.api.listener.TestNGListener;
import com.api.page.HotSaleMainPage;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.*;

import static io.restassured.RestAssured.get;

/**
 * Created by wixed on 2017-7-24.
 * 测试用例类
 */
@Listeners({TestNGListener.class})
public class PageLoadTest extends BaseTest{

    @BeforeMethod
    public void setUp() throws Exception {
        System.out.println("setUp");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }

    @Test(description = "HOT订购主页")
    public void testA(){
        checkStatus(HotSaleMainPage.hotSaleMainPage);
    }

    @Test(description = "宽带页面")
    public void testB(){
        checkStatus(HotSaleMainPage.broadband);
    }

    @Test(description = "天翼页面")
    public void testC(){
        checkStatus(HotSaleMainPage.tianYi);
    }

    @Test(description = "新套餐，约不页面")
    public void testD(){
        checkStatus(HotSaleMainPage.newPlan);
    }


}
