package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzsj {
    public static void zza(zzrz zzrzVar, zznz zznzVar) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        LogSessionId zza = zznzVar.zza();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = zza.equals(logSessionId);
        if (!equals) {
            MediaFormat mediaFormat = zzrzVar.zzb;
            stringId = zza.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }
}
