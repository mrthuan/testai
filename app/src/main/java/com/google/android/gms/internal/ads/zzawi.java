package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzawi implements Callable {
    private final zzavp zza;
    private final zzaro zzb;

    public zzawi(zzavp zzavpVar, zzaro zzaroVar) {
        this.zza = zzavpVar;
        this.zzb = zzaroVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzasj zzc = this.zza.zzc();
        if (zzc != null) {
            try {
                synchronized (this.zzb) {
                    this.zzb.zzaY(zzc.zzaV(), zzgxi.zza());
                }
                return null;
            } catch (zzgyn | NullPointerException unused) {
                return null;
            }
        }
        return null;
    }
}
