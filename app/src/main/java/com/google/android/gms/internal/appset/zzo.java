package com.google.android.gms.internal.appset;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes2.dex */
final class zzo extends zze {
    final /* synthetic */ TaskCompletionSource zza;

    public zzo(zzp zzpVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.appset.zzf
    public final void zzb(Status status, com.google.android.gms.appset.zzc zzcVar) {
        AppSetIdInfo appSetIdInfo;
        if (zzcVar != null) {
            appSetIdInfo = new AppSetIdInfo(zzcVar.f10797a, zzcVar.f10798b);
        } else {
            appSetIdInfo = null;
        }
        TaskCompletionSource taskCompletionSource = this.zza;
        if (status.d()) {
            taskCompletionSource.b(appSetIdInfo);
        } else {
            taskCompletionSource.a(ApiExceptionUtil.a(status));
        }
    }
}
