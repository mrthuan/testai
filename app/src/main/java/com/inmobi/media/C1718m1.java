package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.inmobi.media.m1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1718m1 extends AbstractC1704l1 {

    /* renamed from: a  reason: collision with root package name */
    public final BannerAdEventListener f15297a;

    public C1718m1(BannerAdEventListener adEventListener) {
        kotlin.jvm.internal.g.e(adEventListener, "adEventListener");
        this.f15297a = adEventListener;
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onAdClicked(Object obj, Map params) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(params, "params");
        this.f15297a.onAdClicked(ad2, params);
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onAdFetchSuccessful(Object obj, AdMetaInfo info) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(info, "info");
        this.f15297a.onAdFetchSuccessful(ad2, info);
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onAdImpression(Object obj) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.g.e(ad2, "ad");
        this.f15297a.onAdImpression(ad2);
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onAdLoadFailed(Object obj, InMobiAdRequestStatus status) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(status, "status");
        this.f15297a.onAdLoadFailed(ad2, status);
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onAdLoadSucceeded(Object obj, AdMetaInfo info) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(info, "info");
        this.f15297a.onAdLoadSucceeded(ad2, info);
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onImraidLog(Object obj, String data) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(data, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", BannerAdEventListener.class, InMobiBanner.class, String.class);
            kotlin.jvm.internal.g.d(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f15297a, ad2, data);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onRequestPayloadCreated(byte[] bArr) {
        this.f15297a.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.media.AbstractC1806t
    public final void onRequestPayloadCreationFailed(InMobiAdRequestStatus status) {
        kotlin.jvm.internal.g.e(status, "status");
        this.f15297a.onRequestPayloadCreationFailed(status);
    }
}
