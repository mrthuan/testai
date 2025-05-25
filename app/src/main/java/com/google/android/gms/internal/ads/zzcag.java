package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcag implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcao zzb;

    public zzcag(zzcao zzcaoVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        this.zzb = zzcaoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcap zzcapVar;
        zzcap zzcapVar2;
        zzcao.zzl(this.zzb, this.zza);
        zzcao zzcaoVar = this.zzb;
        zzcapVar = zzcaoVar.zzq;
        if (zzcapVar != null) {
            zzcapVar2 = zzcaoVar.zzq;
            zzcapVar2.zzf();
        }
    }
}
