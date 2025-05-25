package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgmz {
    private final Map zza;
    private final Map zzb;

    private zzgmz() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzgmz zza(zzgmx zzgmxVar) {
        if (zzgmxVar != null) {
            zzgnb zzgnbVar = new zzgnb(zzgmxVar.zzc(), zzgmxVar.zzd(), null);
            if (this.zza.containsKey(zzgnbVar)) {
                zzgmx zzgmxVar2 = (zzgmx) this.zza.get(zzgnbVar);
                if (!zzgmxVar2.equals(zzgmxVar) || !zzgmxVar.equals(zzgmxVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgnbVar.toString()));
                }
            } else {
                this.zza.put(zzgnbVar, zzgmxVar);
            }
            return this;
        }
        throw new NullPointerException("primitive constructor must be non-null");
    }

    public final zzgmz zzb(zzgnk zzgnkVar) {
        Map map = this.zzb;
        Class zzb = zzgnkVar.zzb();
        if (map.containsKey(zzb)) {
            zzgnk zzgnkVar2 = (zzgnk) this.zzb.get(zzb);
            if (!zzgnkVar2.equals(zzgnkVar) || !zzgnkVar.equals(zzgnkVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zzb.toString()));
            }
        } else {
            this.zzb.put(zzb, zzgnkVar);
        }
        return this;
    }

    public /* synthetic */ zzgmz(zzgmy zzgmyVar) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public /* synthetic */ zzgmz(zzgnd zzgndVar, zzgmy zzgmyVar) {
        this.zza = new HashMap(zzgnd.zzd(zzgndVar));
        this.zzb = new HashMap(zzgnd.zze(zzgndVar));
    }
}
