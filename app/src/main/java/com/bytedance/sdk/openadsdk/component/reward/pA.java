package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TTFullScreenVideoAdImpl.java */
/* loaded from: classes.dex */
public class pA implements TTClientBidding {
    private final ROR Qhi;

    public pA(Context context, com.bytedance.sdk.openadsdk.core.model.Qhi qhi) {
        this.Qhi = new ROR(context, qhi);
    }

    public ROR Qhi() {
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

    public void Qhi(boolean z10) {
        this.Qhi.Qhi(z10);
    }
}
