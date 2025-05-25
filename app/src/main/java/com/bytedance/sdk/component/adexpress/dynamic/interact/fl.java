package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.ClickInteractView;

/* compiled from: ClickInteract.java */
/* loaded from: classes.dex */
public class fl implements hm {
    ClickInteractView Qhi;

    public fl(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.ac.Sf sf2) {
        this.Qhi = new ClickInteractView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicBaseWidget.getDynamicHeight(), dynamicBaseWidget.getDynamicHeight());
        layoutParams.gravity = 17;
        this.Qhi.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    /* renamed from: CJ */
    public ClickInteractView ac() {
        return this.Qhi;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    public void Qhi() {
        this.Qhi.Qhi();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    public void cJ() {
        this.Qhi.cJ();
    }
}
