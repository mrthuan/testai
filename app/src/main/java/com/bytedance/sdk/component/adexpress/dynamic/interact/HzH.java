package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.SlideRightView;

/* compiled from: SlideRightInteract.java */
/* loaded from: classes.dex */
public class HzH implements hm {
    private com.bytedance.sdk.component.adexpress.dynamic.ac.Sf CJ;
    private SlideRightView Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private DynamicBaseWidget f8217ac;
    private Context cJ;

    public HzH(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.ac.Sf sf2) {
        this.cJ = context;
        this.f8217ac = dynamicBaseWidget;
        this.CJ = sf2;
        CJ();
    }

    private void CJ() {
        this.Qhi = new SlideRightView(this.cJ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) CQU.Qhi(this.cJ, 120.0f));
        layoutParams.gravity = 17;
        this.Qhi.setLayoutParams(layoutParams);
        this.Qhi.setClipChildren(false);
        this.Qhi.setGuideText(this.CJ.Dq());
        DynamicBaseWidget dynamicBaseWidget = this.f8217ac;
        if (dynamicBaseWidget != null) {
            this.Qhi.setOnClickListener((View.OnClickListener) dynamicBaseWidget.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    public void Qhi() {
        SlideRightView slideRightView = this.Qhi;
        if (slideRightView != null) {
            slideRightView.Qhi();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    public ViewGroup ac() {
        return this.Qhi;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    public void cJ() {
        SlideRightView slideRightView = this.Qhi;
        if (slideRightView != null) {
            slideRightView.cJ();
        }
    }
}
