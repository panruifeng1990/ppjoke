package com.prf.ppjoke.model;

import java.io.Serializable;

/**
 * @author panruifeng
 * @date 2020/3/30.
 * @company: 5i5j
 * GitHub：
 * email：
 * description：
 */
public class Feed implements Serializable {

    /**
     * id : 484
     * itemId : 1581239433864
     * itemType : 2
     * createTime : 1581239433891
     * duration : 14
     * feeds_text : 是时候表演真正的技术了
     * authorId : 1578919786
     * activityIcon : null
     * activityText : 2020新年快乐
     * width : 960
     * height : 528
     * url : https://pipijoke.oss-cn-hangzhou.aliyuncs.com/zhenjishu.mp4
     * cover : https://pipijoke.oss-cn-hangzhou.aliyuncs.com/zhenjishu2.png
     * author : {"id":1250,"userId":1578919786,"name":"、蓅哖╰伊人为谁笑","avatar":"http://qzapp.qlogo.cn/qzapp/101794421/FE41683AD4ECF91B7736CA9DB8104A5C/100","description":"这是一只神秘的jetpack","likeCount":9,"topCommentCount":0,"followCount":2,"followerCount":46,"qqOpenId":"FE41683AD4ECF91B7736CA9DB8104A5C","expires_time":1586695789903,"score":0,"historyCount":1498,"commentCount":37,"favoriteCount":1,"feedCount":0,"hasFollow":false}
     * topComment : null
     * ugc : {"likeCount":1354,"shareCount":93,"commentCount":612,"hasFavorite":false,"hasLiked":false,"hasdiss":false,"hasDissed":false}
     */

    private int id;
    private long itemId;
    private int itemType;
    private long createTime;
    private int duration;
    private String feeds_text;
    private int authorId;
    private String activityIcon;
    private String activityText;
    private int width;
    private int height;
    private String url;
    private String cover;
    private User author;
    private Comment topComment;
    private Ugc ugc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getFeeds_text() {
        return feeds_text;
    }

    public void setFeeds_text(String feeds_text) {
        this.feeds_text = feeds_text;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }



    public String getActivityText() {
        return activityText;
    }

    public void setActivityText(String activityText) {
        this.activityText = activityText;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getActivityIcon() {
        return activityIcon;
    }

    public void setActivityIcon(String activityIcon) {
        this.activityIcon = activityIcon;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Comment getTopComment() {
        return topComment;
    }

    public void setTopComment(Comment topComment) {
        this.topComment = topComment;
    }

    public Ugc getUgc() {
        return ugc;
    }

    public void setUgc(Ugc ugc) {
        this.ugc = ugc;
    }
}
