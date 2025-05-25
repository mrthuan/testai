package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzadq {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza(zzadp zzadpVar, zzado zzadoVar) {
        if (this.zzc > 0) {
            zzadpVar.zzs(this.zzd, this.zze, this.zzf, this.zzg, zzadoVar);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzadp zzadpVar, long j10, int i10, int i11, int i12, zzado zzadoVar) {
        boolean z10;
        if (this.zzg <= i11 + i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzg(z10, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i13 = this.zzc;
            int i14 = i13 + 1;
            this.zzc = i14;
            if (i13 == 0) {
                this.zzd = j10;
                this.zze = i10;
                this.zzf = 0;
            }
            this.zzf += i11;
            this.zzg = i12;
            if (i14 >= 16) {
                zza(zzadpVar, zzadoVar);
            }
        }
    }

    public final void zzd(zzacl zzaclVar) {
        if (!this.zzb) {
            zzaclVar.zzh(this.zza, 0, 10);
            zzaclVar.zzj();
            byte[] bArr = this.zza;
            int i10 = zzabj.zza;
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
                this.zzb = true;
            }
        }
    }
}
