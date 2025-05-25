package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.2 */
/* loaded from: classes2.dex */
final class zzdv extends zzch {
    private final com.google.android.gms.measurement.internal.zzhe zza;

    public zzdv(com.google.android.gms.measurement.internal.zzhe zzheVar) {
        this.zza = zzheVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j10) {
        this.zza.b(str, str2, bundle, j10);
    }
}
