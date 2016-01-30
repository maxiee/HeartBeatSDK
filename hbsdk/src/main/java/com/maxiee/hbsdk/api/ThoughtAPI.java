package com.maxiee.hbsdk.api;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

import com.maxiee.hbsdk.database.utils.ThoughtUtils;
import com.maxiee.hbsdk.model.Thought;
import com.maxiee.hbsdk.model.ThoughtRes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maxiee on 16/1/30.
 */
public class ThoughtAPI {

    public static List<Thought> getThought(Context context, long eventId) {
        ContentResolver resolver = context.getContentResolver();
        Uri uri = Uri.parse(Constant.API_THOUGHT_EVENT_ID + String.valueOf(eventId));
        Cursor cursor = resolver.query(uri, null, null, null, null);
        if (cursor == null || cursor.getCount() < 1) return null;
        ArrayList<Thought> thoughtList = new ArrayList<>();
        Log.d("maxiee", String.valueOf(cursor.getCount()));
        while (cursor.moveToNext()) {
            thoughtList.add(ThoughtUtils.queryThought(cursor));
        }
        cursor.close();
        for (Thought t: thoughtList) {
            uri = Uri.parse(Constant.API_THOUGHT_RES_THOUGHT_ID + String.valueOf(t.getKey()));
            Cursor c = resolver.query(uri, null, null, null, null);
            if (c == null || c.getCount() < 1) {
                t.setTypeAndPath(Thought.HAS_NO_RES, "");
                continue;
            }
            ThoughtRes res = ThoughtUtils.queryThoughtRes(cursor);
            t.setTypeAndPath(res.getResType(), res.getPath());
            c.close();
        }
        return thoughtList;
    }
}
