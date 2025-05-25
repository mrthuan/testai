package com.google.android.gms.internal.measurement;

import a6.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzik extends zzii {
    private final Object zza;

    public zzik(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzik) {
            return this.zza.equals(((zzik) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return h.d("Optional.of(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final boolean zzb() {
        return true;
    }
}
