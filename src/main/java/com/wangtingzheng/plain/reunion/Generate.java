package com.wangtingzheng.plain.reunion;

import com.wangtingzheng.plain.converter.Converter;
import com.wangtingzheng.plain.converter.ConverterUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

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
    public void addArticle(String template, String article, String save)
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

}
