package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes2.dex */
public final class zzr implements AppSetIdClient {
    private final AppSetIdClient zza;
    private final AppSetIdClient zzb;

    public zzr(Context context) {
        this.zza = new zzp(context, GoogleApiAvailabilityLight.f10884b);
        this.zzb = zzl.zzc(context);
    }

    public static /* synthetic */ Task zza(zzr zzrVar, Task task) {
        if (!task.o() && !task.m()) {
            Exception j10 = task.j();
            if (j10 instanceof ApiException) {
                int statusCode = ((ApiException) j10).getStatusCode();
                if (statusCode != 43001 && statusCode != 43002 && statusCode != 43003 && statusCode != 17) {
                    if (statusCode == 43000) {
                        return Tasks.d(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                    }
                    if (statusCode == 15) {
                        return Tasks.d(new Exception("The operation to get app set ID timed out. Please try again later."));
                    }
                    return task;
                }
                return zzrVar.zzb.getAppSetIdInfo();
            }
            return task;
        }
        return task;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.appset.zzq] */
    @Override // com.google.android.gms.appset.AppSetIdClient
    public final Task<AppSetIdInfo> getAppSetIdInfo() {
        return this.zza.getAppSetIdInfo().h(new Continuation() { // from class: com.google.android.gms.internal.appset.zzq
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return zzr.zza(zzr.this, task);
            }
        });
    }
}
