package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzeoj implements zzevo {
    private final Set zza;

    public zzeoj(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        final ArrayList arrayList = new ArrayList();
        for (String str : this.zza) {
            arrayList.add(str);
        }
        return zzgcj.zzh(new zzevn() { // from class: com.google.android.gms.internal.ads.zzeoi
            @Override // com.google.android.gms.internal.ads.zzevn
            public final void zzj(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
