package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.AnimationButton;

/* loaded from: classes.dex */
public class DynamicButton extends DynamicBaseWidgetImp {
    public DynamicButton(Context context, DynamicRootView dynamicRootView, hm hmVar) {
        super(context, dynamicRootView, hmVar);
        AnimationButton animationButton = new AnimationButton(context);
        this.pA = animationButton;
        animationButton.setTag(Integer.valueOf(getClickArea()));
        addView(this.pA, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (com.bytedance.sdk.component.adexpress.fl.cJ() && "fillButton".equals(this.ABk.WAv().cJ())) {
            ((TextView) this.pA).setEllipsize(TextUtils.TruncateAt.END);
            ((TextView) this.pA).setMaxLines(1);
            FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
            widgetLayoutParams.width -= this.f8210zc.kYc() * 2;
            widgetLayoutParams.height -= this.f8210zc.kYc() * 2;
            widgetLayoutParams.topMargin = this.f8210zc.kYc() + widgetLayoutParams.topMargin;
            int kYc = this.f8210zc.kYc() + widgetLayoutParams.leftMargin;
            widgetLayoutParams.leftMargin = kYc;
            widgetLayoutParams.setMarginStart(kYc);
            widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
            return widgetLayoutParams;
        }
        return super.getWidgetLayoutParams();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fl
    public boolean hm() {
        super.hm();
        if (TextUtils.equals("download-progress-button", this.ABk.WAv().cJ()) && TextUtils.isEmpty(this.f8210zc.WAv())) {
            this.pA.setVisibility(4);
            return true;
        }
        this.pA.setTextAlignment(this.f8210zc.Sf());
        ((TextView) this.pA).setText(this.f8210zc.WAv());
        ((TextView) this.pA).setTextColor(this.f8210zc.ROR());
        ((TextView) this.pA).setTextSize(this.f8210zc.fl());
        ((TextView) this.pA).setGravity(17);
        ((TextView) this.pA).setIncludeFontPadding(false);
        if ("fillButton".equals(this.ABk.WAv().cJ())) {
            this.pA.setPadding(0, 0, 0, 0);
        } else {
            this.pA.setPadding(this.f8210zc.ac(), this.f8210zc.cJ(), this.f8210zc.CJ(), this.f8210zc.Qhi());
        }
        return true;
    }
}
