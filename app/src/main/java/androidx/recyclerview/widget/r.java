package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;

/* compiled from: ItemTouchHelper.java */
/* loaded from: classes.dex */
public final class r extends RecyclerView.l implements RecyclerView.o {
    public Rect A;
    public long B;

    /* renamed from: d  reason: collision with root package name */
    public float f4553d;

    /* renamed from: e  reason: collision with root package name */
    public float f4554e;

    /* renamed from: f  reason: collision with root package name */
    public float f4555f;

    /* renamed from: g  reason: collision with root package name */
    public float f4556g;

    /* renamed from: h  reason: collision with root package name */
    public float f4557h;

    /* renamed from: i  reason: collision with root package name */
    public float f4558i;

    /* renamed from: j  reason: collision with root package name */
    public float f4559j;

    /* renamed from: k  reason: collision with root package name */
    public float f4560k;

    /* renamed from: m  reason: collision with root package name */
    public final d f4562m;

    /* renamed from: o  reason: collision with root package name */
    public int f4564o;

    /* renamed from: q  reason: collision with root package name */
    public int f4566q;

    /* renamed from: r  reason: collision with root package name */
    public RecyclerView f4567r;

    /* renamed from: t  reason: collision with root package name */
    public VelocityTracker f4569t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f4570u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList f4571v;

    /* renamed from: x  reason: collision with root package name */
    public x0.e f4573x;

    /* renamed from: y  reason: collision with root package name */
    public e f4574y;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f4551a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final float[] f4552b = new float[2];
    public RecyclerView.b0 c = null;

    /* renamed from: l  reason: collision with root package name */
    public int f4561l = -1;

    /* renamed from: n  reason: collision with root package name */
    public int f4563n = 0;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f4565p = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    public final a f4568s = new a();

    /* renamed from: w  reason: collision with root package name */
    public View f4572w = null;

