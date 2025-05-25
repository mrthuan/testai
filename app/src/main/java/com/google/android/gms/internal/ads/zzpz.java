package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzpz {
    public static void zza(AudioTrack audioTrack, zznz zznzVar) {
        LogSessionId logSessionId;
        boolean equals;
        LogSessionId zza = zznzVar.zza();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = zza.equals(logSessionId);
        if (!equals) {
            audioTrack.setLogSessionId(zza);
        }
    }
}
