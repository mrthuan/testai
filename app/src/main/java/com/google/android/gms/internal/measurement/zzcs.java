package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.2 */
/* loaded from: classes2.dex */
final class zzcs extends zzdu {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzef zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcs(zzef zzefVar, Boolean bool) {
        super(zzefVar, true);
        this.zzb = zzefVar;
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() {
        zzcc zzccVar;
        zzcc zzccVar2;
        if (this.zza != null) {
            zzccVar2 = this.zzb.zzj;
            Preconditions.j(zzccVar2);
            zzccVar2.setMeasurementEnabled(this.zza.booleanValue(), this.zzh);
            return;
        }
        zzccVar = this.zzb.zzj;
        Preconditions.j(zzccVar);
        zzccVar.clearMeasurementEnabled(this.zzh);
    }
}
