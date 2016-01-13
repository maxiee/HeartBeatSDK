package com.maxiee.hbsdk.database.table;

/**
 * Created by maxiee on 15-7-11.
 */
public class CrashTable {

    public static final String NAME = "crashes";

    public static final String ID = "id";

    public static final String LOG = "log";

    public static final String TIMESTAMP = "timestamp";

    public static final String CREATE = "create table " + NAME
            + "("
            + ID + " integer primary key autoincrement,"
            + LOG + " text,"
            + TIMESTAMP + " integer"
            + ");";
}
