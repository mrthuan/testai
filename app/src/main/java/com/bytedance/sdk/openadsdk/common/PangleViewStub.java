package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class PangleViewStub extends View {
    private final Qhi Qhi;
    private View cJ;

    /* loaded from: classes.dex */
    public interface Qhi {
        View Qhi(Context context);
    }

    public PangleViewStub(Context context, Qhi qhi) {
        super(context);
        this.Qhi = qhi;
        Qhi();
    }

    private void Qhi() {
        setVisibility(8);
        setWillNotDraw(true);
    }

    private View cJ() {
        Qhi qhi;
        if (this.cJ == null && (qhi = this.Qhi) != null) {
            this.cJ = qhi.Qhi(getContext());
            Qhi(this.cJ, (ViewGroup) getParent());
        }
        return this.cJ;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        View view = this.cJ;
        if (view != null) {
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            cJ();
        }
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
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }
}
