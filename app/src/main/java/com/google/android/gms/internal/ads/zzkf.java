package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzkf {
    public final long zza;
    public final float zzb;
    public final long zzc;

    public /* synthetic */ zzkf(zzkd zzkdVar, zzke zzkeVar) {
        this.zza = zzkd.zzc(zzkdVar);
        this.zzb = zzkd.zza(zzkdVar);
        this.zzc = zzkd.zzb(zzkdVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkf)) {
            return false;
        }
        zzkf zzkfVar = (zzkf) obj;
        if (this.zza == zzkfVar.zza && this.zzb == zzkfVar.zzb && this.zzc == zzkfVar.zzc) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc)});
    }

    public final zzkd zza() {
        return new zzkd(this, null);
    }
}
