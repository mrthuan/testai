package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeoo {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzeon zzb;

    public final zzeon zza() {
        return this.zzb;
    }

    public final void zzb(zzeon zzeonVar) {
        this.zzb = zzeonVar;
    }

    public final void zzc(boolean z10) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
