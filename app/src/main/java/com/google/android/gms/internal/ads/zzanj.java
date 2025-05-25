package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzanj implements zzabt {
    private final zzer zza;
    private final zzek zzb = new zzek();
    private final int zzc;

    public zzanj(int i10, zzer zzerVar, int i11) {
        this.zzc = i10;
        this.zza = zzerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabt
    public final zzabs zza(zzacl zzaclVar, long j10) {
        int zza;
        int zza2;
        long zzf = zzaclVar.zzf();
        int min = (int) Math.min(112800L, zzaclVar.zzd() - zzf);
        this.zzb.zzH(min);
        ((zzaby) zzaclVar).zzm(this.zzb.zzM(), 0, min, false);
        zzek zzekVar = this.zzb;
        int zze = zzekVar.zze();
        long j11 = -1;
        long j12 = -9223372036854775807L;
        long j13 = -1;
        while (zzekVar.zzb() >= 188 && (zza2 = (zza = zzanu.zza(zzekVar.zzM(), zzekVar.zzd(), zze)) + 188) <= zze) {
            long zzb = zzanu.zzb(zzekVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zzb2 = this.zza.zzb(zzb);
                if (zzb2 > j10) {
                    if (j12 == -9223372036854775807L) {
                        return zzabs.zzd(zzb2, zzf);
                    }
                } else {
                    j13 = zza;
                    if (100000 + zzb2 <= j10) {
                        j12 = zzb2;
                    }
                }
                return zzabs.zze(zzf + j13);
            }
            zzekVar.zzK(zza2);
            j11 = zza2;
        }
        if (j12 != -9223372036854775807L) {
            return zzabs.zzf(j12, zzf + j11);
        }
        return zzabs.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabt
    public final void zzb() {
        byte[] bArr = zzet.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
    }
}
