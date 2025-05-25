package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.2 */
/* loaded from: classes2.dex */
final class zzdn extends zzdu {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzef zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdn(zzef zzefVar, boolean z10) {
        super(zzefVar, true);
        this.zzb = zzefVar;
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() {
        zzcc zzccVar;
        zzccVar = this.zzb.zzj;
        Preconditions.j(zzccVar);
        zzccVar.setDataCollectionEnabled(this.zza);
    }
}
