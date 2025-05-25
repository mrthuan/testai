package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.tP;

/* compiled from: PAGBannerVideoAdImpl.java */
/* loaded from: classes.dex */
public class ac extends Qhi {
    public ac(Context context, tP tPVar, AdSlot adSlot) {
        super(context, tPVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.Qhi
    public void Qhi(Context context, tP tPVar, AdSlot adSlot) {
        BannerExpressVideoView bannerExpressVideoView = new BannerExpressVideoView(context, tPVar, adSlot);
        this.Qhi = bannerExpressVideoView;
        bannerExpressVideoView.addOnAttachStateChangeListener(this.Tgh);
    }

    public com.bytedance.sdk.openadsdk.multipro.cJ.Qhi ac() {
        BannerExpressView bannerExpressView = this.Qhi;
        if (bannerExpressView != null) {
            return ((BannerExpressVideoView) bannerExpressView).getVideoModel();
        }
        return null;
    }
}
