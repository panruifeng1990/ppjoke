package com.pan.libnetwork;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Type;

/**
 * @author panruifeng
 * @date 2020/3/24.
 * @company: 5i5j
 * GitHub：
 * email：
 * description：
 */
public class JsonConvert implements Convert {
    @Override
    public Object convert(String response, Type type) {
        JSONObject jsonObject = JSON.parseObject(response);
        JSONObject data = jsonObject.getJSONObject("data");
        if (data != null){
            Object object = data.get("data");
            return  JSON.parseObject(object.toString(),type);
        }
        return null;
    }

    @Override
    public Object convert(String response, Class claz) {
        JSONObject jsonObject = JSON.parseObject(response);
        JSONObject data = jsonObject.getJSONObject("data");
        if (data != null){
            Object object = data.get("data");
            return  JSON.parseObject(object.toString(),claz);
        }
        return null;
    }
}
