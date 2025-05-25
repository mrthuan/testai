package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgz {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = androidx.emoji2.text.r.e();

    public /* synthetic */ zzgz(MediaCodec.CryptoInfo cryptoInfo, zzgy zzgyVar) {
        this.zza = cryptoInfo;
    }

    public static /* bridge */ /* synthetic */ void zza(zzgz zzgzVar, int i10, int i11) {
        zzgzVar.zzb.set(i10, i11);
        zzgzVar.zza.setPattern(zzgzVar.zzb);
    }
}
