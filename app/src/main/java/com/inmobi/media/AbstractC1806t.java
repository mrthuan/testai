package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;

/* renamed from: com.inmobi.media.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1806t {
    public void onAdClicked(Object obj, Map<Object, ? extends Object> params) {
        kotlin.jvm.internal.g.e(params, "params");
    }

    public void onAdFetchSuccessful(Object obj, AdMetaInfo info) {
        kotlin.jvm.internal.g.e(info, "info");
    }

    public void onAdLoadFailed(Object obj, InMobiAdRequestStatus status) {
        kotlin.jvm.internal.g.e(status, "status");
    }

    public void onAdLoadSucceeded(Object obj, AdMetaInfo info) {
        kotlin.jvm.internal.g.e(info, "info");
    }

    public void onImraidLog(Object obj, String data) {
        kotlin.jvm.internal.g.e(data, "data");
    }

    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus status) {
        kotlin.jvm.internal.g.e(status, "status");
    }

    public void onAdImpression(Object obj) {
    }

    public void onRequestPayloadCreated(byte[] bArr) {
    }
}
