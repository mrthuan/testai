package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzjd {
    public static zznz zza(Context context, zzjm zzjmVar, boolean z10, String str) {
        LogSessionId logSessionId;
        zznv zzb = zznv.zzb(context);
        if (zzb == null) {
            zzea.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new zznz(logSessionId, str);
        }
        if (z10) {
            zzjmVar.zzy(zzb);
        }
        return new zznz(zzb.zza(), str);
    }
}
