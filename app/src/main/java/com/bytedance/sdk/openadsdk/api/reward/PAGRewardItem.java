package com.bytedance.sdk.openadsdk.api.reward;

/* loaded from: classes.dex */
public class PAGRewardItem {
    private final int Qhi;
    private final String cJ;

    public PAGRewardItem(int i10, String str) {
        this.Qhi = i10;
        this.cJ = str;
    }

    public int getRewardAmount() {
        return this.Qhi;
    }

    public String getRewardName() {
        return this.cJ;
    }
}
