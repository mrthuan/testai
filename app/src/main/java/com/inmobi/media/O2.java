package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class O2 {

    /* renamed from: a  reason: collision with root package name */
    public static String f14539a;

    public static final String a(Context context) {
        if (context != null && f14539a == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com"));
                ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                String str = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                kotlin.jvm.internal.g.d(queryIntentActivities, "queryIntentActivities(...)");
                ArrayList arrayList = new ArrayList();
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    Intent intent2 = new Intent();
                    intent2.setAction("android.support.customtabs.action.CustomTabsService");
                    intent2.setPackage(resolveInfo.activityInfo.packageName);
                    if (packageManager.resolveService(intent2, 0) != null) {
                        String packageName = resolveInfo.activityInfo.packageName;
                        kotlin.jvm.internal.g.d(packageName, "packageName");
                        arrayList.add(packageName);
                    }
                }
                if (arrayList.isEmpty()) {
                    f14539a = null;
                } else if (arrayList.size() == 1) {
                    f14539a = (String) arrayList.get(0);
                } else if (!TextUtils.isEmpty(str) && !a(context, intent) && kotlin.collections.m.o0(arrayList, str)) {
                    f14539a = str;
                } else if (arrayList.contains("com.android.chrome")) {
                    f14539a = "com.android.chrome";
                } else if (arrayList.contains("com.chrome.beta")) {
                    f14539a = "com.chrome.beta";
                } else if (arrayList.contains("com.chrome.dev")) {
                    f14539a = "com.chrome.dev";
                } else if (arrayList.contains("com.google.android.apps.chrome")) {
                    f14539a = "com.google.android.apps.chrome";
                }
            } catch (Exception unused) {
            }
            return f14539a;
        }
        return f14539a;
    }

    public static boolean a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            kotlin.jvm.internal.g.d(queryIntentActivities, "queryIntentActivities(...)");
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException unused) {
            return false;
        }
    }
}
