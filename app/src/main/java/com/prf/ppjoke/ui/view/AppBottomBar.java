package com.prf.ppjoke.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.LabelVisibilityMode;
import com.prf.ppjoke.R;
import com.prf.ppjoke.Utils.AppConfig;
import com.prf.ppjoke.model.BottomBar;
import com.prf.ppjoke.model.Destination;

import java.util.List;

/**
 * @author panruifeng
 * @date 2020/3/23.
 * @company: 5i5j
 * GitHub：
 * email：
 * description：
 */
public class AppBottomBar extends BottomNavigationView {
    private static int[] icons = new int[]{
            R.mipmap.icon_tab_home,
            R.mipmap.icon_tab_sofa,
            R.mipmap.icon_tab_publish,
            R.mipmap.icon_tab_find,
            R.mipmap.icon_tab_mine
    };

    public AppBottomBar(Context context) {
        this(context, null);
    }

    public AppBottomBar(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    @SuppressLint("RestrictedApi")
    public AppBottomBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        BottomBar bottomBar = AppConfig.getBottomBar();
        List<BottomBar.TabsBean> tabsBeans = bottomBar.getTabs();

        int[][] states = new int[2][];
        states[0] = new int[]{android.R.attr.state_selected};
        states[1] = new int[]{};

        int[] colors = new int[]{Color.parseColor(bottomBar.getActiveColor()), Color.parseColor(bottomBar.getInActiveColor())};
        ColorStateList colorStateList = new ColorStateList(states, colors);
        setItemIconTintList(colorStateList);
        setItemTextColor(colorStateList);
        //LABEL_VISIBILITY_LABELED:设置按钮的文本为一直显示模式
        //LABEL_VISIBILITY_AUTO:当按钮个数小于三个时一直显示，或者当按钮个数大于3个且小于5个时，被选中的那个按钮文本才会显示
        //LABEL_VISIBILITY_SELECTED：只有被选中的那个按钮的文本才会显示
        //LABEL_VISIBILITY_UNLABELED:所有的按钮文本都不显示
        setLabelVisibilityMode(LabelVisibilityMode.LABEL_VISIBILITY_LABELED);
        setSelectedItemId(bottomBar.getSelectTab());

        for (int i = 0; i < tabsBeans.size(); i++) {
            BottomBar.TabsBean tab = tabsBeans.get(i);
            if (!tab.isEnable()) {
                continue;
            }
            int id = getId(tab.getPageUrl());
            if (id < 0)
                continue;
            MenuItem item = getMenu().add(0, id, tab.getIndex(), tab.getTitle());
            item.setIcon(icons[tab.getIndex()]);

        }

        for (int i = 0; i < tabsBeans.size(); i++) {
            BottomBar.TabsBean tab = tabsBeans.get(i);
            if (!tab.isEnable()) {
                continue;
            }
            int id = getId(tab.getPageUrl());
            if (id < 0)
                continue;
            int iconSize = dp2px(tab.getSize());
            BottomNavigationMenuView menuView = (BottomNavigationMenuView) getChildAt(0);
            BottomNavigationItemView itemView = (BottomNavigationItemView) menuView.getChildAt(tab.getIndex());
            itemView.setIconSize(iconSize);

            if(TextUtils.isEmpty(tab.getTitle())){
                itemView.setIconTintList(ColorStateList.valueOf(Color.parseColor(tab.getTintColor())));
                itemView.setShifting(false);
            }
        }
    }

    private int dp2px(int size) {
        return (int) (getContext().getResources().getDisplayMetrics().density*size+0.5f);
    }


    private int getId(String pageUrl) {
        Destination destination = AppConfig.getsDestnationConfig().get(pageUrl);
        if (destination == null) {
            return -1;
        }
        return destination.getId();
    }
}
