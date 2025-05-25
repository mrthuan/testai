package com.inmobi.unification.sdk.model.Initialization;

import androidx.annotation.Keep;
import com.inmobi.media.Cb;

@Keep
/* loaded from: classes2.dex */
public final class TimeoutConfigurations$NonABConfig {
    private TimeoutConfigurations$AdNonABConfig audio;
    private TimeoutConfigurations$AdNonABConfig banner;

    /* renamed from: int  reason: not valid java name */
    private TimeoutConfigurations$AdNonABConfig f4int;

    /* renamed from: native  reason: not valid java name */
    private TimeoutConfigurations$AdNonABConfig f5native;

    public TimeoutConfigurations$NonABConfig() {
        Cb.Companion.getClass();
        this.banner = new TimeoutConfigurations$AdNonABConfig(Cb.t(), Cb.r(), Cb.s(), Cb.q());
        this.f4int = new TimeoutConfigurations$AdNonABConfig(Cb.x(), Cb.v(), Cb.w(), Cb.u());
        this.f5native = new TimeoutConfigurations$AdNonABConfig(Cb.B(), Cb.z(), Cb.A(), Cb.y());
        this.audio = new TimeoutConfigurations$AdNonABConfig(Cb.p(), Cb.n(), Cb.o(), Cb.m());
    }

    public final TimeoutConfigurations$AdNonABConfig getAudio() {
        return this.audio;
    }

    public final TimeoutConfigurations$AdNonABConfig getBanner() {
        return this.banner;
    }

    public final TimeoutConfigurations$AdNonABConfig getInterstitial() {
        return this.f4int;
    }

    public final TimeoutConfigurations$AdNonABConfig getNative() {
        return this.f5native;
    }

    public final boolean isValid() {
        if (this.banner.isValid() && this.f4int.isValid() && this.f5native.isValid() && this.audio.isValid()) {
            return true;
        }
        return false;
    }
}
