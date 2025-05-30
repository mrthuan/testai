package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzdf extends zzdu {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzbz zzd;
    final /* synthetic */ zzef zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdf(zzef zzefVar, String str, String str2, boolean z10, zzbz zzbzVar) {
        super(zzefVar, true);
        this.zze = zzefVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() {
        zzcc zzccVar;
        zzccVar = this.zze.zzj;
        Preconditions.j(zzccVar);
        zzccVar.getUserProperties(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zzb() {
        this.zzd.zze(null);
    }
}
