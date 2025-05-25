package com.google.android.gms.internal.play_billing;

import lib.zj.office.fc.hpsf.Variant;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzcc {
    private final Object zza;
    private final int zzb;

    public zzcc(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcc)) {
            return false;
        }
        zzcc zzccVar = (zzcc) obj;
        if (this.zza != zzccVar.zza || this.zzb != zzccVar.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Variant.VT_ILLEGAL) + this.zzb;
    }
}
