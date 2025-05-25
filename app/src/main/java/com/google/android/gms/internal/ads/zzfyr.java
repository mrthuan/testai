package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfyr extends zzfyv {
    final /* synthetic */ Comparator zza;

    public zzfyr(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final Map zza() {
        return new TreeMap(this.zza);
    }
}
