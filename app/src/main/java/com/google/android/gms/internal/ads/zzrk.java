package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzrk {
    public static final boolean zza;

    static {
        boolean z10 = false;
        if ("Amazon".equals(zzet.zzc)) {
            String str = zzet.zzd;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
            }
        }
        zza = z10;
    }
}
