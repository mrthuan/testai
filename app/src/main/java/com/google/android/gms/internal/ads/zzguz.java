package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzguz {
    public static final zzguz zza = new zzguz(new zzgva());
    public static final zzguz zzb = new zzguz(new zzgve());
    private final zzguy zzc;

    static {
        new zzguz(new zzgvg());
        new zzguz(new zzgvf());
        new zzguz(new zzgvb());
        new zzguz(new zzgvd());
        new zzguz(new zzgvc());
    }

    public zzguz(zzgvh zzgvhVar) {
        zzguy zzguxVar;
        if (!zzgks.zzb()) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                zzguxVar = new zzgut(zzgvhVar, null);
            } else {
                zzguxVar = new zzguv(zzgvhVar, null);
            }
        } else {
            zzguxVar = new zzgux(zzgvhVar, null);
        }
        this.zzc = zzguxVar;
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) {
        return this.zzc.zza(str);
    }
}
