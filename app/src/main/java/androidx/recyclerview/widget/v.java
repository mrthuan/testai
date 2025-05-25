package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import lib.zj.office.fc.hpsf.Constants;

/* compiled from: LinearSmoothScroller.java */
/* loaded from: classes.dex */
public class v extends RecyclerView.x {

    /* renamed from: j  reason: collision with root package name */
    public PointF f4610j;

    /* renamed from: k  reason: collision with root package name */
    public final DisplayMetrics f4611k;

    /* renamed from: m  reason: collision with root package name */
    public float f4613m;

    /* renamed from: h  reason: collision with root package name */
    public final LinearInterpolator f4608h = new LinearInterpolator();

    /* renamed from: i  reason: collision with root package name */
    public final DecelerateInterpolator f4609i = new DecelerateInterpolator();

    /* renamed from: l  reason: collision with root package name */
    public boolean f4612l = false;

    /* renamed from: n  reason: collision with root package name */
    public int f4614n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f4615o = 0;

    public v(Context context) {
        this.f4611k = context.getResources().getDisplayMetrics();
    }

    public static int g(int i10, int i11, int i12, int i13, int i14) {
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 == 1) {
                    return i13 - i11;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 < 0) {
                return i16;
            }
            return 0;
        }
        return i12 - i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x
    public final void c(int i10, int i11, RecyclerView.x.a aVar) {
        float f10;
        if (this.f4321b.f4238m.I() == 0) {
            f();
            return;
        }
        int i12 = this.f4614n;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f4614n = i13;
        int i15 = this.f4615o;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f4615o = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a10 = a(this.f4320a);
            if (a10 != null) {
                if (a10.x != 0.0f || a10.y != 0.0f) {
                    float f11 = a10.y;
                    float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
                    float f12 = a10.x / sqrt;
                    a10.x = f12;
                    float f13 = a10.y / sqrt;
                    a10.y = f13;
                    this.f4610j = a10;
                    this.f4614n = (int) (f12 * 10000.0f);
                    this.f4615o = (int) (f13 * 10000.0f);
                    int j10 = j(Constants.CP_MAC_ROMAN);
                    LinearInterpolator linearInterpolator = this.f4608h;
                    aVar.f4326a = (int) (this.f4614n * 1.2f);
                    aVar.f4327b = (int) (this.f4615o * 1.2f);
                    aVar.c = (int) (j10 * 1.2f);
                    aVar.f4329e = linearInterpolator;
                    aVar.f4330f = true;
                    return;
                }
            }
            aVar.f4328d = this.f4320a;
            f();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x
    public final void d() {
        this.f4615o = 0;
        this.f4614n = 0;
        this.f4610j = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x
    public void e(View view, RecyclerView.x.a aVar) {
        int i10;
        int i11;
        PointF pointF = this.f4610j;
        int i12 = 0;
        if (pointF != null && pointF.x != 0.0f) {
            if (i11 > 0) {
                i10 = 1;
            } else {
                i10 = -1;
            }
        } else {
            i10 = 0;
        }
        int h10 = h(view, i10);
        int k10 = k();
        RecyclerView.m mVar = this.c;
        if (mVar != null && mVar.q()) {
            RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
            i12 = g((view.getTop() - RecyclerView.m.T(view)) - ((ViewGroup.MarginLayoutParams) nVar).topMargin, RecyclerView.m.G(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin, mVar.getPaddingTop(), mVar.f4298o - mVar.getPaddingBottom(), k10);
        }
        int ceil = (int) Math.ceil(j((int) Math.sqrt((i12 * i12) + (h10 * h10))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f4609i;
            aVar.f4326a = -h10;
            aVar.f4327b = -i12;
            aVar.c = ceil;
            aVar.f4329e = decelerateInterpolator;
            aVar.f4330f = true;
        }
    }

    public int h(View view, int i10) {
        RecyclerView.m mVar = this.c;
        if (mVar != null && mVar.p()) {
            RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
            return g((view.getLeft() - RecyclerView.m.O(view)) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin, RecyclerView.m.R(view) + view.getRight() + ((ViewGroup.MarginLayoutParams) nVar).rightMargin, mVar.getPaddingLeft(), mVar.f4297n - mVar.getPaddingRight(), i10);
        }
        return 0;
    }

    public float i(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int j(int i10) {
        float abs = Math.abs(i10);
        if (!this.f4612l) {
            this.f4613m = i(this.f4611k);
            this.f4612l = true;
        }
        return (int) Math.ceil(abs * this.f4613m);
    }

    public int k() {
        PointF pointF = this.f4610j;
        if (pointF != null) {
            float f10 = pointF.y;
            if (f10 != 0.0f) {
                if (f10 > 0.0f) {
                    return 1;
                }
                return -1;
            }
        }
        return 0;
    }
}
