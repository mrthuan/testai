package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzajo {
    private zzadp zzb;
    private zzacn zzc;
    private zzajj zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzajh zza = new zzajh();
    private zzajl zzj = new zzajl();

    public abstract long zza(zzek zzekVar);

    public void zzb(boolean z10) {
        int i10;
        if (z10) {
            this.zzj = new zzajl();
            this.zzf = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.zzh = i10;
        this.zze = -1L;
        this.zzg = 0L;
    }

    public abstract boolean zzc(zzek zzekVar, long j10, zzajl zzajlVar);

    public final int zze(zzacl zzaclVar, zzadf zzadfVar) {
        boolean z10;
        zzdi.zzb(this.zzb);
        int i10 = zzet.zza;
        int i11 = this.zzh;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return -1;
                }
                long zzd = this.zzd.zzd(zzaclVar);
                if (zzd >= 0) {
                    zzadfVar.zza = zzd;
                    return 1;
                }
                if (zzd < -1) {
                    zzi(-(zzd + 2));
                }
                if (!this.zzl) {
                    zzadi zze = this.zzd.zze();
                    zzdi.zzb(zze);
                    this.zzc.zzO(zze);
                    this.zzl = true;
                }
                if (this.zzk <= 0 && !this.zza.zze(zzaclVar)) {
                    this.zzh = 3;
                    return -1;
                }
                this.zzk = 0L;
                zzek zza = this.zza.zza();
                long zza2 = zza(zza);
                if (zza2 >= 0) {
                    long j10 = this.zzg;
                    if (j10 + zza2 >= this.zze) {
                        long zzf = zzf(j10);
                        this.zzb.zzq(zza, zza.zze());
                        this.zzb.zzs(zzf, 1, zza.zze(), 0, null);
                        this.zze = -1L;
                    }
                }
                this.zzg += zza2;
            } else {
                ((zzaby) zzaclVar).zzo((int) this.zzf, false);
                this.zzh = 2;
                return 0;
            }
        } else {
            while (this.zza.zze(zzaclVar)) {
                long zzf2 = zzaclVar.zzf();
                long j11 = this.zzf;
                this.zzk = zzf2 - j11;
                if (zzc(this.zza.zza(), j11, this.zzj)) {
                    this.zzf = zzaclVar.zzf();
                } else {
                    zzaf zzafVar = this.zzj.zza;
                    this.zzi = zzafVar.zzA;
                    if (!this.zzm) {
                        this.zzb.zzl(zzafVar);
                        this.zzm = true;
                    }
                    zzajj zzajjVar = this.zzj.zzb;
                    if (zzajjVar != null) {
                        this.zzd = zzajjVar;
                    } else if (zzaclVar.zzd() == -1) {
                        this.zzd = new zzajn(null);
                    } else {
                        zzaji zzb = this.zza.zzb();
                        if ((zzb.zza & 4) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.zzd = new zzajd(this, this.zzf, zzaclVar.zzd(), zzb.zzd + zzb.zze, zzb.zzb, z10);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                }
            }
            this.zzh = 3;
            return -1;
        }
        return 0;
    }

    public final long zzf(long j10) {
        return (j10 * 1000000) / this.zzi;
    }

    public final long zzg(long j10) {
        return (this.zzi * j10) / 1000000;
    }

    public final void zzh(zzacn zzacnVar, zzadp zzadpVar) {
        this.zzc = zzacnVar;
        this.zzb = zzadpVar;
        zzb(true);
    }

    public void zzi(long j10) {
        this.zzg = j10;
    }

    public final void zzj(long j10, long j11) {
        this.zza.zzc();
        if (j10 == 0) {
            zzb(!this.zzl);
        } else if (this.zzh != 0) {
            long zzg = zzg(j11);
            this.zze = zzg;
            zzajj zzajjVar = this.zzd;
            int i10 = zzet.zza;
            zzajjVar.zzg(zzg);
            this.zzh = 2;
        }
    }
}
