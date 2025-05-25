package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcam implements Runnable {
    final /* synthetic */ zzcao zza;

    public zzcam(zzcao zzcaoVar) {
        this.zza = zzcaoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcap zzcapVar;
        boolean z10;
        zzcap zzcapVar2;
        zzcap zzcapVar3;
        zzcao zzcaoVar = this.zza;
        zzcapVar = zzcaoVar.zzq;
        if (zzcapVar != null) {
            z10 = zzcaoVar.zzr;
            if (!z10) {
                zzcapVar3 = zzcaoVar.zzq;
                zzcapVar3.zzg();
                this.zza.zzr = true;
            }
            zzcapVar2 = this.zza.zzq;
            zzcapVar2.zze();
        }
    }
}
