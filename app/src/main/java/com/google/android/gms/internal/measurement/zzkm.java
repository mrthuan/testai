package com.google.android.gms.internal.measurement;

import lib.zj.office.fc.hpsf.Variant;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
final class zzkm {
    private final Object zza;
    private final int zzb;

    public zzkm(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzkm)) {
            return false;
        }
        zzkm zzkmVar = (zzkm) obj;
        if (this.zza != zzkmVar.zza || this.zzb != zzkmVar.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Variant.VT_ILLEGAL) + this.zzb;
    }
}
