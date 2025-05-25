package pdf.pdfreader.viewer.editor.free.ui.myview;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.Checkable;
import androidx.activity.r;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;

/* loaded from: classes3.dex */
public class SwitchButton extends View implements Checkable {
    public static final int T = (int) TypedValue.applyDimension(1, 58.0f, Resources.getSystem().getDisplayMetrics());
    public static final int U = (int) TypedValue.applyDimension(1, 36.0f, Resources.getSystem().getDisplayMetrics());
    public float A;
    public Paint B;
    public Paint C;
    public e D;
    public e E;
    public e F;
    public int G;
    public ValueAnimator H;
    public final ArgbEvaluator I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public long P;
    public final a Q;
    public final b R;
    public final c S;

    /* renamed from: a  reason: collision with root package name */
    public int f28116a;

    /* renamed from: b  reason: collision with root package name */
    public int f28117b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public float f28118d;

    /* renamed from: e  reason: collision with root package name */
    public float f28119e;

    /* renamed from: f  reason: collision with root package name */
    public float f28120f;

    /* renamed from: g  reason: collision with root package name */
    public float f28121g;

    /* renamed from: h  reason: collision with root package name */
    public float f28122h;

    /* renamed from: i  reason: collision with root package name */
    public float f28123i;

    /* renamed from: j  reason: collision with root package name */
    public float f28124j;

    /* renamed from: k  reason: collision with root package name */
    public int f28125k;

    /* renamed from: l  reason: collision with root package name */
    public int f28126l;

    /* renamed from: m  reason: collision with root package name */
    public int f28127m;

    /* renamed from: n  reason: collision with root package name */
    public int f28128n;

    /* renamed from: o  reason: collision with root package name */
    public int f28129o;

    /* renamed from: p  reason: collision with root package name */
    public int f28130p;

    /* renamed from: q  reason: collision with root package name */
    public float f28131q;

    /* renamed from: r  reason: collision with root package name */
    public int f28132r;

    /* renamed from: s  reason: collision with root package name */
    public int f28133s;

    /* renamed from: t  reason: collision with root package name */
    public float f28134t;

    /* renamed from: u  reason: collision with root package name */
    public float f28135u;

    /* renamed from: v  reason: collision with root package name */
    public float f28136v;

    /* renamed from: w  reason: collision with root package name */
    public float f28137w;

    /* renamed from: x  reason: collision with root package name */
    public int f28138x;

    /* renamed from: y  reason: collision with root package name */
    public int f28139y;

