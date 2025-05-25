package com.inmobi.ads.exceptions;

import androidx.annotation.Keep;
import kotlin.jvm.internal.g;

@Keep
/* loaded from: classes2.dex */
public final class SdkNotInitializedException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkNotInitializedException(String adType) {
        super("Please initialize the SDK before creating " + adType + " ad");
        g.e(adType, "adType");
    }
}
