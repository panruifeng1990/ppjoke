package com.prf.ppjoke.model;

/**
 * @author panruifeng
 * @date 2020/3/23.
 * @company: 5i5j
 * GitHub：
 * email：
 * description：
 */
public class Destination {

    /**
     * isFragment : true
     * asStarter : true
     * needLogin : false
     * pageUrl : main/tabs/home
     * clazName : com.prf.ppjoke.ui.home.HomeFragment
     * id : 216219972
     */

    private boolean isFragment;
    private boolean asStarter;
    private boolean needLogin;
    private String pageUrl;
    private String clazName;
    private int id;

    public boolean isIsFragment() {
        return isFragment;
    }

    public void setIsFragment(boolean isFragment) {
        this.isFragment = isFragment;
    }

    public boolean isAsStarter() {
        return asStarter;
    }

    public void setAsStarter(boolean asStarter) {
        this.asStarter = asStarter;
    }

    public boolean isNeedLogin() {
        return needLogin;
    }

    public void setNeedLogin(boolean needLogin) {
        this.needLogin = needLogin;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getClazName() {
        return clazName;
    }

    public void setClazName(String clazName) {
        this.clazName = clazName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
