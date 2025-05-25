package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes2.dex */
public abstract class J2 {
    public static void a(Context context, u.e customTabsIntent, Uri uri, I1 i12, A9 redirectionValidator, String api) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(customTabsIntent, "customTabsIntent");
        Intent intent = customTabsIntent.f30089a;
        kotlin.jvm.internal.g.e(uri, "uri");
        kotlin.jvm.internal.g.e(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.g.e(api, "api");
        String a10 = O2.a(context);
        try {
            try {
                if (a10 == null) {
                    if (i12 != null) {
                        String uri2 = uri.toString();
                        kotlin.jvm.internal.g.d(uri2, "toString(...)");
                        i12.a(uri2, api);
                    }
                } else {
                    intent.setFlags(268435456);
                    intent.setPackage(a10);
                    intent.setData(uri);
                    androidx.core.content.a.startActivity(context, intent, null);
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            String uri3 = uri.toString();
            kotlin.jvm.internal.g.d(uri3, "toString(...)");
            AbstractC1551a2.a(context, uri3, redirectionValidator, api);
        }
    }
}
