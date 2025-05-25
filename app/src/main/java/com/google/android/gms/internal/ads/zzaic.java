package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaic implements zzaia {
    private final int zza;
    private final int zzb;
    private final zzek zzc;

    public zzaic(zzahw zzahwVar, zzaf zzafVar) {
        zzek zzekVar = zzahwVar.zza;
        this.zzc = zzekVar;
        zzekVar.zzK(12);
        int zzp = zzekVar.zzp();
        if ("audio/raw".equals(zzafVar.zzm)) {
            int zzm = zzet.zzm(zzafVar.zzB, zzafVar.zzz);
            if (zzp == 0 || zzp % zzm != 0) {
                zzea.zzf("AtomParsers", "Audio sample size mismatch. stsd sample size: " + zzm + ", stsz sample size: " + zzp);
                zzp = zzm;
            }
        }
        this.zza = zzp == 0 ? -1 : zzp;
        this.zzb = zzekVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzaia
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaia
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaia
    public final int zzc() {
        int i10 = this.zza;
        if (i10 == -1) {
            return this.zzc.zzp();
        }
        return i10;
    }
}
