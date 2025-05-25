package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.helper.widget.MotionEffect;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.motion.widget.d;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.a;
import androidx.core.widget.NestedScrollView;
import d0.b;
import f0.k;
import f0.l;
import f0.m;
import f0.n;
import f0.o;
import f0.p;
import f0.q;
import g0.a;
import g0.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l.t;
import x0.r;

/* loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements r {
    public static boolean F0;
    public final HashMap<View, n> A;
    public boolean A0;
    public long B;
    public final RectF B0;
    public float C;
    public View C0;
    public float D;
    public Matrix D0;
    public float E;
    public final ArrayList<Integer> E0;
    public long F;
    public float G;
    public boolean H;
    public boolean I;
    public i J;
    public int K;
    public e L;
    public boolean M;
    public final e0.b N;
    public final d O;
    public f0.b P;
    public int Q;
    public int R;
    public boolean S;
    public float T;
    public float U;
    public long V;
    public float W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f2999a0;

    /* renamed from: b0  reason: collision with root package name */
    public ArrayList<MotionHelper> f3000b0;

    /* renamed from: c0  reason: collision with root package name */
    public ArrayList<MotionHelper> f3001c0;

    /* renamed from: d0  reason: collision with root package name */
    public ArrayList<MotionHelper> f3002d0;

    /* renamed from: e0  reason: collision with root package name */
    public CopyOnWriteArrayList<i> f3003e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f3004f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f3005g0;

    /* renamed from: h0  reason: collision with root package name */
    public float f3006h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f3007i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f3008j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f3009k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f3010l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f3011m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f3012n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f3013o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f3014p0;

    /* renamed from: q  reason: collision with root package name */
    public androidx.constraintlayout.motion.widget.a f3015q;

    /* renamed from: q0  reason: collision with root package name */
    public int f3016q0;

    /* renamed from: r  reason: collision with root package name */
    public o f3017r;

    /* renamed from: r0  reason: collision with root package name */
    public float f3018r0;

    /* renamed from: s  reason: collision with root package name */
    public Interpolator f3019s;

    /* renamed from: s0  reason: collision with root package name */
    public final t f3020s0;

    /* renamed from: t  reason: collision with root package name */
    public float f3021t;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f3022t0;

    /* renamed from: u  reason: collision with root package name */
    public int f3023u;

    /* renamed from: u0  reason: collision with root package name */
    public h f3024u0;

    /* renamed from: v  reason: collision with root package name */
    public int f3025v;

    /* renamed from: v0  reason: collision with root package name */
    public Runnable f3026v0;

    /* renamed from: w  reason: collision with root package name */
    public int f3027w;

    /* renamed from: w0  reason: collision with root package name */
    public final Rect f3028w0;

    /* renamed from: x  reason: collision with root package name */
    public int f3029x;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f3030x0;

    /* renamed from: y  reason: collision with root package name */
    public int f3031y;

    /* renamed from: y0  reason: collision with root package name */
    public TransitionState f3032y0;

    /* renamed from: z  reason: collision with root package name */
    public boolean f3033z;

    /* renamed from: z0  reason: collision with root package name */
    public final f f3034z0;

    /* loaded from: classes.dex */
    public enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f3036a;

        public a(View view) {
            this.f3036a = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f3036a.setNestedScrollingEnabled(true);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MotionLayout.this.f3024u0.a();
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3038a;

        static {
            int[] iArr = new int[TransitionState.values().length];
            f3038a = iArr;
            try {
                iArr[TransitionState.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3038a[TransitionState.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3038a[TransitionState.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3038a[TransitionState.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends o {

        /* renamed from: a  reason: collision with root package name */
        public float f3039a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        public float f3040b = 0.0f;
        public float c;

        public d() {
        }

        @Override // f0.o
        public final float a() {
            return MotionLayout.this.f3021t;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = this.f3039a;
            int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            MotionLayout motionLayout = MotionLayout.this;
            if (i10 > 0) {
                float f12 = this.c;
                if (f11 / f12 < f10) {
                    f10 = f11 / f12;
                }
                motionLayout.f3021t = f11 - (f12 * f10);
                return ((f11 * f10) - (((f12 * f10) * f10) / 2.0f)) + this.f3040b;
            }
            float f13 = this.c;
            if ((-f11) / f13 < f10) {
                f10 = (-f11) / f13;
            }
            motionLayout.f3021t = (f13 * f10) + f11;
            return (((f13 * f10) * f10) / 2.0f) + (f11 * f10) + this.f3040b;
        }
    }

    /* loaded from: classes.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        public float[] f3042a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f3043b;
        public final float[] c;

        /* renamed from: d  reason: collision with root package name */
        public Path f3044d;

        /* renamed from: e  reason: collision with root package name */
        public final Paint f3045e;

        /* renamed from: f  reason: collision with root package name */
        public final Paint f3046f;

        /* renamed from: g  reason: collision with root package name */
        public final Paint f3047g;

        /* renamed from: h  reason: collision with root package name */
        public final Paint f3048h;

        /* renamed from: i  reason: collision with root package name */
        public final Paint f3049i;

        /* renamed from: j  reason: collision with root package name */
        public final float[] f3050j;

        /* renamed from: k  reason: collision with root package name */
        public int f3051k;

        /* renamed from: l  reason: collision with root package name */
        public final Rect f3052l = new Rect();

        /* renamed from: m  reason: collision with root package name */
        public final int f3053m = 1;

        public e() {
            Paint paint = new Paint();
            this.f3045e = paint;
            paint.setAntiAlias(true);
            paint.setColor(-21965);
            paint.setStrokeWidth(2.0f);
            paint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f3046f = paint2;
            paint2.setAntiAlias(true);
            paint2.setColor(-2067046);
            paint2.setStrokeWidth(2.0f);
            paint2.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f3047g = paint3;
            paint3.setAntiAlias(true);
            paint3.setColor(-13391360);
            paint3.setStrokeWidth(2.0f);
            paint3.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f3048h = paint4;
            paint4.setAntiAlias(true);
            paint4.setColor(-13391360);
            paint4.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f3050j = new float[8];
            Paint paint5 = new Paint();
            this.f3049i = paint5;
            paint5.setAntiAlias(true);
            paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
            this.c = new float[100];
            this.f3043b = new int[50];
        }

        public final void a(Canvas canvas, int i10, int i11, n nVar) {
            int i12;
            int i13;
            Paint paint;
            float f10;
            float f11;
            int i14;
            Paint paint2 = this.f3047g;
            int[] iArr = this.f3043b;
            int i15 = 4;
            if (i10 == 4) {
                boolean z10 = false;
                boolean z11 = false;
                for (int i16 = 0; i16 < this.f3051k; i16++) {
                    int i17 = iArr[i16];
                    if (i17 == 1) {
                        z10 = true;
                    }
                    if (i17 == 0) {
                        z11 = true;
                    }
                }
                if (z10) {
                    float[] fArr = this.f3042a;
                    canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint2);
                }
                if (z11) {
                    b(canvas);
                }
            }
            if (i10 == 2) {
                float[] fArr2 = this.f3042a;
                canvas.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], paint2);
            }
            if (i10 == 3) {
                b(canvas);
            }
            canvas.drawLines(this.f3042a, this.f3045e);
            View view = nVar.f16945b;
            if (view != null) {
                i12 = view.getWidth();
                i13 = nVar.f16945b.getHeight();
            } else {
                i12 = 0;
                i13 = 0;
            }
            int i18 = 1;
            while (i18 < i11 - 1) {
                if (i10 == i15 && iArr[i18 - 1] == 0) {
                    i14 = i18;
                } else {
                    int i19 = i18 * 2;
                    float[] fArr3 = this.c;
                    float f12 = fArr3[i19];
                    float f13 = fArr3[i19 + 1];
                    this.f3044d.reset();
                    this.f3044d.moveTo(f12, f13 + 10.0f);
                    this.f3044d.lineTo(f12 + 10.0f, f13);
                    this.f3044d.lineTo(f12, f13 - 10.0f);
                    this.f3044d.lineTo(f12 - 10.0f, f13);
                    this.f3044d.close();
                    int i20 = i18 - 1;
                    nVar.f16963u.get(i20);
                    Paint paint3 = this.f3049i;
                    if (i10 == i15) {
                        int i21 = iArr[i20];
                        if (i21 == 1) {
                            d(canvas, f12 - 0.0f, f13 - 0.0f);
                        } else if (i21 == 0) {
                            c(canvas, f12 - 0.0f, f13 - 0.0f);
                        } else if (i21 == 2) {
                            paint = paint3;
                            f10 = f13;
                            f11 = f12;
                            i14 = i18;
                            e(f12 - 0.0f, f13 - 0.0f, i12, i13, canvas);
                            canvas.drawPath(this.f3044d, paint);
                        }
                        paint = paint3;
                        f10 = f13;
                        f11 = f12;
                        i14 = i18;
                        canvas.drawPath(this.f3044d, paint);
                    } else {
                        paint = paint3;
                        f10 = f13;
                        f11 = f12;
                        i14 = i18;
                    }
                    if (i10 == 2) {
                        d(canvas, f11 - 0.0f, f10 - 0.0f);
                    }
                    if (i10 == 3) {
                        c(canvas, f11 - 0.0f, f10 - 0.0f);
                    }
                    if (i10 == 6) {
                        e(f11 - 0.0f, f10 - 0.0f, i12, i13, canvas);
                    }
                    canvas.drawPath(this.f3044d, paint);
                }
                i18 = i14 + 1;
                i15 = 4;
            }
            float[] fArr4 = this.f3042a;
            if (fArr4.length > 1) {
                float f14 = fArr4[0];
                float f15 = fArr4[1];
                Paint paint4 = this.f3046f;
                canvas.drawCircle(f14, f15, 8.0f, paint4);
                float[] fArr5 = this.f3042a;
                canvas.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint4);
            }
        }

        public final void b(Canvas canvas) {
            float[] fArr = this.f3042a;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            float min = Math.min(f10, f12);
            float max = Math.max(f11, f13);
            float max2 = Math.max(f10, f12);
            float max3 = Math.max(f11, f13);
            Paint paint = this.f3047g;
            canvas.drawLine(min, max, max2, max3, paint);
            canvas.drawLine(Math.min(f10, f12), Math.min(f11, f13), Math.min(f10, f12), Math.max(f11, f13), paint);
        }

        public final void c(Canvas canvas, float f10, float f11) {
            float[] fArr = this.f3042a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float min = Math.min(f12, f14);
            float max = Math.max(f13, f15);
            float min2 = f10 - Math.min(f12, f14);
            float max2 = Math.max(f13, f15) - f11;
            String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f14 - f12)) + 0.5d)) / 100.0f);
            Paint paint = this.f3048h;
            f(paint, str);
            Rect rect = this.f3052l;
            canvas.drawText(str, ((min2 / 2.0f) - (rect.width() / 2)) + min, f11 - 20.0f, paint);
            float min3 = Math.min(f12, f14);
            Paint paint2 = this.f3047g;
            canvas.drawLine(f10, f11, min3, f11, paint2);
            String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f15 - f13)) + 0.5d)) / 100.0f);
            f(paint, str2);
            canvas.drawText(str2, f10 + 5.0f, max - ((max2 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f10, f11, f10, Math.max(f13, f15), paint2);
        }

        public final void d(Canvas canvas, float f10, float f11) {
            float[] fArr = this.f3042a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f12 - f14, f13 - f15);
            float f16 = f14 - f12;
            float f17 = f15 - f13;
            float f18 = (((f11 - f13) * f17) + ((f10 - f12) * f16)) / (hypot * hypot);
            float f19 = f12 + (f16 * f18);
            float f20 = f13 + (f18 * f17);
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f19, f20);
            float hypot2 = (float) Math.hypot(f19 - f10, f20 - f11);
            String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            Paint paint = this.f3048h;
            f(paint, str);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (this.f3052l.width() / 2), -20.0f, paint);
            canvas.drawLine(f10, f11, f19, f20, this.f3047g);
        }

        public final void e(float f10, float f11, int i10, int i11, Canvas canvas) {
            StringBuilder sb2 = new StringBuilder("");
            MotionLayout motionLayout = MotionLayout.this;
            sb2.append(((int) ((((f10 - (i10 / 2)) * 100.0f) / (motionLayout.getWidth() - i10)) + 0.5d)) / 100.0f);
            String sb3 = sb2.toString();
            Paint paint = this.f3048h;
            f(paint, sb3);
            Rect rect = this.f3052l;
            canvas.drawText(sb3, ((f10 / 2.0f) - (rect.width() / 2)) + 0.0f, f11 - 20.0f, paint);
            float min = Math.min(0.0f, 1.0f);
            Paint paint2 = this.f3047g;
            canvas.drawLine(f10, f11, min, f11, paint2);
            String str = "" + (((int) ((((f11 - (i11 / 2)) * 100.0f) / (motionLayout.getHeight() - i11)) + 0.5d)) / 100.0f);
            f(paint, str);
            canvas.drawText(str, f10 + 5.0f, 0.0f - ((f11 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f10, f11, f10, Math.max(0.0f, 1.0f), paint2);
        }

        public final void f(Paint paint, String str) {
            paint.getTextBounds(str, 0, str.length(), this.f3052l);
        }
    }

    /* loaded from: classes.dex */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        public androidx.constraintlayout.core.widgets.d f3055a = new androidx.constraintlayout.core.widgets.d();

        /* renamed from: b  reason: collision with root package name */
        public androidx.constraintlayout.core.widgets.d f3056b = new androidx.constraintlayout.core.widgets.d();
        public androidx.constraintlayout.widget.a c = null;

        /* renamed from: d  reason: collision with root package name */
        public androidx.constraintlayout.widget.a f3057d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f3058e;

        /* renamed from: f  reason: collision with root package name */
        public int f3059f;

        public f() {
        }

        public static void c(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.core.widgets.d dVar2) {
            ConstraintWidget constraintWidget;
            ArrayList<ConstraintWidget> arrayList = dVar.f5504w0;
            HashMap<ConstraintWidget, ConstraintWidget> hashMap = new HashMap<>();
            hashMap.put(dVar, dVar2);
            dVar2.f5504w0.clear();
            dVar2.j(dVar, hashMap);
            Iterator<ConstraintWidget> it = arrayList.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                if (next instanceof androidx.constraintlayout.core.widgets.a) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.a();
                } else if (next instanceof androidx.constraintlayout.core.widgets.f) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.f();
                } else if (next instanceof androidx.constraintlayout.core.widgets.e) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.e();
                } else if (next instanceof androidx.constraintlayout.core.widgets.h) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.h();
                } else if (next instanceof c0.a) {
                    constraintWidget = new c0.b();
                } else {
                    constraintWidget = new ConstraintWidget();
                }
                dVar2.f5504w0.add(constraintWidget);
                ConstraintWidget constraintWidget2 = constraintWidget.W;
                if (constraintWidget2 != null) {
                    ((c0.c) constraintWidget2).f5504w0.remove(constraintWidget);
                    constraintWidget.G();
                }
                constraintWidget.W = dVar2;
                hashMap.put(next, constraintWidget);
            }
            Iterator<ConstraintWidget> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                hashMap.get(next2).j(next2, hashMap);
            }
        }

        public static ConstraintWidget d(androidx.constraintlayout.core.widgets.d dVar, View view) {
            if (dVar.f2825i0 == view) {
                return dVar;
            }
            ArrayList<ConstraintWidget> arrayList = dVar.f5504w0;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ConstraintWidget constraintWidget = arrayList.get(i10);
                if (constraintWidget.f2825i0 == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        public final void a() {
            HashMap<View, n> hashMap;
            SparseArray sparseArray;
            Interpolator loadInterpolator;
            MotionLayout motionLayout = MotionLayout.this;
            int childCount = motionLayout.getChildCount();
            HashMap<View, n> hashMap2 = motionLayout.A;
            hashMap2.clear();
            SparseArray sparseArray2 = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = motionLayout.getChildAt(i10);
                n nVar = new n(childAt);
                int id2 = childAt.getId();
                iArr[i10] = id2;
                sparseArray2.put(id2, nVar);
                hashMap2.put(childAt, nVar);
            }
            int i11 = 0;
            while (i11 < childCount) {
                View childAt2 = motionLayout.getChildAt(i11);
                n nVar2 = hashMap2.get(childAt2);
                if (nVar2 == null) {
                    hashMap = hashMap2;
                    sparseArray = sparseArray2;
                } else {
                    androidx.constraintlayout.widget.a aVar = this.c;
                    Rect rect = nVar2.f16944a;
                    if (aVar != null) {
                        ConstraintWidget d10 = d(this.f3055a, childAt2);
                        if (d10 != null) {
                            Rect r4 = MotionLayout.r(motionLayout, d10);
                            androidx.constraintlayout.widget.a aVar2 = this.c;
                            int width = motionLayout.getWidth();
                            int height = motionLayout.getHeight();
                            int i12 = aVar2.c;
                            if (i12 != 0) {
                                n.g(r4, rect, i12, width, height);
                            }
                            p pVar = nVar2.f16948f;
                            pVar.c = 0.0f;
                            pVar.f16972d = 0.0f;
                            nVar2.f(pVar);
                            hashMap = hashMap2;
                            sparseArray = sparseArray2;
                            pVar.d(r4.left, r4.top, r4.width(), r4.height());
                            a.C0012a k10 = aVar2.k(nVar2.c);
                            pVar.a(k10);
                            a.c cVar = k10.f3372d;
                            nVar2.f16954l = cVar.f3436g;
                            nVar2.f16950h.d(r4, aVar2, i12, nVar2.c);
                            nVar2.C = k10.f3374f.f3455i;
                            nVar2.E = cVar.f3439j;
                            nVar2.F = cVar.f3438i;
                            Context context = nVar2.f16945b.getContext();
                            int i13 = cVar.f3441l;
                            String str = cVar.f3440k;
                            int i14 = cVar.f3442m;
                            if (i13 != -2) {
                                if (i13 != -1) {
                                    if (i13 != 0) {
                                        if (i13 != 1) {
                                            if (i13 != 2) {
                                                if (i13 != 4) {
                                                    if (i13 != 5) {
                                                        loadInterpolator = null;
                                                    } else {
                                                        loadInterpolator = new OvershootInterpolator();
                                                    }
                                                } else {
                                                    loadInterpolator = new BounceInterpolator();
                                                }
                                            } else {
                                                loadInterpolator = new DecelerateInterpolator();
                                            }
                                        } else {
                                            loadInterpolator = new AccelerateInterpolator();
                                        }
                                    } else {
                                        loadInterpolator = new AccelerateDecelerateInterpolator();
                                    }
                                } else {
                                    loadInterpolator = new m(b0.c.c(str));
                                }
                            } else {
                                loadInterpolator = AnimationUtils.loadInterpolator(context, i14);
                            }
                            nVar2.G = loadInterpolator;
                        } else {
                            hashMap = hashMap2;
                            sparseArray = sparseArray2;
                            if (motionLayout.K != 0) {
                                f0.a.b();
                                f0.a.d(childAt2);
                                childAt2.getClass();
                            }
                        }
                    } else {
                        hashMap = hashMap2;
                        sparseArray = sparseArray2;
                    }
                    if (this.f3057d != null) {
                        ConstraintWidget d11 = d(this.f3056b, childAt2);
                        if (d11 != null) {
                            Rect r10 = MotionLayout.r(motionLayout, d11);
                            androidx.constraintlayout.widget.a aVar3 = this.f3057d;
                            int width2 = motionLayout.getWidth();
                            int height2 = motionLayout.getHeight();
                            int i15 = aVar3.c;
                            if (i15 != 0) {
                                n.g(r10, rect, i15, width2, height2);
                            } else {
                                rect = r10;
                            }
                            p pVar2 = nVar2.f16949g;
                            pVar2.c = 1.0f;
                            pVar2.f16972d = 1.0f;
                            nVar2.f(pVar2);
                            pVar2.d(rect.left, rect.top, rect.width(), rect.height());
                            pVar2.a(aVar3.k(nVar2.c));
                            nVar2.f16951i.d(rect, aVar3, i15, nVar2.c);
                        } else if (motionLayout.K != 0) {
                            f0.a.b();
                            f0.a.d(childAt2);
                            childAt2.getClass();
                        }
                    }
                }
                i11++;
                hashMap2 = hashMap;
                sparseArray2 = sparseArray;
            }
            SparseArray sparseArray3 = sparseArray2;
            int i16 = 0;
            while (i16 < childCount) {
                SparseArray sparseArray4 = sparseArray3;
                n nVar3 = (n) sparseArray4.get(iArr[i16]);
                int i17 = nVar3.f16948f.f16979k;
                if (i17 != -1) {
                    n nVar4 = (n) sparseArray4.get(i17);
                    nVar3.f16948f.f(nVar4, nVar4.f16948f);
                    nVar3.f16949g.f(nVar4, nVar4.f16949g);
                }
                i16++;
                sparseArray3 = sparseArray4;
            }
        }

        public final void b(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            MotionLayout motionLayout = MotionLayout.this;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            if (motionLayout.f3025v == motionLayout.getStartState()) {
                androidx.constraintlayout.core.widgets.d dVar = this.f3056b;
                androidx.constraintlayout.widget.a aVar = this.f3057d;
                if (aVar != null && aVar.c != 0) {
                    i15 = i11;
                } else {
                    i15 = i10;
                }
                if (aVar != null && aVar.c != 0) {
                    i16 = i10;
                } else {
                    i16 = i11;
                }
                motionLayout.i(dVar, optimizationLevel, i15, i16);
                androidx.constraintlayout.widget.a aVar2 = this.c;
                if (aVar2 != null) {
                    androidx.constraintlayout.core.widgets.d dVar2 = this.f3055a;
                    int i18 = aVar2.c;
                    if (i18 == 0) {
                        i17 = i10;
                    } else {
                        i17 = i11;
                    }
                    if (i18 == 0) {
                        i10 = i11;
                    }
                    motionLayout.i(dVar2, optimizationLevel, i17, i10);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.a aVar3 = this.c;
            if (aVar3 != null) {
                androidx.constraintlayout.core.widgets.d dVar3 = this.f3055a;
                int i19 = aVar3.c;
                if (i19 == 0) {
                    i13 = i10;
                } else {
                    i13 = i11;
                }
                if (i19 == 0) {
                    i14 = i11;
                } else {
                    i14 = i10;
                }
                motionLayout.i(dVar3, optimizationLevel, i13, i14);
            }
            androidx.constraintlayout.core.widgets.d dVar4 = this.f3056b;
            androidx.constraintlayout.widget.a aVar4 = this.f3057d;
            if (aVar4 != null && aVar4.c != 0) {
                i12 = i11;
            } else {
                i12 = i10;
            }
            if (aVar4 == null || aVar4.c == 0) {
                i10 = i11;
            }
            motionLayout.i(dVar4, optimizationLevel, i12, i10);
        }

        public final void e(androidx.constraintlayout.widget.a aVar, androidx.constraintlayout.widget.a aVar2) {
            this.c = aVar;
            this.f3057d = aVar2;
            this.f3055a = new androidx.constraintlayout.core.widgets.d();
            androidx.constraintlayout.core.widgets.d dVar = new androidx.constraintlayout.core.widgets.d();
            this.f3056b = dVar;
            androidx.constraintlayout.core.widgets.d dVar2 = this.f3055a;
            boolean z10 = MotionLayout.F0;
            MotionLayout motionLayout = MotionLayout.this;
            androidx.constraintlayout.core.widgets.d dVar3 = motionLayout.c;
            b.InterfaceC0188b interfaceC0188b = dVar3.A0;
            dVar2.A0 = interfaceC0188b;
            dVar2.f2907y0.f16023f = interfaceC0188b;
            b.InterfaceC0188b interfaceC0188b2 = dVar3.A0;
            dVar.A0 = interfaceC0188b2;
            dVar.f2907y0.f16023f = interfaceC0188b2;
            dVar2.f5504w0.clear();
            this.f3056b.f5504w0.clear();
            androidx.constraintlayout.core.widgets.d dVar4 = this.f3055a;
            androidx.constraintlayout.core.widgets.d dVar5 = motionLayout.c;
            c(dVar5, dVar4);
            c(dVar5, this.f3056b);
            if (motionLayout.E > 0.5d) {
                if (aVar != null) {
                    g(this.f3055a, aVar);
                }
                g(this.f3056b, aVar2);
            } else {
                g(this.f3056b, aVar2);
                if (aVar != null) {
                    g(this.f3055a, aVar);
                }
            }
            this.f3055a.B0 = motionLayout.f();
            androidx.constraintlayout.core.widgets.d dVar6 = this.f3055a;
            dVar6.f2906x0.c(dVar6);
            this.f3056b.B0 = motionLayout.f();
            androidx.constraintlayout.core.widgets.d dVar7 = this.f3056b;
            dVar7.f2906x0.c(dVar7);
            ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    androidx.constraintlayout.core.widgets.d dVar8 = this.f3055a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar8.P(dimensionBehaviour);
                    this.f3056b.P(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    androidx.constraintlayout.core.widgets.d dVar9 = this.f3055a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar9.Q(dimensionBehaviour2);
                    this.f3056b.Q(dimensionBehaviour2);
                }
            }
        }

        public final void f() {
            boolean z10;
            int i10;
            boolean z11;
            boolean z12;
            HashMap<View, n> hashMap;
            int i11;
            float f10;
            boolean z13;
            float f11;
            float f12;
            boolean z14;
            MotionLayout motionLayout = MotionLayout.this;
            int i12 = motionLayout.f3029x;
            int i13 = motionLayout.f3031y;
            int mode = View.MeasureSpec.getMode(i12);
            int mode2 = View.MeasureSpec.getMode(i13);
            motionLayout.f3014p0 = mode;
            motionLayout.f3016q0 = mode2;
            motionLayout.getOptimizationLevel();
            b(i12, i13);
            int i14 = 0;
            boolean z15 = true;
            if ((motionLayout.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                b(i12, i13);
                motionLayout.f3010l0 = this.f3055a.u();
                motionLayout.f3011m0 = this.f3055a.o();
                motionLayout.f3012n0 = this.f3056b.u();
                int o10 = this.f3056b.o();
                motionLayout.f3013o0 = o10;
                if (motionLayout.f3010l0 == motionLayout.f3012n0 && motionLayout.f3011m0 == o10) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                motionLayout.f3009k0 = z14;
            }
            int i15 = motionLayout.f3010l0;
            int i16 = motionLayout.f3011m0;
            int i17 = motionLayout.f3014p0;
            if (i17 == Integer.MIN_VALUE || i17 == 0) {
                i15 = (int) ((motionLayout.f3018r0 * (motionLayout.f3012n0 - i15)) + i15);
            }
            int i18 = i15;
            int i19 = motionLayout.f3016q0;
            if (i19 != Integer.MIN_VALUE && i19 != 0) {
                i10 = i16;
            } else {
                i10 = (int) ((motionLayout.f3018r0 * (motionLayout.f3013o0 - i16)) + i16);
            }
            androidx.constraintlayout.core.widgets.d dVar = this.f3055a;
            if (!dVar.K0 && !this.f3056b.K0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!dVar.L0 && !this.f3056b.L0) {
                z12 = false;
            } else {
                z12 = true;
            }
            motionLayout.h(i12, i13, i18, z11, z12, i10);
            int childCount = motionLayout.getChildCount();
            motionLayout.f3034z0.a();
            motionLayout.I = true;
            SparseArray sparseArray = new SparseArray();
            int i20 = 0;
            while (true) {
                hashMap = motionLayout.A;
                if (i20 >= childCount) {
                    break;
                }
                View childAt = motionLayout.getChildAt(i20);
                sparseArray.put(childAt.getId(), hashMap.get(childAt));
                i20++;
            }
            int width = motionLayout.getWidth();
            int height = motionLayout.getHeight();
            a.b bVar = motionLayout.f3015q.c;
            if (bVar != null) {
                i11 = bVar.f3100p;
            } else {
                i11 = -1;
            }
            if (i11 != -1) {
                for (int i21 = 0; i21 < childCount; i21++) {
                    n nVar = hashMap.get(motionLayout.getChildAt(i21));
                    if (nVar != null) {
                        nVar.B = i11;
                    }
                }
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = new int[hashMap.size()];
            int i22 = 0;
            for (int i23 = 0; i23 < childCount; i23++) {
                n nVar2 = hashMap.get(motionLayout.getChildAt(i23));
                int i24 = nVar2.f16948f.f16979k;
                if (i24 != -1) {
                    sparseBooleanArray.put(i24, true);
                    iArr[i22] = nVar2.f16948f.f16979k;
                    i22++;
                }
            }
            if (motionLayout.f3002d0 != null) {
                for (int i25 = 0; i25 < i22; i25++) {
                    n nVar3 = hashMap.get(motionLayout.findViewById(iArr[i25]));
                    if (nVar3 != null) {
                        motionLayout.f3015q.f(nVar3);
                    }
                }
                Iterator<MotionHelper> it = motionLayout.f3002d0.iterator();
                while (it.hasNext()) {
                    it.next().u(motionLayout, hashMap);
                }
                for (int i26 = 0; i26 < i22; i26++) {
                    n nVar4 = hashMap.get(motionLayout.findViewById(iArr[i26]));
                    if (nVar4 != null) {
                        nVar4.h(width, height, motionLayout.getNanoTime());
                    }
                }
            } else {
                for (int i27 = 0; i27 < i22; i27++) {
                    n nVar5 = hashMap.get(motionLayout.findViewById(iArr[i27]));
                    if (nVar5 != null) {
                        motionLayout.f3015q.f(nVar5);
                        nVar5.h(width, height, motionLayout.getNanoTime());
                    }
                }
            }
            for (int i28 = 0; i28 < childCount; i28++) {
                View childAt2 = motionLayout.getChildAt(i28);
                n nVar6 = hashMap.get(childAt2);
                if (!sparseBooleanArray.get(childAt2.getId()) && nVar6 != null) {
                    motionLayout.f3015q.f(nVar6);
                    nVar6.h(width, height, motionLayout.getNanoTime());
                }
            }
            a.b bVar2 = motionLayout.f3015q.c;
            if (bVar2 != null) {
                f10 = bVar2.f3093i;
            } else {
                f10 = 0.0f;
            }
            if (f10 != 0.0f) {
                if (f10 < 0.0d) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                float abs = Math.abs(f10);
                float f13 = -3.4028235E38f;
                float f14 = Float.MAX_VALUE;
                float f15 = -3.4028235E38f;
                float f16 = Float.MAX_VALUE;
                int i29 = 0;
                while (true) {
                    if (i29 < childCount) {
                        n nVar7 = hashMap.get(motionLayout.getChildAt(i29));
                        if (!Float.isNaN(nVar7.f16954l)) {
                            break;
                        }
                        p pVar = nVar7.f16949g;
                        float f17 = pVar.f16973e;
                        float f18 = pVar.f16974f;
                        if (z13) {
                            f12 = f18 - f17;
                        } else {
                            f12 = f18 + f17;
                        }
                        f16 = Math.min(f16, f12);
                        f15 = Math.max(f15, f12);
                        i29++;
                    } else {
                        z15 = false;
                        break;
                    }
                }
                if (z15) {
                    for (int i30 = 0; i30 < childCount; i30++) {
                        n nVar8 = hashMap.get(motionLayout.getChildAt(i30));
                        if (!Float.isNaN(nVar8.f16954l)) {
                            f14 = Math.min(f14, nVar8.f16954l);
                            f13 = Math.max(f13, nVar8.f16954l);
                        }
                    }
                    while (i14 < childCount) {
                        n nVar9 = hashMap.get(motionLayout.getChildAt(i14));
                        if (!Float.isNaN(nVar9.f16954l)) {
                            nVar9.f16956n = 1.0f / (1.0f - abs);
                            if (z13) {
                                nVar9.f16955m = abs - (((f13 - nVar9.f16954l) / (f13 - f14)) * abs);
                            } else {
                                nVar9.f16955m = abs - (((nVar9.f16954l - f14) * abs) / (f13 - f14));
                            }
                        }
                        i14++;
                    }
                    return;
                }
                while (i14 < childCount) {
                    n nVar10 = hashMap.get(motionLayout.getChildAt(i14));
                    p pVar2 = nVar10.f16949g;
                    float f19 = pVar2.f16973e;
                    float f20 = pVar2.f16974f;
                    if (z13) {
                        f11 = f20 - f19;
                    } else {
                        f11 = f20 + f19;
                    }
                    nVar10.f16956n = 1.0f / (1.0f - abs);
                    nVar10.f16955m = abs - (((f11 - f16) * abs) / (f15 - f16));
                    i14++;
                }
            }
        }

        public final void g(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.a aVar) {
            a.C0012a c0012a;
            a.C0012a c0012a2;
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            Constraints.a aVar2 = new Constraints.a();
            sparseArray.clear();
            sparseArray.put(0, dVar);
            MotionLayout motionLayout = MotionLayout.this;
            sparseArray.put(motionLayout.getId(), dVar);
            if (aVar != null && aVar.c != 0) {
                androidx.constraintlayout.core.widgets.d dVar2 = this.f3056b;
                int optimizationLevel = motionLayout.getOptimizationLevel();
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
                boolean z10 = MotionLayout.F0;
                motionLayout.i(dVar2, optimizationLevel, makeMeasureSpec, makeMeasureSpec2);
            }
            Iterator<ConstraintWidget> it = dVar.f5504w0.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.f2829k0 = true;
                sparseArray.put(((View) next.f2825i0).getId(), next);
            }
            Iterator<ConstraintWidget> it2 = dVar.f5504w0.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = (View) next2.f2825i0;
                int id2 = view.getId();
                HashMap<Integer, a.C0012a> hashMap = aVar.f3369f;
                if (hashMap.containsKey(Integer.valueOf(id2)) && (c0012a2 = hashMap.get(Integer.valueOf(id2))) != null) {
                    c0012a2.a(aVar2);
                }
                next2.R(aVar.k(view.getId()).f3373e.c);
                next2.O(aVar.k(view.getId()).f3373e.f3394d);
                if (view instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) view;
                    int id3 = constraintHelper.getId();
                    HashMap<Integer, a.C0012a> hashMap2 = aVar.f3369f;
                    if (hashMap2.containsKey(Integer.valueOf(id3)) && (c0012a = hashMap2.get(Integer.valueOf(id3))) != null && (next2 instanceof c0.b)) {
                        constraintHelper.o(c0012a, (c0.b) next2, aVar2, sparseArray);
                    }
                    if (view instanceof Barrier) {
                        ((Barrier) view).t();
                    }
                }
                aVar2.resolveLayoutDirection(motionLayout.getLayoutDirection());
                MotionLayout motionLayout2 = MotionLayout.this;
                boolean z11 = MotionLayout.F0;
                motionLayout2.b(false, view, next2, aVar2, sparseArray);
                if (aVar.k(view.getId()).c.c == 1) {
                    next2.f2827j0 = view.getVisibility();
                } else {
                    next2.f2827j0 = aVar.k(view.getId()).c.f3444b;
                }
            }
            Iterator<ConstraintWidget> it3 = dVar.f5504w0.iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof androidx.constraintlayout.core.widgets.i) {
                    c0.a aVar3 = (c0.a) next3;
                    ((ConstraintHelper) next3.f2825i0).s(aVar3, sparseArray);
                    androidx.constraintlayout.core.widgets.i iVar = (androidx.constraintlayout.core.widgets.i) aVar3;
                    for (int i10 = 0; i10 < iVar.f5503x0; i10++) {
                        ConstraintWidget constraintWidget = iVar.f5502w0[i10];
                        if (constraintWidget != null) {
                            constraintWidget.H = true;
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: b  reason: collision with root package name */
        public static final g f3061b = new g();

        /* renamed from: a  reason: collision with root package name */
        public VelocityTracker f3062a;
    }

    /* loaded from: classes.dex */
    public class h {

        /* renamed from: a  reason: collision with root package name */
        public float f3063a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f3064b = Float.NaN;
        public int c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f3065d = -1;

        public h() {
        }

        public final void a() {
            int i10 = this.c;
            MotionLayout motionLayout = MotionLayout.this;
            if (i10 != -1 || this.f3065d != -1) {
                if (i10 == -1) {
                    int i11 = this.f3065d;
                    if (!motionLayout.isAttachedToWindow()) {
                        if (motionLayout.f3024u0 == null) {
                            motionLayout.f3024u0 = new h();
                        }
                        motionLayout.f3024u0.f3065d = i11;
                    } else {
                        motionLayout.I(i11, -1);
                    }
                } else {
                    int i12 = this.f3065d;
                    if (i12 == -1) {
                        motionLayout.E(i10);
                    } else {
                        motionLayout.F(i10, i12);
                    }
                }
                motionLayout.setState(TransitionState.SETUP);
            }
            if (Float.isNaN(this.f3064b)) {
                if (Float.isNaN(this.f3063a)) {
                    return;
                }
                motionLayout.setProgress(this.f3063a);
                return;
            }
            float f10 = this.f3063a;
            float f11 = this.f3064b;
            if (!motionLayout.isAttachedToWindow()) {
                if (motionLayout.f3024u0 == null) {
                    motionLayout.f3024u0 = new h();
                }
                h hVar = motionLayout.f3024u0;
                hVar.f3063a = f10;
                hVar.f3064b = f11;
            } else {
                motionLayout.setProgress(f10);
                motionLayout.setState(TransitionState.MOVING);
                motionLayout.f3021t = f11;
                float f12 = 0.0f;
                int i13 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                if (i13 != 0) {
                    if (i13 > 0) {
                        f12 = 1.0f;
                    }
                    motionLayout.s(f12);
                } else if (f10 != 0.0f && f10 != 1.0f) {
                    if (f10 > 0.5f) {
                        f12 = 1.0f;
                    }
                    motionLayout.s(f12);
                }
            }
            this.f3063a = Float.NaN;
            this.f3064b = Float.NaN;
            this.c = -1;
            this.f3065d = -1;
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        void a();

        void b(int i10, MotionLayout motionLayout);

        void c();

        void d();
    }

    public MotionLayout(Context context) {
        super(context);
        this.f3019s = null;
        this.f3021t = 0.0f;
        this.f3023u = -1;
        this.f3025v = -1;
        this.f3027w = -1;
        this.f3029x = 0;
        this.f3031y = 0;
        this.f3033z = true;
        this.A = new HashMap<>();
        this.B = 0L;
        this.C = 1.0f;
        this.D = 0.0f;
        this.E = 0.0f;
        this.G = 0.0f;
        this.I = false;
        this.K = 0;
        this.M = false;
        this.N = new e0.b();
        this.O = new d();
        this.S = false;
        this.f2999a0 = false;
        this.f3000b0 = null;
        this.f3001c0 = null;
        this.f3002d0 = null;
        this.f3003e0 = null;
        this.f3004f0 = 0;
        this.f3005g0 = -1L;
        this.f3006h0 = 0.0f;
        this.f3007i0 = 0;
        this.f3008j0 = 0.0f;
        this.f3009k0 = false;
        this.f3020s0 = new t(1);
        this.f3022t0 = false;
        this.f3026v0 = null;
        new HashMap();
        this.f3028w0 = new Rect();
        this.f3030x0 = false;
        this.f3032y0 = TransitionState.UNDEFINED;
        this.f3034z0 = new f();
        this.A0 = false;
        this.B0 = new RectF();
        this.C0 = null;
        this.D0 = null;
        this.E0 = new ArrayList<>();
        A(null);
    }

    public static Rect r(MotionLayout motionLayout, ConstraintWidget constraintWidget) {
        motionLayout.getClass();
        int w7 = constraintWidget.w();
        Rect rect = motionLayout.f3028w0;
        rect.top = w7;
        rect.left = constraintWidget.v();
        rect.right = constraintWidget.u() + rect.left;
        rect.bottom = constraintWidget.o() + rect.top;
        return rect;
    }

    public final void A(AttributeSet attributeSet) {
        androidx.constraintlayout.motion.widget.a aVar;
        androidx.constraintlayout.motion.widget.a aVar2;
        F0 = isInEditMode();
        int i10 = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g0.d.f17358u);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z10 = true;
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                int i12 = 2;
                if (index == 2) {
                    this.f3015q = new androidx.constraintlayout.motion.widget.a(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.f3025v = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.G = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.I = true;
                } else if (index == 0) {
                    z10 = obtainStyledAttributes.getBoolean(index, z10);
                } else if (index == 5) {
                    if (this.K == 0) {
                        if (!obtainStyledAttributes.getBoolean(index, false)) {
                            i12 = 0;
                        }
                        this.K = i12;
                    }
                } else if (index == 3) {
                    this.K = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (!z10) {
                this.f3015q = null;
            }
        }
        if (this.K != 0 && (aVar2 = this.f3015q) != null) {
            int h10 = aVar2.h();
            androidx.constraintlayout.motion.widget.a aVar3 = this.f3015q;
            androidx.constraintlayout.widget.a b10 = aVar3.b(aVar3.h());
            f0.a.c(getContext(), h10);
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (b10.l(childAt.getId()) == null) {
                    f0.a.d(childAt);
                }
            }
            Integer[] numArr = (Integer[]) b10.f3369f.keySet().toArray(new Integer[0]);
            int length = numArr.length;
            int[] iArr = new int[length];
            for (int i14 = 0; i14 < length; i14++) {
                iArr[i14] = numArr[i14].intValue();
            }
            for (int i15 = 0; i15 < length; i15++) {
                int i16 = iArr[i15];
                f0.a.c(getContext(), i16);
                findViewById(iArr[i15]);
                int i17 = b10.k(i16).f3373e.f3394d;
                int i18 = b10.k(i16).f3373e.c;
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            Iterator<a.b> it = this.f3015q.f3069d.iterator();
            while (it.hasNext()) {
                a.b next = it.next();
                a.b bVar = this.f3015q.c;
                int i19 = next.f3088d;
                int i20 = next.c;
                f0.a.c(getContext(), i19);
                f0.a.c(getContext(), i20);
                sparseIntArray.get(i19);
                sparseIntArray2.get(i20);
                sparseIntArray.put(i19, i20);
                sparseIntArray2.put(i20, i19);
                this.f3015q.b(i19);
                this.f3015q.b(i20);
            }
        }
        if (this.f3025v == -1 && (aVar = this.f3015q) != null) {
            this.f3025v = aVar.h();
            this.f3023u = this.f3015q.h();
            a.b bVar2 = this.f3015q.c;
            if (bVar2 != null) {
                i10 = bVar2.c;
            }
            this.f3027w = i10;
        }
    }

    public final void B() {
        a.b bVar;
        androidx.constraintlayout.motion.widget.b bVar2;
        View findViewById;
        View findViewById2;
        androidx.constraintlayout.motion.widget.a aVar = this.f3015q;
        if (aVar == null) {
            return;
        }
        if (aVar.a(this.f3025v, this)) {
            requestLayout();
            return;
        }
        int i10 = this.f3025v;
        KeyEvent.Callback callback = null;
        if (i10 != -1) {
            androidx.constraintlayout.motion.widget.a aVar2 = this.f3015q;
            ArrayList<a.b> arrayList = aVar2.f3069d;
            Iterator<a.b> it = arrayList.iterator();
            while (it.hasNext()) {
                a.b next = it.next();
                if (next.f3097m.size() > 0) {
                    Iterator<a.b.View$OnClickListenerC0011a> it2 = next.f3097m.iterator();
                    while (it2.hasNext()) {
                        int i11 = it2.next().f3104b;
                        if (i11 != -1 && (findViewById2 = findViewById(i11)) != null) {
                            findViewById2.setOnClickListener(null);
                        }
                    }
                }
            }
            ArrayList<a.b> arrayList2 = aVar2.f3071f;
            Iterator<a.b> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                a.b next2 = it3.next();
                if (next2.f3097m.size() > 0) {
                    Iterator<a.b.View$OnClickListenerC0011a> it4 = next2.f3097m.iterator();
                    while (it4.hasNext()) {
                        int i12 = it4.next().f3104b;
                        if (i12 != -1 && (findViewById = findViewById(i12)) != null) {
                            findViewById.setOnClickListener(null);
                        }
                    }
                }
            }
            Iterator<a.b> it5 = arrayList.iterator();
            while (it5.hasNext()) {
                a.b next3 = it5.next();
                if (next3.f3097m.size() > 0) {
                    Iterator<a.b.View$OnClickListenerC0011a> it6 = next3.f3097m.iterator();
                    while (it6.hasNext()) {
                        it6.next().a(this, i10, next3);
                    }
                }
            }
            Iterator<a.b> it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                a.b next4 = it7.next();
                if (next4.f3097m.size() > 0) {
                    Iterator<a.b.View$OnClickListenerC0011a> it8 = next4.f3097m.iterator();
                    while (it8.hasNext()) {
                        it8.next().a(this, i10, next4);
                    }
                }
            }
        }
        if (this.f3015q.o() && (bVar = this.f3015q.c) != null && (bVar2 = bVar.f3096l) != null) {
            int i13 = bVar2.f3107d;
            if (i13 != -1) {
                MotionLayout motionLayout = bVar2.f3121r;
                KeyEvent.Callback findViewById3 = motionLayout.findViewById(i13);
                if (findViewById3 == null) {
                    f0.a.c(motionLayout.getContext(), bVar2.f3107d);
                }
                callback = findViewById3;
            }
            if (callback instanceof NestedScrollView) {
                NestedScrollView nestedScrollView = (NestedScrollView) callback;
                nestedScrollView.setOnTouchListener(new q());
                nestedScrollView.setOnScrollChangeListener(new f0.r());
            }
        }
    }

    public final void C() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if (this.J == null && ((copyOnWriteArrayList = this.f3003e0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        ArrayList<Integer> arrayList = this.E0;
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            i iVar = this.J;
            if (iVar != null) {
                iVar.b(next.intValue(), this);
            }
            CopyOnWriteArrayList<i> copyOnWriteArrayList2 = this.f3003e0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<i> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().b(next.intValue(), this);
                }
            }
        }
        arrayList.clear();
    }

    public final void D() {
        this.f3034z0.f();
        invalidate();
    }

    public final void E(int i10) {
        androidx.constraintlayout.widget.a aVar;
        a.C0226a c0226a;
        androidx.constraintlayout.widget.a aVar2;
        setState(TransitionState.SETUP);
        this.f3025v = i10;
        this.f3023u = -1;
        this.f3027w = -1;
        g0.a aVar3 = this.f3288k;
        if (aVar3 != null) {
            float f10 = -1;
            int i11 = aVar3.f17328b;
            SparseArray<a.C0226a> sparseArray = aVar3.f17329d;
            int i12 = 0;
            ConstraintLayout constraintLayout = aVar3.f17327a;
            if (i11 == i10) {
                if (i10 == -1) {
                    c0226a = sparseArray.valueAt(0);
                } else {
                    c0226a = sparseArray.get(i11);
                }
                int i13 = aVar3.c;
                if (i13 == -1 || !c0226a.f17332b.get(i13).a(f10, f10)) {
                    while (true) {
                        ArrayList<a.b> arrayList = c0226a.f17332b;
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12).a(f10, f10)) {
                                break;
                            }
                            i12++;
                        } else {
                            i12 = -1;
                            break;
                        }
                    }
                    if (aVar3.c != i12) {
                        ArrayList<a.b> arrayList2 = c0226a.f17332b;
                        if (i12 == -1) {
                            aVar2 = null;
                        } else {
                            aVar2 = arrayList2.get(i12).f17338f;
                        }
                        if (i12 != -1) {
                            int i14 = arrayList2.get(i12).f17337e;
                        }
                        if (aVar2 != null) {
                            aVar3.c = i12;
                            aVar2.b(constraintLayout);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            aVar3.f17328b = i10;
            a.C0226a c0226a2 = sparseArray.get(i10);
            while (true) {
                ArrayList<a.b> arrayList3 = c0226a2.f17332b;
                if (i12 < arrayList3.size()) {
                    if (arrayList3.get(i12).a(f10, f10)) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = -1;
                    break;
                }
            }
            ArrayList<a.b> arrayList4 = c0226a2.f17332b;
            if (i12 == -1) {
                aVar = c0226a2.f17333d;
            } else {
                aVar = arrayList4.get(i12).f17338f;
            }
            if (i12 != -1) {
                int i15 = arrayList4.get(i12).f17337e;
            }
            if (aVar != null) {
                aVar3.c = i12;
                aVar.b(constraintLayout);
                return;
            }
            return;
        }
        androidx.constraintlayout.motion.widget.a aVar4 = this.f3015q;
        if (aVar4 != null) {
            aVar4.b(i10).b(this);
        }
    }

    public final void F(int i10, int i11) {
        if (!isAttachedToWindow()) {
            if (this.f3024u0 == null) {
                this.f3024u0 = new h();
            }
            h hVar = this.f3024u0;
            hVar.c = i10;
            hVar.f3065d = i11;
            return;
        }
        androidx.constraintlayout.motion.widget.a aVar = this.f3015q;
        if (aVar != null) {
            this.f3023u = i10;
            this.f3027w = i11;
            aVar.n(i10, i11);
            this.f3034z0.e(this.f3015q.b(i10), this.f3015q.b(i11));
            D();
            this.E = 0.0f;
            s(0.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r16 != 7) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        if ((((r18 * r6) - (((r5 * r6) * r6) / 2.0f)) + r1) > 1.0f) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
        if ((((((r5 * r3) * r3) / 2.0f) + (r18 * r3)) + r1) < 0.0f) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
        if (r2 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
        r1 = r15.E;
        r2 = r15.f3015q.g();
        r14.f3039a = r18;
        r14.f3040b = r1;
        r14.c = r2;
        r15.f3017r = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
        r1 = r15.N;
        r2 = r15.E;
        r5 = r15.C;
        r6 = r15.f3015q.g();
        r3 = r15.f3015q.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
        if (r3 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
        r3 = r3.f3096l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
        if (r3 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
        r7 = r3.f3122s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
        r7 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
        r1.b(r2, r17, r18, r5, r6, r7);
        r15.f3021t = 0.0f;
        r1 = r15.f3025v;
        r15.G = r8;
        r15.f3025v = r1;
        r15.f3017r = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(int r16, float r17, float r18) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.G(int, float, float):void");
    }

    public final void H() {
        s(1.0f);
        this.f3026v0 = null;
    }

    public final void I(int i10, int i11) {
        float f10;
        g0.e eVar;
        androidx.constraintlayout.motion.widget.a aVar = this.f3015q;
        if (aVar != null && (eVar = aVar.f3068b) != null) {
            int i12 = this.f3025v;
            float f11 = -1;
            e.a aVar2 = eVar.f17365b.get(i10);
            if (aVar2 == null) {
                i12 = i10;
            } else {
                int i13 = (f11 > (-1.0f) ? 1 : (f11 == (-1.0f) ? 0 : -1));
                ArrayList<e.b> arrayList = aVar2.f17367b;
                int i14 = aVar2.c;
                if (i13 != 0 && i13 != 0) {
                    Iterator<e.b> it = arrayList.iterator();
                    e.b bVar = null;
                    while (true) {
                        if (it.hasNext()) {
                            e.b next = it.next();
                            if (next.a(f11, f11)) {
                                if (i12 == next.f17371e) {
                                    break;
                                }
                                bVar = next;
                            }
                        } else if (bVar != null) {
                            i12 = bVar.f17371e;
                        }
                    }
                } else if (i14 != i12) {
                    Iterator<e.b> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (i12 == it2.next().f17371e) {
                            break;
                        }
                    }
                    i12 = i14;
                }
            }
            if (i12 != -1) {
                i10 = i12;
            }
        }
        int i15 = this.f3025v;
        if (i15 == i10) {
            return;
        }
        if (this.f3023u == i10) {
            s(0.0f);
            if (i11 > 0) {
                this.C = i11 / 1000.0f;
            }
        } else if (this.f3027w == i10) {
            s(1.0f);
            if (i11 > 0) {
                this.C = i11 / 1000.0f;
            }
        } else {
            this.f3027w = i10;
            if (i15 != -1) {
                F(i15, i10);
                s(1.0f);
                this.E = 0.0f;
                H();
                if (i11 > 0) {
                    this.C = i11 / 1000.0f;
                    return;
                }
                return;
            }
            this.M = false;
            this.G = 1.0f;
            this.D = 0.0f;
            this.E = 0.0f;
            this.F = getNanoTime();
            this.B = getNanoTime();
            this.H = false;
            this.f3017r = null;
            if (i11 == -1) {
                this.C = this.f3015q.c() / 1000.0f;
            }
            this.f3023u = -1;
            this.f3015q.n(-1, this.f3027w);
            SparseArray sparseArray = new SparseArray();
            if (i11 == 0) {
                this.C = this.f3015q.c() / 1000.0f;
            } else if (i11 > 0) {
                this.C = i11 / 1000.0f;
            }
            int childCount = getChildCount();
            HashMap<View, n> hashMap = this.A;
            hashMap.clear();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                hashMap.put(childAt, new n(childAt));
                sparseArray.put(childAt.getId(), hashMap.get(childAt));
            }
            this.I = true;
            androidx.constraintlayout.widget.a b10 = this.f3015q.b(i10);
            f fVar = this.f3034z0;
            fVar.e(null, b10);
            D();
            fVar.a();
            int childCount2 = getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = getChildAt(i17);
                n nVar = hashMap.get(childAt2);
                if (nVar != null) {
                    p pVar = nVar.f16948f;
                    pVar.c = 0.0f;
                    pVar.f16972d = 0.0f;
                    pVar.d(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                    l lVar = nVar.f16950h;
                    lVar.getClass();
                    childAt2.getX();
                    childAt2.getY();
                    childAt2.getWidth();
                    childAt2.getHeight();
                    lVar.b(childAt2);
                }
            }
            int width = getWidth();
            int height = getHeight();
            if (this.f3002d0 != null) {
                for (int i18 = 0; i18 < childCount; i18++) {
                    n nVar2 = hashMap.get(getChildAt(i18));
                    if (nVar2 != null) {
                        this.f3015q.f(nVar2);
                    }
                }
                Iterator<MotionHelper> it3 = this.f3002d0.iterator();
                while (it3.hasNext()) {
                    it3.next().u(this, hashMap);
                }
                for (int i19 = 0; i19 < childCount; i19++) {
                    n nVar3 = hashMap.get(getChildAt(i19));
                    if (nVar3 != null) {
                        nVar3.h(width, height, getNanoTime());
                    }
                }
            } else {
                for (int i20 = 0; i20 < childCount; i20++) {
                    n nVar4 = hashMap.get(getChildAt(i20));
                    if (nVar4 != null) {
                        this.f3015q.f(nVar4);
                        nVar4.h(width, height, getNanoTime());
                    }
                }
            }
            a.b bVar2 = this.f3015q.c;
            if (bVar2 != null) {
                f10 = bVar2.f3093i;
            } else {
                f10 = 0.0f;
            }
            if (f10 != 0.0f) {
                float f12 = Float.MAX_VALUE;
                float f13 = -3.4028235E38f;
                for (int i21 = 0; i21 < childCount; i21++) {
                    p pVar2 = hashMap.get(getChildAt(i21)).f16949g;
                    float f14 = pVar2.f16974f + pVar2.f16973e;
                    f12 = Math.min(f12, f14);
                    f13 = Math.max(f13, f14);
                }
                for (int i22 = 0; i22 < childCount; i22++) {
                    n nVar5 = hashMap.get(getChildAt(i22));
                    p pVar3 = nVar5.f16949g;
                    float f15 = pVar3.f16973e;
                    float f16 = pVar3.f16974f;
                    nVar5.f16956n = 1.0f / (1.0f - f10);
                    nVar5.f16955m = f10 - ((((f15 + f16) - f12) * f10) / (f13 - f12));
                }
            }
            this.D = 0.0f;
            this.E = 0.0f;
            this.I = true;
            invalidate();
        }
    }

    public final void J(int i10, androidx.constraintlayout.widget.a aVar) {
        androidx.constraintlayout.motion.widget.a aVar2 = this.f3015q;
        if (aVar2 != null) {
            aVar2.f3072g.put(i10, aVar);
        }
        this.f3034z0.e(this.f3015q.b(this.f3023u), this.f3015q.b(this.f3027w));
        D();
        if (this.f3025v == i10) {
            aVar.b(this);
        }
    }

    public final void K(int i10, View... viewArr) {
        androidx.constraintlayout.widget.a b10;
        androidx.constraintlayout.motion.widget.a aVar = this.f3015q;
        if (aVar != null) {
            androidx.constraintlayout.motion.widget.e eVar = aVar.f3082q;
            eVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<androidx.constraintlayout.motion.widget.d> it = eVar.f3163b.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.motion.widget.d next = it.next();
                if (next.f3130a == i10) {
                    for (View view : viewArr) {
                        if (next.b(view)) {
                            arrayList.add(view);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                        MotionLayout motionLayout = eVar.f3162a;
                        int currentState = motionLayout.getCurrentState();
                        if (next.f3133e != 2) {
                            if (currentState == -1) {
                                motionLayout.toString();
                            } else {
                                androidx.constraintlayout.motion.widget.a aVar2 = motionLayout.f3015q;
                                if (aVar2 == null) {
                                    b10 = null;
                                } else {
                                    b10 = aVar2.b(currentState);
                                }
                                androidx.constraintlayout.widget.a aVar3 = b10;
                                if (aVar3 != null) {
                                    next.a(eVar, eVar.f3162a, currentState, aVar3, viewArr2);
                                }
                            }
                        } else {
                            next.a(eVar, eVar.f3162a, currentState, null, viewArr2);
                        }
                        arrayList.clear();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:189:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x052f A[ORIG_RETURN, RETURN] */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchDraw(android.graphics.Canvas r34) {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void g(int i10) {
        this.f3288k = null;
    }

    public int[] getConstraintSetIds() {
        androidx.constraintlayout.motion.widget.a aVar = this.f3015q;
        if (aVar == null) {
            return null;
        }
        SparseArray<androidx.constraintlayout.widget.a> sparseArray = aVar.f3072g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = sparseArray.keyAt(i10);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.f3025v;
    }

    public ArrayList<a.b> getDefinedTransitions() {
        androidx.constraintlayout.motion.widget.a aVar = this.f3015q;
        if (aVar == null) {
            return null;
        }
        return aVar.f3069d;
    }

    public f0.b getDesignTool() {
        if (this.P == null) {
            this.P = new f0.b();
        }
        return this.P;
    }

    public int getEndState() {
        return this.f3027w;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.E;
    }

    public androidx.constraintlayout.motion.widget.a getScene() {
        return this.f3015q;
    }

    public int getStartState() {
        return this.f3023u;
    }

    public float getTargetPosition() {
        return this.G;
    }

    public Bundle getTransitionState() {
        if (this.f3024u0 == null) {
            this.f3024u0 = new h();
        }
        h hVar = this.f3024u0;
        MotionLayout motionLayout = MotionLayout.this;
        hVar.f3065d = motionLayout.f3027w;
        hVar.c = motionLayout.f3023u;
        hVar.f3064b = motionLayout.getVelocity();
        hVar.f3063a = motionLayout.getProgress();
        h hVar2 = this.f3024u0;
        hVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", hVar2.f3063a);
        bundle.putFloat("motion.velocity", hVar2.f3064b);
        bundle.putInt("motion.StartState", hVar2.c);
        bundle.putInt("motion.EndState", hVar2.f3065d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        androidx.constraintlayout.motion.widget.a aVar = this.f3015q;
        if (aVar != null) {
            this.C = aVar.c() / 1000.0f;
        }
        return this.C * 1000.0f;
    }

    public float getVelocity() {
        return this.f3021t;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // x0.r
    public final void j(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.S || i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.S = false;
    }

    @Override // x0.q
    public final boolean l(View view, View view2, int i10, int i11) {
        a.b bVar;
        androidx.constraintlayout.motion.widget.b bVar2;
        androidx.constraintlayout.motion.widget.a aVar = this.f3015q;
        if (aVar != null && (bVar = aVar.c) != null && (bVar2 = bVar.f3096l) != null && (bVar2.f3126w & 2) == 0) {
            return true;
        }
        return false;
    }

    @Override // x0.q
    public final void m(View view, View view2, int i10, int i11) {
        this.V = getNanoTime();
        this.W = 0.0f;
        this.T = 0.0f;
        this.U = 0.0f;
    }

    @Override // x0.q
    public final void n(View view, int i10) {
        androidx.constraintlayout.motion.widget.b bVar;
        float f10;
        boolean z10;
        androidx.constraintlayout.motion.widget.a aVar = this.f3015q;
        if (aVar != null) {
            float f11 = this.W;
            float f12 = 0.0f;
            if (f11 != 0.0f) {
                float f13 = this.T / f11;
                float f14 = this.U / f11;
                a.b bVar2 = aVar.c;
                if (bVar2 != null && (bVar = bVar2.f3096l) != null) {
                    boolean z11 = false;
                    bVar.f3116m = false;
                    MotionLayout motionLayout = bVar.f3121r;
                    float progress = motionLayout.getProgress();
                    bVar.f3121r.x(bVar.f3107d, progress, bVar.f3111h, bVar.f3110g, bVar.f3117n);
                    float f15 = bVar.f3114k;
                    float[] fArr = bVar.f3117n;
                    float f16 = fArr[0];
                    float f17 = bVar.f3115l;
                    float f18 = fArr[1];
                    if (f15 != 0.0f) {
                        f10 = (f13 * f15) / f16;
                    } else {
                        f10 = (f14 * f17) / f18;
                    }
                    if (!Float.isNaN(f10)) {
                        progress += f10 / 3.0f;
                    }
                    if (progress != 0.0f) {
                        if (progress != 1.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = bVar.c;
                        if (i11 != 3) {
                            z11 = true;
                        }
                        if (z11 & z10) {
                            if (progress >= 0.5d) {
                                f12 = 1.0f;
                            }
                            motionLayout.G(i11, f12, f10);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // x0.q
    public final void o(View view, int i10, int i11, int[] iArr, int i12) {
        a.b bVar;
        boolean z10;
        boolean z11;
        ?? r12;
        androidx.constraintlayout.motion.widget.b bVar2;
        float f10;
        float f11;
        androidx.constraintlayout.motion.widget.b bVar3;
        androidx.constraintlayout.motion.widget.b bVar4;
        androidx.constraintlayout.motion.widget.b bVar5;
        int i13;
        androidx.constraintlayout.motion.widget.a aVar = this.f3015q;
        if (aVar != null && (bVar = aVar.c) != null && (!bVar.f3099o)) {
            int i14 = -1;
            if (z10 && (bVar5 = bVar.f3096l) != null && (i13 = bVar5.f3108e) != -1 && view.getId() != i13) {
                return;
            }
            a.b bVar6 = aVar.c;
            if (bVar6 != null && (bVar4 = bVar6.f3096l) != null) {
                z11 = bVar4.f3124u;
            } else {
                z11 = false;
            }
            if (z11) {
                androidx.constraintlayout.motion.widget.b bVar7 = bVar.f3096l;
                if (bVar7 != null && (bVar7.f3126w & 4) != 0) {
                    i14 = i11;
                }
                float f12 = this.D;
                if ((f12 == 1.0f || f12 == 0.0f) && view.canScrollVertically(i14)) {
                    return;
                }
            }
            androidx.constraintlayout.motion.widget.b bVar8 = bVar.f3096l;
            if (bVar8 != null && (bVar8.f3126w & 1) != 0) {
                float f13 = i10;
                float f14 = i11;
                a.b bVar9 = aVar.c;
                if (bVar9 != null && (bVar3 = bVar9.f3096l) != null) {
                    bVar3.f3121r.x(bVar3.f3107d, bVar3.f3121r.getProgress(), bVar3.f3111h, bVar3.f3110g, bVar3.f3117n);
                    float f15 = bVar3.f3114k;
                    int i15 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
                    float[] fArr = bVar3.f3117n;
                    if (i15 != 0) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f11 = (f13 * f15) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f11 = (f14 * bVar3.f3115l) / fArr[1];
                    }
                } else {
                    f11 = 0.0f;
                }
                float f16 = this.E;
                if ((f16 <= 0.0f && f11 < 0.0f) || (f16 >= 1.0f && f11 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new a(view));
                    return;
                }
            }
            float f17 = this.D;
            long nanoTime = getNanoTime();
            float f18 = i10;
            this.T = f18;
            float f19 = i11;
            this.U = f19;
            this.W = (float) ((nanoTime - this.V) * 1.0E-9d);
            this.V = nanoTime;
            a.b bVar10 = aVar.c;
            if (bVar10 != null && (bVar2 = bVar10.f3096l) != null) {
                MotionLayout motionLayout = bVar2.f3121r;
                float progress = motionLayout.getProgress();
                if (!bVar2.f3116m) {
                    bVar2.f3116m = true;
                    motionLayout.setProgress(progress);
                }
                bVar2.f3121r.x(bVar2.f3107d, progress, bVar2.f3111h, bVar2.f3110g, bVar2.f3117n);
                float f20 = bVar2.f3114k;
                float[] fArr2 = bVar2.f3117n;
                if (Math.abs((bVar2.f3115l * fArr2[1]) + (f20 * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f21 = bVar2.f3114k;
                if (f21 != 0.0f) {
                    f10 = (f18 * f21) / fArr2[0];
                } else {
                    f10 = (f19 * bVar2.f3115l) / fArr2[1];
                }
                float max = Math.max(Math.min(progress + f10, 1.0f), 0.0f);
                if (max != motionLayout.getProgress()) {
                    motionLayout.setProgress(max);
                }
            }
            if (f17 != this.D) {
                iArr[0] = i10;
                r12 = 1;
                iArr[1] = i11;
            } else {
                r12 = 1;
            }
            u(false);
            if (iArr[0] != 0 || iArr[r12] != 0) {
                this.S = r12;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        a.b bVar;
        int i10;
        boolean z10;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        androidx.constraintlayout.motion.widget.a aVar = this.f3015q;
        if (aVar != null && (i10 = this.f3025v) != -1) {
            androidx.constraintlayout.widget.a b10 = aVar.b(i10);
            androidx.constraintlayout.motion.widget.a aVar2 = this.f3015q;
            int i11 = 0;
            while (true) {
                SparseArray<androidx.constraintlayout.widget.a> sparseArray = aVar2.f3072g;
                if (i11 >= sparseArray.size()) {
                    break;
                }
                int keyAt = sparseArray.keyAt(i11);
                SparseIntArray sparseIntArray = aVar2.f3074i;
                int i12 = sparseIntArray.get(keyAt);
                int size = sparseIntArray.size();
                while (i12 > 0) {
                    if (i12 != keyAt) {
                        int i13 = size - 1;
                        if (size >= 0) {
                            i12 = sparseIntArray.get(i12);
                            size = i13;
                        }
                    }
                    z10 = true;
                    break;
                }
                z10 = false;
                if (z10) {
                    break;
                }
                aVar2.m(keyAt, this);
                i11++;
            }
            ArrayList<MotionHelper> arrayList = this.f3002d0;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
            }
            if (b10 != null) {
                b10.b(this);
            }
            this.f3023u = this.f3025v;
        }
        B();
        h hVar = this.f3024u0;
        if (hVar != null) {
            if (this.f3030x0) {
                post(new b());
                return;
            } else {
                hVar.a();
                return;
            }
        }
        androidx.constraintlayout.motion.widget.a aVar3 = this.f3015q;
        if (aVar3 != null && (bVar = aVar3.c) != null && bVar.f3098n == 4) {
            H();
            setState(TransitionState.SETUP);
            setState(TransitionState.MOVING);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        androidx.constraintlayout.motion.widget.b bVar;
        int i10;
        View view;
        RectF b10;
        MotionLayout motionLayout;
        int currentState;
        androidx.constraintlayout.widget.a b11;
        boolean z10;
        androidx.constraintlayout.motion.widget.d dVar;
        int i11;
        androidx.constraintlayout.motion.widget.a aVar = this.f3015q;
        if (aVar != null && this.f3033z) {
            androidx.constraintlayout.motion.widget.e eVar = aVar.f3082q;
            if (eVar != null && (currentState = (motionLayout = eVar.f3162a).getCurrentState()) != -1) {
                HashSet<View> hashSet = eVar.c;
                ArrayList<androidx.constraintlayout.motion.widget.d> arrayList = eVar.f3163b;
                if (hashSet == null) {
                    eVar.c = new HashSet<>();
                    Iterator<androidx.constraintlayout.motion.widget.d> it = arrayList.iterator();
                    while (it.hasNext()) {
                        androidx.constraintlayout.motion.widget.d next = it.next();
                        int childCount = motionLayout.getChildCount();
                        for (int i12 = 0; i12 < childCount; i12++) {
                            View childAt = motionLayout.getChildAt(i12);
                            if (next.c(childAt)) {
                                childAt.getId();
                                eVar.c.add(childAt);
                            }
                        }
                    }
                }
                float x4 = motionEvent.getX();
                float y10 = motionEvent.getY();
                Rect rect = new Rect();
                int action = motionEvent.getAction();
                ArrayList<d.a> arrayList2 = eVar.f3164d;
                int i13 = 2;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    Iterator<d.a> it2 = eVar.f3164d.iterator();
                    while (it2.hasNext()) {
                        d.a next2 = it2.next();
                        if (action != 1) {
                            if (action != 2) {
                                next2.getClass();
                            } else {
                                View view2 = next2.c.f16945b;
                                Rect rect2 = next2.f3160l;
                                view2.getHitRect(rect2);
                                if (!rect2.contains((int) x4, (int) y10) && !next2.f3156h) {
                                    next2.b();
                                }
                            }
                        } else if (!next2.f3156h) {
                            next2.b();
                        }
                    }
                }
                if (action == 0 || action == 1) {
                    androidx.constraintlayout.motion.widget.a aVar2 = motionLayout.f3015q;
                    if (aVar2 == null) {
                        b11 = null;
                    } else {
                        b11 = aVar2.b(currentState);
                    }
                    Iterator<androidx.constraintlayout.motion.widget.d> it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        androidx.constraintlayout.motion.widget.d next3 = it3.next();
                        int i14 = next3.f3131b;
                        if (i14 != 1 ? !(i14 != i13 ? i14 != 3 || action != 0 : action != 1) : action == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            Iterator<View> it4 = eVar.c.iterator();
                            while (it4.hasNext()) {
                                View next4 = it4.next();
                                if (next3.c(next4)) {
                                    next4.getHitRect(rect);
                                    if (rect.contains((int) x4, (int) y10)) {
                                        dVar = next3;
                                        i11 = i13;
                                        next3.a(eVar, eVar.f3162a, currentState, b11, next4);
                                    } else {
                                        dVar = next3;
                                        i11 = i13;
                                    }
                                    next3 = dVar;
                                    i13 = i11;
                                }
                            }
                        }
                    }
                }
            }
            a.b bVar2 = this.f3015q.c;
            if (bVar2 != null && (!bVar2.f3099o) && (bVar = bVar2.f3096l) != null) {
                if ((motionEvent.getAction() != 0 || (b10 = bVar.b(this, new RectF())) == null || b10.contains(motionEvent.getX(), motionEvent.getY())) && (i10 = bVar.f3108e) != -1) {
                    View view3 = this.C0;
                    if (view3 == null || view3.getId() != i10) {
                        this.C0 = findViewById(i10);
                    }
                    if (this.C0 != null) {
                        RectF rectF = this.B0;
                        rectF.set(view.getLeft(), this.C0.getTop(), this.C0.getRight(), this.C0.getBottom());
                        if (rectF.contains(motionEvent.getX(), motionEvent.getY()) && !z(this.C0.getLeft(), this.C0.getTop(), motionEvent, this.C0)) {
                            return onTouchEvent(motionEvent);
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f3022t0 = true;
        try {
            if (this.f3015q == null) {
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            }
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            if (this.Q != i14 || this.R != i15) {
                D();
                u(true);
            }
            this.Q = i14;
            this.R = i15;
        } finally {
            this.f3022t0 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
        if (r10 != false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        androidx.constraintlayout.motion.widget.b bVar;
        androidx.constraintlayout.motion.widget.a aVar = this.f3015q;
        if (aVar != null) {
            boolean f10 = f();
            aVar.f3081p = f10;
            a.b bVar2 = aVar.c;
            if (bVar2 != null && (bVar = bVar2.f3096l) != null) {
                bVar.c(f10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ed, code lost:
        if (r8.contains(r14.getX(), r14.getY()) == false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07d7 A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r35) {
        /*
            Method dump skipped, instructions count: 2015
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f3003e0 == null) {
                this.f3003e0 = new CopyOnWriteArrayList<>();
            }
            this.f3003e0.add(motionHelper);
            if (motionHelper.f2995i) {
                if (this.f3000b0 == null) {
                    this.f3000b0 = new ArrayList<>();
                }
                this.f3000b0.add(motionHelper);
            }
            if (motionHelper.f2996j) {
                if (this.f3001c0 == null) {
                    this.f3001c0 = new ArrayList<>();
                }
                this.f3001c0.add(motionHelper);
            }
            if (motionHelper instanceof MotionEffect) {
                if (this.f3002d0 == null) {
                    this.f3002d0 = new ArrayList<>();
                }
                this.f3002d0.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f3000b0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f3001c0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        androidx.constraintlayout.motion.widget.a aVar;
        a.b bVar;
        if (!this.f3009k0 && this.f3025v == -1 && (aVar = this.f3015q) != null && (bVar = aVar.c) != null) {
            int i10 = bVar.f3101q;
            if (i10 == 0) {
                return;
            }
            if (i10 == 2) {
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    this.A.get(getChildAt(i11)).f16946d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public final void s(float f10) {
        androidx.constraintlayout.motion.widget.a aVar = this.f3015q;
        if (aVar == null) {
            return;
        }
        float f11 = this.E;
        float f12 = this.D;
        if (f11 != f12 && this.H) {
            this.E = f12;
        }
        float f13 = this.E;
        if (f13 == f10) {
            return;
        }
        this.M = false;
        this.G = f10;
        this.C = aVar.c() / 1000.0f;
        setProgress(this.G);
        this.f3017r = null;
        this.f3019s = this.f3015q.e();
        this.H = false;
        this.B = getNanoTime();
        this.I = true;
        this.D = f13;
        this.E = f13;
        invalidate();
    }

    public void setDebugMode(int i10) {
        this.K = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f3030x0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.f3033z = z10;
    }

    public void setInterpolatedProgress(float f10) {
        if (this.f3015q != null) {
            setState(TransitionState.MOVING);
            Interpolator e10 = this.f3015q.e();
            if (e10 != null) {
                setProgress(e10.getInterpolation(f10));
                return;
            }
        }
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<MotionHelper> arrayList = this.f3001c0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f3001c0.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<MotionHelper> arrayList = this.f3000b0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f3000b0.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (!isAttachedToWindow()) {
            if (this.f3024u0 == null) {
                this.f3024u0 = new h();
            }
            this.f3024u0.f3063a = f10;
            return;
        }
        if (i10 <= 0) {
            if (this.E == 1.0f && this.f3025v == this.f3027w) {
                setState(TransitionState.MOVING);
            }
            this.f3025v = this.f3023u;
            if (this.E == 0.0f) {
                setState(TransitionState.FINISHED);
            }
        } else if (f10 >= 1.0f) {
            if (this.E == 0.0f && this.f3025v == this.f3023u) {
                setState(TransitionState.MOVING);
            }
            this.f3025v = this.f3027w;
            if (this.E == 1.0f) {
                setState(TransitionState.FINISHED);
            }
        } else {
            this.f3025v = -1;
            setState(TransitionState.MOVING);
        }
        if (this.f3015q == null) {
            return;
        }
        this.H = true;
        this.G = f10;
        this.D = f10;
        this.F = -1L;
        this.B = -1L;
        this.f3017r = null;
        this.I = true;
        invalidate();
    }

    public void setScene(androidx.constraintlayout.motion.widget.a aVar) {
        androidx.constraintlayout.motion.widget.b bVar;
        this.f3015q = aVar;
        boolean f10 = f();
        aVar.f3081p = f10;
        a.b bVar2 = aVar.c;
        if (bVar2 != null && (bVar = bVar2.f3096l) != null) {
            bVar.c(f10);
        }
        D();
    }

    public void setStartState(int i10) {
        if (!isAttachedToWindow()) {
            if (this.f3024u0 == null) {
                this.f3024u0 = new h();
            }
            h hVar = this.f3024u0;
            hVar.c = i10;
            hVar.f3065d = i10;
            return;
        }
        this.f3025v = i10;
    }

    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState == transitionState2 && this.f3025v == -1) {
            return;
        }
        TransitionState transitionState3 = this.f3032y0;
        this.f3032y0 = transitionState;
        TransitionState transitionState4 = TransitionState.MOVING;
        if (transitionState3 == transitionState4 && transitionState == transitionState4) {
            v();
        }
        int i10 = c.f3038a[transitionState3.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3 && transitionState == transitionState2) {
                w();
                return;
            }
            return;
        }
        if (transitionState == transitionState4) {
            v();
        }
        if (transitionState == transitionState2) {
            w();
        }
    }

    public void setTransition(int i10) {
        float f10;
        if (this.f3015q != null) {
            a.b y10 = y(i10);
            this.f3023u = y10.f3088d;
            this.f3027w = y10.c;
            if (!isAttachedToWindow()) {
                if (this.f3024u0 == null) {
                    this.f3024u0 = new h();
                }
                h hVar = this.f3024u0;
                hVar.c = this.f3023u;
                hVar.f3065d = this.f3027w;
                return;
            }
            int i11 = this.f3025v;
            if (i11 == this.f3023u) {
                f10 = 0.0f;
            } else {
                f10 = i11 == this.f3027w ? 1.0f : Float.NaN;
            }
            androidx.constraintlayout.motion.widget.a aVar = this.f3015q;
            aVar.c = y10;
            androidx.constraintlayout.motion.widget.b bVar = y10.f3096l;
            if (bVar != null) {
                bVar.c(aVar.f3081p);
            }
            this.f3034z0.e(this.f3015q.b(this.f3023u), this.f3015q.b(this.f3027w));
            D();
            if (this.E != f10) {
                if (f10 == 0.0f) {
                    t(true);
                    this.f3015q.b(this.f3023u).b(this);
                } else if (f10 == 1.0f) {
                    t(false);
                    this.f3015q.b(this.f3027w).b(this);
                }
            }
            this.E = Float.isNaN(f10) ? 0.0f : f10;
            if (Float.isNaN(f10)) {
                f0.a.b();
                s(0.0f);
                return;
            }
            setProgress(f10);
        }
    }

    public void setTransitionDuration(int i10) {
        androidx.constraintlayout.motion.widget.a aVar = this.f3015q;
        if (aVar == null) {
            return;
        }
        a.b bVar = aVar.c;
        if (bVar != null) {
            bVar.f3092h = Math.max(i10, 8);
        } else {
            aVar.f3075j = i10;
        }
    }

    public void setTransitionListener(i iVar) {
        this.J = iVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f3024u0 == null) {
            this.f3024u0 = new h();
        }
        h hVar = this.f3024u0;
        hVar.getClass();
        hVar.f3063a = bundle.getFloat("motion.progress");
        hVar.f3064b = bundle.getFloat("motion.velocity");
        hVar.c = bundle.getInt("motion.StartState");
        hVar.f3065d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.f3024u0.a();
        }
    }

    public final void t(boolean z10) {
        float f10;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            n nVar = this.A.get(getChildAt(i10));
            if (nVar != null && "button".equals(f0.a.d(nVar.f16945b)) && nVar.A != null) {
                int i11 = 0;
                while (true) {
                    k[] kVarArr = nVar.A;
                    if (i11 < kVarArr.length) {
                        k kVar = kVarArr[i11];
                        if (z10) {
                            f10 = -100.0f;
                        } else {
                            f10 = 100.0f;
                        }
                        kVar.h(nVar.f16945b, f10);
                        i11++;
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return f0.a.c(context, this.f3023u) + "->" + f0.a.c(context, this.f3027w) + " (pos:" + this.E + " Dpos/Dt:" + this.f3021t;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(boolean r23) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.u(boolean):void");
    }

    public final void v() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if ((this.J != null || ((copyOnWriteArrayList = this.f3003e0) != null && !copyOnWriteArrayList.isEmpty())) && this.f3008j0 != this.D) {
            if (this.f3007i0 != -1) {
                i iVar = this.J;
                if (iVar != null) {
                    iVar.c();
                }
                CopyOnWriteArrayList<i> copyOnWriteArrayList2 = this.f3003e0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<i> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().c();
                    }
                }
            }
            this.f3007i0 = -1;
            this.f3008j0 = this.D;
            i iVar2 = this.J;
            if (iVar2 != null) {
                iVar2.a();
            }
            CopyOnWriteArrayList<i> copyOnWriteArrayList3 = this.f3003e0;
            if (copyOnWriteArrayList3 != null) {
                Iterator<i> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().a();
                }
            }
        }
    }

    public final void w() {
        int i10;
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if ((this.J != null || ((copyOnWriteArrayList = this.f3003e0) != null && !copyOnWriteArrayList.isEmpty())) && this.f3007i0 == -1) {
            this.f3007i0 = this.f3025v;
            ArrayList<Integer> arrayList = this.E0;
            if (!arrayList.isEmpty()) {
                i10 = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i10 = -1;
            }
            int i11 = this.f3025v;
            if (i10 != i11 && i11 != -1) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        C();
        Runnable runnable = this.f3026v0;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void x(int i10, float f10, float f11, float f12, float[] fArr) {
        View c10 = c(i10);
        n nVar = this.A.get(c10);
        if (nVar != null) {
            nVar.d(f10, f11, f12, fArr);
            c10.getY();
        } else if (c10 != null) {
            c10.getContext().getResources().getResourceName(i10);
        }
    }

    public final a.b y(int i10) {
        Iterator<a.b> it = this.f3015q.f3069d.iterator();
        while (it.hasNext()) {
            a.b next = it.next();
            if (next.f3086a == i10) {
                return next;
            }
        }
        return null;
    }

    public final boolean z(float f10, float f11, MotionEvent motionEvent, View view) {
        boolean z10;
        boolean onTouchEvent;
        View childAt;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (z((childAt.getLeft() + f10) - view.getScrollX(), (childAt.getTop() + f11) - view.getScrollY(), motionEvent, viewGroup.getChildAt(childCount))) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (!z10) {
            RectF rectF = this.B0;
            rectF.set(f10, f11, (view.getRight() + f10) - view.getLeft(), (view.getBottom() + f11) - view.getTop());
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f12 = -f10;
                float f13 = -f11;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f12, f13);
                    onTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f12, -f13);
                } else {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(f12, f13);
                    if (this.D0 == null) {
                        this.D0 = new Matrix();
                    }
                    matrix.invert(this.D0);
                    obtain.transform(this.D0);
                    onTouchEvent = view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (onTouchEvent) {
                    return true;
                }
            }
        }
        return z10;
    }

    public void setTransition(a.b bVar) {
        androidx.constraintlayout.motion.widget.b bVar2;
        androidx.constraintlayout.motion.widget.a aVar = this.f3015q;
        aVar.c = bVar;
        if (bVar != null && (bVar2 = bVar.f3096l) != null) {
            bVar2.c(aVar.f3081p);
        }
        setState(TransitionState.SETUP);
        int i10 = this.f3025v;
        a.b bVar3 = this.f3015q.c;
        if (i10 == (bVar3 == null ? -1 : bVar3.c)) {
            this.E = 1.0f;
            this.D = 1.0f;
            this.G = 1.0f;
        } else {
            this.E = 0.0f;
            this.D = 0.0f;
            this.G = 0.0f;
        }
        this.F = (bVar.f3102r & 1) != 0 ? -1L : getNanoTime();
        int h10 = this.f3015q.h();
        androidx.constraintlayout.motion.widget.a aVar2 = this.f3015q;
        a.b bVar4 = aVar2.c;
        int i11 = bVar4 != null ? bVar4.c : -1;
        if (h10 == this.f3023u && i11 == this.f3027w) {
            return;
        }
        this.f3023u = h10;
        this.f3027w = i11;
        aVar2.n(h10, i11);
        androidx.constraintlayout.widget.a b10 = this.f3015q.b(this.f3023u);
        androidx.constraintlayout.widget.a b11 = this.f3015q.b(this.f3027w);
        f fVar = this.f3034z0;
        fVar.e(b10, b11);
        int i12 = this.f3023u;
        int i13 = this.f3027w;
        fVar.f3058e = i12;
        fVar.f3059f = i13;
        fVar.f();
        D();
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3019s = null;
        this.f3021t = 0.0f;
        this.f3023u = -1;
        this.f3025v = -1;
        this.f3027w = -1;
        this.f3029x = 0;
        this.f3031y = 0;
        this.f3033z = true;
        this.A = new HashMap<>();
        this.B = 0L;
        this.C = 1.0f;
        this.D = 0.0f;
        this.E = 0.0f;
        this.G = 0.0f;
        this.I = false;
        this.K = 0;
        this.M = false;
        this.N = new e0.b();
        this.O = new d();
        this.S = false;
        this.f2999a0 = false;
        this.f3000b0 = null;
        this.f3001c0 = null;
        this.f3002d0 = null;
        this.f3003e0 = null;
        this.f3004f0 = 0;
        this.f3005g0 = -1L;
        this.f3006h0 = 0.0f;
        this.f3007i0 = 0;
        this.f3008j0 = 0.0f;
        this.f3009k0 = false;
        this.f3020s0 = new t(1);
        this.f3022t0 = false;
        this.f3026v0 = null;
        new HashMap();
        this.f3028w0 = new Rect();
        this.f3030x0 = false;
        this.f3032y0 = TransitionState.UNDEFINED;
        this.f3034z0 = new f();
        this.A0 = false;
        this.B0 = new RectF();
        this.C0 = null;
        this.D0 = null;
        this.E0 = new ArrayList<>();
        A(attributeSet);
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3019s = null;
        this.f3021t = 0.0f;
        this.f3023u = -1;
        this.f3025v = -1;
        this.f3027w = -1;
        this.f3029x = 0;
        this.f3031y = 0;
        this.f3033z = true;
        this.A = new HashMap<>();
        this.B = 0L;
        this.C = 1.0f;
        this.D = 0.0f;
        this.E = 0.0f;
        this.G = 0.0f;
        this.I = false;
        this.K = 0;
        this.M = false;
        this.N = new e0.b();
        this.O = new d();
        this.S = false;
        this.f2999a0 = false;
        this.f3000b0 = null;
        this.f3001c0 = null;
        this.f3002d0 = null;
        this.f3003e0 = null;
        this.f3004f0 = 0;
        this.f3005g0 = -1L;
        this.f3006h0 = 0.0f;
        this.f3007i0 = 0;
        this.f3008j0 = 0.0f;
        this.f3009k0 = false;
        this.f3020s0 = new t(1);
        this.f3022t0 = false;
        this.f3026v0 = null;
        new HashMap();
        this.f3028w0 = new Rect();
        this.f3030x0 = false;
        this.f3032y0 = TransitionState.UNDEFINED;
        this.f3034z0 = new f();
        this.A0 = false;
        this.B0 = new RectF();
        this.C0 = null;
        this.D0 = null;
        this.E0 = new ArrayList<>();
        A(attributeSet);
    }

    @Override // x0.q
    public final void k(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
