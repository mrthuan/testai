package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgnv {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgnv(Class cls, Class cls2, zzgnu zzgnuVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgnv)) {
            return false;
        }
        zzgnv zzgnvVar = (zzgnv) obj;
        if (!zzgnvVar.zza.equals(this.zza) || !zzgnvVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return androidx.activity.f.m(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }
}
