package com.api.listener;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/**
 * Created by wixed on 2017-7-24.
 * 监听类
 */
public class TestNGListener extends TestListenerAdapter {
    public static int successTestCase = 0;
    public static int failureTestCase = 0;
    public static int skipTestCase = 0;


    @Override
    public void onTestSuccess(ITestResult tr) {
        successTestCase += 1;
        super.onTestSuccess(tr);
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        failureTestCase += 1;
        super.onTestFailure(tr);
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        skipTestCase += 1;
        super.onTestSkipped(tr);
    }

    @Override
    public void onStart(ITestContext testContext) {
        super.onStart(testContext);
    }

}
