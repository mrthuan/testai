package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgbf extends zzgbz implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    y9.a zza;
    Object zzb;

    public zzgbf(y9.a aVar, Object obj) {
        aVar.getClass();
        this.zza = aVar;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        y9.a aVar = this.zza;
        Object obj = this.zzb;
        boolean isCancelled = isCancelled();
        boolean z11 = true;
        if (aVar == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = isCancelled | z10;
        if (obj != null) {
            z11 = false;
        }
        if (z12 | z11) {
            return;
        }
        this.zza = null;
        if (aVar.isCancelled()) {
            zzs(aVar);
            return;
        }
        try {
            try {
                Object zze = zze(obj, zzgcj.zzp(aVar));
                this.zzb = null;
                zzf(zze);
            } catch (Throwable th2) {
                try {
                    zzgdb.zza(th2);
                    zzd(th2);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e10) {
            zzd(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            zzd(e11.getCause());
        } catch (Exception e12) {
            zzd(e12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final String zza() {
        String str;
        y9.a aVar = this.zza;
        Object obj = this.zzb;
        String zza = super.zza();
        if (aVar != null) {
            str = a6.h.d("inputFuture=[", aVar.toString(), "], ");
        } else {
            str = "";
        }
        if (obj != null) {
            return a0.a.j(str, "function=[", obj.toString(), "]");
        }
        if (zza != null) {
            return str.concat(zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    public abstract Object zze(Object obj, Object obj2);

    public abstract void zzf(Object obj);
}
