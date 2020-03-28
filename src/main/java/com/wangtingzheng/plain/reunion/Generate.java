package com.wangtingzheng.plain.reunion;

import com.wangtingzheng.plain.converter.Converter;
import com.wangtingzheng.plain.converter.ConverterUtil;

public class Generate {
    String webPath;

    public Generate(String webPath) {
        this.webPath = webPath;
    }

    public void setWebPath(String webPath) {
        this.webPath = webPath;
    }

    /**
     * read head.html, end html and markdown file, generate complete html String
     * @param headPath head html relative path in static web
     * @param endPath end html relative path in static web
     * @param mdPath markdown file relative path in static web
     * @return the complete html String
     */
    public String fraToWhole(String headPath, String endPath, String mdPath)
    {
        String end;
        String head;
        String md;

        ConverterUtil converterUtil = Converter.getConverter();
        end = converterUtil.fileToString(webPath + endPath);
        head = converterUtil.fileToString(webPath + headPath);
        md = converterUtil.mdToHtml(webPath + mdPath);
        return head+"\n" + md+ "\n" +end;
    }

    /**
     * read head.html, end html and markdown file, generate complete html file
     * @param headPath head html relative path in static web
     * @param endPath end html relative path in static web
     * @param mdPath markdown file relative path in static web
     * @param filePath the complete html file path you want to save
     */
    public void fraToFile(String headPath, String endPath, String mdPath, String filePath)
    {
        String html = fraToWhole(headPath, endPath, mdPath);
        ConverterUtil converterUtil = Converter.getConverter();
        converterUtil.stringToFile(html, webPath + filePath);
    }


}
