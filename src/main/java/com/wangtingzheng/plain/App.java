package com.wangtingzheng.plain;
import com.wangtingzheng.plain.reunion.Generate;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        String web = "./web";
        Generate generate = new Generate(web);
        generate.addArticle("/fragment/index.html","/markdown/demo.md", "/index.html");

    }
}
