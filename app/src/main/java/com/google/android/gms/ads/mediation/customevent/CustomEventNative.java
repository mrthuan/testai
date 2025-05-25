package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@Deprecated
/* loaded from: classes.dex */
public interface CustomEventNative extends CustomEvent {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, CustomEventNativeListener customEventNativeListener, String str, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle);
}
