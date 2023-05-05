package test_case;

import constants.Constants;
import okhttp.HttpUtils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterCase {
    @Test(dataProvider = "datas")
    public void testRegister(String params){
        String url = Constants.REGISTER_URL;
        String method = Constants.METHOD;
        String body = HttpUtils.call(method,url,params);
        boolean flag = body.contains("注册成功");
        System.out.println("断言结果：" + flag);
        Assert.assertEquals(flag,true);
    }
    @DataProvider(name = "datas")
    public Object[][] datas(){
        Object[][] datas = {
                {"""
                    {
                    "userName":"测试1",
                    "mobile":"",
                    "departmentId":"985b2cdeea0040aab145f75966830f17",
                    "roleId":"d02c8118003245659ed263a6ef71f5d7",
                    "isFleetManager":false,
                    "userStatus":1,
                    "password":"123456"
                    }
                    """},
                {"""
                    {
                    "userName":"测试2",
                    "mobile":"15260000002",
                    "departmentId":"985b2cdeea0040aab145f75966830f17",
                    "roleId":"d02c8118003245659ed263a6ef71f5d7",
                    "isFleetManager":false,
                    "userStatus":1,
                    "password":""
                    }
                    """},
                {"""
                    {
                    "userName":"测试3",
                    "mobile":"15260aaa003",
                    "departmentId":"985b2cdeea0040aab145f75966830f17",
                    "roleId":"d02c8118003245659ed263a6ef71f5d7",
                    "isFleetManager":false,
                    "userStatus":1,
                    "password":"123456"
                    }
                    """},
                {"""
                    {
                    "userName":"测试4",
                    "mobile":"15260000004",
                    "departmentId":"985b2cdeea0040aab145f75966830f17",
                    "roleId":"d02c8118003245659ed263a6ef71f5d7",
                    "isFleetManager":false,
                    "userStatus":1,
                    "password":"12"
                    }
                    """},
                {"""
                    {
                    "userName":"测试5",
                    "mobile":"15260000005",
                    "departmentId":"985b2cdeea0040aab145f75966830f17",
                    "roleId":"d02c8118003245659ed263a6ef71f5d7",
                    "isFleetManager":false,
                    "userStatus":1,
                    "password":"123456"
                    }
                    """},
                {"""
                    {
                    "userName":"测试6",
                    "mobile":"15260000005",
                    "departmentId":"985b2cdeea0040aab145f75966830f17",
                    "roleId":"d02c8118003245659ed263a6ef71f5d7",
                    "isFleetManager":false,
                    "userStatus":1,
                    "password":"123456"
                    }
                    """},
        };
        return datas;
    }
}
