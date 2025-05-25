package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.DynamicUnlockView;

/* compiled from: UnlockInteract.java */
/* loaded from: classes.dex */
public class MQ implements hm<DynamicUnlockView> {
    private final DynamicUnlockView Qhi;

    public MQ(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.ac.Sf sf2) {
        int i10;
        DynamicUnlockView dynamicUnlockView = new DynamicUnlockView(context);
        this.Qhi = dynamicUnlockView;
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
        dynamicUnlockView.setLayoutParams(layoutParams);
        dynamicUnlockView.setClipChildren(false);
        dynamicUnlockView.setText(sf2.Dq());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    /* renamed from: CJ */
    public DynamicUnlockView ac() {
        return this.Qhi;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    public void Qhi() {
        DynamicUnlockView dynamicUnlockView = this.Qhi;
        if (dynamicUnlockView != null) {
            dynamicUnlockView.Qhi();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    public void cJ() {
        DynamicUnlockView dynamicUnlockView = this.Qhi;
        if (dynamicUnlockView != null) {
            dynamicUnlockView.cJ();
        }
    }
}
