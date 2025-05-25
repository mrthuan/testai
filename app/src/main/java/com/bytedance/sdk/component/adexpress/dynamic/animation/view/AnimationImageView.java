package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.ac.Sf;

/* loaded from: classes.dex */
public class AnimationImageView extends ImageView implements IAnimation {
    private float CJ;
    Qhi Qhi;
    private Sf Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private float f8203ac;
    private float cJ;

    /* renamed from: fl  reason: collision with root package name */
    private float f8204fl;

    public AnimationImageView(Context context) {
        super(context);
        this.Qhi = new Qhi();
    }

    public Sf getBrickNativeValue() {
        return this.Tgh;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.CJ;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.cJ;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.f8203ac;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.f8204fl;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Sf sf2;
        super.onDraw(canvas);
        this.Qhi.Qhi(canvas, this, this);
        if (getRippleValue() != 0.0f && (sf2 = this.Tgh) != null && sf2.cJ() > 0) {
            ((ViewGroup) getParent()).setClipChildren(false);
            ((ViewGroup) getParent().getParent()).setClipChildren(false);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.Qhi.Qhi(this, i10, i11);
    }

    public void setBrickNativeValue(Sf sf2) {
        this.Tgh = sf2;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f10) {
        this.CJ = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f10) {
        this.cJ = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f10) {
        this.f8203ac = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f10) {
        this.f8204fl = f10;
        this.Qhi.Qhi(this, f10);
    }
}
