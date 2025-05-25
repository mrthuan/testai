package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public interface RewardedVideoAdListener extends AdListener {
    void onRewardedVideoClosed();

    void onRewardedVideoCompleted();
}
