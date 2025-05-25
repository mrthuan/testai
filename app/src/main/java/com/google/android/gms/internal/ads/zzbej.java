package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbej {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    public static zzbeh zza() {
        return (zzbeh) zza.get();
    }

    public static zzbei zzb() {
        return (zzbei) zzb.get();
    }

    public static void zzc(zzbeh zzbehVar) {
        zza.set(zzbehVar);
    }
}
