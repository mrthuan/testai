package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.ac.Sf;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;

/* loaded from: classes.dex */
public class DynamicPrivacyView extends DynamicBaseWidgetImp {
    private TextView EBS;
    private TextView MQ;
    private TextView Qhi;
    private LinearLayout bxS;
    private TextView cJ;
    private TextView qMt;

    public DynamicPrivacyView(Context context, DynamicRootView dynamicRootView, hm hmVar) {
        super(context, dynamicRootView, hmVar);
        this.Qhi = new TextView(this.Gm);
        this.cJ = new TextView(this.Gm);
        this.MQ = new TextView(this.Gm);
        this.bxS = new LinearLayout(this.Gm);
        this.qMt = new TextView(this.Gm);
        this.EBS = new TextView(this.Gm);
        this.Qhi.setTag(9);
        this.cJ.setTag(10);
        this.MQ.setTag(12);
        this.bxS.addView(this.MQ);
        this.bxS.addView(this.EBS);
        this.bxS.addView(this.cJ);
        this.bxS.addView(this.qMt);
        this.bxS.addView(this.Qhi);
        addView(this.bxS, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public boolean CJ() {
        this.Qhi.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.Qhi.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.cJ.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.cJ.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.MQ.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.MQ.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.ROR, this.Sf);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fl
    public boolean hm() {
        this.MQ.setText("Function");
        this.cJ.setText("Permission list");
        this.qMt.setText(" | ");
        this.EBS.setText(" | ");
        this.Qhi.setText("Privacy policy");
        Sf sf2 = this.f8210zc;
        if (sf2 != null) {
            this.MQ.setTextColor(sf2.ROR());
            this.MQ.setTextSize(this.f8210zc.fl());
            this.cJ.setTextColor(this.f8210zc.ROR());
            this.cJ.setTextSize(this.f8210zc.fl());
            this.qMt.setTextColor(this.f8210zc.ROR());
            this.EBS.setTextColor(this.f8210zc.ROR());
            this.Qhi.setTextColor(this.f8210zc.ROR());
            this.Qhi.setTextSize(this.f8210zc.fl());
            return false;
        }
        this.MQ.setTextColor(-1);
        this.MQ.setTextSize(12.0f);
        this.cJ.setTextColor(-1);
        this.cJ.setTextSize(12.0f);
        this.qMt.setTextColor(-1);
        this.EBS.setTextColor(-1);
        this.Qhi.setTextColor(-1);
        this.Qhi.setTextSize(12.0f);
        return false;
    }
}
