package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class j implements ServiceConnection, zzt {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f11249a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f11250b = 2;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public IBinder f11251d;

    /* renamed from: e  reason: collision with root package name */
    public final zzo f11252e;

    /* renamed from: f  reason: collision with root package name */
    public ComponentName f11253f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ l f11254g;

    public j(l lVar, zzo zzoVar) {
        this.f11254g = lVar;
        this.f11252e = zzoVar;
    }

    public final void a(String str, Executor executor) {
        boolean z10;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f11250b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            l lVar = this.f11254g;
            ConnectionTracker connectionTracker = lVar.f11259g;
            Context context = lVar.f11257e;
            boolean d10 = connectionTracker.d(context, str, this.f11252e.a(context), this, 4225, executor);
            this.c = d10;
            if (d10) {
                this.f11254g.f11258f.sendMessageDelayed(this.f11254g.f11258f.obtainMessage(1, this.f11252e), this.f11254g.f11261i);
            } else {
                this.f11250b = 2;
                try {
                    l lVar2 = this.f11254g;
                    lVar2.f11259g.c(lVar2.f11257e, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f11254g.f11256d) {
            this.f11254g.f11258f.removeMessages(1, this.f11252e);
            this.f11251d = iBinder;
            this.f11253f = componentName;
            for (ServiceConnection serviceConnection : this.f11249a.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f11250b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f11254g.f11256d) {
            this.f11254g.f11258f.removeMessages(1, this.f11252e);
            this.f11251d = null;
            this.f11253f = componentName;
            for (ServiceConnection serviceConnection : this.f11249a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f11250b = 2;
        }
    }
}
