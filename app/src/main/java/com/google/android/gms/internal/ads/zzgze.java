package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgze {
    public static final boolean zza(Object obj) {
        if (!((zzgzd) obj).zze()) {
            return true;
        }
        return false;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzgzd zzgzdVar = (zzgzd) obj;
        zzgzd zzgzdVar2 = (zzgzd) obj2;
        if (!zzgzdVar2.isEmpty()) {
            if (!zzgzdVar.zze()) {
                zzgzdVar = zzgzdVar.zzb();
            }
            zzgzdVar.zzd(zzgzdVar2);
        }
        return zzgzdVar;
    }
}
