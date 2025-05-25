package com.bytedance.adsdk.ugeno.component.progressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.ac;

/* loaded from: classes.dex */
public class UGProgressBar extends FrameLayout {
    private TextView CJ;
    private ac Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private View f7909ac;
    private View cJ;

    /* renamed from: fl  reason: collision with root package name */
    private int f7910fl;

    public UGProgressBar(Context context) {
        super(context);
        Qhi(context);
    }

    private void Qhi(Context context) {
        this.cJ = new View(context);
        this.f7909ac = new View(context);
        addView(this.cJ);
        addView(this.f7909ac);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.cJ.getLayoutParams();
        layoutParams.width = 0;
        layoutParams.height = -1;
        layoutParams.gravity = 3;
        this.cJ.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f7909ac.getLayoutParams();
        layoutParams2.width = this.f7910fl;
        layoutParams2.gravity = 5;
        this.f7909ac.setLayoutParams(layoutParams2);
        TextView textView = new TextView(context);
        this.CJ = textView;
        textView.setTextColor(-1);
        this.CJ.setTextSize(16.0f);
        this.CJ.setGravity(17);
        addView(this.CJ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ac acVar = this.Qhi;
        if (acVar != null) {
            acVar.Tgh();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
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

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ac acVar = this.Qhi;
        if (acVar != null) {
            acVar.Qhi(i10, i11, i12, i13);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        ac acVar = this.Qhi;
        if (acVar != null) {
            acVar.Qhi(i10, i11);
        }
        super.onMeasure(i10, i11);
        this.f7910fl = Qhi(0, i10);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f7910fl = i10;
    }

    public void setProgress(float f10) {
        int width = getWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.cJ.getLayoutParams();
        float f11 = width;
        float f12 = (f10 / 100.0f) * f11;
        layoutParams.width = (int) f12;
        this.cJ.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f7909ac.getLayoutParams();
        layoutParams2.width = (int) (f11 - f12);
        this.f7909ac.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.CJ.getLayoutParams();
        layoutParams3.width = width;
        layoutParams3.gravity = 17;
        requestLayout();
    }

    public void setProgressBgColor(int i10) {
        this.f7909ac.setBackgroundColor(i10);
    }

    public void setProgressColor(int i10) {
        this.cJ.setBackgroundColor(i10);
    }

    public void setText(String str) {
        this.CJ.setText(str);
    }

    public void setTextColor(int i10) {
        this.CJ.setTextColor(i10);
    }

    private int Qhi(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        return mode == 1073741824 ? size : mode == Integer.MIN_VALUE ? Math.min(i10, size) : i10;
    }

    public void Qhi(ac acVar) {
        this.Qhi = acVar;
    }
}
