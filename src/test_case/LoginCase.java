package test_case;

import constants.Constants;
import okhttp.HttpUtils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginCase {
    @Test(dataProvider = "datas")
    public void testRegister(String params){
        String url = Constants.LOGIN_URL;
        String method = Constants.METHOD;
        String body = HttpUtils.call(method,url,params);
        boolean flag = body.contains("登录成功");
        System.out.println("断言结果：" + flag);
        Assert.assertTrue(flag);
    }
    @DataProvider(name = "datas")
    public Object[][] datas(){
        Object[][] datas = {
                {"""
                {
                    "accountName": "",
                    "domainHeader":"fhl",
                    "password": "admin654"
                }"""},
                {"""
                {
                    "accountName": "admin_qZVhP7",
                    "domainHeader":"fhl",
                    "password": ""
                }"""},
                {"""
                {
                    "accountName": "a",
                    "domainHeader":"fhl",
                    "password": "admin654"
                }"""},
                {"""
                {
                    "accountName": "admin_qZVhP7",
                    "domainHeader":"fhl",
                    "password": "adm"
                }"""},
                {"""
                {
                    "accountName": "admin",
                    "domainHeader":"fhl",
                    "password": "adm654"
                }"""},
                {"""
                {
                    "accountName":"admin_qZVhP7",
                    "domainHeader":"fhl",
                    "password":"admin654"
                }"""},
        };
        return datas;
    }
}
