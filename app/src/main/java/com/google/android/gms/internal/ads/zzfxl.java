package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzfxl {
    public static int zze(int i10, int i11) {
        int i12 = i10 + (i10 >> 1) + 1;
        if (i12 < i11) {
            int highestOneBit = Integer.highestOneBit(i11 - 1);
            i12 = highestOneBit + highestOneBit;
        }
        if (i12 < 0) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return i12;
    }

    public abstract zzfxl zzb(Object obj);
}
