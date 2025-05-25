package com.scwang.smart.refresh.classics;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scwang.smart.refresh.classics.ClassicsAbstract;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.simple.SimpleComponent;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import tb.b;
import ub.a;
import yb.d;
import yb.e;

/* loaded from: classes2.dex */
public abstract class ClassicsAbstract<T extends ClassicsAbstract<?>> extends SimpleComponent {

    /* renamed from: d  reason: collision with root package name */
    public TextView f15868d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f15869e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f15870f;

    /* renamed from: g  reason: collision with root package name */
    public d f15871g;

    /* renamed from: h  reason: collision with root package name */
    public a f15872h;

    /* renamed from: i  reason: collision with root package name */
    public b f15873i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f15874j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f15875k;

    /* renamed from: l  reason: collision with root package name */
    public int f15876l;

    /* renamed from: m  reason: collision with root package name */
    public int f15877m;

    /* renamed from: n  reason: collision with root package name */
    public int f15878n;

    /* renamed from: o  reason: collision with root package name */
    public int f15879o;

    /* renamed from: p  reason: collision with root package name */
    public int f15880p;

    public ClassicsAbstract(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15877m = OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM;
        this.f15878n = 20;
        this.f15879o = 20;
        this.f15880p = 0;
        this.f15972b = zb.b.f32339d;
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, yb.a
    public final void e(e eVar, int i10, int i11) {
        ImageView imageView = this.f15870f;
        if (imageView.getVisibility() != 0) {
            imageView.setVisibility(0);
            Drawable drawable = this.f15870f.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
            } else {
                imageView.animate().rotation(36000.0f).setDuration(100000L);
            }
        }
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, yb.a
    public final void f(e eVar, int i10, int i11) {
        e(eVar, i10, i11);
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, yb.a
    public final void h(SmartRefreshLayout.h hVar, int i10, int i11) {
        this.f15871g = hVar;
        hVar.c(this, this.f15876l);
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, yb.a
    public int i(e eVar, boolean z10) {
        ImageView imageView = this.f15870f;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        } else {
            imageView.animate().rotation(0.0f).setDuration(0L);
        }
        imageView.setVisibility(8);
        return this.f15877m;
    }

    public void j(int i10) {
        this.f15874j = true;
        this.f15868d.setTextColor(i10);
        a aVar = this.f15872h;
        if (aVar != null) {
            aVar.a(i10);
            this.f15869e.invalidateDrawable(this.f15872h);
        }
        b bVar = this.f15873i;
        if (bVar != null) {
            bVar.a(i10);
            this.f15870f.invalidateDrawable(this.f15873i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageView imageView = this.f15869e;
        ImageView imageView2 = this.f15870f;
        imageView.animate().cancel();
        imageView2.animate().cancel();
        Drawable drawable = this.f15870f.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f15880p == 0) {
            this.f15878n = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            this.f15879o = paddingBottom;
            if (this.f15878n == 0 || paddingBottom == 0) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i12 = this.f15878n;
                if (i12 == 0) {
                    i12 = dc.b.c(20.0f);
                }
                this.f15878n = i12;
                int i13 = this.f15879o;
                if (i13 == 0) {
                    i13 = dc.b.c(20.0f);
                }
                this.f15879o = i13;
                setPadding(paddingLeft, this.f15878n, paddingRight, i13);
            }
            setClipToPadding(false);
        }
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            int size = View.MeasureSpec.getSize(i11);
            int i14 = this.f15880p;
            if (size < i14) {
                int i15 = (size - i14) / 2;
                setPadding(getPaddingLeft(), i15, getPaddingRight(), i15);
            } else {
                setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
            }
        } else {
            setPadding(getPaddingLeft(), this.f15878n, getPaddingRight(), this.f15879o);
        }
        super.onMeasure(i10, i11);
        if (this.f15880p == 0) {
            for (int i16 = 0; i16 < getChildCount(); i16++) {
                int measuredHeight = getChildAt(i16).getMeasuredHeight();
                if (this.f15880p < measuredHeight) {
                    this.f15880p = measuredHeight;
                }
            }
        }
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, yb.a
    public void setPrimaryColors(int... iArr) {
        if (iArr.length > 0) {
            if (!(getBackground() instanceof BitmapDrawable) && !this.f15875k) {
                int i10 = iArr[0];
                this.f15875k = true;
                this.f15876l = i10;
                d dVar = this.f15871g;
                if (dVar != null) {
                    ((SmartRefreshLayout.h) dVar).c(this, i10);
                }
                this.f15875k = false;
            }
            if (!this.f15874j) {
                if (iArr.length > 1) {
                    j(iArr[1]);
                }
                this.f15874j = false;
            }
        }
    }
}
