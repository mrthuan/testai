package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaem implements zzabt {
    private final zzacv zza;
    private final int zzb;
    private final zzacq zzc = new zzacq();

    public /* synthetic */ zzaem(zzacv zzacvVar, int i10, zzael zzaelVar) {
        this.zza = zzacvVar;
        this.zzb = i10;
    }

    private final long zzc(zzacl zzaclVar) {
        while (zzaclVar.zze() < zzaclVar.zzd() - 6) {
            zzacv zzacvVar = this.zza;
            int i10 = this.zzb;
            zzacq zzacqVar = this.zzc;
            long zze = zzaclVar.zze();
            byte[] bArr = new byte[2];
            zzaby zzabyVar = (zzaby) zzaclVar;
            zzabyVar.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                zzaclVar.zzj();
                zzabyVar.zzl((int) (zze - zzaclVar.zzf()), false);
            } else {
                zzek zzekVar = new zzek(16);
                System.arraycopy(bArr, 0, zzekVar.zzM(), 0, 2);
                zzekVar.zzJ(zzaco.zza(zzaclVar, zzekVar.zzM(), 2, 14));
                zzaclVar.zzj();
                zzabyVar.zzl((int) (zze - zzaclVar.zzf()), false);
                if (zzacr.zzc(zzekVar, zzacvVar, i10, zzacqVar)) {
                    break;
                }
            }
            zzabyVar.zzl(1, false);
        }
        if (zzaclVar.zze() >= zzaclVar.zzd() - 6) {
            ((zzaby) zzaclVar).zzl((int) (zzaclVar.zzd() - zzaclVar.zze()), false);
            return this.zza.zzj;
        }
        return this.zzc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabt
    public final zzabs zza(zzacl zzaclVar, long j10) {
        int i10 = this.zza.zzc;
        long zzf = zzaclVar.zzf();
        long zzc = zzc(zzaclVar);
        long zze = zzaclVar.zze();
        ((zzaby) zzaclVar).zzl(Math.max(6, i10), false);
        int i11 = (zzc > j10 ? 1 : (zzc == j10 ? 0 : -1));
        long zzc2 = zzc(zzaclVar);
        long zze2 = zzaclVar.zze();
        if (i11 <= 0 && zzc2 > j10) {
            return zzabs.zze(zze);
        }
        if (zzc2 <= j10) {
            return zzabs.zzf(zzc2, zze2);
        }
        return zzabs.zzd(zzc, zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzabt
    public final /* synthetic */ void zzb() {
    }
}
