package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.DynamicLottieView;
import com.bytedance.sdk.component.utils.pM;

/* compiled from: LightInteract.java */
/* loaded from: classes.dex */
public class zc implements hm<ViewGroup> {
    private final DynamicLottieView Qhi;
    private final FrameLayout cJ;

    public zc(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.ac.Sf sf2, String str, String str2) {
        int i10;
        DynamicLottieView dynamicLottieView = new DynamicLottieView(context);
        this.Qhi = dynamicLottieView;
        dynamicLottieView.setImageLottieTosPath(str);
        FrameLayout frameLayout = new FrameLayout(context);
        this.cJ = frameLayout;
        frameLayout.addView(dynamicLottieView, new FrameLayout.LayoutParams(-2, -2));
        double oU = sf2.oU();
        oU = oU == 0.0d ? 1.0d : oU;
        double pv = sf2.pv();
        double d10 = pv != 0.0d ? pv : 1.0d;
        if ("22".equals(str2)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) CQU.Qhi(context, 250.0f));
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = (int) CQU.Qhi(context, 120.0f);
            frameLayout.setLayoutParams(layoutParams);
        } else if ("20".equals(str2)) {
            Qhi(context, frameLayout, sf2);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 81;
            if (sf2.dIT() > 0) {
                i10 = sf2.dIT();
            } else if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
                i10 = 0;
            } else {
                i10 = 120;
            }
            layoutParams2.bottomMargin = (int) CQU.Qhi(context, i10);
            frameLayout.setLayoutParams(layoutParams2);
            frameLayout.setClipChildren(false);
        } else {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (dynamicBaseWidget.getDynamicWidth() * 0.32d * oU), (int) (dynamicBaseWidget.getDynamicWidth() * 0.32d * d10));
            layoutParams3.gravity = 17;
            frameLayout.setLayoutParams(layoutParams3);
        }
    }

    private void Qhi(Context context, FrameLayout frameLayout, com.bytedance.sdk.component.adexpress.dynamic.ac.Sf sf2) {
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, -pM.Qhi(context, 5.0f), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(context.getString(com.bytedance.sdk.component.utils.MQ.cJ(context, "tt_splash_brush_mask_title")));
        textView.setTextColor(-1);
        textView.setTextSize(2, 20.0f);
        TextView textView2 = new TextView(context);
        textView2.setId(2097610738);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, pM.Qhi(context, 5.0f), 0, 0);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(context.getString(com.bytedance.sdk.component.utils.MQ.cJ(context, "tt_splash_brush_mask_hint")));
        if (sf2 != null && !TextUtils.isEmpty(sf2.Dq())) {
            textView2.setText(sf2.Dq());
        }
        textView2.setTextColor(-1);
        textView2.setTextSize(2, 14.0f);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        frameLayout.addView(linearLayout);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    public ViewGroup ac() {
        return this.cJ;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    public void cJ() {
        this.Qhi.CJ();
        ViewParent parent = this.cJ.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.cJ);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    public void Qhi() {
        this.Qhi.Tgh();
    }
}
