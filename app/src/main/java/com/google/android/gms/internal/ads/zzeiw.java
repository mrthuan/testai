package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeiw {
    private zzein zza;

    public zzeiw() {
    }

    private zzeiw(zzein zzeinVar) {
        this.zza = zzeinVar;
    }

    public static zzeiw zzb(zzein zzeinVar) {
        return new zzeiw(zzeinVar);
    }

    public final zzein zza(Clock clock, zzeip zzeipVar, zzeey zzeeyVar, zzfll zzfllVar) {
        zzein zzeinVar = this.zza;
        if (zzeinVar != null) {
            return zzeinVar;
        }
        return new zzein(clock, zzeipVar, zzeeyVar, zzfllVar);
    }
}
