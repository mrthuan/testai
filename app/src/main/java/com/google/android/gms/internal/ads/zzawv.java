package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzawv extends zzaxd {
    private final StackTraceElement[] zzh;

    public zzawv(zzavp zzavpVar, String str, String str2, zzaro zzaroVar, int i10, int i11, StackTraceElement[] stackTraceElementArr) {
        super(zzavpVar, "9douHjmTTjq3N4YYUdzzHaKyxIqsB5K92p8t26vKQB1HahpVak+32YHan4LmgLPE", "q6oLc2ULDKRAR1VDdX5lO9/kb0NHjx7PMACMr/7cZL8=", zzaroVar, i10, 45);
        this.zzh = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaxd
    public final void zza() {
        StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            int i10 = 1;
            zzavg zzavgVar = new zzavg((String) this.zze.invoke(null, stackTraceElementArr));
            synchronized (this.zzd) {
                this.zzd.zzF(zzavgVar.zza.longValue());
                if (zzavgVar.zzb.booleanValue()) {
                    zzaro zzaroVar = this.zzd;
                    if (true != zzavgVar.zzc.booleanValue()) {
                        i10 = 2;
                    }
                    zzaroVar.zzac(i10);
                } else {
                    this.zzd.zzac(3);
                }
            }
        }
    }
}
