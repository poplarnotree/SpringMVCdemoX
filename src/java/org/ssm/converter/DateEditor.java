package org.ssm.converter;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEditor extends PropertyEditorSupport {
    //将传入的字符串数据转换成Date类型
    public void setAsText(String text) throws IllegalArgumentException{
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            System.out.println("进行日期转换");
            Date date = dateFormat.parse(text);
            setValue(date);
        }catch (ParseException e){
            System.out.println("日期转换失败");
            e.printStackTrace();
        }
    }
}
