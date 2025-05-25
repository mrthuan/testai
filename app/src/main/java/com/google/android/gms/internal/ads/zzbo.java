package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzbo extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzbo(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.zza = z10;
        this.zzb = i10;
    }

    public static zzbo zza(String str, Throwable th2) {
        return new zzbo(str, th2, true, 1);
    }

    public static zzbo zzb(String str, Throwable th2) {
        return new zzbo(str, th2, true, 0);
    }

    public static zzbo zzc(String str) {
        return new zzbo(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder g10 = a0.d.g(super.getMessage(), "{contentIsMalformed=");
        g10.append(this.zza);
        g10.append(", dataType=");
        return a6.h.g(g10, this.zzb, "}");
    }
}
