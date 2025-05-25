package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.common.proguard.SideEffectFree;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class DeviceProperties {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f11372a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f11373b;
    public static Boolean c;

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f11374d;

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f11375e;

    /* renamed from: f  reason: collision with root package name */
    public static Boolean f11376f;

    private DeviceProperties() {
    }

    @KeepForSdk
    public static boolean a(Context context) {
        if (c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z10 = true;
            }
            c = Boolean.valueOf(z10);
        }
        return c.booleanValue();
    }

    @SideEffectFree
    @KeepForSdk
    @TargetApi(20)
    public static boolean b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f11372a == null) {
            f11372a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f11372a.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
        if (r0 != false) goto L10;
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    @android.annotation.TargetApi(26)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(android.content.Context r4) {
        /*
            boolean r0 = b(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L13
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r0 < r3) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 == 0) goto L25
        L13:
            boolean r4 = d(r4)
            if (r4 == 0) goto L26
            boolean r4 = com.google.android.gms.common.util.PlatformVersion.a()
            if (r4 == 0) goto L25
            boolean r4 = com.google.android.gms.common.util.PlatformVersion.b()
            if (r4 == 0) goto L26
        L25:
            return r1
        L26:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.DeviceProperties.c(android.content.Context):boolean");
    }

    @TargetApi(21)
    public static boolean d(Context context) {
        if (f11373b == null) {
            f11373b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f11373b.booleanValue();
    }
}
