package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.widget.FastScrollRecyclerView;
import pdf.pdfreader.viewer.editor.free.utils.e;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* loaded from: classes3.dex */
public class FastScroller {
    public boolean A;
    public final RectF B;

    /* renamed from: a  reason: collision with root package name */
    public final FastScrollRecyclerView f25395a;

    /* renamed from: b  reason: collision with root package name */
    public final int f25396b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final Paint f25397d;

    /* renamed from: e  reason: collision with root package name */
    public final Paint f25398e;

    /* renamed from: f  reason: collision with root package name */
    public final int f25399f;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f25400g = new Rect();

    /* renamed from: h  reason: collision with root package name */
    public final Rect f25401h = new Rect();

    /* renamed from: i  reason: collision with root package name */
    public final Rect f25402i = new Rect();

    /* renamed from: j  reason: collision with root package name */
    public final Rect f25403j;

    /* renamed from: k  reason: collision with root package name */
    public final int f25404k;

    /* renamed from: l  reason: collision with root package name */
    public int f25405l;

    /* renamed from: m  reason: collision with root package name */
    public final Point f25406m;

    /* renamed from: n  reason: collision with root package name */
    public final Point f25407n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f25408o;

    /* renamed from: p  reason: collision with root package name */
    public Animator f25409p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f25410q;

    /* renamed from: r  reason: collision with root package name */
    public int f25411r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f25412s;

    /* renamed from: t  reason: collision with root package name */
    public final a f25413t;

    /* renamed from: u  reason: collision with root package name */
    public int f25414u;

    /* renamed from: v  reason: collision with root package name */
    public int f25415v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f25416w;

    /* renamed from: x  reason: collision with root package name */
    public final int f25417x;

    /* renamed from: y  reason: collision with root package name */
    public int f25418y;

