package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzail implements zzack {
    private static final byte[] zza = {-94, Field.SYMBOL, Field.AUTOTEXT, 82, Field.LISTNUM, -101, Field.AUTOTEXT, 20, -94, Field.INCLUDETEXT, 108, Field.SECTIONPAGES, 124, 100, -115, -12};
    private static final zzaf zzb;
    private zzaik zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private boolean zzE;
    private zzacn zzF;
    private zzadp[] zzG;
    private zzadp[] zzH;
    private boolean zzI;
    private final zzajy zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzek zzg;
    private final zzek zzh;
    private final zzek zzi;
    private final byte[] zzj;
    private final zzek zzk;
    private final zzafh zzl;
    private final zzek zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private zzfxr zzp;
    private int zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private zzek zzu;
    private long zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        zzad zzadVar = new zzad();
        zzadVar.zzX("application/x-emsg");
        zzb = zzadVar.zzad();
    }

    @Deprecated
    public zzail() {
        this(zzajy.zza, 32, null, null, zzfxr.zzm(), null);
    }

    private static int zza(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw zzbo.zza("Unexpected negative value: " + i10, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzy zzg(java.util.List r17) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzail.zzg(java.util.List):com.google.android.gms.internal.ads.zzy");
    }

    private final void zzh() {
        this.zzq = 0;
        this.zzt = 0;
    }

    private static void zzk(zzek zzekVar, int i10, zzaiy zzaiyVar) {
        boolean z10;
        zzekVar.zzK(i10 + 8);
        int zzg = zzekVar.zzg() & 16777215;
        if ((zzg & 1) == 0) {
            if ((zzg & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int zzp = zzekVar.zzp();
            if (zzp == 0) {
                Arrays.fill(zzaiyVar.zzl, 0, zzaiyVar.zze, false);
                return;
            }
            int i11 = zzaiyVar.zze;
            if (zzp == i11) {
                Arrays.fill(zzaiyVar.zzl, 0, zzp, z10);
                zzaiyVar.zza(zzekVar.zzb());
                zzek zzekVar2 = zzaiyVar.zzn;
                zzekVar.zzG(zzekVar2.zzM(), 0, zzekVar2.zze());
                zzaiyVar.zzn.zzK(0);
                zzaiyVar.zzo = false;
                return;
            }
            throw zzbo.zza("Senc sample count " + zzp + " is different from fragment sample count" + i11, null);
        }
        throw zzbo.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x032b, code lost:
        if (com.google.android.gms.internal.ads.zzet.zzt(r34 + r1[0], 1000000, r5.zzd, java.math.RoundingMode.FLOOR) < r5.zze) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzl(long r51) {
        /*
            Method dump skipped, instructions count: 1832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzail.zzl(long):void");
    }

    private static final zzaih zzm(SparseArray sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return (zzaih) sparseArray.valueAt(0);
        }
        zzaih zzaihVar = (zzaih) sparseArray.get(i10);
        zzaihVar.getClass();
        return zzaihVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x024d, code lost:
        r1 = (com.google.android.gms.internal.ads.zzaij) r26.zzo.removeFirst();
        r26.zzw -= r1.zzc;
        r6 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0260, code lost:
        if (r1.zzb == false) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0262, code lost:
        r6 = r6 + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0263, code lost:
        r3 = r26.zzG;
        r15 = r3.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0268, code lost:
        if (r14 >= r15) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x026a, code lost:
        r3[r14].zzs(r6, 1, r1.zzc, r26.zzw, null);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0282, code lost:
        if (r2.zzk() != false) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0284, code lost:
        r26.zzA = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0287, code lost:
        r10 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0288, code lost:
        r26.zzq = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x028b, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
        if (r26.zzq != 3) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
        r3 = r2.zzb();
        r26.zzB = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
        if (r2.zzf >= r2.zzi) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
        ((com.google.android.gms.internal.ads.zzaby) r27).zzo(r3, false);
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
        if (r1 != null) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
        r3 = r2.zzb.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b8, code lost:
        if (r1 == 0) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ba, code lost:
        r3.zzL(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c5, code lost:
        if (r2.zzb.zzb(r2.zzf) == false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c7, code lost:
        r3.zzL(r3.zzq() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d3, code lost:
        if (r2.zzk() != false) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
        r26.zzA = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00df, code lost:
        if (r2.zzd.zza.zzg != 1) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e1, code lost:
        r26.zzB = r3 - 8;
        ((com.google.android.gms.internal.ads.zzaby) r27).zzo(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fb, code lost:
        if ("audio/ac4".equals(r2.zzd.zza.zzf.zzm) == false) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fd, code lost:
        r26.zzC = r2.zzc(r26.zzB, 7);
        com.google.android.gms.internal.ads.zzabm.zzb(r26.zzB, r26.zzk);
        r2.zza.zzq(r26.zzk, 7);
        r3 = r26.zzC + 7;
        r26.zzC = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011a, code lost:
        r3 = r2.zzc(r26.zzB, 0);
        r26.zzC = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0122, code lost:
        r26.zzB += r3;
        r26.zzq = 4;
        r26.zzD = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012c, code lost:
        r3 = r2.zzd.zza;
        r9 = r2.zza;
        r14 = r2.zze();
        r5 = r3.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0138, code lost:
        if (r5 != 0) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013a, code lost:
        r3 = r26.zzC;
        r4 = r26.zzB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013e, code lost:
        if (r3 >= r4) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0140, code lost:
        r26.zzC += r9.zzf(r27, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014b, code lost:
        r10 = r26.zzh.zzM();
        r10[0] = 0;
        r10[1] = 0;
        r10[2] = 0;
        r11 = r5 + 1;
        r5 = 4 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0160, code lost:
        if (r26.zzC >= r26.zzB) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0162, code lost:
        r12 = r26.zzD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0166, code lost:
        if (r12 != 0) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0168, code lost:
        ((com.google.android.gms.internal.ads.zzaby) r27).zzn(r10, r5, r11, r8);
        r26.zzh.zzK(r8);
        r12 = r26.zzh.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0179, code lost:
        if (r12 <= 0) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017b, code lost:
        r26.zzD = r12 - 1;
        r26.zzg.zzK(r8);
        r9.zzq(r26.zzg, 4);
        r9.zzq(r26.zzh, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0192, code lost:
        if (r26.zzH.length <= 0) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0194, code lost:
        r8 = r3.zzf.zzm;
        r12 = r10[4];
        r16 = com.google.android.gms.internal.ads.zzfh.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a2, code lost:
        if ("video/avc".equals(r8) == false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a6, code lost:
        if ((r12 & 31) == r4) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ac, code lost:
        if ("video/hevc".equals(r8) == false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b3, code lost:
        if (((r12 & 126) >> r7) != 39) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b5, code lost:
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b7, code lost:
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b8, code lost:
        r26.zzE = r6;
        r26.zzC += 5;
        r26.zzB += r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01cd, code lost:
        throw com.google.android.gms.internal.ads.zzbo.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d0, code lost:
        if (r26.zzE == false) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d2, code lost:
        r26.zzi.zzH(r12);
        ((com.google.android.gms.internal.ads.zzaby) r27).zzn(r26.zzi.zzM(), 0, r26.zzD, false);
        r9.zzq(r26.zzi, r26.zzD);
        r4 = r26.zzD;
        r6 = r26.zzi;
        r6 = com.google.android.gms.internal.ads.zzfh.zzb(r6.zzM(), r6.zze());
        r26.zzi.zzK("video/hevc".equals(r3.zzf.zzm) ? 1 : 0);
        r26.zzi.zzJ(r6);
        com.google.android.gms.internal.ads.zzabv.zza(r14, r26.zzi, r26.zzH);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0217, code lost:
        r4 = r9.zzf(r27, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x021c, code lost:
        r26.zzC += r4;
        r26.zzD -= r4;
        r4 = 6;
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0229, code lost:
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x022d, code lost:
        r12 = r2.zza();
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0235, code lost:
        if (r1 == null) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0237, code lost:
        r1 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x023a, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x023b, code lost:
        r9.zzs(r14, r12, r26.zzB, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x024b, code lost:
        if (r26.zzo.isEmpty() != false) goto L353;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // com.google.android.gms.internal.ads.zzack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzacl r27, com.google.android.gms.internal.ads.zzadf r28) {
        /*
            Method dump skipped, instructions count: 1854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzail.zzb(com.google.android.gms.internal.ads.zzacl, com.google.android.gms.internal.ads.zzadf):int");
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        int i10;
        if ((this.zzd & 32) == 0) {
            zzacnVar = new zzakc(zzacnVar, this.zzc);
        }
        this.zzF = zzacnVar;
        zzh();
        zzadp[] zzadpVarArr = new zzadp[2];
        this.zzG = zzadpVarArr;
        int i11 = 100;
        int i12 = 0;
        if ((this.zzd & 4) != 0) {
            zzadpVarArr[0] = this.zzF.zzw(100, 5);
            i10 = 1;
            i11 = 101;
        } else {
            i10 = 0;
        }
        zzadp[] zzadpVarArr2 = (zzadp[]) zzet.zzP(this.zzG, i10);
        this.zzG = zzadpVarArr2;
        for (zzadp zzadpVar : zzadpVarArr2) {
            zzadpVar.zzl(zzb);
        }
        this.zzH = new zzadp[this.zze.size()];
        while (i12 < this.zzH.length) {
            zzadp zzw = this.zzF.zzw(i11, 3);
            zzw.zzl((zzaf) this.zze.get(i12));
            this.zzH[i12] = zzw;
            i12++;
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j10, long j11) {
        int size = this.zzf.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzaik) this.zzf.valueAt(i10)).zzi();
        }
        this.zzo.clear();
        this.zzw = 0;
        this.zzx = j11;
        this.zzn.clear();
        zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) {
        zzfxr zzm;
        zzadm zza2 = zzaiv.zza(zzaclVar);
        if (zza2 != null) {
            zzm = zzfxr.zzn(zza2);
        } else {
            zzm = zzfxr.zzm();
        }
        this.zzp = zzm;
        if (zza2 == null) {
            return true;
        }
        return false;
    }

    public zzail(zzajy zzajyVar, int i10, zzer zzerVar, zzaiw zzaiwVar, List list, zzadp zzadpVar) {
        this.zzc = zzajyVar;
        this.zzd = i10;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzafh();
        this.zzm = new zzek(16);
        this.zzg = new zzek(zzfh.zza);
        this.zzh = new zzek(5);
        this.zzi = new zzek();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzek(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzp = zzfxr.zzm();
        this.zzy = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzF = zzacn.zza;
        this.zzG = new zzadp[0];
        this.zzH = new zzadp[0];
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }
}
