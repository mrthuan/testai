package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzabv {
    public static void zza(long j10, zzek zzekVar, zzadp[] zzadpVarArr) {
        int i10;
        boolean z10;
        while (true) {
            boolean z11 = true;
            if (zzekVar.zzb() > 1) {
                int zzc = zzc(zzekVar);
                int zzc2 = zzc(zzekVar);
                int zzd = zzekVar.zzd() + zzc2;
                if (zzc2 != -1 && zzc2 <= zzekVar.zzb()) {
                    if (zzc == 4 && zzc2 >= 8) {
                        int zzm = zzekVar.zzm();
                        int zzq = zzekVar.zzq();
                        if (zzq == 49) {
                            i10 = zzekVar.zzg();
                            zzq = 49;
                        } else {
                            i10 = 0;
                        }
                        int zzm2 = zzekVar.zzm();
                        if (zzq == 47) {
                            zzekVar.zzL(1);
                            zzq = 47;
                        }
                        if (zzm == 181 && ((zzq == 49 || zzq == 47) && zzm2 == 3)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (zzq == 49) {
                            if (i10 != 1195456820) {
                                z11 = false;
                            }
                            z10 &= z11;
                        }
                        if (z10) {
                            zzb(j10, zzekVar, zzadpVarArr);
                        }
                    }
                } else {
                    zzea.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    zzd = zzekVar.zze();
                }
                zzekVar.zzK(zzd);
            } else {
                return;
            }
        }
    }

    public static void zzb(long j10, zzek zzekVar, zzadp[] zzadpVarArr) {
        boolean z10;
        int zzm = zzekVar.zzm();
        if ((zzm & 64) != 0) {
            int i10 = zzm & 31;
            zzekVar.zzL(1);
            int zzd = zzekVar.zzd();
            for (zzadp zzadpVar : zzadpVarArr) {
                int i11 = i10 * 3;
                zzekVar.zzK(zzd);
                zzadpVar.zzq(zzekVar, i11);
                if (j10 != -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzdi.zzf(z10);
                zzadpVar.zzs(j10, 1, i11, 0, null);
            }
        }
    }

    private static int zzc(zzek zzekVar) {
        int i10 = 0;
        while (zzekVar.zzb() != 0) {
            int zzm = zzekVar.zzm();
            i10 += zzm;
            if (zzm != 255) {
                return i10;
            }
        }
        return -1;
    }
}
