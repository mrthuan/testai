package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzapd;
import com.google.android.gms.internal.ads.zzaph;
import com.google.android.gms.internal.ads.zzapn;
import com.google.android.gms.internal.ads.zzaqe;
import com.google.android.gms.internal.ads.zzbzt;
import java.util.Map;
import m7.g;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzbn extends zzaph {

    /* renamed from: a  reason: collision with root package name */
    public final zzbzt f10429a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.gms.ads.internal.util.client.zzl f10430b;

    public zzbn(String str, zzbzt zzbztVar) {
        super(0, str, new g(zzbztVar));
        this.f10429a = zzbztVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(0);
        this.f10430b = zzlVar;
        if (com.google.android.gms.ads.internal.util.client.zzl.c()) {
            zzlVar.d("onNetworkRequest", new com.google.android.gms.ads.internal.util.client.zzg(str, "GET", null, null));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaph
    public final zzapn zzh(zzapd zzapdVar) {
        return zzapn.zzb(zzapdVar, zzaqe.zzb(zzapdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaph
    public final void zzo(Object obj) {
        zzapd zzapdVar = (zzapd) obj;
        Map map = zzapdVar.zzc;
        int i10 = zzapdVar.zza;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = this.f10430b;
        zzlVar.getClass();
        if (com.google.android.gms.ads.internal.util.client.zzl.c()) {
            zzlVar.d("onNetworkResponse", new com.google.android.gms.ads.internal.util.client.zzj(i10, map));
            if (i10 < 200 || i10 >= 300) {
                zzlVar.d("onNetworkRequestError", new com.google.android.gms.ads.internal.util.client.zzi(null));
            }
        }
        byte[] bArr = zzapdVar.zzb;
        if (com.google.android.gms.ads.internal.util.client.zzl.c() && bArr != null) {
            zzlVar.d("onNetworkResponseBody", new com.google.android.gms.ads.internal.util.client.zzh(bArr));
        }
        this.f10429a.zzc(zzapdVar);
    }
}
