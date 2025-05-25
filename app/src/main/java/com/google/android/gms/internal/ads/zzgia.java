package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgia {
    public static final zzgia zza = new zzgia("ASSUME_AES_GCM");
    public static final zzgia zzb = new zzgia("ASSUME_XCHACHA20POLY1305");
    public static final zzgia zzc = new zzgia("ASSUME_CHACHA20POLY1305");
    public static final zzgia zzd = new zzgia("ASSUME_AES_CTR_HMAC");
    public static final zzgia zze = new zzgia("ASSUME_AES_EAX");
    public static final zzgia zzf = new zzgia("ASSUME_AES_GCM_SIV");
    private final String zzg;

    private zzgia(String str) {
        this.zzg = str;
    }

    public final String toString() {
        return this.zzg;
    }
}
