package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzanb implements zzabt {
    private final zzer zza;
    private final zzek zzb = new zzek();

    public /* synthetic */ zzanb(zzer zzerVar, zzana zzanaVar) {
        this.zza = zzerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabt
    public final zzabs zza(zzacl zzaclVar, long j10) {
        int zzh;
        long j11;
        long zzf = zzaclVar.zzf();
        int min = (int) Math.min(20000L, zzaclVar.zzd() - zzf);
        this.zzb.zzH(min);
        ((zzaby) zzaclVar).zzm(this.zzb.zzM(), 0, min, false);
        int i10 = -1;
        long j12 = -9223372036854775807L;
        int i11 = -1;
        while (true) {
            zzek zzekVar = this.zzb;
            if (zzekVar.zzb() >= 4) {
                if (zzanc.zzh(zzekVar.zzM(), zzekVar.zzd()) != 442) {
                    zzekVar.zzL(1);
                } else {
                    zzekVar.zzL(4);
                    long zzc = zzand.zzc(zzekVar);
                    if (zzc != -9223372036854775807L) {
                        long zzb = this.zza.zzb(zzc);
                        if (zzb > j10) {
                            if (j12 == -9223372036854775807L) {
                                return zzabs.zzd(zzb, zzf);
                            }
                            j11 = i11;
                        } else if (100000 + zzb > j10) {
                            j11 = zzekVar.zzd();
                            break;
                        } else {
                            i11 = zzekVar.zzd();
                            j12 = zzb;
                        }
                    }
                    int zze = zzekVar.zze();
                    if (zzekVar.zzb() < 10) {
                        zzekVar.zzK(zze);
                    } else {
                        zzekVar.zzL(9);
                        int zzm = zzekVar.zzm() & 7;
                        if (zzekVar.zzb() < zzm) {
                            zzekVar.zzK(zze);
                        } else {
                            zzekVar.zzL(zzm);
                            if (zzekVar.zzb() < 4) {
                                zzekVar.zzK(zze);
                            } else {
                                if (zzanc.zzh(zzekVar.zzM(), zzekVar.zzd()) == 443) {
                                    zzekVar.zzL(4);
                                    int zzq = zzekVar.zzq();
                                    if (zzekVar.zzb() < zzq) {
                                        zzekVar.zzK(zze);
                                    } else {
                                        zzekVar.zzL(zzq);
                                    }
                                }
                                while (true) {
                                    if (zzekVar.zzb() < 4 || (zzh = zzanc.zzh(zzekVar.zzM(), zzekVar.zzd())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                        break;
                                    }
                                    zzekVar.zzL(4);
                                    if (zzekVar.zzb() < 2) {
                                        zzekVar.zzK(zze);
                                        break;
                                    }
                                    zzekVar.zzK(Math.min(zzekVar.zze(), zzekVar.zzd() + zzekVar.zzq()));
                                }
                            }
                        }
                    }
                    i10 = zzekVar.zzd();
                }
            } else if (j12 != -9223372036854775807L) {
                return zzabs.zzf(j12, zzf + i10);
            } else {
                return zzabs.zza;
            }
        }
        return zzabs.zze(zzf + j11);
    }

    @Override // com.google.android.gms.internal.ads.zzabt
    public final void zzb() {
        byte[] bArr = zzet.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
    }
}
