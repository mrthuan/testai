package com.bytedance.adsdk.ugeno.swiper;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.adsdk.ugeno.ac;

/* loaded from: classes.dex */
public class Swiper extends BaseSwiper<com.bytedance.adsdk.ugeno.component.cJ> {

    /* renamed from: ac  reason: collision with root package name */
    private ac f7952ac;

    public Swiper(Context context) {
        super(context);
    }

    public void Qhi(ac acVar) {
        this.f7952ac = acVar;
    }

    @Override // com.bytedance.adsdk.ugeno.swiper.BaseSwiper
    public View ROR(int i10) {
        return ((com.bytedance.adsdk.ugeno.component.cJ) this.Qhi.get(i10)).hm();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ac acVar = this.f7952ac;
        if (acVar != null) {
            acVar.Tgh();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ac acVar = this.f7952ac;
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
        ac acVar = this.f7952ac;
        if (acVar != null) {
            acVar.fl();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        ac acVar2 = this.f7952ac;
        if (acVar2 != null) {
            acVar2.Qhi(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        ac acVar = this.f7952ac;
        if (acVar != null) {
            int[] Qhi = acVar.Qhi(i10, i11);
            super.onMeasure(Qhi[0], Qhi[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        ac acVar2 = this.f7952ac;
        if (acVar2 != null) {
            acVar2.CJ();
        }
    }
}
