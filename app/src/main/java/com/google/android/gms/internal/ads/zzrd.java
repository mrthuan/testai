package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzrd {
    public final int zza;
    public final zzui zzb;
    private final CopyOnWriteArrayList zzc;

    private zzrd(CopyOnWriteArrayList copyOnWriteArrayList, int i10, zzui zzuiVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzuiVar;
    }

    public final zzrd zza(int i10, zzui zzuiVar) {
        return new zzrd(this.zzc, 0, zzuiVar);
    }

    public final void zzb(Handler handler, zzre zzreVar) {
        this.zzc.add(new zzrc(handler, zzreVar));
    }

    public final void zzc(zzre zzreVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzrc zzrcVar = (zzrc) it.next();
            if (zzrcVar.zza == zzreVar) {
                this.zzc.remove(zzrcVar);
            }
        }
    }

    public zzrd() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
