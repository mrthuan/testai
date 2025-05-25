package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class ApiExceptionUtil {
    @KeepForSdk
    public static ApiException a(Status status) {
        boolean z10;
        if (status.c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
