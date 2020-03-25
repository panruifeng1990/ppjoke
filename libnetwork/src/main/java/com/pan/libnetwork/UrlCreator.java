package com.pan.libnetwork;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/**
 * @author panruifeng
 * @date 2020/3/24.
 * @company: 5i5j
 * GitHub：
 * email：
 * description：
 */
public class UrlCreator {
    public static String createUrlFromParams(String url, Map<String, Object> map) {
        StringBuilder builder = new StringBuilder();
        builder.append(url);
        if (url.indexOf("?") > 0 || url.indexOf("&") > 0) {
            builder.append("&");
        } else builder.append("?");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                String value = URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
                builder.append(entry.getKey()).append("=").append(value).append("&");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return builder.deleteCharAt(builder.length() - 1).toString();
    }
}
