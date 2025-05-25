package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzahj implements zzack {
    private static final byte[] zza = {Field.EQ, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, Field.DDE, Field.DDE, Field.USERADDRESS, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final UUID zze;
    private static final Map zzf;
    private long zzA;
    private long zzB;
    private zzahi zzC;
    private boolean zzD;
    private int zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private long zzJ;
    private zzeb zzK;
    private zzeb zzL;
    private boolean zzM;
    private boolean zzN;
    private int zzO;
    private long zzP;
    private long zzQ;
    private int zzR;
    private int zzS;
    private int[] zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private long zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private int zzag;
    private byte zzah;
    private boolean zzai;
    private zzacn zzaj;
    private final zzahf zzg;
    private final zzahl zzh;
    private final SparseArray zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final zzajy zzl;
    private final zzek zzm;
    private final zzek zzn;
    private final zzek zzo;
    private final zzek zzp;
    private final zzek zzq;
    private final zzek zzr;
    private final zzek zzs;
    private final zzek zzt;
    private final zzek zzu;
    private final zzek zzv;
    private ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i10 = zzet.zza;
        zzb = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(zzfuj.zzc);
        zzc = new byte[]{Field.INCLUDETEXT, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zzd = new byte[]{Field.CONTROL, Field.FILESIZE, Field.SECTIONPAGES, 86, Field.ADVANCE, Field.ADVANCE, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, Field.DDEAUTO, 48, 48, 48, 32, Field.DDE, Field.DDE, Field.USERADDRESS, 32, 48, 48, 58, 48, 48, 58, 48, 48, Field.DDEAUTO, 48, 48, 48, 10};
        zze = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", Integer.valueOf((int) ShapeTypes.MATH_EQUAL));
        hashMap.put("htc_video_rotA-270", 270);
        zzf = Collections.unmodifiableMap(hashMap);
    }

    @Deprecated
    public zzahj() {
        this(new zzahd(), 2, zzajy.zza);
    }

    private static int[] zzA(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        if (length >= i10) {
            return iArr;
        }
        return new int[Math.max(length + length, i10)];
    }

    private final int zzq(zzacl zzaclVar, zzahi zzahiVar, int i10, boolean z10) {
        int i11;
        if ("S_TEXT/UTF8".equals(zzahiVar.zzb)) {
            zzy(zzaclVar, zza, i10);
            int i12 = this.zzab;
            zzx();
            return i12;
        } else if ("S_TEXT/ASS".equals(zzahiVar.zzb)) {
            zzy(zzaclVar, zzc, i10);
            int i13 = this.zzab;
            zzx();
            return i13;
        } else if ("S_TEXT/WEBVTT".equals(zzahiVar.zzb)) {
            zzy(zzaclVar, zzd, i10);
            int i14 = this.zzab;
            zzx();
            return i14;
        } else {
            zzadp zzadpVar = zzahiVar.zzW;
            boolean z11 = true;
            if (!this.zzad) {
                if (zzahiVar.zzg) {
                    this.zzW &= -1073741825;
                    int i15 = 128;
                    if (!this.zzae) {
                        ((zzaby) zzaclVar).zzn(this.zzo.zzM(), 0, 1, false);
                        this.zzaa++;
                        if ((this.zzo.zzM()[0] & 128) != 128) {
                            this.zzah = this.zzo.zzM()[0];
                            this.zzae = true;
                        } else {
                            throw zzbo.zza("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b10 = this.zzah;
                    if ((b10 & 1) == 1) {
                        int i16 = b10 & 2;
                        this.zzW |= 1073741824;
                        if (!this.zzai) {
                            ((zzaby) zzaclVar).zzn(this.zzt.zzM(), 0, 8, false);
                            this.zzaa += 8;
                            this.zzai = true;
                            zzek zzekVar = this.zzo;
                            if (i16 != 2) {
                                i15 = 0;
                            }
                            zzekVar.zzM()[0] = (byte) (i15 | 8);
                            this.zzo.zzK(0);
                            zzadpVar.zzr(this.zzo, 1, 1);
                            this.zzab++;
                            this.zzt.zzK(0);
                            zzadpVar.zzr(this.zzt, 8, 1);
                            this.zzab += 8;
                        }
                        if (i16 == 2) {
                            if (!this.zzaf) {
                                ((zzaby) zzaclVar).zzn(this.zzo.zzM(), 0, 1, false);
                                this.zzaa++;
                                this.zzo.zzK(0);
                                this.zzag = this.zzo.zzm();
                                this.zzaf = true;
                            }
                            int i17 = this.zzag * 4;
                            this.zzo.zzH(i17);
                            ((zzaby) zzaclVar).zzn(this.zzo.zzM(), 0, i17, false);
                            this.zzaa += i17;
                            int i18 = (this.zzag >> 1) + 1;
                            int i19 = (i18 * 6) + 2;
                            ByteBuffer byteBuffer = this.zzw;
                            if (byteBuffer == null || byteBuffer.capacity() < i19) {
                                this.zzw = ByteBuffer.allocate(i19);
                            }
                            this.zzw.position(0);
                            this.zzw.putShort((short) i18);
                            int i20 = 0;
                            int i21 = 0;
                            while (true) {
                                i11 = this.zzag;
                                if (i20 >= i11) {
                                    break;
                                }
                                int zzp = this.zzo.zzp();
                                int i22 = zzp - i21;
                                if (i20 % 2 == 0) {
                                    this.zzw.putShort((short) i22);
                                } else {
                                    this.zzw.putInt(i22);
                                }
                                i20++;
                                i21 = zzp;
                            }
                            int i23 = (i10 - this.zzaa) - i21;
                            if ((i11 & 1) == 1) {
                                this.zzw.putInt(i23);
                            } else {
                                this.zzw.putShort((short) i23);
                                this.zzw.putInt(0);
                            }
                            this.zzu.zzI(this.zzw.array(), i19);
                            zzadpVar.zzr(this.zzu, i19, 1);
                            this.zzab += i19;
                        }
                    }
                } else {
                    byte[] bArr = zzahiVar.zzh;
                    if (bArr != null) {
                        this.zzr.zzI(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(zzahiVar.zzb) ? zzahiVar.zzf > 0 : z10) {
                    this.zzW |= 268435456;
                    this.zzv.zzH(0);
                    int zze2 = (this.zzr.zze() + i10) - this.zzaa;
                    this.zzo.zzH(4);
                    this.zzo.zzM()[0] = (byte) ((zze2 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                    this.zzo.zzM()[1] = (byte) ((zze2 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                    this.zzo.zzM()[2] = (byte) ((zze2 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                    this.zzo.zzM()[3] = (byte) (zze2 & FunctionEval.FunctionID.EXTERNAL_FUNC);
                    zzadpVar.zzr(this.zzo, 4, 2);
                    this.zzab += 4;
                }
                this.zzad = true;
            }
            int zze3 = this.zzr.zze() + i10;
            if (!"V_MPEG4/ISO/AVC".equals(zzahiVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzahiVar.zzb)) {
                if (zzahiVar.zzT != null) {
                    if (this.zzr.zze() != 0) {
                        z11 = false;
                    }
                    zzdi.zzf(z11);
                    zzahiVar.zzT.zzd(zzaclVar);
                }
                while (true) {
                    int i24 = this.zzaa;
                    if (i24 >= zze3) {
                        break;
                    }
                    int zzr = zzr(zzaclVar, zzadpVar, zze3 - i24);
                    this.zzaa += zzr;
                    this.zzab += zzr;
                }
            } else {
                byte[] zzM = this.zzn.zzM();
                zzM[0] = 0;
                zzM[1] = 0;
                zzM[2] = 0;
                int i25 = zzahiVar.zzX;
                int i26 = 4 - i25;
                while (this.zzaa < zze3) {
                    int i27 = this.zzac;
                    if (i27 == 0) {
                        int min = Math.min(i25, this.zzr.zzb());
                        ((zzaby) zzaclVar).zzn(zzM, i26 + min, i25 - min, false);
                        if (min > 0) {
                            this.zzr.zzG(zzM, i26, min);
                        }
                        this.zzaa += i25;
                        this.zzn.zzK(0);
                        this.zzac = this.zzn.zzp();
                        this.zzm.zzK(0);
                        zzadpVar.zzq(this.zzm, 4);
                        this.zzab += 4;
                    } else {
                        int zzr2 = zzr(zzaclVar, zzadpVar, i27);
                        this.zzaa += zzr2;
                        this.zzab += zzr2;
                        this.zzac -= zzr2;
                    }
                }
            }
            if ("A_VORBIS".equals(zzahiVar.zzb)) {
                this.zzp.zzK(0);
                zzadpVar.zzq(this.zzp, 4);
                this.zzab += 4;
            }
            int i28 = this.zzab;
            zzx();
            return i28;
        }
    }

    private final int zzr(zzacl zzaclVar, zzadp zzadpVar, int i10) {
        int zzb2 = this.zzr.zzb();
        if (zzb2 > 0) {
            int min = Math.min(i10, zzb2);
            zzadpVar.zzq(this.zzr, min);
            return min;
        }
        return zzadpVar.zzf(zzaclVar, i10, false);
    }

    private final long zzs(long j10) {
        long j11 = this.zzz;
        if (j11 != -9223372036854775807L) {
            return zzet.zzt(j10, j11, 1000L, RoundingMode.FLOOR);
        }
        throw zzbo.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void zzt(int i10) {
        if (this.zzK != null && this.zzL != null) {
            return;
        }
        throw zzbo.zza("Element " + i10 + " must be in a Cues", null);
    }

    private final void zzu(int i10) {
        if (this.zzC != null) {
            return;
        }
        throw zzbo.zza("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0 A[EDGE_INSN: B:62:0x00e0->B:51:0x00e0 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzv(com.google.android.gms.internal.ads.zzahi r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahj.zzv(com.google.android.gms.internal.ads.zzahi, long, int, int, int):void");
    }

    private final void zzw(zzacl zzaclVar, int i10) {
        if (this.zzo.zze() >= i10) {
            return;
        }
        if (this.zzo.zzc() < i10) {
            zzek zzekVar = this.zzo;
            int zzc2 = zzekVar.zzc();
            zzekVar.zzE(Math.max(zzc2 + zzc2, i10));
        }
        zzek zzekVar2 = this.zzo;
        ((zzaby) zzaclVar).zzn(zzekVar2.zzM(), zzekVar2.zze(), i10 - zzekVar2.zze(), false);
        this.zzo.zzJ(i10);
    }

    private final void zzx() {
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = 0;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = false;
        this.zzag = 0;
        this.zzah = (byte) 0;
        this.zzai = false;
        this.zzr.zzH(0);
    }

    private final void zzy(zzacl zzaclVar, byte[] bArr, int i10) {
        int length = bArr.length;
        int i11 = length + i10;
        if (this.zzs.zzc() < i11) {
            zzek zzekVar = this.zzs;
            byte[] copyOf = Arrays.copyOf(bArr, i11 + i10);
            zzekVar.zzI(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzs.zzM(), 0, length);
        }
        ((zzaby) zzaclVar).zzn(this.zzs.zzM(), length, i10, false);
        this.zzs.zzK(0);
        this.zzs.zzJ(i11);
    }

    private static byte[] zzz(long j10, String str, long j11) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzd(z10);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11)));
        int i13 = zzet.zza;
        return format.getBytes(zzfuj.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) {
        this.zzN = false;
        while (!this.zzN) {
            if (this.zzg.zzc(zzaclVar)) {
                long zzf2 = zzaclVar.zzf();
                if (this.zzG) {
                    this.zzI = zzf2;
                    zzadfVar.zza = this.zzH;
                    this.zzG = false;
                    return 1;
                } else if (this.zzD) {
                    long j10 = this.zzI;
                    if (j10 != -1) {
                        zzadfVar.zza = j10;
                        this.zzI = -1L;
                        return 1;
                    }
                }
            } else {
                for (int i10 = 0; i10 < this.zzi.size(); i10++) {
                    zzahi zzahiVar = (zzahi) this.zzi.valueAt(i10);
                    zzahi.zzd(zzahiVar);
                    zzadq zzadqVar = zzahiVar.zzT;
                    if (zzadqVar != null) {
                        zzadqVar.zza(zzahiVar.zzW, zzahiVar.zzi);
                    }
                }
                return -1;
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return zzfxr.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        this.zzaj = zzacnVar;
        if (this.zzk) {
            zzacnVar = new zzakc(zzacnVar, this.zzl);
        }
        this.zzaj = zzacnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x027c, code lost:
        throw com.google.android.gms.internal.ads.zzbo.zza("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(int r20, int r21, com.google.android.gms.internal.ads.zzacl r22) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahj.zzh(int, int, com.google.android.gms.internal.ads.zzacl):void");
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j10, long j11) {
        this.zzJ = -9223372036854775807L;
        this.zzO = 0;
        this.zzg.zzb();
        this.zzh.zze();
        zzx();
        for (int i10 = 0; i10 < this.zzi.size(); i10++) {
            zzadq zzadqVar = ((zzahi) this.zzi.valueAt(i10)).zzT;
            if (zzadqVar != null) {
                zzadqVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) {
        return new zzahk().zza(zzaclVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e6, code lost:
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzk(int r22) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahj.zzk(int):void");
    }

    public final void zzl(int i10, double d10) {
        if (i10 != 181) {
            if (i10 != 17545) {
                switch (i10) {
                    case 21969:
                        zzu(i10);
                        this.zzC.zzD = (float) d10;
                        return;
                    case 21970:
                        zzu(i10);
                        this.zzC.zzE = (float) d10;
                        return;
                    case 21971:
                        zzu(i10);
                        this.zzC.zzF = (float) d10;
                        return;
                    case 21972:
                        zzu(i10);
                        this.zzC.zzG = (float) d10;
                        return;
                    case 21973:
                        zzu(i10);
                        this.zzC.zzH = (float) d10;
                        return;
                    case 21974:
                        zzu(i10);
                        this.zzC.zzI = (float) d10;
                        return;
                    case 21975:
                        zzu(i10);
                        this.zzC.zzJ = (float) d10;
                        return;
                    case 21976:
                        zzu(i10);
                        this.zzC.zzK = (float) d10;
                        return;
                    case 21977:
                        zzu(i10);
                        this.zzC.zzL = (float) d10;
                        return;
                    case 21978:
                        zzu(i10);
                        this.zzC.zzM = (float) d10;
                        return;
                    default:
                        switch (i10) {
                            case 30323:
                                zzu(i10);
                                this.zzC.zzs = (float) d10;
                                return;
                            case 30324:
                                zzu(i10);
                                this.zzC.zzt = (float) d10;
                                return;
                            case 30325:
                                zzu(i10);
                                this.zzC.zzu = (float) d10;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.zzA = (long) d10;
            return;
        }
        zzu(i10);
        this.zzC.zzQ = (int) d10;
    }

    public final void zzm(int i10, long j10) {
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                switch (i10) {
                    case ShapeTypes.PLUS /* 131 */:
                        zzu(i10);
                        this.zzC.zzd = (int) j10;
                        return;
                    case ShapeTypes.FLOW_CHART_INTERNAL_STORAGE /* 136 */:
                        if (j10 == 1) {
                            z10 = true;
                        }
                        zzu(i10);
                        this.zzC.zzV = z10;
                        return;
                    case ShapeTypes.FLOW_CHART_MAGNETIC_DISK /* 155 */:
                        this.zzQ = zzs(j10);
                        return;
                    case ShapeTypes.FLOW_CHART_ALTERNATE_PROCESS /* 159 */:
                        zzu(i10);
                        this.zzC.zzO = (int) j10;
                        return;
                    case ShapeTypes.MATH_PLUS /* 176 */:
                        zzu(i10);
                        this.zzC.zzl = (int) j10;
                        return;
                    case ShapeTypes.MATH_DIVIDE /* 179 */:
                        zzt(i10);
                        this.zzK.zzc(zzs(j10));
                        return;
                    case ShapeTypes.CHART_STAR /* 186 */:
                        zzu(i10);
                        this.zzC.zzm = (int) j10;
                        return;
                    case 215:
                        zzu(i10);
                        this.zzC.zzc = (int) j10;
                        return;
                    case 231:
                        this.zzJ = zzs(j10);
                        return;
                    case 238:
                        this.zzX = (int) j10;
                        return;
                    case 241:
                        if (!this.zzM) {
                            zzt(i10);
                            this.zzL.zzc(j10);
                            this.zzM = true;
                            return;
                        }
                        return;
                    case 251:
                        this.zzY = true;
                        return;
                    case 16871:
                        zzu(i10);
                        zzahi.zzb(this.zzC, (int) j10);
                        return;
                    case 16980:
                        if (j10 != 3) {
                            throw zzbo.zza("ContentCompAlgo " + j10 + " not supported", null);
                        }
                        return;
                    case 17029:
                        if (j10 < 1 || j10 > 2) {
                            throw zzbo.zza("DocTypeReadVersion " + j10 + " not supported", null);
                        }
                        return;
                    case 17143:
                        if (j10 != 1) {
                            throw zzbo.zza("EBMLReadVersion " + j10 + " not supported", null);
                        }
                        return;
                    case 18401:
                        if (j10 != 5) {
                            throw zzbo.zza("ContentEncAlgo " + j10 + " not supported", null);
                        }
                        return;
                    case 18408:
                        if (j10 != 1) {
                            throw zzbo.zza("AESSettingsCipherMode " + j10 + " not supported", null);
                        }
                        return;
                    case 21420:
                        this.zzF = j10 + this.zzy;
                        return;
                    case 21432:
                        int i11 = (int) j10;
                        zzu(i10);
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 3) {
                                    if (i11 == 15) {
                                        this.zzC.zzw = 3;
                                        return;
                                    }
                                    return;
                                }
                                this.zzC.zzw = 1;
                                return;
                            }
                            this.zzC.zzw = 2;
                            return;
                        }
                        this.zzC.zzw = 0;
                        return;
                    case 21680:
                        zzu(i10);
                        this.zzC.zzo = (int) j10;
                        return;
                    case 21682:
                        zzu(i10);
                        this.zzC.zzq = (int) j10;
                        return;
                    case 21690:
                        zzu(i10);
                        this.zzC.zzp = (int) j10;
                        return;
                    case 21930:
                        if (j10 == 1) {
                            z10 = true;
                        }
                        zzu(i10);
                        this.zzC.zzU = z10;
                        return;
                    case 21938:
                        zzu(i10);
                        zzahi zzahiVar = this.zzC;
                        zzahiVar.zzx = true;
                        zzahiVar.zzn = (int) j10;
                        return;
                    case 21998:
                        zzu(i10);
                        this.zzC.zzf = (int) j10;
                        return;
                    case 22186:
                        zzu(i10);
                        this.zzC.zzR = j10;
                        return;
                    case 22203:
                        zzu(i10);
                        this.zzC.zzS = j10;
                        return;
                    case 25188:
                        zzu(i10);
                        this.zzC.zzP = (int) j10;
                        return;
                    case 30114:
                        this.zzZ = j10;
                        return;
                    case 30321:
                        int i12 = (int) j10;
                        zzu(i10);
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 == 3) {
                                        this.zzC.zzr = 3;
                                        return;
                                    }
                                    return;
                                }
                                this.zzC.zzr = 2;
                                return;
                            }
                            this.zzC.zzr = 1;
                            return;
                        }
                        this.zzC.zzr = 0;
                        return;
                    case 2352003:
                        zzu(i10);
                        this.zzC.zze = (int) j10;
                        return;
                    case 2807729:
                        this.zzz = j10;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                int i13 = (int) j10;
                                zzu(i10);
                                if (i13 != 1) {
                                    if (i13 == 2) {
                                        this.zzC.zzA = 1;
                                        return;
                                    }
                                    return;
                                }
                                this.zzC.zzA = 2;
                                return;
                            case 21946:
                                zzu(i10);
                                int zzb2 = zzo.zzb((int) j10);
                                if (zzb2 != -1) {
                                    this.zzC.zzz = zzb2;
                                    return;
                                }
                                return;
                            case 21947:
                                zzu(i10);
                                this.zzC.zzx = true;
                                int zza2 = zzo.zza((int) j10);
                                if (zza2 != -1) {
                                    this.zzC.zzy = zza2;
                                    return;
                                }
                                return;
                            case 21948:
                                zzu(i10);
                                this.zzC.zzB = (int) j10;
                                return;
                            case 21949:
                                zzu(i10);
                                this.zzC.zzC = (int) j10;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j10 != 1) {
                throw zzbo.zza("ContentEncodingScope " + j10 + " not supported", null);
            }
        } else if (j10 == 0) {
        } else {
            throw zzbo.zza("ContentEncodingOrder " + j10 + " not supported", null);
        }
    }

    public final void zzn(int i10, long j10, long j11) {
        zzdi.zzb(this.zzaj);
        if (i10 != 160) {
            if (i10 != 174) {
                if (i10 != 187) {
                    if (i10 != 19899) {
                        if (i10 != 20533) {
                            if (i10 != 21968) {
                                if (i10 != 408125543) {
                                    if (i10 != 475249515) {
                                        if (i10 == 524531317 && !this.zzD) {
                                            if (this.zzj && this.zzH != -1) {
                                                this.zzG = true;
                                                return;
                                            }
                                            this.zzaj.zzO(new zzadh(this.zzB, 0L));
                                            this.zzD = true;
                                            return;
                                        }
                                        return;
                                    }
                                    this.zzK = new zzeb(32);
                                    this.zzL = new zzeb(32);
                                    return;
                                }
                                long j12 = this.zzy;
                                if (j12 != -1 && j12 != j10) {
                                    throw zzbo.zza("Multiple Segment elements not supported", null);
                                }
                                this.zzy = j10;
                                this.zzx = j11;
                                return;
                            }
                            zzu(i10);
                            this.zzC.zzx = true;
                            return;
                        }
                        zzu(i10);
                        this.zzC.zzg = true;
                        return;
                    }
                    this.zzE = -1;
                    this.zzF = -1L;
                    return;
                }
                this.zzM = false;
                return;
            }
            this.zzC = new zzahi();
            return;
        }
        this.zzY = false;
        this.zzZ = 0L;
    }

    public final void zzo(int i10, String str) {
        if (i10 != 134) {
            if (i10 != 17026) {
                if (i10 != 21358) {
                    if (i10 == 2274716) {
                        zzu(i10);
                        zzahi.zzc(this.zzC, str);
                        return;
                    }
                    return;
                }
                zzu(i10);
                this.zzC.zza = str;
                return;
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw zzbo.zza("DocType " + str + " not supported", null);
            } else {
                return;
            }
        }
        zzu(i10);
        this.zzC.zzb = str;
    }

    public zzahj(zzahf zzahfVar, int i10, zzajy zzajyVar) {
        this.zzy = -1L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzH = -1L;
        this.zzI = -1L;
        this.zzJ = -9223372036854775807L;
        this.zzg = zzahfVar;
        zzahfVar.zza(new zzahh(this, null));
        this.zzl = zzajyVar;
        this.zzj = 1 == ((i10 & 1) ^ 1);
        this.zzk = (i10 & 2) == 0;
        this.zzh = new zzahl();
        this.zzi = new SparseArray();
        this.zzo = new zzek(4);
        this.zzp = new zzek(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzq = new zzek(4);
        this.zzm = new zzek(zzfh.zza);
        this.zzn = new zzek(4);
        this.zzr = new zzek();
        this.zzs = new zzek();
        this.zzt = new zzek(8);
        this.zzu = new zzek();
        this.zzv = new zzek();
        this.zzT = new int[1];
    }

    public zzahj(zzajy zzajyVar, int i10) {
        this(new zzahd(), 0, zzajyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }
}
