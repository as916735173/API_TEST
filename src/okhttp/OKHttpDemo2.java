package okhttp;

import okhttp3.*;

import java.io.IOException;

public class OKHttpDemo2 {
    public static void main(String[] args) throws IOException {
        String url = "https://managerweb.test.ccclubs.com/ccclubs-manager-web/user/login/login";
        //1.创建一个OkHttpClient
        OkHttpClient client = new OkHttpClient();
        //2.创建RequestBody
        MediaType type = MediaType.parse("application/json;charset=UTF-8");
        RequestBody body = RequestBody.create(type, """
                {
                    "accountName": "admin_qZVhP7",
                    "domainHeader":"fhl",
                    "password": "admin654"
                }""");
        //3.构建request
        Request request= new Request.Builder()
                .url(url)
                .post(body)
                .build();
        //4.使用client发送请求，返回一个响应
        Response response = client.newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(response.body().string());
    }
}
