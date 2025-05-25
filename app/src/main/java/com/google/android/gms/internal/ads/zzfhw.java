package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfhw {
    private final zzfhp zza;
    private final y9.a zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfhw(final zzfgu zzfguVar, final zzfho zzfhoVar, final zzfhp zzfhpVar) {
        this.zza = zzfhpVar;
        this.zzb = zzgcj.zzf(zzgcj.zzn(zzfhoVar.zza(zzfhpVar), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzfhu
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzfhw.this.zzb(zzfhoVar, zzfguVar, zzfhpVar, (zzfhd) obj);
            }
        }, zzfhpVar.zzb()), Exception.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzfhv
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzfhw.this.zzc(zzfhoVar, (Exception) obj);
            }
        }, zzfhpVar.zzb());
    }

    public final synchronized y9.a zza(zzfhp zzfhpVar) {
        if (!this.zzd && !this.zzc && this.zza.zza() != null && zzfhpVar.zza() != null && this.zza.zza().equals(zzfhpVar.zza())) {
            this.zzc = true;
            return this.zzb;
        }
        return null;
    }

    public final /* synthetic */ y9.a zzb(zzfho zzfhoVar, zzfgu zzfguVar, zzfhp zzfhpVar, zzfhd zzfhdVar) {
        synchronized (this) {
            this.zzd = true;
            zzfhoVar.zzb(zzfhdVar);
            if (!this.zzc) {
                zzfguVar.zzd(zzfhpVar.zza(), zzfhdVar);
                return zzgcj.zzh(null);
            }
            return zzgcj.zzh(new zzfhn(zzfhdVar, zzfhpVar));
        }
    }

    public final /* synthetic */ y9.a zzc(zzfho zzfhoVar, Exception exc) {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzgcf zzgcfVar) {
        zzgcj.zzr(zzgcj.zzn(this.zzb, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzfht
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                zzfhn zzfhnVar = (zzfhn) obj;
                return zzgcj.zzi();
            }
        }, this.zza.zzb()), zzgcfVar, this.zza.zzb());
    }
}
