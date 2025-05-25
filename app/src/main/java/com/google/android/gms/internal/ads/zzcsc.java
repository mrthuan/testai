package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcsc implements zzeio {
    public final List zza;

    public zzcsc(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzeio
    public final void zzr() {
        for (y9.a aVar : this.zza) {
            zzgcj.zzr(aVar, new zzcsb(this), zzgda.zzb());
        }
    }

    public zzcsc(zzcru zzcruVar) {
        this.zza = Collections.singletonList(zzgcj.zzh(zzcruVar));
    }
}
