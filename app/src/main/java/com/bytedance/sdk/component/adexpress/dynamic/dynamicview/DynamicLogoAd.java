package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.CJ.ABk;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;
import com.bytedance.sdk.component.utils.MQ;

/* loaded from: classes.dex */
public class DynamicLogoAd extends DynamicBaseWidgetImp {
    public DynamicLogoAd(Context context, DynamicRootView dynamicRootView, hm hmVar) {
        super(context, dynamicRootView, hmVar);
        TextView textView = new TextView(context);
        this.pA = textView;
        textView.setTag(Integer.valueOf(getClickArea()));
        addView(this.pA, getWidgetLayoutParams());
    }

    private boolean Qhi() {
        if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
            return false;
        }
        if ((TextUtils.isEmpty(this.f8210zc.cJ) || !this.f8210zc.cJ.contains("adx:")) && !ABk.cJ()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fl
    public boolean hm() {
        super.hm();
        this.pA.setTextAlignment(this.f8210zc.Sf());
        ((TextView) this.pA).setTextColor(this.f8210zc.ROR());
        ((TextView) this.pA).setTextSize(this.f8210zc.fl());
        if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
            ((TextView) this.pA).setIncludeFontPadding(false);
            ((TextView) this.pA).setTextSize(Math.min(((CQU.cJ(com.bytedance.sdk.component.adexpress.fl.Qhi(), this.Sf) - this.f8210zc.cJ()) - this.f8210zc.Qhi()) - 0.5f, this.f8210zc.fl()));
            ((TextView) this.pA).setText(MQ.Qhi(getContext(), "tt_logo_en"));
            return true;
        } else if (Qhi()) {
            if (ABk.cJ()) {
                ((TextView) this.pA).setText(ABk.Qhi());
                return true;
            }
            ((TextView) this.pA).setText(ABk.Qhi(this.f8210zc.cJ));
            return true;
        } else {
            ((TextView) this.pA).setText(MQ.cJ(getContext(), "tt_logo_cn"));
            return true;
        }
    }
}
