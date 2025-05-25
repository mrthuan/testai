package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgci {
    private final boolean zza;
    private final zzfxr zzb;

    public /* synthetic */ zzgci(boolean z10, zzfxr zzfxrVar, zzgch zzgchVar) {
        this.zza = z10;
        this.zzb = zzfxrVar;
    }

    public final y9.a zza(Callable callable, Executor executor) {
        return new zzgbw(this.zzb, this.zza, executor, callable);
    }
}
