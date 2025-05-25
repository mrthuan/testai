package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.ArrayList;
import java.util.WeakHashMap;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import x0.f0;
import x0.n0;

/* compiled from: FastScroller.java */
/* loaded from: classes.dex */
public final class p extends RecyclerView.l implements RecyclerView.q {
    public static final int[] C = {16842919};
    public static final int[] D = new int[0];
    public int A;
    public final a B;

    /* renamed from: a  reason: collision with root package name */
    public final int f4509a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4510b;
    public final StateListDrawable c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f4511d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4512e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4513f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f4514g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f4515h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4516i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4517j;

    /* renamed from: k  reason: collision with root package name */
    public int f4518k;

    /* renamed from: l  reason: collision with root package name */
    public int f4519l;

    /* renamed from: m  reason: collision with root package name */
    public float f4520m;

    /* renamed from: n  reason: collision with root package name */
    public int f4521n;

    /* renamed from: o  reason: collision with root package name */
    public int f4522o;

    /* renamed from: p  reason: collision with root package name */
    public float f4523p;

    /* renamed from: s  reason: collision with root package name */
    public RecyclerView f4526s;

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f4533z;

    /* renamed from: q  reason: collision with root package name */
    public int f4524q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f4525r = 0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4527t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4528u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f4529v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f4530w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f4531x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f4532y = new int[2];

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            p pVar = p.this;
            int i10 = pVar.A;
            ValueAnimator valueAnimator = pVar.f4533z;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
            } else {
                valueAnimator.cancel();
            }
            pVar.A = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration((long) OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM);
            valueAnimator.start();
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.r {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void b(RecyclerView recyclerView, int i10, int i11) {
            boolean z10;
            boolean z11;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            p pVar = p.this;
            int computeVerticalScrollRange = pVar.f4526s.computeVerticalScrollRange();
            int i12 = pVar.f4525r;
            int i13 = computeVerticalScrollRange - i12;
            int i14 = pVar.f4509a;
            if (i13 > 0 && i12 >= i14) {
                z10 = true;
            } else {
                z10 = false;
            }
            pVar.f4527t = z10;
            int computeHorizontalScrollRange = pVar.f4526s.computeHorizontalScrollRange();
            int i15 = pVar.f4524q;
            if (computeHorizontalScrollRange - i15 > 0 && i15 >= i14) {
                z11 = true;
            } else {
                z11 = false;
            }
            pVar.f4528u = z11;
            boolean z12 = pVar.f4527t;
            if (!z12 && !z11) {
                if (pVar.f4529v != 0) {
                    pVar.k(0);
                    return;
                }
                return;
            }
            if (z12) {
                float f10 = i12;
                pVar.f4519l = (int) ((((f10 / 2.0f) + computeVerticalScrollOffset) * f10) / computeVerticalScrollRange);
                pVar.f4518k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
            }
            if (pVar.f4528u) {
                float f11 = computeHorizontalScrollOffset;
                float f12 = i15;
                pVar.f4522o = (int) ((((f12 / 2.0f) + f11) * f12) / computeHorizontalScrollRange);
                pVar.f4521n = Math.min(i15, (i15 * i15) / computeHorizontalScrollRange);
            }
            int i16 = pVar.f4529v;
            if (i16 == 0 || i16 == 1) {
                pVar.k(1);
            }
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4536a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f4536a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f4536a) {
                this.f4536a = false;
                return;
            }
            p pVar = p.this;
            if (((Float) pVar.f4533z.getAnimatedValue()).floatValue() == 0.0f) {
                pVar.A = 0;
                pVar.k(0);
                return;
            }
            pVar.A = 2;
            pVar.f4526s.invalidate();
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            p pVar = p.this;
            pVar.c.setAlpha(floatValue);
            pVar.f4511d.setAlpha(floatValue);
            pVar.f4526s.invalidate();
        }
    }

    public p(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4533z = ofFloat;
        this.A = 0;
        a aVar = new a();
        this.B = aVar;
        b bVar = new b();
        this.c = stateListDrawable;
        this.f4511d = drawable;
        this.f4514g = stateListDrawable2;
        this.f4515h = drawable2;
        this.f4512e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f4513f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f4516i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f4517j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f4509a = i11;
        this.f4510b = i12;
        stateListDrawable.setAlpha(FunctionEval.FunctionID.EXTERNAL_FUNC);
        drawable.setAlpha(FunctionEval.FunctionID.EXTERNAL_FUNC);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f4526s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.m0(this);
                RecyclerView recyclerView3 = this.f4526s;
                recyclerView3.f4246q.remove(this);
                if (recyclerView3.f4248r == this) {
                    recyclerView3.f4248r = null;
                }
                ArrayList arrayList = this.f4526s.f4233j0;
                if (arrayList != null) {
                    arrayList.remove(bVar);
                }
                this.f4526s.removeCallbacks(aVar);
            }
            this.f4526s = recyclerView;
            if (recyclerView != null) {
                recyclerView.q(this);
                this.f4526s.r(this);
                this.f4526s.s(bVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
        if (r8 >= 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0112, code lost:
        if (r4 >= 0) goto L47;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.recyclerview.widget.RecyclerView r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.p.c(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final boolean f(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f4529v;
        if (i10 == 1) {
            boolean i11 = i(motionEvent.getX(), motionEvent.getY());
            boolean h10 = h(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (i11 || h10)) {
                if (h10) {
                    this.f4530w = 1;
                    this.f4523p = (int) motionEvent.getX();
                } else if (i11) {
                    this.f4530w = 2;
                    this.f4520m = (int) motionEvent.getY();
                }
                k(2);
                return true;
            }
        } else if (i10 == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        if (this.f4524q == this.f4526s.getWidth() && this.f4525r == this.f4526s.getHeight()) {
            if (this.A != 0) {
                if (this.f4527t) {
                    int i10 = this.f4524q;
                    int i11 = this.f4512e;
                    int i12 = i10 - i11;
                    int i13 = this.f4519l;
                    int i14 = this.f4518k;
                    int i15 = i13 - (i14 / 2);
                    StateListDrawable stateListDrawable = this.c;
                    stateListDrawable.setBounds(0, 0, i11, i14);
                    int i16 = this.f4525r;
                    int i17 = this.f4513f;
                    Drawable drawable = this.f4511d;
                    drawable.setBounds(0, 0, i17, i16);
                    RecyclerView recyclerView2 = this.f4526s;
                    WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
                    boolean z10 = true;
                    if (f0.e.d(recyclerView2) != 1) {
                        z10 = false;
                    }
                    if (z10) {
                        drawable.draw(canvas);
                        canvas.translate(i11, i15);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i11, -i15);
                    } else {
                        canvas.translate(i12, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i15);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i12, -i15);
                    }
                }
                if (this.f4528u) {
                    int i18 = this.f4525r;
                    int i19 = this.f4516i;
                    int i20 = i18 - i19;
                    int i21 = this.f4522o;
                    int i22 = this.f4521n;
                    int i23 = i21 - (i22 / 2);
                    StateListDrawable stateListDrawable2 = this.f4514g;
                    stateListDrawable2.setBounds(0, 0, i22, i19);
                    int i24 = this.f4524q;
                    int i25 = this.f4517j;
                    Drawable drawable2 = this.f4515h;
                    drawable2.setBounds(0, 0, i24, i25);
                    canvas.translate(0.0f, i20);
                    drawable2.draw(canvas);
                    canvas.translate(i23, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i23, -i20);
                    return;
                }
                return;
            }
            return;
        }
        this.f4524q = this.f4526s.getWidth();
        this.f4525r = this.f4526s.getHeight();
        k(0);
    }

    public final boolean h(float f10, float f11) {
        if (f11 >= this.f4525r - this.f4516i) {
            int i10 = this.f4522o;
            int i11 = this.f4521n;
            if (f10 >= i10 - (i11 / 2) && f10 <= (i11 / 2) + i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(float f10, float f11) {
        boolean z10;
        RecyclerView recyclerView = this.f4526s;
        WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
        if (f0.e.d(recyclerView) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f4512e;
        if (z10) {
            if (f10 > i10) {
                return false;
            }
        } else if (f10 < this.f4524q - i10) {
            return false;
        }
        int i11 = this.f4519l;
        int i12 = this.f4518k / 2;
        if (f11 < i11 - i12 || f11 > i12 + i11) {
            return false;
        }
        return true;
    }

    public final void k(int i10) {
        a aVar = this.B;
        StateListDrawable stateListDrawable = this.c;
        if (i10 == 2 && this.f4529v != 2) {
            stateListDrawable.setState(C);
            this.f4526s.removeCallbacks(aVar);
        }
        if (i10 == 0) {
            this.f4526s.invalidate();
        } else {
            l();
        }
        if (this.f4529v == 2 && i10 != 2) {
            stateListDrawable.setState(D);
            this.f4526s.removeCallbacks(aVar);
            this.f4526s.postDelayed(aVar, 1200);
        } else if (i10 == 1) {
            this.f4526s.removeCallbacks(aVar);
            this.f4526s.postDelayed(aVar, (long) TTAdConstant.STYLE_SIZE_RADIO_3_2);
        }
        this.f4529v = i10;
    }

    public final void l() {
        int i10 = this.A;
        ValueAnimator valueAnimator = this.f4533z;
        if (i10 != 0) {
            if (i10 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void j(boolean z10) {
    }
}
