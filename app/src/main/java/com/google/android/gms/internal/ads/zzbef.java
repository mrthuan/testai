package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.CrashConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbef {
    public static final zzbdc zza;

    static {
        zzbdc.zzb("gads:ad_loader:timeout_ms", 60000L);
        zza = zzbdc.zzb("gads:rendering:timeout_ms", 60000L);
        zzbdc.zzb("gads:resolve_future:default_timeout_ms", CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
    }
}
