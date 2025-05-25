package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzrz {
    public final zzsf zza;
    public final MediaFormat zzb;
    public final zzaf zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;

    private zzrz(zzsf zzsfVar, MediaFormat mediaFormat, zzaf zzafVar, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.zza = zzsfVar;
        this.zzb = mediaFormat;
        this.zzc = zzafVar;
        this.zzd = surface;
    }

    public static zzrz zza(zzsf zzsfVar, MediaFormat mediaFormat, zzaf zzafVar, MediaCrypto mediaCrypto) {
        return new zzrz(zzsfVar, mediaFormat, zzafVar, null, null, 0);
    }

    public static zzrz zzb(zzsf zzsfVar, MediaFormat mediaFormat, zzaf zzafVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzrz(zzsfVar, mediaFormat, zzafVar, surface, null, 0);
    }
}
