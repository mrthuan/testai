package com.bytedance.sdk.openadsdk.cJ;

/* compiled from: V3EventRepertoryImpl.java */
/* loaded from: classes.dex */
public class HzH extends fl {
    public static String ac() {
        return "CREATE TABLE IF NOT EXISTS adevent_applog (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0, channel INTEGER default 0)";
    }
}
