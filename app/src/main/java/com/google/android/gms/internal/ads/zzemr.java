package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzemr implements zzemz {
    final /* synthetic */ zzems zza;

    public zzemr(zzems zzemsVar) {
        this.zza = zzemsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemz
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemz
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdfo zzdfoVar;
        zzdfo zzdfoVar2 = (zzdfo) obj;
        synchronized (this.zza) {
            this.zza.zzj = zzdfoVar2;
            zzdfoVar = this.zza.zzj;
            zzdfoVar.zzk();
        }
    }
}
