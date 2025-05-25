package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzalx implements zzamf {
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

    public zzalx() {
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
            if (i10 == 0) {
                while (true) {
                    if (zzekVar.zzb() <= 0) {
                        break;
                    } else if (!this.zzi) {
                        if (zzekVar.zzm() == 11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.zzi = z10;
                    } else {
                        int zzm = zzekVar.zzm();
                        if (zzm == 119) {
                            this.zzi = false;
                            this.zzg = 1;
                            zzek zzekVar2 = this.zzb;
                            zzekVar2.zzM()[0] = 11;
                            zzekVar2.zzM()[1] = 119;
                            this.zzh = 2;
                            break;
                        }
                        if (zzm == 11) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.zzi = z11;
                    }
                }
            } else if (i10 != 1) {
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
                int min2 = Math.min(zzekVar.zzb(), 128 - this.zzh);
                zzekVar.zzG(zzM, this.zzh, min2);
                int i12 = this.zzh + min2;
                this.zzh = i12;
                if (i12 == 128) {
                    this.zza.zzl(0);
                    zzabi zze = zzabj.zze(this.zza);
                    zzaf zzafVar = this.zzk;
                    if (zzafVar == null || zze.zzc != zzafVar.zzz || zze.zzb != zzafVar.zzA || !zzet.zzG(zze.zza, zzafVar.zzm)) {
                        zzad zzadVar = new zzad();
                        zzadVar.zzK(this.zze);
                        zzadVar.zzX(zze.zza);
                        zzadVar.zzy(zze.zzc);
                        zzadVar.zzY(zze.zzb);
                        zzadVar.zzO(this.zzc);
                        zzadVar.zzV(this.zzd);
                        zzadVar.zzS(zze.zzf);
                        if ("audio/ac3".equals(zze.zza)) {
                            zzadVar.zzx(zze.zzf);
                        }
                        zzaf zzad = zzadVar.zzad();
                        this.zzk = zzad;
                        this.zzf.zzl(zzad);
                    }
                    this.zzl = zze.zzd;
                    this.zzj = (zze.zze * 1000000) / this.zzk.zzA;
                    this.zzb.zzK(0);
                    this.zzf.zzq(this.zzb, 128);
                    this.zzg = 2;
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

    public zzalx(String str, int i10) {
        zzej zzejVar = new zzej(new byte[128], 128);
        this.zza = zzejVar;
        this.zzb = new zzek(zzejVar.zza);
        this.zzg = 0;
        this.zzm = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z10) {
    }
}
