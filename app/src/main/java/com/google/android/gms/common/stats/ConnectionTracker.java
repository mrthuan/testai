package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class ConnectionTracker {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f11355b = new Object();
    public static volatile ConnectionTracker c;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f11356a = new ConcurrentHashMap();

    private ConnectionTracker() {
    }

    @KeepForSdk
    public static ConnectionTracker b() {
        if (c == null) {
            synchronized (f11355b) {
                if (c == null) {
                    c = new ConnectionTracker();
                }
            }
        }
        ConnectionTracker connectionTracker = c;
        Preconditions.j(connectionTracker);
        return connectionTracker;
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public final boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i10, null);
    }

    @KeepForSdk
    public final void c(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof zzt)) {
            ConcurrentHashMap concurrentHashMap = this.f11356a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        boolean bindService;
        boolean bindService2;
        ComponentName component = intent.getComponent();
        boolean z10 = false;
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((Wrappers.a(context).a(0, packageName).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        boolean z11 = true;
        if (!(serviceConnection instanceof zzt)) {
            ConcurrentHashMap concurrentHashMap = this.f11356a;
            ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
            }
            if (executor == null) {
                executor = null;
            }
            try {
                if (Build.VERSION.SDK_INT < 29) {
                    z11 = false;
                }
                if (z11 && executor != null) {
                    bindService2 = context.bindService(intent, i10, executor, serviceConnection);
                } else {
                    bindService2 = context.bindService(intent, serviceConnection, i10);
                }
                if (!bindService2) {
                    concurrentHashMap.remove(serviceConnection, serviceConnection);
                    return false;
                }
                return bindService2;
            } catch (Throwable th2) {
                concurrentHashMap.remove(serviceConnection, serviceConnection);
                throw th2;
            }
        }
        if (executor == null) {
            executor = null;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            z10 = true;
        }
        if (z10 && executor != null) {
            bindService = context.bindService(intent, i10, executor, serviceConnection);
            return bindService;
        }
        return context.bindService(intent, serviceConnection, i10);
    }
}
