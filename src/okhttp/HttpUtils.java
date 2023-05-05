package okhttp;

import okhttp3.*;

import java.io.IOException;

public class HttpUtils {
    public static String get(String url,String params){
        //1.创建一个OkHttpClient
        OkHttpClient client = new OkHttpClient();
        //2.构建request
        Request request= new Request.Builder()
                .url(url+ "?" + params)
                .get()
                .build();
        //3.使用client发送请求，返回一个响应
        try {
            Response response = client.newCall(request).execute();
            System.out.println(response.code());
            System.out.println(response.headers());
            String body = response.body().string();
            System.out.println(body);
            return body;
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    public static String post(String url,String params){
        //1.创建一个OkHttpClient
        OkHttpClient client = new OkHttpClient();
        //2.创建RequestBody
        MediaType type = MediaType.parse("application/json;charset=UTF-8");
        RequestBody requestBody = RequestBody.create(type,params);
        //3.构建request
        Request request= new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();
        //4.使用client发送请求，返回一个响应
        try {
            Response response = client.newCall(request).execute();
            System.out.println(response.code());
            System.out.println(response.headers());
            String body = response.body().string();
            System.out.println(body);
            return body;
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
    public static String call(String method,String url,String params){
        if("get".equalsIgnoreCase(method)){
            return get(url,params);
        }
        else if ("post".equalsIgnoreCase(method)) {
            return post(url,params);
        }
        return null;
    }
}
