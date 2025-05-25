package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzfgb {
    public static /* synthetic */ boolean zza(AtomicReference atomicReference, Object obj, Object obj2) {
        boolean z10;
        while (true) {
            if (atomicReference.compareAndSet(null, obj2)) {
                z10 = true;
            } else if (atomicReference.get() != null) {
                z10 = false;
            } else {
                continue;
            }
            if (z10) {
                return true;
            }
            if (atomicReference.get() != null) {
                return false;
            }
        }
    }
}
