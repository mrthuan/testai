package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdfc;
import com.google.android.gms.internal.ads.zzdsf;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzm implements zzdfc {

    /* renamed from: a  reason: collision with root package name */
    public final zzdsf f10743a;

    /* renamed from: b  reason: collision with root package name */
    public final zzl f10744b;
    public final String c;

    public zzm(zzdsf zzdsfVar, zzl zzlVar, String str) {
        this.f10743a = zzdsfVar;
        this.f10744b = zzlVar;
        this.c = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdfc
    public final void zze(zzay zzayVar) {
        if (zzayVar == null) {
            return;
        }
        zzl zzlVar = this.f10744b;
        String str = this.c;
        zzdsf zzdsfVar = this.f10743a;
        String str2 = zzayVar.f10694b;
        synchronized (zzlVar) {
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            zzlVar.f10738e.put(str, new zzk(Long.valueOf(System.currentTimeMillis()), str2, new HashSet()));
            zzlVar.g();
            zzlVar.e(zzdsfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfc
    public final void zzf(String str) {
    }
}
