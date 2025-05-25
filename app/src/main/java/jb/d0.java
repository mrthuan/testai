package jb;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: TopicsSyncTask.java */
/* loaded from: classes2.dex */
public final class d0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f19115f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static Boolean f19116g;

    /* renamed from: h  reason: collision with root package name */
    public static Boolean f19117h;

    /* renamed from: a  reason: collision with root package name */
    public final Context f19118a;

    /* renamed from: b  reason: collision with root package name */
    public final p f19119b;
    public final PowerManager.WakeLock c;

    /* renamed from: d  reason: collision with root package name */
    public final c0 f19120d;

    /* renamed from: e  reason: collision with root package name */
    public final long f19121e;

    /* compiled from: TopicsSyncTask.java */
    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public d0 f19122a;

        public a(d0 d0Var, d0 d0Var2) {
            this.f19122a = d0Var2;
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            d0 d0Var = this.f19122a;
            if (d0Var == null) {
                return;
            }
            Object obj = d0.f19115f;
            if (!d0Var.c()) {
                return;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3) && Build.VERSION.SDK_INT == 23) {
                Log.isLoggable("FirebaseMessaging", 3);
            }
            d0 d0Var2 = this.f19122a;
            d0Var2.f19120d.f19110f.schedule(d0Var2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.f19122a = null;
        }
    }

    public d0(c0 c0Var, Context context, p pVar, long j10) {
        this.f19120d = c0Var;
        this.f19118a = context;
        this.f19121e = j10;
        this.f19119b = pVar;
        this.c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f19115f) {
            Boolean bool = f19117h;
            if (bool == null) {
                if (bool != null) {
                    booleanValue = bool.booleanValue();
                } else {
                    if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                        booleanValue = true;
                    } else {
                        booleanValue = false;
                    }
                    if (!booleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                }
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f19117h = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    public static boolean b(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f19115f) {
            Boolean bool = f19116g;
            if (bool == null) {
                if (bool != null) {
                    booleanValue = bool.booleanValue();
                } else {
                    if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                        booleanValue = true;
                    } else {
                        booleanValue = false;
                    }
                    if (!booleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                }
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f19116g = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    public final synchronized boolean c() {
        NetworkInfo networkInfo;
        boolean z10;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f19118a.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null) {
            if (networkInfo.isConnected()) {
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        c0 c0Var = this.f19120d;
        Context context = this.f19118a;
        boolean b10 = b(context);
        PowerManager.WakeLock wakeLock = this.c;
        if (b10) {
            wakeLock.acquire(f.f19125a);
        }
        try {
            try {
                synchronized (c0Var) {
                    c0Var.f19111g = true;
                }
            } catch (IOException e10) {
                e10.getMessage();
                c0Var.f(false);
                if (!b(context)) {
                    return;
                }
            }
            if (!this.f19119b.d()) {
                c0Var.f(false);
                if (b(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                    }
                }
            } else if (a(context) && !c()) {
                a aVar = new a(this, this);
                if (!Log.isLoggable("FirebaseMessaging", 3) && Build.VERSION.SDK_INT == 23) {
                    Log.isLoggable("FirebaseMessaging", 3);
                }
                context.registerReceiver(aVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                if (b(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused2) {
                    }
                }
            } else {
                if (c0Var.g()) {
                    c0Var.f(false);
                } else {
                    c0Var.h(this.f19121e);
                }
                if (!b(context)) {
                    return;
                }
                try {
                    wakeLock.release();
                } catch (RuntimeException unused3) {
                }
            }
        } catch (Throwable th2) {
            if (b(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                }
            }
            throw th2;
        }
    }
}
