package com.bytedance.sdk.openadsdk.cJ;

/* compiled from: StatsEventRepertoryImpl.java */
/* loaded from: classes.dex */
public class pA {
    public static String Qhi() {
        return "CREATE TABLE IF NOT EXISTS logstats (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , encrypt INTEGER default 0 , retry INTEGER default 0)";
    }

    public static String cJ() {
        return "ALTER TABLE logstats ADD COLUMN encrypt INTEGER default 0";
    }
}
