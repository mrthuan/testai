package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzjx implements Handler.Callback, zzuf, zzya, zzkv, zzhu, zzky {
    private static final long zza = zzet.zzu(10000);
    private boolean zzA;
    private boolean zzB;
    private boolean zzD;
    private boolean zzG;
    private int zzH;
    private zzjw zzI;
    private long zzJ;
    private long zzK;
    private int zzL;
    private boolean zzM;
    private zzhw zzN;
    private zzig zzP;
    private final zzii zzQ;
    private final zzhq zzR;
    private final zzle[] zzb;
    private final Set zzc;
    private final zzlh[] zzd;
    private final zzyb zze;
    private final zzyc zzf;
    private final zzkb zzg;
    private final zzyj zzh;
    private final zzdt zzi;
    private final HandlerThread zzj;
    private final Looper zzk;
    private final zzcb zzl;
    private final zzca zzm;
    private final long zzn;
    private final zzhv zzo;
    private final ArrayList zzp;
    private final zzdj zzq;
    private final zzkk zzr;
    private final zzkw zzs;
    private final long zzt;
    private final zznz zzu;
    private zzlj zzv;
    private zzkx zzw;
    private zzjv zzx;
    private boolean zzy;
    private int zzE = 0;
    private boolean zzF = false;
    private boolean zzz = false;
    private long zzO = -9223372036854775807L;
    private long zzC = -9223372036854775807L;

    public zzjx(zzle[] zzleVarArr, zzyb zzybVar, zzyc zzycVar, zzkb zzkbVar, zzyj zzyjVar, int i10, boolean z10, zzln zzlnVar, zzlj zzljVar, zzhq zzhqVar, long j10, boolean z11, boolean z12, Looper looper, zzdj zzdjVar, zzii zziiVar, zznz zznzVar, Looper looper2, zzig zzigVar) {
        this.zzQ = zziiVar;
        this.zzb = zzleVarArr;
        this.zze = zzybVar;
        this.zzf = zzycVar;
        this.zzg = zzkbVar;
        this.zzh = zzyjVar;
        this.zzv = zzljVar;
        this.zzR = zzhqVar;
        this.zzt = j10;
        this.zzq = zzdjVar;
        this.zzu = zznzVar;
        this.zzP = zzigVar;
        this.zzn = zzkbVar.zzb(zznzVar);
        zzkbVar.zzg(zznzVar);
        zzcc zzccVar = zzcc.zza;
        zzkx zzg = zzkx.zzg(zzycVar);
        this.zzw = zzg;
        this.zzx = new zzjv(zzg);
        int length = zzleVarArr.length;
        this.zzd = new zzlh[2];
        zzlg zze = zzybVar.zze();
        for (int i11 = 0; i11 < 2; i11++) {
            zzleVarArr[i11].zzu(i11, zznzVar, zzdjVar);
            this.zzd[i11] = zzleVarArr[i11].zzl();
            this.zzd[i11].zzL(zze);
        }
        this.zzo = new zzhv(this, zzdjVar);
        this.zzp = new ArrayList();
        this.zzc = Collections.newSetFromMap(new IdentityHashMap());
        this.zzl = new zzcb();
        this.zzm = new zzca();
        zzybVar.zzr(this, zzyjVar);
        this.zzM = true;
        zzdt zzb = zzdjVar.zzb(looper, null);
        this.zzr = new zzkk(zzlnVar, zzb, new zzjp(this), zzigVar);
        this.zzs = new zzkw(this, zzlnVar, zzb, zznzVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.zzj = handlerThread;
        handlerThread.start();
        Looper looper3 = handlerThread.getLooper();
        this.zzk = looper3;
        this.zzi = zzdjVar.zzb(looper3, this);
    }

    private final void zzA() {
        int length = this.zzb.length;
        zzB(new boolean[2], this.zzr.zzf().zzf());
    }

    private final void zzB(boolean[] zArr, long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        zzkh zzf = this.zzr.zzf();
        zzyc zzi = zzf.zzi();
        int i10 = 0;
        while (true) {
            int length = this.zzb.length;
            if (i10 >= 2) {
                break;
            }
            if (!zzi.zzb(i10) && this.zzc.remove(this.zzb[i10])) {
                this.zzb[i10].zzI();
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            int length2 = this.zzb.length;
            if (i11 < 2) {
                if (zzi.zzb(i11)) {
                    boolean z13 = zArr[i11];
                    zzle zzleVar = this.zzb[i11];
                    if (!zzae(zzleVar)) {
                        zzkk zzkkVar = this.zzr;
                        zzkh zzf2 = zzkkVar.zzf();
                        if (zzf2 == zzkkVar.zze()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zzyc zzi2 = zzf2.zzi();
                        zzli zzliVar = zzi2.zzb[i11];
                        zzaf[] zzaj = zzaj(zzi2.zzc[i11]);
                        if (zzah() && this.zzw.zze == 3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z13 && z11) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.zzH++;
                        this.zzc.add(zzleVar);
                        zzleVar.zzr(zzliVar, zzaj, zzf2.zzc[i11], this.zzJ, z12, z10, j10, zzf2.zze(), zzf2.zzf.zza);
                        zzleVar.zzt(11, new zzjq(this));
                        this.zzo.zze(zzleVar);
                        if (z11 && z10) {
                            zzleVar.zzO();
                        }
                    }
                }
                i11++;
            } else {
                zzf.zzg = true;
                return;
            }
        }
    }

    private final void zzC(IOException iOException, int i10) {
        zzkk zzkkVar = this.zzr;
        zzhw zzc = zzhw.zzc(iOException, i10);
        zzkh zze = zzkkVar.zze();
        if (zze != null) {
            zzc = zzc.zza(zze.zzf.zza);
        }
        zzea.zzd("ExoPlayerImplInternal", "Playback error", zzc);
        zzV(false, false);
        this.zzw = this.zzw.zzd(zzc);
    }

    private final void zzD(boolean z10) {
        zzui zzuiVar;
        long zzc;
        zzkh zzd = this.zzr.zzd();
        if (zzd == null) {
            zzuiVar = this.zzw.zzb;
        } else {
            zzuiVar = zzd.zzf.zza;
        }
        boolean z11 = !this.zzw.zzk.equals(zzuiVar);
        if (z11) {
            this.zzw = this.zzw.zza(zzuiVar);
        }
        zzkx zzkxVar = this.zzw;
        if (zzd == null) {
            zzc = zzkxVar.zzr;
        } else {
            zzc = zzd.zzc();
        }
        zzkxVar.zzp = zzc;
        this.zzw.zzq = zzs();
        if ((z11 || z10) && zzd != null && zzd.zzd) {
            zzY(zzd.zzf.zza, zzd.zzh(), zzd.zzi());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x042f  */
    /* JADX WARN: Type inference failed for: r21v0, types: [long] */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzE(com.google.android.gms.internal.ads.zzcc r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjx.zzE(com.google.android.gms.internal.ads.zzcc, boolean):void");
    }

    private final void zzF(zzbq zzbqVar, boolean z10) {
        zzG(zzbqVar, zzbqVar.zzb, true, z10);
    }

    private final void zzG(zzbq zzbqVar, float f10, boolean z10, boolean z11) {
        int i10;
        zzjx zzjxVar = this;
        if (z10) {
            if (z11) {
                zzjxVar.zzx.zza(1);
            }
            zzkx zzkxVar = zzjxVar.zzw;
            zzjxVar = this;
            zzjxVar.zzw = new zzkx(zzkxVar.zza, zzkxVar.zzb, zzkxVar.zzc, zzkxVar.zzd, zzkxVar.zze, zzkxVar.zzf, zzkxVar.zzg, zzkxVar.zzh, zzkxVar.zzi, zzkxVar.zzj, zzkxVar.zzk, zzkxVar.zzl, zzkxVar.zzm, zzbqVar, zzkxVar.zzp, zzkxVar.zzq, zzkxVar.zzr, zzkxVar.zzs, false);
        }
        float f11 = zzbqVar.zzb;
        zzkh zze = zzjxVar.zzr.zze();
        while (true) {
            i10 = 0;
            if (zze == null) {
                break;
            }
            zzxv[] zzxvVarArr = zze.zzi().zzc;
            int length = zzxvVarArr.length;
            while (i10 < length) {
                zzxv zzxvVar = zzxvVarArr[i10];
                i10++;
            }
            zze = zze.zzg();
        }
        zzle[] zzleVarArr = zzjxVar.zzb;
        int length2 = zzleVarArr.length;
        while (i10 < 2) {
            zzle zzleVar = zzleVarArr[i10];
            if (zzleVar != null) {
                zzleVar.zzM(f10, zzbqVar.zzb);
            }
            i10++;
        }
    }

    private final void zzH() {
        long zze;
        long j10;
        long j11;
        boolean z10;
        if (!zzad()) {
            z10 = false;
        } else {
            zzkh zzd = this.zzr.zzd();
            long zzt = zzt(zzd.zzd());
            if (zzd == this.zzr.zze()) {
                zze = this.zzJ;
                j10 = zzd.zze();
            } else {
                zze = this.zzJ - zzd.zze();
                j10 = zzd.zzf.zzb;
            }
            long j12 = zze - j10;
            if (zzai(this.zzw.zza, zzd.zzf.zza)) {
                j11 = this.zzR.zzb();
            } else {
                j11 = -9223372036854775807L;
            }
            zzka zzkaVar = new zzka(this.zzu, this.zzw.zza, zzd.zzf.zza, j12, zzt, this.zzo.zzc().zzb, this.zzw.zzl, this.zzB, j11);
            boolean zzh = this.zzg.zzh(zzkaVar);
            zzkh zze2 = this.zzr.zze();
            if (!zzh && zze2.zzd && zzt < 500000 && this.zzn > 0) {
                zze2.zza.zzj(this.zzw.zzr, false);
                z10 = this.zzg.zzh(zzkaVar);
            } else {
                z10 = zzh;
            }
        }
        this.zzD = z10;
        if (z10) {
            this.zzr.zzd().zzk(this.zzJ, this.zzo.zzc().zzb, this.zzC);
        }
        zzX();
    }

    private final void zzI() {
        boolean z10;
        this.zzx.zzc(this.zzw);
        z10 = this.zzx.zzg;
        if (z10) {
            zzii zziiVar = this.zzQ;
            zziiVar.zza.zzO(this.zzx);
            this.zzx = new zzjv(this.zzw);
        }
    }

    private final void zzJ() {
        zzyc zzycVar;
        int i10;
        boolean z10;
        float f10 = this.zzo.zzc().zzb;
        zzkk zzkkVar = this.zzr;
        zzkh zze = zzkkVar.zze();
        zzkh zzf = zzkkVar.zzf();
        zzyc zzycVar2 = null;
        boolean z11 = true;
        while (zze != null && zze.zzd) {
            zzyc zzj = zze.zzj(f10, this.zzw.zza);
            if (zze == this.zzr.zze()) {
                zzycVar = zzj;
            } else {
                zzycVar = zzycVar2;
            }
            zzyc zzi = zze.zzi();
            boolean z12 = false;
            if (zzi != null) {
                if (zzi.zzc.length == zzj.zzc.length) {
                    for (int i11 = 0; i11 < zzj.zzc.length; i11++) {
                        if (zzj.zza(zzi, i11)) {
                        }
                    }
                    if (zze != zzf) {
                        z12 = true;
                    }
                    z11 &= z12;
                    zze = zze.zzg();
                    zzycVar2 = zzycVar;
                }
            }
            if (z11) {
                zzkk zzkkVar2 = this.zzr;
                zzkh zze2 = zzkkVar2.zze();
                boolean zzq = zzkkVar2.zzq(zze2);
                int length = this.zzb.length;
                boolean[] zArr = new boolean[2];
                zzycVar.getClass();
                long zzb = zze2.zzb(zzycVar, this.zzw.zzr, zzq, zArr);
                zzkx zzkxVar = this.zzw;
                if (zzkxVar.zze != 4 && zzb != zzkxVar.zzr) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzkx zzkxVar2 = this.zzw;
                i10 = 2;
                this.zzw = zzy(zzkxVar2.zzb, zzb, zzkxVar2.zzc, zzkxVar2.zzd, z10, 5);
                if (z10) {
                    zzN(zzb);
                }
                int length2 = this.zzb.length;
                boolean[] zArr2 = new boolean[2];
                int i12 = 0;
                while (true) {
                    zzle[] zzleVarArr = this.zzb;
                    int length3 = zzleVarArr.length;
                    if (i12 >= 2) {
                        break;
                    }
                    zzle zzleVar = zzleVarArr[i12];
                    boolean zzae = zzae(zzleVar);
                    zArr2[i12] = zzae;
                    zzvx zzvxVar = zze2.zzc[i12];
                    if (zzae) {
                        if (zzvxVar != zzleVar.zzo()) {
                            zzz(zzleVar);
                        } else if (zArr[i12]) {
                            zzleVar.zzJ(this.zzJ);
                        }
                    }
                    i12++;
                }
                zzB(zArr2, this.zzJ);
            } else {
                i10 = 2;
                this.zzr.zzq(zze);
                if (zze.zzd) {
                    zze.zza(zzj, Math.max(zze.zzf.zzb, this.zzJ - zze.zze()), false);
                }
            }
            zzD(true);
            if (this.zzw.zze != 4) {
                zzH();
                zzZ();
                this.zzi.zzi(i10);
                return;
            }
            return;
        }
    }

    private final void zzK() {
        zzJ();
        zzQ(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
        if (r2.equals(r32.zzw.zzb) == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzL(boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjx.zzL(boolean, boolean, boolean, boolean):void");
    }

    private final void zzM() {
        zzkh zze = this.zzr.zze();
        boolean z10 = false;
        if (zze != null && zze.zzf.zzh && this.zzz) {
            z10 = true;
        }
        this.zzA = z10;
    }

    private final void zzN(long j10) {
        long zze;
        zzxv[] zzxvVarArr;
        zzkh zze2 = this.zzr.zze();
        if (zze2 == null) {
            zze = 1000000000000L;
        } else {
            zze = zze2.zze();
        }
        long j11 = j10 + zze;
        this.zzJ = j11;
        this.zzo.zzf(j11);
        zzle[] zzleVarArr = this.zzb;
        int length = zzleVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            zzle zzleVar = zzleVarArr[i10];
            if (zzae(zzleVar)) {
                zzleVar.zzJ(this.zzJ);
            }
        }
        for (zzkh zze3 = this.zzr.zze(); zze3 != null; zze3 = zze3.zzg()) {
            for (zzxv zzxvVar : zze3.zzi().zzc) {
            }
        }
    }

    private final void zzO(zzcc zzccVar, zzcc zzccVar2) {
        if (zzccVar.zzo() && zzccVar2.zzo()) {
            return;
        }
        int size = this.zzp.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzp);
            return;
        }
        Object obj = ((zzju) this.zzp.get(size)).zzb;
        int i10 = zzet.zza;
        throw null;
    }

    private final void zzP(long j10) {
        long j11;
        if (this.zzw.zze == 3 && !zzah()) {
            j11 = 1000;
        } else {
            j11 = zza;
        }
        this.zzi.zzj(2, j10 + j11);
    }

    private final void zzQ(boolean z10) {
        zzui zzuiVar = this.zzr.zze().zzf.zza;
        long zzv = zzv(zzuiVar, this.zzw.zzr, true, false);
        if (zzv != this.zzw.zzr) {
            zzkx zzkxVar = this.zzw;
            this.zzw = zzy(zzuiVar, zzv, zzkxVar.zzc, zzkxVar.zzd, z10, 5);
        }
    }

    private final void zzR(zzbq zzbqVar) {
        this.zzi.zzf(16);
        this.zzo.zzg(zzbqVar);
    }

    private final void zzS(boolean z10, int i10, boolean z11, int i11) {
        zzxv[] zzxvVarArr;
        this.zzx.zza(z11 ? 1 : 0);
        this.zzx.zzb(i11);
        this.zzw = this.zzw.zzc(z10, i10);
        zzab(false, false);
        for (zzkh zze = this.zzr.zze(); zze != null; zze = zze.zzg()) {
            for (zzxv zzxvVar : zze.zzi().zzc) {
            }
        }
        if (!zzah()) {
            zzW();
            zzZ();
            return;
        }
        int i12 = this.zzw.zze;
        if (i12 == 3) {
            this.zzo.zzh();
            zzU();
            this.zzi.zzi(2);
        } else if (i12 == 2) {
            this.zzi.zzi(2);
        }
    }

    private final void zzT(int i10) {
        zzkx zzkxVar = this.zzw;
        if (zzkxVar.zze != i10) {
            if (i10 != 2) {
                this.zzO = -9223372036854775807L;
            }
            this.zzw = zzkxVar.zze(i10);
        }
    }

    private final void zzU() {
        zzkh zze = this.zzr.zze();
        if (zze != null) {
            zzyc zzi = zze.zzi();
            int i10 = 0;
            while (true) {
                int length = this.zzb.length;
                if (i10 < 2) {
                    if (zzi.zzb(i10) && this.zzb[i10].zzcV() == 1) {
                        this.zzb[i10].zzO();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private final void zzV(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.zzG) {
            z12 = false;
        } else {
            z12 = true;
        }
        zzL(z12, false, true, false);
        this.zzx.zza(z11 ? 1 : 0);
        this.zzg.zze(this.zzu);
        zzT(1);
    }

    private final void zzW() {
        this.zzo.zzi();
        zzle[] zzleVarArr = this.zzb;
        int length = zzleVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            zzle zzleVar = zzleVarArr[i10];
            if (zzae(zzleVar)) {
                zzal(zzleVar);
            }
        }
    }

    private final void zzX() {
        boolean z10;
        zzkh zzd = this.zzr.zzd();
        if (!this.zzD && (zzd == null || !zzd.zza.zzp())) {
            z10 = false;
        } else {
            z10 = true;
        }
        zzkx zzkxVar = this.zzw;
        if (z10 != zzkxVar.zzg) {
            this.zzw = new zzkx(zzkxVar.zza, zzkxVar.zzb, zzkxVar.zzc, zzkxVar.zzd, zzkxVar.zze, zzkxVar.zzf, z10, zzkxVar.zzh, zzkxVar.zzi, zzkxVar.zzj, zzkxVar.zzk, zzkxVar.zzl, zzkxVar.zzm, zzkxVar.zzn, zzkxVar.zzp, zzkxVar.zzq, zzkxVar.zzr, zzkxVar.zzs, false);
        }
    }

    private final void zzY(zzui zzuiVar, zzwi zzwiVar, zzyc zzycVar) {
        zzcc zzccVar = this.zzw.zza;
        zzxv[] zzxvVarArr = zzycVar.zzc;
        this.zzg.zzf(this.zzu, zzccVar, zzuiVar, this.zzb, zzwiVar, zzxvVarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00be A[LOOP:0: B:32:0x00ae->B:39:0x00be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c9 -> B:32:0x00ae). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzZ() {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjx.zzZ():void");
    }

    private final void zzaa(zzcc zzccVar, zzui zzuiVar, zzcc zzccVar2, zzui zzuiVar2, long j10, boolean z10) {
        Object obj;
        zzbq zzbqVar;
        if (!zzai(zzccVar, zzuiVar)) {
            if (zzuiVar.zzb()) {
                zzbqVar = zzbq.zza;
            } else {
                zzbqVar = this.zzw.zzn;
            }
            if (!this.zzo.zzc().equals(zzbqVar)) {
                zzR(zzbqVar);
                zzG(this.zzw.zzn, zzbqVar.zzb, false, false);
                return;
            }
            return;
        }
        zzccVar.zze(zzccVar.zzn(zzuiVar.zza, this.zzm).zzc, this.zzl, 0L);
        zzhq zzhqVar = this.zzR;
        zzav zzavVar = this.zzl.zzj;
        int i10 = zzet.zza;
        zzhqVar.zzd(zzavVar);
        if (j10 != -9223372036854775807L) {
            this.zzR.zze(zzr(zzccVar, zzuiVar.zza, j10));
            return;
        }
        Object obj2 = this.zzl.zzb;
        if (!zzccVar2.zzo()) {
            obj = zzccVar2.zze(zzccVar2.zzn(zzuiVar2.zza, this.zzm).zzc, this.zzl, 0L).zzb;
        } else {
            obj = null;
        }
        if (zzet.zzG(obj, obj2) && !z10) {
            return;
        }
        this.zzR.zze(-9223372036854775807L);
    }

    private final void zzab(boolean z10, boolean z11) {
        this.zzB = z10;
        long j10 = -9223372036854775807L;
        if (z10 && !z11) {
            j10 = SystemClock.elapsedRealtime();
        }
        this.zzC = j10;
    }

    private final synchronized void zzac(zzfvk zzfvkVar, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!Boolean.valueOf(((zzjn) zzfvkVar).zza.zzy).booleanValue() && j10 > 0) {
            try {
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean zzad() {
        zzkh zzd = this.zzr.zzd();
        if (zzd == null || zzd.zzd() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    private static boolean zzae(zzle zzleVar) {
        if (zzleVar.zzcV() != 0) {
            return true;
        }
        return false;
    }

    private final boolean zzaf() {
        zzkh zze = this.zzr.zze();
        long j10 = zze.zzf.zze;
        if (!zze.zzd) {
            return false;
        }
        if (j10 == -9223372036854775807L || this.zzw.zzr < j10) {
            return true;
        }
        if (zzah()) {
            return false;
        }
        return true;
    }

    private static boolean zzag(zzkx zzkxVar, zzca zzcaVar) {
        zzui zzuiVar = zzkxVar.zzb;
        zzcc zzccVar = zzkxVar.zza;
        if (!zzccVar.zzo() && !zzccVar.zzn(zzuiVar.zza, zzcaVar).zzf) {
            return false;
        }
        return true;
    }

    private final boolean zzah() {
        zzkx zzkxVar = this.zzw;
        if (zzkxVar.zzl && zzkxVar.zzm == 0) {
            return true;
        }
        return false;
    }

    private final boolean zzai(zzcc zzccVar, zzui zzuiVar) {
        if (!zzuiVar.zzb() && !zzccVar.zzo()) {
            zzccVar.zze(zzccVar.zzn(zzuiVar.zza, this.zzm).zzc, this.zzl, 0L);
            if (this.zzl.zzb()) {
                zzcb zzcbVar = this.zzl;
                if (zzcbVar.zzi && zzcbVar.zzf != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzaf[] zzaj(zzxv zzxvVar) {
        int i10;
        if (zzxvVar != null) {
            i10 = zzxvVar.zzc();
        } else {
            i10 = 0;
        }
        zzaf[] zzafVarArr = new zzaf[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            zzafVarArr[i11] = zzxvVar.zzd(i11);
        }
        return zzafVarArr;
    }

    private static final void zzak(zzla zzlaVar) {
        zzlaVar.zzj();
        try {
            zzlaVar.zzc().zzt(zzlaVar.zza(), zzlaVar.zzg());
        } finally {
            zzlaVar.zzh(true);
        }
    }

    private static final void zzal(zzle zzleVar) {
        if (zzleVar.zzcV() == 2) {
            zzleVar.zzP();
        }
    }

    private static final void zzam(zzle zzleVar, long j10) {
        zzleVar.zzK();
        if (!(zzleVar instanceof zzwm)) {
            return;
        }
        zzwm zzwmVar = (zzwm) zzleVar;
        throw null;
    }

    public static int zzb(zzcb zzcbVar, zzca zzcaVar, int i10, boolean z10, Object obj, zzcc zzccVar, zzcc zzccVar2) {
        Object obj2 = zzccVar.zze(zzccVar.zzn(obj, zzcaVar).zzc, zzcbVar, 0L).zzb;
        for (int i11 = 0; i11 < zzccVar2.zzc(); i11++) {
            if (zzccVar2.zze(i11, zzcbVar, 0L).zzb.equals(obj2)) {
                return i11;
            }
        }
        int zza2 = zzccVar.zza(obj);
        int zzb = zzccVar.zzb();
        int i12 = zza2;
        int i13 = 0;
        int i14 = -1;
        while (true) {
            if (i13 >= zzb || i14 != -1) {
                break;
            }
            i12 = zzccVar.zzi(i12, zzcaVar, zzcbVar, i10, z10);
            if (i12 == -1) {
                i14 = -1;
                break;
            }
            i14 = zzccVar2.zza(zzccVar.zzf(i12));
            i13++;
        }
        if (i14 == -1) {
            return -1;
        }
        return zzccVar2.zzd(i14, zzcaVar, false).zzc;
    }

    public static /* synthetic */ zzkh zzd(zzjx zzjxVar, zzki zzkiVar, long j10) {
        zzkb zzkbVar = zzjxVar.zzg;
        zzyb zzybVar = zzjxVar.zze;
        zzyk zzj = zzkbVar.zzj();
        zzyc zzycVar = zzjxVar.zzf;
        return new zzkh(zzjxVar.zzd, j10, zzybVar, zzj, zzjxVar.zzs, zzkiVar, zzycVar);
    }

    public static final /* synthetic */ void zzq(zzla zzlaVar) {
        try {
            zzak(zzlaVar);
        } catch (zzhw e10) {
            zzea.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private final long zzr(zzcc zzccVar, Object obj, long j10) {
        long elapsedRealtime;
        zzccVar.zze(zzccVar.zzn(obj, this.zzm).zzc, this.zzl, 0L);
        zzcb zzcbVar = this.zzl;
        if (zzcbVar.zzf != -9223372036854775807L && zzcbVar.zzb()) {
            zzcb zzcbVar2 = this.zzl;
            if (zzcbVar2.zzi) {
                long j11 = zzcbVar2.zzg;
                if (j11 == -9223372036854775807L) {
                    elapsedRealtime = System.currentTimeMillis();
                } else {
                    elapsedRealtime = j11 + SystemClock.elapsedRealtime();
                }
                return zzet.zzr(elapsedRealtime - this.zzl.zzf) - j10;
            }
        }
        return -9223372036854775807L;
    }

    private final long zzs() {
        return zzt(this.zzw.zzp);
    }

    private final long zzt(long j10) {
        zzkh zzd = this.zzr.zzd();
        if (zzd == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.zzJ - zzd.zze()));
    }

    private final long zzu(zzui zzuiVar, long j10, boolean z10) {
        boolean z11;
        zzkk zzkkVar = this.zzr;
        if (zzkkVar.zze() != zzkkVar.zzf()) {
            z11 = true;
        } else {
            z11 = false;
        }
        return zzv(zzuiVar, j10, z11, z10);
    }

    private final long zzv(zzui zzuiVar, long j10, boolean z10, boolean z11) {
        zzW();
        zzab(false, true);
        if (z11 || this.zzw.zze == 3) {
            zzT(2);
        }
        zzkh zze = this.zzr.zze();
        zzkh zzkhVar = zze;
        while (zzkhVar != null && !zzuiVar.equals(zzkhVar.zzf.zza)) {
            zzkhVar = zzkhVar.zzg();
        }
        if (z10 || zze != zzkhVar || (zzkhVar != null && zzkhVar.zze() + j10 < 0)) {
            zzle[] zzleVarArr = this.zzb;
            int length = zzleVarArr.length;
            for (int i10 = 0; i10 < 2; i10++) {
                zzz(zzleVarArr[i10]);
            }
            if (zzkhVar != null) {
                while (this.zzr.zze() != zzkhVar) {
                    this.zzr.zza();
                }
                this.zzr.zzq(zzkhVar);
                zzkhVar.zzp(1000000000000L);
                zzA();
            }
        }
        if (zzkhVar != null) {
            this.zzr.zzq(zzkhVar);
            if (!zzkhVar.zzd) {
                zzkhVar.zzf = zzkhVar.zzf.zzb(j10);
            } else if (zzkhVar.zze) {
                j10 = zzkhVar.zza.zze(j10);
                zzkhVar.zza.zzj(j10 - this.zzn, false);
            }
            zzN(j10);
            zzH();
        } else {
            this.zzr.zzj();
            zzN(j10);
        }
        zzD(false);
        this.zzi.zzi(2);
        return j10;
    }

    private final Pair zzw(zzcc zzccVar) {
        long j10 = 0;
        if (zzccVar.zzo()) {
            return Pair.create(zzkx.zzh(), 0L);
        }
        Pair zzl = zzccVar.zzl(this.zzl, this.zzm, zzccVar.zzg(this.zzF), -9223372036854775807L);
        zzui zzi = this.zzr.zzi(zzccVar, zzl.first, 0L);
        long longValue = ((Long) zzl.second).longValue();
        if (zzi.zzb()) {
            zzccVar.zzn(zzi.zza, this.zzm);
            if (zzi.zzc == this.zzm.zze(zzi.zzb)) {
                this.zzm.zzj();
            }
        } else {
            j10 = longValue;
        }
        return Pair.create(zzi, Long.valueOf(j10));
    }

    private static Pair zzx(zzcc zzccVar, zzjw zzjwVar, boolean z10, int i10, boolean z11, zzcb zzcbVar, zzca zzcaVar) {
        zzcc zzccVar2;
        Pair zzl;
        zzcc zzccVar3 = zzjwVar.zza;
        if (zzccVar.zzo()) {
            return null;
        }
        if (true == zzccVar3.zzo()) {
            zzccVar2 = zzccVar;
        } else {
            zzccVar2 = zzccVar3;
        }
        try {
            zzl = zzccVar2.zzl(zzcbVar, zzcaVar, zzjwVar.zzb, zzjwVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzccVar.equals(zzccVar2)) {
            return zzl;
        }
        if (zzccVar.zza(zzl.first) != -1) {
            if (zzccVar2.zzn(zzl.first, zzcaVar).zzf && zzccVar2.zze(zzcaVar.zzc, zzcbVar, 0L).zzn == zzccVar2.zza(zzl.first)) {
                return zzccVar.zzl(zzcbVar, zzcaVar, zzccVar.zzn(zzl.first, zzcaVar).zzc, zzjwVar.zzc);
            }
            return zzl;
        }
        int zzb = zzb(zzcbVar, zzcaVar, i10, z11, zzl.first, zzccVar2, zzccVar);
        if (zzb != -1) {
            return zzccVar.zzl(zzcbVar, zzcaVar, zzb, -9223372036854775807L);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.ads.zzkx zzy(com.google.android.gms.internal.ads.zzui r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjx.zzy(com.google.android.gms.internal.ads.zzui, long, long, long, boolean, int):com.google.android.gms.internal.ads.zzkx");
    }

    private final void zzz(zzle zzleVar) {
        if (!zzae(zzleVar)) {
            return;
        }
        this.zzo.zzd(zzleVar);
        zzal(zzleVar);
        zzleVar.zzq();
        this.zzH--;
    }

    /* JADX WARN: Code restructure failed: missing block: B:449:0x08ac, code lost:
        if (r38.zzg.zzi(new com.google.android.gms.internal.ads.zzka(r38.zzu, r38.zzw.zza, r3.zzf.zza, r38.zzJ - r3.zze(), zzs(), r38.zzo.zzc().zzb, r38.zzw.zzl, r38.zzB, r36)) == false) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x08d8, code lost:
        if (r4 == false) goto L434;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:302:0x061f A[Catch: RuntimeException -> 0x09f0, IOException -> 0x0a1a, zzti -> 0x0a22, zzft -> 0x0a2a, zzbo -> 0x0a32, zzrb -> 0x0a49, zzhw -> 0x0a53, TryCatch #10 {zzbo -> 0x0a32, zzft -> 0x0a2a, zzhw -> 0x0a53, zzrb -> 0x0a49, zzti -> 0x0a22, IOException -> 0x0a1a, RuntimeException -> 0x09f0, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x0027, B:9:0x003f, B:10:0x0044, B:11:0x0049, B:15:0x0050, B:17:0x0059, B:19:0x0067, B:20:0x006f, B:21:0x007a, B:22:0x008e, B:23:0x00a6, B:24:0x00bc, B:26:0x00cb, B:27:0x00cf, B:28:0x00e0, B:30:0x00ef, B:31:0x010b, B:32:0x011e, B:33:0x0127, B:35:0x0139, B:36:0x0145, B:37:0x0155, B:39:0x0161, B:42:0x016c, B:43:0x0173, B:44:0x0180, B:48:0x0187, B:50:0x018f, B:52:0x0193, B:54:0x0199, B:56:0x01a1, B:58:0x01a9, B:59:0x01ac, B:61:0x01b1, B:68:0x01be, B:69:0x01bf, B:73:0x01c6, B:75:0x01d4, B:76:0x01d7, B:77:0x01dc, B:79:0x01ec, B:80:0x01ef, B:81:0x01f4, B:82:0x01f9, B:84:0x0205, B:85:0x0211, B:87:0x021d, B:89:0x0249, B:90:0x0269, B:97:0x0291, B:99:0x0295, B:100:0x0298, B:107:0x02a3, B:120:0x02b9, B:122:0x02bf, B:123:0x02c6, B:124:0x02d7, B:126:0x02fe, B:192:0x0415, B:176:0x03e2, B:175:0x03de, B:201:0x0426, B:202:0x0433, B:127:0x0320, B:131:0x0333, B:133:0x0343, B:135:0x035a, B:137:0x0364, B:203:0x0434, B:205:0x0448, B:208:0x0452, B:210:0x0461, B:212:0x046d, B:214:0x0482, B:215:0x0487, B:216:0x048b, B:218:0x048f, B:220:0x049c, B:292:0x05f8, B:294:0x0600, B:296:0x0608, B:299:0x060d, B:300:0x0619, B:302:0x061f, B:304:0x0627, B:307:0x0637, B:309:0x063d, B:310:0x065d, B:312:0x0663, B:314:0x0668, B:316:0x066d, B:318:0x0671, B:357:0x072a, B:359:0x0730, B:363:0x073b, B:365:0x0743, B:366:0x0748, B:368:0x0754, B:369:0x076e, B:371:0x0774, B:373:0x077c, B:375:0x0785, B:379:0x078e, B:384:0x079d, B:390:0x07aa, B:392:0x07b0, B:402:0x07c3, B:403:0x07c6, B:405:0x07d0, B:407:0x07d6, B:411:0x07e3, B:413:0x07eb, B:415:0x07ef, B:416:0x07fa, B:418:0x0800, B:471:0x090e, B:474:0x0916, B:476:0x091b, B:478:0x0923, B:480:0x0931, B:481:0x0938, B:482:0x093c, B:484:0x0942, B:486:0x094b, B:488:0x0951, B:490:0x095c, B:497:0x0980, B:499:0x0986, B:503:0x098f, B:513:0x09a7, B:510:0x09a0, B:512:0x09a4, B:491:0x0963, B:494:0x0971, B:495:0x0978, B:496:0x0979, B:419:0x0808, B:421:0x080f, B:423:0x0813, B:450:0x08ae, B:452:0x08ba, B:428:0x081f, B:430:0x0823, B:432:0x0837, B:434:0x0845, B:436:0x0851, B:440:0x085a, B:442:0x0864, B:448:0x086f, B:453:0x08c7, B:455:0x08cd, B:457:0x08d1, B:461:0x08da, B:463:0x08ea, B:465:0x08f2, B:467:0x08fc, B:468:0x0901, B:469:0x0906, B:470:0x090b, B:404:0x07c9, B:321:0x067b, B:323:0x067f, B:325:0x0687, B:327:0x068d, B:329:0x0697, B:332:0x069d, B:333:0x06a0, B:335:0x06a9, B:337:0x06bb, B:339:0x06c4, B:341:0x06cc, B:346:0x06d6, B:348:0x06fe, B:349:0x0701, B:350:0x070c, B:352:0x0712, B:354:0x0718, B:355:0x071f, B:223:0x04ab, B:225:0x04b1, B:228:0x04b7, B:231:0x04c2, B:233:0x04c7, B:236:0x04d5, B:238:0x04db, B:239:0x04e3, B:240:0x04e6, B:242:0x04ee, B:244:0x04fc, B:246:0x0538, B:248:0x0542, B:251:0x054d, B:253:0x0555, B:254:0x0558, B:255:0x055b, B:257:0x0561, B:259:0x0570, B:261:0x0576, B:263:0x0582, B:265:0x058c, B:267:0x059d, B:269:0x05a3, B:270:0x05ae, B:271:0x05b3, B:273:0x05be, B:276:0x05c3, B:278:0x05c9, B:280:0x05d1, B:282:0x05d7, B:284:0x05dd, B:288:0x05eb, B:290:0x05f2, B:291:0x05f5, B:219:0x0499, B:515:0x09af, B:519:0x09b6, B:520:0x09be, B:524:0x09de, B:109:0x02a5, B:111:0x02aa, B:112:0x02ad, B:115:0x02b4, B:119:0x02b8), top: B:602:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x069d A[Catch: RuntimeException -> 0x09f0, IOException -> 0x0a1a, zzti -> 0x0a22, zzft -> 0x0a2a, zzbo -> 0x0a32, zzrb -> 0x0a49, zzhw -> 0x0a53, TryCatch #10 {zzbo -> 0x0a32, zzft -> 0x0a2a, zzhw -> 0x0a53, zzrb -> 0x0a49, zzti -> 0x0a22, IOException -> 0x0a1a, RuntimeException -> 0x09f0, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x0027, B:9:0x003f, B:10:0x0044, B:11:0x0049, B:15:0x0050, B:17:0x0059, B:19:0x0067, B:20:0x006f, B:21:0x007a, B:22:0x008e, B:23:0x00a6, B:24:0x00bc, B:26:0x00cb, B:27:0x00cf, B:28:0x00e0, B:30:0x00ef, B:31:0x010b, B:32:0x011e, B:33:0x0127, B:35:0x0139, B:36:0x0145, B:37:0x0155, B:39:0x0161, B:42:0x016c, B:43:0x0173, B:44:0x0180, B:48:0x0187, B:50:0x018f, B:52:0x0193, B:54:0x0199, B:56:0x01a1, B:58:0x01a9, B:59:0x01ac, B:61:0x01b1, B:68:0x01be, B:69:0x01bf, B:73:0x01c6, B:75:0x01d4, B:76:0x01d7, B:77:0x01dc, B:79:0x01ec, B:80:0x01ef, B:81:0x01f4, B:82:0x01f9, B:84:0x0205, B:85:0x0211, B:87:0x021d, B:89:0x0249, B:90:0x0269, B:97:0x0291, B:99:0x0295, B:100:0x0298, B:107:0x02a3, B:120:0x02b9, B:122:0x02bf, B:123:0x02c6, B:124:0x02d7, B:126:0x02fe, B:192:0x0415, B:176:0x03e2, B:175:0x03de, B:201:0x0426, B:202:0x0433, B:127:0x0320, B:131:0x0333, B:133:0x0343, B:135:0x035a, B:137:0x0364, B:203:0x0434, B:205:0x0448, B:208:0x0452, B:210:0x0461, B:212:0x046d, B:214:0x0482, B:215:0x0487, B:216:0x048b, B:218:0x048f, B:220:0x049c, B:292:0x05f8, B:294:0x0600, B:296:0x0608, B:299:0x060d, B:300:0x0619, B:302:0x061f, B:304:0x0627, B:307:0x0637, B:309:0x063d, B:310:0x065d, B:312:0x0663, B:314:0x0668, B:316:0x066d, B:318:0x0671, B:357:0x072a, B:359:0x0730, B:363:0x073b, B:365:0x0743, B:366:0x0748, B:368:0x0754, B:369:0x076e, B:371:0x0774, B:373:0x077c, B:375:0x0785, B:379:0x078e, B:384:0x079d, B:390:0x07aa, B:392:0x07b0, B:402:0x07c3, B:403:0x07c6, B:405:0x07d0, B:407:0x07d6, B:411:0x07e3, B:413:0x07eb, B:415:0x07ef, B:416:0x07fa, B:418:0x0800, B:471:0x090e, B:474:0x0916, B:476:0x091b, B:478:0x0923, B:480:0x0931, B:481:0x0938, B:482:0x093c, B:484:0x0942, B:486:0x094b, B:488:0x0951, B:490:0x095c, B:497:0x0980, B:499:0x0986, B:503:0x098f, B:513:0x09a7, B:510:0x09a0, B:512:0x09a4, B:491:0x0963, B:494:0x0971, B:495:0x0978, B:496:0x0979, B:419:0x0808, B:421:0x080f, B:423:0x0813, B:450:0x08ae, B:452:0x08ba, B:428:0x081f, B:430:0x0823, B:432:0x0837, B:434:0x0845, B:436:0x0851, B:440:0x085a, B:442:0x0864, B:448:0x086f, B:453:0x08c7, B:455:0x08cd, B:457:0x08d1, B:461:0x08da, B:463:0x08ea, B:465:0x08f2, B:467:0x08fc, B:468:0x0901, B:469:0x0906, B:470:0x090b, B:404:0x07c9, B:321:0x067b, B:323:0x067f, B:325:0x0687, B:327:0x068d, B:329:0x0697, B:332:0x069d, B:333:0x06a0, B:335:0x06a9, B:337:0x06bb, B:339:0x06c4, B:341:0x06cc, B:346:0x06d6, B:348:0x06fe, B:349:0x0701, B:350:0x070c, B:352:0x0712, B:354:0x0718, B:355:0x071f, B:223:0x04ab, B:225:0x04b1, B:228:0x04b7, B:231:0x04c2, B:233:0x04c7, B:236:0x04d5, B:238:0x04db, B:239:0x04e3, B:240:0x04e6, B:242:0x04ee, B:244:0x04fc, B:246:0x0538, B:248:0x0542, B:251:0x054d, B:253:0x0555, B:254:0x0558, B:255:0x055b, B:257:0x0561, B:259:0x0570, B:261:0x0576, B:263:0x0582, B:265:0x058c, B:267:0x059d, B:269:0x05a3, B:270:0x05ae, B:271:0x05b3, B:273:0x05be, B:276:0x05c3, B:278:0x05c9, B:280:0x05d1, B:282:0x05d7, B:284:0x05dd, B:288:0x05eb, B:290:0x05f2, B:291:0x05f5, B:219:0x0499, B:515:0x09af, B:519:0x09b6, B:520:0x09be, B:524:0x09de, B:109:0x02a5, B:111:0x02aa, B:112:0x02ad, B:115:0x02b4, B:119:0x02b8), top: B:602:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06bb A[Catch: RuntimeException -> 0x09f0, IOException -> 0x0a1a, zzti -> 0x0a22, zzft -> 0x0a2a, zzbo -> 0x0a32, zzrb -> 0x0a49, zzhw -> 0x0a53, TryCatch #10 {zzbo -> 0x0a32, zzft -> 0x0a2a, zzhw -> 0x0a53, zzrb -> 0x0a49, zzti -> 0x0a22, IOException -> 0x0a1a, RuntimeException -> 0x09f0, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x0027, B:9:0x003f, B:10:0x0044, B:11:0x0049, B:15:0x0050, B:17:0x0059, B:19:0x0067, B:20:0x006f, B:21:0x007a, B:22:0x008e, B:23:0x00a6, B:24:0x00bc, B:26:0x00cb, B:27:0x00cf, B:28:0x00e0, B:30:0x00ef, B:31:0x010b, B:32:0x011e, B:33:0x0127, B:35:0x0139, B:36:0x0145, B:37:0x0155, B:39:0x0161, B:42:0x016c, B:43:0x0173, B:44:0x0180, B:48:0x0187, B:50:0x018f, B:52:0x0193, B:54:0x0199, B:56:0x01a1, B:58:0x01a9, B:59:0x01ac, B:61:0x01b1, B:68:0x01be, B:69:0x01bf, B:73:0x01c6, B:75:0x01d4, B:76:0x01d7, B:77:0x01dc, B:79:0x01ec, B:80:0x01ef, B:81:0x01f4, B:82:0x01f9, B:84:0x0205, B:85:0x0211, B:87:0x021d, B:89:0x0249, B:90:0x0269, B:97:0x0291, B:99:0x0295, B:100:0x0298, B:107:0x02a3, B:120:0x02b9, B:122:0x02bf, B:123:0x02c6, B:124:0x02d7, B:126:0x02fe, B:192:0x0415, B:176:0x03e2, B:175:0x03de, B:201:0x0426, B:202:0x0433, B:127:0x0320, B:131:0x0333, B:133:0x0343, B:135:0x035a, B:137:0x0364, B:203:0x0434, B:205:0x0448, B:208:0x0452, B:210:0x0461, B:212:0x046d, B:214:0x0482, B:215:0x0487, B:216:0x048b, B:218:0x048f, B:220:0x049c, B:292:0x05f8, B:294:0x0600, B:296:0x0608, B:299:0x060d, B:300:0x0619, B:302:0x061f, B:304:0x0627, B:307:0x0637, B:309:0x063d, B:310:0x065d, B:312:0x0663, B:314:0x0668, B:316:0x066d, B:318:0x0671, B:357:0x072a, B:359:0x0730, B:363:0x073b, B:365:0x0743, B:366:0x0748, B:368:0x0754, B:369:0x076e, B:371:0x0774, B:373:0x077c, B:375:0x0785, B:379:0x078e, B:384:0x079d, B:390:0x07aa, B:392:0x07b0, B:402:0x07c3, B:403:0x07c6, B:405:0x07d0, B:407:0x07d6, B:411:0x07e3, B:413:0x07eb, B:415:0x07ef, B:416:0x07fa, B:418:0x0800, B:471:0x090e, B:474:0x0916, B:476:0x091b, B:478:0x0923, B:480:0x0931, B:481:0x0938, B:482:0x093c, B:484:0x0942, B:486:0x094b, B:488:0x0951, B:490:0x095c, B:497:0x0980, B:499:0x0986, B:503:0x098f, B:513:0x09a7, B:510:0x09a0, B:512:0x09a4, B:491:0x0963, B:494:0x0971, B:495:0x0978, B:496:0x0979, B:419:0x0808, B:421:0x080f, B:423:0x0813, B:450:0x08ae, B:452:0x08ba, B:428:0x081f, B:430:0x0823, B:432:0x0837, B:434:0x0845, B:436:0x0851, B:440:0x085a, B:442:0x0864, B:448:0x086f, B:453:0x08c7, B:455:0x08cd, B:457:0x08d1, B:461:0x08da, B:463:0x08ea, B:465:0x08f2, B:467:0x08fc, B:468:0x0901, B:469:0x0906, B:470:0x090b, B:404:0x07c9, B:321:0x067b, B:323:0x067f, B:325:0x0687, B:327:0x068d, B:329:0x0697, B:332:0x069d, B:333:0x06a0, B:335:0x06a9, B:337:0x06bb, B:339:0x06c4, B:341:0x06cc, B:346:0x06d6, B:348:0x06fe, B:349:0x0701, B:350:0x070c, B:352:0x0712, B:354:0x0718, B:355:0x071f, B:223:0x04ab, B:225:0x04b1, B:228:0x04b7, B:231:0x04c2, B:233:0x04c7, B:236:0x04d5, B:238:0x04db, B:239:0x04e3, B:240:0x04e6, B:242:0x04ee, B:244:0x04fc, B:246:0x0538, B:248:0x0542, B:251:0x054d, B:253:0x0555, B:254:0x0558, B:255:0x055b, B:257:0x0561, B:259:0x0570, B:261:0x0576, B:263:0x0582, B:265:0x058c, B:267:0x059d, B:269:0x05a3, B:270:0x05ae, B:271:0x05b3, B:273:0x05be, B:276:0x05c3, B:278:0x05c9, B:280:0x05d1, B:282:0x05d7, B:284:0x05dd, B:288:0x05eb, B:290:0x05f2, B:291:0x05f5, B:219:0x0499, B:515:0x09af, B:519:0x09b6, B:520:0x09be, B:524:0x09de, B:109:0x02a5, B:111:0x02aa, B:112:0x02ad, B:115:0x02b4, B:119:0x02b8), top: B:602:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06fe A[Catch: RuntimeException -> 0x09f0, IOException -> 0x0a1a, zzti -> 0x0a22, zzft -> 0x0a2a, zzbo -> 0x0a32, zzrb -> 0x0a49, zzhw -> 0x0a53, TryCatch #10 {zzbo -> 0x0a32, zzft -> 0x0a2a, zzhw -> 0x0a53, zzrb -> 0x0a49, zzti -> 0x0a22, IOException -> 0x0a1a, RuntimeException -> 0x09f0, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x0027, B:9:0x003f, B:10:0x0044, B:11:0x0049, B:15:0x0050, B:17:0x0059, B:19:0x0067, B:20:0x006f, B:21:0x007a, B:22:0x008e, B:23:0x00a6, B:24:0x00bc, B:26:0x00cb, B:27:0x00cf, B:28:0x00e0, B:30:0x00ef, B:31:0x010b, B:32:0x011e, B:33:0x0127, B:35:0x0139, B:36:0x0145, B:37:0x0155, B:39:0x0161, B:42:0x016c, B:43:0x0173, B:44:0x0180, B:48:0x0187, B:50:0x018f, B:52:0x0193, B:54:0x0199, B:56:0x01a1, B:58:0x01a9, B:59:0x01ac, B:61:0x01b1, B:68:0x01be, B:69:0x01bf, B:73:0x01c6, B:75:0x01d4, B:76:0x01d7, B:77:0x01dc, B:79:0x01ec, B:80:0x01ef, B:81:0x01f4, B:82:0x01f9, B:84:0x0205, B:85:0x0211, B:87:0x021d, B:89:0x0249, B:90:0x0269, B:97:0x0291, B:99:0x0295, B:100:0x0298, B:107:0x02a3, B:120:0x02b9, B:122:0x02bf, B:123:0x02c6, B:124:0x02d7, B:126:0x02fe, B:192:0x0415, B:176:0x03e2, B:175:0x03de, B:201:0x0426, B:202:0x0433, B:127:0x0320, B:131:0x0333, B:133:0x0343, B:135:0x035a, B:137:0x0364, B:203:0x0434, B:205:0x0448, B:208:0x0452, B:210:0x0461, B:212:0x046d, B:214:0x0482, B:215:0x0487, B:216:0x048b, B:218:0x048f, B:220:0x049c, B:292:0x05f8, B:294:0x0600, B:296:0x0608, B:299:0x060d, B:300:0x0619, B:302:0x061f, B:304:0x0627, B:307:0x0637, B:309:0x063d, B:310:0x065d, B:312:0x0663, B:314:0x0668, B:316:0x066d, B:318:0x0671, B:357:0x072a, B:359:0x0730, B:363:0x073b, B:365:0x0743, B:366:0x0748, B:368:0x0754, B:369:0x076e, B:371:0x0774, B:373:0x077c, B:375:0x0785, B:379:0x078e, B:384:0x079d, B:390:0x07aa, B:392:0x07b0, B:402:0x07c3, B:403:0x07c6, B:405:0x07d0, B:407:0x07d6, B:411:0x07e3, B:413:0x07eb, B:415:0x07ef, B:416:0x07fa, B:418:0x0800, B:471:0x090e, B:474:0x0916, B:476:0x091b, B:478:0x0923, B:480:0x0931, B:481:0x0938, B:482:0x093c, B:484:0x0942, B:486:0x094b, B:488:0x0951, B:490:0x095c, B:497:0x0980, B:499:0x0986, B:503:0x098f, B:513:0x09a7, B:510:0x09a0, B:512:0x09a4, B:491:0x0963, B:494:0x0971, B:495:0x0978, B:496:0x0979, B:419:0x0808, B:421:0x080f, B:423:0x0813, B:450:0x08ae, B:452:0x08ba, B:428:0x081f, B:430:0x0823, B:432:0x0837, B:434:0x0845, B:436:0x0851, B:440:0x085a, B:442:0x0864, B:448:0x086f, B:453:0x08c7, B:455:0x08cd, B:457:0x08d1, B:461:0x08da, B:463:0x08ea, B:465:0x08f2, B:467:0x08fc, B:468:0x0901, B:469:0x0906, B:470:0x090b, B:404:0x07c9, B:321:0x067b, B:323:0x067f, B:325:0x0687, B:327:0x068d, B:329:0x0697, B:332:0x069d, B:333:0x06a0, B:335:0x06a9, B:337:0x06bb, B:339:0x06c4, B:341:0x06cc, B:346:0x06d6, B:348:0x06fe, B:349:0x0701, B:350:0x070c, B:352:0x0712, B:354:0x0718, B:355:0x071f, B:223:0x04ab, B:225:0x04b1, B:228:0x04b7, B:231:0x04c2, B:233:0x04c7, B:236:0x04d5, B:238:0x04db, B:239:0x04e3, B:240:0x04e6, B:242:0x04ee, B:244:0x04fc, B:246:0x0538, B:248:0x0542, B:251:0x054d, B:253:0x0555, B:254:0x0558, B:255:0x055b, B:257:0x0561, B:259:0x0570, B:261:0x0576, B:263:0x0582, B:265:0x058c, B:267:0x059d, B:269:0x05a3, B:270:0x05ae, B:271:0x05b3, B:273:0x05be, B:276:0x05c3, B:278:0x05c9, B:280:0x05d1, B:282:0x05d7, B:284:0x05dd, B:288:0x05eb, B:290:0x05f2, B:291:0x05f5, B:219:0x0499, B:515:0x09af, B:519:0x09b6, B:520:0x09be, B:524:0x09de, B:109:0x02a5, B:111:0x02aa, B:112:0x02ad, B:115:0x02b4, B:119:0x02b8), top: B:602:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0712 A[Catch: RuntimeException -> 0x09f0, IOException -> 0x0a1a, zzti -> 0x0a22, zzft -> 0x0a2a, zzbo -> 0x0a32, zzrb -> 0x0a49, zzhw -> 0x0a53, TryCatch #10 {zzbo -> 0x0a32, zzft -> 0x0a2a, zzhw -> 0x0a53, zzrb -> 0x0a49, zzti -> 0x0a22, IOException -> 0x0a1a, RuntimeException -> 0x09f0, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x0027, B:9:0x003f, B:10:0x0044, B:11:0x0049, B:15:0x0050, B:17:0x0059, B:19:0x0067, B:20:0x006f, B:21:0x007a, B:22:0x008e, B:23:0x00a6, B:24:0x00bc, B:26:0x00cb, B:27:0x00cf, B:28:0x00e0, B:30:0x00ef, B:31:0x010b, B:32:0x011e, B:33:0x0127, B:35:0x0139, B:36:0x0145, B:37:0x0155, B:39:0x0161, B:42:0x016c, B:43:0x0173, B:44:0x0180, B:48:0x0187, B:50:0x018f, B:52:0x0193, B:54:0x0199, B:56:0x01a1, B:58:0x01a9, B:59:0x01ac, B:61:0x01b1, B:68:0x01be, B:69:0x01bf, B:73:0x01c6, B:75:0x01d4, B:76:0x01d7, B:77:0x01dc, B:79:0x01ec, B:80:0x01ef, B:81:0x01f4, B:82:0x01f9, B:84:0x0205, B:85:0x0211, B:87:0x021d, B:89:0x0249, B:90:0x0269, B:97:0x0291, B:99:0x0295, B:100:0x0298, B:107:0x02a3, B:120:0x02b9, B:122:0x02bf, B:123:0x02c6, B:124:0x02d7, B:126:0x02fe, B:192:0x0415, B:176:0x03e2, B:175:0x03de, B:201:0x0426, B:202:0x0433, B:127:0x0320, B:131:0x0333, B:133:0x0343, B:135:0x035a, B:137:0x0364, B:203:0x0434, B:205:0x0448, B:208:0x0452, B:210:0x0461, B:212:0x046d, B:214:0x0482, B:215:0x0487, B:216:0x048b, B:218:0x048f, B:220:0x049c, B:292:0x05f8, B:294:0x0600, B:296:0x0608, B:299:0x060d, B:300:0x0619, B:302:0x061f, B:304:0x0627, B:307:0x0637, B:309:0x063d, B:310:0x065d, B:312:0x0663, B:314:0x0668, B:316:0x066d, B:318:0x0671, B:357:0x072a, B:359:0x0730, B:363:0x073b, B:365:0x0743, B:366:0x0748, B:368:0x0754, B:369:0x076e, B:371:0x0774, B:373:0x077c, B:375:0x0785, B:379:0x078e, B:384:0x079d, B:390:0x07aa, B:392:0x07b0, B:402:0x07c3, B:403:0x07c6, B:405:0x07d0, B:407:0x07d6, B:411:0x07e3, B:413:0x07eb, B:415:0x07ef, B:416:0x07fa, B:418:0x0800, B:471:0x090e, B:474:0x0916, B:476:0x091b, B:478:0x0923, B:480:0x0931, B:481:0x0938, B:482:0x093c, B:484:0x0942, B:486:0x094b, B:488:0x0951, B:490:0x095c, B:497:0x0980, B:499:0x0986, B:503:0x098f, B:513:0x09a7, B:510:0x09a0, B:512:0x09a4, B:491:0x0963, B:494:0x0971, B:495:0x0978, B:496:0x0979, B:419:0x0808, B:421:0x080f, B:423:0x0813, B:450:0x08ae, B:452:0x08ba, B:428:0x081f, B:430:0x0823, B:432:0x0837, B:434:0x0845, B:436:0x0851, B:440:0x085a, B:442:0x0864, B:448:0x086f, B:453:0x08c7, B:455:0x08cd, B:457:0x08d1, B:461:0x08da, B:463:0x08ea, B:465:0x08f2, B:467:0x08fc, B:468:0x0901, B:469:0x0906, B:470:0x090b, B:404:0x07c9, B:321:0x067b, B:323:0x067f, B:325:0x0687, B:327:0x068d, B:329:0x0697, B:332:0x069d, B:333:0x06a0, B:335:0x06a9, B:337:0x06bb, B:339:0x06c4, B:341:0x06cc, B:346:0x06d6, B:348:0x06fe, B:349:0x0701, B:350:0x070c, B:352:0x0712, B:354:0x0718, B:355:0x071f, B:223:0x04ab, B:225:0x04b1, B:228:0x04b7, B:231:0x04c2, B:233:0x04c7, B:236:0x04d5, B:238:0x04db, B:239:0x04e3, B:240:0x04e6, B:242:0x04ee, B:244:0x04fc, B:246:0x0538, B:248:0x0542, B:251:0x054d, B:253:0x0555, B:254:0x0558, B:255:0x055b, B:257:0x0561, B:259:0x0570, B:261:0x0576, B:263:0x0582, B:265:0x058c, B:267:0x059d, B:269:0x05a3, B:270:0x05ae, B:271:0x05b3, B:273:0x05be, B:276:0x05c3, B:278:0x05c9, B:280:0x05d1, B:282:0x05d7, B:284:0x05dd, B:288:0x05eb, B:290:0x05f2, B:291:0x05f5, B:219:0x0499, B:515:0x09af, B:519:0x09b6, B:520:0x09be, B:524:0x09de, B:109:0x02a5, B:111:0x02aa, B:112:0x02ad, B:115:0x02b4, B:119:0x02b8), top: B:602:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x07c3 A[Catch: RuntimeException -> 0x09f0, IOException -> 0x0a1a, zzti -> 0x0a22, zzft -> 0x0a2a, zzbo -> 0x0a32, zzrb -> 0x0a49, zzhw -> 0x0a53, TryCatch #10 {zzbo -> 0x0a32, zzft -> 0x0a2a, zzhw -> 0x0a53, zzrb -> 0x0a49, zzti -> 0x0a22, IOException -> 0x0a1a, RuntimeException -> 0x09f0, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x0027, B:9:0x003f, B:10:0x0044, B:11:0x0049, B:15:0x0050, B:17:0x0059, B:19:0x0067, B:20:0x006f, B:21:0x007a, B:22:0x008e, B:23:0x00a6, B:24:0x00bc, B:26:0x00cb, B:27:0x00cf, B:28:0x00e0, B:30:0x00ef, B:31:0x010b, B:32:0x011e, B:33:0x0127, B:35:0x0139, B:36:0x0145, B:37:0x0155, B:39:0x0161, B:42:0x016c, B:43:0x0173, B:44:0x0180, B:48:0x0187, B:50:0x018f, B:52:0x0193, B:54:0x0199, B:56:0x01a1, B:58:0x01a9, B:59:0x01ac, B:61:0x01b1, B:68:0x01be, B:69:0x01bf, B:73:0x01c6, B:75:0x01d4, B:76:0x01d7, B:77:0x01dc, B:79:0x01ec, B:80:0x01ef, B:81:0x01f4, B:82:0x01f9, B:84:0x0205, B:85:0x0211, B:87:0x021d, B:89:0x0249, B:90:0x0269, B:97:0x0291, B:99:0x0295, B:100:0x0298, B:107:0x02a3, B:120:0x02b9, B:122:0x02bf, B:123:0x02c6, B:124:0x02d7, B:126:0x02fe, B:192:0x0415, B:176:0x03e2, B:175:0x03de, B:201:0x0426, B:202:0x0433, B:127:0x0320, B:131:0x0333, B:133:0x0343, B:135:0x035a, B:137:0x0364, B:203:0x0434, B:205:0x0448, B:208:0x0452, B:210:0x0461, B:212:0x046d, B:214:0x0482, B:215:0x0487, B:216:0x048b, B:218:0x048f, B:220:0x049c, B:292:0x05f8, B:294:0x0600, B:296:0x0608, B:299:0x060d, B:300:0x0619, B:302:0x061f, B:304:0x0627, B:307:0x0637, B:309:0x063d, B:310:0x065d, B:312:0x0663, B:314:0x0668, B:316:0x066d, B:318:0x0671, B:357:0x072a, B:359:0x0730, B:363:0x073b, B:365:0x0743, B:366:0x0748, B:368:0x0754, B:369:0x076e, B:371:0x0774, B:373:0x077c, B:375:0x0785, B:379:0x078e, B:384:0x079d, B:390:0x07aa, B:392:0x07b0, B:402:0x07c3, B:403:0x07c6, B:405:0x07d0, B:407:0x07d6, B:411:0x07e3, B:413:0x07eb, B:415:0x07ef, B:416:0x07fa, B:418:0x0800, B:471:0x090e, B:474:0x0916, B:476:0x091b, B:478:0x0923, B:480:0x0931, B:481:0x0938, B:482:0x093c, B:484:0x0942, B:486:0x094b, B:488:0x0951, B:490:0x095c, B:497:0x0980, B:499:0x0986, B:503:0x098f, B:513:0x09a7, B:510:0x09a0, B:512:0x09a4, B:491:0x0963, B:494:0x0971, B:495:0x0978, B:496:0x0979, B:419:0x0808, B:421:0x080f, B:423:0x0813, B:450:0x08ae, B:452:0x08ba, B:428:0x081f, B:430:0x0823, B:432:0x0837, B:434:0x0845, B:436:0x0851, B:440:0x085a, B:442:0x0864, B:448:0x086f, B:453:0x08c7, B:455:0x08cd, B:457:0x08d1, B:461:0x08da, B:463:0x08ea, B:465:0x08f2, B:467:0x08fc, B:468:0x0901, B:469:0x0906, B:470:0x090b, B:404:0x07c9, B:321:0x067b, B:323:0x067f, B:325:0x0687, B:327:0x068d, B:329:0x0697, B:332:0x069d, B:333:0x06a0, B:335:0x06a9, B:337:0x06bb, B:339:0x06c4, B:341:0x06cc, B:346:0x06d6, B:348:0x06fe, B:349:0x0701, B:350:0x070c, B:352:0x0712, B:354:0x0718, B:355:0x071f, B:223:0x04ab, B:225:0x04b1, B:228:0x04b7, B:231:0x04c2, B:233:0x04c7, B:236:0x04d5, B:238:0x04db, B:239:0x04e3, B:240:0x04e6, B:242:0x04ee, B:244:0x04fc, B:246:0x0538, B:248:0x0542, B:251:0x054d, B:253:0x0555, B:254:0x0558, B:255:0x055b, B:257:0x0561, B:259:0x0570, B:261:0x0576, B:263:0x0582, B:265:0x058c, B:267:0x059d, B:269:0x05a3, B:270:0x05ae, B:271:0x05b3, B:273:0x05be, B:276:0x05c3, B:278:0x05c9, B:280:0x05d1, B:282:0x05d7, B:284:0x05dd, B:288:0x05eb, B:290:0x05f2, B:291:0x05f5, B:219:0x0499, B:515:0x09af, B:519:0x09b6, B:520:0x09be, B:524:0x09de, B:109:0x02a5, B:111:0x02aa, B:112:0x02ad, B:115:0x02b4, B:119:0x02b8), top: B:602:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x08ba A[Catch: RuntimeException -> 0x09f0, IOException -> 0x0a1a, zzti -> 0x0a22, zzft -> 0x0a2a, zzbo -> 0x0a32, zzrb -> 0x0a49, zzhw -> 0x0a53, TryCatch #10 {zzbo -> 0x0a32, zzft -> 0x0a2a, zzhw -> 0x0a53, zzrb -> 0x0a49, zzti -> 0x0a22, IOException -> 0x0a1a, RuntimeException -> 0x09f0, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x0027, B:9:0x003f, B:10:0x0044, B:11:0x0049, B:15:0x0050, B:17:0x0059, B:19:0x0067, B:20:0x006f, B:21:0x007a, B:22:0x008e, B:23:0x00a6, B:24:0x00bc, B:26:0x00cb, B:27:0x00cf, B:28:0x00e0, B:30:0x00ef, B:31:0x010b, B:32:0x011e, B:33:0x0127, B:35:0x0139, B:36:0x0145, B:37:0x0155, B:39:0x0161, B:42:0x016c, B:43:0x0173, B:44:0x0180, B:48:0x0187, B:50:0x018f, B:52:0x0193, B:54:0x0199, B:56:0x01a1, B:58:0x01a9, B:59:0x01ac, B:61:0x01b1, B:68:0x01be, B:69:0x01bf, B:73:0x01c6, B:75:0x01d4, B:76:0x01d7, B:77:0x01dc, B:79:0x01ec, B:80:0x01ef, B:81:0x01f4, B:82:0x01f9, B:84:0x0205, B:85:0x0211, B:87:0x021d, B:89:0x0249, B:90:0x0269, B:97:0x0291, B:99:0x0295, B:100:0x0298, B:107:0x02a3, B:120:0x02b9, B:122:0x02bf, B:123:0x02c6, B:124:0x02d7, B:126:0x02fe, B:192:0x0415, B:176:0x03e2, B:175:0x03de, B:201:0x0426, B:202:0x0433, B:127:0x0320, B:131:0x0333, B:133:0x0343, B:135:0x035a, B:137:0x0364, B:203:0x0434, B:205:0x0448, B:208:0x0452, B:210:0x0461, B:212:0x046d, B:214:0x0482, B:215:0x0487, B:216:0x048b, B:218:0x048f, B:220:0x049c, B:292:0x05f8, B:294:0x0600, B:296:0x0608, B:299:0x060d, B:300:0x0619, B:302:0x061f, B:304:0x0627, B:307:0x0637, B:309:0x063d, B:310:0x065d, B:312:0x0663, B:314:0x0668, B:316:0x066d, B:318:0x0671, B:357:0x072a, B:359:0x0730, B:363:0x073b, B:365:0x0743, B:366:0x0748, B:368:0x0754, B:369:0x076e, B:371:0x0774, B:373:0x077c, B:375:0x0785, B:379:0x078e, B:384:0x079d, B:390:0x07aa, B:392:0x07b0, B:402:0x07c3, B:403:0x07c6, B:405:0x07d0, B:407:0x07d6, B:411:0x07e3, B:413:0x07eb, B:415:0x07ef, B:416:0x07fa, B:418:0x0800, B:471:0x090e, B:474:0x0916, B:476:0x091b, B:478:0x0923, B:480:0x0931, B:481:0x0938, B:482:0x093c, B:484:0x0942, B:486:0x094b, B:488:0x0951, B:490:0x095c, B:497:0x0980, B:499:0x0986, B:503:0x098f, B:513:0x09a7, B:510:0x09a0, B:512:0x09a4, B:491:0x0963, B:494:0x0971, B:495:0x0978, B:496:0x0979, B:419:0x0808, B:421:0x080f, B:423:0x0813, B:450:0x08ae, B:452:0x08ba, B:428:0x081f, B:430:0x0823, B:432:0x0837, B:434:0x0845, B:436:0x0851, B:440:0x085a, B:442:0x0864, B:448:0x086f, B:453:0x08c7, B:455:0x08cd, B:457:0x08d1, B:461:0x08da, B:463:0x08ea, B:465:0x08f2, B:467:0x08fc, B:468:0x0901, B:469:0x0906, B:470:0x090b, B:404:0x07c9, B:321:0x067b, B:323:0x067f, B:325:0x0687, B:327:0x068d, B:329:0x0697, B:332:0x069d, B:333:0x06a0, B:335:0x06a9, B:337:0x06bb, B:339:0x06c4, B:341:0x06cc, B:346:0x06d6, B:348:0x06fe, B:349:0x0701, B:350:0x070c, B:352:0x0712, B:354:0x0718, B:355:0x071f, B:223:0x04ab, B:225:0x04b1, B:228:0x04b7, B:231:0x04c2, B:233:0x04c7, B:236:0x04d5, B:238:0x04db, B:239:0x04e3, B:240:0x04e6, B:242:0x04ee, B:244:0x04fc, B:246:0x0538, B:248:0x0542, B:251:0x054d, B:253:0x0555, B:254:0x0558, B:255:0x055b, B:257:0x0561, B:259:0x0570, B:261:0x0576, B:263:0x0582, B:265:0x058c, B:267:0x059d, B:269:0x05a3, B:270:0x05ae, B:271:0x05b3, B:273:0x05be, B:276:0x05c3, B:278:0x05c9, B:280:0x05d1, B:282:0x05d7, B:284:0x05dd, B:288:0x05eb, B:290:0x05f2, B:291:0x05f5, B:219:0x0499, B:515:0x09af, B:519:0x09b6, B:520:0x09be, B:524:0x09de, B:109:0x02a5, B:111:0x02aa, B:112:0x02ad, B:115:0x02b4, B:119:0x02b8), top: B:602:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0986 A[Catch: RuntimeException -> 0x09f0, IOException -> 0x0a1a, zzti -> 0x0a22, zzft -> 0x0a2a, zzbo -> 0x0a32, zzrb -> 0x0a49, zzhw -> 0x0a53, TryCatch #10 {zzbo -> 0x0a32, zzft -> 0x0a2a, zzhw -> 0x0a53, zzrb -> 0x0a49, zzti -> 0x0a22, IOException -> 0x0a1a, RuntimeException -> 0x09f0, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x0027, B:9:0x003f, B:10:0x0044, B:11:0x0049, B:15:0x0050, B:17:0x0059, B:19:0x0067, B:20:0x006f, B:21:0x007a, B:22:0x008e, B:23:0x00a6, B:24:0x00bc, B:26:0x00cb, B:27:0x00cf, B:28:0x00e0, B:30:0x00ef, B:31:0x010b, B:32:0x011e, B:33:0x0127, B:35:0x0139, B:36:0x0145, B:37:0x0155, B:39:0x0161, B:42:0x016c, B:43:0x0173, B:44:0x0180, B:48:0x0187, B:50:0x018f, B:52:0x0193, B:54:0x0199, B:56:0x01a1, B:58:0x01a9, B:59:0x01ac, B:61:0x01b1, B:68:0x01be, B:69:0x01bf, B:73:0x01c6, B:75:0x01d4, B:76:0x01d7, B:77:0x01dc, B:79:0x01ec, B:80:0x01ef, B:81:0x01f4, B:82:0x01f9, B:84:0x0205, B:85:0x0211, B:87:0x021d, B:89:0x0249, B:90:0x0269, B:97:0x0291, B:99:0x0295, B:100:0x0298, B:107:0x02a3, B:120:0x02b9, B:122:0x02bf, B:123:0x02c6, B:124:0x02d7, B:126:0x02fe, B:192:0x0415, B:176:0x03e2, B:175:0x03de, B:201:0x0426, B:202:0x0433, B:127:0x0320, B:131:0x0333, B:133:0x0343, B:135:0x035a, B:137:0x0364, B:203:0x0434, B:205:0x0448, B:208:0x0452, B:210:0x0461, B:212:0x046d, B:214:0x0482, B:215:0x0487, B:216:0x048b, B:218:0x048f, B:220:0x049c, B:292:0x05f8, B:294:0x0600, B:296:0x0608, B:299:0x060d, B:300:0x0619, B:302:0x061f, B:304:0x0627, B:307:0x0637, B:309:0x063d, B:310:0x065d, B:312:0x0663, B:314:0x0668, B:316:0x066d, B:318:0x0671, B:357:0x072a, B:359:0x0730, B:363:0x073b, B:365:0x0743, B:366:0x0748, B:368:0x0754, B:369:0x076e, B:371:0x0774, B:373:0x077c, B:375:0x0785, B:379:0x078e, B:384:0x079d, B:390:0x07aa, B:392:0x07b0, B:402:0x07c3, B:403:0x07c6, B:405:0x07d0, B:407:0x07d6, B:411:0x07e3, B:413:0x07eb, B:415:0x07ef, B:416:0x07fa, B:418:0x0800, B:471:0x090e, B:474:0x0916, B:476:0x091b, B:478:0x0923, B:480:0x0931, B:481:0x0938, B:482:0x093c, B:484:0x0942, B:486:0x094b, B:488:0x0951, B:490:0x095c, B:497:0x0980, B:499:0x0986, B:503:0x098f, B:513:0x09a7, B:510:0x09a0, B:512:0x09a4, B:491:0x0963, B:494:0x0971, B:495:0x0978, B:496:0x0979, B:419:0x0808, B:421:0x080f, B:423:0x0813, B:450:0x08ae, B:452:0x08ba, B:428:0x081f, B:430:0x0823, B:432:0x0837, B:434:0x0845, B:436:0x0851, B:440:0x085a, B:442:0x0864, B:448:0x086f, B:453:0x08c7, B:455:0x08cd, B:457:0x08d1, B:461:0x08da, B:463:0x08ea, B:465:0x08f2, B:467:0x08fc, B:468:0x0901, B:469:0x0906, B:470:0x090b, B:404:0x07c9, B:321:0x067b, B:323:0x067f, B:325:0x0687, B:327:0x068d, B:329:0x0697, B:332:0x069d, B:333:0x06a0, B:335:0x06a9, B:337:0x06bb, B:339:0x06c4, B:341:0x06cc, B:346:0x06d6, B:348:0x06fe, B:349:0x0701, B:350:0x070c, B:352:0x0712, B:354:0x0718, B:355:0x071f, B:223:0x04ab, B:225:0x04b1, B:228:0x04b7, B:231:0x04c2, B:233:0x04c7, B:236:0x04d5, B:238:0x04db, B:239:0x04e3, B:240:0x04e6, B:242:0x04ee, B:244:0x04fc, B:246:0x0538, B:248:0x0542, B:251:0x054d, B:253:0x0555, B:254:0x0558, B:255:0x055b, B:257:0x0561, B:259:0x0570, B:261:0x0576, B:263:0x0582, B:265:0x058c, B:267:0x059d, B:269:0x05a3, B:270:0x05ae, B:271:0x05b3, B:273:0x05be, B:276:0x05c3, B:278:0x05c9, B:280:0x05d1, B:282:0x05d7, B:284:0x05dd, B:288:0x05eb, B:290:0x05f2, B:291:0x05f5, B:219:0x0499, B:515:0x09af, B:519:0x09b6, B:520:0x09be, B:524:0x09de, B:109:0x02a5, B:111:0x02aa, B:112:0x02ad, B:115:0x02b4, B:119:0x02b8), top: B:602:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0998 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0999 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x066b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:625:0x07c6 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v44, types: [com.google.android.gms.internal.ads.zzgu, com.google.android.gms.internal.ads.zzyj] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r39) {
        /*
            Method dump skipped, instructions count: 2876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjx.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    public final void zza(zzbq zzbqVar) {
        this.zzi.zzc(16, zzbqVar).zza();
    }

    public final Looper zzc() {
        return this.zzk;
    }

    public final /* synthetic */ Boolean zze() {
        return Boolean.valueOf(this.zzy);
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final /* bridge */ /* synthetic */ void zzf(zzvz zzvzVar) {
        this.zzi.zzc(9, (zzug) zzvzVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    public final void zzg() {
        this.zzi.zzf(2);
        this.zzi.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.zzuf
    public final void zzh(zzug zzugVar) {
        this.zzi.zzc(8, zzugVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final void zzi() {
        this.zzi.zzi(10);
    }

    public final void zzj() {
        this.zzi.zzb(0).zza();
    }

    public final void zzk(zzcc zzccVar, int i10, long j10) {
        this.zzi.zzc(3, new zzjw(zzccVar, i10, j10)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final synchronized void zzl(zzla zzlaVar) {
        if (!this.zzy && this.zzk.getThread().isAlive()) {
            this.zzi.zzc(14, zzlaVar).zza();
            return;
        }
        zzea.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzlaVar.zzh(false);
    }

    public final void zzm(boolean z10, int i10) {
        this.zzi.zzd(1, z10 ? 1 : 0, i10).zza();
    }

    public final void zzn() {
        this.zzi.zzb(6).zza();
    }

    public final synchronized boolean zzo() {
        if (!this.zzy && this.zzk.getThread().isAlive()) {
            this.zzi.zzi(7);
            zzac(new zzjn(this), this.zzt);
            return this.zzy;
        }
        return true;
    }

    public final void zzp(List list, int i10, long j10, zzwa zzwaVar) {
        this.zzi.zzc(17, new zzjs(list, zzwaVar, i10, j10, null)).zza();
    }
}
