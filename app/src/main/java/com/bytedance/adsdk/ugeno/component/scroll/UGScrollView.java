package com.bytedance.adsdk.ugeno.component.scroll;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ScrollView;
import com.bytedance.adsdk.ugeno.ac;

/* loaded from: classes.dex */
public class UGScrollView extends ScrollView {
    private ac Qhi;

    public UGScrollView(Context context) {
        super(context);
    }

    public void Qhi(ac acVar) {
        this.Qhi = acVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ac acVar = this.Qhi;
        if (acVar != null) {
            acVar.Tgh();
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ac acVar = this.Qhi;
        if (acVar != null) {
            acVar.ROR();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ac acVar = this.Qhi;
        if (acVar != null) {
            acVar.Qhi(i10, i11, i12, i13);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
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
}
