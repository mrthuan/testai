package com.bytedance.sdk.openadsdk.core.ugen.component.video;

import android.content.Context;
import com.bytedance.adsdk.ugeno.component.frame.UGFrameLayout;

/* compiled from: UGVideoPlaceholderWidget.java */
/* loaded from: classes.dex */
public class Qhi extends com.bytedance.adsdk.ugeno.component.Qhi.Qhi {
    public Qhi(Context context) {
        super(context);
    }

    public UGFrameLayout MQ() {
        return ((UGVideoPlaceholderView) this.f7876fl).getVideoView();
    }

    @Override // com.bytedance.adsdk.ugeno.component.Qhi.Qhi, com.bytedance.adsdk.ugeno.component.cJ
    public void Qhi(String str, String str2) {
        super.Qhi(str, str2);
    }

    @Override // com.bytedance.adsdk.ugeno.component.Qhi.Qhi, com.bytedance.adsdk.ugeno.component.Qhi, com.bytedance.adsdk.ugeno.component.cJ
    public void cJ() {
        super.cJ();
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    /* renamed from: tP */
    public UGVideoPlaceholderView ac() {
        UGVideoPlaceholderView uGVideoPlaceholderView = new UGVideoPlaceholderView(this.cJ);
        uGVideoPlaceholderView.Qhi(this);
        return uGVideoPlaceholderView;
    }
}
