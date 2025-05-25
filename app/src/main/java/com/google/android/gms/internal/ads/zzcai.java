package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcai implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcao zzc;

    public zzcai(zzcao zzcaoVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzcaoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcap zzcapVar;
        zzcap zzcapVar2;
        zzcao zzcaoVar = this.zzc;
        zzcapVar = zzcaoVar.zzq;
        if (zzcapVar != null) {
            String str = this.zza;
            String str2 = this.zzb;
            zzcapVar2 = zzcaoVar.zzq;
            zzcapVar2.zzb(str, str2);
        }
    }
}
