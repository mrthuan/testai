package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaeu extends zzaet {
    private final zzek zzb;
    private final zzek zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzaeu(zzadp zzadpVar) {
        super(zzadpVar);
        this.zzb = new zzek(zzfh.zza);
        this.zzc = new zzek(4);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zza(zzek zzekVar) {
        int zzm = zzekVar.zzm();
        int i10 = zzm >> 4;
        int i11 = zzm & 15;
        if (i11 == 7) {
            this.zzg = i10;
            if (i10 != 5) {
                return true;
            }
            return false;
        }
        throw new zzaes(b.a.c("Video format not supported: ", i11));
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzb(zzek zzekVar, long j10) {
        int i10;
        int i11;
        int zzm = zzekVar.zzm();
        long zzh = zzekVar.zzh();
        if (zzm == 0) {
            if (!this.zze) {
                zzek zzekVar2 = new zzek(new byte[zzekVar.zzb()]);
                zzekVar.zzG(zzekVar2.zzM(), 0, zzekVar.zzb());
                zzabn zza = zzabn.zza(zzekVar2);
                this.zzd = zza.zzb;
                zzad zzadVar = new zzad();
                zzadVar.zzX("video/avc");
                zzadVar.zzz(zza.zzk);
                zzadVar.zzac(zza.zzc);
                zzadVar.zzI(zza.zzd);
                zzadVar.zzT(zza.zzj);
                zzadVar.zzL(zza.zza);
                this.zza.zzl(zzadVar.zzad());
                this.zze = true;
                return false;
            }
        } else if (zzm == 1 && this.zze) {
            if (this.zzg == 1) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (!this.zzf) {
                if (i10 != 0) {
                    i11 = 1;
                }
            } else {
                i11 = i10;
            }
            byte[] zzM = this.zzc.zzM();
            zzM[0] = 0;
            zzM[1] = 0;
            zzM[2] = 0;
            int i12 = 4 - this.zzd;
            int i13 = 0;
            while (zzekVar.zzb() > 0) {
                zzekVar.zzG(this.zzc.zzM(), i12, this.zzd);
                this.zzc.zzK(0);
                zzek zzekVar3 = this.zzc;
                zzek zzekVar4 = this.zzb;
                int zzp = zzekVar3.zzp();
                zzekVar4.zzK(0);
                this.zza.zzq(this.zzb, 4);
                this.zza.zzq(zzekVar, zzp);
                i13 = i13 + 4 + zzp;
            }
            this.zza.zzs((zzh * 1000) + j10, i11, i13, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
