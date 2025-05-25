package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzadj {
    public static final zzadj zza = new zzadj(0, 0);
    public final long zzb;
    public final long zzc;

    public zzadj(long j10, long j11) {
        this.zzb = j10;
        this.zzc = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadj.class == obj.getClass()) {
            zzadj zzadjVar = (zzadj) obj;
            if (this.zzb == zzadjVar.zzb && this.zzc == zzadjVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.zzb);
        sb2.append(", position=");
        return android.support.v4.media.session.h.e(sb2, this.zzc, "]");
    }
}
