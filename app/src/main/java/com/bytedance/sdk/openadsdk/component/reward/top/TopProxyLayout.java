package com.bytedance.sdk.openadsdk.component.reward.top;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.iMK;

/* loaded from: classes.dex */
public class TopProxyLayout extends View implements Qhi<TopProxyLayout> {
    private Qhi<TopProxyLayout> Qhi;

    public TopProxyLayout(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void CJ() {
        Qhi<TopProxyLayout> qhi = this.Qhi;
        if (qhi != null) {
            qhi.CJ();
        }
    }

    public TopProxyLayout Qhi(tP tPVar) {
        if (this.Qhi != null) {
            return this;
        }
        TopLayoutDislike2 Qhi = new TopLayoutDislike2(getContext()).Qhi(tPVar);
        this.Qhi = Qhi;
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            Qhi(Qhi, (ViewGroup) parent);
        }
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void Tgh() {
        Qhi<TopProxyLayout> qhi = this.Qhi;
        if (qhi != null) {
            qhi.Tgh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void ac() {
        Qhi<TopProxyLayout> qhi = this.Qhi;
        if (qhi != null) {
            qhi.ac();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void cJ() {
        Qhi<TopProxyLayout> qhi = this.Qhi;
        if (qhi != null) {
            qhi.cJ();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void fl() {
        Qhi<TopProxyLayout> qhi = this.Qhi;
        if (qhi != null) {
            qhi.fl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public View getCloseButton() {
        Qhi<TopProxyLayout> qhi = this.Qhi;
        if (qhi != null) {
            return qhi.getCloseButton();
        }
        return null;
    }

    public View getITopLayout() {
        Qhi<TopProxyLayout> qhi = this.Qhi;
        if (!(qhi instanceof View)) {
            return null;
        }
        return (View) qhi;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void setListener(cJ cJVar) {
        Qhi<TopProxyLayout> qhi = this.Qhi;
        if (qhi != null) {
            qhi.setListener(cJVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void setShowDislike(boolean z10) {
        Qhi<TopProxyLayout> qhi = this.Qhi;
        if (qhi != null) {
            qhi.setShowDislike(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void setShowSkip(boolean z10) {
        Qhi<TopProxyLayout> qhi = this.Qhi;
        if (qhi != null) {
            qhi.setShowSkip(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void setShowSound(boolean z10) {
        Qhi<TopProxyLayout> qhi = this.Qhi;
        if (qhi != null) {
            qhi.setShowSound(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void setSkipEnable(boolean z10) {
        Qhi<TopProxyLayout> qhi = this.Qhi;
        if (qhi != null) {
            qhi.setSkipEnable(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void setSkipText(CharSequence charSequence) {
        Qhi<TopProxyLayout> qhi = this.Qhi;
        if (qhi != null) {
            qhi.setSkipText(charSequence);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void setSoundMute(boolean z10) {
        Qhi<TopProxyLayout> qhi = this.Qhi;
        if (qhi != null) {
            qhi.setSoundMute(z10);
        }
    }

    public TopProxyLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopProxyLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setVisibility(8);
        setWillNotDraw(true);
    }

    private void Qhi(View view, ViewGroup viewGroup) {
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
        if (view != null) {
            view.setId(iMK.cBj);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void Qhi(CharSequence charSequence, CharSequence charSequence2) {
        Qhi<TopProxyLayout> qhi = this.Qhi;
        if (qhi != null) {
            qhi.Qhi(charSequence, charSequence2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Qhi
    public void Qhi() {
        Qhi<TopProxyLayout> qhi = this.Qhi;
        if (qhi != null) {
            qhi.Qhi();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }
}
