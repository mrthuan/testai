package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* loaded from: assets/audience_network.dex */
public abstract class L8 {
    public static AdError A00(C0894Jg c0894Jg) {
        if (c0894Jg.A03().isPublicError()) {
            return new AdError(c0894Jg.A03().getErrorCode(), c0894Jg.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
