package eightbitlab.com.blurview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import qe.a;
import qe.b;
import qe.d;
import qe.e;
import qe.f;
import qe.g;

/* loaded from: classes.dex */
public class BlurView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public b f16634a;

    /* renamed from: b  reason: collision with root package name */
    public int f16635b;

    public BlurView(Context context) {
        super(context);
        this.f16634a = new aj.b(0);
        a(null, 0);
    }

    private a getBlurAlgorithm() {
        if (Build.VERSION.SDK_INT >= 31) {
            return new f();
        }
        return new g(getContext());
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.f29304a, i10, 0);
        this.f16635b = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final d b(ViewGroup viewGroup, g gVar) {
        this.f16634a.destroy();
        d dVar = new d(this, viewGroup, this.f16635b, gVar);
        this.f16634a = dVar;
        return dVar;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.f16634a.d(canvas)) {
            super.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isHardwareAccelerated()) {
            this.f16634a.a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16634a.a(false);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f16634a.c();
    }

    public BlurView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16634a = new aj.b(0);
        a(attributeSet, 0);
    }

    public BlurView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16634a = new aj.b(0);
        a(attributeSet, i10);
    }
}
