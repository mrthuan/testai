package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzbdu;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zze extends com.google.android.gms.ads.internal.util.client.zzm {
    public static void h(String str) {
        if (i() && str != null && str.length() > 4000) {
            for (String str2 : com.google.android.gms.ads.internal.util.client.zzm.f10370a.zzc(str)) {
            }
        }
    }

    public static boolean i() {
        if (com.google.android.gms.ads.internal.util.client.zzm.g(2) && ((Boolean) zzbdu.zza.zze()).booleanValue()) {
            return true;
        }
        return false;
    }
}
