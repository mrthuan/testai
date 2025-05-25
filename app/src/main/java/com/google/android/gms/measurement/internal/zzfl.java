package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.api.internal.r0;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzfl implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final String f11742a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzfm f11743b;

    public zzfl(zzfm zzfmVar, String str) {
        this.f11743b = zzfmVar;
        this.f11742a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzfm zzfmVar = this.f11743b;
        if (iBinder != null) {
            try {
                com.google.android.gms.internal.measurement.zzbr zzb = com.google.android.gms.internal.measurement.zzbq.zzb(iBinder);
                if (zzb == null) {
                    zzeu zzeuVar = zzfmVar.f11744a.f11780i;
                    zzge.f(zzeuVar);
                    zzeuVar.f11715i.a("Install Referrer Service implementation was not found");
                    return;
                }
                zzeu zzeuVar2 = zzfmVar.f11744a.f11780i;
                zzge.f(zzeuVar2);
                zzeuVar2.f11720n.a("Install Referrer Service connected");
                zzgb zzgbVar = zzfmVar.f11744a.f11781j;
                zzge.f(zzgbVar);
                zzgbVar.u(new r0(1, this, zzb, this));
                return;
            } catch (RuntimeException e10) {
                zzeu zzeuVar3 = zzfmVar.f11744a.f11780i;
                zzge.f(zzeuVar3);
                zzeuVar3.f11715i.b(e10, "Exception occurred while calling Install Referrer API");
                return;
            }
        }
        zzeu zzeuVar4 = zzfmVar.f11744a.f11780i;
        zzge.f(zzeuVar4);
        zzeuVar4.f11715i.a("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzeu zzeuVar = this.f11743b.f11744a.f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11720n.a("Install Referrer Service disconnected");
    }
}
