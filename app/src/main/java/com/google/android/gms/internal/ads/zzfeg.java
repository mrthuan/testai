package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfeg implements zzemz {
    final /* synthetic */ zzfei zza;

    public zzfeg(zzfei zzfeiVar) {
        this.zza = zzfeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemz
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemz
    public final void zzb(Object obj) {
        zzdop zzdopVar;
        zzfey zzfeyVar;
        synchronized (this.zza) {
            this.zza.zzd = (zzdop) obj;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdg)).booleanValue()) {
                zzfez zzd = ((zzdop) obj).zzd();
                zzfeyVar = this.zza.zzc;
                zzd.zza = zzfeyVar;
            }
            zzdopVar = this.zza.zzd;
            zzdopVar.zzk();
        }
    }
}
