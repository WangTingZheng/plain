package com.wangtingzheng.plain.converter;

import org.commonmark.Extension;
import org.commonmark.ext.gfm.tables.TablesExtension;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class ConverterUtil {
    public String fileToString(String path)
    {
        String text = null;
        String str;
        try {
            BufferedReader in = new BufferedReader(new java.io.FileReader(path));
            while ((str = in.readLine()) != null) {
                text +=(str+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(text != null)
        {
            text = text.replace("null", "");
        }
        return text;
    }

    public void stringToFile(String text, String path)
    {
        File file = new File(path);
        try(FileWriter writer = new FileWriter(file);
            BufferedWriter out =  new BufferedWriter(writer)
        ){
            out.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String mdToHtml(String path)
    {
        String mdText;
        List<Extension> extensions = Arrays.asList(TablesExtension.create());

        Parser parser = Parser.builder()
                .extensions(extensions)
                .build();

        HtmlRenderer renderer = HtmlRenderer.builder()
                .extensions(extensions)
                .build();

        ConverterUtil converter = new ConverterUtil();
        mdText = converter.fileToString(path);
        Node document = parser.parse(mdText);
        return renderer.render(document);
    }
}
