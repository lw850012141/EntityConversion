package com.awelee.conversion;

import org.apache.commons.beanutils.Converter;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.text.ParseException;

/***
 *
 * @描述: 日期转换器.
 * @作者: Awelee.
 * @创建时间: 2018/3/4, 15:36 .
 * @版本: V1.0.
 *
 */
public class DateConverter implements Converter {

    /**
     * 日期格式化对象.
     */
    private static SimpleDateFormat df = new SimpleDateFormat();

    /**
     * 模式集合.
     */
    private static Set<String> patterns = new HashSet<String>();
    //注册一下日期的转换格式
    static{
        DateConverter.patterns.add("yyyy-MM-dd");
        DateConverter.patterns.add("yyyy-MM-dd HH:mm");
        DateConverter.patterns.add("yyyy-MM-dd HH:mm:ss");
        DateConverter.patterns.add("yyyy/MM/dd HH:mm:ss");
    }

    @SuppressWarnings("rawtypes")
    @Override
    public <T> T convert(Class<T> aClass, Object o) {
        if(o == null){
            return null;
        }else if(o instanceof String){
            Object dateObj = null;
            Iterator it = patterns.iterator();
            while(it.hasNext()){
                try{
                    String pattern = (String)it.next();
                    df.applyPattern(pattern);
                    dateObj = df.parse((String)o);
                    break;
                }catch(ParseException ex){
                    //do iterator continue
                }
            }
            return (T) dateObj;
        }else{
            return null;
        }
    }
}
