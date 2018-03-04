package com.awelee.conversion;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.SqlDateConverter;
import java.lang.reflect.InvocationTargetException;

/***
 *
 * @描述: 注册自定义转换机制.
 * @作者: Awelee.
 * @创建时间: 2018/3/4, 13:19 .
 * @版本: V1.0.
 *
 */
public class CustomerBeanUtil extends BeanUtils {
    public CustomerBeanUtil() {
        super();
    }

    static {
        // 注册sql.date的转换器，即允许BeanUtils.copyProperties时的源目标的sql类型的值允许为空
        ConvertUtils.register(new SqlDateConverter(), java.util.Date.class);
        // 注册util.date的转换器，即允许BeanUtils.copyProperties时的源目标的util类型的值允许为空
        ConvertUtils.register(new DateConverter(), java.util.Date.class);
    }

    public static void copyProperties(Object target, Object source) throws InvocationTargetException, IllegalAccessException {
        BeanUtils.copyProperties(target, source);
    }
}
