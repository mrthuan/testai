package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import java.net.URLDecoder;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfq extends zzfl {
    private zzfy zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzfq() {
        super(false);
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
        int i13 = zzet.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i10, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final long zzb(zzfy zzfyVar) {
        zzi(zzfyVar);
        this.zza = zzfyVar;
        Uri normalizeScheme = zzfyVar.zza.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        zzdi.zze("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i10 = zzet.zza;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.zzb = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    throw zzbo.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e10);
                }
            } else {
                this.zzb = URLDecoder.decode(str, zzfuj.zza.name()).getBytes(zzfuj.zzc);
            }
            long j10 = zzfyVar.zze;
            int length = this.zzb.length;
            if (j10 <= length) {
                int i11 = (int) j10;
                this.zzc = i11;
                int i12 = length - i11;
                this.zzd = i12;
                long j11 = zzfyVar.zzf;
                if (j11 != -1) {
                    this.zzd = (int) Math.min(i12, j11);
                }
                zzj(zzfyVar);
                long j12 = zzfyVar.zzf;
                if (j12 != -1) {
                    return j12;
                }
                return this.zzd;
            }
            this.zzb = null;
            throw new zzft(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        throw zzbo.zzb("Unexpected URI format: ".concat(String.valueOf(normalizeScheme)), null);
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final Uri zzc() {
        zzfy zzfyVar = this.zza;
        if (zzfyVar != null) {
            return zzfyVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}
