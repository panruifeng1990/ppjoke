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
public class Ugc implements Serializable {
    /**
     * likeCount : 118
     * shareCount : 10
     * commentCount : 10
     * hasFavorite : false
     * hasLiked : false
     * hasdiss : false
     * hasDissed : false
     */

    private int likeCount;
    private int shareCount;
    private int commentCount;
    private boolean hasFavorite;
    private boolean hasLiked;
    private boolean hasdiss;
    private boolean hasDissed;

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getShareCount() {
        return shareCount;
    }

    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public boolean isHasFavorite() {
        return hasFavorite;
    }

    public void setHasFavorite(boolean hasFavorite) {
        this.hasFavorite = hasFavorite;
    }

    public boolean isHasLiked() {
        return hasLiked;
    }

    public void setHasLiked(boolean hasLiked) {
        this.hasLiked = hasLiked;
    }

    public boolean isHasdiss() {
        return hasdiss;
    }

    public void setHasdiss(boolean hasdiss) {
        this.hasdiss = hasdiss;
    }

    public boolean isHasDissed() {
        return hasDissed;
    }

    public void setHasDissed(boolean hasDissed) {
        this.hasDissed = hasDissed;
    }
}
