package com.prf.ppjoke.Utils;

import android.content.res.AssetManager;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.pan.libcommon.AppGlobals;
import com.prf.ppjoke.model.BottomBar;
import com.prf.ppjoke.model.Destination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author panruifeng
 * @date 2020/3/23.
 * @company: 5i5j
 * GitHub：
 * email：
 * description：
 */
public class AppConfig {
    private static HashMap<String, Destination> sDestnation;
    private static BottomBar bottomBar;

    public static HashMap<String, Destination> getsDestnationConfig() {
        if (sDestnation == null) {
            String content = parseFile("destination.json");
            sDestnation = JSON.parseObject(content, new TypeReference<HashMap<String, Destination>>() {
            }.getType());
        }
        return sDestnation;
    }

    public static BottomBar getBottomBar() {
        if (bottomBar == null) {
            String content = parseFile("main_tabs_config.json");

            bottomBar = JSON.parseObject(content, BottomBar.class);
        }
        return bottomBar;
    }

    private static String parseFile(String fileName) {
        AssetManager assetManager = AppGlobals.getApplication().getResources().getAssets();
        InputStream inputStream = null;
        BufferedReader bufferedReader = null;
        StringBuilder stringBuffer = new StringBuilder();
        try {
            inputStream = assetManager.open(fileName);
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (inputStream != null)
                    inputStream.close();
                if (bufferedReader != null)
                    bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringBuffer.toString();

    }

}
