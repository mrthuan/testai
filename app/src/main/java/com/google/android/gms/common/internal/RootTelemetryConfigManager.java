package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class RootTelemetryConfigManager {

    /* renamed from: b  reason: collision with root package name */
    public static RootTelemetryConfigManager f11226b;
    public static final RootTelemetryConfiguration c = new RootTelemetryConfiguration(0, 0, 0, false, false);

    /* renamed from: a  reason: collision with root package name */
    public RootTelemetryConfiguration f11227a;

    private RootTelemetryConfigManager() {
    }

    @KeepForSdk
    public static synchronized RootTelemetryConfigManager a() {
        RootTelemetryConfigManager rootTelemetryConfigManager;
        synchronized (RootTelemetryConfigManager.class) {
            if (f11226b == null) {
                f11226b = new RootTelemetryConfigManager();
            }
            rootTelemetryConfigManager = f11226b;
        }
        return rootTelemetryConfigManager;
    }
}
