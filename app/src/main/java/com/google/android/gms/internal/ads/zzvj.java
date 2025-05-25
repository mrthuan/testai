package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzvj implements zzug, zzacn, zzyp, zzyu, zzvv {
    private static final Map zzb;
    private static final zzaf zzc;
    private zzadi zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzE;
    private boolean zzF;
    private int zzG;
    private boolean zzH;
    private long zzI;
    private boolean zzK;
    private int zzL;
    private boolean zzM;
    private boolean zzN;
    private final zzyk zzO;
    private final Uri zzd;
    private final zzfs zze;
    private final zzri zzf;
    private final zzur zzg;
    private final zzrd zzh;
    private final zzvf zzi;
    private final long zzj;
    private final long zzk;
    private final zzuy zzm;
    private zzuf zzr;
    private zzafn zzs;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private zzvi zzz;
    private final zzyx zzl = new zzyx("ProgressiveMediaPeriod");
    private final zzdm zzn = new zzdm(zzdj.zza);
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzva
        @Override // java.lang.Runnable
        public final void run() {
            zzvj.this.zzU();
        }
    };
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzvb
        @Override // java.lang.Runnable
        public final void run() {
            zzvj.this.zzE();
        }
    };
    private final Handler zzq = zzet.zzx(null);
    private zzvh[] zzu = new zzvh[0];
    private zzvw[] zzt = new zzvw[0];
    private long zzJ = -9223372036854775807L;
    private int zzD = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzad zzadVar = new zzad();
        zzadVar.zzK("icy");
        zzadVar.zzX("application/x-icy");
        zzc = zzadVar.zzad();
    }

    public zzvj(Uri uri, zzfs zzfsVar, zzuy zzuyVar, zzri zzriVar, zzrd zzrdVar, zzyo zzyoVar, zzur zzurVar, zzvf zzvfVar, zzyk zzykVar, String str, int i10, long j10) {
        this.zzd = uri;
        this.zze = zzfsVar;
        this.zzf = zzriVar;
        this.zzh = zzrdVar;
        this.zzg = zzurVar;
        this.zzi = zzvfVar;
        this.zzO = zzykVar;
        this.zzj = i10;
        this.zzm = zzuyVar;
        this.zzk = j10;
    }

    private final int zzQ() {
        int i10 = 0;
        for (zzvw zzvwVar : this.zzt) {
            i10 += zzvwVar.zzd();
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzR(boolean z10) {
        int i10 = 0;
        long j10 = Long.MIN_VALUE;
        while (true) {
            zzvw[] zzvwVarArr = this.zzt;
            if (i10 < zzvwVarArr.length) {
                if (!z10) {
                    zzvi zzviVar = this.zzz;
                    zzviVar.getClass();
                    if (!zzviVar.zzc[i10]) {
                        i10++;
                    }
                }
                j10 = Math.max(j10, zzvwVarArr[i10].zzh());
                i10++;
            } else {
                return j10;
            }
        }
    }

    private final zzadp zzS(zzvh zzvhVar) {
        int length = this.zzt.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (zzvhVar.equals(this.zzu[i10])) {
                return this.zzt[i10];
            }
        }
        zzvw zzvwVar = new zzvw(this.zzO, this.zzf, this.zzh);
        zzvwVar.zzu(this);
        int i11 = length + 1;
        zzvh[] zzvhVarArr = (zzvh[]) Arrays.copyOf(this.zzu, i11);
        zzvhVarArr[length] = zzvhVar;
        int i12 = zzet.zza;
        this.zzu = zzvhVarArr;
        zzvw[] zzvwVarArr = (zzvw[]) Arrays.copyOf(this.zzt, i11);
        zzvwVarArr[length] = zzvwVar;
        this.zzt = zzvwVarArr;
        return zzvwVar;
    }

    private final void zzT() {
        zzdi.zzf(this.zzw);
        this.zzz.getClass();
        this.zzA.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU() {
        boolean z10;
        boolean z11;
        zzbk zzc2;
        int i10;
        if (!this.zzN && !this.zzw && this.zzv && this.zzA != null) {
            for (zzvw zzvwVar : this.zzt) {
                if (zzvwVar.zzi() == null) {
                    return;
                }
            }
            this.zzn.zzc();
            int length = this.zzt.length;
            zzcd[] zzcdVarArr = new zzcd[length];
            boolean[] zArr = new boolean[length];
            for (int i11 = 0; i11 < length; i11++) {
                zzaf zzi = this.zzt[i11].zzi();
                zzi.getClass();
                String str = zzi.zzm;
                boolean zzg = zzbn.zzg(str);
                if (!zzg && !zzbn.zzi(str)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                zArr[i11] = z10;
                this.zzx = z10 | this.zzx;
                boolean zzh = zzbn.zzh(str);
                if (this.zzk != -9223372036854775807L && length == 1 && zzh) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.zzy = z11;
                zzafn zzafnVar = this.zzs;
                if (zzafnVar != null) {
                    if (zzg || this.zzu[i11].zzb) {
                        zzbk zzbkVar = zzi.zzk;
                        if (zzbkVar == null) {
                            zzc2 = new zzbk(-9223372036854775807L, zzafnVar);
                        } else {
                            zzc2 = zzbkVar.zzc(zzafnVar);
                        }
                        zzad zzb2 = zzi.zzb();
                        zzb2.zzQ(zzc2);
                        zzi = zzb2.zzad();
                    }
                    if (zzg && zzi.zzg == -1 && zzi.zzh == -1 && (i10 = zzafnVar.zza) != -1) {
                        zzad zzb3 = zzi.zzb();
                        zzb3.zzx(i10);
                        zzi = zzb3.zzad();
                    }
                }
                zzcdVarArr[i11] = new zzcd(Integer.toString(i11), zzi.zzc(this.zzf.zza(zzi)));
            }
            this.zzz = new zzvi(new zzwi(zzcdVarArr), zArr);
            if (this.zzy && this.zzB == -9223372036854775807L) {
                this.zzB = this.zzk;
                this.zzA = new zzvd(this, this.zzA);
            }
            this.zzi.zza(this.zzB, this.zzA.zzh(), this.zzC);
            this.zzw = true;
            zzuf zzufVar = this.zzr;
            zzufVar.getClass();
            zzufVar.zzh(this);
        }
    }

    private final void zzV(int i10) {
        zzT();
        zzvi zzviVar = this.zzz;
        boolean[] zArr = zzviVar.zzd;
        if (!zArr[i10]) {
            zzaf zzb2 = zzviVar.zza.zzb(i10).zzb(0);
            this.zzg.zzc(new zzue(1, zzbn.zzb(zzb2.zzm), zzb2, 0, null, zzet.zzu(this.zzI), -9223372036854775807L));
            zArr[i10] = true;
        }
    }

    private final void zzW(int i10) {
        zzT();
        boolean[] zArr = this.zzz.zzb;
        if (this.zzK && zArr[i10] && !this.zzt[i10].zzx(false)) {
            this.zzJ = 0L;
            this.zzK = false;
            this.zzF = true;
            this.zzI = 0L;
            this.zzL = 0;
            for (zzvw zzvwVar : this.zzt) {
                zzvwVar.zzp(false);
            }
            zzuf zzufVar = this.zzr;
            zzufVar.getClass();
            zzufVar.zzf(this);
        }
    }

    private final void zzX() {
        zzve zzveVar = new zzve(this, this.zzd, this.zze, this.zzm, this, this.zzn);
        if (this.zzw) {
            zzdi.zzf(zzY());
            long j10 = this.zzB;
            if (j10 != -9223372036854775807L && this.zzJ > j10) {
                this.zzM = true;
                this.zzJ = -9223372036854775807L;
                return;
            }
            zzadi zzadiVar = this.zzA;
            zzadiVar.getClass();
            zzve.zzf(zzveVar, zzadiVar.zzg(this.zzJ).zza.zzc, this.zzJ);
            for (zzvw zzvwVar : this.zzt) {
                zzvwVar.zzt(this.zzJ);
            }
            this.zzJ = -9223372036854775807L;
        }
        this.zzL = zzQ();
        long zza = this.zzl.zza(zzveVar, this, zzyo.zza(this.zzD));
        this.zzg.zzg(new zztz(zzve.zzb(zzveVar), zzve.zzd(zzveVar), zza), new zzue(1, -1, null, 0, null, zzet.zzu(zzve.zzc(zzveVar)), zzet.zzu(this.zzB)));
    }

    private final boolean zzY() {
        if (this.zzJ != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    private final boolean zzZ() {
        if (!this.zzF && !zzY()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzD() {
        this.zzv = true;
        this.zzq.post(this.zzo);
    }

    public final /* synthetic */ void zzE() {
        if (!this.zzN) {
            zzuf zzufVar = this.zzr;
            zzufVar.getClass();
            zzufVar.zzf(this);
        }
    }

    public final /* synthetic */ void zzF() {
        this.zzH = true;
    }

    public final /* synthetic */ void zzG(zzadi zzadiVar) {
        zzadi zzadhVar;
        if (this.zzs == null) {
            zzadhVar = zzadiVar;
        } else {
            zzadhVar = new zzadh(-9223372036854775807L, 0L);
        }
        this.zzA = zzadhVar;
        this.zzB = zzadiVar.zza();
        boolean z10 = false;
        int i10 = 1;
        if (!this.zzH && zzadiVar.zza() == -9223372036854775807L) {
            z10 = true;
        }
        this.zzC = z10;
        if (true == z10) {
            i10 = 7;
        }
        this.zzD = i10;
        if (this.zzw) {
            this.zzi.zza(this.zzB, zzadiVar.zzh(), this.zzC);
        } else {
            zzU();
        }
    }

    public final void zzH() {
        this.zzl.zzi(zzyo.zza(this.zzD));
    }

    public final void zzI(int i10) {
        this.zzt[i10].zzm();
        zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final /* bridge */ /* synthetic */ void zzJ(zzyt zzytVar, long j10, long j11, boolean z10) {
        zzve zzveVar = (zzve) zzytVar;
        zzgt zze = zzve.zze(zzveVar);
        zztz zztzVar = new zztz(zzve.zzb(zzveVar), zzve.zzd(zzveVar), zze.zzh(), zze.zzi(), j10, j11, zze.zzg());
        zzve.zzb(zzveVar);
        this.zzg.zzd(zztzVar, new zzue(1, -1, null, 0, null, zzet.zzu(zzve.zzc(zzveVar)), zzet.zzu(this.zzB)));
        if (!z10) {
            for (zzvw zzvwVar : this.zzt) {
                zzvwVar.zzp(false);
            }
            if (this.zzG > 0) {
                zzuf zzufVar = this.zzr;
                zzufVar.getClass();
                zzufVar.zzf(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final /* bridge */ /* synthetic */ void zzK(zzyt zzytVar, long j10, long j11) {
        zzadi zzadiVar;
        long j12;
        if (this.zzB == -9223372036854775807L && (zzadiVar = this.zzA) != null) {
            boolean zzh = zzadiVar.zzh();
            long zzR = zzR(true);
            if (zzR == Long.MIN_VALUE) {
                j12 = 0;
            } else {
                j12 = zzR + 10000;
            }
            this.zzB = j12;
            this.zzi.zza(j12, zzh, this.zzC);
        }
        zzve zzveVar = (zzve) zzytVar;
        zzgt zze = zzve.zze(zzveVar);
        zztz zztzVar = new zztz(zzve.zzb(zzveVar), zzve.zzd(zzveVar), zze.zzh(), zze.zzi(), j10, j11, zze.zzg());
        zzve.zzb(zzveVar);
        this.zzg.zze(zztzVar, new zzue(1, -1, null, 0, null, zzet.zzu(zzve.zzc(zzveVar)), zzet.zzu(this.zzB)));
        this.zzM = true;
        zzuf zzufVar = this.zzr;
        zzufVar.getClass();
        zzufVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void zzL() {
        for (zzvw zzvwVar : this.zzt) {
            zzvwVar.zzo();
        }
        this.zzm.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzvv
    public final void zzM(zzaf zzafVar) {
        this.zzq.post(this.zzo);
    }

    public final void zzN() {
        if (this.zzw) {
            for (zzvw zzvwVar : this.zzt) {
                zzvwVar.zzn();
            }
        }
        this.zzl.zzj(this);
        this.zzq.removeCallbacksAndMessages(null);
        this.zzr = null;
        this.zzN = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzO(final zzadi zzadiVar) {
        this.zzq.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvc
            @Override // java.lang.Runnable
            public final void run() {
                zzvj.this.zzG(zzadiVar);
            }
        });
    }

    public final boolean zzP(int i10) {
        if (!zzZ() && this.zzt[i10].zzx(this.zzM)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final long zza(long j10, zzlj zzljVar) {
        boolean z10;
        zzT();
        if (!this.zzA.zzh()) {
            return 0L;
        }
        zzadg zzg = this.zzA.zzg(j10);
        zzadj zzadjVar = zzg.zza;
        zzadj zzadjVar2 = zzg.zzb;
        long j11 = zzljVar.zzc;
        if (j11 == 0) {
            if (zzljVar.zzd == 0) {
                return j10;
            }
            j11 = 0;
        }
        long j12 = zzadjVar.zzb;
        int i10 = zzet.zza;
        long j13 = j10 - j11;
        long j14 = zzljVar.zzd;
        long j15 = j10 + j14;
        long j16 = j10 ^ j15;
        long j17 = j14 ^ j15;
        if (((j10 ^ j11) & (j10 ^ j13)) < 0) {
            j13 = Long.MIN_VALUE;
        }
        if ((j16 & j17) < 0) {
            j15 = Long.MAX_VALUE;
        }
        boolean z11 = true;
        if (j13 <= j12 && j12 <= j15) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j18 = zzadjVar2.zzb;
        if (j13 > j18 || j18 > j15) {
            z11 = false;
        }
        if (z10 && z11) {
            if (Math.abs(j12 - j10) > Math.abs(j18 - j10)) {
                return j18;
            }
        } else if (!z10) {
            if (z11) {
                return j18;
            }
            return j13;
        }
        return j12;
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final long zzb() {
        long j10;
        zzT();
        if (this.zzM || this.zzG == 0) {
            return Long.MIN_VALUE;
        }
        if (zzY()) {
            return this.zzJ;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                zzvi zzviVar = this.zzz;
                if (zzviVar.zzb[i10] && zzviVar.zzc[i10] && !this.zzt[i10].zzw()) {
                    j10 = Math.min(j10, this.zzt[i10].zzh());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = zzR(false);
        }
        if (j10 == Long.MIN_VALUE) {
            return this.zzI;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final long zzd() {
        if (this.zzF) {
            if (this.zzM || zzQ() > this.zzL) {
                this.zzF = false;
                return this.zzI;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final long zze(long j10) {
        boolean zzz;
        zzT();
        boolean[] zArr = this.zzz.zzb;
        if (true != this.zzA.zzh()) {
            j10 = 0;
        }
        this.zzF = false;
        this.zzI = j10;
        if (zzY()) {
            this.zzJ = j10;
            return j10;
        }
        if (this.zzD != 7) {
            int length = this.zzt.length;
            for (int i10 = 0; i10 < length; i10++) {
                zzvw zzvwVar = this.zzt[i10];
                if (this.zzy) {
                    zzz = zzvwVar.zzy(zzvwVar.zza());
                } else {
                    zzz = zzvwVar.zzz(j10, false);
                }
                if (zzz || (!zArr[i10] && this.zzx)) {
                }
            }
            return j10;
        }
        this.zzK = false;
        this.zzJ = j10;
        this.zzM = false;
        zzyx zzyxVar = this.zzl;
        if (zzyxVar.zzl()) {
            for (zzvw zzvwVar2 : this.zzt) {
                zzvwVar2.zzk();
            }
            this.zzl.zzg();
        } else {
            zzyxVar.zzh();
            for (zzvw zzvwVar3 : this.zzt) {
                zzvwVar3.zzp(false);
            }
        }
        return j10;
    }

    public final int zzf(int i10, zzjz zzjzVar, zzhd zzhdVar, int i11) {
        if (zzZ()) {
            return -3;
        }
        zzV(i10);
        int zze = this.zzt[i10].zze(zzjzVar, zzhdVar, i11, this.zzM);
        if (zze == -3) {
            zzW(i10);
        }
        return zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r2 == 0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d8  */
    @Override // com.google.android.gms.internal.ads.zzug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzg(com.google.android.gms.internal.ads.zzxv[] r8, boolean[] r9, com.google.android.gms.internal.ads.zzvx[] r10, boolean[] r11, long r12) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvj.zzg(com.google.android.gms.internal.ads.zzxv[], boolean[], com.google.android.gms.internal.ads.zzvx[], boolean[], long):long");
    }

    public final int zzh(int i10, long j10) {
        if (zzZ()) {
            return 0;
        }
        zzV(i10);
        zzvw zzvwVar = this.zzt[i10];
        int zzc2 = zzvwVar.zzc(j10, this.zzM);
        zzvwVar.zzv(zzc2);
        if (zzc2 == 0) {
            zzW(i10);
            return 0;
        }
        return zzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final zzwi zzi() {
        zzT();
        return this.zzz.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzj(long j10, boolean z10) {
        if (!this.zzy) {
            zzT();
            if (!zzY()) {
                boolean[] zArr = this.zzz.zzc;
                int length = this.zzt.length;
                for (int i10 = 0; i10 < length; i10++) {
                    this.zzt[i10].zzj(j10, false, zArr[i10]);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzk() {
        zzH();
        if (this.zzM && !this.zzw) {
            throw zzbo.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzl(zzuf zzufVar, long j10) {
        this.zzr = zzufVar;
        this.zzn.zze();
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final boolean zzo(zzkf zzkfVar) {
        if (!this.zzM) {
            zzyx zzyxVar = this.zzl;
            if (!zzyxVar.zzk() && !this.zzK) {
                if (!this.zzw || this.zzG != 0) {
                    boolean zze = this.zzn.zze();
                    if (!zzyxVar.zzl()) {
                        zzX();
                        return true;
                    }
                    return zze;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final boolean zzp() {
        if (this.zzl.zzl() && this.zzn.zzd()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    @Override // com.google.android.gms.internal.ads.zzyp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzyr zzu(com.google.android.gms.internal.ads.zzyt r22, long r23, long r25, java.io.IOException r27, int r28) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvj.zzu(com.google.android.gms.internal.ads.zzyt, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.zzyr");
    }

    public final zzadp zzv() {
        return zzS(new zzvh(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final zzadp zzw(int i10, int i11) {
        return zzS(new zzvh(i10, false));
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final void zzm(long j10) {
    }
}
