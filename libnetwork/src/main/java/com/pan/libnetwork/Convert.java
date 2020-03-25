package com.pan.libnetwork;

import java.lang.reflect.Type;

/**
 * @author panruifeng
 * @date 2020/3/24.
 * @company: 5i5j
 * GitHub：
 * email：
 * description：
 */
public interface Convert<T> {
    T convert(String response, Type type);
    T convert(String response, Class claz);
}
