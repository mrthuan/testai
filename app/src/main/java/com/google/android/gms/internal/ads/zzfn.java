package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfn extends zzfl {
    private Uri zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private final zzfm zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfn(byte[] bArr) {
        super(false);
        zzfm zzfmVar = new zzfm(bArr);
        this.zzf = zzfmVar;
        zzdi.zzd(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.zzd;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        byte[] bArr2 = this.zzb;
        zzdi.zzb(bArr2);
        System.arraycopy(bArr2, this.zzc, bArr, i10, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final long zzb(zzfy zzfyVar) {
        zzi(zzfyVar);
        this.zza = zzfyVar.zza;
        byte[] bArr = this.zzf.zza;
        this.zzb = bArr;
        long j10 = zzfyVar.zze;
        int length = bArr.length;
        if (j10 <= length) {
            int i10 = (int) j10;
            this.zzc = i10;
            int i11 = length - i10;
            this.zzd = i11;
            long j11 = zzfyVar.zzf;
            if (j11 != -1) {
                this.zzd = (int) Math.min(i11, j11);
            }
            this.zze = true;
            zzj(zzfyVar);
            long j12 = zzfyVar.zzf;
            if (j12 != -1) {
                return j12;
            }
            return this.zzd;
        }
        throw new zzft(AdError.REMOTE_ADS_SERVICE_ERROR);
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final Uri zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzd() {
        if (this.zze) {
            this.zze = false;
            zzh();
        }
        this.zza = null;
        this.zzb = null;
    }
}
