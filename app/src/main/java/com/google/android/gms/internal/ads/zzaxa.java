package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaxa extends zzaxd {
    private final View zzh;

    public zzaxa(zzavp zzavpVar, String str, String str2, zzaro zzaroVar, int i10, int i11, View view) {
        super(zzavpVar, "fHaUCxrr3fcbpdQPVJw6OSoHeHoizr6wmxmAsnLvDUhuNG2u8ebKX4VPxAoXSx4W", "K/sgHSTVeE1LLZ4HP+m5KF6ND+k7W4ID3M3VTul8bAI=", zzaroVar, i10, 57);
        this.zzh = view;
    }

    @Override // com.google.android.gms.internal.ads.zzaxd
    public final void zza() {
        if (this.zzh != null) {
            zzbbn zzbbnVar = zzbbw.zzda;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            Boolean bool = (Boolean) zzbaVar.c.zza(zzbbnVar);
            Boolean bool2 = (Boolean) zzbaVar.c.zza(zzbbw.zzjZ);
            zzavt zzavtVar = new zzavt((String) this.zze.invoke(null, this.zzh, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzash zza = zzasi.zza();
            zza.zzb(zzavtVar.zza.longValue());
            zza.zzd(zzavtVar.zzb.longValue());
            zza.zze(zzavtVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzavtVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzavtVar.zzd.longValue());
            }
            this.zzd.zzY((zzasi) zza.zzbr());
        }
    }
}
