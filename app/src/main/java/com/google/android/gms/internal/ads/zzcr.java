package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcr {
    public static final zzcr zza = new zzcr(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzcr(int i10, int i11, int i12) {
        int i13;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        if (zzet.zzK(i12)) {
            i13 = zzet.zzm(i12, i11);
        } else {
            i13 = -1;
        }
        this.zze = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcr)) {
            return false;
        }
        zzcr zzcrVar = (zzcr) obj;
        if (this.zzb == zzcrVar.zzb && this.zzc == zzcrVar.zzc && this.zzd == zzcrVar.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
        sb2.append(this.zzb);
        sb2.append(", channelCount=");
        sb2.append(this.zzc);
        sb2.append(", encoding=");
        return a6.h.g(sb2, this.zzd, "]");
    }
}
