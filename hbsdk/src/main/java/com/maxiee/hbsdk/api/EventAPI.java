package com.maxiee.hbsdk.api;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

import com.maxiee.hbsdk.database.utils.EventUtils;
import com.maxiee.hbsdk.model.Event;

/**
 * Created by maxiee on 16/1/10.
 */
public class EventAPI {

    public static Event random(Context context) {
        ContentResolver resolver = context.getContentResolver();
        Uri uri = Uri.parse(Constant.API_EVENT_RANDOM);
        Cursor cursor = resolver.query(uri, null, null, null, null);
        if (cursor == null || cursor.getCount() < 1) return null;
        cursor.moveToNext();
        Event e = EventUtils.queryEvent(cursor);
        cursor.close();
        return e;
    }

    public static Event getEvent(Context context, long id) {
        ContentResolver resolver = context.getContentResolver();
        Uri uri = Uri.parse(Constant.API_EVENT_ID + String.valueOf(id));
        Cursor cursor = resolver.query(uri, null, null, null, null);
        if (cursor == null || cursor.getCount() < 1) return null;
        cursor.moveToNext();
        Event e = EventUtils.queryEvent(cursor);
        cursor.close();
        return e;
    }
}
