package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzck {
    public static final zzck zza = new zzck(zzfxr.zzm());
    private final zzfxr zzb;

    static {
        Integer.toString(0, 36);
    }

    public zzck(List list) {
        this.zzb = zzfxr.zzk(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzck.class == obj.getClass()) {
            return this.zzb.equals(((zzck) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzfxr zza() {
        return this.zzb;
    }

    public final boolean zzb(int i10) {
        for (int i11 = 0; i11 < this.zzb.size(); i11++) {
            zzcj zzcjVar = (zzcj) this.zzb.get(i11);
            if (zzcjVar.zzc() && zzcjVar.zza() == i10) {
                return true;
            }
        }
        return false;
    }
}
