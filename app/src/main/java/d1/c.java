package d1;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.Arrays;
import java.util.WeakHashMap;
import x0.f0;
import x0.n0;

/* compiled from: ViewDragHelper.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: x  reason: collision with root package name */
    public static final a f16051x = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f16052a;

    /* renamed from: b  reason: collision with root package name */
    public int f16053b;

    /* renamed from: d  reason: collision with root package name */
    public float[] f16054d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f16055e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f16056f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f16057g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f16058h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f16059i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f16060j;

    /* renamed from: k  reason: collision with root package name */
    public int f16061k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f16062l;

    /* renamed from: m  reason: collision with root package name */
    public final float f16063m;

    /* renamed from: n  reason: collision with root package name */
    public float f16064n;

    /* renamed from: o  reason: collision with root package name */
    public int f16065o;

    /* renamed from: p  reason: collision with root package name */
    public final int f16066p;

    /* renamed from: q  reason: collision with root package name */
    public int f16067q;

    /* renamed from: r  reason: collision with root package name */
    public final OverScroller f16068r;

    /* renamed from: s  reason: collision with root package name */
    public final AbstractC0191c f16069s;

    /* renamed from: t  reason: collision with root package name */
    public View f16070t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f16071u;

    /* renamed from: v  reason: collision with root package name */
    public final ViewGroup f16072v;
    public int c = -1;

    /* renamed from: w  reason: collision with root package name */
    public final b f16073w = new b();

    /* compiled from: ViewDragHelper.java */
    /* loaded from: classes.dex */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.r(0);
        }
    }

    public c(Context context, ViewGroup viewGroup, AbstractC0191c abstractC0191c) {
        if (viewGroup != null) {
            if (abstractC0191c != null) {
                this.f16072v = viewGroup;
                this.f16069s = abstractC0191c;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.f16066p = i10;
                this.f16065o = i10;
                this.f16053b = viewConfiguration.getScaledTouchSlop();
                this.f16063m = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f16064n = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f16068r = new OverScroller(context, f16051x);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public static c i(ViewGroup viewGroup, float f10, AbstractC0191c abstractC0191c) {
        c cVar = new c(viewGroup.getContext(), viewGroup, abstractC0191c);
        cVar.f16053b = (int) ((1.0f / f10) * cVar.f16053b);
        return cVar;
    }

    public static boolean l(View view, int i10, int i11) {
        if (view == null || i10 < view.getLeft() || i10 >= view.getRight() || i11 < view.getTop() || i11 >= view.getBottom()) {
            return false;
        }
        return true;
    }

    public final void a() {
        b();
        if (this.f16052a == 2) {
            OverScroller overScroller = this.f16068r;
            overScroller.getCurrX();
            overScroller.getCurrY();
            overScroller.abortAnimation();
            this.f16069s.i(this.f16070t, overScroller.getCurrX(), overScroller.getCurrY());
        }
        r(0);
    }

    public final void b() {
        this.c = -1;
        float[] fArr = this.f16054d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f16055e, 0.0f);
            Arrays.fill(this.f16056f, 0.0f);
            Arrays.fill(this.f16057g, 0.0f);
            Arrays.fill(this.f16058h, 0);
            Arrays.fill(this.f16059i, 0);
            Arrays.fill(this.f16060j, 0);
            this.f16061k = 0;
        }
        VelocityTracker velocityTracker = this.f16062l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f16062l = null;
        }
    }

    public final void c(View view, int i10) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f16072v;
        if (parent == viewGroup) {
            this.f16070t = view;
            this.c = i10;
            this.f16069s.g(view, i10);
            r(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
    }

    public final boolean d(int i10, int i11, float f10, float f11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f16058h[i10] & i11) != i11 || (this.f16067q & i11) == 0 || (this.f16060j[i10] & i11) == i11 || (this.f16059i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f16053b;
        if (abs <= i12 && abs2 <= i12) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f16069s.getClass();
        }
        if ((this.f16059i[i10] & i11) != 0 || abs <= this.f16053b) {
            return false;
        }
        return true;
    }

    public final boolean e(View view, float f10, float f11) {
        boolean z10;
        boolean z11;
        if (view == null) {
            return false;
        }
        AbstractC0191c abstractC0191c = this.f16069s;
        if (abstractC0191c.c(view) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (abstractC0191c.d() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            float f12 = f11 * f11;
            int i10 = this.f16053b;
            if (f12 + (f10 * f10) <= i10 * i10) {
                return false;
            }
            return true;
        } else if (z10) {
            if (Math.abs(f10) <= this.f16053b) {
                return false;
            }
            return true;
        } else if (!z11 || Math.abs(f11) <= this.f16053b) {
            return false;
        } else {
            return true;
        }
    }

    public final void f(int i10) {
        float[] fArr = this.f16054d;
        if (fArr != null) {
            int i11 = this.f16061k;
            boolean z10 = true;
            int i12 = 1 << i10;
            if ((i12 & i11) == 0) {
                z10 = false;
            }
            if (z10) {
                fArr[i10] = 0.0f;
                this.f16055e[i10] = 0.0f;
                this.f16056f[i10] = 0.0f;
                this.f16057g[i10] = 0.0f;
                this.f16058h[i10] = 0;
                this.f16059i[i10] = 0;
                this.f16060j[i10] = 0;
                this.f16061k = (~i12) & i11;
            }
        }
    }

    public final int g(int i10, int i11, int i12) {
        int width;
        int abs;
        if (i10 == 0) {
            return 0;
        }
        float width2 = this.f16072v.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs2 = Math.abs(i11);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f);
        }
        return Math.min(abs, (int) OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD);
    }

    public final boolean h() {
        if (this.f16052a == 2) {
            OverScroller overScroller = this.f16068r;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f16070t.getLeft();
            int top = currY - this.f16070t.getTop();
            if (left != 0) {
                View view = this.f16070t;
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f16070t;
                WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f16069s.i(this.f16070t, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f16072v.post(this.f16073w);
            }
        }
        if (this.f16052a != 2) {
            return false;
        }
        return true;
    }

    public final View j(int i10, int i11) {
        ViewGroup viewGroup = this.f16072v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f16069s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f16070t
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f16070t
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f16068r
            r11 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r10.r(r11)
            return r11
        L1e:
            android.view.View r12 = r10.f16070t
            float r0 = r10.f16064n
            int r0 = (int) r0
            float r6 = r10.f16063m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L2e
            r13 = r11
            goto L35
        L2e:
            if (r7 <= r6) goto L35
            if (r13 <= 0) goto L34
            r13 = r6
            goto L35
        L34:
            int r13 = -r6
        L35:
            float r0 = r10.f16064n
            int r0 = (int) r0
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L3f
            goto L46
        L3f:
            if (r7 <= r6) goto L47
            if (r14 <= 0) goto L45
            r14 = r6
            goto L47
        L45:
            int r11 = -r6
        L46:
            r14 = r11
        L47:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L60
            float r11 = (float) r6
            float r6 = (float) r8
            goto L62
        L60:
            float r11 = (float) r11
            float r6 = (float) r9
        L62:
            float r11 = r11 / r6
            if (r14 == 0) goto L68
            float r0 = (float) r7
            float r6 = (float) r8
            goto L6a
        L68:
            float r0 = (float) r0
            float r6 = (float) r9
        L6a:
            float r0 = r0 / r6
            d1.c$c r6 = r10.f16069s
            int r12 = r6.c(r12)
            int r12 = r10.g(r4, r13, r12)
            int r13 = r6.d()
            int r13 = r10.g(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.r(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.c.k(int, int, int, int):boolean");
    }

    public final void m(MotionEvent motionEvent) {
        boolean z10;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f16062l == null) {
            this.f16062l = VelocityTracker.obtain();
        }
        this.f16062l.addMovement(motionEvent);
        AbstractC0191c abstractC0191c = this.f16069s;
        int i11 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f16052a == 1 && pointerId == this.c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i11 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i11);
                                            if (pointerId2 != this.c) {
                                                View j10 = j((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                                                View view = this.f16070t;
                                                if (j10 == view && v(view, pointerId2)) {
                                                    i10 = this.c;
                                                    break;
                                                }
                                            }
                                            i11++;
                                        } else {
                                            i10 = -1;
                                            break;
                                        }
                                    }
                                    if (i10 == -1) {
                                        n();
                                    }
                                }
                                f(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x4 = motionEvent.getX(actionIndex);
                        float y10 = motionEvent.getY(actionIndex);
                        p(pointerId3, x4, y10);
                        if (this.f16052a == 0) {
                            v(j((int) x4, (int) y10), pointerId3);
                            if ((this.f16058h[pointerId3] & this.f16067q) != 0) {
                                abstractC0191c.f();
                                return;
                            }
                            return;
                        }
                        if (l(this.f16070t, (int) x4, (int) y10)) {
                            v(this.f16070t, pointerId3);
                            return;
                        }
                        return;
                    }
                    if (this.f16052a == 1) {
                        this.f16071u = true;
                        abstractC0191c.j(this.f16070t, 0.0f, 0.0f);
                        this.f16071u = false;
                        if (this.f16052a == 1) {
                            r(0);
                        }
                    }
                    b();
                    return;
                } else if (this.f16052a == 1) {
                    int i12 = this.c;
                    if ((this.f16061k & (1 << i12)) != 0) {
                        i11 = 1;
                    }
                    if (i11 != 0) {
                        int findPointerIndex = motionEvent.findPointerIndex(i12);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y11 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f16056f;
                        int i13 = this.c;
                        int i14 = (int) (x10 - fArr[i13]);
                        int i15 = (int) (y11 - this.f16057g[i13]);
                        int left = this.f16070t.getLeft() + i14;
                        int top = this.f16070t.getTop() + i15;
                        int left2 = this.f16070t.getLeft();
                        int top2 = this.f16070t.getTop();
                        if (i14 != 0) {
                            left = abstractC0191c.a(this.f16070t, left);
                            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                            this.f16070t.offsetLeftAndRight(left - left2);
                        }
                        if (i15 != 0) {
                            top = abstractC0191c.b(this.f16070t, top);
                            WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
                            this.f16070t.offsetTopAndBottom(top - top2);
                        }
                        if (i14 != 0 || i15 != 0) {
                            abstractC0191c.i(this.f16070t, left, top);
                        }
                        q(motionEvent);
                        return;
                    }
                    return;
                } else {
                    int pointerCount2 = motionEvent.getPointerCount();
                    for (int i16 = 0; i16 < pointerCount2; i16++) {
                        int pointerId4 = motionEvent.getPointerId(i16);
                        if ((this.f16061k & (1 << pointerId4)) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            float x11 = motionEvent.getX(i16);
                            float y12 = motionEvent.getY(i16);
                            float f10 = x11 - this.f16054d[pointerId4];
                            float f11 = y12 - this.f16055e[pointerId4];
                            o(pointerId4, f10, f11);
                            if (this.f16052a == 1) {
                                break;
                            }
                            View j11 = j((int) x11, (int) y12);
                            if (e(j11, f10, f11) && v(j11, pointerId4)) {
                                break;
                            }
                        }
                    }
                    q(motionEvent);
                    return;
                }
            }
            if (this.f16052a == 1) {
                n();
            }
            b();
            return;
        }
        float x12 = motionEvent.getX();
        float y13 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View j12 = j((int) x12, (int) y13);
        p(pointerId5, x12, y13);
        v(j12, pointerId5);
        if ((this.f16058h[pointerId5] & this.f16067q) != 0) {
            abstractC0191c.f();
        }
    }

    public final void n() {
        VelocityTracker velocityTracker = this.f16062l;
        float f10 = this.f16063m;
        velocityTracker.computeCurrentVelocity(1000, f10);
        float xVelocity = this.f16062l.getXVelocity(this.c);
        float f11 = this.f16064n;
        float abs = Math.abs(xVelocity);
        float f12 = 0.0f;
        if (abs < f11) {
            xVelocity = 0.0f;
        } else if (abs > f10) {
            if (xVelocity > 0.0f) {
                xVelocity = f10;
            } else {
                xVelocity = -f10;
            }
        }
        float yVelocity = this.f16062l.getYVelocity(this.c);
        float f13 = this.f16064n;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f13) {
            if (abs2 > f10) {
                if (yVelocity <= 0.0f) {
                    f10 = -f10;
                }
                f12 = f10;
            } else {
                f12 = yVelocity;
            }
        }
        this.f16071u = true;
        this.f16069s.j(this.f16070t, xVelocity, f12);
        this.f16071u = false;
        if (this.f16052a == 1) {
            r(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [d1.c$c] */
    public final void o(int i10, float f10, float f11) {
        boolean d10 = d(i10, 1, f10, f11);
        boolean z10 = d10;
        if (d(i10, 4, f11, f10)) {
            z10 = d10 | true;
        }
        boolean z11 = z10;
        if (d(i10, 2, f10, f11)) {
            z11 = (z10 ? 1 : 0) | true;
        }
        ?? r02 = z11;
        if (d(i10, 8, f11, f10)) {
            r02 = (z11 ? 1 : 0) | true;
        }
        if (r02 != 0) {
            int[] iArr = this.f16059i;
            iArr[i10] = iArr[i10] | r02;
            this.f16069s.e(r02, i10);
        }
    }

    public final void p(int i10, float f10, float f11) {
        float[] fArr = this.f16054d;
        int i11 = 0;
        if (fArr == null || fArr.length <= i10) {
            int i12 = i10 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f16055e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f16056f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f16057g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f16058h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f16059i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f16060j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f16054d = fArr2;
            this.f16055e = fArr3;
            this.f16056f = fArr4;
            this.f16057g = fArr5;
            this.f16058h = iArr;
            this.f16059i = iArr2;
            this.f16060j = iArr3;
        }
        float[] fArr9 = this.f16054d;
        this.f16056f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f16055e;
        this.f16057g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f16058h;
        int i13 = (int) f10;
        int i14 = (int) f11;
        ViewGroup viewGroup = this.f16072v;
        if (i13 < viewGroup.getLeft() + this.f16065o) {
            i11 = 1;
        }
        if (i14 < viewGroup.getTop() + this.f16065o) {
            i11 |= 4;
        }
        if (i13 > viewGroup.getRight() - this.f16065o) {
            i11 |= 2;
        }
        if (i14 > viewGroup.getBottom() - this.f16065o) {
            i11 |= 8;
        }
        iArr7[i10] = i11;
        this.f16061k = (1 << i10) | this.f16061k;
    }

    public final void q(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            boolean z10 = true;
            if ((this.f16061k & (1 << pointerId)) == 0) {
                z10 = false;
            }
            if (z10) {
                float x4 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f16056f[pointerId] = x4;
                this.f16057g[pointerId] = y10;
            }
        }
    }

    public final void r(int i10) {
        this.f16072v.removeCallbacks(this.f16073w);
        if (this.f16052a != i10) {
            this.f16052a = i10;
            this.f16069s.h(i10);
            if (this.f16052a == 0) {
                this.f16070t = null;
            }
        }
    }

    public final boolean s(int i10, int i11) {
        if (this.f16071u) {
            return k(i10, i11, (int) this.f16062l.getXVelocity(this.c), (int) this.f16062l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00da, code lost:
        if (r13 != r12) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.c.t(android.view.MotionEvent):boolean");
    }

    public final boolean u(View view, int i10, int i11) {
        this.f16070t = view;
        this.c = -1;
        boolean k10 = k(i10, i11, 0, 0);
        if (!k10 && this.f16052a == 0 && this.f16070t != null) {
            this.f16070t = null;
        }
        return k10;
    }

    public final boolean v(View view, int i10) {
        if (view == this.f16070t && this.c == i10) {
            return true;
        }
        if (view != null && this.f16069s.k(view, i10)) {
            this.c = i10;
            c(view, i10);
            return true;
        }
        return false;
    }

    /* compiled from: ViewDragHelper.java */
    /* renamed from: d1.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0191c {
        public abstract int a(View view, int i10);

        public abstract int b(View view, int i10);

        public int c(View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public abstract void h(int i10);

        public abstract void i(View view, int i10, int i11);

        public abstract void j(View view, float f10, float f11);

        public abstract boolean k(View view, int i10);

        public void f() {
        }

        public void e(int i10, int i11) {
        }

        public void g(View view, int i10) {
        }
    }
}