    /* renamed from: z  reason: collision with root package name */
    public float f28140z;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            int i10 = SwitchButton.T;
            SwitchButton switchButton = SwitchButton.this;
            int i11 = switchButton.G;
            boolean z11 = false;
            if (i11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (i11 != 0) {
                    z11 = true;
                }
                if (!z11 && switchButton.N) {
                    if (switchButton.H.isRunning()) {
                        switchButton.H.cancel();
                    }
                    switchButton.G = 1;
                    e.a(switchButton.E, switchButton.D);
                    e.a(switchButton.F, switchButton.D);
                    if (switchButton.isChecked()) {
                        e eVar = switchButton.F;
                        int i12 = switchButton.f28127m;
                        eVar.f28145b = i12;
                        eVar.f28144a = switchButton.A;
                        eVar.c = i12;
                    } else {
                        e eVar2 = switchButton.F;
                        eVar2.f28145b = switchButton.f28126l;
                        eVar2.f28144a = switchButton.f28140z;
                        eVar2.f28146d = switchButton.f28118d;
                    }
                    switchButton.H.start();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SwitchButton switchButton = SwitchButton.this;
            int i10 = switchButton.G;
            if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 5) {
                    e eVar = switchButton.D;
                    float f10 = switchButton.E.f28144a;
                    float l10 = r.l(switchButton.F.f28144a, f10, floatValue, f10);
                    eVar.f28144a = l10;
                    float f11 = switchButton.f28140z;
                    float f12 = (l10 - f11) / (switchButton.A - f11);
                    eVar.f28145b = ((Integer) switchButton.I.evaluate(f12, Integer.valueOf(switchButton.f28126l), Integer.valueOf(switchButton.f28127m))).intValue();
                    e eVar2 = switchButton.D;
                    eVar2.f28146d = switchButton.f28118d * f12;
                    eVar2.c = ((Integer) switchButton.I.evaluate(f12, 0, Integer.valueOf(switchButton.f28129o))).intValue();
                }
            } else {
                switchButton.D.c = ((Integer) switchButton.I.evaluate(floatValue, Integer.valueOf(switchButton.E.c), Integer.valueOf(switchButton.F.c))).intValue();
                e eVar3 = switchButton.D;
                e eVar4 = switchButton.E;
                float f13 = eVar4.f28146d;
                e eVar5 = switchButton.F;
                eVar3.f28146d = r.l(eVar5.f28146d, f13, floatValue, f13);
                if (switchButton.G != 1) {
                    float f14 = eVar4.f28144a;
                    eVar3.f28144a = r.l(eVar5.f28144a, f14, floatValue, f14);
                }
                eVar3.f28145b = ((Integer) switchButton.I.evaluate(floatValue, Integer.valueOf(eVar4.f28145b), Integer.valueOf(switchButton.F.f28145b))).intValue();
            }
            switchButton.postInvalidate();
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
    }

    /* loaded from: classes3.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public float f28144a;

        /* renamed from: b  reason: collision with root package name */
        public int f28145b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public float f28146d;

        public static void a(e eVar, e eVar2) {
            eVar.getClass();
            eVar.f28144a = eVar2.f28144a;
            eVar.f28145b = eVar2.f28145b;
            eVar.c = eVar2.c;
            eVar.f28146d = eVar2.f28146d;
        }
    }

    public SwitchButton(Context context) {
        super(context);
        new RectF();
        this.G = 0;
        this.I = new ArgbEvaluator();
        this.N = false;
        this.O = false;
        this.Q = new a();
        this.R = new b();
        this.S = new c();
        b(context, null);
    }

    public static float a(Context context, float f10) {
        return TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
    }

    public static int c(TypedArray typedArray, int i10, int i11) {
        if (typedArray == null) {
            return i11;
        }
        return typedArray.getColor(i10, i11);
    }

    private void setCheckedViewState(e eVar) {
        eVar.f28146d = this.f28118d;
        eVar.f28145b = this.f28127m;
        eVar.c = this.f28129o;
        eVar.f28144a = this.A;
        this.B.setColor(this.f28139y);
    }

    private void setUncheckViewState(e eVar) {
        eVar.f28146d = 0.0f;
        eVar.f28145b = this.f28126l;
        eVar.c = 0;
        eVar.f28144a = this.f28140z;
        this.B.setColor(this.f28138x);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArray;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (attributeSet != null) {
            typedArray = context.obtainStyledAttributes(attributeSet, pdf.pdfreader.viewer.editor.free.a.f23900k);
        } else {
            typedArray = null;
        }
        if (typedArray == null) {
            z10 = true;
        } else {
            z10 = typedArray.getBoolean(11, true);
        }
        this.L = z10;
        this.f28132r = c(typedArray, 17, -5592406);
        int a10 = (int) a(context, 1.5f);
        if (typedArray != null) {
            a10 = typedArray.getDimensionPixelOffset(19, a10);
        }
        this.f28133s = a10;
        this.f28134t = a(context, 10.0f);
        float a11 = a(context, 4.0f);
        if (typedArray != null) {
            a11 = typedArray.getDimension(18, a11);
        }
        this.f28135u = a11;
        this.f28136v = a(context, 4.0f);
        this.f28137w = a(context, 4.0f);
        int a12 = (int) a(context, 2.5f);
        if (typedArray != null) {
            a12 = typedArray.getDimensionPixelOffset(13, a12);
        }
        this.f28116a = a12;
        int a13 = (int) a(context, 1.5f);
        if (typedArray != null) {
            a13 = typedArray.getDimensionPixelOffset(12, a13);
        }
        this.f28117b = a13;
        this.c = c(typedArray, 10, 855638016);
        this.f28126l = c(typedArray, 15, -2236963);
        this.f28127m = c(typedArray, 4, -11414681);
        int a14 = (int) a(context, 1.0f);
        if (typedArray != null) {
            a14 = typedArray.getDimensionPixelOffset(1, a14);
        }
        this.f28128n = a14;
        this.f28129o = c(typedArray, 6, -1);
        int a15 = (int) a(context, 1.0f);
        if (typedArray != null) {
            a15 = typedArray.getDimensionPixelOffset(7, a15);
        }
        this.f28130p = a15;
        this.f28131q = a(context, 6.0f);
        int c10 = c(typedArray, 2, -1);
        this.f28138x = c(typedArray, 16, c10);
        this.f28139y = c(typedArray, 5, c10);
        int i10 = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;
        if (typedArray != null) {
            i10 = typedArray.getInt(8, OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
        }
        if (typedArray == null) {
            z11 = false;
        } else {
            z11 = typedArray.getBoolean(3, false);
        }
        this.J = z11;
        if (typedArray == null) {
            z12 = true;
        } else {
            z12 = typedArray.getBoolean(14, true);
        }
        this.M = z12;
        this.f28125k = c(typedArray, 0, -1);
        if (typedArray == null) {
            z13 = true;
        } else {
            z13 = typedArray.getBoolean(9, true);
        }
        this.K = z13;
        if (typedArray != null) {
            typedArray.recycle();
        }
        this.C = new Paint(1);
        Paint paint = new Paint(1);
        this.B = paint;
        paint.setColor(c10);
        if (this.L) {
            this.B.setShadowLayer(this.f28116a, 0.0f, this.f28117b, this.c);
        }
        this.D = new e();
        this.E = new e();
        this.F = new e();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.H = ofFloat;
        ofFloat.setDuration(i10);
        this.H.setRepeatCount(0);
        this.H.addUpdateListener(this.R);
        this.H.addListener(this.S);
        super.setClickable(true);
        setPadding(0, 0, 0, 0);
        setLayerType(1, null);
    }

    public final void d() {
        boolean z10;
        int i10 = this.G;
        boolean z11 = true;
        if (i10 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (i10 != 1 && i10 != 3) {
                z11 = false;
            }
            if (!z11) {
                return;
            }
        }
        if (this.H.isRunning()) {
            this.H.cancel();
        }
        this.G = 3;
        e.a(this.E, this.D);
        if (isChecked()) {
            setCheckedViewState(this.F);
        } else {
            setUncheckViewState(this.F);
        }
        this.H.start();
    }

    public final void e(boolean z10, boolean z11) {
        if (!isEnabled()) {
            return;
        }
        if (!this.O) {
            this.J = !this.J;
            return;
        }
        if (this.H.isRunning()) {
            this.H.cancel();
        }
        if (this.K && z10) {
            this.G = 5;
            e.a(this.E, this.D);
            if (isChecked()) {
                setUncheckViewState(this.F);
            } else {
                setCheckedViewState(this.F);
            }
            this.H.start();
            return;
        }
        this.J = !this.J;
        if (isChecked()) {
            setCheckedViewState(this.D);
        } else {
            setUncheckViewState(this.D);
        }
        postInvalidate();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.J;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.C.setStrokeWidth(this.f28128n);
        this.C.setStyle(Paint.Style.FILL);
        this.C.setColor(this.f28125k);
        float f10 = this.f28120f;
        float f11 = this.f28121g;
        float f12 = this.f28122h;
        float f13 = this.f28123i;
        float f14 = this.f28118d;
        canvas.drawRoundRect(f10, f11, f12, f13, f14, f14, this.C);
        this.C.setStyle(Paint.Style.STROKE);
        this.C.setColor(this.f28126l);
        float f15 = this.f28120f;
        float f16 = this.f28121g;
        float f17 = this.f28122h;
        float f18 = this.f28123i;
        float f19 = this.f28118d;
        canvas.drawRoundRect(f15, f16, f17, f18, f19, f19, this.C);
        if (this.M) {
            int i10 = this.f28132r;
            float f20 = this.f28122h - this.f28134t;
            float f21 = this.f28124j;
            float f22 = this.f28135u;
            Paint paint = this.C;
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(i10);
            paint.setStrokeWidth(this.f28133s);
            canvas.drawCircle(f20, f21, f22, paint);
        }
        float f23 = this.D.f28146d * 0.5f;
        this.C.setStyle(Paint.Style.STROKE);
        this.C.setColor(this.D.f28145b);
        this.C.setStrokeWidth((f23 * 2.0f) + this.f28128n);
        float f24 = this.f28118d;
        canvas.drawRoundRect(this.f28120f + f23, this.f28121g + f23, this.f28122h - f23, this.f28123i - f23, f24, f24, this.C);
        this.C.setStyle(Paint.Style.FILL);
        this.C.setStrokeWidth(1.0f);
        float f25 = this.f28120f;
        float f26 = this.f28121g;
        float f27 = this.f28118d * 2.0f;
        canvas.drawArc(f25, f26, f27 + f25, f27 + f26, 90.0f, 180.0f, true, this.C);
        float f28 = this.f28120f;
        float f29 = this.f28118d;
        float f30 = this.f28121g;
        canvas.drawRect(f28 + f29, f30, this.D.f28144a, (f29 * 2.0f) + f30, this.C);
        if (this.M) {
            int i11 = this.D.c;
            float f31 = this.f28120f + this.f28118d;
            float f32 = f31 - this.f28136v;
            float f33 = this.f28124j;
            float f34 = this.f28131q;
            Paint paint2 = this.C;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(i11);
            paint2.setStrokeWidth(this.f28130p);
            canvas.drawLine(f32, f33 - f34, f31 - this.f28137w, f33 + f34, paint2);
        }
        float f35 = this.D.f28144a;
        float f36 = this.f28124j;
        canvas.drawCircle(f35, f36, this.f28119e, this.B);
        this.C.setStyle(Paint.Style.STROKE);
        this.C.setStrokeWidth(1.0f);
        this.C.setColor(-2236963);
        canvas.drawCircle(f35, f36, this.f28119e, this.C);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode == 0 || mode == Integer.MIN_VALUE) {
            i10 = View.MeasureSpec.makeMeasureSpec(T, 1073741824);
        }
        if (mode2 == 0 || mode2 == Integer.MIN_VALUE) {
            i11 = View.MeasureSpec.makeMeasureSpec(U, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float max = Math.max(this.f28116a + this.f28117b, this.f28128n);
        float f10 = i11 - max;
        float f11 = i10 - max;
        float f12 = (f10 - max) * 0.5f;
        this.f28118d = f12;
        this.f28119e = f12 - this.f28128n;
        this.f28120f = max;
        this.f28121g = max;
        this.f28122h = f11;
        this.f28123i = f10;
        this.f28124j = (f10 + max) * 0.5f;
        this.f28140z = max + f12;
        this.A = f11 - f12;
        if (isChecked()) {
            setCheckedViewState(this.D);
        } else {
            setUncheckViewState(this.D);
        }
        this.O = true;
        postInvalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
        if (r1 != false) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.myview.SwitchButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (z10 == isChecked()) {
            postInvalidate();
        } else {
            e(this.K, false);
        }
    }

    public void setEnableEffect(boolean z10) {
        this.K = z10;
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(0, 0, 0, 0);
    }

    public void setShadowEffect(boolean z10) {
        if (this.L == z10) {
            return;
        }
        this.L = z10;
        if (z10) {
            this.B.setShadowLayer(this.f28116a, 0.0f, this.f28117b, this.c);
        } else {
            this.B.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        e(true, true);
    }

    public SwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new RectF();
        this.G = 0;
        this.I = new ArgbEvaluator();
        this.N = false;
        this.O = false;
        this.Q = new a();
        this.R = new b();
        this.S = new c();
        b(context, attributeSet);
    }

    public SwitchButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        new RectF();
        this.G = 0;
        this.I = new ArgbEvaluator();
        this.N = false;
        this.O = false;
        this.Q = new a();
        this.R = new b();
        this.S = new c();
        b(context, attributeSet);
    }

    /* loaded from: classes3.dex */
    public class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            SwitchButton switchButton = SwitchButton.this;
            int i10 = switchButton.G;
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            switchButton.J = !switchButton.J;
                            switchButton.G = 0;
                            switchButton.postInvalidate();
                            return;
                        }
                        return;
                    }
                    switchButton.G = 0;
                    switchButton.postInvalidate();
                    return;
                }
                switchButton.G = 0;
                switchButton.postInvalidate();
                return;
            }
            switchButton.G = 2;
            e eVar = switchButton.D;
            eVar.c = 0;
            eVar.f28146d = switchButton.f28118d;
            switchButton.postInvalidate();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public void setOnCheckedChangeListener(d dVar) {
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }
}
