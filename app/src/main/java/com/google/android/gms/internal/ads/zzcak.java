package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcak implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcao zzc;

    public zzcak(zzcao zzcaoVar, int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzcaoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcap zzcapVar;
        zzcap zzcapVar2;
        zzcao zzcaoVar = this.zzc;
        zzcapVar = zzcaoVar.zzq;
        if (zzcapVar != null) {
            int i10 = this.zza;
            int i11 = this.zzb;
            zzcapVar2 = zzcaoVar.zzq;
            zzcapVar2.zzj(i10, i11);
        }
    }
}
