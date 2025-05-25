package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzqi {
    private Exception zza;
    private long zzb;

    public zzqi(long j10) {
    }

    public final void zza() {
        this.zza = null;
    }

    public final void zzb(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zza == null) {
            this.zza = exc;
            this.zzb = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.zzb) {
            Exception exc2 = this.zza;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.zza;
            this.zza = null;
            throw exc3;
        }
    }
}
