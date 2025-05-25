package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import androidx.appcompat.widget.AppCompatImageView;
import g0.d;

/* loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {

    /* renamed from: d  reason: collision with root package name */
    public final c f3184d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3185e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f3186f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f3187g;

    /* renamed from: h  reason: collision with root package name */
    public float f3188h;

    /* renamed from: i  reason: collision with root package name */
    public float f3189i;

    /* renamed from: j  reason: collision with root package name */
    public float f3190j;

    /* renamed from: k  reason: collision with root package name */
    public Path f3191k;

    /* renamed from: l  reason: collision with root package name */
    public ViewOutlineProvider f3192l;

    /* renamed from: m  reason: collision with root package name */
    public RectF f3193m;

    /* renamed from: n  reason: collision with root package name */
    public final Drawable[] f3194n;

    /* renamed from: o  reason: collision with root package name */
    public LayerDrawable f3195o;

    /* renamed from: p  reason: collision with root package name */
    public float f3196p;

    /* renamed from: q  reason: collision with root package name */
    public float f3197q;

    /* renamed from: r  reason: collision with root package name */
    public float f3198r;

    /* renamed from: s  reason: collision with root package name */
    public float f3199s;

    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ImageFilterView imageFilterView = ImageFilterView.this;
            int width = imageFilterView.getWidth();
            int height = imageFilterView.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * imageFilterView.f3189i) / 2.0f);
        }
    }

    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ImageFilterView imageFilterView = ImageFilterView.this;
            outline.setRoundRect(0, 0, imageFilterView.getWidth(), imageFilterView.getHeight(), imageFilterView.f3190j);
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final float[] f3202a = new float[20];

        /* renamed from: b  reason: collision with root package name */
        public final ColorMatrix f3203b = new ColorMatrix();
        public final ColorMatrix c = new ColorMatrix();

        /* renamed from: d  reason: collision with root package name */
        public float f3204d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f3205e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f3206f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f3207g = 1.0f;

        public final void a(ImageView imageView) {
            boolean z10;
            float log;
            float f10;
            float f11;
            float f12;
            ColorMatrix colorMatrix = this.f3203b;
            colorMatrix.reset();
            float f13 = this.f3205e;
            float f14 = 1.0f;
            int i10 = (f13 > 1.0f ? 1 : (f13 == 1.0f ? 0 : -1));
            float[] fArr = this.f3202a;
            boolean z11 = true;
            if (i10 != 0) {
                float f15 = 1.0f - f13;
                float f16 = 0.2999f * f15;
                float f17 = 0.587f * f15;
                float f18 = f15 * 0.114f;
                fArr[0] = f16 + f13;
                fArr[1] = f17;
                fArr[2] = f18;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = f16;
                fArr[6] = f17 + f13;
                fArr[7] = f18;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = f16;
                fArr[11] = f17;
                fArr[12] = f18 + f13;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                fArr[15] = 0.0f;
                fArr[16] = 0.0f;
                fArr[17] = 0.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                colorMatrix.set(fArr);
                z10 = true;
            } else {
                z10 = false;
            }
            float f19 = this.f3206f;
            int i11 = (f19 > 1.0f ? 1 : (f19 == 1.0f ? 0 : -1));
            ColorMatrix colorMatrix2 = this.c;
            if (i11 != 0) {
                colorMatrix2.setScale(f19, f19, f19, 1.0f);
                colorMatrix.postConcat(colorMatrix2);
                z10 = true;
            }
            float f20 = this.f3207g;
            if (f20 != 1.0f) {
                if (f20 <= 0.0f) {
                    f20 = 0.01f;
                }
                float f21 = (5000.0f / f20) / 100.0f;
                if (f21 > 66.0f) {
                    double d10 = f21 - 60.0f;
                    f10 = ((float) Math.pow(d10, -0.13320475816726685d)) * 329.69873f;
                    log = ((float) Math.pow(d10, 0.07551484555006027d)) * 288.12216f;
                } else {
                    log = (((float) Math.log(f21)) * 99.4708f) - 161.11957f;
                    f10 = 255.0f;
                }
                if (f21 < 66.0f) {
                    if (f21 > 19.0f) {
                        f11 = log;
                        f12 = (((float) Math.log(f21 - 10.0f)) * 138.51773f) - 305.0448f;
                    } else {
                        f11 = log;
                        f12 = 0.0f;
                    }
                } else {
                    f11 = log;
                    f12 = 255.0f;
                }
                float min = Math.min(255.0f, Math.max(f10, 0.0f));
                float min2 = Math.min(255.0f, Math.max(f11, 0.0f));
                float min3 = Math.min(255.0f, Math.max(f12, 0.0f));
                float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
                float min5 = Math.min(255.0f, Math.max((((float) Math.log(50.0f)) * 99.4708f) - 161.11957f, 0.0f));
                fArr[0] = min / min4;
                fArr[1] = 0.0f;
                fArr[2] = 0.0f;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = 0.0f;
                fArr[6] = min2 / min5;
                fArr[7] = 0.0f;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = 0.0f;
                fArr[11] = 0.0f;
                fArr[12] = min3 / Math.min(255.0f, Math.max((((float) Math.log(40.0f)) * 138.51773f) - 305.0448f, 0.0f));
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                fArr[15] = 0.0f;
                fArr[16] = 0.0f;
                fArr[17] = 0.0f;
                f14 = 1.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                colorMatrix2.set(fArr);
                colorMatrix.postConcat(colorMatrix2);
                z10 = true;
            }
            float f22 = this.f3204d;
            if (f22 != f14) {
                fArr[0] = f22;
                fArr[1] = 0.0f;
                fArr[2] = 0.0f;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = 0.0f;
                fArr[6] = f22;
                fArr[7] = 0.0f;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = 0.0f;
                fArr[11] = 0.0f;
                fArr[12] = f22;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                fArr[15] = 0.0f;
                fArr[16] = 0.0f;
                fArr[17] = 0.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                colorMatrix2.set(fArr);
                colorMatrix.postConcat(colorMatrix2);
            } else {
                z11 = z10;
            }
            if (z11) {
                imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            } else {
                imageView.clearColorFilter();
            }
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        this.f3184d = new c();
        this.f3185e = true;
        this.f3186f = null;
        this.f3187g = null;
        this.f3188h = 0.0f;
        this.f3189i = 0.0f;
        this.f3190j = Float.NaN;
        this.f3194n = new Drawable[2];
        this.f3196p = Float.NaN;
        this.f3197q = Float.NaN;
        this.f3198r = Float.NaN;
        this.f3199s = Float.NaN;
    }

    private void setOverlay(boolean z10) {
        this.f3185e = z10;
    }

    public final void c(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f17346i);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f3186f = obtainStyledAttributes.getDrawable(0);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 4) {
                    this.f3188h = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == 13) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 12) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 3) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 2) {
                    setBrightness(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 10) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 11) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 9) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f3185e));
                } else if (index == 5) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f3196p));
                } else if (index == 6) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f3197q));
                } else if (index == 7) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f3199s));
                } else if (index == 8) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f3198r));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f3187g = drawable;
            Drawable drawable2 = this.f3186f;
            Drawable[] drawableArr = this.f3194n;
            if (drawable2 != null && drawable != null) {
                Drawable mutate = getDrawable().mutate();
                this.f3187g = mutate;
                drawableArr[0] = mutate;
                drawableArr[1] = this.f3186f.mutate();
                LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
                this.f3195o = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f3188h * 255.0f));
                if (!this.f3185e) {
                    this.f3195o.getDrawable(0).setAlpha((int) ((1.0f - this.f3188h) * 255.0f));
                }
                super.setImageDrawable(this.f3195o);
                return;
            }
            Drawable drawable3 = getDrawable();
            this.f3187g = drawable3;
            if (drawable3 != null) {
                Drawable mutate2 = drawable3.mutate();
                this.f3187g = mutate2;
                drawableArr[0] = mutate2;
            }
        }
    }

    public final void d() {
        float f10;
        float f11;
        float f12;
        float f13;
        if (Float.isNaN(this.f3196p) && Float.isNaN(this.f3197q) && Float.isNaN(this.f3198r) && Float.isNaN(this.f3199s)) {
            return;
        }
        float f14 = 0.0f;
        if (Float.isNaN(this.f3196p)) {
            f10 = 0.0f;
        } else {
            f10 = this.f3196p;
        }
        if (Float.isNaN(this.f3197q)) {
            f11 = 0.0f;
        } else {
            f11 = this.f3197q;
        }
        if (Float.isNaN(this.f3198r)) {
            f12 = 1.0f;
        } else {
            f12 = this.f3198r;
        }
        if (!Float.isNaN(this.f3199s)) {
            f14 = this.f3199s;
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

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public final void e() {
        if (Float.isNaN(this.f3196p) && Float.isNaN(this.f3197q) && Float.isNaN(this.f3198r) && Float.isNaN(this.f3199s)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            d();
        }
    }

    public float getBrightness() {
        return this.f3184d.f3204d;
    }

    public float getContrast() {
        return this.f3184d.f3206f;
    }

    public float getCrossfade() {
        return this.f3188h;
    }

    public float getImagePanX() {
        return this.f3196p;
    }

    public float getImagePanY() {
        return this.f3197q;
    }

    public float getImageRotate() {
        return this.f3199s;
    }

    public float getImageZoom() {
        return this.f3198r;
    }

    public float getRound() {
        return this.f3190j;
    }

    public float getRoundPercent() {
        return this.f3189i;
    }

    public float getSaturation() {
        return this.f3184d.f3205e;
    }

    public float getWarmth() {
        return this.f3184d.f3207g;
    }

    @Override // android.view.View
    public final void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        d();
    }

    public void setAltImageResource(int i10) {
        Drawable mutate = m.a.a(getContext(), i10).mutate();
        this.f3186f = mutate;
        Drawable drawable = this.f3187g;
        Drawable[] drawableArr = this.f3194n;
        drawableArr[0] = drawable;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f3195o = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f3188h);
    }

    public void setBrightness(float f10) {
        c cVar = this.f3184d;
        cVar.f3204d = f10;
        cVar.a(this);
    }

    public void setContrast(float f10) {
        c cVar = this.f3184d;
        cVar.f3206f = f10;
        cVar.a(this);
    }

    public void setCrossfade(float f10) {
        this.f3188h = f10;
        if (this.f3194n != null) {
            if (!this.f3185e) {
                this.f3195o.getDrawable(0).setAlpha((int) ((1.0f - this.f3188h) * 255.0f));
            }
            this.f3195o.getDrawable(1).setAlpha((int) (this.f3188h * 255.0f));
            super.setImageDrawable(this.f3195o);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f3186f != null && drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f3187g = mutate;
            Drawable[] drawableArr = this.f3194n;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f3186f;
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.f3195o = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f3188h);
            return;
        }
        super.setImageDrawable(drawable);
    }

    public void setImagePanX(float f10) {
        this.f3196p = f10;
        e();
    }

    public void setImagePanY(float f10) {
        this.f3197q = f10;
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.f3186f != null) {
            Drawable mutate = m.a.a(getContext(), i10).mutate();
            this.f3187g = mutate;
            Drawable[] drawableArr = this.f3194n;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f3186f;
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.f3195o = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f3188h);
            return;
        }
        super.setImageResource(i10);
    }

    public void setImageRotate(float f10) {
        this.f3199s = f10;
        e();
    }

    public void setImageZoom(float f10) {
        this.f3198r = f10;
        e();
    }

    public void setRound(float f10) {
        boolean z10;
        if (Float.isNaN(f10)) {
            this.f3190j = f10;
            float f11 = this.f3189i;
            this.f3189i = -1.0f;
            setRoundPercent(f11);
            return;
        }
        if (this.f3190j != f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3190j = f10;
        if (f10 != 0.0f) {
            if (this.f3191k == null) {
                this.f3191k = new Path();
            }
            if (this.f3193m == null) {
                this.f3193m = new RectF();
            }
            if (this.f3192l == null) {
                b bVar = new b();
                this.f3192l = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f3193m.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f3191k.reset();
            Path path = this.f3191k;
            RectF rectF = this.f3193m;
            float f12 = this.f3190j;
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
        if (this.f3189i != f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3189i = f10;
        if (f10 != 0.0f) {
            if (this.f3191k == null) {
                this.f3191k = new Path();
            }
            if (this.f3193m == null) {
                this.f3193m = new RectF();
            }
            if (this.f3192l == null) {
                a aVar = new a();
                this.f3192l = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f3189i) / 2.0f;
            this.f3193m.set(0.0f, 0.0f, width, height);
            this.f3191k.reset();
            this.f3191k.addRoundRect(this.f3193m, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f10) {
        c cVar = this.f3184d;
        cVar.f3205e = f10;
        cVar.a(this);
    }

    public void setWarmth(float f10) {
        c cVar = this.f3184d;
        cVar.f3207g = f10;
        cVar.a(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3184d = new c();
        this.f3185e = true;
        this.f3186f = null;
        this.f3187g = null;
        this.f3188h = 0.0f;
        this.f3189i = 0.0f;
        this.f3190j = Float.NaN;
        this.f3194n = new Drawable[2];
        this.f3196p = Float.NaN;
        this.f3197q = Float.NaN;
        this.f3198r = Float.NaN;
        this.f3199s = Float.NaN;
        c(attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3184d = new c();
        this.f3185e = true;
        this.f3186f = null;
        this.f3187g = null;
        this.f3188h = 0.0f;
        this.f3189i = 0.0f;
        this.f3190j = Float.NaN;
        this.f3194n = new Drawable[2];
        this.f3196p = Float.NaN;
        this.f3197q = Float.NaN;
        this.f3198r = Float.NaN;
        this.f3199s = Float.NaN;
        c(attributeSet);
    }
}
