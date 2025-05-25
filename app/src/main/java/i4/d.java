package i4;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.f;
import i4.b;

/* compiled from: DefaultConnectivityMonitor.java */
/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f18438a;

    /* renamed from: b  reason: collision with root package name */
    public final b.a f18439b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f18440d;

    /* renamed from: e  reason: collision with root package name */
    public final a f18441e = new a();

    /* compiled from: DefaultConnectivityMonitor.java */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            d dVar = d.this;
            boolean z10 = dVar.c;
            dVar.c = d.a(context);
            if (z10 != d.this.c) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    boolean z11 = d.this.c;
                }
                d dVar2 = d.this;
                f.b bVar = (f.b) dVar2.f18439b;
                if (dVar2.c) {
                    synchronized (com.bumptech.glide.f.this) {
                        bVar.f6864a.b();
                    }
                    return;
                }
                bVar.getClass();
            }
        }
    }

    public d(Context context, f.b bVar) {
        this.f18438a = context.getApplicationContext();
        this.f18439b = bVar;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        com.google.android.play.core.assetpacks.c.l(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
            return false;
        } catch (RuntimeException unused) {
            Log.isLoggable("ConnectivityMonitor", 5);
            return true;
        }
    }

    @Override // i4.g
    public final void onStart() {
        if (!this.f18440d) {
            Context context = this.f18438a;
            this.c = a(context);
            try {
                context.registerReceiver(this.f18441e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f18440d = true;
            } catch (SecurityException unused) {
                Log.isLoggable("ConnectivityMonitor", 5);
            }
        }
    }

    @Override // i4.g
    public final void onStop() {
        if (this.f18440d) {
            this.f18438a.unregisterReceiver(this.f18441e);
            this.f18440d = false;
        }
    }

    @Override // i4.g
    public final void onDestroy() {
    }
}
