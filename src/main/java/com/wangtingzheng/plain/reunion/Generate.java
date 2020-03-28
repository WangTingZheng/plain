package com.wangtingzheng.plain.reunion;

import com.wangtingzheng.plain.converter.Converter;
import com.wangtingzheng.plain.converter.ConverterUtil;
import javafx.scene.input.DataFormat;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Generate {
    String webPath;

    public Generate(String webPath) {
        this.webPath = webPath;
    }

    public void setWebPath(String webPath) {
        this.webPath = webPath;
    }


    /**
     * add article from markdown file and save as an article
     * @param template the template html file path
     * @param article the markdown article file path
     * @param save the html file path you want to save
     */
    public void generateMDHtml(String template, String article, String save)
    {
        template = webPath + template;
        article = webPath + article;
        save = webPath + save;
        File file = new File(template);
        String articleContent = Converter.getConverter().mdToHtml(article);
        Document doc = null;
        try {
            doc = Jsoup.parse(file, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert doc != null;
        Elements elements = doc.select("article");
        elements.html(articleContent);
        Converter.getConverter().stringToFile(doc.html(), save);
    }

    // TODO: 2020/3/28 finish add article feature
    public void addArticle(String article, String classification, Data publish, String title, String headpic)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        String data = simpleDateFormat.format(publish);
        data = "." + data + ".";
        data.replace(".", "/");

        String save = webPath + "/context" + classification + data + title + ".html";
        generateMDHtml(webPath+ "/fragment/index.html", article, save);
    }
}
