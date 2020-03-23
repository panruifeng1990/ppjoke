package com.prf.ppjoke.Utils;

import android.content.ComponentName;

import com.prf.ppjoke.FixFragmentNavigator;
import com.prf.ppjoke.model.Destination;

import java.util.HashMap;

import androidx.fragment.app.FragmentActivity;
import androidx.navigation.ActivityNavigator;
import androidx.navigation.NavController;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphNavigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.fragment.FragmentNavigator;

/**
 * @author panruifeng
 * @date 2020/3/23.
 * @company: 5i5j
 * GitHub：
 * email：
 * description：
 */
public class NavGraphBuilder {
    public static void build(NavController navController, FragmentActivity activity,int containerId){
        NavigatorProvider provider = navController.getNavigatorProvider();

//        FragmentNavigator fragmentNavigator = provider.getNavigator(FragmentNavigator.class);
        FixFragmentNavigator fragmentNavigator = new FixFragmentNavigator(activity,activity.getSupportFragmentManager(),containerId);
        provider.addNavigator(fragmentNavigator);
        ActivityNavigator activityNaviator = provider.getNavigator(ActivityNavigator.class);


        NavGraph navGraph = new NavGraph(new NavGraphNavigator(provider));

        HashMap<String, Destination> destConfig = AppConfig.getsDestnationConfig();
        for (Destination value : destConfig.values()) {
            if (value.isIsFragment()){
                FragmentNavigator.Destination destination = fragmentNavigator.createDestination();
                destination.setClassName(value.getClazName());
                destination.setId(value.getId());
                destination.addDeepLink(value.getPageUrl());
                navGraph.addDestination(destination);
            }else {
                ActivityNavigator.Destination destination = activityNaviator.createDestination();
                destination.setComponentName(new ComponentName(AppGlobals.getApplication(),value.getClazName()));
                destination.setId(value.getId());
                destination.addDeepLink(value.getPageUrl());
                navGraph.addDestination(destination);
            }
            if (value.isAsStarter()){
                navGraph.setStartDestination(value.getId());
            }
        }
        navController.setGraph(navGraph);


    }
}
