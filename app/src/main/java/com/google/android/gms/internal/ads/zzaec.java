package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaec implements zzadx {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaec(int i10, int i11, int i12, int i13) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public static zzaec zzb(zzek zzekVar) {
        int zzi = zzekVar.zzi();
        zzekVar.zzL(8);
        int zzi2 = zzekVar.zzi();
        int zzi3 = zzekVar.zzi();
        zzekVar.zzL(4);
        int zzi4 = zzekVar.zzi();
        zzekVar.zzL(12);
        return new zzaec(zzi, zzi2, zzi3, zzi4);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final int zza() {
        return 1751742049;
    }
}
