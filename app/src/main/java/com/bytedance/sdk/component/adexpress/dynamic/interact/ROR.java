package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.ClickSlideUpView;
import com.bytedance.sdk.component.adexpress.widget.ClickSlideUpView2;
import com.bytedance.sdk.component.adexpress.widget.SlideUpView;

/* compiled from: ClickSlideUpInteract2.java */
/* loaded from: classes.dex */
public class ROR extends tP<ClickSlideUpView> {
    public ROR(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.ac.Sf sf2) {
        super(context, dynamicBaseWidget, sf2);
        Qhi(sf2);
    }

    private void Qhi(com.bytedance.sdk.component.adexpress.dynamic.ac.Sf sf2) {
        this.Qhi = new ClickSlideUpView2(this.cJ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 81;
        this.Qhi.setLayoutParams(layoutParams);
        SlideUpView slideUpView = this.Qhi;
        if (slideUpView instanceof ClickSlideUpView2) {
            ((ClickSlideUpView2) slideUpView).setButtonText(this.CJ.Dq());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.tP, com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    public void cJ() {
        this.Qhi.cJ();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.tP, com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    public void Qhi() {
        this.Qhi.Qhi();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.tP
    public void CJ() {
    }
}