    /* renamed from: z  reason: collision with root package name */
    public final Bitmap f25419z;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FastScroller fastScroller = FastScroller.this;
            if (!fastScroller.f25408o) {
                Animator animator = fastScroller.f25409p;
                if (animator != null) {
                    animator.cancel();
                }
                String p10 = ea.a.p("XGYtcxZ0WA==", "YxvVerP0");
                int i10 = 1;
                int[] iArr = new int[1];
                if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(fastScroller.f25395a.getContext())) {
                    i10 = -1;
                }
                iArr[0] = Math.max(fastScroller.f25399f, fastScroller.c) * i10;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(fastScroller, p10, iArr);
                fastScroller.f25409p = ofInt;
                ofInt.setInterpolator(new m1.a());
                fastScroller.f25409p.setDuration(200L);
                fastScroller.f25409p.start();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b extends RecyclerView.r {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void b(RecyclerView recyclerView, int i10, int i11) {
            FastScroller fastScroller = FastScroller.this;
            if (!fastScroller.f25395a.isInEditMode()) {
                fastScroller.d();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            FastScroller.this.f25410q = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FastScroller.this.f25410q = false;
        }
    }

    public FastScroller(Context context, FastScrollRecyclerView fastScrollRecyclerView, AttributeSet attributeSet) {
        int i10;
        Rect rect = new Rect();
        this.f25403j = rect;
        this.f25406m = new Point(-1, -1);
        this.f25407n = new Point(0, 0);
        this.f25411r = TTAdConstant.STYLE_SIZE_RADIO_3_2;
        this.f25412s = true;
        this.f25415v = 2030043136;
        this.A = false;
        this.B = new RectF();
        context.getResources();
        this.f25395a = fastScrollRecyclerView;
        int C = t0.C(context, 34.0f);
        this.f25396b = C;
        int C2 = t0.C(context, 39.0f);
        this.c = C2;
        int C3 = t0.C(context, 39.0f);
        this.f25399f = C3;
        this.f25404k = t0.C(context, -4.0f);
        Paint paint = new Paint(1);
        this.f25397d = paint;
        Paint paint2 = new Paint(1);
        this.f25398e = paint2;
        this.f25417x = 2;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, pdf.pdfreader.viewer.editor.free.a.f23892b, 0, 0);
        try {
            this.f25412s = obtainStyledAttributes.getBoolean(0, true);
            this.f25411r = obtainStyledAttributes.getInteger(1, TTAdConstant.STYLE_SIZE_RADIO_3_2);
            this.f25416w = obtainStyledAttributes.getBoolean(2, true);
            this.f25414u = obtainStyledAttributes.getColor(3, 2030043136);
            this.f25415v = obtainStyledAttributes.getColor(6, 2030043136);
            this.f25415v = obtainStyledAttributes.getColor(6, 2030043136);
            int color = obtainStyledAttributes.getColor(8, 671088640);
            this.c = obtainStyledAttributes.getDimensionPixelSize(7, C2);
            this.f25396b = obtainStyledAttributes.getDimensionPixelSize(5, C);
            this.f25399f = obtainStyledAttributes.getDimensionPixelSize(9, C3);
            paint2.setColor(color);
            if (this.f25416w) {
                i10 = this.f25415v;
            } else {
                i10 = this.f25414u;
            }
            paint.setColor(i10);
            Bitmap a10 = e.a(obtainStyledAttributes.getDrawable(10));
            this.f25419z = a10;
            if (a10 != null) {
                rect.set(0, 0, a10.getWidth(), a10.getHeight());
            }
            obtainStyledAttributes.recycle();
            this.f25413t = new a();
            fastScrollRecyclerView.s(new b());
            if (this.f25412s) {
                b();
            }
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void a(MotionEvent motionEvent, int i10, int i11, int i12) {
        int height;
        int i13;
        int i14;
        int i15;
        int i16;
        int action = motionEvent.getAction();
        int y10 = (int) motionEvent.getY();
        int i17 = this.f25404k;
        Rect rect = this.f25400g;
        int i18 = this.f25399f;
        int i19 = this.f25396b;
        Point point = this.f25406m;
        if (action != 0) {
            Paint paint = this.f25397d;
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return;
                    }
                } else {
                    boolean z10 = this.f25408o;
                    int i20 = this.f25417x;
                    FastScrollRecyclerView fastScrollRecyclerView = this.f25395a;
                    if (!z10) {
                        int i21 = point.x;
                        int i22 = point.y;
                        rect.set(i21, i22, i18 + i21, i19 + i22);
                        rect.inset(i17, i17);
                        if (rect.contains(i10, i11) && Math.abs(y10 - i11) > i20) {
                            fastScrollRecyclerView.getParent().requestDisallowInterceptTouchEvent(true);
                            this.f25408o = true;
                            this.f25405l = (i12 - i11) + this.f25405l;
                            if (this.f25416w) {
                                paint.setColor(this.f25414u);
                            }
                        }
                    }
                    if (this.f25408o) {
                        int i23 = this.f25418y;
                        if (i23 == 0 || Math.abs(i23 - y10) >= i20) {
                            this.f25418y = y10;
                            boolean F0 = fastScrollRecyclerView.F0();
                            float max = Math.max(0, Math.min(height, y10 - this.f25405l)) / (fastScrollRecyclerView.getHeight() - i19);
                            if (F0) {
                                max = 1.0f - max;
                            }
                            if (fastScrollRecyclerView.getAdapter() != null) {
                                i13 = fastScrollRecyclerView.getAdapter().getItemCount();
                            } else {
                                i13 = 0;
                            }
                            if (i13 != 0) {
                                if (fastScrollRecyclerView.getLayoutManager() instanceof GridLayoutManager) {
                                    i14 = ((GridLayoutManager) fastScrollRecyclerView.getLayoutManager()).F;
                                    i13 = (int) Math.ceil(i13 / i14);
                                } else {
                                    i14 = 1;
                                }
                                fastScrollRecyclerView.y0();
                                FastScrollRecyclerView.c cVar = fastScrollRecyclerView.F0;
                                fastScrollRecyclerView.D0(cVar);
                                if (fastScrollRecyclerView.getAdapter() instanceof FastScrollRecyclerView.a) {
                                    fastScrollRecyclerView.B0(max);
                                    int C0 = (int) (fastScrollRecyclerView.C0(fastScrollRecyclerView.z0()) * max);
                                    if (fastScrollRecyclerView.getAdapter() instanceof FastScrollRecyclerView.a) {
                                        FastScrollRecyclerView.a aVar = (FastScrollRecyclerView.a) fastScrollRecyclerView.getAdapter();
                                        i15 = 0;
                                        while (i15 < fastScrollRecyclerView.getAdapter().getItemCount()) {
                                            int A0 = fastScrollRecyclerView.A0(i15);
                                            fastScrollRecyclerView.R(i15);
                                            fastScrollRecyclerView.getAdapter().getItemViewType(i15);
                                            int a10 = aVar.a() + A0;
                                            if (i15 == fastScrollRecyclerView.getAdapter().getItemCount() - 1) {
                                                if (C0 >= A0 && C0 <= a10) {
                                                    i16 = fastScrollRecyclerView.A0(i15) - C0;
                                                }
                                                i15++;
                                            } else {
                                                if (C0 >= A0 && C0 < a10) {
                                                    i16 = fastScrollRecyclerView.A0(i15) - C0;
                                                }
                                                i15++;
                                            }
                                        }
                                        int A02 = fastScrollRecyclerView.A0(0);
                                        int A03 = fastScrollRecyclerView.A0(fastScrollRecyclerView.getAdapter().getItemCount() - 1);
                                        fastScrollRecyclerView.R(fastScrollRecyclerView.getAdapter().getItemCount() - 1);
                                        fastScrollRecyclerView.getAdapter().getItemViewType(fastScrollRecyclerView.getAdapter().getItemCount() - 1);
                                        throw new IllegalStateException(String.format(ea.a.p("Bm5HYRVpUyAqYTlzEGRIaFBpCWgxOkUlKSxVWyBvIjpvJVUsWWhSaT1oPjpVJQxd", "D14LMuLU"), Integer.valueOf(C0), Integer.valueOf(A02), Integer.valueOf(aVar.a() + A03)));
                                    }
                                    throw new IllegalStateException(ea.a.p("VWklZD5lA3MHclFBDWEmdCFydGk0czdWCHNRYiJlE29AaT9pHG5KKVJzXG8cbDIgK25eeWZiJiACYVRsK2Rjd1tlOWVTdAplUlJRYxBjOmU2VltlMS4CZABwTGU8ICpzE2ElIBpuEXQTbldlSW8wIAllU3MzciJiDWV5ZC9wN2Vy", "a8NCjYSQ"));
                                }
                                fastScrollRecyclerView.B0(max);
                                int C02 = (int) (fastScrollRecyclerView.C0(i13 * cVar.c) * max);
                                int i24 = cVar.c;
                                i15 = (i14 * C02) / i24;
                                i16 = -(C02 % i24);
                                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) fastScrollRecyclerView.getLayoutManager();
                                if (linearLayoutManager != null) {
                                    linearLayoutManager.o1(i15, i16);
                                }
                                if (fastScrollRecyclerView.getAdapter() instanceof FastScrollRecyclerView.d) {
                                    if (max == 1.0f) {
                                        fastScrollRecyclerView.getAdapter().getItemCount();
                                    }
                                    FastScrollRecyclerView.d dVar = (FastScrollRecyclerView.d) fastScrollRecyclerView.getAdapter();
                                    if (dVar != null) {
                                        dVar.a();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.f25405l = 0;
            this.f25418y = 0;
            if (this.f25408o) {
                this.f25408o = false;
            }
            if (this.f25416w) {
                paint.setColor(this.f25415v);
                return;
            }
            return;
        }
        int i25 = point.x;
        int i26 = point.y;
        rect.set(i25, i26, i18 + i25, i19 + i26);
        rect.inset(i17, i17);
        if (rect.contains(i10, i11)) {
            this.f25405l = i11 - point.y;
        }
    }

    public final void b() {
        FastScrollRecyclerView fastScrollRecyclerView = this.f25395a;
        if (fastScrollRecyclerView != null) {
            a aVar = this.f25413t;
            if (fastScrollRecyclerView != null) {
                fastScrollRecyclerView.removeCallbacks(aVar);
            }
            fastScrollRecyclerView.postDelayed(aVar, this.f25411r);
        }
    }

    public final void c(int i10, int i11) {
        Point point = this.f25406m;
        int i12 = point.x;
        if (i12 == i10 && point.y == i11) {
            return;
        }
        Point point2 = this.f25407n;
        int i13 = point2.x;
        int i14 = i12 + i13;
        int i15 = point2.y;
        int i16 = i12 + i13;
        int i17 = this.f25399f;
        FastScrollRecyclerView fastScrollRecyclerView = this.f25395a;
        int height = fastScrollRecyclerView.getHeight() + point2.y;
        Rect rect = this.f25401h;
        rect.set(i14, i15, i16 + i17, height);
        point.set(i10, i11);
        int i18 = point.x;
        int i19 = point2.x;
        int height2 = fastScrollRecyclerView.getHeight() + point2.y;
        Rect rect2 = this.f25402i;
        rect2.set(i18 + i19, point2.y, i18 + i19 + i17, height2);
        rect.union(rect2);
        fastScrollRecyclerView.invalidate(rect);
    }

    public final void d() {
        if (!this.A) {
            return;
        }
        if (!this.f25410q) {
            Animator animator = this.f25409p;
            if (animator != null) {
                animator.cancel();
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, ea.a.p("JGYXcy10WA==", "znKqHA92"), 0);
            this.f25409p = ofInt;
            ofInt.setInterpolator(new m1.c());
            this.f25409p.setDuration(150L);
            this.f25409p.addListener(new c());
            this.f25410q = true;
            this.f25409p.start();
        }
        if (this.f25412s) {
            b();
            return;
        }
        FastScrollRecyclerView fastScrollRecyclerView = this.f25395a;
        if (fastScrollRecyclerView != null) {
            fastScrollRecyclerView.removeCallbacks(this.f25413t);
        }
    }

    @Keep
    public int getOffsetX() {
        return this.f25407n.x;
    }

    @Keep
    public void setOffsetX(int i10) {
        Point point = this.f25407n;
        int i11 = point.y;
        int i12 = point.x;
        if (i12 != i10) {
            Point point2 = this.f25406m;
            int i13 = point2.x + i12;
            int i14 = this.f25399f;
            FastScrollRecyclerView fastScrollRecyclerView = this.f25395a;
            int height = fastScrollRecyclerView.getHeight() + point.y;
            Rect rect = this.f25401h;
            rect.set(i13, i11, i13 + i14, height);
            point.set(i10, i11);
            int i15 = point2.x + point.x;
            int height2 = fastScrollRecyclerView.getHeight() + point.y;
            Rect rect2 = this.f25402i;
            rect2.set(i15, point.y, i14 + i15, height2);
            rect.union(rect2);
            fastScrollRecyclerView.invalidate(rect);
        }
    }
}
