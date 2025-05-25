package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgnx {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzgnx(zzgnr zzgnrVar, zzgnw zzgnwVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = zzgnrVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgnrVar.zzb;
        this.zzb = new HashMap(map2);
        map3 = zzgnrVar.zzc;
        this.zzc = new HashMap(map3);
        map4 = zzgnrVar.zzd;
        this.zzd = new HashMap(map4);
    }

    public final zzgdy zza(zzgnq zzgnqVar, zzger zzgerVar) {
        zzgnt zzgntVar = new zzgnt(zzgnqVar.getClass(), zzgnqVar.zzd(), null);
        if (this.zzb.containsKey(zzgntVar)) {
            return ((zzglc) this.zzb.get(zzgntVar)).zza(zzgnqVar, zzgerVar);
        }
        throw new GeneralSecurityException(a6.h.d("No Key Parser for requested key type ", zzgntVar.toString(), " available"));
    }

    public final zzgen zzb(zzgnq zzgnqVar) {
        zzgnt zzgntVar = new zzgnt(zzgnqVar.getClass(), zzgnqVar.zzd(), null);
        if (this.zzd.containsKey(zzgntVar)) {
            return ((zzgmp) this.zzd.get(zzgntVar)).zza(zzgnqVar);
        }
        throw new GeneralSecurityException(a6.h.d("No Parameters Parser for requested key type ", zzgntVar.toString(), " available"));
    }

    public final zzgnq zzc(zzgdy zzgdyVar, Class cls, zzger zzgerVar) {
        zzgnv zzgnvVar = new zzgnv(zzgdyVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgnvVar)) {
            return ((zzglg) this.zza.get(zzgnvVar)).zza(zzgdyVar, zzgerVar);
        }
        throw new GeneralSecurityException(a6.h.d("No Key serializer for ", zzgnvVar.toString(), " available"));
    }

    public final zzgnq zzd(zzgen zzgenVar, Class cls) {
        zzgnv zzgnvVar = new zzgnv(zzgenVar.getClass(), cls, null);
        if (this.zzc.containsKey(zzgnvVar)) {
            return ((zzgmt) this.zzc.get(zzgnvVar)).zza(zzgenVar);
        }
        throw new GeneralSecurityException(a6.h.d("No Key Format serializer for ", zzgnvVar.toString(), " available"));
    }

    public final boolean zzi(zzgnq zzgnqVar) {
        return this.zzb.containsKey(new zzgnt(zzgnqVar.getClass(), zzgnqVar.zzd(), null));
    }

    public final boolean zzj(zzgnq zzgnqVar) {
        return this.zzd.containsKey(new zzgnt(zzgnqVar.getClass(), zzgnqVar.zzd(), null));
    }
}
