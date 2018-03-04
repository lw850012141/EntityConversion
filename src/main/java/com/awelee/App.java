package com.awelee;

import com.awelee.conversion.MyConverter;
import com.awelee.pojo.po.PersistentObject;
import com.awelee.pojo.vo.ViewObject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        MyConverter myConverter = new MyConverter();

        //PO2VO
        List<PersistentObject> pos = new ArrayList<>();
        PersistentObject po1 = new PersistentObject();
        po1.setCode(1L);
        po1.setName("awelee1");
        po1.setGender(1);
        po1.setDate(new Date());
        pos.add(po1);
        PersistentObject po2 = new PersistentObject();
        po2.setCode(2L);
        po2.setName("awelee2");
        po2.setGender(2);
        po2.setDate(new Date());
        pos.add(po2);
        PersistentObject po3 = new PersistentObject();
        po3.setCode(3L);
        po3.setName("awelee3");
        po3.setGender(0);
        po3.setDate(new Date());
        pos.add(po3);

        for(int i = 0; i< pos.size(); i++) {
            ViewObject vo = myConverter.getViewObject(pos.get(i));
            System.out.println("\r\n编号："+vo.getCode()+"\r\n姓名："+vo.getName()+"\r\n性别："+vo.getGender()+"\r\n日期："+vo.getDate());
        }

        //PO2VO
        List<ViewObject> vos = new ArrayList<>();
        ViewObject vo1 = new ViewObject();
        vo1.setCode(1L);
        vo1.setName("awelee1");
        vo1.setGender("帅哥");
        vo1.setDate("2018-03-04 15:14:46");
        vo1.setAttributes1("扩展1");
        vo1.setAttributes3(1);
        vo1.setAttributes4(new BigDecimal(10000));
        vos.add(vo1);
        ViewObject vo2 = new ViewObject();
        vo2.setCode(2L);
        vo2.setName("awelee2");
        vo2.setGender("美女");
        vo2.setDate("2018-03-04 15:14:46");
        vos.add(vo2);
        ViewObject vo3 = new ViewObject();
        vo3.setCode(3L);
        vo3.setName("awelee3");
        vo3.setGender("未知");
        vo3.setDate("2018-03-04 15:14:46");
        vos.add(vo3);

        for(int i = 0; i< vos.size(); i++) {
            PersistentObject po = myConverter.getPersistentObject(vos.get(i));
            System.out.println("编号："+po.getCode()+"\r\n姓名："+po.getName()+"\r\n性别："+po.getGender()+"\r\n日期："+po.getDate());
        }
    }
}
