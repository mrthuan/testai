package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzanh implements zzant {
    private final zzang zza;
    private final zzek zzb = new zzek(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzanh(zzang zzangVar) {
        this.zza = zzangVar;
    }

    @Override // com.google.android.gms.internal.ads.zzant
    public final void zza(zzek zzekVar, int i10) {
        int i11;
        boolean z10;
        int i12 = i10 & 1;
        if (i12 != 0) {
            i11 = zzekVar.zzd() + zzekVar.zzm();
        } else {
            i11 = -1;
        }
        if (this.zzf) {
            if (i12 != 0) {
                this.zzf = false;
                zzekVar.zzK(i11);
                this.zzd = 0;
            } else {
                return;
            }
        }
        while (zzekVar.zzb() > 0) {
            int i13 = this.zzd;
            if (i13 < 3) {
                if (i13 == 0) {
                    int zzm = zzekVar.zzm();
                    zzekVar.zzK(zzekVar.zzd() - 1);
                    if (zzm == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzekVar.zzb(), 3 - this.zzd);
                zzekVar.zzG(this.zzb.zzM(), this.zzd, min);
                int i14 = this.zzd + min;
                this.zzd = i14;
                if (i14 == 3) {
                    this.zzb.zzK(0);
                    this.zzb.zzJ(3);
                    this.zzb.zzL(1);
                    zzek zzekVar2 = this.zzb;
                    int zzm2 = zzekVar2.zzm();
                    if ((zzm2 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int zzm3 = zzekVar2.zzm();
                    this.zze = z10;
                    this.zzc = (zzm3 | ((zzm2 & 15) << 8)) + 3;
                    int zzc = this.zzb.zzc();
                    int i15 = this.zzc;
                    if (zzc < i15) {
                        int zzc2 = this.zzb.zzc();
                        this.zzb.zzE(Math.min(4098, Math.max(i15, zzc2 + zzc2)));
                    }
                }
            } else {
                int min2 = Math.min(zzekVar.zzb(), this.zzc - i13);
                zzekVar.zzG(this.zzb.zzM(), this.zzd, min2);
                int i16 = this.zzd + min2;
                this.zzd = i16;
                int i17 = this.zzc;
                if (i16 != i17) {
                    continue;
                } else {
                    if (this.zze) {
                        if (zzet.zze(this.zzb.zzM(), 0, i17, -1) == 0) {
                            this.zzb.zzJ(this.zzc - 4);
                        } else {
                            this.zzf = true;
                            return;
                        }
                    } else {
                        this.zzb.zzJ(i17);
                    }
                    this.zzb.zzK(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzant
    public final void zzb(zzer zzerVar, zzacn zzacnVar, zzans zzansVar) {
        this.zza.zzb(zzerVar, zzacnVar, zzansVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzant
    public final void zzc() {
        this.zzf = true;
    }
}
