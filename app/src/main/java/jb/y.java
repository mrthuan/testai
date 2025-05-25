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
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: SyncTask.java */
/* loaded from: classes2.dex */
public final class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final long f19166a;

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f19167b;
    public final FirebaseMessaging c;

    /* compiled from: SyncTask.java */
    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public y f19168a;

        public a(y yVar) {
            this.f19168a = yVar;
        }

        public final void a() {
            if (!Log.isLoggable("FirebaseMessaging", 3) && Build.VERSION.SDK_INT == 23) {
                Log.isLoggable("FirebaseMessaging", 3);
            }
            this.f19168a.c.f13646d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            y yVar = this.f19168a;
            if (yVar == null || !yVar.a()) {
                return;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3) && Build.VERSION.SDK_INT == 23) {
                Log.isLoggable("FirebaseMessaging", 3);
            }
            y yVar2 = this.f19168a;
            yVar2.c.getClass();
            FirebaseMessaging.b(yVar2, 0L);
            this.f19168a.c.f13646d.unregisterReceiver(this);
            this.f19168a = null;
        }
    }

    @VisibleForTesting
    @SuppressLint({"InvalidWakeLockTag"})
    public y(FirebaseMessaging firebaseMessaging, long j10) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.c = firebaseMessaging;
        this.f19166a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f13646d.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f19167b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.c.f13646d.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    public final boolean b() {
        boolean z10 = true;
        try {
            if (this.c.a() == null) {
                return false;
            }
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z10 = false;
            }
            if (z10) {
                e10.getMessage();
                return false;
            } else if (e10.getMessage() == null) {
                return false;
            } else {
                throw e10;
            }
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public final void run() {
        w a10 = w.a();
        FirebaseMessaging firebaseMessaging = this.c;
        boolean c = a10.c(firebaseMessaging.f13646d);
        PowerManager.WakeLock wakeLock = this.f19167b;
        if (c) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f13654l = true;
                }
            } catch (IOException e10) {
                e10.getMessage();
                firebaseMessaging.f(false);
                if (!w.a().c(firebaseMessaging.f13646d)) {
                    return;
                }
            }
            if (!firebaseMessaging.f13653k.d()) {
                firebaseMessaging.f(false);
                if (w.a().c(firebaseMessaging.f13646d)) {
                    wakeLock.release();
                }
            } else if (w.a().b(firebaseMessaging.f13646d) && !a()) {
                new a(this).a();
                if (w.a().c(firebaseMessaging.f13646d)) {
                    wakeLock.release();
                }
            } else {
                if (b()) {
                    firebaseMessaging.f(false);
                } else {
                    firebaseMessaging.h(this.f19166a);
                }
                if (!w.a().c(firebaseMessaging.f13646d)) {
                    return;
                }
                wakeLock.release();
            }
        } catch (Throwable th2) {
            if (w.a().c(firebaseMessaging.f13646d)) {
                wakeLock.release();
            }
            throw th2;
        }
    }
}
