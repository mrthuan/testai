package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class InstantApps {

    /* renamed from: a  reason: collision with root package name */
    public static Context f11389a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f11390b;

    @KeepForSdk
    public static synchronized boolean a(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (InstantApps.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f11389a;
            if (context2 != null && (bool = f11390b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f11390b = null;
            if (PlatformVersion.a()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f11390b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f11390b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f11390b = Boolean.FALSE;
                }
            }
            f11389a = applicationContext;
            return f11390b.booleanValue();
        }
    }
}
