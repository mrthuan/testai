package com.bytedance.adsdk.ugeno.component.image;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import androidx.activity.r;
import java.util.HashSet;

/* compiled from: RoundedDrawable.java */
/* loaded from: classes.dex */
public class Qhi extends Drawable {
    private Shader.TileMode ABk;
    private final Bitmap CJ;
    private final RectF Gm;
    private boolean HzH;
    private ImageView.ScaleType MQ;
    private final int ROR;
    private final RectF Sf;
    private final int Tgh;
    private final Matrix WAv;

    /* renamed from: ac  reason: collision with root package name */
    private final RectF f7901ac;

    /* renamed from: fl  reason: collision with root package name */
    private final Paint f7902fl;

    /* renamed from: hm  reason: collision with root package name */
    private final Paint f7903hm;
    private final boolean[] hpZ;
    private boolean iMK;
    private float kYc;
    private float pA;
    private ColorStateList tP;

    /* renamed from: zc  reason: collision with root package name */
    private Shader.TileMode f7904zc;
    private final RectF Qhi = new RectF();
    private final RectF cJ = new RectF();

    /* compiled from: RoundedDrawable.java */
    /* renamed from: com.bytedance.adsdk.ugeno.component.image.Qhi$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Qhi;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            Qhi = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Qhi[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Qhi[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Qhi[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Qhi[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Qhi[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Qhi[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public Qhi(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.f7901ac = rectF;
        this.Sf = new RectF();
        this.WAv = new Matrix();
        this.Gm = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f7904zc = tileMode;
        this.ABk = tileMode;
        this.iMK = true;
        this.pA = 0.0f;
        this.hpZ = new boolean[]{true, true, true, true};
        this.HzH = false;
        this.kYc = 0.0f;
        this.tP = ColorStateList.valueOf(-16777216);
        this.MQ = ImageView.ScaleType.FIT_CENTER;
        this.CJ = bitmap;
        int width = bitmap.getWidth();
        this.Tgh = width;
        int height = bitmap.getHeight();
        this.ROR = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.f7902fl = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f7903hm = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.tP.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.kYc);
    }

    public static Qhi Qhi(Bitmap bitmap) {
        if (bitmap != null) {
            return new Qhi(bitmap);
        }
        return null;
    }

    public static Bitmap cJ(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.iMK) {
            BitmapShader bitmapShader = new BitmapShader(this.CJ, this.f7904zc, this.ABk);
            Shader.TileMode tileMode = this.f7904zc;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.ABk == tileMode2) {
                bitmapShader.setLocalMatrix(this.WAv);
            }
            this.f7902fl.setShader(bitmapShader);
            this.iMK = false;
        }
        if (this.HzH) {
            if (this.kYc > 0.0f) {
                canvas.drawOval(this.cJ, this.f7902fl);
                canvas.drawOval(this.Sf, this.f7903hm);
                return;
            }
            canvas.drawOval(this.cJ, this.f7902fl);
        } else if (Qhi(this.hpZ)) {
            float f10 = this.pA;
            if (this.kYc > 0.0f) {
                canvas.drawRoundRect(this.cJ, f10, f10, this.f7902fl);
                canvas.drawRoundRect(this.Sf, f10, f10, this.f7903hm);
                Qhi(canvas);
                cJ(canvas);
                return;
            }
            canvas.drawRoundRect(this.cJ, f10, f10, this.f7902fl);
            Qhi(canvas);
        } else {
            canvas.drawRect(this.cJ, this.f7902fl);
            if (this.kYc > 0.0f) {
                canvas.drawRect(this.Sf, this.f7903hm);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f7902fl.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f7902fl.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.ROR;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.Tgh;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.tP.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.Qhi.set(rect);
        Qhi();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.tP.getColorForState(iArr, 0);
        if (this.f7903hm.getColor() != colorForState) {
            this.f7903hm.setColor(colorForState);
            return true;
        }
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f7902fl.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f7902fl.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f7902fl.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f7902fl.setFilterBitmap(z10);
        invalidateSelf();
    }

    public static Drawable Qhi(Drawable drawable) {
        if (drawable == null || (drawable instanceof Qhi)) {
            return drawable;
        }
        if (drawable instanceof LayerDrawable) {
            Drawable.ConstantState constantState = drawable.mutate().getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                layerDrawable.setDrawableByLayerId(layerDrawable.getId(i10), Qhi(layerDrawable.getDrawable(i10)));
            }
            return layerDrawable;
        }
        Bitmap cJ = cJ(drawable);
        return cJ != null ? new Qhi(cJ) : drawable;
    }

    private void cJ(Canvas canvas) {
        float f10;
        if (cJ(this.hpZ) || this.pA == 0.0f) {
            return;
        }
        RectF rectF = this.cJ;
        float f11 = rectF.left;
        float f12 = rectF.top;
        float width = rectF.width() + f11;
        float height = this.cJ.height() + f12;
        float f13 = this.pA;
        float f14 = this.kYc / 2.0f;
        if (!this.hpZ[0]) {
            canvas.drawLine(f11 - f14, f12, f11 + f13, f12, this.f7903hm);
            canvas.drawLine(f11, f12 - f14, f11, f12 + f13, this.f7903hm);
        }
        if (!this.hpZ[1]) {
            canvas.drawLine((width - f13) - f14, f12, width, f12, this.f7903hm);
            canvas.drawLine(width, f12 - f14, width, f12 + f13, this.f7903hm);
        }
        if (this.hpZ[2]) {
            f10 = f13;
        } else {
            f10 = f13;
            canvas.drawLine((width - f13) - f14, height, width + f14, height, this.f7903hm);
            canvas.drawLine(width, height - f10, width, height, this.f7903hm);
        }
        if (this.hpZ[3]) {
            return;
        }
        canvas.drawLine(f11 - f14, height, f11 + f10, height, this.f7903hm);
        canvas.drawLine(f11, height - f10, f11, height, this.f7903hm);
    }

    private void Qhi() {
        float width;
        float height;
        int i10 = AnonymousClass1.Qhi[this.MQ.ordinal()];
        if (i10 == 1) {
            this.Sf.set(this.Qhi);
            RectF rectF = this.Sf;
            float f10 = this.kYc;
            rectF.inset(f10 / 2.0f, f10 / 2.0f);
            this.WAv.reset();
            this.WAv.setTranslate((int) r.l(this.Sf.width(), this.Tgh, 0.5f, 0.5f), (int) r.l(this.Sf.height(), this.ROR, 0.5f, 0.5f));
        } else if (i10 == 2) {
            this.Sf.set(this.Qhi);
            RectF rectF2 = this.Sf;
            float f11 = this.kYc;
            rectF2.inset(f11 / 2.0f, f11 / 2.0f);
            this.WAv.reset();
            float f12 = 0.0f;
            if (this.Sf.height() * this.Tgh > this.Sf.width() * this.ROR) {
                width = this.Sf.height() / this.ROR;
                height = 0.0f;
                f12 = (this.Sf.width() - (this.Tgh * width)) * 0.5f;
            } else {
                width = this.Sf.width() / this.Tgh;
                height = (this.Sf.height() - (this.ROR * width)) * 0.5f;
            }
            this.WAv.setScale(width, width);
            Matrix matrix = this.WAv;
            float f13 = this.kYc;
            matrix.postTranslate((f13 / 2.0f) + ((int) (f12 + 0.5f)), (f13 / 2.0f) + ((int) (height + 0.5f)));
        } else if (i10 == 3) {
            this.WAv.reset();
            float min = (((float) this.Tgh) > this.Qhi.width() || ((float) this.ROR) > this.Qhi.height()) ? Math.min(this.Qhi.width() / this.Tgh, this.Qhi.height() / this.ROR) : 1.0f;
            this.WAv.setScale(min, min);
            this.WAv.postTranslate((int) (((this.Qhi.width() - (this.Tgh * min)) * 0.5f) + 0.5f), (int) (((this.Qhi.height() - (this.ROR * min)) * 0.5f) + 0.5f));
            this.Sf.set(this.f7901ac);
            this.WAv.mapRect(this.Sf);
            RectF rectF3 = this.Sf;
            float f14 = this.kYc;
            rectF3.inset(f14 / 2.0f, f14 / 2.0f);
            this.WAv.setRectToRect(this.f7901ac, this.Sf, Matrix.ScaleToFit.FILL);
        } else if (i10 == 5) {
            this.Sf.set(this.f7901ac);
            this.WAv.setRectToRect(this.f7901ac, this.Qhi, Matrix.ScaleToFit.END);
            this.WAv.mapRect(this.Sf);
            RectF rectF4 = this.Sf;
            float f15 = this.kYc;
            rectF4.inset(f15 / 2.0f, f15 / 2.0f);
            this.WAv.setRectToRect(this.f7901ac, this.Sf, Matrix.ScaleToFit.FILL);
        } else if (i10 == 6) {
            this.Sf.set(this.f7901ac);
            this.WAv.setRectToRect(this.f7901ac, this.Qhi, Matrix.ScaleToFit.START);
            this.WAv.mapRect(this.Sf);
            RectF rectF5 = this.Sf;
            float f16 = this.kYc;
            rectF5.inset(f16 / 2.0f, f16 / 2.0f);
            this.WAv.setRectToRect(this.f7901ac, this.Sf, Matrix.ScaleToFit.FILL);
        } else if (i10 != 7) {
            this.Sf.set(this.f7901ac);
            this.WAv.setRectToRect(this.f7901ac, this.Qhi, Matrix.ScaleToFit.CENTER);
            this.WAv.mapRect(this.Sf);
            RectF rectF6 = this.Sf;
            float f17 = this.kYc;
            rectF6.inset(f17 / 2.0f, f17 / 2.0f);
            this.WAv.setRectToRect(this.f7901ac, this.Sf, Matrix.ScaleToFit.FILL);
        } else {
            this.Sf.set(this.Qhi);
            RectF rectF7 = this.Sf;
            float f18 = this.kYc;
            rectF7.inset(f18 / 2.0f, f18 / 2.0f);
            this.WAv.reset();
            this.WAv.setRectToRect(this.f7901ac, this.Sf, Matrix.ScaleToFit.FILL);
        }
        this.cJ.set(this.Sf);
        this.iMK = true;
    }

    public Qhi cJ(Shader.TileMode tileMode) {
        if (this.ABk != tileMode) {
            this.ABk = tileMode;
            this.iMK = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean cJ(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return false;
            }
        }
        return true;
    }

    private void Qhi(Canvas canvas) {
        if (cJ(this.hpZ) || this.pA == 0.0f) {
            return;
        }
        RectF rectF = this.cJ;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width() + f10;
        float height = this.cJ.height() + f11;
        float f12 = this.pA;
        if (!this.hpZ[0]) {
            this.Gm.set(f10, f11, f10 + f12, f11 + f12);
            canvas.drawRect(this.Gm, this.f7902fl);
        }
        if (!this.hpZ[1]) {
            this.Gm.set(width - f12, f11, width, f12);
            canvas.drawRect(this.Gm, this.f7902fl);
        }
        if (!this.hpZ[2]) {
            this.Gm.set(width - f12, height - f12, width, height);
            canvas.drawRect(this.Gm, this.f7902fl);
        }
        if (this.hpZ[3]) {
            return;
        }
        this.Gm.set(f10, height - f12, f12 + f10, height);
        canvas.drawRect(this.Gm, this.f7902fl);
    }

    public Qhi Qhi(float f10, float f11, float f12, float f13) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.add(Float.valueOf(f12));
        hashSet.add(Float.valueOf(f13));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float floatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(floatValue) && !Float.isNaN(floatValue) && floatValue >= 0.0f) {
                    this.pA = floatValue;
                } else {
                    throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(floatValue)));
                }
            } else {
                this.pA = 0.0f;
            }
            boolean[] zArr = this.hpZ;
            zArr[0] = f10 > 0.0f;
            zArr[1] = f11 > 0.0f;
            zArr[2] = f12 > 0.0f;
            zArr[3] = f13 > 0.0f;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }

    public Qhi Qhi(float f10) {
        this.kYc = f10;
        this.f7903hm.setStrokeWidth(f10);
        return this;
    }

    public Qhi Qhi(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.tP = colorStateList;
        this.f7903hm.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public Qhi Qhi(boolean z10) {
        this.HzH = z10;
        return this;
    }

    public Qhi Qhi(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.MQ != scaleType) {
            this.MQ = scaleType;
            Qhi();
        }
        return this;
    }

    public Qhi Qhi(Shader.TileMode tileMode) {
        if (this.f7904zc != tileMode) {
            this.f7904zc = tileMode;
            this.iMK = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean Qhi(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return true;
            }
        }
        return false;
    }
}
