package com.bytedance.sdk.component.Qhi;

import a0.a;
import a6.h;
import android.text.TextUtils;
import androidx.activity.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SerializeHelper.java */
/* loaded from: classes.dex */
public class CQU {
    private static boolean Qhi;

    public static String Qhi() {
        return "";
    }

    public static String Qhi(Throwable th2) {
        return h.g(new StringBuilder("{\"code\":"), th2 instanceof tP ? ((tP) th2).Qhi : 0, "}");
    }

    public static String Qhi(String str) {
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String e10 = Qhi ? r.e(str, 1, 1) : "";
        String concat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (!e10.isEmpty()) {
            return a.j(concat, ",", e10, "}");
        }
        return h.c(concat, "}");
    }

    public static void Qhi(boolean z10) {
        Qhi = z10;
    }
