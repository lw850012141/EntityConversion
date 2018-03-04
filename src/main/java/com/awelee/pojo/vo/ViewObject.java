package com.awelee.pojo.vo;

import java.math.BigDecimal;

/***
 *
 * @描述: 视图对象，用于展示层，它的作用是把某个指定页面（或组件）的所有数据封装起来。
 * @作者: Awelee.
 * @创建时间: 2018/3/4, 12:35 .
 * @版本: V1.0.
 *
 */
public class ViewObject {
    private  Long code;

    private String name;

    private String gender;

    private String date;

    private String attributes1;

    private Integer attributes3;

    private BigDecimal attributes4;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAttributes1() {
        return attributes1;
    }

    public void setAttributes1(String attributes1) {
        this.attributes1 = attributes1;
    }

    public Integer getAttributes3() {
        return attributes3;
    }

    public void setAttributes3(Integer attributes3) {
        this.attributes3 = attributes3;
    }

    public BigDecimal getAttributes4() {
        return attributes4;
    }

    public void setAttributes4(BigDecimal attributes4) {
        this.attributes4 = attributes4;
    }
}
