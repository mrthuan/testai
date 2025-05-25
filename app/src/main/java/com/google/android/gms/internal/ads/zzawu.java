package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzawu extends zzaxd {
    private final boolean zzh;

    public zzawu(zzavp zzavpVar, String str, String str2, zzaro zzaroVar, int i10, int i11) {
        super(zzavpVar, "vvYcBqgI4aoC3GZZ7n1bdLp71k52s6EJLh0/nA6ME39LmvOZf3TBZ+H4xg1YfQXg", "6jGSPrUM0+2YrTO2vsTOKq3+XL/IfUFs5oxZaSEvsQg=", zzaroVar, i10, 61);
        this.zzh = zzavpVar.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzaxd
    public final void zza() {
        long longValue = ((Long) this.zze.invoke(null, this.zza.zzb(), Boolean.valueOf(this.zzh))).longValue();
        synchronized (this.zzd) {
            this.zzd.zzE(longValue);
        }
    }
}
