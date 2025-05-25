package com.google.android.gms.common.moduleinstall.internal;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public interface zae extends IInterface {
    void O(Status status, ModuleInstallResponse moduleInstallResponse);

    void R(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse);

    void u0(Status status);

    void w(Status status, ModuleInstallIntentResponse moduleInstallIntentResponse);
}
