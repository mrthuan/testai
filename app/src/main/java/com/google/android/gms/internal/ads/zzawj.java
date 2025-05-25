package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzawj extends zzaxd {
    private final zzavq zzh;

    public zzawj(zzavp zzavpVar, String str, String str2, zzaro zzaroVar, int i10, int i11, zzavq zzavqVar) {
        super(zzavpVar, "ZdMwT5n8r4APV4u4GhQlb1VCwOIVHkTm7kF7LnArEpyZnsv+C3G3q6fVFgtTcqcc", "O+vmm8flr2e7ZrTWUx/T8ClWwcEwLlJlfjM8sMGjZbg=", zzaroVar, i10, 85);
        this.zzh = zzavqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxd
    public final void zza() {
        long[] jArr = (long[]) this.zze.invoke(null, Long.valueOf(this.zzh.zzd()), Long.valueOf(this.zzh.zzh()), Long.valueOf(this.zzh.zzb()), Long.valueOf(this.zzh.zzf()));
        synchronized (this.zzd) {
            this.zzd.zzv(jArr[0]);
            this.zzd.zzu(jArr[1]);
        }
    }
}
