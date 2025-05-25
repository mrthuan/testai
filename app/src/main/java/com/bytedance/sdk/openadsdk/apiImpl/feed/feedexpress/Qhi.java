package com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;

/* compiled from: PAGFeedExpressVideoView.java */
/* loaded from: classes.dex */
public class Qhi extends cJ {
    public Qhi(Context context, tP tPVar, AdSlot adSlot) {
        super(context, tPVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.cJ
    public void Qhi() {
        NativeExpressVideoView nativeExpressVideoView = new NativeExpressVideoView(((cJ) this).Sf, this.cJ, ((cJ) this).f8607hm, this.Gm);
        this.WAv = nativeExpressVideoView;
        this.Qhi.Qhi(nativeExpressVideoView.getVideoController());
        ac();
    }

    public com.bytedance.sdk.openadsdk.multipro.cJ.Qhi cJ() {
        NativeExpressView nativeExpressView = this.WAv;
        if (nativeExpressView != null) {
            return ((NativeExpressVideoView) nativeExpressView).getVideoModel();
        }
        return null;
    }
}
