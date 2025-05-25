package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaui implements Runnable {
    final /* synthetic */ zzauj zza;

    public zzaui(zzauj zzaujVar) {
        this.zza = zzaujVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z10;
        zzavp zzavpVar;
        ConditionVariable conditionVariable2;
        if (this.zza.zzb == null) {
            conditionVariable = zzauj.zzc;
            synchronized (conditionVariable) {
                if (this.zza.zzb != null) {
                    return;
                }
                boolean z11 = false;
                try {
                    z10 = ((Boolean) zzbbw.zzcl.zze()).booleanValue();
                } catch (IllegalStateException unused) {
                    z10 = false;
                }
                if (z10) {
                    try {
                        zzavpVar = this.zza.zze;
                        zzauj.zza = zzfqj.zzb(zzavpVar.zza, "ADSHIELD", null);
                    } catch (Throwable unused2) {
                    }
                }
                z11 = z10;
                this.zza.zzb = Boolean.valueOf(z11);
                conditionVariable2 = zzauj.zzc;
                conditionVariable2.open();
            }
        }
    }
}
