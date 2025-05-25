package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.ClickSlideUpView;
import com.bytedance.sdk.component.adexpress.widget.SlideUpView;

/* compiled from: ClickSlideUpInteract.java */
/* loaded from: classes.dex */
public class Tgh extends tP<ClickSlideUpView> {
    public Tgh(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.ac.Sf sf2) {
        super(context, dynamicBaseWidget, sf2);
        Qhi(sf2);
    }

    private void Qhi(com.bytedance.sdk.component.adexpress.dynamic.ac.Sf sf2) {
        this.Qhi = new ClickSlideUpView(this.cJ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) CQU.Qhi(this.cJ, sf2.dIT());
        this.Qhi.setLayoutParams(layoutParams);
        this.Qhi.setSlideText(this.CJ.Dq());
        SlideUpView slideUpView = this.Qhi;
        if (slideUpView instanceof ClickSlideUpView) {
            ((ClickSlideUpView) slideUpView).setButtonText(this.CJ.WAv());
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
