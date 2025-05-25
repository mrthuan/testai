package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgnd {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzgnd(zzgmz zzgmzVar, zzgnc zzgncVar) {
        Map map;
        Map map2;
        map = zzgmzVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgmzVar.zzb;
        this.zzb = new HashMap(map2);
    }

    public final Class zza(Class cls) {
        if (this.zzb.containsKey(cls)) {
            return ((zzgnk) this.zzb.get(cls)).zza();
        }
        throw new GeneralSecurityException(a6.h.d("No input primitive class for ", cls.toString(), " available"));
    }

    public final Object zzb(zzgdy zzgdyVar, Class cls) {
        zzgnb zzgnbVar = new zzgnb(zzgdyVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgnbVar)) {
            return ((zzgmx) this.zza.get(zzgnbVar)).zza(zzgdyVar);
        }
        throw new GeneralSecurityException(a6.h.d("No PrimitiveConstructor for ", zzgnbVar.toString(), " available"));
    }

    public final Object zzc(zzgnj zzgnjVar, Class cls) {
        if (this.zzb.containsKey(cls)) {
            zzgnk zzgnkVar = (zzgnk) this.zzb.get(cls);
            if (zzgnjVar.zzd().equals(zzgnkVar.zza()) && zzgnkVar.zza().equals(zzgnjVar.zzd())) {
                return zzgnkVar.zzc(zzgnjVar);
            }
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
    }
}
