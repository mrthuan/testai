package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import a6.h;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.CJ.tP;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;

/* loaded from: classes.dex */
public class DynamicVideoView extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.Tgh {
    boolean MQ;
    TextView Qhi;
    FrameLayout cJ;

    public DynamicVideoView(Context context, DynamicRootView dynamicRootView, hm hmVar) {
        super(context, dynamicRootView, hmVar);
        this.MQ = false;
        View view = new View(context);
        this.pA = view;
        view.setTag(Integer.valueOf(getClickArea()));
        this.Qhi = new TextView(context);
        this.cJ = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) CQU.Qhi(context, 40.0f), (int) CQU.Qhi(context, 15.0f));
        layoutParams.gravity = 8388693;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.Qhi.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.Qhi.setBackground(gradientDrawable);
        this.Qhi.setTextSize(10.0f);
        this.Qhi.setGravity(17);
        this.Qhi.setTextColor(-1);
        this.Qhi.setVisibility(8);
        if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
            addView(this.cJ, new FrameLayout.LayoutParams(-1, -1));
        }
        addView(this.Qhi);
        addView(this.pA, getWidgetLayoutParams());
        if (!com.bytedance.sdk.component.adexpress.fl.cJ()) {
            addView(this.cJ, getWidgetLayoutParams());
        }
        dynamicRootView.f8211ac = this.cJ;
        dynamicRootView.setVideoListener(this);
    }

    private void ac(View view) {
        if (view == this.Qhi || view == ((DynamicBaseWidgetImp) this).tP) {
            return;
        }
        try {
            if (((Integer) view.getTag(com.bytedance.sdk.component.adexpress.dynamic.Qhi.Tgh)).intValue() == 1) {
                return;
            }
        } catch (Throwable unused) {
        }
        int i10 = 0;
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i10 < viewGroup.getChildCount()) {
                ac(viewGroup.getChildAt(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Tgh
    public void Qhi() {
        this.Qhi.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public boolean fl() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fl
    public boolean hm() {
        super.hm();
        double d10 = 0.0d;
        double d11 = 0.0d;
        for (hm hmVar = this.ABk; hmVar != null; hmVar = hmVar.zc()) {
            d11 = (d11 + hmVar.Tgh()) - hmVar.CJ();
            d10 = (d10 + hmVar.ROR()) - hmVar.fl();
        }
        try {
            float f10 = (float) d11;
            int Qhi = (int) CQU.Qhi(getContext(), f10);
            int Qhi2 = (int) CQU.Qhi(getContext(), f10 + this.f8208fl);
            if (tP.Qhi(getContext())) {
                int dynamicWidth = ((DynamicRoot) this.iMK.getChildAt(0)).getDynamicWidth();
                int i10 = dynamicWidth - Qhi2;
                Qhi2 = dynamicWidth - Qhi;
                Qhi = i10;
            }
            if (!"open_ad".equals(this.iMK.getRenderRequest().CJ())) {
                float f11 = (float) d10;
                ((DynamicRoot) this.iMK.getChildAt(0)).Qhi.Qhi(Qhi, (int) CQU.Qhi(getContext(), f11), Qhi2, (int) CQU.Qhi(getContext(), f11 + this.Tgh));
            } else {
                this.iMK.f8211ac = this.cJ;
            }
        } catch (Exception unused) {
        }
        this.iMK.Qhi(d11, d10, this.f8208fl, this.Tgh, this.f8210zc.pA());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Tgh
    public void setTimeUpdate(int i10) {
        String str;
        String str2;
        if (this.ABk.WAv().fl().eG() && i10 > 0 && !this.MQ) {
            if (i10 >= 60) {
                str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES + (i10 / 60);
            } else {
                str = "00";
            }
            String c = h.c(str, ":");
            int i11 = i10 % 60;
            if (i11 > 9) {
                str2 = c + i11;
            } else {
                str2 = c + PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES + i11;
            }
            this.Qhi.setText(str2);
            this.Qhi.setVisibility(0);
            return;
        }
        this.MQ = true;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            ac(getChildAt(i12));
        }
        this.Qhi.setVisibility(8);
    }
}
