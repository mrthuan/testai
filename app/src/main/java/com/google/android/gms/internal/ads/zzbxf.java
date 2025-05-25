package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbxf implements zzgcf {
    final /* synthetic */ y9.a zza;

    public zzbxf(zzbxg zzbxgVar, y9.a aVar) {
        this.zza = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        List list;
        list = zzbxg.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        Void r22 = (Void) obj;
        list = zzbxg.zzc;
        list.remove(this.zza);
    }
}
