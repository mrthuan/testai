package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbeg {
    public static final zzbdc zza;

    static {
        zzbdc.zzd("gads:invalidate_token_at_refresh_start", true);
        zzbdc.zzd("gms:expose_token_for_gma:enabled", true);
        zzbdc.zzd("gads:referesh_rate_limit", false);
        zza = zzbdc.zzb("gads:timeout_for_trustless_token:millis", 2000L);
        zzbdc.zzd("gads:token_anonymization:enabled", false);
        zzbdc.zzb("gads:cached_token:ttl_millis", 10800000L);
    }
}