    /* renamed from: z  reason: collision with root package name */
    public final b f4575z = new b();

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
            if (r11 < 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
            if (r11 > 0) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 295
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.r.a.run():void");
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class b implements RecyclerView.q {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void c(RecyclerView recyclerView, MotionEvent motionEvent) {
            r rVar = r.this;
            rVar.f4573x.f31433a.f31434a.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = rVar.f4569t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (rVar.f4561l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(rVar.f4561l);
            if (findPointerIndex >= 0) {
                rVar.k(actionMasked, findPointerIndex, motionEvent);
            }
            RecyclerView.b0 b0Var = rVar.c;
            if (b0Var == null) {
                return;
            }
            int i10 = 0;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == rVar.f4561l) {
                                if (actionIndex == 0) {
                                    i10 = 1;
                                }
                                rVar.f4561l = motionEvent.getPointerId(i10);
                                rVar.u(rVar.f4564o, actionIndex, motionEvent);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    VelocityTracker velocityTracker2 = rVar.f4569t;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                } else if (findPointerIndex >= 0) {
                    rVar.u(rVar.f4564o, findPointerIndex, motionEvent);
                    rVar.q(b0Var);
                    RecyclerView recyclerView2 = rVar.f4567r;
                    a aVar = rVar.f4568s;
                    recyclerView2.removeCallbacks(aVar);
                    aVar.run();
                    rVar.f4567r.invalidate();
                    return;
                } else {
                    return;
                }
            }
            rVar.s(null, 0);
            rVar.f4561l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final boolean f(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            r rVar = r.this;
            rVar.f4573x.f31433a.f31434a.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            f fVar = null;
            if (actionMasked == 0) {
                rVar.f4561l = motionEvent.getPointerId(0);
                rVar.f4553d = motionEvent.getX();
                rVar.f4554e = motionEvent.getY();
                VelocityTracker velocityTracker = rVar.f4569t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                rVar.f4569t = VelocityTracker.obtain();
                if (rVar.c == null) {
                    ArrayList arrayList = rVar.f4565p;
                    if (!arrayList.isEmpty()) {
                        View n10 = rVar.n(motionEvent);
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            f fVar2 = (f) arrayList.get(size);
                            if (fVar2.f4588e.itemView == n10) {
                                fVar = fVar2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (fVar != null) {
                        rVar.f4553d -= fVar.f4592i;
                        rVar.f4554e -= fVar.f4593j;
                        RecyclerView.b0 b0Var = fVar.f4588e;
                        rVar.m(b0Var, true);
                        if (rVar.f4551a.remove(b0Var.itemView)) {
                            rVar.f4562m.a(rVar.f4567r, b0Var);
                        }
                        rVar.s(b0Var, fVar.f4589f);
                        rVar.u(rVar.f4564o, 0, motionEvent);
                    }
                }
            } else if (actionMasked != 3 && actionMasked != 1) {
                int i10 = rVar.f4561l;
                if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                    rVar.k(actionMasked, findPointerIndex, motionEvent);
                }
            } else {
                rVar.f4561l = -1;
                rVar.s(null, 0);
            }
            VelocityTracker velocityTracker2 = rVar.f4569t;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (rVar.c != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void j(boolean z10) {
            if (!z10) {
                return;
            }
            r.this.s(null, 0);
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class c extends f {

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ int f4578n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.b0 f4579o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.b0 b0Var, int i10, int i11, float f10, float f11, float f12, float f13, int i12, RecyclerView.b0 b0Var2) {
            super(b0Var, i11, f10, f11, f12, f13);
            this.f4578n = i12;
            this.f4579o = b0Var2;
        }

        @Override // androidx.recyclerview.widget.r.f, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f4594k) {
                return;
            }
            int i10 = this.f4578n;
            RecyclerView.b0 b0Var = this.f4579o;
            r rVar = r.this;
            if (i10 <= 0) {
                rVar.f4562m.a(rVar.f4567r, b0Var);
            } else {
                rVar.f4551a.add(b0Var.itemView);
                this.f4591h = true;
                if (i10 > 0) {
                    rVar.f4567r.post(new s(rVar, this, i10));
                }
            }
            View view = rVar.f4572w;
            View view2 = b0Var.itemView;
            if (view == view2) {
                rVar.r(view2);
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public static abstract class d {

        /* renamed from: b  reason: collision with root package name */
        public static final b f4581b;

        /* renamed from: a  reason: collision with root package name */
        public int f4582a = -1;

        /* compiled from: ItemTouchHelper.java */
        /* loaded from: classes.dex */
        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f10) {
                return f10 * f10 * f10 * f10 * f10;
            }
        }

        /* compiled from: ItemTouchHelper.java */
        /* loaded from: classes.dex */
        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        }

        static {
            new a();
            f4581b = new b();
        }

        public void a(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            View view = b0Var.itemView;
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                float floatValue = ((Float) tag).floatValue();
                WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
                f0.i.s(view, floatValue);
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        public abstract int b(RecyclerView recyclerView, RecyclerView.b0 b0Var);

        public final int c(RecyclerView recyclerView, int i10, int i11, long j10) {
            if (this.f4582a == -1) {
                this.f4582a = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            int i12 = this.f4582a;
            float f10 = 1.0f;
            int interpolation = (int) (f4581b.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)) * ((int) Math.signum(i11)) * i12);
            if (j10 <= 2000) {
                f10 = ((float) j10) / 2000.0f;
            }
            int i13 = (int) (f10 * f10 * f10 * f10 * f10 * interpolation);
            if (i13 == 0) {
                if (i11 <= 0) {
                    return -1;
                }
                return 1;
            }
            return i13;
        }

        public abstract boolean d();

        public void e(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var, float f10, float f11, int i10, boolean z10) {
            View view = b0Var.itemView;
            if (z10 && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
                Float valueOf = Float.valueOf(f0.i.i(view));
                int childCount = recyclerView.getChildCount();
                float f12 = 0.0f;
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = recyclerView.getChildAt(i11);
                    if (childAt != view) {
                        WeakHashMap<View, n0> weakHashMap2 = x0.f0.f31435a;
                        float i12 = f0.i.i(childAt);
                        if (i12 > f12) {
                            f12 = i12;
                        }
                    }
                }
                f0.i.s(view, f12 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
            }
            view.setTranslationX(f10);
            view.setTranslationY(f11);
        }

        public abstract boolean f(RecyclerView recyclerView, RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2);

        public abstract void g(RecyclerView.b0 b0Var, int i10);

        public abstract void h(RecyclerView.b0 b0Var);
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class e extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4583a = true;

        public e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            r rVar;
            View n10;
            RecyclerView.b0 W;
            int i10;
            if (this.f4583a && (n10 = (rVar = r.this).n(motionEvent)) != null && (W = rVar.f4567r.W(n10)) != null) {
                RecyclerView recyclerView = rVar.f4567r;
                d dVar = rVar.f4562m;
                int b10 = dVar.b(recyclerView, W);
                WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
                int d10 = f0.e.d(recyclerView);
                int i11 = b10 & 3158064;
                boolean z10 = true;
                if (i11 != 0) {
                    int i12 = b10 & (~i11);
                    if (d10 == 0) {
                        i10 = i11 >> 2;
                    } else {
                        int i13 = i11 >> 1;
                        i12 |= (-3158065) & i13;
                        i10 = (i13 & 3158064) >> 2;
                    }
                    b10 = i12 | i10;
                }
                if ((16711680 & b10) == 0) {
                    z10 = false;
                }
                if (!z10) {
                    return;
                }
                int pointerId = motionEvent.getPointerId(0);
                int i14 = rVar.f4561l;
                if (pointerId == i14) {
                    int findPointerIndex = motionEvent.findPointerIndex(i14);
                    float x4 = motionEvent.getX(findPointerIndex);
                    float y10 = motionEvent.getY(findPointerIndex);
                    rVar.f4553d = x4;
                    rVar.f4554e = y10;
                    rVar.f4558i = 0.0f;
                    rVar.f4557h = 0.0f;
                    if (dVar.d()) {
                        rVar.s(W, 2);
                    }
                }
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public interface g {
        void i(View view, View view2);
    }

    public r(ep.b bVar) {
        this.f4562m = bVar;
    }

    public static boolean p(View view, float f10, float f11, float f12, float f13) {
        if (f10 >= f12 && f10 <= f12 + view.getWidth() && f11 >= f13 && f11 <= f13 + view.getHeight()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void a(View view) {
        r(view);
        RecyclerView.b0 W = this.f4567r.W(view);
        if (W == null) {
            return;
        }
        RecyclerView.b0 b0Var = this.c;
        if (b0Var != null && W == b0Var) {
            s(null, 0);
            return;
        }
        m(W, false);
        if (this.f4551a.remove(W.itemView)) {
            this.f4562m.a(this.f4567r, W);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        float f11;
        if (this.c != null) {
            float[] fArr = this.f4552b;
            o(fArr);
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        RecyclerView.b0 b0Var = this.c;
        ArrayList arrayList = this.f4565p;
        int i10 = this.f4563n;
        d dVar = this.f4562m;
        dVar.getClass();
        int i11 = 0;
        for (int size = arrayList.size(); i11 < size; size = size) {
            f fVar = (f) arrayList.get(i11);
            float f13 = fVar.f4585a;
            float f14 = fVar.c;
            int i12 = (f13 > f14 ? 1 : (f13 == f14 ? 0 : -1));
            RecyclerView.b0 b0Var2 = fVar.f4588e;
            if (i12 == 0) {
                fVar.f4592i = b0Var2.itemView.getTranslationX();
            } else {
                fVar.f4592i = androidx.activity.r.l(f14, f13, fVar.f4596m, f13);
            }
            float f15 = fVar.f4586b;
            float f16 = fVar.f4587d;
            if (f15 == f16) {
                fVar.f4593j = b0Var2.itemView.getTranslationY();
            } else {
                fVar.f4593j = androidx.activity.r.l(f16, f15, fVar.f4596m, f15);
            }
            int save = canvas.save();
            dVar.e(canvas, recyclerView, fVar.f4588e, fVar.f4592i, fVar.f4593j, fVar.f4589f, false);
            canvas.restoreToCount(save);
            i11++;
        }
        if (b0Var != null) {
            int save2 = canvas.save();
            dVar.e(canvas, recyclerView, b0Var, f10, f11, i10, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        boolean z10 = false;
        if (this.c != null) {
            float[] fArr = this.f4552b;
            o(fArr);
            float f10 = fArr[0];
            float f11 = fArr[1];
        }
        RecyclerView.b0 b0Var = this.c;
        ArrayList arrayList = this.f4565p;
        this.f4562m.getClass();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            int save = canvas.save();
            View view = ((f) arrayList.get(i10)).f4588e.itemView;
            canvas.restoreToCount(save);
        }
        if (b0Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            f fVar = (f) arrayList.get(i11);
            boolean z11 = fVar.f4595l;
            if (z11 && !fVar.f4591h) {
                arrayList.remove(i11);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public final void h(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4567r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        b bVar = this.f4575z;
        if (recyclerView2 != null) {
            recyclerView2.m0(this);
            RecyclerView recyclerView3 = this.f4567r;
            recyclerView3.f4246q.remove(bVar);
            if (recyclerView3.f4248r == bVar) {
                recyclerView3.f4248r = null;
            }
            ArrayList arrayList = this.f4567r.C;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.f4565p;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                f fVar = (f) arrayList2.get(0);
                fVar.f4590g.cancel();
                this.f4562m.a(this.f4567r, fVar.f4588e);
            }
            arrayList2.clear();
            this.f4572w = null;
            VelocityTracker velocityTracker = this.f4569t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f4569t = null;
            }
            e eVar = this.f4574y;
            if (eVar != null) {
                eVar.f4583a = false;
                this.f4574y = null;
            }
            if (this.f4573x != null) {
                this.f4573x = null;
            }
        }
        this.f4567r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f4555f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.f4556g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.f4566q = ViewConfiguration.get(this.f4567r.getContext()).getScaledTouchSlop();
            this.f4567r.q(this);
            this.f4567r.r(bVar);
            RecyclerView recyclerView4 = this.f4567r;
            if (recyclerView4.C == null) {
                recyclerView4.C = new ArrayList();
            }
            recyclerView4.C.add(this);
            this.f4574y = new e();
            this.f4573x = new x0.e(this.f4567r.getContext(), this.f4574y);
        }
    }

    public final int i(int i10) {
        int i11;
        if ((i10 & 12) != 0) {
            int i12 = 8;
            if (this.f4557h > 0.0f) {
                i11 = 8;
            } else {
                i11 = 4;
            }
            VelocityTracker velocityTracker = this.f4569t;
            d dVar = this.f4562m;
            if (velocityTracker != null && this.f4561l > -1) {
                float f10 = this.f4556g;
                dVar.getClass();
                velocityTracker.computeCurrentVelocity(1000, f10);
                float xVelocity = this.f4569t.getXVelocity(this.f4561l);
                float yVelocity = this.f4569t.getYVelocity(this.f4561l);
                if (xVelocity <= 0.0f) {
                    i12 = 4;
                }
                float abs = Math.abs(xVelocity);
                if ((i12 & i10) != 0 && i11 == i12 && abs >= this.f4555f && abs > Math.abs(yVelocity)) {
                    return i12;
                }
            }
            dVar.getClass();
            float width = this.f4567r.getWidth() * 0.5f;
            if ((i10 & i11) != 0 && Math.abs(this.f4557h) > width) {
                return i11;
            }
            return 0;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r9, int r10, android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.r.k(int, int, android.view.MotionEvent):void");
    }

    public final int l(int i10) {
        int i11;
        if ((i10 & 3) != 0) {
            int i12 = 2;
            if (this.f4558i > 0.0f) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            VelocityTracker velocityTracker = this.f4569t;
            d dVar = this.f4562m;
            if (velocityTracker != null && this.f4561l > -1) {
                float f10 = this.f4556g;
                dVar.getClass();
                velocityTracker.computeCurrentVelocity(1000, f10);
                float xVelocity = this.f4569t.getXVelocity(this.f4561l);
                float yVelocity = this.f4569t.getYVelocity(this.f4561l);
                if (yVelocity <= 0.0f) {
                    i12 = 1;
                }
                float abs = Math.abs(yVelocity);
                if ((i12 & i10) != 0 && i12 == i11 && abs >= this.f4555f && abs > Math.abs(xVelocity)) {
                    return i12;
                }
            }
            dVar.getClass();
            float height = this.f4567r.getHeight() * 0.5f;
            if ((i10 & i11) != 0 && Math.abs(this.f4558i) > height) {
                return i11;
            }
            return 0;
        }
        return 0;
    }

    public final void m(RecyclerView.b0 b0Var, boolean z10) {
        f fVar;
        ArrayList arrayList = this.f4565p;
        int size = arrayList.size();
        do {
            size--;
            if (size >= 0) {
                fVar = (f) arrayList.get(size);
            } else {
                return;
            }
        } while (fVar.f4588e != b0Var);
        fVar.f4594k |= z10;
        if (!fVar.f4595l) {
            fVar.f4590g.cancel();
        }
        arrayList.remove(size);
    }

    public final View n(MotionEvent motionEvent) {
        f fVar;
        View view;
        float x4 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.b0 b0Var = this.c;
        if (b0Var != null) {
            View view2 = b0Var.itemView;
            if (p(view2, x4, y10, this.f4559j + this.f4557h, this.f4560k + this.f4558i)) {
                return view2;
            }
        }
        ArrayList arrayList = this.f4565p;
        int size = arrayList.size();
        do {
            size--;
            if (size >= 0) {
                fVar = (f) arrayList.get(size);
                view = fVar.f4588e.itemView;
            } else {
                return this.f4567r.M(x4, y10);
            }
        } while (!p(view, x4, y10, fVar.f4592i, fVar.f4593j));
        return view;
    }

    public final void o(float[] fArr) {
        if ((this.f4564o & 12) != 0) {
            fArr[0] = (this.f4559j + this.f4557h) - this.c.itemView.getLeft();
        } else {
            fArr[0] = this.c.itemView.getTranslationX();
        }
        if ((this.f4564o & 3) != 0) {
            fArr[1] = (this.f4560k + this.f4558i) - this.c.itemView.getTop();
        } else {
            fArr[1] = this.c.itemView.getTranslationY();
        }
    }

    public final void q(RecyclerView.b0 b0Var) {
        ArrayList arrayList;
        int i10;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i11;
        int i12;
        int i13;
        char c10;
        if (this.f4567r.isLayoutRequested() || this.f4563n != 2) {
            return;
        }
        d dVar = this.f4562m;
        dVar.getClass();
        int i14 = (int) (this.f4559j + this.f4557h);
        int i15 = (int) (this.f4560k + this.f4558i);
        if (Math.abs(i15 - b0Var.itemView.getTop()) < b0Var.itemView.getHeight() * 0.5f && Math.abs(i14 - b0Var.itemView.getLeft()) < b0Var.itemView.getWidth() * 0.5f) {
            return;
        }
        ArrayList arrayList2 = this.f4570u;
        if (arrayList2 == null) {
            this.f4570u = new ArrayList();
            this.f4571v = new ArrayList();
        } else {
            arrayList2.clear();
            this.f4571v.clear();
        }
        int round = Math.round(this.f4559j + this.f4557h) - 0;
        int round2 = Math.round(this.f4560k + this.f4558i) - 0;
        int width = b0Var.itemView.getWidth() + round + 0;
        int height = b0Var.itemView.getHeight() + round2 + 0;
        int i16 = (round + width) / 2;
        int i17 = (round2 + height) / 2;
        RecyclerView.m layoutManager = this.f4567r.getLayoutManager();
        int I = layoutManager.I();
        int i18 = 0;
        while (i18 < I) {
            View H = layoutManager.H(i18);
            if (H != b0Var.itemView && H.getBottom() >= round2 && H.getTop() <= height && H.getRight() >= round && H.getLeft() <= width) {
                RecyclerView.b0 W = this.f4567r.W(H);
                c10 = 2;
                int abs5 = Math.abs(i16 - ((H.getRight() + H.getLeft()) / 2));
                int abs6 = Math.abs(i17 - ((H.getBottom() + H.getTop()) / 2));
                int i19 = (abs6 * abs6) + (abs5 * abs5);
                i11 = round;
                int size = this.f4570u.size();
                i12 = round2;
                i13 = width;
                int i20 = 0;
                int i21 = 0;
                while (i20 < size) {
                    int i22 = size;
                    if (i19 <= ((Integer) this.f4571v.get(i20)).intValue()) {
                        break;
                    }
                    i21++;
                    i20++;
                    size = i22;
                }
                this.f4570u.add(i21, W);
                this.f4571v.add(i21, Integer.valueOf(i19));
            } else {
                i11 = round;
                i12 = round2;
                i13 = width;
                c10 = 2;
            }
            i18++;
            round = i11;
            round2 = i12;
            width = i13;
        }
        ArrayList arrayList3 = this.f4570u;
        if (arrayList3.size() == 0) {
            return;
        }
        int width2 = b0Var.itemView.getWidth() + i14;
        int height2 = b0Var.itemView.getHeight() + i15;
        int left2 = i14 - b0Var.itemView.getLeft();
        int top2 = i15 - b0Var.itemView.getTop();
        int size2 = arrayList3.size();
        int i23 = -1;
        RecyclerView.b0 b0Var2 = null;
        int i24 = 0;
        while (i24 < size2) {
            RecyclerView.b0 b0Var3 = (RecyclerView.b0) arrayList3.get(i24);
            if (left2 > 0 && (right = b0Var3.itemView.getRight() - width2) < 0) {
                arrayList = arrayList3;
                i10 = width2;
                if (b0Var3.itemView.getRight() > b0Var.itemView.getRight() && (abs4 = Math.abs(right)) > i23) {
                    i23 = abs4;
                    b0Var2 = b0Var3;
                }
            } else {
                arrayList = arrayList3;
                i10 = width2;
            }
            if (left2 < 0 && (left = b0Var3.itemView.getLeft() - i14) > 0 && b0Var3.itemView.getLeft() < b0Var.itemView.getLeft() && (abs3 = Math.abs(left)) > i23) {
                i23 = abs3;
                b0Var2 = b0Var3;
            }
            if (top2 < 0 && (top = b0Var3.itemView.getTop() - i15) > 0 && b0Var3.itemView.getTop() < b0Var.itemView.getTop() && (abs2 = Math.abs(top)) > i23) {
                i23 = abs2;
                b0Var2 = b0Var3;
            }
            if (top2 > 0 && (bottom = b0Var3.itemView.getBottom() - height2) < 0 && b0Var3.itemView.getBottom() > b0Var.itemView.getBottom() && (abs = Math.abs(bottom)) > i23) {
                i23 = abs;
                b0Var2 = b0Var3;
            }
            i24++;
            arrayList3 = arrayList;
            width2 = i10;
        }
        if (b0Var2 == null) {
            this.f4570u.clear();
            this.f4571v.clear();
            return;
        }
        int absoluteAdapterPosition = b0Var2.getAbsoluteAdapterPosition();
        b0Var.getAbsoluteAdapterPosition();
        if (dVar.f(this.f4567r, b0Var, b0Var2)) {
            RecyclerView recyclerView = this.f4567r;
            RecyclerView.m layoutManager2 = recyclerView.getLayoutManager();
            if (layoutManager2 instanceof g) {
                ((g) layoutManager2).i(b0Var.itemView, b0Var2.itemView);
                return;
            }
            if (layoutManager2.p()) {
                View view = b0Var2.itemView;
                if (view.getLeft() - RecyclerView.m.O(view) <= recyclerView.getPaddingLeft()) {
                    recyclerView.r0(absoluteAdapterPosition);
                }
                View view2 = b0Var2.itemView;
                if (RecyclerView.m.R(view2) + view2.getRight() >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.r0(absoluteAdapterPosition);
                }
            }
            if (layoutManager2.q()) {
                View view3 = b0Var2.itemView;
                if (view3.getTop() - RecyclerView.m.T(view3) <= recyclerView.getPaddingTop()) {
                    recyclerView.r0(absoluteAdapterPosition);
                }
                View view4 = b0Var2.itemView;
                if (RecyclerView.m.G(view4) + view4.getBottom() >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.r0(absoluteAdapterPosition);
                }
            }
        }
    }

    public final void r(View view) {
        if (view == this.f4572w) {
            this.f4572w = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
        if (r0 == 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
        r0 = r1 << 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
        r0 = r1 << 1;
        r2 = r2 | (r0 & (-789517));
        r0 = (r0 & 789516) << 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bd, code lost:
        r2 = r0 | r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c4, code lost:
        if (r2 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e4, code lost:
        if (r0 == 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(androidx.recyclerview.widget.RecyclerView.b0 r25, int r26) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.r.s(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    public final void t(RecyclerView.b0 b0Var) {
        int i10;
        RecyclerView recyclerView = this.f4567r;
        int b10 = this.f4562m.b(recyclerView, b0Var);
        WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
        int d10 = f0.e.d(recyclerView);
        int i11 = b10 & 3158064;
        boolean z10 = true;
        if (i11 != 0) {
            int i12 = b10 & (~i11);
            if (d10 == 0) {
                i10 = i11 >> 2;
            } else {
                int i13 = i11 >> 1;
                i12 |= (-3158065) & i13;
                i10 = (i13 & 3158064) >> 2;
            }
            b10 = i12 | i10;
        }
        if ((16711680 & b10) == 0) {
            z10 = false;
        }
        if (!z10 || b0Var.itemView.getParent() != this.f4567r) {
            return;
        }
        VelocityTracker velocityTracker = this.f4569t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f4569t = VelocityTracker.obtain();
        this.f4558i = 0.0f;
        this.f4557h = 0.0f;
        s(b0Var, 2);
    }

    public final void u(int i10, int i11, MotionEvent motionEvent) {
        float x4 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x4 - this.f4553d;
        this.f4557h = f10;
        this.f4558i = y10 - this.f4554e;
        if ((i10 & 4) == 0) {
            this.f4557h = Math.max(0.0f, f10);
        }
        if ((i10 & 8) == 0) {
            this.f4557h = Math.min(0.0f, this.f4557h);
        }
        if ((i10 & 1) == 0) {
            this.f4558i = Math.max(0.0f, this.f4558i);
        }
        if ((i10 & 2) == 0) {
            this.f4558i = Math.min(0.0f, this.f4558i);
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public static class f implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final float f4585a;

        /* renamed from: b  reason: collision with root package name */
        public final float f4586b;
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f4587d;

        /* renamed from: e  reason: collision with root package name */
        public final RecyclerView.b0 f4588e;

        /* renamed from: f  reason: collision with root package name */
        public final int f4589f;

        /* renamed from: g  reason: collision with root package name */
        public final ValueAnimator f4590g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f4591h;

        /* renamed from: i  reason: collision with root package name */
        public float f4592i;

        /* renamed from: j  reason: collision with root package name */
        public float f4593j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f4594k = false;

        /* renamed from: l  reason: collision with root package name */
        public boolean f4595l = false;

        /* renamed from: m  reason: collision with root package name */
        public float f4596m;

        public f(RecyclerView.b0 b0Var, int i10, float f10, float f11, float f12, float f13) {
            this.f4589f = i10;
            this.f4588e = b0Var;
            this.f4585a = f10;
            this.f4586b = f11;
            this.c = f12;
            this.f4587d = f13;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f4590g = ofFloat;
            ofFloat.addUpdateListener(new t(this));
            ofFloat.setTarget(b0Var.itemView);
            ofFloat.addListener(this);
            this.f4596m = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f4596m = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f4595l) {
                this.f4588e.setIsRecyclable(true);
            }
            this.f4595l = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void b(View view) {
    }
}
