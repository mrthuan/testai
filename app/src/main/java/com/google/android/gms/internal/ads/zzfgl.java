package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfgl {
    static Task zza;
    public static AppSetIdClient zzb;
    private static final Object zzc = new Object();

    public static Task zza(Context context) {
        Task task;
        zzb(context, false);
        synchronized (zzc) {
            task = zza;
        }
        return task;
    }

    public static void zzb(Context context, boolean z10) {
        synchronized (zzc) {
            if (zzb == null) {
                zzb = new com.google.android.gms.internal.appset.zzr(context);
            }
            Task task = zza;
            if (task == null || ((task.n() && !zza.o()) || (z10 && zza.n()))) {
                AppSetIdClient appSetIdClient = zzb;
                Preconditions.k(appSetIdClient, "the appSetIdClient shouldn't be null");
                zza = appSetIdClient.getAppSetIdInfo();
            }
        }
    }
}
