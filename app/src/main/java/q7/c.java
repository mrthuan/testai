package q7;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzh;
import com.google.android.gms.cloudmessaging.zzq;
import com.google.android.gms.cloudmessaging.zzs;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import q7.c;
import q7.e;
import w4.a;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final class c implements ServiceConnection {
    public w4.a c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ zzs f29090f;

    /* renamed from: a  reason: collision with root package name */
    public int f29086a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Messenger f29087b = new Messenger(new zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzf
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            c cVar = c.this;
            int i10 = message.arg1;
            Log.isLoggable("MessengerIpcClient", 3);
            synchronized (cVar) {
                e<?> eVar = cVar.f29089e.get(i10);
                if (eVar != null) {
                    cVar.f29089e.remove(i10);
                    cVar.c();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        eVar.c(new zzq(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    eVar.a(data);
                    return true;
                }
                return true;
            }
        }
    }));

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f29088d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray<e<?>> f29089e = new SparseArray<>();

    public /* synthetic */ c(zzs zzsVar) {
        this.f29090f = zzsVar;
    }

    public final synchronized void a(int i10, String str) {
        b(i10, str, null);
    }

    public final synchronized void b(int i10, String str, SecurityException securityException) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Disconnected: ".concat(valueOf);
            }
        }
        int i11 = this.f29086a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f29086a = 4;
                return;
            }
            Log.isLoggable("MessengerIpcClient", 2);
            this.f29086a = 4;
            ConnectionTracker.b().c(this.f29090f.f10859a, this);
            zzq zzqVar = new zzq(i10, str, securityException);
            Iterator it = this.f29088d.iterator();
            while (it.hasNext()) {
                ((e) it.next()).c(zzqVar);
            }
            this.f29088d.clear();
            for (int i12 = 0; i12 < this.f29089e.size(); i12++) {
                this.f29089e.valueAt(i12).c(zzqVar);
            }
            this.f29089e.clear();
            return;
        }
        throw new IllegalStateException();
    }

    public final synchronized void c() {
        if (this.f29086a == 2 && this.f29088d.isEmpty() && this.f29089e.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.f29086a = 3;
            ConnectionTracker.b().c(this.f29090f.f10859a, this);
        }
    }

    public final synchronized boolean d(e<?> eVar) {
        boolean z10;
        int i10 = this.f29086a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return false;
                }
                this.f29088d.add(eVar);
                this.f29090f.f10860b.execute(new zzh(this));
                return true;
            }
            this.f29088d.add(eVar);
            return true;
        }
        this.f29088d.add(eVar);
        if (this.f29086a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.m(z10);
        Log.isLoggable("MessengerIpcClient", 2);
        this.f29086a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!ConnectionTracker.b().a(this.f29090f.f10859a, intent, this, 1)) {
                a(0, "Unable to bind to service");
            } else {
                this.f29090f.f10860b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        c cVar = c.this;
                        synchronized (cVar) {
                            if (cVar.f29086a == 1) {
                                cVar.a(1, "Timed out while binding");
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e10) {
            b(0, "Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f29090f.f10860b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzj
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                IBinder iBinder2 = iBinder;
                synchronized (cVar) {
                    try {
                        if (iBinder2 == null) {
                            cVar.a(0, "Null service connection");
                            return;
                        }
                        try {
                            cVar.c = new a(iBinder2);
                            cVar.f29086a = 2;
                            cVar.f29090f.f10860b.execute(new zzh(cVar));
                        } catch (RemoteException e10) {
                            cVar.a(0, e10.getMessage());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f29090f.f10860b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzg
            @Override // java.lang.Runnable
            public final void run() {
                c.this.a(2, "Service disconnected");
            }
        });
    }
}
