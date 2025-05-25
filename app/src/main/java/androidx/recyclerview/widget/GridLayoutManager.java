package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import java.util.Arrays;
import java.util.WeakHashMap;
import x0.f0;
import x0.n0;
import y0.f;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public c K;
    public final Rect L;

    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int b(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i10) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f4182a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        public final SparseIntArray f4183b = new SparseIntArray();

        public final int a(int i10, int i11) {
            int c = c(i10);
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int c10 = c(i14);
                i12 += c10;
                if (i12 == i11) {
                    i13++;
                    i12 = 0;
                } else if (i12 > i11) {
                    i13++;
                    i12 = c10;
                }
            }
            if (i12 + c > i11) {
                return i13 + 1;
            }
            return i13;
        }

        public int b(int i10, int i11) {
            int c = c(i10);
            if (c == i11) {
                return 0;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int c10 = c(i13);
                i12 += c10;
                if (i12 == i11) {
                    i12 = 0;
                } else if (i12 > i11) {
                    i12 = c10;
                }
            }
            if (c + i12 > i11) {
                return 0;
            }
            return i12;
        }

        public abstract int c(int i10);

        public final void d() {
            this.f4182a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        A1(RecyclerView.m.Q(context, attributeSet, i10, i11).f4302b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int A(RecyclerView.y yVar) {
        return S0(yVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int A0(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        B1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.A0(i10, tVar, yVar);
    }

    public final void A1(int i10) {
        if (i10 == this.F) {
            return;
        }
        this.E = true;
        if (i10 >= 1) {
            this.F = i10;
            this.K.d();
            z0();
            return;
        }
        throw new IllegalArgumentException(b.a.c("Span count should be at least 1. Provided ", i10));
    }

    public final void B1() {
        int paddingBottom;
        int paddingTop;
        if (this.f4184p == 1) {
            paddingBottom = this.f4297n - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.f4298o - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        u1(paddingBottom - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int C0(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        B1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.C0(i10, tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n D() {
        if (this.f4184p == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n E(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void F0(Rect rect, int i10, int i11) {
        int s4;
        int s10;
        if (this.G == null) {
            super.F0(rect, i10, i11);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f4184p == 1) {
            int height = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.f4286b;
            WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
            s10 = RecyclerView.m.s(i11, height, f0.d.d(recyclerView));
            int[] iArr = this.G;
            s4 = RecyclerView.m.s(i10, iArr[iArr.length - 1] + paddingRight, f0.d.e(this.f4286b));
        } else {
            int width = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.f4286b;
            WeakHashMap<View, n0> weakHashMap2 = x0.f0.f31435a;
            s4 = RecyclerView.m.s(i10, width, f0.d.e(recyclerView2));
            int[] iArr2 = this.G;
            s10 = RecyclerView.m.s(i11, iArr2[iArr2.length - 1] + paddingBottom, f0.d.d(this.f4286b));
        }
        this.f4286b.setMeasuredDimension(s4, s10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int K(RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.f4184p == 1) {
            return this.F;
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return w1(yVar.b() - 1, tVar, yVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final boolean N0() {
        if (this.f4194z == null && !this.E) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void P0(RecyclerView.y yVar, LinearLayoutManager.c cVar, RecyclerView.m.c cVar2) {
        boolean z10;
        int i10 = this.F;
        for (int i11 = 0; i11 < this.F; i11++) {
            int i12 = cVar.f4204d;
            if (i12 >= 0 && i12 < yVar.b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && i10 > 0) {
                int i13 = cVar.f4204d;
                ((q.b) cVar2).a(i13, Math.max(0, cVar.f4207g));
                i10 -= this.K.c(i13);
                cVar.f4204d += cVar.f4205e;
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int S(RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.f4184p == 0) {
            return this.F;
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return w1(yVar.b() - 1, tVar, yVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View c1(RecyclerView.t tVar, RecyclerView.y yVar, boolean z10, boolean z11) {
        int i10;
        int i11;
        int I = I();
        int i12 = 1;
        if (z11) {
            i11 = I() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = I;
            i11 = 0;
        }
        int b10 = yVar.b();
        U0();
        int k10 = this.f4186r.k();
        int g10 = this.f4186r.g();
        View view = null;
        View view2 = null;
        while (i11 != i10) {
            View H = H(i11);
            int P = RecyclerView.m.P(H);
            if (P >= 0 && P < b10 && x1(P, tVar, yVar) == 0) {
                if (((RecyclerView.n) H.getLayoutParams()).d()) {
                    if (view2 == null) {
                        view2 = H;
                    }
                } else if (this.f4186r.e(H) < g10 && this.f4186r.b(H) >= k10) {
                    return H;
                } else {
                    if (view == null) {
                        view = H;
                    }
                }
            }
            i11 += i12;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r22.f4285a.j(r3) != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e1, code lost:
        if (r13 == r5) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0111, code lost:
        if (r13 == r5) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011d  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View d0(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.t r25, androidx.recyclerview.widget.RecyclerView.y r26) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.d0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void h0(RecyclerView.t tVar, RecyclerView.y yVar, View view, y0.f fVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            g0(view, fVar);
            return;
        }
        b bVar = (b) layoutParams;
        int w12 = w1(bVar.a(), tVar, yVar);
        if (this.f4184p == 0) {
            fVar.i(f.c.a(bVar.f4180e, bVar.f4181f, w12, false, false, 1));
        } else {
            fVar.i(f.c.a(w12, 1, bVar.f4180e, false, false, bVar.f4181f));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void i0(int i10, int i11) {
        this.K.d();
        this.K.f4183b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void i1(RecyclerView.t tVar, RecyclerView.y yVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int J;
        int i20;
        boolean z12;
        boolean z13;
        View b10;
        int j10 = this.f4186r.j();
        int i21 = 1;
        if (j10 != 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (I() > 0) {
            i10 = this.G[this.F];
        } else {
            i10 = 0;
        }
        if (z10) {
            B1();
        }
        if (cVar.f4205e == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i22 = this.F;
        if (!z11) {
            i22 = x1(cVar.f4204d, tVar, yVar) + y1(cVar.f4204d, tVar, yVar);
        }
        int i23 = 0;
        while (i23 < this.F) {
            int i24 = cVar.f4204d;
            if (i24 >= 0 && i24 < yVar.b()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13 || i22 <= 0) {
                break;
            }
            int i25 = cVar.f4204d;
            int y12 = y1(i25, tVar, yVar);
            if (y12 <= this.F) {
                i22 -= y12;
                if (i22 < 0 || (b10 = cVar.b(tVar)) == null) {
                    break;
                }
                this.H[i23] = b10;
                i23++;
            } else {
                throw new IllegalArgumentException(a6.h.g(a0.d.f("Item at position ", i25, " requires ", y12, " spans but GridLayoutManager has only "), this.F, " spans."));
            }
        }
        if (i23 == 0) {
            bVar.f4200b = true;
            return;
        }
        if (z11) {
            i11 = 0;
            i12 = i23;
        } else {
            i11 = i23 - 1;
            i21 = -1;
            i12 = -1;
        }
        int i26 = 0;
        while (i11 != i12) {
            View view = this.H[i11];
            b bVar2 = (b) view.getLayoutParams();
            int y13 = y1(RecyclerView.m.P(view), tVar, yVar);
            bVar2.f4181f = y13;
            bVar2.f4180e = i26;
            i26 += y13;
            i11 += i21;
        }
        float f10 = 0.0f;
        int i27 = 0;
        for (int i28 = 0; i28 < i23; i28++) {
            View view2 = this.H[i28];
            if (cVar.f4211k == null) {
                if (z11) {
                    z12 = false;
                    m(view2, false, -1);
                } else {
                    z12 = false;
                    m(view2, false, 0);
                }
            } else {
                z12 = false;
                if (z11) {
                    m(view2, true, -1);
                } else {
                    m(view2, true, 0);
                }
            }
            o(this.L, view2);
            z1(view2, z12, j10);
            int c10 = this.f4186r.c(view2);
            if (c10 > i27) {
                i27 = c10;
            }
            float d10 = (this.f4186r.d(view2) * 1.0f) / ((b) view2.getLayoutParams()).f4181f;
            if (d10 > f10) {
                f10 = d10;
            }
        }
        if (z10) {
            u1(Math.max(Math.round(f10 * this.F), i10));
            i27 = 0;
            for (int i29 = 0; i29 < i23; i29++) {
                View view3 = this.H[i29];
                z1(view3, true, 1073741824);
                int c11 = this.f4186r.c(view3);
                if (c11 > i27) {
                    i27 = c11;
                }
            }
        }
        for (int i30 = 0; i30 < i23; i30++) {
            View view4 = this.H[i30];
            if (this.f4186r.c(view4) != i27) {
                b bVar3 = (b) view4.getLayoutParams();
                Rect rect = bVar3.f4305b;
                int i31 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i32 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int v12 = v1(bVar3.f4180e, bVar3.f4181f);
                if (this.f4184p == 1) {
                    i20 = RecyclerView.m.J(v12, 1073741824, i32, ((ViewGroup.MarginLayoutParams) bVar3).width, false);
                    J = View.MeasureSpec.makeMeasureSpec(i27 - i31, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i27 - i32, 1073741824);
                    J = RecyclerView.m.J(v12, 1073741824, i31, ((ViewGroup.MarginLayoutParams) bVar3).height, false);
                    i20 = makeMeasureSpec;
                }
                if (K0(view4, i20, J, (RecyclerView.n) view4.getLayoutParams())) {
                    view4.measure(i20, J);
                }
            }
        }
        bVar.f4199a = i27;
        if (this.f4184p == 1) {
            if (cVar.f4206f == -1) {
                i19 = cVar.f4203b;
                i18 = i19 - i27;
            } else {
                i18 = cVar.f4203b;
                i19 = i27 + i18;
            }
            i16 = 0;
            i15 = i18;
            i17 = i19;
            i14 = 0;
        } else {
            if (cVar.f4206f == -1) {
                i14 = cVar.f4203b;
                i13 = i14 - i27;
            } else {
                i13 = cVar.f4203b;
                i14 = i27 + i13;
            }
            i15 = 0;
            i16 = i13;
            i17 = 0;
        }
        for (int i33 = 0; i33 < i23; i33++) {
            View view5 = this.H[i33];
            b bVar4 = (b) view5.getLayoutParams();
            if (this.f4184p == 1) {
                if (h1()) {
                    i14 = getPaddingLeft() + this.G[this.F - bVar4.f4180e];
                    i16 = i14 - this.f4186r.d(view5);
                } else {
                    i16 = this.G[bVar4.f4180e] + getPaddingLeft();
                    i14 = this.f4186r.d(view5) + i16;
                }
            } else {
                int paddingTop = getPaddingTop() + this.G[bVar4.f4180e];
                i15 = paddingTop;
                i17 = this.f4186r.d(view5) + paddingTop;
            }
            RecyclerView.m.X(view5, i16, i15, i14, i17);
            if (bVar4.d() || bVar4.b()) {
                bVar.c = true;
            }
            bVar.f4201d = view5.hasFocusable() | bVar.f4201d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void j0() {
        this.K.d();
        this.K.f4183b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void j1(RecyclerView.t tVar, RecyclerView.y yVar, LinearLayoutManager.a aVar, int i10) {
        boolean z10;
        B1();
        if (yVar.b() > 0 && !yVar.f4336g) {
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int x12 = x1(aVar.f4196b, tVar, yVar);
            if (z10) {
                while (x12 > 0) {
                    int i11 = aVar.f4196b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    aVar.f4196b = i12;
                    x12 = x1(i12, tVar, yVar);
                }
            } else {
                int b10 = yVar.b() - 1;
                int i13 = aVar.f4196b;
                while (i13 < b10) {
                    int i14 = i13 + 1;
                    int x13 = x1(i14, tVar, yVar);
                    if (x13 <= x12) {
                        break;
                    }
                    i13 = i14;
                    x12 = x13;
                }
                aVar.f4196b = i13;
            }
        }
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void k0(int i10, int i11) {
        this.K.d();
        this.K.f4183b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void l0(int i10, int i11) {
        this.K.d();
        this.K.f4183b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void n0(RecyclerView recyclerView, int i10, int i11) {
        this.K.d();
        this.K.f4183b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void o0(RecyclerView.t tVar, RecyclerView.y yVar) {
        boolean z10 = yVar.f4336g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z10) {
            int I = I();
            for (int i10 = 0; i10 < I; i10++) {
                b bVar = (b) H(i10).getLayoutParams();
                int a10 = bVar.a();
                sparseIntArray2.put(a10, bVar.f4181f);
                sparseIntArray.put(a10, bVar.f4180e);
            }
        }
        super.o0(tVar, yVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void p0(RecyclerView.y yVar) {
        super.p0(yVar);
        this.E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void q1(boolean z10) {
        if (!z10) {
            super.q1(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean r(RecyclerView.n nVar) {
        return nVar instanceof b;
    }

    public final void u1(int i10) {
        int i11;
        int[] iArr = this.G;
        int i12 = this.F;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 > 0 && i12 - i13 < i15) {
                i11 = i14 + 1;
                i13 -= i12;
            } else {
                i11 = i14;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.G = iArr;
    }

    public final int v1(int i10, int i11) {
        if (this.f4184p == 1 && h1()) {
            int[] iArr = this.G;
            int i12 = this.F;
            return iArr[i12 - i10] - iArr[(i12 - i10) - i11];
        }
        int[] iArr2 = this.G;
        return iArr2[i11 + i10] - iArr2[i10];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int w(RecyclerView.y yVar) {
        return R0(yVar);
    }

    public final int w1(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (!yVar.f4336g) {
            return this.K.a(i10, this.F);
        }
        int b10 = tVar.b(i10);
        if (b10 == -1) {
            return 0;
        }
        return this.K.a(b10, this.F);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int x(RecyclerView.y yVar) {
        return S0(yVar);
    }

    public final int x1(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (!yVar.f4336g) {
            return this.K.b(i10, this.F);
        }
        int i11 = this.J.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = tVar.b(i10);
        if (b10 == -1) {
            return 0;
        }
        return this.K.b(b10, this.F);
    }

    public final int y1(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (!yVar.f4336g) {
            return this.K.c(i10);
        }
        int i11 = this.I.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = tVar.b(i10);
        if (b10 == -1) {
            return 1;
        }
        return this.K.c(b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int z(RecyclerView.y yVar) {
        return R0(yVar);
    }

    public final void z1(View view, boolean z10, int i10) {
        int i11;
        int i12;
        boolean I0;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f4305b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int v12 = v1(bVar.f4180e, bVar.f4181f);
        if (this.f4184p == 1) {
            i12 = RecyclerView.m.J(v12, i10, i14, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i11 = RecyclerView.m.J(this.f4186r.l(), this.f4296m, i13, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int J = RecyclerView.m.J(v12, i10, i13, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int J2 = RecyclerView.m.J(this.f4186r.l(), this.f4295l, i14, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i11 = J;
            i12 = J2;
        }
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        if (z10) {
            I0 = K0(view, i12, i11, nVar);
        } else {
            I0 = I0(view, i12, i11, nVar);
        }
        if (I0) {
            view.measure(i12, i11);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.n {

        /* renamed from: e  reason: collision with root package name */
        public int f4180e;

        /* renamed from: f  reason: collision with root package name */
        public int f4181f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4180e = -1;
            this.f4181f = 0;
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f4180e = -1;
            this.f4181f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4180e = -1;
            this.f4181f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4180e = -1;
            this.f4181f = 0;
        }
    }

    public GridLayoutManager(int i10, int i11) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        A1(i10);
    }

    public GridLayoutManager(int i10) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        A1(i10);
    }
}
