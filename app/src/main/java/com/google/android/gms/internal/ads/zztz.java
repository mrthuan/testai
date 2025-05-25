package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zztz {
    private static final AtomicLong zza = new AtomicLong();

    public zztz(long j10, zzfy zzfyVar, long j11) {
        Uri uri = zzfyVar.zza;
        Collections.emptyMap();
    }

    public zztz(long j10, zzfy zzfyVar, Uri uri, Map map, long j11, long j12, long j13) {
    }

    public static long zza() {
        return zza.getAndIncrement();
    }
}
