package com.google.ads.mediation.facebook;

import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: classes.dex */
public class FacebookReward implements RewardItem {
    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return 1;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public String getType() {
        return "";
    }
}
