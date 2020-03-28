package com.wangtingzheng.plain.network;

import com.alibaba.fastjson.JSONObject;
import com.wangtingzheng.plain.converter.InformationConverter;

import java.util.HashMap;
import java.util.Map;

public class Header {
    HashMap<String,String> para = new HashMap<String,String>();
    HashMap<String,String> header = new HashMap<String,String>();

    public Header(HashMap<String, String> para) {
        this.para = para;
    }

    public Header(String username, String password) {
        para.put("username", username);
        para.put("password", password);
    }


    public Header(String Authorization) {
        header.put("Authorization", Authorization);
    }

    public Map<String, String> getPara() {
        return para;
    }

    public Map<String, String> getHeader() {
        return header;
    }

    public Header() {
    }

}
