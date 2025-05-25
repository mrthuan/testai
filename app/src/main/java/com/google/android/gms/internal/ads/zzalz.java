package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzalz implements zzamf {
    private final zzej zza;
    private final zzek zzb;
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzadp zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private zzaf zzk;
    private int zzl;
    private long zzm;

    public zzalz() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(zzek zzekVar) {
        boolean z10;
        boolean z11;
        zzdi.zzb(this.zzf);
        while (zzekVar.zzb() > 0) {
            int i10 = this.zzg;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    int min = Math.min(zzekVar.zzb(), this.zzl - this.zzh);
                    this.zzf.zzq(zzekVar, min);
                    int i11 = this.zzh + min;
                    this.zzh = i11;
                    if (i11 == this.zzl) {
                        if (this.zzm == -9223372036854775807L) {
                            z12 = false;
                        }
                        zzdi.zzf(z12);
                        this.zzf.zzs(this.zzm, 1, this.zzl, 0, null);
                        this.zzm += this.zzj;
                        this.zzg = 0;
                    }
                } else {
                    byte[] zzM = this.zzb.zzM();
                    int min2 = Math.min(zzekVar.zzb(), 16 - this.zzh);
                    zzekVar.zzG(zzM, this.zzh, min2);
                    int i12 = this.zzh + min2;
                    this.zzh = i12;
                    if (i12 == 16) {
                        this.zza.zzl(0);
                        zzabl zza = zzabm.zza(this.zza);
                        zzaf zzafVar = this.zzk;
                        if (zzafVar == null || zzafVar.zzz != 2 || zza.zza != zzafVar.zzA || !"audio/ac4".equals(zzafVar.zzm)) {
                            zzad zzadVar = new zzad();
                            zzadVar.zzK(this.zze);
                            zzadVar.zzX("audio/ac4");
                            zzadVar.zzy(2);
                            zzadVar.zzY(zza.zza);
                            zzadVar.zzO(this.zzc);
                            zzadVar.zzV(this.zzd);
                            zzaf zzad = zzadVar.zzad();
                            this.zzk = zzad;
                            this.zzf.zzl(zzad);
                        }
                        this.zzl = zza.zzb;
                        this.zzj = (zza.zzc * 1000000) / this.zzk.zzA;
                        this.zzb.zzK(0);
                        this.zzf.zzq(this.zzb, 16);
                        this.zzg = 2;
                    }
                }
            } else {
                while (zzekVar.zzb() > 0) {
                    if (!this.zzi) {
                        if (zzekVar.zzm() == 172) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.zzi = z10;
                    } else {
                        int zzm = zzekVar.zzm();
                        if (zzm == 172) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.zzi = z11;
                        byte b10 = 64;
                        if (zzm != 64) {
                            if (zzm == 65) {
                                zzm = 65;
                            }
                        }
                        this.zzg = 1;
                        zzek zzekVar2 = this.zzb;
                        zzekVar2.zzM()[0] = -84;
                        if (zzm == 65) {
                            b10 = 65;
                        }
                        zzekVar2.zzM()[1] = b10;
                        this.zzh = 2;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        zzansVar.zzc();
        this.zze = zzansVar.zzb();
        this.zzf = zzacnVar.zzw(zzansVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzd(long j10, int i10) {
        this.zzm = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = -9223372036854775807L;
    }

    public zzalz(String str, int i10) {
        zzej zzejVar = new zzej(new byte[16], 16);
        this.zza = zzejVar;
        this.zzb = new zzek(zzejVar.zza);
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z10) {
    }
}
