package com.pan.libnetwork;

/**
 * @author panruifeng
 * @date 2020/3/24.
 * @company: 5i5j
 * GitHub：
 * email：
 * description：
 */
public abstract class JsonCallback<T> {
    public void onSuccess(ApiResponse<T> response){

    }
    public void  onError(ApiResponse<T> response){

    }
    public void onCacheSuccess(ApiResponse<T> response){

    }

}
