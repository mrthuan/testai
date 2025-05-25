package androidx.appcompat.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes.dex */
public class StarCheckView extends View {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f2405a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f2406b;
    public Bitmap c;

    /* renamed from: d  reason: collision with root package name */
    public Bitmap f2407d;

    /* renamed from: e  reason: collision with root package name */
    public Paint f2408e;

    /* renamed from: f  reason: collision with root package name */
    public Paint f2409f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2410g;

    /* renamed from: h  reason: collision with root package name */
    public ValueAnimator f2411h;

    /* renamed from: i  reason: collision with root package name */
    public ValueAnimator f2412i;

    /* renamed from: j  reason: collision with root package name */
    public ValueAnimator f2413j;

    /* renamed from: k  reason: collision with root package name */
    public a f2414k;

    /* loaded from: classes.dex */
    public interface a {
    }

    public StarCheckView(Context context) {
        super(context);
        this.f2410g = false;
        b();
    }

    public final void a(Canvas canvas, Bitmap bitmap, int i10) {
        if (bitmap != null && canvas != null) {
            if (i10 > 255) {
                i10 = 255;
            }
            this.f2408e.setAlpha(i10);
            canvas.drawBitmap(bitmap, (getWidth() - bitmap.getWidth()) / 2, (getHeight() - bitmap.getHeight()) / 2, this.f2408e);
        }
    }

    public final void b() {
        Bitmap decodeResource = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.lib_rate_star);
        this.c = decodeResource;
        this.f2406b = decodeResource;
        this.f2407d = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.lib_rate_star_on);
        this.f2408e = new Paint();
        Paint paint = new Paint();
        this.f2409f = paint;
        paint.setAntiAlias(true);
        this.f2409f.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    public final void c(boolean z10, boolean z11) {
        this.f2410g = z10;
        if (z10 && z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.4f, 1.0f);
            this.f2411h = ofFloat;
            ofFloat.addUpdateListener(new k0(this));
            this.f2411h.setDuration(1200L);
            this.f2411h.addListener(new l0(this));
            this.f2411h.setInterpolator(new OvershootInterpolator(2.0f));
            this.f2411h.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.4f);
            this.f2413j = ofFloat2;
            ofFloat2.setDuration(400L);
            this.f2413j.addListener(new m0(this));
            this.f2413j.setInterpolator(new OvershootInterpolator(2.0f));
            this.f2413j.start();
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.4f, 1.2f);
            this.f2412i = ofFloat3;
            ofFloat3.setDuration(1200L);
            this.f2412i.addListener(new n0(this));
            this.f2412i.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f2412i.start();
            return;
        }
        ValueAnimator valueAnimator = this.f2411h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f2411h = null;
        }
        ValueAnimator valueAnimator2 = this.f2413j;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.f2413j = null;
        }
        ValueAnimator valueAnimator3 = this.f2412i;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            this.f2412i = null;
        }
        postInvalidate();
    }

    public final synchronized void d() {
        this.f2406b = this.c;
        postInvalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int i10;
        int width;
        super.onDraw(canvas);
        if (getWidth() > 0 && getHeight() > 0) {
            float width2 = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            ValueAnimator valueAnimator = this.f2412i;
            if (valueAnimator != null) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (getWidth() > getHeight()) {
                    width = getHeight();
                } else {
                    width = getWidth();
                }
                float f10 = (width / 2.0f) * floatValue;
                this.f2409f.setAlpha(((int) (((1.2f - floatValue) / 1.2f) * 255.0f)) * 2);
                this.f2409f.setShader(new RadialGradient(width2, height, f10, new int[]{1728043553, 1728043553, -855647711}, (float[]) null, Shader.TileMode.CLAMP));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, f10, this.f2409f);
            }
            ValueAnimator valueAnimator2 = this.f2413j;
            int i11 = FunctionEval.FunctionID.EXTERNAL_FUNC;
            if (valueAnimator2 != null) {
                float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                i10 = (int) (((float) FunctionEval.FunctionID.EXTERNAL_FUNC) * floatValue2);
                canvas.save();
                canvas.scale(floatValue2, floatValue2, width2, height);
                z10 = true;
            } else {
                z10 = false;
                i10 = 255;
            }
            if (!this.f2410g) {
                a(canvas, this.f2406b, i10);
            }
            if (z10) {
                canvas.restore();
            }
            ValueAnimator valueAnimator3 = this.f2411h;
            if (valueAnimator3 != null) {
                float floatValue3 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                i11 = (int) (((float) FunctionEval.FunctionID.EXTERNAL_FUNC) * floatValue3);
                canvas.scale(floatValue3, floatValue3, width2, height);
            }
            if (this.f2410g) {
                a(canvas, this.f2407d, i11);
            }
        }
    }

    public void setCheck(boolean z10) {
        c(z10, false);
    }

    public synchronized void setInitStarDrawable(int i10) {
        Bitmap bitmap = this.f2405a;
        if (bitmap == null || bitmap.isRecycled()) {
            this.f2405a = BitmapFactory.decodeResource(getContext().getResources(), i10);
        }
        this.f2406b = this.f2405a;
        postInvalidate();
    }

    public void setOnAnimationEnd(a aVar) {
        this.f2414k = aVar;
    }

    public StarCheckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2410g = false;
        b();
    }

    public StarCheckView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2410g = false;
        b();
    }

    public void setPosition(int i10) {
    }
}
