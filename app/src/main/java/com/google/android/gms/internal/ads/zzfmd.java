package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfmd {
    private final String zza;
    private final String zzb;

    private zzfmd(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzfmd zza(String str, String str2) {
        zzfnj.zzb(str, "Name is null or empty");
        zzfnj.zzb(str2, "Version is null or empty");
        return new zzfmd(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
