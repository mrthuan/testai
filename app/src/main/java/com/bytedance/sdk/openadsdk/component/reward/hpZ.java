package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TTRewardVideoAdImpl.java */
/* loaded from: classes.dex */
public class hpZ implements TTClientBidding {
    private final hm Qhi;

    public hpZ(Context context, com.bytedance.sdk.openadsdk.core.model.Qhi qhi, AdSlot adSlot) {
        this.Qhi = new hm(context, qhi, adSlot);
    }

    public hm Qhi() {
        return this.Qhi;
    }

    public void cJ() {
        this.Qhi.Qhi();
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d10, String str, String str2) {
        this.Qhi.loss(d10, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d10) {
        this.Qhi.win(d10);
    }
}
