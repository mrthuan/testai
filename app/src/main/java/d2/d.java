package d2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import androidx.activity.r;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes.dex */
public final class d extends Drawable implements Animatable {

    /* renamed from: g  reason: collision with root package name */
    public static final LinearInterpolator f16080g = new LinearInterpolator();

    /* renamed from: h  reason: collision with root package name */
    public static final m1.b f16081h = new m1.b();

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f16082i = {-16777216};

    /* renamed from: a  reason: collision with root package name */
    public final a f16083a;

    /* renamed from: b  reason: collision with root package name */
    public float f16084b;
    public final Resources c;

    /* renamed from: d  reason: collision with root package name */
    public ValueAnimator f16085d;

    /* renamed from: e  reason: collision with root package name */
    public float f16086e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16087f;

    /* compiled from: CircularProgressDrawable.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final RectF f16088a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        public final Paint f16089b;
        public final Paint c;

        /* renamed from: d  reason: collision with root package name */
        public final Paint f16090d;

        /* renamed from: e  reason: collision with root package name */
        public float f16091e;

        /* renamed from: f  reason: collision with root package name */
        public float f16092f;

        /* renamed from: g  reason: collision with root package name */
        public float f16093g;

        /* renamed from: h  reason: collision with root package name */
        public float f16094h;

        /* renamed from: i  reason: collision with root package name */
        public int[] f16095i;

        /* renamed from: j  reason: collision with root package name */
        public int f16096j;

        /* renamed from: k  reason: collision with root package name */
        public float f16097k;

        /* renamed from: l  reason: collision with root package name */
        public float f16098l;

        /* renamed from: m  reason: collision with root package name */
        public float f16099m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f16100n;

        /* renamed from: o  reason: collision with root package name */
        public Path f16101o;

        /* renamed from: p  reason: collision with root package name */
        public float f16102p;

        /* renamed from: q  reason: collision with root package name */
        public float f16103q;

        /* renamed from: r  reason: collision with root package name */
        public int f16104r;

        /* renamed from: s  reason: collision with root package name */
        public int f16105s;

        /* renamed from: t  reason: collision with root package name */
        public int f16106t;

        /* renamed from: u  reason: collision with root package name */
        public int f16107u;

        public a() {
            Paint paint = new Paint();
            this.f16089b = paint;
            Paint paint2 = new Paint();
            this.c = paint2;
            Paint paint3 = new Paint();
            this.f16090d = paint3;
            this.f16091e = 0.0f;
            this.f16092f = 0.0f;
            this.f16093g = 0.0f;
            this.f16094h = 5.0f;
            this.f16102p = 1.0f;
            this.f16106t = FunctionEval.FunctionID.EXTERNAL_FUNC;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public final void a(int i10) {
            this.f16096j = i10;
            this.f16107u = this.f16095i[i10];
        }
    }

    public d(Context context) {
        context.getClass();
        this.c = context.getResources();
        a aVar = new a();
        this.f16083a = aVar;
        aVar.f16095i = f16082i;
        aVar.a(0);
        aVar.f16094h = 2.5f;
        aVar.f16089b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(this, aVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f16080g);
        ofFloat.addListener(new c(this, aVar));
        this.f16085d = ofFloat;
    }

