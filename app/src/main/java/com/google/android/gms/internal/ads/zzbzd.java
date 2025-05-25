package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbzd {
    private final Object zza = new Object();
    private volatile int zzc = 1;
    private volatile long zzb = 0;

    private zzbzd() {
    }

    public final void zza() {
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        zzuVar.f10560j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.zza) {
            if (this.zzc == 3) {
                if (this.zzb + ((Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzfp)).longValue() <= currentTimeMillis) {
                    this.zzc = 1;
                }
            }
        }
        zzuVar.f10560j.getClass();
        long currentTimeMillis2 = System.currentTimeMillis();
        synchronized (this.zza) {
            if (this.zzc != 2) {
                return;
            }
            this.zzc = 3;
            if (this.zzc == 3) {
                this.zzb = currentTimeMillis2;
            }
        }
    }

    public /* synthetic */ zzbzd(zzbzc zzbzcVar) {
    }
}
