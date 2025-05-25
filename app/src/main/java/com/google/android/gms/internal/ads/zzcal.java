package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcal implements Runnable {
    final /* synthetic */ zzcao zza;

    public zzcal(zzcao zzcaoVar) {
        this.zza = zzcaoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcap zzcapVar;
        zzcap zzcapVar2;
        zzcap zzcapVar3;
        zzcao zzcaoVar = this.zza;
        zzcapVar = zzcaoVar.zzq;
        if (zzcapVar != null) {
            zzcapVar2 = zzcaoVar.zzq;
            zzcapVar2.zzd();
            zzcapVar3 = this.zza.zzq;
            zzcapVar3.zzi();
        }
    }
}
