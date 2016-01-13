package com.maxiee.hbsdk.database.utils;

import android.database.Cursor;

/**
 * Created by maxiee on 15/11/10.
 */
public class DatabaseUtils {

//    public static DatabaseHelper getDatabaseHelper(Context context) {
//        return DatabaseHelper.instance(context);
//    }
//
//    public static SQLiteDatabase getWritableDatabase(Context context) {
//        return getDatabaseHelper(context).getWritableDatabase();
//    }
//
//    public static SQLiteDatabase getReadableDatabase(Context context) {
//        return getDatabaseHelper(context).getReadableDatabase();
//    }

//    public static long add(Context context, String table, ContentValues values) {
//        SQLiteDatabase db = getWritableDatabase(context);
//        db.beginTransaction();
//        long id = db.insert(table, null, values);
//        db.setTransactionSuccessful();
//        db.endTransaction();
//        return id;
//    }
//
//    public static void update(Context context, String table, ContentValues values, String whereClause, String[] args) {
//        getWritableDatabase(context).update(table, values, whereClause, args);
//    }
//
//    public static void delete(Context context, String table, String whereClause, String[] args) {
//        getWritableDatabase(context).delete(table, whereClause, args);
//    }
//
//    public static Cursor queryAll(Context context,String table, String[] columns) {
//        return getReadableDatabase(context).query(table, columns, null, null, null, null, null);
//    }
//
//    public static Cursor queryAllOrderDesc(Context context, String table, String[] columns, String orderBy) {
//        return getReadableDatabase(context).query(table, columns, null, null, null, null, orderBy + " DESC");
//    }
//
//    public static Cursor query(Context context, String table, String[] columns, String selection, String[] args) {
//        return getReadableDatabase(context).query(table, columns, selection, args, null, null, null);
//    }
//
//    public static Cursor queryOrderDesc(Context context, String table, String[] columns, String selection, String[] args, String orderBy) {
//        return getReadableDatabase(context).query(table, columns, selection, args, null, null, orderBy + " DESC");
//    }

    public static int getInt(Cursor cursor, String column) {
        return cursor.getInt(cursor.getColumnIndex(column));
    }

    public static long getLong(Cursor cursor, String column) {
        return cursor.getLong(cursor.getColumnIndex(column));
    }

    public static String getString(Cursor cursor, String column) {
        return cursor.getString(cursor.getColumnIndex(column));
    }
}
