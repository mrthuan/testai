package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.HandLongPressView;

/* compiled from: LongPressInteract.java */
/* loaded from: classes.dex */
public class ABk implements hm {
    private HandLongPressView Qhi;

    public ABk(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.ac.Sf sf2) {
        this.Qhi = new HandLongPressView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) CQU.Qhi(context, 180.0f), (int) CQU.Qhi(context, 180.0f));
        layoutParams.gravity = 17;
        this.Qhi.setLayoutParams(layoutParams);
        this.Qhi.setGuideText(sf2.Dq());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    public void Qhi() {
        this.Qhi.Qhi();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    public ViewGroup ac() {
        return this.Qhi;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    public void cJ() {
        this.Qhi.cJ();
    }
}
