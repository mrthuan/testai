package com.inmobi.unification.sdk.model.Initialization;

import androidx.annotation.Keep;
import com.inmobi.media.Cb;

@Keep
/* loaded from: classes2.dex */
public final class TimeoutConfigurations$PreloadConfig {
    private TimeoutConfigurations$AdPreloadConfig audio;
    private TimeoutConfigurations$AdPreloadConfig banner;

    /* renamed from: int  reason: not valid java name */
    private TimeoutConfigurations$AdPreloadConfig f6int;

    /* renamed from: native  reason: not valid java name */
    private TimeoutConfigurations$AdPreloadConfig f7native;

    public TimeoutConfigurations$PreloadConfig() {
        Cb.Companion.getClass();
        this.banner = new TimeoutConfigurations$AdPreloadConfig(Cb.K(), Cb.J(), Cb.H(), Cb.L(), Cb.I());
        this.f6int = new TimeoutConfigurations$AdPreloadConfig(Cb.O(), Cb.N(), Cb.Q(), Cb.P(), Cb.M());
        this.f7native = new TimeoutConfigurations$AdPreloadConfig(Cb.T(), Cb.S(), Cb.V(), Cb.U(), Cb.R());
        this.audio = new TimeoutConfigurations$AdPreloadConfig(Cb.E(), Cb.D(), Cb.G(), Cb.F(), Cb.C());
    }

    public final TimeoutConfigurations$AdPreloadConfig getAudio() {
        return this.audio;
    }

    public final TimeoutConfigurations$AdPreloadConfig getBanner() {
        return this.banner;
    }

    public final TimeoutConfigurations$AdPreloadConfig getInterstitial() {
        return this.f6int;
    }

    public final TimeoutConfigurations$AdPreloadConfig getNative() {
        return this.f7native;
    }

    public final boolean isValid() {
        if (this.banner.isValid() && this.f6int.isValid() && this.f7native.isValid() && this.audio.isValid()) {
            return true;
        }
        return false;
    }
}
