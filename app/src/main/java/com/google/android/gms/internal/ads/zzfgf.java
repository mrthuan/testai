package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfgf {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgcu zzc;

    public zzfgf(Callable callable, zzgcu zzgcuVar) {
        this.zzb = callable;
        this.zzc = zzgcuVar;
    }

    public final synchronized y9.a zza() {
        zzc(1);
        return (y9.a) this.zza.poll();
    }

    public final synchronized void zzb(y9.a aVar) {
        this.zza.addFirst(aVar);
    }

    public final synchronized void zzc(int i10) {
        int size = i10 - this.zza.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}
