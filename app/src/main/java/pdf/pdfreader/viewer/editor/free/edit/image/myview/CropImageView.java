package pdf.pdfreader.viewer.editor.free.edit.image.myview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class CropImageView extends TransformImageView {
    public final RectF D;
    public final Matrix E;
    public float F;
    public float G;
    public gm.a H;
    public a I;
    public b J;
    public float K;
    public float L;
    public long M;

    /* loaded from: classes3.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<CropImageView> f24260a;

        /* renamed from: b  reason: collision with root package name */
        public final long f24261b;
        public final long c = System.currentTimeMillis();

        /* renamed from: d  reason: collision with root package name */
        public final float f24262d;

        /* renamed from: e  reason: collision with root package name */
        public final float f24263e;

        /* renamed from: f  reason: collision with root package name */
        public final float f24264f;

        /* renamed from: g  reason: collision with root package name */
        public final float f24265g;

        /* renamed from: h  reason: collision with root package name */
        public final float f24266h;

        /* renamed from: i  reason: collision with root package name */
        public final float f24267i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f24268j;

        public a(CropImageView cropImageView, long j10, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10) {
            this.f24260a = new WeakReference<>(cropImageView);
            this.f24261b = j10;
            this.f24262d = f10;
            this.f24263e = f11;
            this.f24264f = f12;
            this.f24265g = f13;
            this.f24266h = f14;
            this.f24267i = f15;
            this.f24268j = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            float f10;
            CropImageView cropImageView = this.f24260a.get();
            if (cropImageView == null) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.c;
            long j10 = this.f24261b;
            float min = (float) Math.min(j10, currentTimeMillis);
            float f11 = (float) j10;
            float f12 = (min / f11) - 1.0f;
            float f13 = (f12 * f12 * f12) + 1.0f;
            float f14 = (this.f24264f * f13) + 0.0f;
            float f15 = (f13 * this.f24265g) + 0.0f;
            float f16 = min / (f11 / 2.0f);
            int i10 = (f16 > 1.0f ? 1 : (f16 == 1.0f ? 0 : -1));
            float f17 = this.f24267i / 2.0f;
            if (i10 < 0) {
                f10 = (f17 * f16 * f16 * f16) + 0.0f;
            } else {
                float f18 = f16 - 2.0f;
                f10 = (((f18 * f18 * f18) + 2.0f) * f17) + 0.0f;
            }
            if (min < f11) {
                float[] fArr = cropImageView.f24313e;
                cropImageView.g(f14 - (fArr[0] - this.f24262d), f15 - (fArr[1] - this.f24263e));
                if (!this.f24268j) {
                    RectF rectF = cropImageView.D;
                    cropImageView.k(this.f24266h + f10, rectF.centerX(), rectF.centerY());
                }
                if (!cropImageView.i(cropImageView.f24312d)) {
                    cropImageView.post(this);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<CropImageView> f24269a;

        /* renamed from: d  reason: collision with root package name */
        public final float f24271d;

        /* renamed from: e  reason: collision with root package name */
        public final float f24272e;

        /* renamed from: f  reason: collision with root package name */
        public final float f24273f;

        /* renamed from: g  reason: collision with root package name */
        public final float f24274g;
        public final long c = System.currentTimeMillis();

        /* renamed from: b  reason: collision with root package name */
        public final long f24270b = 200;

        public b(GestureCropImageView gestureCropImageView, float f10, float f11, float f12, float f13) {
            this.f24269a = new WeakReference<>(gestureCropImageView);
            this.f24271d = f10;
            this.f24272e = f11;
            this.f24273f = f12;
            this.f24274g = f13;
        }

        @Override // java.lang.Runnable
        public final void run() {
            float f10;
            CropImageView cropImageView = this.f24269a.get();
            if (cropImageView == null) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.c;
            long j10 = this.f24270b;
            float min = (float) Math.min(j10, currentTimeMillis);
            float f11 = (float) j10;
            float f12 = min / (f11 / 2.0f);
            int i10 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
            float f13 = this.f24272e / 2.0f;
            if (i10 < 0) {
                f10 = (f13 * f12 * f12 * f12) + 0.0f;
            } else {
                float f14 = f12 - 2.0f;
                f10 = (((f14 * f14 * f14) + 2.0f) * f13) + 0.0f;
            }
            if (min < f11) {
                cropImageView.k(this.f24271d + f10, this.f24273f, this.f24274g);
                cropImageView.post(this);
                return;
            }
            cropImageView.setImageToWrapCropBounds(true);
        }
    }

    public CropImageView(Context context) {
        this(context, null);
    }

    @Override // pdf.pdfreader.viewer.editor.free.edit.image.myview.TransformImageView
    public final void f() {
        int i10;
        int i11;
        int i12;
        super.f();
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        if (this.F == 0.0f) {
            this.F = intrinsicWidth / intrinsicHeight;
        }
        int i13 = this.f24316h;
        float f10 = i13;
        float f11 = this.F;
        int i14 = (int) (f10 / f11);
        int i15 = this.f24317i;
        RectF rectF = this.D;
        if (i14 > i15) {
            float f12 = i15;
            rectF.set((i13 - ((int) (f11 * f12))) / 2, 0.0f, i11 + i12, f12);
        } else {
            rectF.set(0.0f, (i15 - i14) / 2, f10, i14 + i10);
        }
        h(intrinsicWidth, intrinsicHeight);
        float width = rectF.width();
        float height = rectF.height();
        float max = Math.max(rectF.width() / intrinsicWidth, rectF.height() / intrinsicHeight);
        float f13 = ((height - (intrinsicHeight * max)) / 2.0f) + rectF.top;
        Matrix matrix = this.f24315g;
        matrix.reset();
        matrix.postScale(max, max);
        matrix.postTranslate(((width - (intrinsicWidth * max)) / 2.0f) + rectF.left, f13);
        setImageMatrix(matrix);
        gm.a aVar = this.H;
        if (aVar != null) {
            ((fm.a) aVar).f17308a.f24340b.setTargetAspectRatio(this.F);
        }
    }

    public gm.a getCropBoundsChangeListener() {
        return this.H;
    }

    public float getMaxScale() {
        return this.K;
    }

    public float getMinScale() {
        return this.L;
    }

    public float getTargetAspectRatio() {
        return this.F;
    }

    public final void h(float f10, float f11) {
        float f12;
        RectF rectF = this.D;
        float min = Math.min(Math.min(rectF.width() / f10, rectF.width() / f11), Math.min(rectF.height() / f11, rectF.height() / f10));
        this.L = min;
        float f13 = this.G;
        if (min * f13 < 1.5d) {
            f12 = 1.5f;
        } else {
            f12 = min * f13;
        }
        this.K = f12;
    }

    public final boolean i(float[] fArr) {
        Matrix matrix = this.E;
        matrix.reset();
        matrix.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        matrix.mapPoints(copyOf);
        float[] r4 = aj.b.r(this.D);
        matrix.mapPoints(r4);
        return aj.b.Y(copyOf).contains(aj.b.Y(r4));
    }

    public final void j(float f10, float f11, float f12) {
        int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        Matrix matrix = this.f24315g;
        if (i10 > 0 && getCurrentScale() * f10 <= getMaxScale()) {
            if (f10 != 0.0f) {
                matrix.postScale(f10, f10, f11, f12);
                setImageMatrix(matrix);
            }
        } else if (f10 < 1.0f && getCurrentScale() * f10 >= getMinScale() && f10 != 0.0f) {
            matrix.postScale(f10, f10, f11, f12);
            setImageMatrix(matrix);
        }
    }

    public final void k(float f10, float f11, float f12) {
        if (f10 <= getMaxScale()) {
            j(f10 / getCurrentScale(), f11, f12);
        }
    }

    public void setCropBoundsChangeListener(gm.a aVar) {
        this.H = aVar;
    }

    public void setCropRect(RectF rectF) {
        this.F = rectF.width() / rectF.height();
        this.D.set(rectF.left - getPaddingLeft(), rectF.top - getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        Drawable drawable = getDrawable();
        if (drawable != null) {
            h(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        setImageToWrapCropBounds(true);
    }

    public void setImageToWrapCropBounds(boolean z10) {
        boolean z11;
        float max;
        float f10;
        float f11;
        if (this.f24320l) {
            float[] fArr = this.f24312d;
            if (!i(fArr)) {
                float[] fArr2 = this.f24313e;
                float f12 = fArr2[0];
                float f13 = fArr2[1];
                float currentScale = getCurrentScale();
                ea.a.p("akNU", "Tjgkpc07");
                ea.a.p("AjF7Mk0-XD5MPgo-Vz5oPid1QHIjbjdTMGEgZWs9", "SLKesxn2");
                RectF rectF = this.D;
                float centerX = rectF.centerX() - f12;
                float centerY = rectF.centerY() - f13;
                Matrix matrix = this.E;
                matrix.reset();
                matrix.setTranslate(centerX, centerY);
                float[] copyOf = Arrays.copyOf(fArr, fArr.length);
                matrix.mapPoints(copyOf);
                boolean i10 = i(copyOf);
                if (i10) {
                    matrix.reset();
                    matrix.setRotate(-getCurrentAngle());
                    float[] copyOf2 = Arrays.copyOf(fArr, fArr.length);
                    float[] r4 = aj.b.r(rectF);
                    matrix.mapPoints(copyOf2);
                    matrix.mapPoints(r4);
                    RectF Y = aj.b.Y(copyOf2);
                    RectF Y2 = aj.b.Y(r4);
                    float f14 = Y.left - Y2.left;
                    float f15 = Y.top - Y2.top;
                    float f16 = Y.right - Y2.right;
                    float f17 = Y.bottom - Y2.bottom;
                    float[] fArr3 = new float[4];
                    if (f14 <= 0.0f) {
                        f14 = 0.0f;
                    }
                    fArr3[0] = f14;
                    if (f15 <= 0.0f) {
                        f15 = 0.0f;
                    }
                    fArr3[1] = f15;
                    if (f16 >= 0.0f) {
                        f16 = 0.0f;
                    }
                    fArr3[2] = f16;
                    if (f17 >= 0.0f) {
                        f17 = 0.0f;
                    }
                    fArr3[3] = f17;
                    matrix.reset();
                    matrix.setRotate(getCurrentAngle());
                    matrix.mapPoints(fArr3);
                    f11 = -(fArr3[1] + fArr3[3]);
                    max = 0.0f;
                    z11 = i10;
                    f10 = -(fArr3[0] + fArr3[2]);
                } else {
                    RectF rectF2 = new RectF(rectF);
                    matrix.reset();
                    matrix.setRotate(getCurrentAngle());
                    matrix.mapRect(rectF2);
                    z11 = i10;
                    float[] fArr4 = {(float) Math.sqrt(Math.pow(fArr[1] - fArr[3], 2.0d) + Math.pow(fArr[0] - fArr[2], 2.0d)), (float) Math.sqrt(Math.pow(fArr[3] - fArr[5], 2.0d) + Math.pow(fArr[2] - fArr[4], 2.0d))};
                    max = (Math.max(rectF2.width() / fArr4[0], rectF2.height() / fArr4[1]) * currentScale) - currentScale;
                    f10 = centerX;
                    f11 = centerY;
                }
                if (z10) {
                    a aVar = new a(this, this.M, f12, f13, f10, f11, currentScale, max, z11);
                    this.I = aVar;
                    post(aVar);
                } else {
                    g(f10, f11);
                    if (!z11) {
                        k(currentScale + max, rectF.centerX(), rectF.centerY());
                    }
                }
                ea.a.p("akNU", "uSQoMYH5");
                ea.a.p("AjF7Mk0-XD5MPgo-Vz5oPjxfQmknbjppYz0=", "CnavaRi1");
                ea.a.p("FkNU", "PgIxjnyr");
                ea.a.p("fjEBMkc-CT5kPnQ-Sz5WPkxfHmkkbhxpbj0=", "DBWONvvP");
                ea.a.p("FkNU", "DctUNz48");
                ea.a.p("fjEBMkc-CT5kPnQ-Sz5WPlFlAnQkUwZhI2VlPQ==", "TDjYOEhd");
            }
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(long j10) {
        if (j10 > 0) {
            this.M = j10;
            return;
        }
        throw new IllegalArgumentException(ea.a.p("Dm5YbRh0Xm80IC51B2EcaVpuTmMkbgtvOiAwZU1uPWcudFh2HCBBYTZ1Ly4=", "ekYuNRmX"));
    }

    public void setMaxScaleMultiplier(float f10) {
        this.G = f10;
    }

    public void setTargetAspectRatio(float f10) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            this.F = f10;
            return;
        }
        if (f10 == 0.0f) {
            this.F = drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
        } else {
            this.F = f10;
        }
        gm.a aVar = this.H;
        if (aVar != null) {
            ((fm.a) aVar).f17308a.f24340b.setTargetAspectRatio(this.F);
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.D = new RectF();
        this.E = new Matrix();
        this.G = 10.0f;
        this.J = null;
        this.M = 500L;
    }

    public void setMaxResultImageSizeX(int i10) {
    }

    public void setMaxResultImageSizeY(int i10) {
    }
}