    public static void d(float f10, a aVar) {
        if (f10 > 0.75f) {
            float f11 = (f10 - 0.75f) / 0.25f;
            int[] iArr = aVar.f16095i;
            int i10 = aVar.f16096j;
            int i11 = iArr[i10];
            int i12 = iArr[(i10 + 1) % iArr.length];
            int i13 = (i11 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC;
            int i14 = (i11 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC;
            int i15 = (i11 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC;
            int i16 = i11 & FunctionEval.FunctionID.EXTERNAL_FUNC;
            aVar.f16107u = ((i13 + ((int) ((((i12 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC) - i13) * f11))) << 24) | ((i14 + ((int) ((((i12 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC) - i14) * f11))) << 16) | ((i15 + ((int) ((((i12 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC) - i15) * f11))) << 8) | (i16 + ((int) (f11 * ((i12 & FunctionEval.FunctionID.EXTERNAL_FUNC) - i16))));
            return;
        }
        aVar.f16107u = aVar.f16095i[aVar.f16096j];
    }

    public final void a(float f10, a aVar, boolean z10) {
        float interpolation;
        float f11;
        if (this.f16087f) {
            d(f10, aVar);
            float floor = (float) (Math.floor(aVar.f16099m / 0.8f) + 1.0d);
            float f12 = aVar.f16097k;
            float f13 = aVar.f16098l;
            aVar.f16091e = (((f13 - 0.01f) - f12) * f10) + f12;
            aVar.f16092f = f13;
            float f14 = aVar.f16099m;
            aVar.f16093g = r.l(floor, f14, f10, f14);
        } else if (f10 != 1.0f || z10) {
            float f15 = aVar.f16099m;
            int i10 = (f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1));
            m1.b bVar = f16081h;
            if (i10 < 0) {
                interpolation = aVar.f16097k;
                f11 = (bVar.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f16 = aVar.f16097k + 0.79f;
                interpolation = f16 - (((1.0f - bVar.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f11 = f16;
            }
            aVar.f16091e = interpolation;
            aVar.f16092f = f11;
            aVar.f16093g = (0.20999998f * f10) + f15;
            this.f16084b = (f10 + this.f16086e) * 216.0f;
        }
    }

    public final void b(float f10, float f11, float f12, float f13) {
        float f14 = this.c.getDisplayMetrics().density;
        float f15 = f11 * f14;
        a aVar = this.f16083a;
        aVar.f16094h = f15;
        aVar.f16089b.setStrokeWidth(f15);
        aVar.f16103q = f10 * f14;
        aVar.a(0);
        aVar.f16104r = (int) (f12 * f14);
        aVar.f16105s = (int) (f13 * f14);
    }

    public final void c(int i10) {
        if (i10 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f16084b, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.f16083a;
        RectF rectF = aVar.f16088a;
        float f10 = aVar.f16103q;
        float f11 = (aVar.f16094h / 2.0f) + f10;
        if (f10 <= 0.0f) {
            f11 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((aVar.f16104r * aVar.f16102p) / 2.0f, aVar.f16094h / 2.0f);
        }
        rectF.set(bounds.centerX() - f11, bounds.centerY() - f11, bounds.centerX() + f11, bounds.centerY() + f11);
        float f12 = aVar.f16091e;
        float f13 = aVar.f16093g;
        float f14 = (f12 + f13) * 360.0f;
        float f15 = ((aVar.f16092f + f13) * 360.0f) - f14;
        Paint paint = aVar.f16089b;
        paint.setColor(aVar.f16107u);
        paint.setAlpha(aVar.f16106t);
        float f16 = aVar.f16094h / 2.0f;
        rectF.inset(f16, f16);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.f16090d);
        float f17 = -f16;
        rectF.inset(f17, f17);
        canvas.drawArc(rectF, f14, f15, false, paint);
        if (aVar.f16100n) {
            Path path = aVar.f16101o;
            if (path == null) {
                Path path2 = new Path();
                aVar.f16101o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            aVar.f16101o.moveTo(0.0f, 0.0f);
            aVar.f16101o.lineTo(aVar.f16104r * aVar.f16102p, 0.0f);
            Path path3 = aVar.f16101o;
            float f18 = aVar.f16102p;
            path3.lineTo((aVar.f16104r * f18) / 2.0f, aVar.f16105s * f18);
            aVar.f16101o.offset((rectF.centerX() + (Math.min(rectF.width(), rectF.height()) / 2.0f)) - ((aVar.f16104r * aVar.f16102p) / 2.0f), (aVar.f16094h / 2.0f) + rectF.centerY());
            aVar.f16101o.close();
            Paint paint2 = aVar.c;
            paint2.setColor(aVar.f16107u);
            paint2.setAlpha(aVar.f16106t);
            canvas.save();
            canvas.rotate(f14 + f15, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.f16101o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f16083a.f16106t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f16085d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f16083a.f16106t = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f16083a.f16089b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f16085d.cancel();
        a aVar = this.f16083a;
        float f10 = aVar.f16091e;
        aVar.f16097k = f10;
        float f11 = aVar.f16092f;
        aVar.f16098l = f11;
        aVar.f16099m = aVar.f16093g;
        if (f11 != f10) {
            this.f16087f = true;
            this.f16085d.setDuration(666L);
            this.f16085d.start();
            return;
        }
        aVar.a(0);
        aVar.f16097k = 0.0f;
        aVar.f16098l = 0.0f;
        aVar.f16099m = 0.0f;
        aVar.f16091e = 0.0f;
        aVar.f16092f = 0.0f;
        aVar.f16093g = 0.0f;
        this.f16085d.setDuration(1332L);
        this.f16085d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f16085d.cancel();
        this.f16084b = 0.0f;
        a aVar = this.f16083a;
        if (aVar.f16100n) {
            aVar.f16100n = false;
        }
        aVar.a(0);
        aVar.f16097k = 0.0f;
        aVar.f16098l = 0.0f;
        aVar.f16099m = 0.0f;
        aVar.f16091e = 0.0f;
        aVar.f16092f = 0.0f;
        aVar.f16093g = 0.0f;
        invalidateSelf();
    }
}
