package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzcr extends zzdu {
    final /* synthetic */ Activity zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzef zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcr(zzef zzefVar, Activity activity, String str, String str2) {
        super(zzefVar, true);
        this.zzd = zzefVar;
        this.zza = activity;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() {
        zzcc zzccVar;
        zzccVar = this.zzd.zzj;
        Preconditions.j(zzccVar);
        zzccVar.setCurrentScreen(new ObjectWrapper(this.zza), this.zzb, this.zzc, this.zzh);
    }
}
