package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import b9.c;
import f9.h;
import f9.m;
import f9.n;
import f9.q;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* loaded from: classes2.dex */
public class ShapeableImageView extends AppCompatImageView implements q {

    /* renamed from: d  reason: collision with root package name */
    public final n f12569d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f12570e;

    /* renamed from: f  reason: collision with root package name */
    public final RectF f12571f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f12572g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f12573h;

    /* renamed from: i  reason: collision with root package name */
    public final Path f12574i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f12575j;

    /* renamed from: k  reason: collision with root package name */
    public h f12576k;

    /* renamed from: l  reason: collision with root package name */
    public m f12577l;

    /* renamed from: m  reason: collision with root package name */
    public float f12578m;

    /* renamed from: n  reason: collision with root package name */
    public final Path f12579n;

    /* renamed from: o  reason: collision with root package name */
    public final int f12580o;

    /* renamed from: p  reason: collision with root package name */
    public final int f12581p;

    /* renamed from: q  reason: collision with root package name */
    public final int f12582q;

    /* renamed from: r  reason: collision with root package name */
    public final int f12583r;

    /* renamed from: s  reason: collision with root package name */
    public final int f12584s;

    /* renamed from: t  reason: collision with root package name */
    public final int f12585t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f12586u;

    @TargetApi(21)
    /* loaded from: classes2.dex */
    public class a extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f12587a = new Rect();

        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ShapeableImageView shapeableImageView = ShapeableImageView.this;
            if (shapeableImageView.f12577l == null) {
                return;
            }
            if (shapeableImageView.f12576k == null) {
                shapeableImageView.f12576k = new h(shapeableImageView.f12577l);
            }
            RectF rectF = shapeableImageView.f12570e;
            Rect rect = this.f12587a;
            rectF.round(rect);
            shapeableImageView.f12576k.setBounds(rect);
            shapeableImageView.f12576k.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    public final boolean c() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final void d(int i10, int i11) {
        RectF rectF = this.f12570e;
        rectF.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        m mVar = this.f12577l;
        Path path = this.f12574i;
        this.f12569d.a(mVar, 1.0f, rectF, null, path);
        Path path2 = this.f12579n;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f12571f;
        rectF2.set(0.0f, 0.0f, i10, i11);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f12583r;
    }

    public final int getContentPaddingEnd() {
        int i10 = this.f12585t;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (c()) {
            return this.f12580o;
        }
        return this.f12582q;
    }

    public int getContentPaddingLeft() {
        boolean z10;
        int i10 = this.f12585t;
        int i11 = this.f12584s;
        if (i11 == Integer.MIN_VALUE && i10 == Integer.MIN_VALUE) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (c() && i10 != Integer.MIN_VALUE) {
                return i10;
            }
            if (!c() && i11 != Integer.MIN_VALUE) {
                return i11;
            }
        }
        return this.f12580o;
    }

    public int getContentPaddingRight() {
        boolean z10;
        int i10 = this.f12585t;
        int i11 = this.f12584s;
        if (i11 == Integer.MIN_VALUE && i10 == Integer.MIN_VALUE) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (c() && i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (!c() && i10 != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f12582q;
    }

    public final int getContentPaddingStart() {
        int i10 = this.f12584s;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (c()) {
            return this.f12582q;
        }
        return this.f12580o;
    }

    public int getContentPaddingTop() {
        return this.f12581p;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public m getShapeAppearanceModel() {
        return this.f12577l;
    }

    public ColorStateList getStrokeColor() {
        return this.f12575j;
    }

    public float getStrokeWidth() {
        return this.f12578m;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f12579n, this.f12573h);
        if (this.f12575j != null) {
            Paint paint = this.f12572g;
            paint.setStrokeWidth(this.f12578m);
            int colorForState = this.f12575j.getColorForState(getDrawableState(), this.f12575j.getDefaultColor());
            if (this.f12578m > 0.0f && colorForState != 0) {
                paint.setColor(colorForState);
                canvas.drawPath(this.f12574i, paint);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f12586u || !isLayoutDirectionResolved()) {
            return;
        }
        boolean z10 = true;
        this.f12586u = true;
        if (!isPaddingRelative()) {
            if (this.f12584s == Integer.MIN_VALUE && this.f12585t == Integer.MIN_VALUE) {
                z10 = false;
            }
            if (!z10) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
                return;
            }
        }
        setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        d(i10, i11);
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(getContentPaddingLeft() + i10, getContentPaddingTop() + i11, getContentPaddingRight() + i12, getContentPaddingBottom() + i13);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(getContentPaddingStart() + i10, getContentPaddingTop() + i11, getContentPaddingEnd() + i12, getContentPaddingBottom() + i13);
    }

    @Override // f9.q
    public void setShapeAppearanceModel(m mVar) {
        this.f12577l = mVar;
        h hVar = this.f12576k;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(mVar);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f12575j = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i10) {
        setStrokeColor(androidx.core.content.a.getColorStateList(getContext(), i10));
    }

    public void setStrokeWidth(float f10) {
        if (this.f12578m != f10) {
            this.f12578m = f10;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i10) {
        setStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018296), attributeSet, i10);
        this.f12569d = n.a.f17245a;
        this.f12574i = new Path();
        this.f12586u = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f12573h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f12570e = new RectF();
        this.f12571f = new RectF();
        this.f12579n = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, e8.a.W, i10, 2132018296);
        setLayerType(2, null);
        this.f12575j = c.a(context2, obtainStyledAttributes, 9);
        this.f12578m = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f12580o = dimensionPixelSize;
        this.f12581p = dimensionPixelSize;
        this.f12582q = dimensionPixelSize;
        this.f12583r = dimensionPixelSize;
        this.f12580o = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f12581p = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f12582q = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f12583r = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f12584s = obtainStyledAttributes.getDimensionPixelSize(5, SlideAtom.USES_MASTER_SLIDE_ID);
        this.f12585t = obtainStyledAttributes.getDimensionPixelSize(2, SlideAtom.USES_MASTER_SLIDE_ID);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f12572g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f12577l = new m(m.c(context2, attributeSet, i10, 2132018296));
        setOutlineProvider(new a());
    }
}
