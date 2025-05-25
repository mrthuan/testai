package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgnr {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzgnr() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzgnr zza(zzglc zzglcVar) {
        zzgnt zzgntVar = new zzgnt(zzglcVar.zzd(), zzglcVar.zzc(), null);
        if (this.zzb.containsKey(zzgntVar)) {
            zzglc zzglcVar2 = (zzglc) this.zzb.get(zzgntVar);
            if (!zzglcVar2.equals(zzglcVar) || !zzglcVar.equals(zzglcVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgntVar.toString()));
            }
        } else {
            this.zzb.put(zzgntVar, zzglcVar);
        }
        return this;
    }

    public final zzgnr zzb(zzglg zzglgVar) {
        zzgnv zzgnvVar = new zzgnv(zzglgVar.zzc(), zzglgVar.zzd(), null);
        if (this.zza.containsKey(zzgnvVar)) {
            zzglg zzglgVar2 = (zzglg) this.zza.get(zzgnvVar);
            if (!zzglgVar2.equals(zzglgVar) || !zzglgVar.equals(zzglgVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgnvVar.toString()));
            }
        } else {
            this.zza.put(zzgnvVar, zzglgVar);
        }
        return this;
    }

    public final zzgnr zzc(zzgmp zzgmpVar) {
        zzgnt zzgntVar = new zzgnt(zzgmpVar.zzd(), zzgmpVar.zzc(), null);
        if (this.zzd.containsKey(zzgntVar)) {
            zzgmp zzgmpVar2 = (zzgmp) this.zzd.get(zzgntVar);
            if (!zzgmpVar2.equals(zzgmpVar) || !zzgmpVar.equals(zzgmpVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgntVar.toString()));
            }
        } else {
            this.zzd.put(zzgntVar, zzgmpVar);
        }
        return this;
    }

    public final zzgnr zzd(zzgmt zzgmtVar) {
        zzgnv zzgnvVar = new zzgnv(zzgmtVar.zzc(), zzgmtVar.zzd(), null);
        if (this.zzc.containsKey(zzgnvVar)) {
            zzgmt zzgmtVar2 = (zzgmt) this.zzc.get(zzgnvVar);
            if (!zzgmtVar2.equals(zzgmtVar) || !zzgmtVar.equals(zzgmtVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgnvVar.toString()));
            }
        } else {
            this.zzc.put(zzgnvVar, zzgmtVar);
        }
        return this;
    }

    public zzgnr(zzgnx zzgnxVar) {
        this.zza = new HashMap(zzgnx.zzf(zzgnxVar));
        this.zzb = new HashMap(zzgnx.zze(zzgnxVar));
        this.zzc = new HashMap(zzgnx.zzh(zzgnxVar));
        this.zzd = new HashMap(zzgnx.zzg(zzgnxVar));
    }
}
