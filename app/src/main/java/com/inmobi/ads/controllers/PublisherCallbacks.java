package com.inmobi.ads.controllers;

import androidx.annotation.Keep;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C1780qb;
import com.inmobi.media.C1842v9;
import com.inmobi.media.EnumC1648h1;
import java.util.Map;
import kotlin.jvm.internal.g;

@Keep
/* loaded from: classes2.dex */
public abstract class PublisherCallbacks {
    public static final C1842v9 Companion = new C1842v9();
    public static final byte NORMAL_FLOW = 0;
    public static final byte PRELOAD_FLOW = 1;

    public abstract byte getType();

    public abstract void onAdClicked(Map<Object, ? extends Object> map);

    public abstract void onAdDismissed();

    public abstract void onAdDisplayed(AdMetaInfo adMetaInfo);

    public abstract void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus);

    public void onAdFetchSuccessful(AdMetaInfo info) {
        g.e(info, "info");
    }

    public abstract void onAdLoadFailed(InMobiAdRequestStatus inMobiAdRequestStatus);

    public abstract void onAdLoadSucceeded(AdMetaInfo adMetaInfo);

    public void onAudioStatusChanged(EnumC1648h1 audioStatusInternal) {
        g.e(audioStatusInternal, "audioStatusInternal");
    }

    public void onImraidLog(String log) {
        g.e(log, "log");
    }

    public abstract void onRequestPayloadCreated(byte[] bArr);

    public abstract void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus);

    public void onRewardsUnlocked(Map<Object, ? extends Object> rewards) {
        g.e(rewards, "rewards");
    }

    public abstract void onUserLeftApplication();

    public void onAdDisplayFailed() {
    }

    public void onAdImpressed() {
    }

    public void onAdWillDisplay() {
    }

    public void onVideoCompleted() {
    }

    public void onVideoSkipped() {
    }

    public void onAdImpression(C1780qb c1780qb) {
    }

    public void onAudioStateChanged(boolean z10) {
    }
}
