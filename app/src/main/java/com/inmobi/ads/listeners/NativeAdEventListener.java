package com.inmobi.ads.listeners;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class NativeAdEventListener extends AdEventListener<InMobiNative> {
    public void onAdClicked(InMobiNative inMobiNative) {
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdFetchSuccessful(InMobiNative inMobiNative, AdMetaInfo adMetaInfo) {
        super.onAdFetchSuccessful(inMobiNative, adMetaInfo);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdImpression(InMobiNative inMobiNative) {
        super.onAdImpression(inMobiNative);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdLoadFailed(InMobiNative inMobiNative, InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.onAdLoadFailed(inMobiNative, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdLoadSucceeded(InMobiNative inMobiNative, AdMetaInfo adMetaInfo) {
        super.onAdLoadSucceeded(inMobiNative, adMetaInfo);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onRequestPayloadCreated(byte[] bArr) {
        super.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdClicked(InMobiNative inMobiNative, Map map) {
        super.onAdClicked(inMobiNative, map);
    }

    public void onAdFullScreenDismissed(InMobiNative inMobiNative) {
    }

    public void onAdFullScreenDisplayed(InMobiNative inMobiNative) {
    }

    public void onAdFullScreenWillDisplay(InMobiNative inMobiNative) {
    }

    @Deprecated
    public void onAdImpressed(InMobiNative inMobiNative) {
    }

    public void onAdStatusChanged(InMobiNative inMobiNative) {
    }

    public void onUserWillLeaveApplication(InMobiNative inMobiNative) {
    }
}
