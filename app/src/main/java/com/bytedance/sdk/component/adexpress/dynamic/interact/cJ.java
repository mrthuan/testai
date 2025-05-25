package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView;

/* compiled from: BrushMaskInteract.java */
/* loaded from: classes.dex */
public class cJ implements hm<DynamicBrushMaskView> {
    private DynamicBrushMaskView Qhi;

    public cJ(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.ac.Sf sf2) {
        int i10;
        this.Qhi = new DynamicBrushMaskView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        if (sf2.dIT() > 0) {
            i10 = sf2.dIT();
        } else if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
            i10 = 0;
        } else {
            i10 = 120;
        }
        layoutParams.bottomMargin = (int) CQU.Qhi(context, i10);
        this.Qhi.setLayoutParams(layoutParams);
        this.Qhi.setClipChildren(false);
        this.Qhi.setBrushText(sf2.Dq());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    /* renamed from: CJ */
    public DynamicBrushMaskView ac() {
        return this.Qhi;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    public void cJ() {
        DynamicBrushMaskView dynamicBrushMaskView = this.Qhi;
        if (dynamicBrushMaskView != null) {
            dynamicBrushMaskView.cJ();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    public void Qhi() {
    }
}
