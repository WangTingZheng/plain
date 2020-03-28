package com.wangtingzheng.plain;
import com.wangtingzheng.plain.reunion.Generate;

public class App {
    public static void main(String[] args)
    {
        String web = "./web";
        Generate generate = new Generate(web);
        generate.fraToFile("/fragment/head.html", "/fragment/end.html", "/markdown/demo.md", "/context/posts/demo.html");
    }
}
