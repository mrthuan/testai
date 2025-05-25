package com.bytedance.sdk.openadsdk.cJ;

/* compiled from: StatsBatchEventRepertoryImpl.java */
/* loaded from: classes.dex */
public class iMK {
    public static String Qhi() {
        return "CREATE TABLE IF NOT EXISTS logstatsbatch (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public static String cJ() {
        return "ALTER TABLE logstatsbatch ADD COLUMN encrypt INTEGER default 0";
    }
}
