package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgeq {
    public static final /* synthetic */ int zza = 0;

    static {
        Logger.getLogger(zzgeq.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(zzgdo.class);
        hashSet.add(zzgdu.class);
        hashSet.add(zzges.class);
        hashSet.add(zzgdw.class);
        hashSet.add(zzgdv.class);
        hashSet.add(zzgem.class);
        hashSet.add(zzgqi.class);
        hashSet.add(zzgeo.class);
        hashSet.add(zzgep.class);
        Collections.unmodifiableSet(hashSet);
    }

    private zzgeq() {
    }

    public static Class zza(Class cls) {
        try {
            return zzgmh.zza().zzb(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object zzb(zzgsv zzgsvVar, Class cls) {
        String zzg = zzgsvVar.zzg();
        return zzgky.zzc().zza(zzg, cls).zzc(zzgsvVar.zzf());
    }
}
