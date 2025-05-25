package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class LifecycleCallback {
    @KeepForSdk

    /* renamed from: a  reason: collision with root package name */
    public final LifecycleFragment f10955a;

    @KeepForSdk
    public LifecycleCallback(LifecycleFragment lifecycleFragment) {
        this.f10955a = lifecycleFragment;
    }

    @KeepForSdk
    public static LifecycleFragment c(LifecycleActivity lifecycleActivity) {
        zzb zzbVar;
        zzd zzdVar;
        Activity activity = lifecycleActivity.f10954a;
        if (activity instanceof androidx.fragment.app.u) {
            androidx.fragment.app.u uVar = (androidx.fragment.app.u) activity;
            WeakHashMap weakHashMap = zzd.f11158b0;
            WeakReference weakReference = (WeakReference) weakHashMap.get(uVar);
            if (weakReference == null || (zzdVar = (zzd) weakReference.get()) == null) {
                try {
                    zzdVar = (zzd) uVar.getSupportFragmentManager().D("SupportLifecycleFragmentImpl");
                    if (zzdVar == null || zzdVar.f3680m) {
                        zzdVar = new zzd();
                        androidx.fragment.app.g0 supportFragmentManager = uVar.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                        aVar.c(0, zzdVar, "SupportLifecycleFragmentImpl", 1);
                        aVar.g();
                    }
                    weakHashMap.put(uVar, new WeakReference(zzdVar));
                } catch (ClassCastException e10) {
                    throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
                }
            }
            return zzdVar;
        } else if (activity instanceof Activity) {
            WeakHashMap weakHashMap2 = zzb.f11155d;
            WeakReference weakReference2 = (WeakReference) weakHashMap2.get(activity);
            if (weakReference2 == null || (zzbVar = (zzb) weakReference2.get()) == null) {
                try {
                    zzbVar = (zzb) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (zzbVar == null || zzbVar.isRemoving()) {
                        zzbVar = new zzb();
                        activity.getFragmentManager().beginTransaction().add(zzbVar, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap2.put(activity, new WeakReference(zzbVar));
                } catch (ClassCastException e11) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e11);
                }
            }
            return zzbVar;
        } else {
            throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
        }
    }

    @Keep
    private static LifecycleFragment getChimeraLifecycleFragmentImpl(LifecycleActivity lifecycleActivity) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @KeepForSdk
    public final Activity b() {
        Activity i10 = this.f10955a.i();
        Preconditions.j(i10);
        return i10;
    }

    @KeepForSdk
    public void f() {
    }

    @KeepForSdk
    public void g() {
    }

    @KeepForSdk
    public void i() {
    }

    @KeepForSdk
    public void j() {
    }

    @KeepForSdk
    public void e(Bundle bundle) {
    }

    @KeepForSdk
    public void h(Bundle bundle) {
    }

    @KeepForSdk
    public void d(int i10, int i11, Intent intent) {
    }

    @KeepForSdk
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
