package com.google.android.gms.ads;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class AdInspectorError extends AdError {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface AdInspectorErrorCode {
    }

    public AdInspectorError(int i10, String str, String str2) {
        super(i10, str, str2, null);
    }

    @Override // com.google.android.gms.ads.AdError
    public final int a() {
        return this.f10005a;
    }
}
