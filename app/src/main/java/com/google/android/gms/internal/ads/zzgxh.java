package com.google.android.gms.internal.ads;

import lib.zj.office.fc.hpsf.Variant;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgxh {
    private final Object zza;
    private final int zzb;

    public zzgxh(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgxh)) {
            return false;
        }
        zzgxh zzgxhVar = (zzgxh) obj;
        if (this.zza != zzgxhVar.zza || this.zzb != zzgxhVar.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Variant.VT_ILLEGAL) + this.zzb;
    }
}
