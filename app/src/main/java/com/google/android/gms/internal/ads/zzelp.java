package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzelp implements zzemz {
    final /* synthetic */ zzelq zza;

    public zzelp(zzelq zzelqVar) {
        this.zza = zzelqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemz
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemz
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcpk zzcpkVar;
        zzcpk zzcpkVar2;
        zzcpk zzcpkVar3;
        zzcpk zzcpkVar4 = (zzcpk) obj;
        synchronized (this.zza) {
            zzelq zzelqVar = this.zza;
            zzcpkVar = zzelqVar.zzi;
            if (zzcpkVar != null) {
                zzcpkVar3 = zzelqVar.zzi;
                zzcpkVar3.zzb();
            }
            this.zza.zzi = zzcpkVar4;
            zzcpkVar2 = this.zza.zzi;
            zzcpkVar2.zzk();
        }
    }
}
