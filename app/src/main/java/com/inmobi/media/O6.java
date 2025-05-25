package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.NativeAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes2.dex */
public final class O6 extends N6 {

    /* renamed from: a  reason: collision with root package name */
    public final NativeAdEventListener f14540a;

    public O6(NativeAdEventListener adEventListener) {
        kotlin.jvm.internal.g.e(adEventListener, "adEventListener");
        this.f14540a = adEventListener;
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onAdClicked(Object obj, Map params) {
        InMobiNative ad2 = (InMobiNative) obj;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(params, "params");
        this.f14540a.onAdClicked(ad2, params);
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onAdFetchSuccessful(Object obj, AdMetaInfo info) {
        InMobiNative ad2 = (InMobiNative) obj;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(info, "info");
        this.f14540a.onAdFetchSuccessful(ad2, info);
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onAdImpression(Object obj) {
        InMobiNative ad2 = (InMobiNative) obj;
        kotlin.jvm.internal.g.e(ad2, "ad");
        this.f14540a.onAdImpression(ad2);
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onAdLoadFailed(Object obj, InMobiAdRequestStatus status) {
        InMobiNative ad2 = (InMobiNative) obj;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(status, "status");
        this.f14540a.onAdLoadFailed(ad2, status);
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onAdLoadSucceeded(Object obj, AdMetaInfo info) {
        InMobiNative ad2 = (InMobiNative) obj;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(info, "info");
        this.f14540a.onAdLoadSucceeded(ad2, info);
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onImraidLog(Object obj, String data) {
        InMobiNative ad2 = (InMobiNative) obj;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(data, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", NativeAdEventListener.class, InMobiNative.class, String.class);
            kotlin.jvm.internal.g.d(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f14540a, ad2, data);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onRequestPayloadCreated(byte[] bArr) {
        this.f14540a.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onRequestPayloadCreationFailed(InMobiAdRequestStatus status) {
        kotlin.jvm.internal.g.e(status, "status");
        this.f14540a.onRequestPayloadCreationFailed(status);
    }
}
