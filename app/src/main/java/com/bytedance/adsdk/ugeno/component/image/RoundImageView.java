package com.bytedance.adsdk.ugeno.component.image;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.ac;
import com.bytedance.adsdk.ugeno.core.IAnimation;

/* loaded from: classes.dex */
public class RoundImageView extends ImageView implements IAnimation {
    static final /* synthetic */ boolean cJ = true;
    private boolean ABk;
    private Drawable Gm;
    private ImageView.ScaleType HzH;
    private ac MQ;
    private ColorStateList ROR;
    private float Sf;
    private Drawable Tgh;
    private boolean WAv;

    /* renamed from: ac  reason: collision with root package name */
    private float f7905ac;

    /* renamed from: fl  reason: collision with root package name */
    private final float[] f7906fl;

    /* renamed from: hm  reason: collision with root package name */
    private ColorFilter f7907hm;
    private int hpZ;
    private boolean iMK;
    private Shader.TileMode kYc;
    private int pA;
    private Shader.TileMode tP;

    /* renamed from: zc  reason: collision with root package name */
    private boolean f7908zc;
    public static final Shader.TileMode Qhi = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] CJ = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: com.bytedance.adsdk.ugeno.component.image.RoundImageView$1  reason: invalid class name */
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
                Qhi[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Qhi[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Qhi[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public RoundImageView(Context context) {
        super(context);
        this.f7906fl = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.ROR = ColorStateList.valueOf(-16777216);
        this.Sf = 0.0f;
        this.f7907hm = null;
        this.WAv = false;
        this.f7908zc = false;
        this.ABk = false;
        this.iMK = false;
        Shader.TileMode tileMode = Qhi;
        this.kYc = tileMode;
        this.tP = tileMode;
    }

    private void CJ() {
        Drawable drawable = this.Gm;
        if (drawable != null && this.WAv) {
            Drawable mutate = drawable.mutate();
            this.Gm = mutate;
            if (this.f7908zc) {
                mutate.setColorFilter(this.f7907hm);
            }
        }
    }

    private Drawable Qhi() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i10 = this.pA;
        if (i10 != 0) {
            try {
                drawable = resources.getDrawable(i10);
            } catch (Exception unused) {
                this.pA = 0;
            }
        }
        return Qhi.Qhi(drawable);
    }

    private void ac() {
        Qhi(this.Gm, this.HzH);
    }

    private Drawable cJ() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i10 = this.hpZ;
        if (i10 != 0) {
            try {
                drawable = resources.getDrawable(i10);
            } catch (Exception unused) {
                this.hpZ = 0;
            }
        }
        return Qhi.Qhi(drawable);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.ROR.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.ROR;
    }

    public float getBorderWidth() {
        return this.Sf;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float f10 = 0.0f;
        for (float f11 : this.f7906fl) {
            f10 = Math.max(f11, f10);
        }
        return f10;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.f7905ac;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.HzH;
    }

    public Shader.TileMode getTileModeX() {
        return this.kYc;
    }

    public Shader.TileMode getTileModeY() {
        return this.tP;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ac acVar = this.MQ;
        if (acVar != null) {
            acVar.Tgh();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ac acVar = this.MQ;
        if (acVar != null) {
            acVar.ROR();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ac acVar = this.MQ;
        if (acVar != null) {
            acVar.Qhi(canvas, this);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ac acVar = this.MQ;
        if (acVar != null) {
            acVar.Qhi(i10, i11, i12, i13);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        ac acVar = this.MQ;
        if (acVar != null) {
            int[] Qhi2 = acVar.Qhi(i10, i11);
            super.onMeasure(Qhi2[0], Qhi2[1]);
            return;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ac acVar = this.MQ;
        if (acVar != null) {
            acVar.cJ(i10, i11, i12, i12);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        ColorDrawable colorDrawable = new ColorDrawable(i10);
        this.Tgh = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.Tgh = drawable;
        Qhi(true);
        super.setBackgroundDrawable(this.Tgh);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        if (this.hpZ != i10) {
            this.hpZ = i10;
            Drawable cJ2 = cJ();
            this.Tgh = cJ2;
            setBackgroundDrawable(cJ2);
        }
    }

    public void setBorderColor(int i10) {
        setBorderColor(ColorStateList.valueOf(i10));
    }

    public void setBorderWidth(int i10) {
        setBorderWidth(getResources().getDimension(i10));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f7907hm != colorFilter) {
            this.f7907hm = colorFilter;
            this.f7908zc = true;
            this.WAv = true;
            CJ();
            invalidate();
        }
    }

    public void setCornerRadius(float f10) {
        Qhi(f10, f10, f10, f10);
    }

    public void setCornerRadiusDimen(int i10) {
        float dimension = getResources().getDimension(i10);
        Qhi(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.pA = 0;
        this.Gm = Qhi.Qhi(bitmap);
        ac();
        super.setImageDrawable(this.Gm);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.pA = 0;
        this.Gm = Qhi.Qhi(drawable);
        ac();
        super.setImageDrawable(this.Gm);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.pA != i10) {
            this.pA = i10;
            this.Gm = Qhi();
            ac();
            super.setImageDrawable(this.Gm);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z10) {
        this.ABk = z10;
        ac();
        Qhi(false);
        invalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f10) {
        this.f7905ac = f10;
        postInvalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!cJ && scaleType == null) {
            throw new AssertionError();
        }
        if (this.HzH != scaleType) {
            this.HzH = scaleType;
            switch (AnonymousClass1.Qhi[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            ac();
            Qhi(false);
            invalidate();
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.kYc == tileMode) {
            return;
        }
        this.kYc = tileMode;
        ac();
        Qhi(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.tP == tileMode) {
            return;
        }
        this.tP = tileMode;
        ac();
        Qhi(false);
        invalidate();
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.ROR.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.ROR = colorStateList;
        ac();
        Qhi(false);
        if (this.Sf > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f10) {
        if (this.Sf == f10) {
            return;
        }
        this.Sf = f10;
        ac();
        Qhi(false);
        invalidate();
    }

    private void Qhi(boolean z10) {
        if (this.iMK) {
            if (z10) {
                this.Tgh = Qhi.Qhi(this.Tgh);
            }
            Qhi(this.Tgh, ImageView.ScaleType.FIT_XY);
        }
    }

    private void Qhi(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof Qhi) {
            Qhi qhi = (Qhi) drawable;
            qhi.Qhi(scaleType).Qhi(this.Sf).Qhi(this.ROR).Qhi(this.ABk).Qhi(this.kYc).cJ(this.tP);
            float[] fArr = this.f7906fl;
            if (fArr != null) {
                qhi.Qhi(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            CJ();
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Qhi(layerDrawable.getDrawable(i10), scaleType);
            }
        }
    }

    public void Qhi(float f10, float f11, float f12, float f13) {
        float[] fArr = this.f7906fl;
        if (fArr[0] == f10 && fArr[1] == f11 && fArr[2] == f13 && fArr[3] == f12) {
            return;
        }
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[3] = f12;
        fArr[2] = f13;
        ac();
        Qhi(false);
        invalidate();
    }

    public void Qhi(ac acVar) {
        this.MQ = acVar;
    }
}
