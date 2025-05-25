package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcqw implements zzaxw {
    private final zzcej zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    public zzcqw(zzcej zzcejVar, Executor executor) {
        this.zza = zzcejVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final synchronized void zzdp(zzaxv zzaxvVar) {
        if (this.zza != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzlF)).booleanValue()) {
                if (zzaxvVar.zzj) {
                    AtomicReference atomicReference = this.zzc;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        Executor executor = this.zzb;
                        final zzcej zzcejVar = this.zza;
                        Objects.requireNonNull(zzcejVar);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqu
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcej.this.onResume();
                            }
                        });
                        return;
                    }
                }
                if (!zzaxvVar.zzj) {
                    AtomicReference atomicReference2 = this.zzc;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        Executor executor2 = this.zzb;
                        final zzcej zzcejVar2 = this.zza;
                        Objects.requireNonNull(zzcejVar2);
                        executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqv
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcej.this.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
