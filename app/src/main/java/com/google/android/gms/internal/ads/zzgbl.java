package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgbl extends zzgbk {
    final AtomicReferenceFieldUpdater zza;
    final AtomicIntegerFieldUpdater zzb;

    public zzgbl(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    public final int zza(zzgbo zzgboVar) {
        return this.zzb.decrementAndGet(zzgboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    public final void zzb(zzgbo zzgboVar, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z10;
        do {
            atomicReferenceFieldUpdater = this.zza;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(zzgboVar, null, set2)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(zzgboVar) != null) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(zzgboVar) == null);
    }
}
