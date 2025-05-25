package com.bytedance.sdk.component.adexpress.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.bytedance.component.sdk.annotation.RequiresApi;
import com.bytedance.sdk.component.utils.ABk;

/* loaded from: classes.dex */
public class BrushMaskView extends View {
    private static final String Qhi = "BrushMaskView";
    private Canvas CJ;
    private Paint ROR;
    private Path Sf;
    private BitmapDrawable Tgh;
    private Paint WAv;

    /* renamed from: ac  reason: collision with root package name */
    private Bitmap f8266ac;
    private Paint cJ;

    /* renamed from: fl  reason: collision with root package name */
    private Paint f8267fl;

    /* renamed from: hm  reason: collision with root package name */
    private Path f8268hm;

    public BrushMaskView(Context context) {
        super(context);
        Qhi(context);
    }

    public void ac() {
        final int width = getWidth();
        final int height = getHeight();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(400L);
        valueAnimator.setIntValues(0, width);
        valueAnimator.setInterpolator(new TimeInterpolator() { // from class: com.bytedance.sdk.component.adexpress.widget.BrushMaskView.1
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                int i10 = (int) (width * f10);
                if (BrushMaskView.this.CJ != null) {
                    Canvas canvas = BrushMaskView.this.CJ;
                    int i11 = height;
                    canvas.drawRect(0.0f, i11 / 2, i10 - 50, i11 / 2, BrushMaskView.this.ROR);
                    BrushMaskView.this.CJ.drawCircle(i10, height / 2, 10.0f, BrushMaskView.this.ROR);
                }
                BrushMaskView.this.postInvalidate();
                return f10;
            }
        });
        valueAnimator.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f8266ac;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f8267fl);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(Qhi(i10), Qhi(i11));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Qhi(i10, i11);
    }

    public void setEraserSize(float f10) {
        this.ROR.setStrokeWidth(f10);
        this.WAv.setStrokeWidth(f10);
    }

    public void setMaskColor(int i10) {
        this.cJ.setColor(i10);
    }

    @RequiresApi(api = 21)
    public void setWatermark(int i10) {
        if (i10 == -1) {
            this.Tgh = null;
        } else {
            this.Tgh = new BitmapDrawable(BitmapFactory.decodeResource(getResources(), i10));
        }
    }

    private void Qhi(Context context) {
        Paint paint = new Paint();
        this.cJ = paint;
        paint.setAntiAlias(true);
        this.cJ.setDither(true);
        setMaskColor(-1426063361);
        Paint paint2 = new Paint();
        this.f8267fl = paint2;
        paint2.setAntiAlias(true);
        this.f8267fl.setDither(true);
        Paint paint3 = new Paint();
        this.WAv = paint3;
        paint3.setColor(-7829368);
        this.WAv.setAlpha(100);
        this.WAv.setAntiAlias(true);
        this.WAv.setDither(true);
        this.WAv.setStyle(Paint.Style.STROKE);
        this.WAv.setStrokeCap(Paint.Cap.ROUND);
        setWatermark(-1);
        Paint paint4 = new Paint();
        this.ROR = paint4;
        paint4.setAntiAlias(true);
        this.ROR.setDither(true);
        this.ROR.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.ROR.setStyle(Paint.Style.STROKE);
        this.ROR.setStrokeCap(Paint.Cap.ROUND);
        setEraserSize(60.0f);
        this.Sf = new Path();
        this.f8268hm = new Path();
    }

    private void cJ(float f10, float f11) {
        this.Sf.reset();
        this.f8268hm.reset();
        this.Sf.moveTo(f10, f11);
        this.f8268hm.moveTo(f10, f11);
    }

    public void cJ() {
        ac();
    }

    public void Qhi(float f10, float f11) {
        cJ(f10, f11);
        invalidate();
    }

    private void Qhi(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f8266ac = createBitmap;
            Canvas canvas = this.CJ;
            if (canvas == null) {
                this.CJ = new Canvas(this.f8266ac);
            } else {
                canvas.setBitmap(createBitmap);
            }
            this.CJ.drawRoundRect(new RectF(0.0f, 0.0f, i10, i11), 120.0f, 120.0f, this.cJ);
            if (this.Tgh != null) {
                this.Tgh.setBounds(new Rect(0, 0, i10, i11));
                this.Tgh.draw(this.CJ);
            }
        } catch (Exception e10) {
            ABk.Qhi(Qhi, e10.getMessage());
        }
    }

    private int Qhi(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        if (mode == Integer.MIN_VALUE) {
            return Math.min(0, size);
        }
        return 0;
    }

    public void Qhi() {
        Qhi(getWidth(), getHeight());
        invalidate();
    }
}
