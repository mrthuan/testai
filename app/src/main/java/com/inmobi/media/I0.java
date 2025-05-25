package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class I0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f14334a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f14335b;
    public static final String c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f14336d;

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap f14337e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public static final byte f14338f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    static {
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        PackageInfo packageInfo;
        long longVersionCode;
        String valueOf;
        byte b10 = 2;
        f14338f = (byte) 2;
        Context d10 = Ha.d();
        String str = null;
        if (d10 != null) {
            try {
                packageManager = d10.getPackageManager();
            } catch (Exception unused) {
            }
        } else {
            packageManager = null;
        }
        if (packageManager != null) {
            applicationInfo = packageManager.getApplicationInfo(d10.getPackageName(), 128);
        } else {
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            String str2 = applicationInfo.packageName;
            f14334a = str2;
            f14336d = applicationInfo.loadLabel(packageManager).toString();
            kotlin.jvm.internal.g.b(str2);
            f14335b = packageManager.getInstallerPackageName(str2);
        }
        if (packageManager != null) {
            packageInfo = packageManager.getPackageInfo(d10.getPackageName(), 128);
        } else {
            packageInfo = null;
        }
        if (packageInfo != null && ((str = packageInfo.versionName) == null || str.length() == 0)) {
            if (Build.VERSION.SDK_INT >= 28) {
                longVersionCode = packageInfo.getLongVersionCode();
                valueOf = String.valueOf(longVersionCode);
            } else {
                valueOf = String.valueOf(packageInfo.versionCode);
            }
            str = valueOf;
        }
        if (AbstractC1579c2.a(str)) {
            c = str;
        }
        try {
            if (C1566b3.z()) {
                b10 = !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            } else {
                b10 = 0;
            }
        } catch (Error | Exception unused2) {
        }
        f14338f = b10;
        String str3 = f14334a;
        if (str3 != null) {
            f14337e.put("u-appbid", str3);
        }
        String str4 = f14336d;
        if (str4 != null) {
            f14337e.put("u-appdnm", str4);
        }
        String str5 = c;
        if (str5 != null) {
            f14337e.put("u-appver", str5);
        }
        f14337e.put("u-appsecure", String.valueOf((int) b10));
    }
}
