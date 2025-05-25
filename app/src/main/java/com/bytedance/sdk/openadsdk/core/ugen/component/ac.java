package com.bytedance.sdk.openadsdk.core.ugen.component;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;

/* compiled from: UGLogoWidget.java */
/* loaded from: classes.dex */
public class ac extends com.bytedance.adsdk.ugeno.component.cJ<FrameLayout> {
    public ac(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    /* renamed from: Qhi */
    public FrameLayout ac() {
        FrameLayout frameLayout = new FrameLayout(this.cJ);
        frameLayout.addView(new PAGLogoView(this.cJ));
        return frameLayout;
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    public void cJ() {
        super.cJ();
    }
}
