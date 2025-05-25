package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzajq extends zzajo {
    private zzajp zza;
    private int zzb;
    private boolean zzc;
    private zzadu zzd;
    private zzads zze;

    @Override // com.google.android.gms.internal.ads.zzajo
    public final long zza(zzek zzekVar) {
        int i10;
        int i11 = 0;
        if ((zzekVar.zzM()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = zzekVar.zzM()[0];
        zzajp zzajpVar = this.zza;
        zzdi.zzb(zzajpVar);
        if (!zzajpVar.zzd[(b10 >> 1) & (FunctionEval.FunctionID.EXTERNAL_FUNC >>> (8 - zzajpVar.zze))].zza) {
            i10 = zzajpVar.zza.zze;
        } else {
            i10 = zzajpVar.zza.zzf;
        }
        if (this.zzc) {
            i11 = (this.zzb + i10) / 4;
        }
        if (zzekVar.zzc() < zzekVar.zze() + 4) {
            byte[] copyOf = Arrays.copyOf(zzekVar.zzM(), zzekVar.zze() + 4);
            zzekVar.zzI(copyOf, copyOf.length);
        } else {
            zzekVar.zzJ(zzekVar.zze() + 4);
        }
        long j10 = i11;
        byte[] zzM = zzekVar.zzM();
        zzM[zzekVar.zze() - 4] = (byte) (j10 & 255);
        zzM[zzekVar.zze() - 3] = (byte) ((j10 >>> 8) & 255);
        zzM[zzekVar.zze() - 2] = (byte) ((j10 >>> 16) & 255);
        zzM[zzekVar.zze() - 1] = (byte) ((j10 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i10;
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final boolean zzc(zzek zzekVar, long j10, zzajl zzajlVar) {
        zzajp zzajpVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        zzadu zzaduVar;
        long j11;
        int i15;
        int i16;
        int i17;
        boolean z10;
        if (this.zza != null) {
            zzajlVar.zza.getClass();
            return false;
        }
        zzadu zzaduVar2 = this.zzd;
        int i18 = 4;
        if (zzaduVar2 == null) {
            zzadv.zzd(1, zzekVar, false);
            int zzj = zzekVar.zzj();
            int zzm = zzekVar.zzm();
            int zzj2 = zzekVar.zzj();
            int zzi = zzekVar.zzi();
            if (zzi <= 0) {
                i15 = -1;
            } else {
                i15 = zzi;
            }
            int zzi2 = zzekVar.zzi();
            if (zzi2 <= 0) {
                i16 = -1;
            } else {
                i16 = zzi2;
            }
            int zzi3 = zzekVar.zzi();
            if (zzi3 <= 0) {
                i17 = -1;
            } else {
                i17 = zzi3;
            }
            int zzm2 = zzekVar.zzm();
            int pow = (int) Math.pow(2.0d, zzm2 & 15);
            int pow2 = (int) Math.pow(2.0d, (zzm2 & 240) >> 4);
            if (1 != (zzekVar.zzm() & 1)) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.zzd = new zzadu(zzj, zzm, zzj2, i15, i16, i17, pow, pow2, z10, Arrays.copyOf(zzekVar.zzM(), zzekVar.zze()));
        } else {
            zzads zzadsVar = this.zze;
            if (zzadsVar == null) {
                this.zze = zzadv.zzc(zzekVar, true, true);
            } else {
                byte[] bArr = new byte[zzekVar.zze()];
                System.arraycopy(zzekVar.zzM(), 0, bArr, 0, zzekVar.zze());
                int i19 = zzaduVar2.zza;
                int i20 = 5;
                zzadv.zzd(5, zzekVar, false);
                int zzm3 = zzekVar.zzm() + 1;
                zzadr zzadrVar = new zzadr(zzekVar.zzM());
                zzadrVar.zzc(zzekVar.zzd() * 8);
                int i21 = 0;
                while (true) {
                    int i22 = 2;
                    int i23 = 16;
                    if (i21 < zzm3) {
                        if (zzadrVar.zzb(24) == 5653314) {
                            int zzb = zzadrVar.zzb(16);
                            int zzb2 = zzadrVar.zzb(24);
                            if (!zzadrVar.zzd()) {
                                boolean zzd = zzadrVar.zzd();
                                for (int i24 = 0; i24 < zzb2; i24++) {
                                    if (zzd) {
                                        if (zzadrVar.zzd()) {
                                            zzadrVar.zzc(5);
                                        }
                                    } else {
                                        zzadrVar.zzc(5);
                                    }
                                }
                            } else {
                                zzadrVar.zzc(5);
                                for (int i25 = 0; i25 < zzb2; i25 += zzadrVar.zzb(zzadv.zza(zzb2 - i25))) {
                                }
                            }
                            int zzb3 = zzadrVar.zzb(i18);
                            if (zzb3 <= 2) {
                                if (zzb3 != 1) {
                                    if (zzb3 != 2) {
                                        zzaduVar = zzaduVar2;
                                        i21++;
                                        zzaduVar2 = zzaduVar;
                                        i18 = 4;
                                    }
                                } else {
                                    i22 = zzb3;
                                }
                                zzadrVar.zzc(32);
                                zzadrVar.zzc(32);
                                int zzb4 = zzadrVar.zzb(i18) + 1;
                                zzadrVar.zzc(1);
                                if (i22 == 1) {
                                    if (zzb != 0) {
                                        zzaduVar = zzaduVar2;
                                        j11 = (long) Math.floor(Math.pow(zzb2, 1.0d / zzb));
                                    } else {
                                        zzaduVar = zzaduVar2;
                                        j11 = 0;
                                    }
                                } else {
                                    zzaduVar = zzaduVar2;
                                    j11 = zzb * zzb2;
                                }
                                zzadrVar.zzc((int) (j11 * zzb4));
                                i21++;
                                zzaduVar2 = zzaduVar;
                                i18 = 4;
                            } else {
                                throw zzbo.zza("lookup type greater than 2 not decodable: " + zzb3, null);
                            }
                        } else {
                            throw zzbo.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzadrVar.zza(), null);
                        }
                    } else {
                        zzadu zzaduVar3 = zzaduVar2;
                        int i26 = 6;
                        int zzb5 = zzadrVar.zzb(6) + 1;
                        for (int i27 = 0; i27 < zzb5; i27++) {
                            if (zzadrVar.zzb(16) != 0) {
                                throw zzbo.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i28 = 1;
                        int zzb6 = zzadrVar.zzb(6) + 1;
                        int i29 = 0;
                        while (true) {
                            int i30 = 3;
                            if (i29 < zzb6) {
                                int zzb7 = zzadrVar.zzb(i23);
                                if (zzb7 != 0) {
                                    if (zzb7 == i28) {
                                        int zzb8 = zzadrVar.zzb(i20);
                                        int[] iArr = new int[zzb8];
                                        int i31 = -1;
                                        for (int i32 = 0; i32 < zzb8; i32++) {
                                            int zzb9 = zzadrVar.zzb(4);
                                            iArr[i32] = zzb9;
                                            if (zzb9 > i31) {
                                                i31 = zzb9;
                                            }
                                        }
                                        int i33 = i31 + 1;
                                        int[] iArr2 = new int[i33];
                                        int i34 = 0;
                                        while (i34 < i33) {
                                            iArr2[i34] = zzadrVar.zzb(i30) + 1;
                                            int zzb10 = zzadrVar.zzb(i22);
                                            if (zzb10 > 0) {
                                                i14 = 8;
                                                zzadrVar.zzc(8);
                                            } else {
                                                i14 = 8;
                                            }
                                            int i35 = zzb6;
                                            int i36 = 0;
                                            for (int i37 = 1; i36 < (i37 << zzb10); i37 = 1) {
                                                zzadrVar.zzc(i14);
                                                i36++;
                                                i14 = 8;
                                            }
                                            i34++;
                                            zzb6 = i35;
                                            i22 = 2;
                                            i30 = 3;
                                        }
                                        i13 = zzb6;
                                        zzadrVar.zzc(i22);
                                        int zzb11 = zzadrVar.zzb(4);
                                        int i38 = 0;
                                        int i39 = 0;
                                        for (int i40 = 0; i40 < zzb8; i40++) {
                                            i38 += iArr2[iArr[i40]];
                                            while (i39 < i38) {
                                                zzadrVar.zzc(zzb11);
                                                i39++;
                                            }
                                        }
                                    } else {
                                        throw zzbo.zza("floor type greater than 1 not decodable: " + zzb7, null);
                                    }
                                } else {
                                    i13 = zzb6;
                                    int i41 = 8;
                                    zzadrVar.zzc(8);
                                    zzadrVar.zzc(16);
                                    zzadrVar.zzc(16);
                                    zzadrVar.zzc(6);
                                    zzadrVar.zzc(8);
                                    int zzb12 = zzadrVar.zzb(4) + 1;
                                    int i42 = 0;
                                    while (i42 < zzb12) {
                                        zzadrVar.zzc(i41);
                                        i42++;
                                        i41 = 8;
                                    }
                                }
                                i29++;
                                zzb6 = i13;
                                i26 = 6;
                                i23 = 16;
                                i22 = 2;
                                i28 = 1;
                                i20 = 5;
                            } else {
                                int i43 = 1;
                                int zzb13 = zzadrVar.zzb(i26) + 1;
                                int i44 = 0;
                                while (i44 < zzb13) {
                                    if (zzadrVar.zzb(16) <= 2) {
                                        zzadrVar.zzc(24);
                                        zzadrVar.zzc(24);
                                        zzadrVar.zzc(24);
                                        int zzb14 = zzadrVar.zzb(i26) + i43;
                                        int i45 = 8;
                                        zzadrVar.zzc(8);
                                        int[] iArr3 = new int[zzb14];
                                        for (int i46 = 0; i46 < zzb14; i46++) {
                                            int zzb15 = zzadrVar.zzb(3);
                                            if (zzadrVar.zzd()) {
                                                i12 = zzadrVar.zzb(5);
                                            } else {
                                                i12 = 0;
                                            }
                                            iArr3[i46] = (i12 * 8) + zzb15;
                                        }
                                        int i47 = 0;
                                        while (i47 < zzb14) {
                                            int i48 = 0;
                                            while (i48 < i45) {
                                                if ((iArr3[i47] & (1 << i48)) != 0) {
                                                    zzadrVar.zzc(i45);
                                                }
                                                i48++;
                                                i45 = 8;
                                            }
                                            i47++;
                                            i45 = 8;
                                        }
                                        i44++;
                                        i26 = 6;
                                        i43 = 1;
                                    } else {
                                        throw zzbo.zza("residueType greater than 2 is not decodable", null);
                                    }
                                }
                                int zzb16 = zzadrVar.zzb(i26) + 1;
                                for (int i49 = 0; i49 < zzb16; i49++) {
                                    int zzb17 = zzadrVar.zzb(16);
                                    if (zzb17 != 0) {
                                        zzea.zzc("VorbisUtil", "mapping type other than 0 not supported: " + zzb17);
                                    } else {
                                        if (zzadrVar.zzd()) {
                                            i10 = 1;
                                            i11 = zzadrVar.zzb(4) + 1;
                                        } else {
                                            i10 = 1;
                                            i11 = 1;
                                        }
                                        if (zzadrVar.zzd()) {
                                            int zzb18 = zzadrVar.zzb(8) + i10;
                                            for (int i50 = 0; i50 < zzb18; i50++) {
                                                int i51 = i19 - 1;
                                                zzadrVar.zzc(zzadv.zza(i51));
                                                zzadrVar.zzc(zzadv.zza(i51));
                                            }
                                        }
                                        if (zzadrVar.zzb(2) == 0) {
                                            if (i11 > 1) {
                                                for (int i52 = 0; i52 < i19; i52++) {
                                                    zzadrVar.zzc(4);
                                                }
                                            }
                                            for (int i53 = 0; i53 < i11; i53++) {
                                                zzadrVar.zzc(8);
                                                zzadrVar.zzc(8);
                                                zzadrVar.zzc(8);
                                            }
                                        } else {
                                            throw zzbo.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                    }
                                }
                                int zzb19 = zzadrVar.zzb(6) + 1;
                                zzadt[] zzadtVarArr = new zzadt[zzb19];
                                for (int i54 = 0; i54 < zzb19; i54++) {
                                    zzadtVarArr[i54] = new zzadt(zzadrVar.zzd(), zzadrVar.zzb(16), zzadrVar.zzb(16), zzadrVar.zzb(8));
                                }
                                if (zzadrVar.zzd()) {
                                    zzajpVar = new zzajp(zzaduVar3, zzadsVar, bArr, zzadtVarArr, zzadv.zza(zzb19 - 1));
                                } else {
                                    throw zzbo.zza("framing bit after modes not set as expected", null);
                                }
                            }
                        }
                    }
                }
            }
        }
        zzajpVar = null;
        this.zza = zzajpVar;
        if (zzajpVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzadu zzaduVar4 = zzajpVar.zza;
        arrayList.add(zzaduVar4.zzg);
        arrayList.add(zzajpVar.zzc);
        zzbk zzb20 = zzadv.zzb(zzfxr.zzl(zzajpVar.zzb.zza));
        zzad zzadVar = new zzad();
        zzadVar.zzX("audio/vorbis");
        zzadVar.zzx(zzaduVar4.zzd);
        zzadVar.zzS(zzaduVar4.zzc);
        zzadVar.zzy(zzaduVar4.zza);
        zzadVar.zzY(zzaduVar4.zzb);
        zzadVar.zzL(arrayList);
        zzadVar.zzQ(zzb20);
        zzajlVar.zza = zzadVar.zzad();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final void zzi(long j10) {
        boolean z10;
        super.zzi(j10);
        int i10 = 0;
        if (j10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzc = z10;
        zzadu zzaduVar = this.zzd;
        if (zzaduVar != null) {
            i10 = zzaduVar.zze;
        }
        this.zzb = i10;
    }
}
