package com.inmobi.ads.listeners;

import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.media.AbstractC1806t;
import java.util.Map;
import kotlin.jvm.internal.g;

/* loaded from: classes2.dex */
public abstract class AudioAdEventListener extends AbstractC1806t {
    public void onAdDismissed(InMobiAudio ad2) {
        g.e(ad2, "ad");
    }

    public void onAdDisplayFailed(InMobiAudio ad2) {
        g.e(ad2, "ad");
    }

    public void onAdDisplayed(InMobiAudio ad2) {
        g.e(ad2, "ad");
    }

    public void onAdFetchFailed(InMobiAudio ad2, InMobiAdRequestStatus status) {
        g.e(ad2, "ad");
        g.e(status, "status");
    }

    public void onAudioStatusChanged(InMobiAudio ad2, AudioStatus audioStatus) {
        g.e(ad2, "ad");
        g.e(audioStatus, "audioStatus");
    }

    public void onRewardsUnlocked(InMobiAudio ad2, Map<Object, ? extends Object> rewards) {
        g.e(ad2, "ad");
        g.e(rewards, "rewards");
    }

    public void onUserLeftApplication(InMobiAudio ad2) {
        g.e(ad2, "ad");
    }
}
