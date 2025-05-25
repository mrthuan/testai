package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfvl implements Serializable, zzfvk {
    final zzfvk zza;
    volatile transient boolean zzb;
    transient Object zzc;

    public zzfvl(zzfvk zzfvkVar) {
        this.zza = zzfvkVar;
    }

    public final String toString() {
        Object obj;
        if (this.zzb) {
            obj = a6.h.d("<supplier that returned ", String.valueOf(this.zzc), ">");
        } else {
            obj = this.zza;
        }
        return a6.h.d("Suppliers.memoize(", obj.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    Object zza = this.zza.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
