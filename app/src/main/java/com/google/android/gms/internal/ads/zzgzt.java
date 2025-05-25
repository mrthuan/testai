package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgzt {
    public static final /* synthetic */ int zza = 0;
    private static final zzgzt zzb = new zzgzt();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzhaf zzc = new zzgzb();

    private zzgzt() {
    }

    public static zzgzt zza() {
        return zzb;
    }

    public final zzhae zzb(Class cls) {
        zzgyl.zzc(cls, "messageType");
        zzhae zzhaeVar = (zzhae) this.zzd.get(cls);
        if (zzhaeVar == null) {
            zzhaeVar = this.zzc.zza(cls);
            zzgyl.zzc(cls, "messageType");
            zzhae zzhaeVar2 = (zzhae) this.zzd.putIfAbsent(cls, zzhaeVar);
            if (zzhaeVar2 != null) {
                return zzhaeVar2;
            }
        }
        return zzhaeVar;
    }
}
