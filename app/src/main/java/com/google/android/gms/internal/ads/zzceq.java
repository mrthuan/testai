package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzceq implements com.google.android.gms.ads.internal.overlay.zzp {
    private final zzcej zza;
    private final com.google.android.gms.ads.internal.overlay.zzp zzb;

    public zzceq(zzcej zzcejVar, com.google.android.gms.ads.internal.overlay.zzp zzpVar) {
        this.zza = zzcejVar;
        this.zzb = zzpVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzb;
        if (zzpVar != null) {
            zzpVar.zzdq();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzb;
        if (zzpVar != null) {
            zzpVar.zzdr();
        }
        this.zza.zzaa();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzb;
        if (zzpVar != null) {
            zzpVar.zzdt();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i10) {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzb;
        if (zzpVar != null) {
            zzpVar.zzdu(i10);
        }
        this.zza.zzY();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }
}
