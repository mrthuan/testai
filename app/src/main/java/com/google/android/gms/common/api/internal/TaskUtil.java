package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class TaskUtil {
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static void a(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.d()) {
            taskCompletionSource.d(obj);
        } else {
            taskCompletionSource.c(ApiExceptionUtil.a(status));
        }
    }
}
