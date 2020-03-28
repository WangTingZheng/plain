package com.wangtingzheng.plain.converter;

public class Converter {
    public static ConverterUtil converter;

    public  static ConverterUtil getConverter() {
        if(converter == null)
        {
            converter = new ConverterUtil();
        }
        return converter;
    }
}
