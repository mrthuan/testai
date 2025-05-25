package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hpsf.Variant;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaeo implements zzack {
    private final byte[] zza;
    private final zzek zzb;
    private final zzacq zzc;
    private zzacn zzd;
    private zzadp zze;
    private int zzf;
    private zzbk zzg;
    private zzacv zzh;
    private int zzi;
    private int zzj;
    private zzaen zzk;
    private int zzl;
    private long zzm;

    public zzaeo() {
        throw null;
    }

    private final long zza(zzek zzekVar, boolean z10) {
        boolean z11;
        this.zzh.getClass();
        int zzd = zzekVar.zzd();
        while (zzd <= zzekVar.zze() - 16) {
            zzekVar.zzK(zzd);
            if (zzacr.zzc(zzekVar, this.zzh, this.zzj, this.zzc)) {
                zzekVar.zzK(zzd);
                return this.zzc.zza;
            }
            zzd++;
        }
        if (z10) {
            while (zzd <= zzekVar.zze() - this.zzi) {
                zzekVar.zzK(zzd);
                try {
                    z11 = zzacr.zzc(zzekVar, this.zzh, this.zzj, this.zzc);
                } catch (IndexOutOfBoundsException unused) {
                    z11 = false;
                }
                if (zzekVar.zzd() <= zzekVar.zze() && z11) {
                    zzekVar.zzK(zzd);
                    return this.zzc.zza;
                }
                zzd++;
            }
            zzekVar.zzK(zzekVar.zze());
            return -1L;
        }
        zzekVar.zzK(zzd);
        return -1L;
    }

    private final void zzg() {
        zzacv zzacvVar = this.zzh;
        int i10 = zzet.zza;
        this.zze.zzs((this.zzm * 1000000) / zzacvVar.zze, 1, this.zzl, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) {
        boolean zzp;
        zzadi zzadhVar;
        int i10 = this.zzf;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            this.zze.getClass();
                            zzacv zzacvVar = this.zzh;
                            zzacvVar.getClass();
                            zzaen zzaenVar = this.zzk;
                            if (zzaenVar != null && zzaenVar.zze()) {
                                return zzaenVar.zza(zzaclVar, zzadfVar);
                            }
                            if (this.zzm == -1) {
                                this.zzm = zzacr.zzb(zzaclVar, zzacvVar);
                                return 0;
                            }
                            zzek zzekVar = this.zzb;
                            int zze = zzekVar.zze();
                            if (zze < 32768) {
                                int zza = zzaclVar.zza(zzekVar.zzM(), zze, Variant.VT_RESERVED - zze);
                                if (zza != -1) {
                                    z10 = false;
                                }
                                if (!z10) {
                                    this.zzb.zzJ(zze + zza);
                                } else if (this.zzb.zzb() == 0) {
                                    zzg();
                                    return -1;
                                }
                            } else {
                                z10 = false;
                            }
                            zzek zzekVar2 = this.zzb;
                            int zzd = zzekVar2.zzd();
                            int i11 = this.zzl;
                            int i12 = this.zzi;
                            if (i11 < i12) {
                                zzekVar2.zzL(Math.min(i12 - i11, zzekVar2.zzb()));
                            }
                            long zza2 = zza(this.zzb, z10);
                            zzek zzekVar3 = this.zzb;
                            int zzd2 = zzekVar3.zzd() - zzd;
                            zzekVar3.zzK(zzd);
                            this.zze.zzq(this.zzb, zzd2);
                            this.zzl += zzd2;
                            if (zza2 != -1) {
                                zzg();
                                this.zzl = 0;
                                this.zzm = zza2;
                            }
                            zzek zzekVar4 = this.zzb;
                            if (zzekVar4.zzb() >= 16) {
                                return 0;
                            }
                            int zzb = zzekVar4.zzb();
                            System.arraycopy(zzekVar4.zzM(), zzekVar4.zzd(), zzekVar4.zzM(), 0, zzb);
                            this.zzb.zzK(0);
                            this.zzb.zzJ(zzb);
                            return 0;
                        }
                        zzaclVar.zzj();
                        zzek zzekVar5 = new zzek(2);
                        ((zzaby) zzaclVar).zzm(zzekVar5.zzM(), 0, 2, false);
                        int zzq = zzekVar5.zzq();
                        if ((zzq >> 2) == 16382) {
                            zzaclVar.zzj();
                            this.zzj = zzq;
                            zzacn zzacnVar = this.zzd;
                            int i13 = zzet.zza;
                            long zzf = zzaclVar.zzf();
                            long zzd3 = zzaclVar.zzd();
                            zzacv zzacvVar2 = this.zzh;
                            zzacvVar2.getClass();
                            if (zzacvVar2.zzk != null) {
                                zzadhVar = new zzact(zzacvVar2, zzf);
                            } else if (zzd3 != -1 && zzacvVar2.zzj > 0) {
                                zzaen zzaenVar2 = new zzaen(zzacvVar2, this.zzj, zzf, zzd3);
                                this.zzk = zzaenVar2;
                                zzadhVar = zzaenVar2.zzb();
                            } else {
                                zzadhVar = new zzadh(zzacvVar2.zza(), 0L);
                            }
                            zzacnVar.zzO(zzadhVar);
                            this.zzf = 5;
                            return 0;
                        }
                        zzaclVar.zzj();
                        throw zzbo.zza("First frame does not start with sync code.", null);
                    }
                    zzacv zzacvVar3 = this.zzh;
                    do {
                        zzaclVar.zzj();
                        zzej zzejVar = new zzej(new byte[4], 4);
                        zzaby zzabyVar = (zzaby) zzaclVar;
                        zzabyVar.zzm(zzejVar.zza, 0, 4, false);
                        zzp = zzejVar.zzp();
                        int zzd4 = zzejVar.zzd(7);
                        int zzd5 = zzejVar.zzd(24) + 4;
                        if (zzd4 == 0) {
                            byte[] bArr = new byte[38];
                            zzabyVar.zzn(bArr, 0, 38, false);
                            zzacvVar3 = new zzacv(bArr, 4);
                        } else if (zzacvVar3 != null) {
                            if (zzd4 == 3) {
                                zzek zzekVar6 = new zzek(zzd5);
                                zzabyVar.zzn(zzekVar6.zzM(), 0, zzd5, false);
                                zzacvVar3 = zzacvVar3.zzf(zzacs.zzb(zzekVar6));
                            } else if (zzd4 == 4) {
                                zzek zzekVar7 = new zzek(zzd5);
                                zzabyVar.zzn(zzekVar7.zzM(), 0, zzd5, false);
                                zzekVar7.zzL(4);
                                zzacvVar3 = zzacvVar3.zzg(Arrays.asList(zzadv.zzc(zzekVar7, false, false).zza));
                            } else if (zzd4 == 6) {
                                zzek zzekVar8 = new zzek(zzd5);
                                zzabyVar.zzn(zzekVar8.zzM(), 0, zzd5, false);
                                zzekVar8.zzL(4);
                                zzacvVar3 = zzacvVar3.zze(zzfxr.zzn(zzafj.zzb(zzekVar8)));
                            } else {
                                zzabyVar.zzo(zzd5, false);
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i14 = zzet.zza;
                        this.zzh = zzacvVar3;
                    } while (!zzp);
                    zzacvVar3.getClass();
                    this.zzi = Math.max(zzacvVar3.zzc, 6);
                    this.zze.zzl(this.zzh.zzc(this.zza, this.zzg));
                    this.zzf = 4;
                    return 0;
                }
                zzek zzekVar9 = new zzek(4);
                ((zzaby) zzaclVar).zzn(zzekVar9.zzM(), 0, 4, false);
                if (zzekVar9.zzu() == 1716281667) {
                    this.zzf = 3;
                    return 0;
                }
                throw zzbo.zza("Failed to read FLAC stream marker.", null);
            }
            ((zzaby) zzaclVar).zzm(this.zza, 0, 42, false);
            zzaclVar.zzj();
            this.zzf = 2;
            return 0;
        }
        zzaclVar.zzj();
        long zze2 = zzaclVar.zze();
        zzbk zza3 = zzacs.zza(zzaclVar, true);
        ((zzaby) zzaclVar).zzo((int) (zzaclVar.zze() - zze2), false);
        this.zzg = zza3;
        this.zzf = 1;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return zzfxr.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        this.zzd = zzacnVar;
        this.zze = zzacnVar.zzw(0, 1);
        zzacnVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.zzf = 0;
        } else {
            zzaen zzaenVar = this.zzk;
            if (zzaenVar != null) {
                zzaenVar.zzd(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.zzm = j12;
        this.zzl = 0;
        this.zzb.zzH(0);
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) {
        zzacs.zza(zzaclVar, false);
        zzek zzekVar = new zzek(4);
        ((zzaby) zzaclVar).zzm(zzekVar.zzM(), 0, 4, false);
        if (zzekVar.zzu() != 1716281667) {
            return false;
        }
        return true;
    }

    public zzaeo(int i10) {
        this.zza = new byte[42];
        this.zzb = new zzek(new byte[Variant.VT_RESERVED], 0);
        this.zzc = new zzacq();
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }
}
