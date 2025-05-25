package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgce extends zzgcc implements y9.a {
    @Override // y9.a
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgcc
    public /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    public abstract y9.a zzc();
}
