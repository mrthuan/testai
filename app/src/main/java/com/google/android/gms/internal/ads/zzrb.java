package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzrb extends IOException {
    public final int zza;

    public zzrb(Throwable th2, int i10) {
        super(th2);
        this.zza = AdError.MEDIAVIEW_MISSING_ERROR_CODE;
    }
}
