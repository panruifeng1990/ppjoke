package com.prf.ppjoke.Utils;

import android.app.Application;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author panruifeng
 * @date 2020/3/23.
 * @company: 5i5j
 * GitHub：
 * email：
 * description：
 */
public class AppGlobals {
    private static Application mApplication;
    public static Application getApplication(){
        if (mApplication == null){

            try {
                Method method = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication");
                try {
                    mApplication = (Application) method.invoke(null,null);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }


        }
        return mApplication;
    }
}
