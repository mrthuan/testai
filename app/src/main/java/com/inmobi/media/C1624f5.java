package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.inmobi.media.f5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1624f5 extends AbstractC1610e5 {

    /* renamed from: a  reason: collision with root package name */
    public final InterstitialAdEventListener f15048a;

    public C1624f5(InterstitialAdEventListener adEventListener) {
        kotlin.jvm.internal.g.e(adEventListener, "adEventListener");
        this.f15048a = adEventListener;
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onAdClicked(Object obj, Map params) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(params, "params");
        this.f15048a.onAdClicked(ad2, params);
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onAdFetchSuccessful(Object obj, AdMetaInfo info) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(info, "info");
        this.f15048a.onAdFetchSuccessful(ad2, info);
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onAdImpression(Object obj) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.g.e(ad2, "ad");
        this.f15048a.onAdImpression(ad2);
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onAdLoadFailed(Object obj, InMobiAdRequestStatus status) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(status, "status");
        this.f15048a.onAdLoadFailed(ad2, status);
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onAdLoadSucceeded(Object obj, AdMetaInfo info) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(info, "info");
        this.f15048a.onAdLoadSucceeded(ad2, info);
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onImraidLog(Object obj, String data) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(data, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", InterstitialAdEventListener.class, InMobiInterstitial.class, String.class);
            kotlin.jvm.internal.g.d(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f15048a, ad2, data);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onRequestPayloadCreated(byte[] bArr) {
        this.f15048a.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onRequestPayloadCreationFailed(InMobiAdRequestStatus status) {
        kotlin.jvm.internal.g.e(status, "status");
        this.f15048a.onRequestPayloadCreationFailed(status);
    }
}
