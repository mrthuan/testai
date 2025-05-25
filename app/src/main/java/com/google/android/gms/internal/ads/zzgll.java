package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgll {
    private HashMap zza = new HashMap();

    public final zzgln zza() {
        if (this.zza != null) {
            zzgln zzglnVar = new zzgln(Collections.unmodifiableMap(this.zza), null);
            this.zza = null;
            return zzglnVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
