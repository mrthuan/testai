package v2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import o2.h;

/* compiled from: NetworkStateTracker.java */
/* loaded from: classes.dex */
public final class e extends d<t2.b> {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f30490j = 0;

    /* renamed from: g  reason: collision with root package name */
    public final ConnectivityManager f30491g;

    /* renamed from: h  reason: collision with root package name */
    public final b f30492h;

    /* renamed from: i  reason: collision with root package name */
    public final a f30493i;

    /* compiled from: NetworkStateTracker.java */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                h c = h.c();
                int i10 = e.f30490j;
                c.a(new Throwable[0]);
                e eVar = e.this;
                eVar.c(eVar.f());
            }
        }
    }

    /* compiled from: NetworkStateTracker.java */
    /* loaded from: classes.dex */
    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            h c = h.c();
            int i10 = e.f30490j;
            String.format("Network capabilities changed: %s", networkCapabilities);
            c.a(new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            h c = h.c();
            int i10 = e.f30490j;
            c.a(new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }
    }

    static {
        h.e("NetworkStateTracker");
    }

    public e(Context context, z2.a aVar) {
        super(context, aVar);
        boolean z10;
        this.f30491g = (ConnectivityManager) this.f30485b.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f30492h = new b();
        } else {
            this.f30493i = new a();
        }
    }

    @Override // v2.d
    public final t2.b a() {
        return f();
    }

    @Override // v2.d
    public final void d() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            try {
                h.c().a(new Throwable[0]);
                this.f30491g.registerDefaultNetworkCallback(this.f30492h);
                return;
            } catch (IllegalArgumentException | SecurityException e10) {
                h.c().b(e10);
                return;
            }
        }
        h.c().a(new Throwable[0]);
        this.f30485b.registerReceiver(this.f30493i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // v2.d
    public final void e() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            try {
                h.c().a(new Throwable[0]);
                this.f30491g.unregisterNetworkCallback(this.f30492h);
                return;
            } catch (IllegalArgumentException | SecurityException e10) {
                h.c().b(e10);
                return;
            }
        }
        h.c().a(new Throwable[0]);
        this.f30485b.unregisterReceiver(this.f30493i);
    }

    public final t2.b f() {
        boolean z10;
        boolean z11;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.f30491g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z12 = true;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e10) {
            h.c().b(e10);
        }
        if (networkCapabilities != null) {
            if (networkCapabilities.hasCapability(16)) {
                z11 = true;
                boolean a10 = r0.a.a(connectivityManager);
                if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                    z12 = false;
                }
                return new t2.b(z10, z11, a10, z12);
            }
        }
        z11 = false;
        boolean a102 = r0.a.a(connectivityManager);
        if (activeNetworkInfo != null) {
        }
        z12 = false;
        return new t2.b(z10, z11, a102, z12);
    }
}
