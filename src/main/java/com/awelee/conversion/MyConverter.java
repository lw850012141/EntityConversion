package com.awelee.conversion;

import com.awelee.enums.ConverterEnum;
import com.awelee.enums.GenderEnum;
import com.awelee.pojo.po.PersistentObject;
import com.awelee.pojo.vo.ViewObject;
import com.awelee.utils.DateUtil;

/***
 *
 * @描述: 自定义转换器.
 * @作者: Awelee.
 * @创建时间: 2018/3/4, 14:05 .
 * @版本: V1.0.
 *
 */
public class MyConverter extends BaseConverter<ViewObject,PersistentObject>{

    public ViewObject getViewObject(PersistentObject po){
        ViewObject vo = new ViewObject();
        copyProperties(vo, po, ConverterEnum.PO2VO);
        return vo;
    }

    public PersistentObject getPersistentObject(ViewObject vo){
        PersistentObject po = new PersistentObject();
        copyProperties(vo, po, ConverterEnum.VO2PO);
        return po;
    }

    @Override
    public void copyDiffPropertiesFromVO2PO(PersistentObject target, ViewObject source) {
        target.setGender(GenderEnum.getCode(source.getGender()));
//        target.setDate(DateUtil.strToDateLong(source.getDate()));
    }

    @Override
    public void copyDiffPropertiesFromPO2VO(ViewObject target, PersistentObject source) {
        target.setGender(GenderEnum.getName(source.getGender()));
        target.setDate(DateUtil.dateToStrLong(source.getDate()));
    }
}
