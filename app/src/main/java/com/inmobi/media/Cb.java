package com.inmobi.media;

import com.inmobi.unification.sdk.model.Initialization.TimeoutConfigurations$MediationConfig;
import java.io.Serializable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Cb implements Serializable {
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;
    private static final int DEFAULT_AB_AUDIO_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_BANNER_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_AB_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_MAX_RETRIES = 3;
    private static final int DEFAULT_NONAB_AUDIO_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_AUDIO_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_RETRY_INTERVAL = 1000;
    public static final int DEFAULT_TIMEOUT = 15000;
    public static final Ab Companion = new Ab();
    private static final String DEFAULT_KEY = "default";
    private static final String APPLOVIN_KEY = "c_applovin";
    private static final JSONObject defaultNonABBannerloadTimeout = H9.a(DEFAULT_KEY, 29500, APPLOVIN_KEY, 9500);
    private static final JSONObject defaultNonABBannerMuttTimeout = H9.a(DEFAULT_KEY, 29500, APPLOVIN_KEY, 9500);
    private static final JSONObject defaultNonABBannerMaxRetries = H9.a(DEFAULT_KEY, 3, APPLOVIN_KEY, 3);
    private static final JSONObject defaultNonABBannerRetryInterval = H9.a(DEFAULT_KEY, 1000, APPLOVIN_KEY, 1000);
    private static final JSONObject defaultNonABIntloadTimeout = H9.a(DEFAULT_KEY, 29500, APPLOVIN_KEY, 14500);
    private static final JSONObject defaultNonABIntMuttTimeout = H9.a(DEFAULT_KEY, 29500, APPLOVIN_KEY, 14500);
    private static final JSONObject defaultNonABIntMaxRetries = H9.a(DEFAULT_KEY, 3, APPLOVIN_KEY, 3);
    private static final JSONObject defaultNonABIntRetryInterval = H9.a(DEFAULT_KEY, 1000, APPLOVIN_KEY, 1000);
    private static final JSONObject defaultNonABNativeloadTimeout = H9.a(DEFAULT_KEY, 29500, APPLOVIN_KEY, 14500);
    private static final JSONObject defaultNonABNativeMuttTimeout = H9.a(DEFAULT_KEY, 29500, APPLOVIN_KEY, 14500);
    private static final JSONObject defaultNonABNativeMaxRetries = H9.a(DEFAULT_KEY, 3, APPLOVIN_KEY, 3);
    private static final JSONObject defaultNonABNativeRetryInterval = H9.a(DEFAULT_KEY, 1000, APPLOVIN_KEY, 1000);
    private static final JSONObject defaultNonABAudioloadTimeout = H9.a(DEFAULT_KEY, 29500, APPLOVIN_KEY, 9500);
    private static final JSONObject defaultNonABAudioMuttTimeout = H9.a(DEFAULT_KEY, 29500, APPLOVIN_KEY, 9500);
    private static final JSONObject defaultNonABAudioMaxRetries = H9.a(DEFAULT_KEY, 3, APPLOVIN_KEY, 3);
    private static final JSONObject defaultNonABAudioRetryInterval = H9.a(DEFAULT_KEY, 1000, APPLOVIN_KEY, 1000);
    private static final JSONObject defaultABBannerloadTimeout = H9.a(DEFAULT_KEY, 14500, APPLOVIN_KEY, 9500);
    private static final JSONObject defaultABBannerMaxRetries = H9.a(DEFAULT_KEY, 3, APPLOVIN_KEY, 3);
    private static final JSONObject defaultABBannerRetryInterval = H9.a(DEFAULT_KEY, 1000, APPLOVIN_KEY, 1000);
    private static final JSONObject defaultABIntloadTimeout = H9.a(DEFAULT_KEY, 29500, APPLOVIN_KEY, 29500);
    private static final JSONObject defaultABIntMaxRetries = H9.a(DEFAULT_KEY, 3, APPLOVIN_KEY, 3);
    private static final JSONObject defaultABIntRetryInterval = H9.a(DEFAULT_KEY, 1000, APPLOVIN_KEY, 1000);
    private static final JSONObject defaultABNativeloadTimeout = H9.a(DEFAULT_KEY, 14500, APPLOVIN_KEY, 14500);
    private static final JSONObject defaultABNativeMaxRetries = H9.a(DEFAULT_KEY, 3, APPLOVIN_KEY, 3);
    private static final JSONObject defaultABNativeRetryInterval = H9.a(DEFAULT_KEY, 1000, APPLOVIN_KEY, 1000);
    private static final JSONObject defaultABAudioloadTimeout = H9.a(DEFAULT_KEY, 14500, APPLOVIN_KEY, 9500);
    private static final JSONObject defaultABAudioMaxRetries = H9.a(DEFAULT_KEY, 3, APPLOVIN_KEY, 3);
    private static final JSONObject defaultABAudioRetryInterval = H9.a(DEFAULT_KEY, 1000, APPLOVIN_KEY, 1000);
    private static final JSONObject defaultPreloadBannerPreloadTimeout = AbstractC1883yb.a(DEFAULT_KEY, 29500);
    private static final JSONObject defaultPreloadBannerMuttTimeout = AbstractC1883yb.a(DEFAULT_KEY, 29500);
    private static final JSONObject defaultPreloadBannerLoadTimeout = AbstractC1883yb.a(DEFAULT_KEY, 14500);
    private static final JSONObject defaultPreloadBannerMaxRetries = AbstractC1883yb.a(DEFAULT_KEY, 3);
    private static final JSONObject defaultPreloadBannerRetryInterval = AbstractC1883yb.a(DEFAULT_KEY, 1000);
    private static final JSONObject defaultPreloadIntPreloadTimeout = AbstractC1883yb.a(DEFAULT_KEY, 29500);
    private static final JSONObject defaultPreloadIntMuttTimeout = AbstractC1883yb.a(DEFAULT_KEY, 29500);
    private static final JSONObject defaultPreloadIntloadTimeout = AbstractC1883yb.a(DEFAULT_KEY, 29500);
    private static final JSONObject defaultPreloadIntMaxRetries = AbstractC1883yb.a(DEFAULT_KEY, 3);
    private static final JSONObject defaultPreloadIntRetryInterval = AbstractC1883yb.a(DEFAULT_KEY, 1000);
    private static final JSONObject defaultPreloadNativePreloadTimeout = AbstractC1883yb.a(DEFAULT_KEY, 29500);
    private static final JSONObject defaultPreloadNativeMuttTimeout = AbstractC1883yb.a(DEFAULT_KEY, 29500);
    private static final JSONObject defaultPreloadNativeloadTimeout = AbstractC1883yb.a(DEFAULT_KEY, 14500);
    private static final JSONObject defaultPreloadNativeMaxRetries = AbstractC1883yb.a(DEFAULT_KEY, 3);
    private static final JSONObject defaultPreloadNativeRetryInterval = AbstractC1883yb.a(DEFAULT_KEY, 1000);
    private static final JSONObject defaultPreloadAudioPreloadTimeout = AbstractC1883yb.a(DEFAULT_KEY, 29500);
    private static final JSONObject defaultPreloadAudioMuttTimeout = AbstractC1883yb.a(DEFAULT_KEY, 29500);
    private static final JSONObject defaultPreloadAudioloadTimeout = AbstractC1883yb.a(DEFAULT_KEY, 14500);
    private static final JSONObject defaultPreloadAudioMaxRetries = AbstractC1883yb.a(DEFAULT_KEY, 3);
    private static final JSONObject defaultPreloadAudioRetryInterval = AbstractC1883yb.a(DEFAULT_KEY, 1000);
    private static final cg.p<JSONObject, Integer, Boolean> validator = C1896zb.f15713a;
    private int step4s = DEFAULT_TIMEOUT;
    private TimeoutConfigurations$MediationConfig mediationConfig = new TimeoutConfigurations$MediationConfig();

    public static final /* synthetic */ JSONObject A() {
        return defaultNonABNativeRetryInterval;
    }

    public static final /* synthetic */ JSONObject B() {
        return defaultNonABNativeloadTimeout;
    }

    public static final /* synthetic */ JSONObject C() {
        return defaultPreloadAudioMaxRetries;
    }

    public static final /* synthetic */ JSONObject D() {
        return defaultPreloadAudioMuttTimeout;
    }

    public static final /* synthetic */ JSONObject E() {
        return defaultPreloadAudioPreloadTimeout;
    }

    public static final /* synthetic */ JSONObject F() {
        return defaultPreloadAudioRetryInterval;
    }

    public static final /* synthetic */ JSONObject G() {
        return defaultPreloadAudioloadTimeout;
    }

    public static final /* synthetic */ JSONObject H() {
        return defaultPreloadBannerLoadTimeout;
    }

    public static final /* synthetic */ JSONObject I() {
        return defaultPreloadBannerMaxRetries;
    }

    public static final /* synthetic */ JSONObject J() {
        return defaultPreloadBannerMuttTimeout;
    }

    public static final /* synthetic */ JSONObject K() {
        return defaultPreloadBannerPreloadTimeout;
    }

    public static final /* synthetic */ JSONObject L() {
        return defaultPreloadBannerRetryInterval;
    }

    public static final /* synthetic */ JSONObject M() {
        return defaultPreloadIntMaxRetries;
    }

    public static final /* synthetic */ JSONObject N() {
        return defaultPreloadIntMuttTimeout;
    }

    public static final /* synthetic */ JSONObject O() {
        return defaultPreloadIntPreloadTimeout;
    }

    public static final /* synthetic */ JSONObject P() {
        return defaultPreloadIntRetryInterval;
    }

    public static final /* synthetic */ JSONObject Q() {
        return defaultPreloadIntloadTimeout;
    }

    public static final /* synthetic */ JSONObject R() {
        return defaultPreloadNativeMaxRetries;
    }

    public static final /* synthetic */ JSONObject S() {
        return defaultPreloadNativeMuttTimeout;
    }

    public static final /* synthetic */ JSONObject T() {
        return defaultPreloadNativePreloadTimeout;
    }

    public static final /* synthetic */ JSONObject U() {
        return defaultPreloadNativeRetryInterval;
    }

    public static final /* synthetic */ JSONObject V() {
        return defaultPreloadNativeloadTimeout;
    }

    public static final /* synthetic */ JSONObject a() {
        return defaultABAudioMaxRetries;
    }

    public static final /* synthetic */ JSONObject b() {
        return defaultABAudioRetryInterval;
    }

    public static final /* synthetic */ JSONObject c() {
        return defaultABAudioloadTimeout;
    }

    public static final /* synthetic */ JSONObject d() {
        return defaultABBannerMaxRetries;
    }

    public static final /* synthetic */ JSONObject e() {
        return defaultABBannerRetryInterval;
    }

    public static final /* synthetic */ JSONObject f() {
        return defaultABBannerloadTimeout;
    }

    public static final /* synthetic */ JSONObject g() {
        return defaultABIntMaxRetries;
    }

    public static final /* synthetic */ JSONObject h() {
        return defaultABIntRetryInterval;
    }

    public static final /* synthetic */ JSONObject i() {
        return defaultABIntloadTimeout;
    }

    public static final /* synthetic */ JSONObject j() {
        return defaultABNativeMaxRetries;
    }

    public static final /* synthetic */ JSONObject k() {
        return defaultABNativeRetryInterval;
    }

    public static final /* synthetic */ JSONObject l() {
        return defaultABNativeloadTimeout;
    }

    public static final /* synthetic */ JSONObject m() {
        return defaultNonABAudioMaxRetries;
    }

    public static final /* synthetic */ JSONObject n() {
        return defaultNonABAudioMuttTimeout;
    }

    public static final /* synthetic */ JSONObject o() {
        return defaultNonABAudioRetryInterval;
    }

    public static final /* synthetic */ JSONObject p() {
        return defaultNonABAudioloadTimeout;
    }

    public static final /* synthetic */ JSONObject q() {
        return defaultNonABBannerMaxRetries;
    }

    public static final /* synthetic */ JSONObject r() {
        return defaultNonABBannerMuttTimeout;
    }

    public static final /* synthetic */ JSONObject s() {
        return defaultNonABBannerRetryInterval;
    }

    public static final /* synthetic */ JSONObject t() {
        return defaultNonABBannerloadTimeout;
    }

    public static final /* synthetic */ JSONObject u() {
        return defaultNonABIntMaxRetries;
    }

    public static final /* synthetic */ JSONObject v() {
        return defaultNonABIntMuttTimeout;
    }

    public static final /* synthetic */ JSONObject w() {
        return defaultNonABIntRetryInterval;
    }

    public static final /* synthetic */ JSONObject x() {
        return defaultNonABIntloadTimeout;
    }

    public static final /* synthetic */ JSONObject y() {
        return defaultNonABNativeMaxRetries;
    }

    public static final /* synthetic */ JSONObject z() {
        return defaultNonABNativeMuttTimeout;
    }

    public final TimeoutConfigurations$MediationConfig X() {
        return this.mediationConfig;
    }

    public final int Y() {
        return this.step4s;
    }

    public final boolean Z() {
        if (Y() >= 0 && this.mediationConfig.isValid()) {
            return true;
        }
        return false;
    }

    public final void a0() {
        int i10 = this.step4s;
        if (i10 <= 0) {
            i10 = DEFAULT_TIMEOUT;
        }
        this.step4s = i10;
    }
}
