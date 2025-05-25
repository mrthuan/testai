package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgnf {
    private final Class zza;
    private zzgnh zzd;
    private Map zzb = new HashMap();
    private final List zzc = new ArrayList();
    private zzgln zze = zzgln.zza;

    public /* synthetic */ zzgnf(Class cls, zzgne zzgneVar) {
        this.zza = cls;
    }

    private final zzgnf zze(Object obj, zzgdy zzgdyVar, zzgtg zzgtgVar, boolean z10) {
        byte[] zzc;
        zzgvr zzgvrVar;
        zzgvr zzgvrVar2;
        if (this.zzb != null) {
            if (zzgtgVar.zzk() == 3) {
                int ordinal = zzgtgVar.zzf().ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw new GeneralSecurityException("unknown output prefix type");
                            }
                        } else {
                            zzc = zzgdt.zza;
                        }
                    }
                    zzc = zzgml.zza(zzgtgVar.zza()).zzc();
                } else {
                    zzc = zzgml.zzb(zzgtgVar.zza()).zzc();
                }
                zzgnh zzgnhVar = new zzgnh(obj, zzgvr.zzb(zzc), zzgtgVar.zzk(), zzgtgVar.zzf(), zzgtgVar.zza(), zzgtgVar.zzc().zzg(), zzgdyVar, null);
                Map map = this.zzb;
                List list = this.zzc;
                ArrayList arrayList = new ArrayList();
                arrayList.add(zzgnhVar);
                zzgvrVar = zzgnhVar.zzb;
                List list2 = (List) map.put(zzgvrVar, Collections.unmodifiableList(arrayList));
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(list2);
                    arrayList2.add(zzgnhVar);
                    zzgvrVar2 = zzgnhVar.zzb;
                    map.put(zzgvrVar2, Collections.unmodifiableList(arrayList2));
                }
                list.add(zzgnhVar);
                if (z10) {
                    if (this.zzd == null) {
                        this.zzd = zzgnhVar;
                    } else {
                        throw new IllegalStateException("you cannot set two primary primitives");
                    }
                }
                return this;
            }
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        throw new IllegalStateException("addEntry cannot be called after build");
    }

    public final zzgnf zza(Object obj, zzgdy zzgdyVar, zzgtg zzgtgVar) {
        zze(obj, zzgdyVar, zzgtgVar, false);
        return this;
    }

    public final zzgnf zzb(Object obj, zzgdy zzgdyVar, zzgtg zzgtgVar) {
        zze(obj, zzgdyVar, zzgtgVar, true);
        return this;
    }

    public final zzgnf zzc(zzgln zzglnVar) {
        if (this.zzb != null) {
            this.zze = zzglnVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    public final zzgnj zzd() {
        Map map = this.zzb;
        if (map != null) {
            zzgnj zzgnjVar = new zzgnj(map, this.zzc, this.zzd, this.zze, this.zza, null);
            this.zzb = null;
            return zzgnjVar;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
