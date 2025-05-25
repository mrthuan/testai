package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzep implements zzdt {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzep(Handler handler) {
        this.zzb = handler;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzeo zzeoVar) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzeoVar);
            }
        }
    }

    private static zzeo zzm() {
        zzeo zzeoVar;
        List list = zza;
        synchronized (list) {
            if (list.isEmpty()) {
                zzeoVar = new zzeo(null);
            } else {
                zzeoVar = (zzeo) list.remove(list.size() - 1);
            }
        }
        return zzeoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final zzds zzb(int i10) {
        Handler handler = this.zzb;
        zzeo zzm = zzm();
        zzm.zzb(handler.obtainMessage(i10), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final zzds zzc(int i10, Object obj) {
        Handler handler = this.zzb;
        zzeo zzm = zzm();
        zzm.zzb(handler.obtainMessage(i10, obj), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final zzds zzd(int i10, int i11, int i12) {
        Handler handler = this.zzb;
        zzeo zzm = zzm();
        zzm.zzb(handler.obtainMessage(1, i11, i12), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zze(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zzf(int i10) {
        this.zzb.removeMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzg(int i10) {
        return this.zzb.hasMessages(0);
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzh(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzi(int i10) {
        return this.zzb.sendEmptyMessage(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzj(int i10, long j10) {
        return this.zzb.sendEmptyMessageAtTime(2, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzk(zzds zzdsVar) {
        return ((zzeo) zzdsVar).zzc(this.zzb);
    }
}
