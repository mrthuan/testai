package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcah implements Runnable {
    final /* synthetic */ zzcao zza;

    public zzcah(zzcao zzcaoVar) {
        this.zza = zzcaoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcap zzcapVar;
        zzcap zzcapVar2;
        zzcao zzcaoVar = this.zza;
        zzcapVar = zzcaoVar.zzq;
        if (zzcapVar != null) {
            zzcapVar2 = zzcaoVar.zzq;
            zzcapVar2.zza();
        }
    }
}
