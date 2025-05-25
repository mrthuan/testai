package com.bytedance.sdk.openadsdk.cJ;

/* compiled from: AdEventRepertoryImpl.java */
/* loaded from: classes.dex */
public class fl {
    public static String Qhi() {
        return "CREATE TABLE IF NOT EXISTS adevent (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0 , channel INTEGER default 0)";
    }

    public static String cJ() {
        return "ALTER TABLE adevent ADD COLUMN encrypt INTEGER default 0";
    }
}
