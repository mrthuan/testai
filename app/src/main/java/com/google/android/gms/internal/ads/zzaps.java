package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaps {
    public static final boolean zza = zzapt.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    public final void finalize() {
        if (!this.zzc) {
            zzb("Request on the loose");
            zzapt.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    public final synchronized void zza(String str, long j10) {
        if (!this.zzc) {
            this.zzb.add(new zzapr(str, j10, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    public final synchronized void zzb(String str) {
        List list;
        long j10;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j10 = 0;
        } else {
            j10 = ((zzapr) this.zzb.get(list.size() - 1)).zzc - ((zzapr) this.zzb.get(0)).zzc;
        }
        if (j10 > 0) {
            long j11 = ((zzapr) this.zzb.get(0)).zzc;
            zzapt.zza("(%-4d ms) %s", Long.valueOf(j10), str);
            for (zzapr zzaprVar : this.zzb) {
                long j12 = zzaprVar.zzc;
                zzapt.zza("(+%-4d) [%2d] %s", Long.valueOf(j12 - j11), Long.valueOf(zzaprVar.zzb), zzaprVar.zza);
                j11 = j12;
            }
        }
    }
}
