package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfsf {
    public static y9.a zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzfse zzfseVar = new zzfse(task, null);
        task.c(zzgda.zzb(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfsd
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfse zzfseVar2 = zzfse.this;
                if (task2.m()) {
                    zzfseVar2.cancel(false);
                } else if (task2.o()) {
                    zzfseVar2.zzc(task2.k());
                } else {
                    Exception j10 = task2.j();
                    if (j10 != null) {
                        zzfseVar2.zzd(j10);
                        return;
                    }
                    throw new IllegalStateException();
                }
            }
        });
        return zzfseVar;
    }
}
