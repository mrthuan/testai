package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzh {
    public static final zzh zza = new zzh(0, 0, 1, 1, 0, null);
    private zzf zzb;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public /* synthetic */ zzh(int i10, int i11, int i12, int i13, int i14, zzg zzgVar) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzh.class == obj.getClass()) {
            zzh zzhVar = (zzh) obj;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 486696559;
    }

    public final zzf zza() {
        if (this.zzb == null) {
            this.zzb = new zzf(this, null);
        }
        return this.zzb;
    }
}
