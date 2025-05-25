package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzdnz implements zzbix {
    final /* synthetic */ zzdoa zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbix zzd;

    public /* synthetic */ zzdnz(zzdoa zzdoaVar, WeakReference weakReference, String str, zzbix zzbixVar, zzdny zzdnyVar) {
        this.zza = zzdoaVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbixVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zzn(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
