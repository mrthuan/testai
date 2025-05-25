package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzdhx implements zzbix {
    private final WeakReference zza;

    public /* synthetic */ zzdhx(zzdhy zzdhyVar, zzdhw zzdhwVar) {
        this.zza = new WeakReference(zzdhyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        zzdhy zzdhyVar = (zzdhy) this.zza.get();
        if (zzdhyVar == null) {
            return;
        }
        zzdhy.zzc(zzdhyVar).zza();
    }
}
