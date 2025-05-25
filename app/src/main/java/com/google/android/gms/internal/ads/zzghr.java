package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzghr extends zzgex {
    private final String zza;
    private final zzghq zzb;

    private zzghr(String str, zzghq zzghqVar) {
        this.zza = str;
        this.zzb = zzghqVar;
    }

    public static zzghr zzc(String str, zzghq zzghqVar) {
        return new zzghr(str, zzghqVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghr)) {
            return false;
        }
        zzghr zzghrVar = (zzghr) obj;
        if (!zzghrVar.zza.equals(this.zza) || !zzghrVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzghr.class, this.zza, this.zzb);
    }

    public final String toString() {
        String zzghqVar = this.zzb.toString();
        return "LegacyKmsAead Parameters (keyUri: " + this.zza + ", variant: " + zzghqVar + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final boolean zza() {
        if (this.zzb != zzghq.zzb) {
            return true;
        }
        return false;
    }

    public final zzghq zzb() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zza;
    }
}
