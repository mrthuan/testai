package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class l extends GmsClientSupervisor {

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f11256d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final Context f11257e;

    /* renamed from: f  reason: collision with root package name */
    public volatile com.google.android.gms.internal.common.zzi f11258f;

    /* renamed from: g  reason: collision with root package name */
    public final ConnectionTracker f11259g;

    /* renamed from: h  reason: collision with root package name */
    public final long f11260h;

    /* renamed from: i  reason: collision with root package name */
    public final long f11261i;

    /* renamed from: j  reason: collision with root package name */
    public volatile Executor f11262j;

    public l(Context context, Looper looper) {
        k kVar = new k(this);
        this.f11257e = context.getApplicationContext();
        this.f11258f = new com.google.android.gms.internal.common.zzi(looper, kVar);
        this.f11259g = ConnectionTracker.b();
        this.f11260h = TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL;
        this.f11261i = 300000L;
        this.f11262j = null;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final void c(zzo zzoVar, zze zzeVar) {
        synchronized (this.f11256d) {
            try {
                j jVar = (j) this.f11256d.get(zzoVar);
                if (jVar != null) {
                    if (jVar.f11249a.containsKey(zzeVar)) {
                        jVar.f11249a.remove(zzeVar);
                        if (jVar.f11249a.isEmpty()) {
                            this.f11258f.sendMessageDelayed(this.f11258f.obtainMessage(0, zzoVar), this.f11260h);
                        }
                    } else {
                        throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(zzoVar.toString()));
                    }
                } else {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(zzoVar.toString()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final boolean d(zzo zzoVar, zze zzeVar, String str, Executor executor) {
        boolean z10;
        synchronized (this.f11256d) {
            try {
                j jVar = (j) this.f11256d.get(zzoVar);
                if (executor == null) {
                    executor = this.f11262j;
                }
                if (jVar == null) {
                    jVar = new j(this, zzoVar);
                    jVar.f11249a.put(zzeVar, zzeVar);
                    jVar.a(str, executor);
                    this.f11256d.put(zzoVar, jVar);
                } else {
                    this.f11258f.removeMessages(0, zzoVar);
                    if (!jVar.f11249a.containsKey(zzeVar)) {
                        jVar.f11249a.put(zzeVar, zzeVar);
                        int i10 = jVar.f11250b;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                jVar.a(str, executor);
                            }
                        } else {
                            zzeVar.onServiceConnected(jVar.f11253f, jVar.f11251d);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(zzoVar.toString()));
                    }
                }
                z10 = jVar.c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }
}
