package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p0.a;
import x0.f0;

/* compiled from: AppCompatSeekBarHelper.java */
/* loaded from: classes.dex */
public final class o extends m {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f2621d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f2622e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f2623f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f2624g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2625h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2626i;

    public o(SeekBar seekBar) {
        super(seekBar);
        this.f2623f = null;
        this.f2624g = null;
        this.f2625h = false;
        this.f2626i = false;
        this.f2621d = seekBar;
    }

    @Override // androidx.appcompat.widget.m
    public final void a(AttributeSet attributeSet, int i10) {
        super.a(attributeSet, i10);
        SeekBar seekBar = this.f2621d;
        Context context = seekBar.getContext();
        int[] iArr = k.a.f19435h;
        u0 m10 = u0.m(context, attributeSet, iArr, i10, 0);
        x0.f0.n(seekBar, seekBar.getContext(), iArr, attributeSet, m10.f2688b, i10);
        Drawable f10 = m10.f(0);
        if (f10 != null) {
            seekBar.setThumb(f10);
        }
        Drawable e10 = m10.e(1);
        Drawable drawable = this.f2622e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2622e = e10;
        if (e10 != null) {
            e10.setCallback(seekBar);
            a.c.b(e10, f0.e.d(seekBar));
            if (e10.isStateful()) {
                e10.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (m10.l(3)) {
            this.f2624g = a0.c(m10.h(3, -1), this.f2624g);
            this.f2626i = true;
        }
        if (m10.l(2)) {
            this.f2623f = m10.b(2);
            this.f2625h = true;
        }
        m10.n();
        c();
    }

    public final void c() {
        Drawable drawable = this.f2622e;
        if (drawable != null) {
            if (this.f2625h || this.f2626i) {
                Drawable mutate = drawable.mutate();
                this.f2622e = mutate;
                if (this.f2625h) {
                    a.b.h(mutate, this.f2623f);
                }
                if (this.f2626i) {
                    a.b.i(this.f2622e, this.f2624g);
                }
                if (this.f2622e.isStateful()) {
                    this.f2622e.setState(this.f2621d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        SeekBar seekBar;
        int i10;
        if (this.f2622e != null) {
            int max = this.f2621d.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f2622e.getIntrinsicWidth();
                int intrinsicHeight = this.f2622e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f2622e.setBounds(-i10, -i11, i10, i11);
                float width = ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f2622e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
