package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaed implements zzadx {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzaed(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.zza = i10;
        this.zzb = i12;
        this.zzc = i13;
        this.zzd = i14;
        this.zze = i15;
    }

    public static zzaed zzb(zzek zzekVar) {
        int zzi = zzekVar.zzi();
        zzekVar.zzL(12);
        int zzi2 = zzekVar.zzi();
        int zzi3 = zzekVar.zzi();
        int zzi4 = zzekVar.zzi();
        zzekVar.zzL(4);
        int zzi5 = zzekVar.zzi();
        int zzi6 = zzekVar.zzi();
        zzekVar.zzL(8);
        return new zzaed(zzi, zzi2, zzi3, zzi4, zzi5, zzi6);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final int zza() {
        return 1752331379;
    }
}
