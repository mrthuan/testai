package com.bytedance.adsdk.ugeno.component.input;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EditText;
import com.bytedance.adsdk.ugeno.ac;

/* loaded from: classes.dex */
public class UGEditText extends EditText {
    private ac Qhi;

    public UGEditText(Context context) {
        super(context);
    }

    public void Qhi(ac acVar) {
        this.Qhi = acVar;
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
}
