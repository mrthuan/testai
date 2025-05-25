package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzamp implements zzamf {
    private zzadp zzb;
    private boolean zzc;
    private int zze;
    private int zzf;
    private final zzek zza = new zzek(10);
    private long zzd = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(zzek zzekVar) {
        zzdi.zzb(this.zzb);
        if (!this.zzc) {
            return;
        }
        int zzb = zzekVar.zzb();
        int i10 = this.zzf;
        if (i10 < 10) {
            int min = Math.min(zzb, 10 - i10);
            System.arraycopy(zzekVar.zzM(), zzekVar.zzd(), this.zza.zzM(), this.zzf, min);
            if (this.zzf + min == 10) {
                this.zza.zzK(0);
                if (this.zza.zzm() == 73 && this.zza.zzm() == 68 && this.zza.zzm() == 51) {
                    this.zza.zzL(3);
                    this.zze = this.zza.zzl() + 10;
                } else {
                    zzea.zzf("Id3Reader", "Discarding invalid ID3 tag");
                    this.zzc = false;
                    return;
                }
            }
        }
        int min2 = Math.min(zzb, this.zze - this.zzf);
        this.zzb.zzq(zzekVar, min2);
        this.zzf += min2;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        zzansVar.zzc();
        zzadp zzw = zzacnVar.zzw(zzansVar.zza(), 5);
        this.zzb = zzw;
        zzad zzadVar = new zzad();
        zzadVar.zzK(zzansVar.zzb());
        zzadVar.zzX("application/id3");
        zzw.zzl(zzadVar.zzad());
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z10) {
        int i10;
        boolean z11;
        zzdi.zzb(this.zzb);
        if (this.zzc && (i10 = this.zze) != 0 && this.zzf == i10) {
            if (this.zzd != -9223372036854775807L) {
                z11 = true;
            } else {
                z11 = false;
            }
            zzdi.zzf(z11);
            this.zzb.zzs(this.zzd, 1, this.zze, 0, null);
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzd(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzd = j10;
        this.zze = 0;
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zze() {
        this.zzc = false;
        this.zzd = -9223372036854775807L;
    }
}
