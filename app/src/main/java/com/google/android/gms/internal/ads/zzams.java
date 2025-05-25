package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzams implements zzamf {
    private String zze;
    private zzadp zzf;
    private boolean zzi;
    private int zzk;
    private int zzl;
    private int zzn;
    private int zzo;
    private int zzs;
    private boolean zzu;
    private int zzd = 0;
    private final zzek zza = new zzek(new byte[15], 2);
    private final zzej zzb = new zzej();
    private final zzek zzc = new zzek();
    private final zzamt zzp = new zzamt();
    private int zzq = -2147483647;
    private int zzr = -1;
    private long zzt = -1;
    private boolean zzj = true;
    private boolean zzm = true;
    private double zzg = -9.223372036854776E18d;
    private double zzh = -9.223372036854776E18d;

    private static final void zzf(zzek zzekVar, zzek zzekVar2, boolean z10) {
        int zzd = zzekVar.zzd();
        int min = Math.min(zzekVar.zzb(), zzekVar2.zzb());
        zzekVar.zzG(zzekVar2.zzM(), zzekVar2.zzd(), min);
        zzekVar2.zzL(min);
        if (z10) {
            zzekVar.zzK(zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(zzek zzekVar) {
        int i10;
        zzdi.zzb(this.zzf);
        while (zzekVar.zzb() > 0) {
            int i11 = this.zzd;
            int i12 = 0;
            if (i11 != 0) {
                if (i11 != 1) {
                    int i13 = this.zzp.zza;
                    if (i13 == 1 || i13 == 17) {
                        zzf(zzekVar, this.zzc, true);
                    }
                    int min = Math.min(zzekVar.zzb(), this.zzp.zzc - this.zzn);
                    this.zzf.zzq(zzekVar, min);
                    int i14 = this.zzn + min;
                    this.zzn = i14;
                    zzamt zzamtVar = this.zzp;
                    if (i14 == zzamtVar.zzc) {
                        int i15 = zzamtVar.zza;
                        if (i15 == 1) {
                            byte[] zzM = this.zzc.zzM();
                            zzamv zza = zzamw.zza(new zzej(zzM, zzM.length));
                            this.zzq = zza.zzb;
                            this.zzr = zza.zzc;
                            long j10 = this.zzt;
                            long j11 = this.zzp.zzb;
                            if (j10 != j11) {
                                this.zzt = j11;
                                int i16 = zza.zza;
                                String str = "mhm1";
                                if (i16 != -1) {
                                    str = "mhm1".concat(String.valueOf(String.format(".%02X", Integer.valueOf(i16))));
                                }
                                byte[] bArr = zza.zzd;
                                zzfxr zzfxrVar = null;
                                if (bArr != null && bArr.length > 0) {
                                    zzfxrVar = zzfxr.zzo(zzet.zzf, bArr);
                                }
                                zzad zzadVar = new zzad();
                                zzadVar.zzK(this.zze);
                                zzadVar.zzX("audio/mhm1");
                                zzadVar.zzY(this.zzq);
                                zzadVar.zzz(str);
                                zzadVar.zzL(zzfxrVar);
                                this.zzf.zzl(zzadVar.zzad());
                            }
                            this.zzu = true;
                        } else if (i15 == 17) {
                            byte[] zzM2 = this.zzc.zzM();
                            zzej zzejVar = new zzej(zzM2, zzM2.length);
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(2);
                                i12 = zzejVar.zzd(13);
                            }
                            this.zzs = i12;
                        } else if (i15 == 2) {
                            if (this.zzu) {
                                this.zzj = false;
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            int i17 = this.zzr - this.zzs;
                            double d10 = this.zzq;
                            long round = Math.round(this.zzg);
                            if (this.zzi) {
                                this.zzi = false;
                                this.zzg = this.zzh;
                            } else {
                                this.zzg += (i17 * 1000000.0d) / d10;
                            }
                            this.zzf.zzs(round, i10, this.zzo, 0, null);
                            this.zzu = false;
                            this.zzs = 0;
                            this.zzo = 0;
                        }
                        this.zzd = 1;
                    }
                } else {
                    zzf(zzekVar, this.zza, false);
                    zzek zzekVar2 = this.zza;
                    if (zzekVar2.zzb() == 0) {
                        zzej zzejVar2 = this.zzb;
                        int zze = zzekVar2.zze();
                        zzejVar2.zzk(zzekVar2.zzM(), zze);
                        if (zzamw.zzb(this.zzb, this.zzp)) {
                            this.zzn = 0;
                            this.zzo = this.zzp.zzc + zze + this.zzo;
                            this.zza.zzK(0);
                            zzadp zzadpVar = this.zzf;
                            zzek zzekVar3 = this.zza;
                            zzadpVar.zzq(zzekVar3, zzekVar3.zze());
                            this.zza.zzH(2);
                            this.zzc.zzH(this.zzp.zzc);
                            this.zzm = true;
                            this.zzd = 2;
                        } else {
                            zzek zzekVar4 = this.zza;
                            if (zzekVar4.zze() < 15) {
                                zzekVar4.zzJ(zzekVar4.zze() + 1);
                            }
                        }
                    }
                    this.zzm = false;
                }
            } else {
                int i18 = this.zzk;
                if ((i18 & 2) == 0) {
                    zzekVar.zzK(zzekVar.zze());
                } else {
                    if ((i18 & 4) == 0) {
                        while (zzekVar.zzb() > 0) {
                            int i19 = this.zzl << 8;
                            this.zzl = i19;
                            int zzm = i19 | zzekVar.zzm();
                            this.zzl = zzm;
                            if ((zzm & 16777215) == 12583333) {
                                zzekVar.zzK(zzekVar.zzd() - 3);
                                this.zzl = 0;
                            }
                        }
                    }
                    this.zzd = 1;
                    break;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        zzansVar.zzc();
        this.zze = zzansVar.zzb();
        this.zzf = zzacnVar.zzw(zzansVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzd(long j10, int i10) {
        this.zzk = i10;
        if (!this.zzj && (this.zzo != 0 || !this.zzm)) {
            this.zzi = true;
        }
        if (j10 != -9223372036854775807L) {
            double d10 = j10;
            if (this.zzi) {
                this.zzh = d10;
            } else {
                this.zzg = d10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zze() {
        this.zzd = 0;
        this.zzl = 0;
        this.zza.zzH(2);
        this.zzn = 0;
        this.zzo = 0;
        this.zzq = -2147483647;
        this.zzr = -1;
        this.zzs = 0;
        this.zzt = -1L;
        this.zzu = false;
        this.zzi = false;
        this.zzm = true;
        this.zzj = true;
        this.zzg = -9.223372036854776E18d;
        this.zzh = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z10) {
    }
}
