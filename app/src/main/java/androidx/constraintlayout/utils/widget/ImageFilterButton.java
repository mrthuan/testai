package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import g0.d;

/* loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* renamed from: d  reason: collision with root package name */
    public final ImageFilterView.c f3166d;

    /* renamed from: e  reason: collision with root package name */
    public float f3167e;

    /* renamed from: f  reason: collision with root package name */
    public float f3168f;

    /* renamed from: g  reason: collision with root package name */
    public float f3169g;

    /* renamed from: h  reason: collision with root package name */
    public Path f3170h;

    /* renamed from: i  reason: collision with root package name */
    public ViewOutlineProvider f3171i;

    /* renamed from: j  reason: collision with root package name */
    public RectF f3172j;

    /* renamed from: k  reason: collision with root package name */
    public final Drawable[] f3173k;

    /* renamed from: l  reason: collision with root package name */
    public LayerDrawable f3174l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3175m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f3176n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f3177o;

    /* renamed from: p  reason: collision with root package name */
    public float f3178p;

    /* renamed from: q  reason: collision with root package name */
    public float f3179q;

    /* renamed from: r  reason: collision with root package name */
    public float f3180r;

    /* renamed from: s  reason: collision with root package name */
    public float f3181s;

    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ImageFilterButton imageFilterButton = ImageFilterButton.this;
            int width = imageFilterButton.getWidth();
            int height = imageFilterButton.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * imageFilterButton.f3168f) / 2.0f);
        }
    }

    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ImageFilterButton imageFilterButton = ImageFilterButton.this;
            outline.setRoundRect(0, 0, imageFilterButton.getWidth(), imageFilterButton.getHeight(), imageFilterButton.f3169g);
        }
    }

    public ImageFilterButton(Context context) {
        super(context);
        this.f3166d = new ImageFilterView.c();
        this.f3167e = 0.0f;
        this.f3168f = 0.0f;
        this.f3169g = Float.NaN;
        this.f3173k = new Drawable[2];
        this.f3175m = true;
        this.f3176n = null;
        this.f3177o = null;
        this.f3178p = Float.NaN;
        this.f3179q = Float.NaN;
        this.f3180r = Float.NaN;
        this.f3181s = Float.NaN;
        a(null);
    }

    private void setOverlay(boolean z10) {
        this.f3175m = z10;
    }

    public final void a(AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f17346i);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f3176n = obtainStyledAttributes.getDrawable(0);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 4) {
                    this.f3167e = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == 13) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 12) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 3) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 10) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 11) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 9) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f3175m));
                } else if (index == 5) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f3178p));
                } else if (index == 6) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f3179q));
                } else if (index == 7) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f3181s));
                } else if (index == 8) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f3180r));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f3177o = drawable;
            Drawable drawable2 = this.f3176n;
            Drawable[] drawableArr = this.f3173k;
            if (drawable2 != null && drawable != null) {
                Drawable mutate = getDrawable().mutate();
                this.f3177o = mutate;
                drawableArr[0] = mutate;
                drawableArr[1] = this.f3176n.mutate();
                LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
                this.f3174l = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f3167e * 255.0f));
                if (!this.f3175m) {
                    this.f3174l.getDrawable(0).setAlpha((int) ((1.0f - this.f3167e) * 255.0f));
                }
                super.setImageDrawable(this.f3174l);
                return;
            }
            Drawable drawable3 = getDrawable();
            this.f3177o = drawable3;
            if (drawable3 != null) {
                Drawable mutate2 = drawable3.mutate();
                this.f3177o = mutate2;
                drawableArr[0] = mutate2;
            }
        }
    }

    public final void b() {
        float f10;
        float f11;
        float f12;
        float f13;
        if (Float.isNaN(this.f3178p) && Float.isNaN(this.f3179q) && Float.isNaN(this.f3180r) && Float.isNaN(this.f3181s)) {
            return;
        }
        float f14 = 0.0f;
        if (Float.isNaN(this.f3178p)) {
            f10 = 0.0f;
        } else {
            f10 = this.f3178p;
        }
        if (Float.isNaN(this.f3179q)) {
            f11 = 0.0f;
        } else {
            f11 = this.f3179q;
        }
        if (Float.isNaN(this.f3180r)) {
            f12 = 1.0f;
        } else {
            f12 = this.f3180r;
        }
        if (!Float.isNaN(this.f3181s)) {
            f14 = this.f3181s;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        if (intrinsicWidth * height < intrinsicHeight * width) {
            f13 = width / intrinsicWidth;
        } else {
            f13 = height / intrinsicHeight;
        }
        float f15 = f12 * f13;
        matrix.postScale(f15, f15);
        float f16 = intrinsicWidth * f15;
        float f17 = f15 * intrinsicHeight;
        matrix.postTranslate(((((width - f16) * f10) + width) - f16) * 0.5f, ((((height - f17) * f11) + height) - f17) * 0.5f);
        matrix.postRotate(f14, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void c() {
        if (Float.isNaN(this.f3178p) && Float.isNaN(this.f3179q) && Float.isNaN(this.f3180r) && Float.isNaN(this.f3181s)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            b();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getContrast() {
        return this.f3166d.f3206f;
    }

    public float getCrossfade() {
        return this.f3167e;
    }

    public float getImagePanX() {
        return this.f3178p;
    }

    public float getImagePanY() {
        return this.f3179q;
    }

    public float getImageRotate() {
        return this.f3181s;
    }

    public float getImageZoom() {
        return this.f3180r;
    }

    public float getRound() {
        return this.f3169g;
    }

    public float getRoundPercent() {
        return this.f3168f;
    }

    public float getSaturation() {
        return this.f3166d.f3205e;
    }

    public float getWarmth() {
        return this.f3166d.f3207g;
    }

    @Override // android.view.View
    public final void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        b();
    }

    public void setAltImageResource(int i10) {
        Drawable mutate = m.a.a(getContext(), i10).mutate();
        this.f3176n = mutate;
        Drawable drawable = this.f3177o;
        Drawable[] drawableArr = this.f3173k;
        drawableArr[0] = drawable;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f3174l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f3167e);
    }

    public void setBrightness(float f10) {
        ImageFilterView.c cVar = this.f3166d;
        cVar.f3204d = f10;
        cVar.a(this);
    }

    public void setContrast(float f10) {
        ImageFilterView.c cVar = this.f3166d;
        cVar.f3206f = f10;
        cVar.a(this);
    }

    public void setCrossfade(float f10) {
        this.f3167e = f10;
        if (this.f3173k != null) {
            if (!this.f3175m) {
                this.f3174l.getDrawable(0).setAlpha((int) ((1.0f - this.f3167e) * 255.0f));
            }
            this.f3174l.getDrawable(1).setAlpha((int) (this.f3167e * 255.0f));
            super.setImageDrawable(this.f3174l);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f3176n != null && drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f3177o = mutate;
            Drawable[] drawableArr = this.f3173k;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f3176n;
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.f3174l = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f3167e);
            return;
        }
        super.setImageDrawable(drawable);
    }

    public void setImagePanX(float f10) {
        this.f3178p = f10;
        c();
    }

    public void setImagePanY(float f10) {
        this.f3179q = f10;
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.f3176n != null) {
            Drawable mutate = m.a.a(getContext(), i10).mutate();
            this.f3177o = mutate;
            Drawable[] drawableArr = this.f3173k;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f3176n;
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.f3174l = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f3167e);
            return;
        }
        super.setImageResource(i10);
    }

    public void setImageRotate(float f10) {
        this.f3181s = f10;
        c();
    }

    public void setImageZoom(float f10) {
        this.f3180r = f10;
        c();
    }

    public void setRound(float f10) {
        boolean z10;
        if (Float.isNaN(f10)) {
            this.f3169g = f10;
            float f11 = this.f3168f;
            this.f3168f = -1.0f;
            setRoundPercent(f11);
            return;
        }
        if (this.f3169g != f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3169g = f10;
        if (f10 != 0.0f) {
            if (this.f3170h == null) {
                this.f3170h = new Path();
            }
            if (this.f3172j == null) {
                this.f3172j = new RectF();
            }
            if (this.f3171i == null) {
                b bVar = new b();
                this.f3171i = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f3172j.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f3170h.reset();
            Path path = this.f3170h;
            RectF rectF = this.f3172j;
            float f12 = this.f3169g;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f10) {
        boolean z10;
        if (this.f3168f != f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3168f = f10;
        if (f10 != 0.0f) {
            if (this.f3170h == null) {
                this.f3170h = new Path();
            }
            if (this.f3172j == null) {
                this.f3172j = new RectF();
            }
            if (this.f3171i == null) {
                a aVar = new a();
                this.f3171i = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f3168f) / 2.0f;
            this.f3172j.set(0.0f, 0.0f, width, height);
            this.f3170h.reset();
            this.f3170h.addRoundRect(this.f3172j, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f10) {
        ImageFilterView.c cVar = this.f3166d;
        cVar.f3205e = f10;
        cVar.a(this);
    }

    public void setWarmth(float f10) {
        ImageFilterView.c cVar = this.f3166d;
        cVar.f3207g = f10;
        cVar.a(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3166d = new ImageFilterView.c();
        this.f3167e = 0.0f;
        this.f3168f = 0.0f;
        this.f3169g = Float.NaN;
        this.f3173k = new Drawable[2];
        this.f3175m = true;
        this.f3176n = null;
        this.f3177o = null;
        this.f3178p = Float.NaN;
        this.f3179q = Float.NaN;
        this.f3180r = Float.NaN;
        this.f3181s = Float.NaN;
        a(attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3166d = new ImageFilterView.c();
        this.f3167e = 0.0f;
        this.f3168f = 0.0f;
        this.f3169g = Float.NaN;
        this.f3173k = new Drawable[2];
        this.f3175m = true;
        this.f3176n = null;
        this.f3177o = null;
        this.f3178p = Float.NaN;
        this.f3179q = Float.NaN;
        this.f3180r = Float.NaN;
        this.f3181s = Float.NaN;
        a(attributeSet);
    }
}
