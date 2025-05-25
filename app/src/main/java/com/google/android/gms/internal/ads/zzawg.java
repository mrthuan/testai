package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzawg extends zzaxd {
    private final long zzh;

    public zzawg(zzavp zzavpVar, String str, String str2, zzaro zzaroVar, long j10, int i10, int i11) {
        super(zzavpVar, "Rx5KxmHu63h8QT7T4cYR2mu7F4LQnYkocG/Azb9HP8ZHyjUHnRxxCuB99BIp3kbl", "3fysZeGzwX+hqd2f4+qtlSho+oF+DeFl9kzKrTFOSWo=", zzaroVar, i10, 25);
        this.zzh = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaxd
    public final void zza() {
        long longValue = ((Long) this.zze.invoke(null, new Object[0])).longValue();
        synchronized (this.zzd) {
            this.zzd.zzt(longValue);
            long j10 = this.zzh;
            if (j10 != 0) {
                this.zzd.zzT(longValue - j10);
                this.zzd.zzU(this.zzh);
            }
        }
    }
}
