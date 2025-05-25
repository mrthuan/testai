package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgax;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgcy extends zzgax.zzi implements Runnable {
    private final Runnable zza;

    public zzgcy(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th2) {
            zzd(th2);
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final String zza() {
        return a6.h.d("task=[", this.zza.toString(), "]");
    }
}
