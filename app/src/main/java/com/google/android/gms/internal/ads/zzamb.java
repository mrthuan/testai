package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzamb implements zzamf {
    private static final byte[] zza = {Field.TOA, Field.INCLUDETEXT, Field.MACROBUTTON};
    private final boolean zzb;
    private final zzej zzc = new zzej(new byte[7], 7);
    private final zzek zzd = new zzek(Arrays.copyOf(zza, 10));
    private final String zze;
    private final int zzf;
    private String zzg;
    private zzadp zzh;
    private zzadp zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private zzadp zzv;
    private long zzw;

    public zzamb(boolean z10, String str, int i10) {
        zzh();
        this.zzo = -1;
        this.zzp = -1;
        this.zzs = -9223372036854775807L;
        this.zzu = -9223372036854775807L;
        this.zzb = z10;
        this.zze = str;
        this.zzf = i10;
    }

    public static boolean zzf(int i10) {
        if ((i10 & 65526) == 65520) {
            return true;
        }
        return false;
    }

    private final void zzg() {
        this.zzn = false;
        zzh();
    }

    private final void zzh() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 256;
    }

    private final void zzi() {
        this.zzj = 3;
        this.zzk = 0;
    }

    private final void zzj(zzadp zzadpVar, long j10, int i10, int i11) {
        this.zzj = 4;
        this.zzk = i10;
        this.zzv = zzadpVar;
        this.zzw = j10;
        this.zzt = i11;
    }

    private final boolean zzk(zzek zzekVar, byte[] bArr, int i10) {
        int min = Math.min(zzekVar.zzb(), i10 - this.zzk);
        zzekVar.zzG(bArr, this.zzk, min);
        int i11 = this.zzk + min;
        this.zzk = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private static final boolean zzl(byte b10, byte b11) {
        return zzf((b11 & 255) | 65280);
    }

    private static final boolean zzm(zzek zzekVar, byte[] bArr, int i10) {
        if (zzekVar.zzb() < i10) {
            return false;
        }
        zzekVar.zzG(bArr, 0, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(zzek zzekVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        this.zzh.getClass();
        int i15 = zzet.zza;
        while (zzekVar.zzb() > 0) {
            int i16 = this.zzj;
            int i17 = 13;
            boolean z11 = false;
            int i18 = 2;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            int min = Math.min(zzekVar.zzb(), this.zzt - this.zzk);
                            this.zzv.zzq(zzekVar, min);
                            int i19 = this.zzk + min;
                            this.zzk = i19;
                            if (i19 == this.zzt) {
                                if (this.zzu != -9223372036854775807L) {
                                    z11 = true;
                                }
                                zzdi.zzf(z11);
                                this.zzv.zzs(this.zzu, 1, this.zzt, 0, null);
                                this.zzu += this.zzw;
                                zzh();
                            }
                        } else {
                            if (true != this.zzm) {
                                i10 = 5;
                            } else {
                                i10 = 7;
                            }
                            if (zzk(zzekVar, this.zzc.zza, i10)) {
                                this.zzc.zzl(0);
                                if (!this.zzr) {
                                    int zzd = this.zzc.zzd(2) + 1;
                                    if (zzd != 2) {
                                        zzea.zzf("AdtsReader", "Detected audio object type: " + zzd + ", but assuming AAC LC.");
                                    }
                                    this.zzc.zzn(5);
                                    int zzd2 = this.zzc.zzd(3);
                                    int i20 = this.zzp;
                                    byte[] bArr = {(byte) (((i20 >> 1) & 7) | 16), (byte) (((zzd2 << 3) & 120) | ((i20 << 7) & 128))};
                                    zzabf zza2 = zzabg.zza(bArr);
                                    zzad zzadVar = new zzad();
                                    zzadVar.zzK(this.zzg);
                                    zzadVar.zzX("audio/mp4a-latm");
                                    zzadVar.zzz(zza2.zzc);
                                    zzadVar.zzy(zza2.zzb);
                                    zzadVar.zzY(zza2.zza);
                                    zzadVar.zzL(Collections.singletonList(bArr));
                                    zzadVar.zzO(this.zze);
                                    zzadVar.zzV(this.zzf);
                                    zzaf zzad = zzadVar.zzad();
                                    this.zzs = 1024000000 / zzad.zzA;
                                    this.zzh.zzl(zzad);
                                    this.zzr = true;
                                } else {
                                    this.zzc.zzn(10);
                                }
                                this.zzc.zzn(4);
                                int zzd3 = this.zzc.zzd(13) - 7;
                                if (this.zzm) {
                                    zzd3 -= 2;
                                }
                                zzj(this.zzh, this.zzs, 0, zzd3);
                            }
                        }
                    } else if (zzk(zzekVar, this.zzd.zzM(), 10)) {
                        this.zzi.zzq(this.zzd, 10);
                        this.zzd.zzK(6);
                        zzj(this.zzi, 0L, 10, 10 + this.zzd.zzl());
                    }
                } else if (zzekVar.zzb() != 0) {
                    zzej zzejVar = this.zzc;
                    zzejVar.zza[0] = zzekVar.zzM()[zzekVar.zzd()];
                    zzejVar.zzl(2);
                    int zzd4 = this.zzc.zzd(4);
                    int i21 = this.zzp;
                    if (i21 != -1 && zzd4 != i21) {
                        zzg();
                    } else {
                        if (!this.zzn) {
                            this.zzn = true;
                            this.zzo = this.zzq;
                            this.zzp = zzd4;
                        }
                        zzi();
                    }
                }
            } else {
                byte[] zzM = zzekVar.zzM();
                int zzd5 = zzekVar.zzd();
                int zze = zzekVar.zze();
                while (true) {
                    if (zzd5 < zze) {
                        i11 = zzd5 + 1;
                        i12 = zzM[zzd5] & 255;
                        if (this.zzl == 512 && zzl((byte) -1, (byte) i12)) {
                            if (!this.zzn) {
                                int i22 = i11 - 2;
                                zzekVar.zzK(i22 + 1);
                                if (zzm(zzekVar, this.zzc.zza, 1)) {
                                    this.zzc.zzl(4);
                                    int zzd6 = this.zzc.zzd(1);
                                    int i23 = this.zzo;
                                    if (i23 == -1 || zzd6 == i23) {
                                        if (this.zzp != -1) {
                                            if (!zzm(zzekVar, this.zzc.zza, 1)) {
                                                break;
                                            }
                                            this.zzc.zzl(i18);
                                            if (this.zzc.zzd(4) == this.zzp) {
                                                zzekVar.zzK(i22 + 2);
                                            }
                                        }
                                        if (!zzm(zzekVar, this.zzc.zza, 4)) {
                                            break;
                                        }
                                        this.zzc.zzl(14);
                                        int zzd7 = this.zzc.zzd(i17);
                                        if (zzd7 >= 7) {
                                            byte[] zzM2 = zzekVar.zzM();
                                            int zze2 = zzekVar.zze();
                                            int i24 = i22 + zzd7;
                                            if (i24 < zze2) {
                                                byte b10 = zzM2[i24];
                                                if (b10 == -1) {
                                                    int i25 = i24 + 1;
                                                    if (i25 == zze2) {
                                                        break;
                                                    }
                                                    byte b11 = zzM2[i25];
                                                    if (zzl((byte) -1, b11) && ((b11 & 8) >> 3) == zzd6) {
                                                        break;
                                                    }
                                                } else if (b10 == 73) {
                                                    int i26 = i24 + 1;
                                                    if (i26 == zze2) {
                                                        break;
                                                    } else if (zzM2[i26] == 68) {
                                                        int i27 = i24 + 2;
                                                        if (i27 == zze2) {
                                                            break;
                                                        } else if (zzM2[i27] == 51) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        int i28 = this.zzl;
                        int i29 = i28 | i12;
                        if (i29 != 329) {
                            if (i29 != 511) {
                                if (i29 != 836) {
                                    if (i29 != 1075) {
                                        if (i28 != 256) {
                                            this.zzl = 256;
                                            zzd5 = i11 - 1;
                                            i17 = 13;
                                            i18 = 2;
                                        } else {
                                            i13 = 2;
                                            i18 = i13;
                                            zzd5 = i11;
                                            i17 = 13;
                                        }
                                    } else {
                                        this.zzj = 2;
                                        this.zzk = 3;
                                        this.zzt = 0;
                                        this.zzd.zzK(0);
                                        zzekVar.zzK(i11);
                                        break;
                                    }
                                } else {
                                    i13 = 2;
                                    i14 = 1024;
                                }
                            } else {
                                i13 = 2;
                                i14 = 512;
                            }
                        } else {
                            i13 = 2;
                            i14 = 768;
                        }
                        this.zzl = i14;
                        i18 = i13;
                        zzd5 = i11;
                        i17 = 13;
                    } else {
                        zzekVar.zzK(zzd5);
                        break;
                    }
                }
                this.zzq = (i12 & 8) >> 3;
                if (1 != ((i12 & 1) ^ 1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.zzm = z10;
                if (!this.zzn) {
                    this.zzj = 1;
                    this.zzk = 0;
                } else {
                    zzi();
                }
                zzekVar.zzK(i11);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        zzansVar.zzc();
        this.zzg = zzansVar.zzb();
        zzadp zzw = zzacnVar.zzw(zzansVar.zza(), 1);
        this.zzh = zzw;
        this.zzv = zzw;
        if (this.zzb) {
            zzansVar.zzc();
            zzadp zzw2 = zzacnVar.zzw(zzansVar.zza(), 5);
            this.zzi = zzw2;
            zzad zzadVar = new zzad();
            zzadVar.zzK(zzansVar.zzb());
            zzadVar.zzX("application/id3");
            zzw2.zzl(zzadVar.zzad());
            return;
        }
        this.zzi = new zzacj();
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzd(long j10, int i10) {
        this.zzu = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zze() {
        this.zzu = -9223372036854775807L;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z10) {
    }
}
