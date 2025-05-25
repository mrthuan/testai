package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

/* loaded from: classes2.dex */
public abstract class P0 {
    public static boolean a(Context context, String url, A9 redirectionValidator, String api, A4 a42) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.g.e(api, "api");
        if (a42 != null) {
            ((B4) a42).c("AppstoreLinkHandler", "In appStoreLinkHandled");
        }
        if (url.length() != 0) {
            Uri parse = Uri.parse(url);
            if (kotlin.jvm.internal.g.a("market", parse.getScheme()) || kotlin.jvm.internal.g.a("play.google.com", parse.getHost()) || kotlin.jvm.internal.g.a("market.android.com", parse.getHost())) {
                Uri parse2 = Uri.parse(url);
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    if (!redirectionValidator.d()) {
                        redirectionValidator.a("EX_".concat(api));
                        return false;
                    }
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW", parse2);
                        intent.setPackage("com.android.vending");
                        intent.addFlags(268435456);
                        context.startActivity(intent);
                        if (a42 != null) {
                            ((B4) a42).c("AppstoreLinkHandler", "Playstore link handled successfully");
                        }
                        return true;
                    } catch (ActivityNotFoundException e10) {
                        if (a42 == null) {
                            return false;
                        }
                        ((B4) a42).c("AppstoreLinkHandler", "Error message in processing appStoreLinkHandling: " + e10.getMessage());
                        return false;
                    }
                } catch (PackageManager.NameNotFoundException e11) {
                    e11.printStackTrace();
                    int a10 = T2.a(context, url, redirectionValidator, api, a42);
                    if (a10 != 0 && a10 != 1) {
                        return false;
                    }
                    if (a42 != null) {
                        ((B4) a42).c("AppstoreLinkHandler", "Playstore link handled successfully");
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
