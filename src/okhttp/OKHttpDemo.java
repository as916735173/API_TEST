package okhttp;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class OKHttpDemo {
    public static void main(String[] args) throws IOException {
        String url = "http://fhl2.test.ccclubs.com/taxi-operator/#/login";
        //1.创建一个OkHttpClient
        OkHttpClient client = new OkHttpClient();
        //2.构建request
        Request request= new Request.Builder()
                .url(url)
                .get()
                .build();
        //3.使用client发送请求，返回一个响应
        Response response = client.newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(response.body().string());
    }
}
