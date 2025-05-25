package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaiq implements zzack, zzadi {
    private zzagr zzA;
    private final zzajy zza;
    private final int zzb;
    private final zzek zzc;
    private final zzek zzd;
    private final zzek zze;
    private final zzek zzf;
    private final ArrayDeque zzg;
    private final zzaiu zzh;
    private final List zzi;
    private zzfxr zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private int zzn;
    private zzek zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private zzacn zzu;
    private zzaip[] zzv;
    private long[][] zzw;
    private int zzx;
    private long zzy;
    private int zzz;

    @Deprecated
    public zzaiq() {
        this(zzajy.zza, 16);
    }

    private static int zzk(int i10) {
        if (i10 != 1751476579) {
            if (i10 != 1903435808) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    private static int zzl(zzaiz zzaizVar, long j10) {
        int zza = zzaizVar.zza(j10);
        if (zza == -1) {
            return zzaizVar.zzb(j10);
        }
        return zza;
    }

    private static long zzm(zzaiz zzaizVar, long j10, long j11) {
        int zzl = zzl(zzaizVar, j10);
        if (zzl == -1) {
            return j11;
        }
        return Math.min(zzaizVar.zzc[zzl], j11);
    }

    private final void zzn() {
        this.zzk = 0;
        this.zzn = 0;
    }

    private final void zzo(long j10) {
        zzbk zzbkVar;
        zzbk zzbkVar2;
        boolean z10;
        boolean z11;
        long j11;
        List list;
        int i10;
        zzbk zzbkVar3;
        int i11;
        int i12;
        int i13;
        while (!this.zzg.isEmpty() && ((zzahv) this.zzg.peek()).zza == j10) {
            zzahv zzahvVar = (zzahv) this.zzg.pop();
            if (zzahvVar.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                int i14 = this.zzz;
                zzacy zzacyVar = new zzacy();
                zzahw zzb = zzahvVar.zzb(1969517665);
                if (zzb != null) {
                    zzbk zzb2 = zzaif.zzb(zzb);
                    zzacyVar.zzb(zzb2);
                    zzbkVar = zzb2;
                } else {
                    zzbkVar = null;
                }
                zzahv zza = zzahvVar.zza(1835365473);
                if (zza != null) {
                    zzbkVar2 = zzaif.zza(zza);
                } else {
                    zzbkVar2 = null;
                }
                zzbj[] zzbjVarArr = new zzbj[1];
                zzahw zzb3 = zzahvVar.zzb(1836476516);
                zzb3.getClass();
                if (i14 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzbjVarArr[0] = zzaif.zzc(zzb3.zza);
                zzbk zzbkVar4 = new zzbk(-9223372036854775807L, zzbjVarArr);
                if (1 != (this.zzb & 1)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                zzbk zzbkVar5 = zzbkVar;
                long j12 = -9223372036854775807L;
                List zzd = zzaif.zzd(zzahvVar, zzacyVar, -9223372036854775807L, null, z11, z10, new zzful() { // from class: com.google.android.gms.internal.ads.zzaio
                    @Override // com.google.android.gms.internal.ads.zzful
                    public final Object apply(Object obj) {
                        return (zzaiw) obj;
                    }
                });
                long j13 = -9223372036854775807L;
                int i15 = 0;
                int i16 = -1;
                int i17 = 0;
                while (true) {
                    j11 = 0;
                    if (i17 >= zzd.size()) {
                        break;
                    }
                    zzaiz zzaizVar = (zzaiz) zzd.get(i17);
                    if (zzaizVar.zzb == 0) {
                        list = zzd;
                    } else {
                        zzaiw zzaiwVar = zzaizVar.zza;
                        list = zzd;
                        long j14 = zzaiwVar.zze;
                        if (j14 == j12) {
                            j14 = zzaizVar.zzh;
                        }
                        long max = Math.max(j13, j14);
                        int i18 = i15 + 1;
                        zzaip zzaipVar = new zzaip(zzaiwVar, zzaizVar, this.zzu.zzw(i15, zzaiwVar.zzb));
                        if ("audio/true-hd".equals(zzaiwVar.zzf.zzm)) {
                            i10 = zzaizVar.zze * 16;
                        } else {
                            i10 = zzaizVar.zze + 30;
                        }
                        zzad zzb4 = zzaiwVar.zzf.zzb();
                        zzb4.zzP(i10);
                        if (zzaiwVar.zzb == 2) {
                            if ((this.zzb & 8) != 0) {
                                zzaf zzafVar = zzaiwVar.zzf;
                                if (i16 == -1) {
                                    i13 = 1;
                                } else {
                                    i13 = 2;
                                }
                                zzb4.zzV(zzafVar.zzf | i13);
                            }
                            if (j14 > 0 && (i12 = zzaizVar.zzb) > 0) {
                                zzb4.zzH(i12 / (((float) j14) / 1000000.0f));
                            }
                        }
                        if (zzaiwVar.zzb == 1 && zzacyVar.zza()) {
                            zzb4.zzF(zzacyVar.zza);
                            zzb4.zzG(zzacyVar.zzb);
                        }
                        int i19 = zzaiwVar.zzb;
                        zzbk[] zzbkVarArr = new zzbk[3];
                        if (this.zzi.isEmpty()) {
                            i11 = 0;
                            zzbkVar3 = null;
                        } else {
                            zzbkVar3 = new zzbk(this.zzi);
                            i11 = 0;
                        }
                        zzbkVarArr[i11] = zzbkVar3;
                        zzbkVarArr[1] = zzbkVar5;
                        zzbkVarArr[2] = zzbkVar4;
                        int i20 = i16;
                        zzbk zzbkVar6 = new zzbk(-9223372036854775807L, new zzbj[i11]);
                        if (zzbkVar2 != null) {
                            for (int i21 = 0; i21 < zzbkVar2.zza(); i21++) {
                                zzbj zzb5 = zzbkVar2.zzb(i21);
                                if (zzb5 instanceof zzex) {
                                    zzex zzexVar = (zzex) zzb5;
                                    if (zzexVar.zza.equals("com.android.capture.fps")) {
                                        if (i19 == 2) {
                                            zzbkVar6 = zzbkVar6.zzc(zzexVar);
                                        }
                                    } else {
                                        zzbkVar6 = zzbkVar6.zzc(zzexVar);
                                    }
                                }
                            }
                        }
                        for (int i22 = 0; i22 < 3; i22++) {
                            zzbkVar6 = zzbkVar6.zzd(zzbkVarArr[i22]);
                        }
                        if (zzbkVar6.zza() > 0) {
                            zzb4.zzQ(zzbkVar6);
                        }
                        zzaipVar.zzc.zzl(zzb4.zzad());
                        if (zzaiwVar.zzb == 2 && i20 == -1) {
                            i16 = arrayList.size();
                            arrayList.add(zzaipVar);
                            i15 = i18;
                            j13 = max;
                        }
                        i16 = i20;
                        arrayList.add(zzaipVar);
                        i15 = i18;
                        j13 = max;
                    }
                    i17++;
                    zzd = list;
                    j12 = -9223372036854775807L;
                }
                this.zzx = i16;
                this.zzy = j13;
                zzaip[] zzaipVarArr = (zzaip[]) arrayList.toArray(new zzaip[0]);
                this.zzv = zzaipVarArr;
                int length = zzaipVarArr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i23 = 0; i23 < zzaipVarArr.length; i23++) {
                    jArr[i23] = new long[zzaipVarArr[i23].zzb.zzb];
                    jArr2[i23] = zzaipVarArr[i23].zzb.zzf[0];
                }
                int i24 = 0;
                while (i24 < zzaipVarArr.length) {
                    int i25 = -1;
                    long j15 = Long.MAX_VALUE;
                    for (int i26 = 0; i26 < zzaipVarArr.length; i26++) {
                        if (!zArr[i26]) {
                            long j16 = jArr2[i26];
                            if (j16 <= j15) {
                                i25 = i26;
                                j15 = j16;
                            }
                        }
                    }
                    int i27 = iArr[i25];
                    long[] jArr3 = jArr[i25];
                    jArr3[i27] = j11;
                    zzaiz zzaizVar2 = zzaipVarArr[i25].zzb;
                    j11 += zzaizVar2.zzd[i27];
                    int i28 = i27 + 1;
                    iArr[i25] = i28;
                    if (i28 < jArr3.length) {
                        jArr2[i25] = zzaizVar2.zzf[i28];
                    } else {
                        zArr[i25] = true;
                        i24++;
                    }
                }
                this.zzw = jArr;
                this.zzu.zzD();
                this.zzu.zzO(this);
                this.zzg.clear();
                this.zzk = 2;
            } else if (!this.zzg.isEmpty()) {
                ((zzahv) this.zzg.peek()).zzc(zzahvVar);
            }
        }
        if (this.zzk != 2) {
            zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zzy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x03e6, code lost:
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    @Override // com.google.android.gms.internal.ads.zzack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzacl r33, com.google.android.gms.internal.ads.zzadf r34) {
        /*
            Method dump skipped, instructions count: 1137
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiq.zzb(com.google.android.gms.internal.ads.zzacl, com.google.android.gms.internal.ads.zzadf):int");
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        if ((this.zzb & 16) == 0) {
            zzacnVar = new zzakc(zzacnVar, this.zza);
        }
        this.zzu = zzacnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        long j11;
        long j12;
        int zzb;
        zzaip[] zzaipVarArr = this.zzv;
        if (zzaipVarArr.length == 0) {
            zzadj zzadjVar = zzadj.zza;
            return new zzadg(zzadjVar, zzadjVar);
        }
        int i10 = this.zzx;
        long j13 = -1;
        if (i10 != -1) {
            zzaiz zzaizVar = zzaipVarArr[i10].zzb;
            int zzl = zzl(zzaizVar, j10);
            if (zzl == -1) {
                zzadj zzadjVar2 = zzadj.zza;
                return new zzadg(zzadjVar2, zzadjVar2);
            }
            long j14 = zzaizVar.zzf[zzl];
            j11 = zzaizVar.zzc[zzl];
            if (j14 < j10 && zzl < zzaizVar.zzb - 1 && (zzb = zzaizVar.zzb(j10)) != -1 && zzb != zzl) {
                j12 = zzaizVar.zzf[zzb];
                j13 = zzaizVar.zzc[zzb];
            } else {
                j12 = -9223372036854775807L;
            }
            j10 = j14;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            zzaip[] zzaipVarArr2 = this.zzv;
            if (i11 >= zzaipVarArr2.length) {
                break;
            }
            if (i11 != this.zzx) {
                zzaiz zzaizVar2 = zzaipVarArr2[i11].zzb;
                long zzm = zzm(zzaizVar2, j10, j11);
                if (j12 != -9223372036854775807L) {
                    j13 = zzm(zzaizVar2, j12, j13);
                }
                j11 = zzm;
            }
            i11++;
        }
        zzadj zzadjVar3 = new zzadj(j10, j11);
        if (j12 == -9223372036854775807L) {
            return new zzadg(zzadjVar3, zzadjVar3);
        }
        return new zzadg(zzadjVar3, new zzadj(j12, j13));
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j10, long j11) {
        zzaip[] zzaipVarArr;
        this.zzg.clear();
        this.zzn = 0;
        this.zzp = -1;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        if (j10 == 0) {
            if (this.zzk != 3) {
                zzn();
                return;
            }
            this.zzh.zzb();
            this.zzi.clear();
            return;
        }
        for (zzaip zzaipVar : this.zzv) {
            zzaiz zzaizVar = zzaipVar.zzb;
            int zza = zzaizVar.zza(j11);
            if (zza == -1) {
                zza = zzaizVar.zzb(j11);
            }
            zzaipVar.zze = zza;
            zzadq zzadqVar = zzaipVar.zzd;
            if (zzadqVar != null) {
                zzadqVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) {
        boolean z10;
        zzfxr zzm;
        if ((this.zzb & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzadm zzb = zzaiv.zzb(zzaclVar, z10);
        if (zzb != null) {
            zzm = zzfxr.zzn(zzb);
        } else {
            zzm = zzfxr.zzm();
        }
        this.zzj = zzm;
        if (zzb == null) {
            return true;
        }
        return false;
    }

    public zzaiq(zzajy zzajyVar, int i10) {
        this.zza = zzajyVar;
        this.zzb = i10;
        this.zzj = zzfxr.zzm();
        this.zzk = (i10 & 4) != 0 ? 3 : 0;
        this.zzh = new zzaiu();
        this.zzi = new ArrayList();
        this.zzf = new zzek(16);
        this.zzg = new ArrayDeque();
        this.zzc = new zzek(zzfh.zza);
        this.zzd = new zzek(4);
        this.zze = new zzek();
        this.zzp = -1;
        this.zzu = zzacn.zza;
        this.zzv = new zzaip[0];
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }
}
