package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzbcd {
    public static boolean zza(zzbcl zzbclVar, zzbci zzbciVar, String... strArr) {
        if (zzbciVar == null) {
            return false;
        }
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        zzbclVar.zze(zzbciVar, SystemClock.elapsedRealtime(), strArr);
        return true;
    }
}
