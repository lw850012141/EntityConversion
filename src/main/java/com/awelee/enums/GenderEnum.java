package com.awelee.enums;

/***
 *
 * @描述: 性别枚举.
 * @作者: Awelee.
 * @创建时间: 2018/3/4, 14:22 .
 * @版本: V1.0.
 *
 */
public enum GenderEnum {
    M("帅哥",1),F("美女",2),N("未知",0);

    private String name;
    private int code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    private GenderEnum(String name,int code){
        this.name = name;
        this.code = code;
    }

    public static String getName(int code) {
        for (GenderEnum c : GenderEnum.values()) {
            if (c.getCode() == code) {
                return c.name;
            }
        }
        return null;
    }

    public static int getCode(String name) {
        for (GenderEnum c : GenderEnum.values()) {
            if (c.getName().equals(name)) {
                return c.code;
            }
        }
        return 0;
    }
}
