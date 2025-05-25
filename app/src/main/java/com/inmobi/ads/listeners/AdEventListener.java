package com.inmobi.ads.listeners;

import androidx.annotation.Keep;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;

@Keep
/* loaded from: classes2.dex */
abstract class AdEventListener<T> {
    public void onAdImpression(T t4) {
    }

    public void onRequestPayloadCreated(byte[] bArr) {
    }

    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    public void onAdClicked(T t4, Map<Object, Object> map) {
    }

    public void onAdFetchSuccessful(T t4, AdMetaInfo adMetaInfo) {
    }

    public void onAdLoadFailed(T t4, InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    public void onAdLoadSucceeded(T t4, AdMetaInfo adMetaInfo) {
    }
}
