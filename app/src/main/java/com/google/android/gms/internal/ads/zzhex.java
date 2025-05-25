package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzhex {
    final LinkedHashMap zza;

    public zzhex(int i10) {
        this.zza = zzhez.zzb(i10);
    }

    public final zzhex zza(Object obj, zzhfl zzhflVar) {
        zzhfk.zza(obj, "key");
        zzhfk.zza(zzhflVar, "provider");
        this.zza.put(obj, zzhflVar);
        return this;
    }
}
