package com.facebook.appevents;

import android.content.Context;
import java.util.UUID;

/* compiled from: AppEventsLogger.kt */
/* loaded from: classes.dex */
public final class k {
    public static String a(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        if (l.a() == null) {
            synchronized (l.c()) {
                if (l.a() == null) {
                    String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    if (!k6.a.b(l.class)) {
                        l.f9614f = string;
                    }
                    if (l.a() == null) {
                        String str = "XZ" + UUID.randomUUID();
                        if (!k6.a.b(l.class)) {
                            l.f9614f = str;
                        }
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", l.a()).apply();
                    }
                }
                tf.d dVar = tf.d.f30009a;
            }
        }
        String a10 = l.a();
        if (a10 != null) {
            return a10;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
