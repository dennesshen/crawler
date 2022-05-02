
package com.crawler;

import java.net.HttpURLConnection;
import java.net.URL;

public class Application {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello World!");
    String path = "http://localhost:8080/JavaWeb_20220418/servlet/getHeader";
    URL url = new URL(path);
    
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");   
    conn.setDoOutput(true);   //需要輸出
    conn.setDoInput(true);   //需要輸入
    conn.setUseCaches(false);  //不允許快取
    conn.addRequestProperty("Accept-Charset123", "123");
   
    System.out.println(conn.getContent());
  }
}
