package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.appcompat.widget.y0;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.TaskCompletionSource;
import d8.o;
import h5.k;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jb.f0;

/* compiled from: WithinAppServiceConnection.java */
/* loaded from: classes2.dex */
public final class c implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13666a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f13667b;
    public final ScheduledExecutorService c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f13668d;

    /* renamed from: e  reason: collision with root package name */
    public b f13669e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f13670f;

    /* compiled from: WithinAppServiceConnection.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f13671a;

        /* renamed from: b  reason: collision with root package name */
        public final TaskCompletionSource<Void> f13672b = new TaskCompletionSource<>();

        public a(Intent intent) {
            this.f13671a = intent;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public c(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f13668d = new ArrayDeque();
        this.f13670f = false;
        Context applicationContext = context.getApplicationContext();
        this.f13666a = applicationContext;
        this.f13667b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (com.google.android.gms.common.stats.ConnectionTracker.b().a(r4.f13666a, r4.f13667b, r4, 65) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 3
            android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L6b
        L7:
            java.util.ArrayDeque r0 = r4.f13668d     // Catch: java.lang.Throwable -> L6b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L69
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L6b
            com.google.firebase.messaging.b r0 = r4.f13669e     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L31
            boolean r0 = r0.isBinderAlive()     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L31
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L6b
            java.util.ArrayDeque r0 = r4.f13668d     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L6b
            com.google.firebase.messaging.c$a r0 = (com.google.firebase.messaging.c.a) r0     // Catch: java.lang.Throwable -> L6b
            com.google.firebase.messaging.b r2 = r4.f13669e     // Catch: java.lang.Throwable -> L6b
            r2.a(r0)     // Catch: java.lang.Throwable -> L6b
            goto L7
        L31:
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L6b
            boolean r0 = r4.f13670f     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L3b
            goto L67
        L3b:
            r0 = 1
            r4.f13670f = r0     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.b()     // Catch: java.lang.SecurityException -> L4f java.lang.Throwable -> L6b
            android.content.Context r1 = r4.f13666a     // Catch: java.lang.SecurityException -> L4f java.lang.Throwable -> L6b
            android.content.Intent r2 = r4.f13667b     // Catch: java.lang.SecurityException -> L4f java.lang.Throwable -> L6b
            r3 = 65
            boolean r0 = r0.a(r1, r2, r4, r3)     // Catch: java.lang.SecurityException -> L4f java.lang.Throwable -> L6b
            if (r0 == 0) goto L4f
            goto L67
        L4f:
            r0 = 0
            r4.f13670f = r0     // Catch: java.lang.Throwable -> L6b
        L52:
            java.util.ArrayDeque r0 = r4.f13668d     // Catch: java.lang.Throwable -> L6b
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L67
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L6b
            com.google.firebase.messaging.c$a r0 = (com.google.firebase.messaging.c.a) r0     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r0 = r0.f13672b     // Catch: java.lang.Throwable -> L6b
            r1 = 0
            r0.d(r1)     // Catch: java.lang.Throwable -> L6b
            goto L52
        L67:
            monitor-exit(r4)
            return
        L69:
            monitor-exit(r4)
            return
        L6b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.c.a():void");
    }

    public final synchronized o b(Intent intent) {
        a aVar;
        boolean z10;
        long j10;
        Log.isLoggable("FirebaseMessaging", 3);
        aVar = new a(intent);
        ScheduledExecutorService scheduledExecutorService = this.c;
        if ((aVar.f13671a.getFlags() & 268435456) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        y0 y0Var = new y0(aVar, 6);
        if (z10) {
            j10 = f0.f19126a;
        } else {
            j10 = 9000;
        }
        aVar.f13672b.f11978a.c(scheduledExecutorService, new k(scheduledExecutorService.schedule(y0Var, j10, TimeUnit.MILLISECONDS), 1));
        this.f13668d.add(aVar);
        a();
        return aVar.f13672b.f11978a;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        this.f13670f = false;
        if (!(iBinder instanceof b)) {
            Objects.toString(iBinder);
            while (true) {
                ArrayDeque arrayDeque = this.f13668d;
                if (!arrayDeque.isEmpty()) {
                    ((a) arrayDeque.poll()).f13672b.d(null);
                } else {
                    return;
                }
            }
        } else {
            this.f13669e = (b) iBinder;
            a();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        a();
    }
}
