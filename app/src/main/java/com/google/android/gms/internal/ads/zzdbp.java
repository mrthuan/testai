package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdbp implements zzczo {
    private int zza;
    private int zzb;

    public zzdbp() {
        zzbbn zzbbnVar = zzbbw.zzaX;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        this.zza = ((Integer) zzbaVar.c.zza(zzbbnVar)).intValue();
        this.zzb = ((Integer) zzbaVar.c.zza(zzbbw.zzlS)).intValue();
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final synchronized void zzdo(zzfex zzfexVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzaY)).booleanValue()) {
            try {
                zzfeo zzfeoVar = zzfexVar.zzb.zzb;
                this.zza = zzfeoVar.zzc;
                this.zzb = zzfeoVar.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdn(zzbvb zzbvbVar) {
    }
}
