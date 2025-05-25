package com.bytedance.sdk.openadsdk.cJ;

/* compiled from: HighPriorityEventRepertoryImpl.java */
/* loaded from: classes.dex */
public class WAv extends fl {
    public static String CJ() {
        return "ALTER TABLE loghighpriority ADD COLUMN encrypt INTEGER default 0";
    }

    public static String ac() {
        return "CREATE TABLE IF NOT EXISTS loghighpriority (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
