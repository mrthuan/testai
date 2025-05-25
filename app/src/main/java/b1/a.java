package b1;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.WeakHashMap;
import x0.f0;
import x0.n0;

/* compiled from: AutoScrollHelper.java */
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: q  reason: collision with root package name */
    public static final int f5272q = ViewConfiguration.getTapTimeout();

    /* renamed from: a  reason: collision with root package name */
    public final C0032a f5273a;

    /* renamed from: b  reason: collision with root package name */
    public final AccelerateInterpolator f5274b;
    public final View c;

    /* renamed from: d  reason: collision with root package name */
    public b f5275d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f5276e;

    /* renamed from: f  reason: collision with root package name */
    public final float[] f5277f;

    /* renamed from: g  reason: collision with root package name */
    public int f5278g;

    /* renamed from: h  reason: collision with root package name */
    public int f5279h;

    /* renamed from: i  reason: collision with root package name */
    public final float[] f5280i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f5281j;

    /* renamed from: k  reason: collision with root package name */
    public final float[] f5282k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5283l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5284m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5285n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5286o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5287p;

    /* compiled from: AutoScrollHelper.java */
    /* renamed from: b1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0032a {

        /* renamed from: a  reason: collision with root package name */
        public int f5288a;

        /* renamed from: b  reason: collision with root package name */
        public int f5289b;
        public float c;

        /* renamed from: d  reason: collision with root package name */
        public float f5290d;

        /* renamed from: h  reason: collision with root package name */
        public float f5294h;

        /* renamed from: i  reason: collision with root package name */
        public int f5295i;

        /* renamed from: e  reason: collision with root package name */
        public long f5291e = Long.MIN_VALUE;

        /* renamed from: g  reason: collision with root package name */
        public long f5293g = -1;

        /* renamed from: f  reason: collision with root package name */
        public long f5292f = 0;

        public final float a(long j10) {
            long j11 = this.f5291e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f5293g;
            if (j12 >= 0 && j10 >= j12) {
                float f10 = this.f5294h;
                return (a.b(((float) (j10 - j12)) / this.f5295i, 0.0f, 1.0f) * f10) + (1.0f - f10);
            }
            return a.b(((float) (j10 - j11)) / this.f5288a, 0.0f, 1.0f) * 0.5f;
        }
    }

    /* compiled from: AutoScrollHelper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            a aVar = a.this;
            if (!aVar.f5286o) {
                return;
            }
            boolean z11 = aVar.f5284m;
            C0032a c0032a = aVar.f5273a;
            if (z11) {
                aVar.f5284m = false;
                c0032a.getClass();
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                c0032a.f5291e = currentAnimationTimeMillis;
                c0032a.f5293g = -1L;
                c0032a.f5292f = currentAnimationTimeMillis;
                c0032a.f5294h = 0.5f;
            }
            if (c0032a.f5293g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0032a.f5293g + c0032a.f5295i) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && aVar.e()) {
                boolean z12 = aVar.f5285n;
                View view = aVar.c;
                if (z12) {
                    aVar.f5285n = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (c0032a.f5292f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a10 = c0032a.a(currentAnimationTimeMillis2);
                    c0032a.f5292f = currentAnimationTimeMillis2;
                    i.b(((h) aVar).f5299r, (int) (((float) (currentAnimationTimeMillis2 - c0032a.f5292f)) * ((a10 * 4.0f) + ((-4.0f) * a10 * a10)) * c0032a.f5290d));
                    WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                    f0.d.m(view, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            aVar.f5286o = false;
        }
    }

    public a(View view) {
        C0032a c0032a = new C0032a();
        this.f5273a = c0032a;
        this.f5274b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f5276e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f5277f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f5280i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f5281j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f5282k = fArr5;
        this.c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f5278g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f5279h = f5272q;
        c0032a.f5288a = OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM;
        c0032a.f5289b = OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM;
    }

    public static float b(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        if (f10 < f11) {
            return f11;
        }
        return f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f5276e
            r0 = r0[r7]
            float[] r1 = r3.f5277f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f5274b
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f5280i
            r0 = r0[r7]
            float[] r1 = r3.f5281j
            r1 = r1[r7]
            float[] r2 = r3.f5282k
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.a.a(float, float, float, int):float");
    }

    public final float c(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f5278g;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2 && f10 < 0.0f) {
                return f10 / (-f11);
            }
        } else if (f10 < f11) {
            if (f10 >= 0.0f) {
                return 1.0f - (f10 / f11);
            }
            if (this.f5286o && i10 == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i10 = 0;
        if (this.f5284m) {
            this.f5286o = false;
            return;
        }
        C0032a c0032a = this.f5273a;
        c0032a.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (currentAnimationTimeMillis - c0032a.f5291e);
        int i12 = c0032a.f5289b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        c0032a.f5295i = i10;
        c0032a.f5294h = c0032a.a(currentAnimationTimeMillis);
        c0032a.f5293g = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() {
        /*
            r9 = this;
            b1.a$a r0 = r9.f5273a
            float r1 = r0.f5290d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 0
            if (r1 == 0) goto L55
            r3 = r9
            b1.h r3 = (b1.h) r3
            android.widget.ListView r3 = r3.f5299r
            int r4 = r3.getCount()
            r5 = 1
            if (r4 != 0) goto L23
        L21:
            r1 = r2
            goto L51
        L23:
            int r6 = r3.getChildCount()
            int r7 = r3.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L41
            if (r8 < r4) goto L50
            int r6 = r6 - r5
            android.view.View r1 = r3.getChildAt(r6)
            int r1 = r1.getBottom()
            int r3 = r3.getHeight()
            if (r1 > r3) goto L50
            goto L21
        L41:
            if (r1 >= 0) goto L21
            if (r7 > 0) goto L50
            android.view.View r1 = r3.getChildAt(r2)
            int r1 = r1.getTop()
            if (r1 < 0) goto L50
            goto L21
        L50:
            r1 = r5
        L51:
            if (r1 != 0) goto L54
            goto L55
        L54:
            r2 = r5
        L55:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.a.e():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f5287p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7b
        L16:
            r7.d()
            goto L7b
        L1a:
            r7.f5285n = r2
            r7.f5283l = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            b1.a$a r9 = r7.f5273a
            r9.c = r0
            r9.f5290d = r8
            boolean r8 = r7.f5286o
            if (r8 != 0) goto L7b
            boolean r8 = r7.e()
            if (r8 == 0) goto L7b
            b1.a$b r8 = r7.f5275d
            if (r8 != 0) goto L5f
            b1.a$b r8 = new b1.a$b
            r8.<init>()
            r7.f5275d = r8
        L5f:
            r7.f5286o = r2
            r7.f5284m = r2
            boolean r8 = r7.f5283l
            if (r8 != 0) goto L74
            int r8 = r7.f5279h
            if (r8 <= 0) goto L74
            b1.a$b r9 = r7.f5275d
            long r5 = (long) r8
            java.util.WeakHashMap<android.view.View, x0.n0> r8 = x0.f0.f31435a
            x0.f0.d.n(r4, r9, r5)
            goto L79
        L74:
            b1.a$b r8 = r7.f5275d
            r8.run()
        L79:
            r7.f5283l = r2
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
