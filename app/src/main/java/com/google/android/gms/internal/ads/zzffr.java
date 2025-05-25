package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzffr implements zzgcf {
    final /* synthetic */ zzffs zza;
    final /* synthetic */ int zzb;

    public zzffr(zzffs zzffsVar, int i10) {
        this.zzb = i10;
        this.zza = zzffsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(th2, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i10 = this.zzb;
        this.zza.zzb((String) obj, i10);
    }
}
