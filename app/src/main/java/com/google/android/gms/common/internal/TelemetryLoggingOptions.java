package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class TelemetryLoggingOptions implements Api.ApiOptions.Optional {

    /* renamed from: b  reason: collision with root package name */
    public static final TelemetryLoggingOptions f11236b = new TelemetryLoggingOptions();

    /* renamed from: a  reason: collision with root package name */
    public final String f11237a = null;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public static class Builder {
        private Builder() {
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TelemetryLoggingOptions)) {
            return false;
        }
        return Objects.a(this.f11237a, ((TelemetryLoggingOptions) obj).f11237a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11237a});
    }
}
