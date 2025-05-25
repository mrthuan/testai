package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcrw implements zzcrx {
    private final Map zza;

    public zzcrw(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcrx
    public final zzeet zza(int i10, String str) {
        return (zzeet) this.zza.get(str);
    }
}
