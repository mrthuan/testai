package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbnq implements zzbzv {
    final /* synthetic */ zzbzt zza;
    final /* synthetic */ zzbmu zzb;

    public zzbnq(zzbns zzbnsVar, zzbzt zzbztVar, zzbmu zzbmuVar) {
        this.zza = zzbztVar;
        this.zzb = zzbmuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzv
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.h("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzbnd("Unable to obtain a JavascriptEngine."));
        this.zzb.zzb();
    }
}
