package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbc;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdra implements zzczo, zzcye, zzcwt, zzcxk, com.google.android.gms.ads.internal.client.zza, zzdca {
    private final zzbav zza;
    private boolean zzb = false;

    public zzdra(zzbav zzbavVar, zzfcg zzfcgVar) {
        this.zza = zzbavVar;
        zzbavVar.zzc(2);
        if (zzfcgVar != null) {
            zzbavVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (!this.zzb) {
            this.zza.zzc(7);
            this.zzb = true;
            return;
        }
        this.zza.zzc(8);
    }

    @Override // com.google.android.gms.internal.ads.zzcwt
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.f10146a) {
            case 1:
                this.zza.zzc(101);
                return;
            case 2:
                this.zza.zzc(102);
                return;
            case 3:
                this.zza.zzc(5);
                return;
            case 4:
                this.zza.zzc(103);
                return;
            case 5:
                this.zza.zzc(104);
                return;
            case 6:
                this.zza.zzc(105);
                return;
            case 7:
                this.zza.zzc(106);
                return;
            default:
                this.zza.zzc(4);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdo(final zzfex zzfexVar) {
        this.zza.zzb(new zzbau() { // from class: com.google.android.gms.internal.ads.zzdqw
            @Override // com.google.android.gms.internal.ads.zzbau
            public final void zza(zzbbc.zzt.zza zzaVar) {
                zzbbc.zza.zzb zzbM = zzaVar.zze().zzbM();
                zzbbc.zzi.zza zzbM2 = zzaVar.zze().zzad().zzbM();
                zzbM2.zzo(zzfex.this.zzb.zzb.zzb);
                zzbM.zzT(zzbM2);
                zzaVar.zzG(zzbM);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzh() {
        this.zza.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzi(final zzbbc.zzb zzbVar) {
        this.zza.zzb(new zzbau() { // from class: com.google.android.gms.internal.ads.zzdqz
            @Override // com.google.android.gms.internal.ads.zzbau
            public final void zza(zzbbc.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbbc.zzb.this);
            }
        });
        this.zza.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzj(final zzbbc.zzb zzbVar) {
        this.zza.zzb(new zzbau() { // from class: com.google.android.gms.internal.ads.zzdqx
            @Override // com.google.android.gms.internal.ads.zzbau
            public final void zza(zzbbc.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbbc.zzb.this);
            }
        });
        this.zza.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzl(boolean z10) {
        int i10;
        if (true != z10) {
            i10 = 1108;
        } else {
            i10 = 1107;
        }
        this.zza.zzc(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzm(final zzbbc.zzb zzbVar) {
        this.zza.zzb(new zzbau() { // from class: com.google.android.gms.internal.ads.zzdqy
            @Override // com.google.android.gms.internal.ads.zzbau
            public final void zza(zzbbc.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbbc.zzb.this);
            }
        });
        this.zza.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzn(boolean z10) {
        int i10;
        if (true != z10) {
            i10 = 1106;
        } else {
            i10 = 1105;
        }
        this.zza.zzc(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcxk
    public final synchronized void zzr() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzs() {
        this.zza.zzc(3);
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdn(zzbvb zzbvbVar) {
    }
}
