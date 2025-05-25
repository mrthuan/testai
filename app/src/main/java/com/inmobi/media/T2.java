package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.ResolveInfo;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class T2 {
    public static int a(Context context, String url, A9 redirectionValidator, String api, A4 a42) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.g.e(api, "api");
        if (a42 != null) {
            ((B4) a42).c("DeeplinkHandler", "In appLinkOrDeepLinkHandled");
        }
        if (url.length() == 0) {
            if (a42 != null) {
                ((B4) a42).c("DeeplinkHandler", "AppLink url is Empty or null");
                return 2;
            }
            return 2;
        }
        ArrayList arrayList = new ArrayList();
        if (url.length() != 0) {
            List<ResolveInfo> queryIntentActivityOptions = context.getPackageManager().queryIntentActivityOptions(null, null, AbstractC1551a2.b(url), 0);
            kotlin.jvm.internal.g.d(queryIntentActivityOptions, "queryIntentActivityOptions(...)");
            for (ResolveInfo resolveInfo : queryIntentActivityOptions) {
                if (resolveInfo.activityInfo.exported) {
                    arrayList.add(resolveInfo);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            if (a42 != null) {
                ((B4) a42).c("DeeplinkHandler", "Resolve Info " + ((ResolveInfo) arrayList.get(0)).activityInfo.name);
            }
            try {
                return AbstractC1551a2.a(context, url, (ResolveInfo) arrayList.get(0), redirectionValidator, api);
            } catch (ActivityNotFoundException unused) {
                if (a42 == null) {
                    return 6;
                }
                ((B4) a42).b("DeeplinkHandler", "ActivityNotFoundException for url: ".concat(url));
                return 6;
            } catch (SecurityException unused2) {
                if (a42 != null) {
                    ((B4) a42).b("DeeplinkHandler", "SecurityException for url: ".concat(url));
                }
                return 12;
            }
        }
        if (a42 != null) {
            ((B4) a42).c("DeeplinkHandler", " Resolve Info Empty");
        }
        try {
            try {
                try {
                    return AbstractC1551a2.a(context, url, redirectionValidator, api);
                } catch (ActivityNotFoundException unused3) {
                    return 6;
                }
            } catch (URISyntaxException unused4) {
                return 5;
            }
        } catch (ActivityNotFoundException unused5) {
            AbstractC1551a2.a(context, url, null, redirectionValidator, api);
            return 0;
        }
    }
}
