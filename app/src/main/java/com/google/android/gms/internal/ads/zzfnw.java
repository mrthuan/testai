package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfnw {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfnv zzd = null;

    public zzfnw() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfnv zzfnvVar = (zzfnv) this.zzc.poll();
        this.zzd = zzfnvVar;
        if (zzfnvVar != null) {
            zzfnvVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfnv zzfnvVar) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfnv zzfnvVar) {
        zzfnvVar.zzb(this);
        this.zzc.add(zzfnvVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}
