package com.apm.insight.l;

/* loaded from: classes.dex */
public class t {
    public static boolean a(String str) {
        try {
            System.loadLibrary(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
