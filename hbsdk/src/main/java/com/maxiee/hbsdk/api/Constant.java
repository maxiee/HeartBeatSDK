package com.maxiee.hbsdk.api;

/**
 * Created by maxiee on 16/1/10.
 */
public class Constant {

    public static final String BASE_URI = "content://com.maxiee.heartbeat.provider/";
    public static final String CATEGORY_EVNET = "event/";
    public static final String CATEGORY_THOUGHT = "thought/";
    public static final String CATEGORY_THOUGHT_RES = "thought_res/";

    public static final String API_EVENT_RANDOM = BASE_URI + CATEGORY_EVNET + "random";
    public static final String API_EVENT_ID     = BASE_URI + CATEGORY_EVNET + "id/";
    public static final String API_THOUGHT_EVENT_ID = BASE_URI + CATEGORY_THOUGHT + "event_id/";
    public static final String API_THOUGHT_RES_THOUGHT_ID = BASE_URI + CATEGORY_THOUGHT_RES + "thought_id";
}
