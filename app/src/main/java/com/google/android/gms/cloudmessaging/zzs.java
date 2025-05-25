package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import d8.o;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import q7.c;
import q7.e;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final class zzs {

    /* renamed from: e  reason: collision with root package name */
    public static zzs f10858e;

    /* renamed from: a  reason: collision with root package name */
    public final Context f10859a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f10860b;
    public c c = new c(this);

    /* renamed from: d  reason: collision with root package name */
    public int f10861d = 1;

    public zzs(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f10860b = scheduledExecutorService;
        this.f10859a = context.getApplicationContext();
    }

    public static synchronized zzs a(Context context) {
        zzs zzsVar;
        synchronized (zzs.class) {
            if (f10858e == null) {
                com.google.android.gms.internal.cloudmessaging.zze.zza();
                f10858e = new zzs(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            }
            zzsVar = f10858e;
        }
        return zzsVar;
    }

    public final synchronized int b() {
        int i10;
        i10 = this.f10861d;
        this.f10861d = i10 + 1;
        return i10;
    }

    public final synchronized o c(e eVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            new StringBuilder(String.valueOf(eVar).length() + 9);
        }
        if (!this.c.d(eVar)) {
            c cVar = new c(this);
            this.c = cVar;
            cVar.d(eVar);
        }
        return eVar.f29092b.f11978a;
    }
}
