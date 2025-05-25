package com.inmobi.unification.sdk.model.Initialization;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes2.dex */
public final class TimeoutConfigurations$MediationConfig {

    /* renamed from: ab  reason: collision with root package name */
    private TimeoutConfigurations$ABConfig f15715ab = new TimeoutConfigurations$ABConfig();
    private TimeoutConfigurations$NonABConfig nonAb = new TimeoutConfigurations$NonABConfig();
    private TimeoutConfigurations$PreloadConfig preload = new TimeoutConfigurations$PreloadConfig();

    public final TimeoutConfigurations$ABConfig getABConfig() {
        return this.f15715ab;
    }

    public final TimeoutConfigurations$NonABConfig getNonABConfig() {
        return this.nonAb;
    }

    public final TimeoutConfigurations$PreloadConfig getPreloadConfig() {
        return this.preload;
    }

    public final boolean isValid() {
        if (this.f15715ab.isValid() && this.nonAb.isValid() && this.preload.isValid()) {
            return true;
        }
        return false;
    }
}
