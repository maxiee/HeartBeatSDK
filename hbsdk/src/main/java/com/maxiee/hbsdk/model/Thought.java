package com.maxiee.hbsdk.model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by maxiee on 15-6-16.
 */
public class Thought {
    public static final String THOUGHT_RES = "thought_res";
    public static final String THOUGHT_PATH = "thought_path";
    public static final int HAS_NO_RES = -1;
    public static final String HAS_NO_PATH = "";
    public static final int RES_IMAGE = 0;

    private long key;
    private String mThought;
    private long mTimeStamp;
    private int mResType = HAS_NO_RES;
    private String mResPath = "";

    public Thought(long key, String mThought, long mTimeStamp) {
        this.key = key;
        this.mThought = mThought;
        this.mTimeStamp = mTimeStamp;
    }

    public long getKey() {
        return key;
    }

    public String getThought() {
        return mThought;
    }

    public long getTimeStamp() {
        return mTimeStamp;
    }

    public void setThought(String mThought) {
        this.mThought = mThought;
    }

    public void setTypeAndPath(int resType, String path) {
        if (resType == HAS_NO_RES) return;
        mResType = resType;
        mResPath = path;
    }

    public boolean hasImage() { return mResType == RES_IMAGE; }

    public String getPath() { return mResPath; }

    public int getResType() { return mResType; }
}
