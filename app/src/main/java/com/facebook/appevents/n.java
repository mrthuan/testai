package com.facebook.appevents;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;

/* compiled from: AppEventsManager.kt */
/* loaded from: classes.dex */
public final class n implements FetchedAppSettingsManager.a {
    @Override // com.facebook.internal.FetchedAppSettingsManager.a
    public final void onSuccess() {
        FeatureManager.a(new t5.f(1), FeatureManager.Feature.AAM);
        FeatureManager.a(new ha.n(1), FeatureManager.Feature.RestrictiveDataFiltering);
        FeatureManager.a(new t5.f(2), FeatureManager.Feature.PrivacyProtection);
        FeatureManager.a(new t5.g(2), FeatureManager.Feature.EventDeactivation);
        FeatureManager.a(new u0.a(3), FeatureManager.Feature.BannedParamFiltering);
        FeatureManager.a(new m(1), FeatureManager.Feature.IapLogging);
        FeatureManager.a(new t5.i(2), FeatureManager.Feature.StdParamEnforcement);
        FeatureManager.a(new t5.e(2), FeatureManager.Feature.ProtectedMode);
        FeatureManager.a(new ha.n(2), FeatureManager.Feature.MACARuleMatching);
        FeatureManager.a(new t5.f(3), FeatureManager.Feature.BlocklistEvents);
        FeatureManager.a(new t5.g(1), FeatureManager.Feature.FilterRedactedEvents);
        FeatureManager.a(new u0.a(2), FeatureManager.Feature.FilterSensitiveParams);
        FeatureManager.a(new m(0), FeatureManager.Feature.CloudBridge);
        FeatureManager.a(new t5.i(1), FeatureManager.Feature.GPSARATriggers);
        FeatureManager.a(new t5.e(1), FeatureManager.Feature.GPSPACAProcessing);
    }

    @Override // com.facebook.internal.FetchedAppSettingsManager.a
    public final void a() {
    }
}
