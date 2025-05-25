package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import com.google.android.gms.internal.ads.zzfvh;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public class zzm {

    /* renamed from: a  reason: collision with root package name */
    public static final zzfvh f10370a = zzfvh.zza(4000);

    public static String a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length >= 4) {
            int lineNumber = stackTrace[3].getLineNumber();
            return str + " @" + lineNumber;
        }
        return str;
    }

    public static void b(String str) {
        if (g(3) && str != null && str.length() > 4000) {
            for (String str2 : f10370a.zzc(str)) {
            }
        }
    }

    public static void c(String str) {
        if (g(6) && str != null && str.length() > 4000) {
            for (String str2 : f10370a.zzc(str)) {
            }
        }
    }

    public static void d(String str) {
        if (g(4) && str != null && str.length() > 4000) {
            for (String str2 : f10370a.zzc(str)) {
            }
        }
    }

    public static void e(String str) {
        if (g(5) && str != null && str.length() > 4000) {
            for (String str2 : f10370a.zzc(str)) {
            }
        }
    }

    public static void f(String str, Exception exc) {
        if (g(5)) {
            if (exc != null) {
                a(str);
                g(5);
                return;
            }
            e(a(str));
        }
    }

    public static boolean g(int i10) {
        if (i10 < 5 && !Log.isLoggable("Ads", i10)) {
            return false;
        }
        return true;
    }
}
