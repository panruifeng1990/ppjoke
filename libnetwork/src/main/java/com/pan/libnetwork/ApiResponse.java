package com.pan.libnetwork;

/**
 * @author panruifeng
 * @date 2020/3/24.
 * @company: 5i5j
 * GitHub：
 * email：
 * description：
 */
public class ApiResponse<T> {
    public boolean success;
    public String message;
    public int states;
    public T body;
}
