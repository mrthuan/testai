package com.google.android.gms.common.wrappers;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class PackageManagerWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11391a;

    public PackageManagerWrapper(Context context) {
        this.f11391a = context;
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public final ApplicationInfo a(int i10, String str) {
        return this.f11391a.getPackageManager().getApplicationInfo(str, i10);
    }

    @KeepForSdk
    public final CharSequence b(String str) {
        Context context = this.f11391a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public final PackageInfo c(int i10, String str) {
        return this.f11391a.getPackageManager().getPackageInfo(str, i10);
    }

    @KeepForSdk
    public final boolean d() {
        String nameForUid;
        boolean isInstantApp;
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.f11391a;
        if (callingUid == myUid) {
            return InstantApps.a(context);
        }
        if (PlatformVersion.a() && (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            isInstantApp = context.getPackageManager().isInstantApp(nameForUid);
            return isInstantApp;
        }
        return false;
    }
}
