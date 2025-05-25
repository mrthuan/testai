package com.inmobi.unification.sdk.model.Initialization;

import androidx.annotation.Keep;
import com.inmobi.media.Cb;

@Keep
/* loaded from: classes2.dex */
public final class TimeoutConfigurations$ABConfig {
    private TimeoutConfigurations$AdABConfig audio;
    private TimeoutConfigurations$AdABConfig banner;

    /* renamed from: int  reason: not valid java name */
    private TimeoutConfigurations$AdABConfig f2int;

    /* renamed from: native  reason: not valid java name */
    private TimeoutConfigurations$AdABConfig f3native;

    public TimeoutConfigurations$ABConfig() {
        Cb.Companion.getClass();
        this.banner = new TimeoutConfigurations$AdABConfig(Cb.f(), Cb.e(), Cb.d());
        this.f2int = new TimeoutConfigurations$AdABConfig(Cb.i(), Cb.h(), Cb.g());
        this.f3native = new TimeoutConfigurations$AdABConfig(Cb.l(), Cb.k(), Cb.j());
        this.audio = new TimeoutConfigurations$AdABConfig(Cb.c(), Cb.b(), Cb.a());
    }

    public final TimeoutConfigurations$AdABConfig getAudio() {
        return this.audio;
    }

    public final TimeoutConfigurations$AdABConfig getBanner() {
        return this.banner;
    }

    public final TimeoutConfigurations$AdABConfig getInterstitial() {
        return this.f2int;
    }

    public final TimeoutConfigurations$AdABConfig getNative() {
        return this.f3native;
    }

    public final boolean isValid() {
        if (this.banner.isValid() && this.f2int.isValid() && this.f3native.isValid() && this.audio.isValid()) {
            return true;
        }
        return false;
    }
}
