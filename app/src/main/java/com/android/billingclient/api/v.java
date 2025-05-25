package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzhd;
import com.google.android.gms.internal.play_billing.zzhe;
import com.google.android.gms.internal.play_billing.zzhl;
import com.google.android.gms.internal.play_billing.zzr;
import com.inmobi.commons.core.configs.CrashConfig;
import y4.a;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class v implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6285a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final d f6286b;
    public final /* synthetic */ c c;

    public /* synthetic */ v(c cVar, a.b bVar) {
        this.c = cVar;
        this.f6286b = bVar;
    }

    public final void a(f fVar) {
        synchronized (this.f6285a) {
            d dVar = this.f6286b;
            if (dVar != null) {
                dVar.d(fVar);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzb.zzj("BillingClient", "Billing service connected.");
        this.c.f6187g = zzr.zzu(iBinder);
        t tVar = new t(this, 0);
        u uVar = new u(this, 0);
        c cVar = this.c;
        if (cVar.C(tVar, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, uVar, cVar.k()) == null) {
            c cVar2 = this.c;
            f A = cVar2.A();
            cVar2.D(w.a(25, 6, A));
            a(A);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzb.zzk("BillingClient", "Billing service disconnected.");
        x xVar = this.c.f6186f;
        zzhl zzz = zzhl.zzz();
        wk.g gVar = (wk.g) xVar;
        gVar.getClass();
        if (zzz != null) {
            try {
                zzhd zzy = zzhe.zzy();
                zzy.zzn((zzgu) gVar.f31333a);
                zzy.zzo(zzz);
                ((z) gVar.f31334b).a((zzhe) zzy.zzf());
            } catch (Throwable th2) {
                zzb.zzl("BillingLogger", "Unable to log.", th2);
            }
        }
        this.c.f6187g = null;
        this.c.f6182a = 0;
        synchronized (this.f6285a) {
            d dVar = this.f6286b;
            if (dVar != null) {
                dVar.e();
            }
        }
    }
}
