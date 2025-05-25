package com.pgl.ssdk.ces;

import android.content.Context;

/* loaded from: classes2.dex */
public final class a {
    public static native Object meta(int i10, Context context, Object obj);

    public static Object njss(int i10, Object obj) {
        try {
            c g10 = c.g();
            if (g10 == null) {
                return null;
            }
            return g10.a(i10, obj);
        } catch (Throwable unused) {
            return null;
        }
    }
}
