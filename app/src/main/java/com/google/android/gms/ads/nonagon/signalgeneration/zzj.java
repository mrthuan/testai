package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
final class zzj extends LinkedHashMap {
    final /* synthetic */ zzl zza;

    public zzj(zzl zzlVar) {
        this.zza = zzlVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.zza) {
            int size = size();
            zzl zzlVar = this.zza;
            boolean z10 = false;
            if (size <= zzlVar.f10735a) {
                return false;
            }
            zzlVar.f10739f.add(new Pair((String) entry.getKey(), ((zzk) entry.getValue()).f10734b));
            if (size() > this.zza.f10735a) {
                z10 = true;
            }
            return z10;
        }
    }
}
