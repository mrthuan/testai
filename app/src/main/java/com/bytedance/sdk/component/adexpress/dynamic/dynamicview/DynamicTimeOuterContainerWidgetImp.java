package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.CJ.Dww;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class DynamicTimeOuterContainerWidgetImp extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.ac {
    private boolean EBS;
    private int MQ;
    int Qhi;
    boolean cJ;
    private int qMt;

    public DynamicTimeOuterContainerWidgetImp(Context context, DynamicRootView dynamicRootView, hm hmVar) {
        super(context, dynamicRootView, hmVar);
        this.qMt = 0;
        setTag(Integer.valueOf(getClickArea()));
        Qhi();
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() != null && !dynamicRootView.getRenderRequest().CQU()) {
            View view = this.pA;
            if (view != null) {
                view.setVisibility(8);
            }
            setVisibility(8);
        }
    }

    private void Qhi() {
        List<hm> Gm = this.ABk.Gm();
        if (Gm == null || Gm.size() <= 0) {
            return;
        }
        Iterator<hm> it = Gm.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            hm next = it.next();
            if (TextUtils.equals("skip-with-time-skip-btn", next.WAv().cJ())) {
                int Qhi = (int) CQU.Qhi(this.Gm, next.Sf() + (com.bytedance.sdk.component.adexpress.fl.cJ() ? next.ABk() : 0));
                this.MQ = Qhi;
                this.Qhi = this.ROR - Qhi;
            }
        }
        this.qMt = this.ROR - this.Qhi;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void Tgh() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (this.cJ) {
            layoutParams.leftMargin = this.f8209hm;
        } else {
            layoutParams.leftMargin = this.f8209hm + this.qMt;
        }
        if (this.EBS && this.f8210zc != null) {
            layoutParams.leftMargin = ((this.f8209hm + this.qMt) - ((int) CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), this.f8210zc.ac()))) - ((int) CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), this.f8210zc.CJ()));
        }
        if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
            layoutParams.topMargin = this.WAv - ((int) CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), this.f8210zc.cJ()));
        } else {
            layoutParams.topMargin = this.WAv;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fl
    public boolean hm() {
        if (Dww.cJ(this.iMK.getRenderRequest().CJ())) {
            return true;
        }
        super.hm();
        setPadding((int) CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), this.f8210zc.ac()), (int) CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), this.f8210zc.cJ()), (int) CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), this.f8210zc.CJ()), (int) CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), this.f8210zc.Qhi()));
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.EBS && this.f8210zc != null) {
            setMeasuredDimension(this.MQ + ((int) CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), this.f8210zc.ac())) + ((int) CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), this.f8210zc.CJ())), this.Sf);
        } else if (this.cJ) {
            setMeasuredDimension(this.ROR, this.Sf);
        } else {
            setMeasuredDimension(this.Qhi, this.Sf);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ac
    public void Qhi(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        if (z11 && this.EBS != z11) {
            this.EBS = z11;
            Tgh();
            return;
        }
        if (z10 && this.cJ != z10) {
            this.cJ = z10;
            Tgh();
        }
        this.cJ = z10;
    }
}
