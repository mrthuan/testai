package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzado {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzado(int i10, byte[] bArr, int i11, int i12) {
        this.zza = i10;
        this.zzb = bArr;
        this.zzc = i11;
        this.zzd = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzado.class == obj.getClass()) {
            zzado zzadoVar = (zzado) obj;
            if (this.zza == zzadoVar.zza && this.zzc == zzadoVar.zzc && this.zzd == zzadoVar.zzd && Arrays.equals(this.zzb, zzadoVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zza;
        return ((((Arrays.hashCode(this.zzb) + (i10 * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
