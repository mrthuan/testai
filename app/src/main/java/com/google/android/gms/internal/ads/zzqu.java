package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzqu implements zzpi {
    final /* synthetic */ zzqv zza;

    public /* synthetic */ zzqu(zzqv zzqvVar, zzqt zzqtVar) {
        this.zza = zzqvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zza(Exception exc) {
        zzea.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        zzqv.zzae(this.zza).zzb(exc);
    }
}
