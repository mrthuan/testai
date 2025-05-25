package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzkn {
    static final zzkn zza = new zzkn(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzkn zzd;
    private final Map zze;

    public zzkn() {
        this.zze = new HashMap();
    }

    public static zzkn zza() {
        zzkn zzknVar = zzd;
        if (zzknVar != null) {
            return zzknVar;
        }
        synchronized (zzkn.class) {
            zzkn zzknVar2 = zzd;
            if (zzknVar2 != null) {
                return zzknVar2;
            }
            zzkn zzb2 = zzkv.zzb(zzkn.class);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final zzkz zzb(zzmi zzmiVar, int i10) {
        return (zzkz) this.zze.get(new zzkm(zzmiVar, i10));
    }

    public zzkn(boolean z10) {
        this.zze = Collections.emptyMap();
    }
}
