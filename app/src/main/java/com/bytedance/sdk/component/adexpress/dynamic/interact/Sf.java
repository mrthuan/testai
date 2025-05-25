package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.ClickSlideUpShakeView;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import com.bytedance.sdk.component.adexpress.widget.ShakeClickView;
import com.bytedance.sdk.component.adexpress.widget.SlideUpView;
import org.json.JSONObject;

/* compiled from: ClickSlideUpShakeInteract.java */
/* loaded from: classes.dex */
public class Sf extends tP<ClickSlideUpShakeView> {
    public Sf(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.ac.Sf sf2, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context, dynamicBaseWidget, sf2);
        this.cJ = context;
        this.CJ = sf2;
        this.f8249ac = dynamicBaseWidget;
        Qhi(i10, i11, i12, jSONObject, sf2);
    }

    private void Qhi(int i10, int i11, int i12, JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.ac.Sf sf2) {
        int i13;
        this.Qhi = new ClickSlideUpShakeView(this.cJ, i10, i11, i12, jSONObject);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) CQU.Qhi(this.cJ, 300.0f));
        layoutParams.gravity = 81;
        Context context = this.cJ;
        if (sf2.dIT() > 0) {
            i13 = sf2.dIT();
        } else if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
            i13 = 0;
        } else {
            i13 = 120;
        }
        layoutParams.bottomMargin = (int) CQU.Qhi(context, i13);
        this.Qhi.setLayoutParams(layoutParams);
        this.Qhi.setClipChildren(false);
        this.Qhi.setSlideText(this.CJ.Dq());
        SlideUpView slideUpView = this.Qhi;
        if (slideUpView instanceof ClickSlideUpShakeView) {
            ((ClickSlideUpShakeView) slideUpView).setShakeText(this.CJ.NBs());
            final ShakeClickView shakeView = ((ClickSlideUpShakeView) this.Qhi).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new ShakeAnimationView.Qhi() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.Sf.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.f8249ac.getDynamicClickListener());
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.tP
    public void CJ() {
    }
}
