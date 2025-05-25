package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdsn implements zzfjm {
    private final zzdsf zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdsn(zzdsf zzdsfVar, Set set, Clock clock) {
        zzfjf zzfjfVar;
        this.zzb = zzdsfVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdsm zzdsmVar = (zzdsm) it.next();
            Map map = this.zzd;
            zzfjfVar = zzdsmVar.zzc;
            map.put(zzfjfVar, zzdsmVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfjf zzfjfVar, boolean z10) {
        zzfjf zzfjfVar2;
        String str;
        String str2;
        zzfjfVar2 = ((zzdsm) this.zzd.get(zzfjfVar)).zzb;
        if (this.zza.containsKey(zzfjfVar2)) {
            if (true != z10) {
                str = "f.";
            } else {
                str = "s.";
            }
            long b10 = this.zzc.b() - ((Long) this.zza.get(zzfjfVar2)).longValue();
            zzdsf zzdsfVar = this.zzb;
            Map map = this.zzd;
            Map zzb = zzdsfVar.zzb();
            str2 = ((zzdsm) map.get(zzfjfVar)).zza;
            zzb.put("label.".concat(str2), str.concat(String.valueOf(Long.toString(b10))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final void zzd(zzfjf zzfjfVar, String str) {
        if (this.zza.containsKey(zzfjfVar)) {
            long b10 = this.zzc.b() - ((Long) this.zza.get(zzfjfVar)).longValue();
            zzdsf zzdsfVar = this.zzb;
            String valueOf = String.valueOf(str);
            zzdsfVar.zzb().put("task.".concat(valueOf), "s.".concat(String.valueOf(Long.toString(b10))));
        }
        if (this.zzd.containsKey(zzfjfVar)) {
            zze(zzfjfVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final void zzdD(zzfjf zzfjfVar, String str, Throwable th2) {
        if (this.zza.containsKey(zzfjfVar)) {
            Clock clock = this.zzc;
            Map map = this.zza;
            zzdsf zzdsfVar = this.zzb;
            String valueOf = String.valueOf(str);
            zzdsfVar.zzb().put("task.".concat(valueOf), "f.".concat(String.valueOf(Long.toString(clock.b() - ((Long) map.get(zzfjfVar)).longValue()))));
        }
        if (this.zzd.containsKey(zzfjfVar)) {
            zze(zzfjfVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final void zzdE(zzfjf zzfjfVar, String str) {
        this.zza.put(zzfjfVar, Long.valueOf(this.zzc.b()));
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final void zzdC(zzfjf zzfjfVar, String str) {
    }
}
