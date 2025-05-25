package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfuz extends zzfus {
    private final Object zza;

    public zzfuz(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfuz) {
            return this.zza.equals(((zzfuz) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return a6.h.d("Optional.of(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    public final zzfus zza(zzful zzfulVar) {
        Object apply = zzfulVar.apply(this.zza);
        zzfuu.zzc(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzfuz(apply);
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
