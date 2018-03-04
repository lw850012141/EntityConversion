package com.awelee.conversion;

import com.awelee.enums.ConverterEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.reflect.InvocationTargetException;

/***
 *
 * @描述: 基础转换抽象类.
 * @作者: Awelee.
 * @创建时间: 2018/3/4, 12:48 .
 * @版本: V1.0.
 *
 */
public abstract class BaseConverter<V,P> {
    private static Logger logger = LoggerFactory.getLogger(BaseConverter.class);

    /**
     * 值对象与域对象之间属性复制
     *
     * @param dto
     *            值对象
     * @param domain
     *            域对象
     * @param flag
     *            复制方向
     */
    protected void copyProperties(V dto, P domain, ConverterEnum flag) {

        switch (flag) {

            case PO2VO:
                copySameProperties(dto, domain);
                copyDiffPropertiesFromPO2VO(dto, domain);
                break;

            case VO2PO:
                copySameProperties(domain, dto);
                copyDiffPropertiesFromVO2PO(domain, dto);
                break;

            default:
                break;
        }

    }

    /**
     * 同名属性复制
     *
     * @param target
     *            目标对象
     * @param source
     *            来源对象
     */
    protected void copySameProperties(Object target, Object source) {

        try {
            CustomerBeanUtil.copyProperties(target, source);
        } catch (IllegalAccessException e) {
            logger.error("对象属性值复制出错：原数据为{}， 目标数据为{}。", source, target);
        } catch (InvocationTargetException e) {
            logger.error("对象属性值复制出错：原数据为{}， 目标数据为{}。", source, target);
        }
    }

    /**
     * VO非同名属性复制到PO属性
     *
     * @param target
     *            域对象
     * @param source
     *            值对象
     */
    public abstract void copyDiffPropertiesFromVO2PO(P target, V source);

    /**
     * PO非同名属性复制到VO属性
     *
     * @param target
     *            值对象
     * @param source
     *            域对象
     */
    public abstract void copyDiffPropertiesFromPO2VO(V target, P source);
}
