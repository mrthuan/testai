package com.bytedance.adsdk.ugeno.component.frame;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.ac;
import com.bytedance.adsdk.ugeno.core.zc;
import java.util.Map;

/* loaded from: classes.dex */
public class UGFrameLayout extends FrameLayout {
    private ac Qhi;
    private Map<Integer, zc> cJ;

    public UGFrameLayout(Context context) {
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

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, zc> map = this.cJ;
        if (map != null && map.containsKey(4)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ac acVar = this.Qhi;
        if (acVar != null) {
            acVar.fl();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        ac acVar2 = this.Qhi;
        if (acVar2 != null) {
            acVar2.Qhi(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        ac acVar = this.Qhi;
        if (acVar != null) {
            int[] Qhi = acVar.Qhi(i10, i11);
            super.onMeasure(Qhi[0], Qhi[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        ac acVar2 = this.Qhi;
        if (acVar2 != null) {
            acVar2.CJ();
        }
    }

    public void setEventMap(Map<Integer, zc> map) {
        this.cJ = map;
    }
}
