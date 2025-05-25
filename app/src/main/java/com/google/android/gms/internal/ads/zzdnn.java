package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzdnn implements com.google.android.gms.ads.internal.client.zza, zzbhn, com.google.android.gms.ads.internal.overlay.zzp, zzbhp, com.google.android.gms.ads.internal.overlay.zzaa {
    private com.google.android.gms.ads.internal.client.zza zza;
    private zzbhn zzb;
    private com.google.android.gms.ads.internal.overlay.zzp zzc;
    private zzbhp zzd;
    private com.google.android.gms.ads.internal.overlay.zzaa zze;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zza;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhn
    public final synchronized void zza(String str, Bundle bundle) {
        zzbhn zzbhnVar = this.zzb;
        if (zzbhnVar != null) {
            zzbhnVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final synchronized void zzb(String str, String str2) {
        zzbhp zzbhpVar = this.zzd;
        if (zzbhpVar != null) {
            zzbhpVar.zzb(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdH() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
        if (zzpVar != null) {
            zzpVar.zzdH();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdk() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
        if (zzpVar != null) {
            zzpVar.zzdk();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdq() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
        if (zzpVar != null) {
            zzpVar.zzdq();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdr() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
        if (zzpVar != null) {
            zzpVar.zzdr();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdt() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
        if (zzpVar != null) {
            zzpVar.zzdt();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdu(int i10) {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
        if (zzpVar != null) {
            zzpVar.zzdu(i10);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final synchronized void zzg() {
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zze;
        if (zzaaVar != null) {
            zzaaVar.zzg();
        }
    }

    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zza zzaVar, zzbhn zzbhnVar, com.google.android.gms.ads.internal.overlay.zzp zzpVar, zzbhp zzbhpVar, com.google.android.gms.ads.internal.overlay.zzaa zzaaVar) {
        this.zza = zzaVar;
        this.zzb = zzbhnVar;
        this.zzc = zzpVar;
        this.zzd = zzbhpVar;
        this.zze = zzaaVar;
    }
}
