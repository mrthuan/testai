package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzdkz implements zzgcf {
    final /* synthetic */ zzdla zza;

    public zzdkz(zzdla zzdlaVar) {
        this.zza = zzdlaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeI)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    /* renamed from: zzc */
    public final void zzb(List list) {
        try {
            zzcej zzcejVar = (zzcej) list.get(0);
            if (zzcejVar != null) {
                this.zza.zzb(zzcejVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e10) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeI)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "omid native display exp");
            }
        }
    }
}
