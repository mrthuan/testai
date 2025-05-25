package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzcqy implements Runnable {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzcqy(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcra.zzj(this.zza);
    }
}
