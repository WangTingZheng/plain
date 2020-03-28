package com.wangtingzheng.plain.network;



import com.wangtingzheng.plain.converter.InformationConverter;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Post {

    public  static void main(String[] args) throws IOException {
       HashMap<String, String> para;
       HashMap<String, String> headers;
       InformationConverter informationConverter = new InformationConverter();
       para = informationConverter.getItemHasMap("./conf/smms.json", "para");
       headers = informationConverter.getItemHasMap("./conf/smms.json","header");
       String resp;
       resp = performPostCall("https://sm.ms/api/v2/token", para, headers);
       System.out.println(resp);
    }

    public static String  performPostCall(String requestURL, HashMap<String, String> postDataParams, HashMap<String, String> header) {
        URL url;
        String response = "";
        try {
            url = new URL(requestURL);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setReadTimeout(15000);
            conn.setConnectTimeout(15000);
            conn.setRequestMethod("POST");
            Set<Map.Entry<String, String>> set = header.entrySet();
            for (Map.Entry<String, String> stringStringEntry : set) {
                Map.Entry<String, String> next;
                next = stringStringEntry;
                conn.setRequestProperty(next.getKey(), next.getValue());
            }
            conn.setDoInput(true);
            conn.setDoOutput(true);


            OutputStream os = conn.getOutputStream();
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(os, "UTF-8"));
            writer.write(getPostDataString(postDataParams));

            writer.flush();
            writer.close();
            os.close();
            int responseCode = conn.getResponseCode();
            System.out.println(responseCode);
            if (responseCode == HttpsURLConnection.HTTP_OK) {
                String line;
                BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
                while ((line=br.readLine()) != null) {
                    response+=line;
                }
            }
            else {
                response="";

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }

    private static String getPostDataString(HashMap<String, String> params) throws UnsupportedEncodingException{
        StringBuilder result = new StringBuilder();
        boolean first = true;
        for(Map.Entry<String, String> entry : params.entrySet()){
            if (first)
            {
                first = false;
            }
            else
            {
                result.append("&");
            }

            result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
        }

        return result.toString();
    }
}
