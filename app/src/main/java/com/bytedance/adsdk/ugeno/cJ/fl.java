package com.bytedance.adsdk.ugeno.cJ;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: ResourceHelp.java */
/* loaded from: classes.dex */
public final class fl {
    private static String Qhi;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: ac  reason: collision with root package name */
    private static Context f7872ac;
    private static Resources cJ;

    public static void Qhi(String str) {
        Qhi = str;
    }

    public static int cJ(Context context, String str) {
        return Qhi(context, str, "drawable");
    }

    private static String Qhi(Context context) {
        if (Qhi == null) {
            Qhi = context.getPackageName();
        }
        return Qhi;
    }

    private static int Qhi(Context context, String str, String str2) {
        if (cJ == null) {
            cJ = context.getResources();
        }
        return cJ.getIdentifier(str, str2, Qhi(context));
    }

    public static Drawable Qhi(Context context, String str) {
        return context.getResources().getDrawable(cJ(context, str));
    }
}
