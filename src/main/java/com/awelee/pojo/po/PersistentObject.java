package com.awelee.pojo.po;

import java.util.Date;

/***
 *
 * @描述: 持久化对象，它跟持久层（通常是关系型数据库）的数据结构形成一一对应的映射关系，<br>
 * 如果持久层是关系型数据库，那么，数据表中的每个字段（或若干个）就对应PO的一个（或若干个）属性。
 * @作者: Awelee.
 * @创建时间: 2018/3/4, 12:36 .
 * @版本: V1.0.
 *
 */
public class PersistentObject {

    private  Long code;

    private String name;

    private Integer gender;

    private Date date;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
