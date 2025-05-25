package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public class GooglePlayServicesUtilLight {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f10887b = false;
    public static boolean c = false;
    @KeepForSdk
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f10886a = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicBoolean f10888d = new AtomicBoolean();

    @ShowFirstParty
    @KeepForSdk
    public static boolean a(Context context) {
        if (!c) {
            try {
                PackageInfo c10 = Wrappers.a(context).c(64, "com.google.android.gms");
                GoogleSignatureVerifier.a(context);
                if (c10 != null && !GoogleSignatureVerifier.d(c10, false) && GoogleSignatureVerifier.d(c10, true)) {
                    f10887b = true;
                } else {
                    f10887b = false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } finally {
                c = true;
            }
        }
        if (!f10887b && "user".equals(Build.TYPE)) {
            return false;
        }
        return true;
    }

    @TargetApi(21)
    public static boolean b(Context context) {
        try {
            for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                if ("com.google.android.gms".equals(sessionInfo.getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
