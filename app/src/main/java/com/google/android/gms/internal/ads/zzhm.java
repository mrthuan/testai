package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzhm implements zzle, zzlh {
    private final int zzb;
    private zzli zzd;
    private int zze;
    private zznz zzf;
    private zzdj zzg;
    private int zzh;
    private zzvx zzi;
    private zzaf[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;
    private zzlg zzq;
    private final Object zza = new Object();
    private final zzjz zzc = new zzjz();
    private long zzm = Long.MIN_VALUE;
    private zzcc zzp = zzcc.zza;

    public zzhm(int i10) {
        this.zzb = i10;
    }

    private final void zzZ(long j10, boolean z10) {
        this.zzn = false;
        this.zzl = j10;
        this.zzm = j10;
        zzz(j10, z10);
    }

    public final void zzB() {
        zzlg zzlgVar;
        synchronized (this.zza) {
            zzlgVar = this.zzq;
        }
        if (zzlgVar != null) {
            zzlgVar.zza(this);
        }
    }

    public void zzF(zzaf[] zzafVarArr, long j10, long j11, zzui zzuiVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzG() {
        boolean z10;
        if (this.zzh == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzf(z10);
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzH(zzaf[] zzafVarArr, zzvx zzvxVar, long j10, long j11, zzui zzuiVar) {
        zzdi.zzf(!this.zzn);
        this.zzi = zzvxVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j10;
        }
        this.zzj = zzafVarArr;
        this.zzk = j11;
        zzF(zzafVarArr, j10, j11, zzuiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzI() {
        boolean z10;
        if (this.zzh == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzf(z10);
        zzjz zzjzVar = this.zzc;
        zzjzVar.zzb = null;
        zzjzVar.zza = null;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzJ(long j10) {
        zzZ(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzK() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final void zzL(zzlg zzlgVar) {
        synchronized (this.zza) {
            this.zzq = zzlgVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzN(zzcc zzccVar) {
        if (!zzet.zzG(this.zzp, zzccVar)) {
            this.zzp = zzccVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzO() {
        boolean z10 = true;
        if (this.zzh != 1) {
            z10 = false;
        }
        zzdi.zzf(z10);
        this.zzh = 2;
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzP() {
        boolean z10;
        if (this.zzh == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzf(z10);
        this.zzh = 1;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final boolean zzQ() {
        if (this.zzm == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final boolean zzR() {
        return this.zzn;
    }

    public final boolean zzS() {
        if (zzQ()) {
            return this.zzn;
        }
        zzvx zzvxVar = this.zzi;
        zzvxVar.getClass();
        return zzvxVar.zze();
    }

    public final zzaf[] zzT() {
        zzaf[] zzafVarArr = this.zzj;
        zzafVarArr.getClass();
        return zzafVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzle, com.google.android.gms.internal.ads.zzlh
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final int zzcV() {
        return this.zzh;
    }

    public final int zzcW(zzjz zzjzVar, zzhd zzhdVar, int i10) {
        zzvx zzvxVar = this.zzi;
        zzvxVar.getClass();
        int zza = zzvxVar.zza(zzjzVar, zzhdVar, i10);
        if (zza == -4) {
            if (zzhdVar.zzf()) {
                this.zzm = Long.MIN_VALUE;
                if (this.zzn) {
                    return -4;
                }
                return -3;
            }
            long j10 = zzhdVar.zze + this.zzk;
            zzhdVar.zze = j10;
            this.zzm = Math.max(this.zzm, j10);
        } else if (zza == -5) {
            zzaf zzafVar = zzjzVar.zza;
            zzafVar.getClass();
            long j11 = zzafVar.zzq;
            if (j11 != Long.MAX_VALUE) {
                zzad zzb = zzafVar.zzb();
                zzb.zzab(j11 + this.zzk);
                zzjzVar.zza = zzb.zzad();
                return -5;
            }
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final long zzcX() {
        return this.zzm;
    }

    public final zzjz zzcY() {
        zzjz zzjzVar = this.zzc;
        zzjzVar.zzb = null;
        zzjzVar.zza = null;
        return zzjzVar;
    }

    public final int zzd(long j10) {
        zzvx zzvxVar = this.zzi;
        zzvxVar.getClass();
        return zzvxVar.zzb(j10 - this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public int zze() {
        return 0;
    }

    public final long zzf() {
        return this.zzl;
    }

    public final zzdj zzh() {
        zzdj zzdjVar = this.zzg;
        zzdjVar.getClass();
        return zzdjVar;
    }

    public final zzhw zzi(Throwable th2, zzaf zzafVar, boolean z10, int i10) {
        int i11 = 4;
        if (zzafVar != null && !this.zzo) {
            this.zzo = true;
            try {
                i11 = zzY(zzafVar) & 7;
            } catch (zzhw unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zzhw.zzb(th2, zzU(), this.zze, zzafVar, i11, z10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public zzkg zzk() {
        return null;
    }

    public final zzli zzm() {
        zzli zzliVar = this.zzd;
        zzliVar.getClass();
        return zzliVar;
    }

    public final zznz zzn() {
        zznz zznzVar = this.zzf;
        zznzVar.getClass();
        return zznzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final zzvx zzo() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final void zzp() {
        synchronized (this.zza) {
            this.zzq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzq() {
        boolean z10 = true;
        if (this.zzh != 1) {
            z10 = false;
        }
        zzdi.zzf(z10);
        zzjz zzjzVar = this.zzc;
        zzjzVar.zzb = null;
        zzjzVar.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzr(zzli zzliVar, zzaf[] zzafVarArr, zzvx zzvxVar, long j10, boolean z10, boolean z11, long j11, long j12, zzui zzuiVar) {
        boolean z12;
        if (this.zzh == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        zzdi.zzf(z12);
        this.zzd = zzliVar;
        this.zzh = 1;
        zzx(z10, z11);
        zzH(zzafVarArr, zzvxVar, j11, j12, zzuiVar);
        zzZ(j11, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzu(int i10, zznz zznzVar, zzdj zzdjVar) {
        this.zze = i10;
        this.zzf = zznzVar;
        this.zzg = zzdjVar;
        zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzv() {
        zzvx zzvxVar = this.zzi;
        zzvxVar.getClass();
        zzvxVar.zzd();
    }

    public void zzw() {
        throw null;
    }

    public void zzz(long j10, boolean z10) {
        throw null;
    }

    public void zzA() {
    }

    public void zzC() {
    }

    public void zzD() {
    }

    public void zzE() {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final zzlh zzl() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public /* synthetic */ void zzs() {
    }

    public void zzy() {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public /* synthetic */ void zzM(float f10, float f11) {
    }

    @Override // com.google.android.gms.internal.ads.zzkz
    public void zzt(int i10, Object obj) {
    }

    public void zzx(boolean z10, boolean z11) {
    }
}
