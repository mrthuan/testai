package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzamr implements zzamf {
    private final zzek zza;
    private final zzadc zzb;
    private final String zzc;
    private final int zzd;
    private zzadp zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private int zzl;
    private long zzm;

    public zzamr() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(zzek zzekVar) {
        zzadc zzadcVar;
        boolean z10;
        boolean z11;
        zzdi.zzb(this.zze);
        while (zzekVar.zzb() > 0) {
            int i10 = this.zzg;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    int min = Math.min(zzekVar.zzb(), this.zzl - this.zzh);
                    this.zze.zzq(zzekVar, min);
                    int i11 = this.zzh + min;
                    this.zzh = i11;
                    if (i11 >= this.zzl) {
                        if (this.zzm == -9223372036854775807L) {
                            z12 = false;
                        }
                        zzdi.zzf(z12);
                        this.zze.zzs(this.zzm, 1, this.zzl, 0, null);
                        this.zzm += this.zzk;
                        this.zzh = 0;
                        this.zzg = 0;
                    }
                } else {
                    int min2 = Math.min(zzekVar.zzb(), 4 - this.zzh);
                    zzekVar.zzG(this.zza.zzM(), this.zzh, min2);
                    int i12 = this.zzh + min2;
                    this.zzh = i12;
                    if (i12 >= 4) {
                        this.zza.zzK(0);
                        if (!this.zzb.zza(this.zza.zzg())) {
                            this.zzh = 0;
                            this.zzg = 1;
                        } else {
                            this.zzl = this.zzb.zzc;
                            if (!this.zzi) {
                                this.zzk = (zzadcVar.zzg * 1000000) / zzadcVar.zzd;
                                zzad zzadVar = new zzad();
                                zzadVar.zzK(this.zzf);
                                zzadVar.zzX(this.zzb.zzb);
                                zzadVar.zzP(4096);
                                zzadVar.zzy(this.zzb.zze);
                                zzadVar.zzY(this.zzb.zzd);
                                zzadVar.zzO(this.zzc);
                                zzadVar.zzV(this.zzd);
                                this.zze.zzl(zzadVar.zzad());
                                this.zzi = true;
                            }
                            this.zza.zzK(0);
                            this.zze.zzq(this.zza, 4);
                            this.zzg = 2;
                        }
                    }
                }
            } else {
                byte[] zzM = zzekVar.zzM();
                int zzd = zzekVar.zzd();
                int zze = zzekVar.zze();
                while (true) {
                    if (zzd < zze) {
                        int i13 = zzd + 1;
                        byte b10 = zzM[zzd];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.zzj && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.zzj = z10;
                        if (z11) {
                            zzekVar.zzK(i13);
                            this.zzj = false;
                            this.zza.zzM()[1] = zzM[zzd];
                            this.zzh = 2;
                            this.zzg = 1;
                            break;
                        }
                        zzd = i13;
                    } else {
                        zzekVar.zzK(zze);
                        break;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        zzansVar.zzc();
        this.zzf = zzansVar.zzb();
        this.zze = zzacnVar.zzw(zzansVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzd(long j10, int i10) {
        this.zzm = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
    }

    public zzamr(String str, int i10) {
        this.zzg = 0;
        zzek zzekVar = new zzek(4);
        this.zza = zzekVar;
        zzekVar.zzM()[0] = -1;
        this.zzb = new zzadc();
        this.zzm = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z10) {
    }
}
