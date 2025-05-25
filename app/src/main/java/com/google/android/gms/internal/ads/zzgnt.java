package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgnt {
    private final Class zza;
    private final zzgvr zzb;

    public /* synthetic */ zzgnt(Class cls, zzgvr zzgvrVar, zzgns zzgnsVar) {
        this.zza = cls;
        this.zzb = zzgvrVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgnt)) {
            return false;
        }
        zzgnt zzgntVar = (zzgnt) obj;
        if (!zzgntVar.zza.equals(this.zza) || !zzgntVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return androidx.activity.f.m(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }
}
