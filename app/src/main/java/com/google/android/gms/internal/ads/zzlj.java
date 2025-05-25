package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzlj {
    public static final zzlj zza;
    public static final zzlj zzb;
    public final long zzc;
    public final long zzd;

    static {
        zzlj zzljVar = new zzlj(0L, 0L);
        zza = zzljVar;
        new zzlj(Long.MAX_VALUE, Long.MAX_VALUE);
        new zzlj(Long.MAX_VALUE, 0L);
        new zzlj(0L, Long.MAX_VALUE);
        zzb = zzljVar;
    }

    public zzlj(long j10, long j11) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzd(z10);
        zzdi.zzd(j11 >= 0);
        this.zzc = j10;
        this.zzd = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlj.class == obj.getClass()) {
            zzlj zzljVar = (zzlj) obj;
            if (this.zzc == zzljVar.zzc && this.zzd == zzljVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzc) * 31) + ((int) this.zzd);
    }
}
