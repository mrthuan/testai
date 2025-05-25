package com.bytedance.adsdk.ugeno.component.text;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.ac;
import com.bytedance.adsdk.ugeno.core.IAnimation;

/* loaded from: classes.dex */
public class UGTextView extends TextView implements IAnimation {
    private ac Qhi;
    private float cJ;

    public UGTextView(Context context) {
        super(context);
    }

    public void Qhi(ac acVar) {
        this.Qhi = acVar;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.cJ;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ac acVar = this.Qhi;
        if (acVar != null) {
            acVar.Tgh();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ac acVar = this.Qhi;
        if (acVar != null) {
            acVar.ROR();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ac acVar = this.Qhi;
        if (acVar != null) {
            acVar.Qhi(canvas, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ac acVar = this.Qhi;
        if (acVar != null) {
            acVar.Qhi(i10, i11, i12, i13);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        ac acVar = this.Qhi;
        if (acVar != null) {
            int[] Qhi = acVar.Qhi(i10, i11);
            super.onMeasure(Qhi[0], Qhi[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ac acVar = this.Qhi;
        if (acVar != null) {
            acVar.cJ(i10, i11, i12, i12);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f10) {
        this.cJ = f10;
        postInvalidate();
    }
}
