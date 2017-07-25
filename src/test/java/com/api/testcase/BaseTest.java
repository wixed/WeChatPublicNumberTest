package com.api.testcase;

import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.get;

/**
 * Created by wixed on 2017-7-24.
 */
public class BaseTest {


    /**
     *发送http请求
     * @param url 页面URL
     * @param statusCode 页面返回状态期望值
     */
    public void checkStatus(String url, int statusCode){
        Response re = get(url);
        Assert.assertEquals(re.statusCode(),statusCode);
    }

    public void checkStatus(String url){
        checkStatus(url,200);
    }
}
