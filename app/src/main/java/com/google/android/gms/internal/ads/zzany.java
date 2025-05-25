package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzany implements zzanx {
    private final zzacn zza;
    private final zzadp zzb;
    private final zzaoa zzc;
    private final zzaf zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzany(zzacn zzacnVar, zzadp zzadpVar, zzaoa zzaoaVar, String str, int i10) {
        this.zza = zzacnVar;
        this.zzb = zzadpVar;
        this.zzc = zzaoaVar;
        int i11 = zzaoaVar.zzb * zzaoaVar.zze;
        int i12 = zzaoaVar.zzd;
        int i13 = i11 / 8;
        if (i12 == i13) {
            int i14 = zzaoaVar.zzc * i13;
            int i15 = i14 * 8;
            int max = Math.max(i13, i14 / 10);
            this.zze = max;
            zzad zzadVar = new zzad();
            zzadVar.zzX(str);
            zzadVar.zzx(i15);
            zzadVar.zzS(i15);
            zzadVar.zzP(max);
            zzadVar.zzy(zzaoaVar.zzb);
            zzadVar.zzY(zzaoaVar.zzc);
            zzadVar.zzR(i10);
            this.zzd = zzadVar.zzad();
            return;
        }
        throw zzbo.zza("Expected block size: " + i13 + "; got: " + i12, null);
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final void zza(int i10, long j10) {
        this.zza.zzO(new zzaod(this.zzc, 1, i10, j10));
        this.zzb.zzl(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final void zzb(long j10) {
        this.zzf = j10;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final boolean zzc(zzacl zzaclVar, long j10) {
        int i10;
        int i11;
        int i12;
        long j11 = j10;
        while (true) {
            i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i10 <= 0 || (i11 = this.zzg) >= (i12 = this.zze)) {
                break;
            }
            int zzf = this.zzb.zzf(zzaclVar, (int) Math.min(i12 - i11, j11), true);
            if (zzf == -1) {
                j11 = 0;
            } else {
                this.zzg += zzf;
                j11 -= zzf;
            }
        }
        zzaoa zzaoaVar = this.zzc;
        int i13 = this.zzg;
        int i14 = zzaoaVar.zzd;
        int i15 = i13 / i14;
        if (i15 > 0) {
            int i16 = i15 * i14;
            int i17 = this.zzg - i16;
            this.zzb.zzs(this.zzf + zzet.zzt(this.zzh, 1000000L, zzaoaVar.zzc, RoundingMode.FLOOR), 1, i16, i17, null);
            this.zzh += i15;
            this.zzg = i17;
        }
        if (i10 <= 0) {
            return true;
        }
        return false;
    }
}
