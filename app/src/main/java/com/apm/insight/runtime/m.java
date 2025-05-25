package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private static MonitorCrash f6777a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f6778b = -1;
    private static int c;

    public static MonitorCrash a() {
        if (f6777a == null) {
            MonitorCrash initSDK = MonitorCrash.initSDK(com.apm.insight.i.g(), "239017", 1030842L, "1.3.8.nourl-alpha.22", "com.apm.insight");
            f6777a = initSDK;
            initSDK.config().setChannel("release");
        }
        return f6777a;
    }

    private static boolean b() {
        if (f6778b == -1) {
            f6778b = 5;
        }
        int i10 = c;
        if (i10 < f6778b) {
            c = i10 + 1;
            return true;
        }
        return false;
    }

    public static void a(Throwable th2, String str) {
        if (com.apm.insight.i.g() != null && b()) {
            a().reportCustomErr(str, "INNER", th2);
        }
    }
}
