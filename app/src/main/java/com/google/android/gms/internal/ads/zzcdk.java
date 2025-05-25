package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcdk implements zzfs {
    private final zzfs zza;
    private final long zzb;
    private final zzfs zzc;
    private long zzd;
    private Uri zze;

    public zzcdk(zzfs zzfsVar, int i10, zzfs zzfsVar2) {
        this.zza = zzfsVar;
        this.zzb = i10;
        this.zzc = zzfsVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i10, int i11) {
        int i12;
        long j10 = this.zzd;
        long j11 = this.zzb;
        if (j10 < j11) {
            int zza = this.zza.zza(bArr, i10, (int) Math.min(i11, j11 - j10));
            long j12 = this.zzd + zza;
            this.zzd = j12;
            i12 = zza;
            j10 = j12;
        } else {
            i12 = 0;
        }
        if (j10 >= this.zzb) {
            int zza2 = this.zzc.zza(bArr, i10 + i12, i11 - i12);
            int i13 = i12 + zza2;
            this.zzd += zza2;
            return i13;
        }
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final long zzb(zzfy zzfyVar) {
        zzfy zzfyVar2;
        long j10;
        long j11;
        this.zze = zzfyVar.zza;
        long j12 = zzfyVar.zze;
        long j13 = this.zzb;
        zzfy zzfyVar3 = null;
        if (j12 >= j13) {
            zzfyVar2 = null;
        } else {
            long j14 = zzfyVar.zzf;
            long j15 = j13 - j12;
            if (j14 != -1) {
                j15 = Math.min(j14, j15);
            }
            zzfyVar2 = new zzfy(zzfyVar.zza, j12, j15, null);
        }
        long j16 = zzfyVar.zzf;
        if (j16 == -1 || zzfyVar.zze + j16 > this.zzb) {
            long max = Math.max(this.zzb, zzfyVar.zze);
            long j17 = zzfyVar.zzf;
            if (j17 != -1) {
                j10 = Math.min(j17, (zzfyVar.zze + j17) - this.zzb);
            } else {
                j10 = -1;
            }
            zzfyVar3 = new zzfy(zzfyVar.zza, max, j10, null);
        }
        long j18 = 0;
        if (zzfyVar2 != null) {
            j11 = this.zza.zzb(zzfyVar2);
        } else {
            j11 = 0;
        }
        if (zzfyVar3 != null) {
            j18 = this.zzc.zzb(zzfyVar3);
        }
        this.zzd = zzfyVar.zze;
        if (j11 == -1 || j18 == -1) {
            return -1L;
        }
        return j11 + j18;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzd() {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final Map zze() {
        return zzfxu.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzf(zzgu zzguVar) {
    }
}
