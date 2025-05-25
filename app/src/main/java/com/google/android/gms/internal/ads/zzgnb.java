package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgnb {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgnb(Class cls, Class cls2, zzgna zzgnaVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgnb)) {
            return false;
        }
        zzgnb zzgnbVar = (zzgnb) obj;
        if (!zzgnbVar.zza.equals(this.zza) || !zzgnbVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return androidx.activity.f.m(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }
}
