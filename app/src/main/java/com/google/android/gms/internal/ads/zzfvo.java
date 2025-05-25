package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfvo {
    public static zzfvk zza(zzfvk zzfvkVar) {
        if (!(zzfvkVar instanceof zzfvn) && !(zzfvkVar instanceof zzfvl)) {
            if (zzfvkVar instanceof Serializable) {
                return new zzfvl(zzfvkVar);
            }
            return new zzfvn(zzfvkVar);
        }
        return zzfvkVar;
    }
}
