package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdgm implements com.google.android.gms.ads.internal.overlay.zzp {
    private final zzcyw zza;
    private final zzdec zzb;

    public zzdgm(zzcyw zzcywVar, zzdec zzdecVar) {
        this.zza = zzcywVar;
        this.zzb = zzdecVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
        this.zza.zzdH();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
        this.zza.zzdk();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
        this.zza.zzdq();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        this.zza.zzdr();
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
        this.zza.zzdt();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i10) {
        this.zza.zzdu(i10);
        this.zzb.zza();
    }
}
