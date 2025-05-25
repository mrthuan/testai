package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgax;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
abstract class zzgbo extends zzgax.zzi {
    private static final zzgbk zzbd;
    private static final zzgct zzbe = new zzgct(zzgbo.class);
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzgbk zzgbnVar;
        Throwable th2;
        try {
            zzgbnVar = new zzgbl(AtomicReferenceFieldUpdater.newUpdater(zzgbo.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzgbo.class, "remaining"));
            th2 = null;
        } catch (Throwable th3) {
            zzgbnVar = new zzgbn(null);
            th2 = th3;
        }
        zzbd = zzgbnVar;
        if (th2 != null) {
            zzbe.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    public zzgbo(int i10) {
        this.remaining = i10;
    }

    public final int zzA() {
        return zzbd.zza(this);
    }

    public final Set zzC() {
        Set<Throwable> set = this.seenExceptions;
        if (set == null) {
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            zze(newSetFromMap);
            zzbd.zzb(this, null, newSetFromMap);
            Set<Throwable> set2 = this.seenExceptions;
            Objects.requireNonNull(set2);
            return set2;
        }
        return set;
    }

    public final void zzF() {
        this.seenExceptions = null;
    }

    public abstract void zze(Set set);
}
