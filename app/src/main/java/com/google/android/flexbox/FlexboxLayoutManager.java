package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.v;
import androidx.recyclerview.widget.y;
import androidx.recyclerview.widget.z;
import com.google.android.flexbox.a;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* loaded from: classes.dex */
public class FlexboxLayoutManager extends RecyclerView.m implements h7.a, RecyclerView.x.b {
    public static final Rect O = new Rect();
    public c A;
    public final a B;
    public a0 C;
    public a0 D;
    public d E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final SparseArray<View> J;
    public final Context K;
    public View L;
    public int M;
    public final a.C0156a N;

    /* renamed from: p  reason: collision with root package name */
    public int f9957p;

    /* renamed from: q  reason: collision with root package name */
    public int f9958q;

    /* renamed from: r  reason: collision with root package name */
    public int f9959r;

    /* renamed from: s  reason: collision with root package name */
    public int f9960s;

    /* renamed from: u  reason: collision with root package name */
    public boolean f9962u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f9963v;

    /* renamed from: y  reason: collision with root package name */
    public RecyclerView.t f9966y;

    /* renamed from: z  reason: collision with root package name */
    public RecyclerView.y f9967z;

    /* renamed from: t  reason: collision with root package name */
    public final int f9961t = -1;

    /* renamed from: w  reason: collision with root package name */
    public List<h7.c> f9964w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    public final com.google.android.flexbox.a f9965x = new com.google.android.flexbox.a(this);

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f9968a;

        /* renamed from: b  reason: collision with root package name */
        public int f9969b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f9970d = 0;

        /* renamed from: e  reason: collision with root package name */
        public boolean f9971e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f9972f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f9973g;

        public a() {
        }

        public static void a(a aVar) {
            int k10;
            int k11;
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            if (!flexboxLayoutManager.k() && flexboxLayoutManager.f9962u) {
                if (aVar.f9971e) {
                    k11 = flexboxLayoutManager.C.g();
                } else {
                    k11 = flexboxLayoutManager.f4297n - flexboxLayoutManager.C.k();
                }
                aVar.c = k11;
                return;
            }
            if (aVar.f9971e) {
                k10 = flexboxLayoutManager.C.g();
            } else {
                k10 = flexboxLayoutManager.C.k();
            }
            aVar.c = k10;
        }

        public static void b(a aVar) {
            aVar.f9968a = -1;
            aVar.f9969b = -1;
            aVar.c = SlideAtom.USES_MASTER_SLIDE_ID;
            boolean z10 = false;
            aVar.f9972f = false;
            aVar.f9973g = false;
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            if (flexboxLayoutManager.k()) {
                int i10 = flexboxLayoutManager.f9958q;
                if (i10 == 0) {
                    if (flexboxLayoutManager.f9957p == 1) {
                        z10 = true;
                    }
                    aVar.f9971e = z10;
                    return;
                }
                if (i10 == 2) {
                    z10 = true;
                }
                aVar.f9971e = z10;
                return;
            }
            int i11 = flexboxLayoutManager.f9958q;
            if (i11 == 0) {
                if (flexboxLayoutManager.f9957p == 3) {
                    z10 = true;
                }
                aVar.f9971e = z10;
                return;
            }
            if (i11 == 2) {
                z10 = true;
            }
            aVar.f9971e = z10;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.f9968a + ", mFlexLinePosition=" + this.f9969b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.f9970d + ", mLayoutFromEnd=" + this.f9971e + ", mValid=" + this.f9972f + ", mAssignedFromSavedState=" + this.f9973g + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f9984a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f9985b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f9986d;

        /* renamed from: e  reason: collision with root package name */
        public int f9987e;

        /* renamed from: f  reason: collision with root package name */
        public int f9988f;

        /* renamed from: g  reason: collision with root package name */
        public int f9989g;

        /* renamed from: h  reason: collision with root package name */
        public int f9990h = 1;

        /* renamed from: i  reason: collision with root package name */
        public int f9991i = 1;

        /* renamed from: j  reason: collision with root package name */
        public boolean f9992j;

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LayoutState{mAvailable=");
            sb2.append(this.f9984a);
            sb2.append(", mFlexLinePosition=");
            sb2.append(this.c);
            sb2.append(", mPosition=");
            sb2.append(this.f9986d);
            sb2.append(", mOffset=");
            sb2.append(this.f9987e);
            sb2.append(", mScrollingOffset=");
            sb2.append(this.f9988f);
            sb2.append(", mLastScrollDelta=");
            sb2.append(this.f9989g);
            sb2.append(", mItemDirection=");
            sb2.append(this.f9990h);
            sb2.append(", mLayoutDirection=");
            return f.n(sb2, this.f9991i, '}');
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f9993a;

        /* renamed from: b  reason: collision with root package name */
        public int f9994b;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SavedState{mAnchorPosition=");
            sb2.append(this.f9993a);
            sb2.append(", mAnchorOffset=");
            return f.n(sb2, this.f9994b, '}');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f9993a);
            parcel.writeInt(this.f9994b);
        }

        public d(Parcel parcel) {
            this.f9993a = parcel.readInt();
            this.f9994b = parcel.readInt();
        }

        public d(d dVar) {
            this.f9993a = dVar.f9993a;
            this.f9994b = dVar.f9994b;
        }
    }

    public FlexboxLayoutManager(Context context) {
        a aVar = new a();
        this.B = aVar;
        this.F = -1;
        this.G = SlideAtom.USES_MASTER_SLIDE_ID;
        this.H = SlideAtom.USES_MASTER_SLIDE_ID;
        this.I = SlideAtom.USES_MASTER_SLIDE_ID;
        this.J = new SparseArray<>();
        this.M = -1;
        this.N = new a.C0156a();
        e1(0);
        f1(1);
        if (this.f9960s != 4) {
            u0();
            this.f9964w.clear();
            a.b(aVar);
            aVar.f9970d = 0;
            this.f9960s = 4;
            z0();
        }
        this.K = context;
    }

    public static boolean W(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i10) {
                return false;
            }
            return true;
        } else if (size < i10) {
            return false;
        } else {
            return true;
        }
    }

    private boolean g1(View view, int i10, int i11, b bVar) {
        if (!view.isLayoutRequested() && this.f4291h && W(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) bVar).width) && W(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) bVar).height)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int A(RecyclerView.y yVar) {
        return Q0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int A0(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (k() && this.f9958q != 0) {
            int c12 = c1(i10);
            this.B.f9970d += c12;
            this.D.p(-c12);
            return c12;
        }
        int b12 = b1(i10, tVar, yVar);
        this.J.clear();
        return b12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void B0(int i10) {
        this.F = i10;
        this.G = SlideAtom.USES_MASTER_SLIDE_ID;
        d dVar = this.E;
        if (dVar != null) {
            dVar.f9993a = -1;
        }
        z0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int C0(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (!k() && (this.f9958q != 0 || k())) {
            int c12 = c1(i10);
            this.B.f9970d += c12;
            this.D.p(-c12);
            return c12;
        }
        int b12 = b1(i10, tVar, yVar);
        this.J.clear();
        return b12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n D() {
        return new b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n E(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void L0(RecyclerView recyclerView, int i10) {
        v vVar = new v(recyclerView.getContext());
        vVar.f4320a = i10;
        M0(vVar);
    }

    public final int O0(RecyclerView.y yVar) {
        if (I() == 0) {
            return 0;
        }
        int b10 = yVar.b();
        R0();
        View T0 = T0(b10);
        View V0 = V0(b10);
        if (yVar.b() == 0 || T0 == null || V0 == null) {
            return 0;
        }
        return Math.min(this.C.l(), this.C.b(V0) - this.C.e(T0));
    }

    public final int P0(RecyclerView.y yVar) {
        if (I() == 0) {
            return 0;
        }
        int b10 = yVar.b();
        View T0 = T0(b10);
        View V0 = V0(b10);
        if (yVar.b() != 0 && T0 != null && V0 != null) {
            int P = RecyclerView.m.P(T0);
            int P2 = RecyclerView.m.P(V0);
            int abs = Math.abs(this.C.b(V0) - this.C.e(T0));
            int[] iArr = this.f9965x.c;
            int i10 = iArr[P];
            if (i10 != 0 && i10 != -1) {
                return Math.round((i10 * (abs / ((iArr[P2] - i10) + 1))) + (this.C.k() - this.C.e(T0)));
            }
        }
        return 0;
    }

    public final int Q0(RecyclerView.y yVar) {
        int P;
        if (I() == 0) {
            return 0;
        }
        int b10 = yVar.b();
        View T0 = T0(b10);
        View V0 = V0(b10);
        if (yVar.b() == 0 || T0 == null || V0 == null) {
            return 0;
        }
        View X0 = X0(0, I());
        int i10 = -1;
        if (X0 == null) {
            P = -1;
        } else {
            P = RecyclerView.m.P(X0);
        }
        View X02 = X0(I() - 1, -1);
        if (X02 != null) {
            i10 = RecyclerView.m.P(X02);
        }
        return (int) ((Math.abs(this.C.b(V0) - this.C.e(T0)) / ((i10 - P) + 1)) * yVar.b());
    }

    public final void R0() {
        if (this.C != null) {
            return;
        }
        if (k()) {
            if (this.f9958q == 0) {
                this.C = new y(this);
                this.D = new z(this);
                return;
            }
            this.C = new z(this);
            this.D = new y(this);
        } else if (this.f9958q == 0) {
            this.C = new z(this);
            this.D = new y(this);
        } else {
            this.C = new y(this);
            this.D = new z(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        r26 = r3;
        r23 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x043a, code lost:
        r1 = r35.f9984a - r23;
        r35.f9984a = r1;
        r3 = r35.f9988f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0444, code lost:
        if (r3 == Integer.MIN_VALUE) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0446, code lost:
        r3 = r3 + r23;
        r35.f9988f = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x044a, code lost:
        if (r1 >= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x044c, code lost:
        r35.f9988f = r3 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x044f, code lost:
        d1(r33, r35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0458, code lost:
        return r26 - r35.f9984a;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int S0(androidx.recyclerview.widget.RecyclerView.t r33, androidx.recyclerview.widget.RecyclerView.y r34, com.google.android.flexbox.FlexboxLayoutManager.c r35) {
        /*
            Method dump skipped, instructions count: 1113
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.S0(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y, com.google.android.flexbox.FlexboxLayoutManager$c):int");
    }

    public final View T0(int i10) {
        View Y0 = Y0(0, I(), i10);
        if (Y0 == null) {
            return null;
        }
        int i11 = this.f9965x.c[RecyclerView.m.P(Y0)];
        if (i11 == -1) {
            return null;
        }
        return U0(Y0, this.f9964w.get(i11));
    }

    public final View U0(View view, h7.c cVar) {
        boolean k10 = k();
        int i10 = cVar.f18053h;
        for (int i11 = 1; i11 < i10; i11++) {
            View H = H(i11);
            if (H != null && H.getVisibility() != 8) {
                if (this.f9962u && !k10) {
                    if (this.C.b(view) >= this.C.b(H)) {
                    }
                    view = H;
                } else {
                    if (this.C.e(view) <= this.C.e(H)) {
                    }
                    view = H;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean V() {
        return true;
    }

    public final View V0(int i10) {
        View Y0 = Y0(I() - 1, -1, i10);
        if (Y0 == null) {
            return null;
        }
        return W0(Y0, this.f9964w.get(this.f9965x.c[RecyclerView.m.P(Y0)]));
    }

    public final View W0(View view, h7.c cVar) {
        boolean k10 = k();
        int I = (I() - cVar.f18053h) - 1;
        for (int I2 = I() - 2; I2 > I; I2--) {
            View H = H(I2);
            if (H != null && H.getVisibility() != 8) {
                if (this.f9962u && !k10) {
                    if (this.C.e(view) <= this.C.e(H)) {
                    }
                    view = H;
                } else {
                    if (this.C.b(view) >= this.C.b(H)) {
                    }
                    view = H;
                }
            }
        }
        return view;
    }

    public final View X0(int i10, int i11) {
        int i12;
        boolean z10;
        boolean z11;
        if (i11 > i10) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        while (i10 != i11) {
            View H = H(i10);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.f4297n - getPaddingRight();
            int paddingBottom = this.f4298o - getPaddingBottom();
            int left = (H.getLeft() - RecyclerView.m.O(H)) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) H.getLayoutParams())).leftMargin;
            int top = (H.getTop() - RecyclerView.m.T(H)) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) H.getLayoutParams())).topMargin;
            int R = RecyclerView.m.R(H) + H.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) H.getLayoutParams())).rightMargin;
            int G = RecyclerView.m.G(H) + H.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) H.getLayoutParams())).bottomMargin;
            boolean z12 = false;
            if (left < paddingRight && R < paddingLeft) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (top < paddingBottom && G < paddingTop) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z10 && z11) {
                z12 = true;
            }
            if (z12) {
                return H;
            }
            i10 += i12;
        }
        return null;
    }

    public final View Y0(int i10, int i11, int i12) {
        int i13;
        int P;
        R0();
        if (this.A == null) {
            this.A = new c();
        }
        int k10 = this.C.k();
        int g10 = this.C.g();
        if (i11 > i10) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View H = H(i10);
            if (H != null && (P = RecyclerView.m.P(H)) >= 0 && P < i12) {
                if (((RecyclerView.n) H.getLayoutParams()).d()) {
                    if (view2 == null) {
                        view2 = H;
                    }
                } else if (this.C.e(H) >= k10 && this.C.b(H) <= g10) {
                    return H;
                } else {
                    if (view == null) {
                        view = H;
                    }
                }
            }
            i10 += i13;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    public final int Z0(int i10, RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        boolean z11;
        int i11;
        int g10;
        if (!k() && this.f9962u) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            int k10 = i10 - this.C.k();
            if (k10 <= 0) {
                return 0;
            }
            i11 = b1(k10, tVar, yVar);
        } else {
            int g11 = this.C.g() - i10;
            if (g11 <= 0) {
                return 0;
            }
            i11 = -b1(-g11, tVar, yVar);
        }
        int i12 = i10 + i11;
        if (z10 && (g10 = this.C.g() - i12) > 0) {
            this.C.p(g10);
            return g10 + i11;
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x.b
    public final PointF a(int i10) {
        View H;
        int i11;
        if (I() == 0 || (H = H(0)) == null) {
            return null;
        }
        if (i10 < RecyclerView.m.P(H)) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        if (k()) {
            return new PointF(0.0f, i11);
        }
        return new PointF(i11, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void a0() {
        u0();
    }

    public final int a1(int i10, RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        int i11;
        int k10;
        if (!k() && this.f9962u) {
            int g10 = this.C.g() - i10;
            if (g10 <= 0) {
                return 0;
            }
            i11 = b1(-g10, tVar, yVar);
        } else {
            int k11 = i10 - this.C.k();
            if (k11 <= 0) {
                return 0;
            }
            i11 = -b1(k11, tVar, yVar);
        }
        int i12 = i10 + i11;
        if (z10 && (k10 = i12 - this.C.k()) > 0) {
            this.C.p(-k10);
            return i11 - k10;
        }
        return i11;
    }

    @Override // h7.a
    public final View b(int i10) {
        return f(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void b0(RecyclerView recyclerView) {
        this.L = (View) recyclerView.getParent();
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b1(int r19, androidx.recyclerview.widget.RecyclerView.t r20, androidx.recyclerview.widget.RecyclerView.y r21) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.b1(int, androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y):int");
    }

    @Override // h7.a
    public final int c(int i10, int i11, int i12) {
        return RecyclerView.m.J(this.f4297n, this.f4295l, i11, i12, p());
    }

    public final int c1(int i10) {
        int height;
        int i11;
        int i12;
        boolean z10 = false;
        if (I() == 0 || i10 == 0) {
            return 0;
        }
        R0();
        boolean k10 = k();
        View view = this.L;
        if (k10) {
            height = view.getWidth();
        } else {
            height = view.getHeight();
        }
        if (k10) {
            i11 = this.f4297n;
        } else {
            i11 = this.f4298o;
        }
        if (N() == 1) {
            z10 = true;
        }
        a aVar = this.B;
        if (z10) {
            int abs = Math.abs(i10);
            if (i10 < 0) {
                return -Math.min((i11 + aVar.f9970d) - height, abs);
            }
            i12 = aVar.f9970d;
            if (i12 + i10 <= 0) {
                return i10;
            }
        } else if (i10 > 0) {
            return Math.min((i11 - aVar.f9970d) - height, i10);
        } else {
            i12 = aVar.f9970d;
            if (i12 + i10 >= 0) {
                return i10;
            }
        }
        return -i12;
    }

    public final void d1(RecyclerView.t tVar, c cVar) {
        int I;
        View H;
        int i10;
        boolean z10;
        int I2;
        int i11;
        View H2;
        int i12;
        boolean z11;
        if (!cVar.f9992j) {
            return;
        }
        int i13 = cVar.f9991i;
        int i14 = -1;
        com.google.android.flexbox.a aVar = this.f9965x;
        if (i13 == -1) {
            if (cVar.f9988f >= 0 && (I2 = I()) != 0 && (H2 = H(I2 - 1)) != null && (i12 = aVar.c[RecyclerView.m.P(H2)]) != -1) {
                h7.c cVar2 = this.f9964w.get(i12);
                int i15 = i11;
                while (true) {
                    if (i15 < 0) {
                        break;
                    }
                    View H3 = H(i15);
                    if (H3 != null) {
                        int i16 = cVar.f9988f;
                        if (k() || !this.f9962u ? this.C.e(H3) >= this.C.f() - i16 : this.C.b(H3) <= i16) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            break;
                        } else if (cVar2.f18060o != RecyclerView.m.P(H3)) {
                            continue;
                        } else if (i12 <= 0) {
                            I2 = i15;
                            break;
                        } else {
                            i12 += cVar.f9991i;
                            cVar2 = this.f9964w.get(i12);
                            I2 = i15;
                        }
                    }
                    i15--;
                }
                while (i11 >= I2) {
                    View H4 = H(i11);
                    if (H(i11) != null) {
                        this.f4285a.k(i11);
                    }
                    tVar.g(H4);
                    i11--;
                }
            }
        } else if (cVar.f9988f >= 0 && (I = I()) != 0 && (H = H(0)) != null && (i10 = aVar.c[RecyclerView.m.P(H)]) != -1) {
            h7.c cVar3 = this.f9964w.get(i10);
            int i17 = 0;
            while (true) {
                if (i17 >= I) {
                    break;
                }
                View H5 = H(i17);
                if (H5 != null) {
                    int i18 = cVar.f9988f;
                    if (k() || !this.f9962u ? this.C.b(H5) <= i18 : this.C.f() - this.C.e(H5) <= i18) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        break;
                    } else if (cVar3.f18061p != RecyclerView.m.P(H5)) {
                        continue;
                    } else if (i10 >= this.f9964w.size() - 1) {
                        i14 = i17;
                        break;
                    } else {
                        i10 += cVar.f9991i;
                        cVar3 = this.f9964w.get(i10);
                        i14 = i17;
                    }
                }
                i17++;
            }
            while (i14 >= 0) {
                View H6 = H(i14);
                if (H(i14) != null) {
                    this.f4285a.k(i14);
                }
                tVar.g(H6);
                i14--;
            }
        }
    }

    @Override // h7.a
    public final void e(View view, int i10, int i11, h7.c cVar) {
        o(O, view);
        if (k()) {
            int R = RecyclerView.m.R(view) + RecyclerView.m.O(view);
            cVar.f18050e += R;
            cVar.f18051f += R;
            return;
        }
        int G = RecyclerView.m.G(view) + RecyclerView.m.T(view);
        cVar.f18050e += G;
        cVar.f18051f += G;
    }

    public final void e1(int i10) {
        if (this.f9957p != i10) {
            u0();
            this.f9957p = i10;
            this.C = null;
            this.D = null;
            this.f9964w.clear();
            a aVar = this.B;
            a.b(aVar);
            aVar.f9970d = 0;
            z0();
        }
    }

    @Override // h7.a
    public final View f(int i10) {
        View view = this.J.get(i10);
        if (view != null) {
            return view;
        }
        return this.f9966y.d(i10);
    }

    public final void f1(int i10) {
        int i11 = this.f9958q;
        if (i11 != 1) {
            if (i11 == 0) {
                u0();
                this.f9964w.clear();
                a aVar = this.B;
                a.b(aVar);
                aVar.f9970d = 0;
            }
            this.f9958q = 1;
            this.C = null;
            this.D = null;
            z0();
        }
    }

    @Override // h7.a
    public final int g(View view, int i10, int i11) {
        int T;
        int G;
        if (k()) {
            T = RecyclerView.m.O(view);
            G = RecyclerView.m.R(view);
        } else {
            T = RecyclerView.m.T(view);
            G = RecyclerView.m.G(view);
        }
        return G + T;
    }

    @Override // h7.a
    public final int getAlignContent() {
        return 5;
    }

    @Override // h7.a
    public final int getAlignItems() {
        return this.f9960s;
    }

    @Override // h7.a
    public final int getFlexDirection() {
        return this.f9957p;
    }

    @Override // h7.a
    public final int getFlexItemCount() {
        return this.f9967z.b();
    }

    @Override // h7.a
    public final List<h7.c> getFlexLinesInternal() {
        return this.f9964w;
    }

    @Override // h7.a
    public final int getFlexWrap() {
        return this.f9958q;
    }

    @Override // h7.a
    public final int getLargestMainSize() {
        if (this.f9964w.size() == 0) {
            return 0;
        }
        int size = this.f9964w.size();
        int i10 = SlideAtom.USES_MASTER_SLIDE_ID;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = Math.max(i10, this.f9964w.get(i11).f18050e);
        }
        return i10;
    }

    @Override // h7.a
    public final int getMaxLine() {
        return this.f9961t;
    }

    @Override // h7.a
    public final int getSumOfCrossSize() {
        int size = this.f9964w.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += this.f9964w.get(i11).f18052g;
        }
        return i10;
    }

    @Override // h7.a
    public final int h(int i10, int i11, int i12) {
        return RecyclerView.m.J(this.f4298o, this.f4296m, i11, i12, q());
    }

    public final void h1(int i10) {
        int i11 = -1;
        View X0 = X0(I() - 1, -1);
        if (X0 != null) {
            i11 = RecyclerView.m.P(X0);
        }
        if (i10 >= i11) {
            return;
        }
        int I = I();
        com.google.android.flexbox.a aVar = this.f9965x;
        aVar.j(I);
        aVar.k(I);
        aVar.i(I);
        if (i10 >= aVar.c.length) {
            return;
        }
        this.M = i10;
        View H = H(0);
        if (H == null) {
            return;
        }
        this.F = RecyclerView.m.P(H);
        if (!k() && this.f9962u) {
            this.G = this.C.h() + this.C.b(H);
            return;
        }
        this.G = this.C.e(H) - this.C.k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void i0(int i10, int i11) {
        h1(i10);
    }

    public final void i1(a aVar, boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean z12 = false;
        if (z11) {
            if (k()) {
                i11 = this.f4296m;
            } else {
                i11 = this.f4295l;
            }
            c cVar = this.A;
            if (i11 == 0 || i11 == Integer.MIN_VALUE) {
                z12 = true;
            }
            cVar.f9985b = z12;
        } else {
            this.A.f9985b = false;
        }
        if (!k() && this.f9962u) {
            this.A.f9984a = aVar.c - getPaddingRight();
        } else {
            this.A.f9984a = this.C.g() - aVar.c;
        }
        c cVar2 = this.A;
        cVar2.f9986d = aVar.f9968a;
        cVar2.f9990h = 1;
        cVar2.f9991i = 1;
        cVar2.f9987e = aVar.c;
        cVar2.f9988f = SlideAtom.USES_MASTER_SLIDE_ID;
        cVar2.c = aVar.f9969b;
        if (z10 && this.f9964w.size() > 1 && (i10 = aVar.f9969b) >= 0 && i10 < this.f9964w.size() - 1) {
            c cVar3 = this.A;
            cVar3.c++;
            cVar3.f9986d += this.f9964w.get(aVar.f9969b).f18053h;
        }
    }

    @Override // h7.a
    public final void j(View view, int i10) {
        this.J.put(i10, view);
    }

    public final void j1(a aVar, boolean z10, boolean z11) {
        c cVar;
        int i10;
        boolean z12 = false;
        if (z11) {
            if (k()) {
                i10 = this.f4296m;
            } else {
                i10 = this.f4295l;
            }
            c cVar2 = this.A;
            if (i10 == 0 || i10 == Integer.MIN_VALUE) {
                z12 = true;
            }
            cVar2.f9985b = z12;
        } else {
            this.A.f9985b = false;
        }
        if (!k() && this.f9962u) {
            this.A.f9984a = (this.L.getWidth() - aVar.c) - this.C.k();
        } else {
            this.A.f9984a = aVar.c - this.C.k();
        }
        c cVar3 = this.A;
        cVar3.f9986d = aVar.f9968a;
        cVar3.f9990h = 1;
        cVar3.f9991i = -1;
        cVar3.f9987e = aVar.c;
        cVar3.f9988f = SlideAtom.USES_MASTER_SLIDE_ID;
        int i11 = aVar.f9969b;
        cVar3.c = i11;
        if (z10 && i11 > 0) {
            int size = this.f9964w.size();
            int i12 = aVar.f9969b;
            if (size > i12) {
                cVar.c--;
                this.A.f9986d -= this.f9964w.get(i12).f18053h;
            }
        }
    }

    @Override // h7.a
    public final boolean k() {
        int i10 = this.f9957p;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void k0(int i10, int i11) {
        h1(Math.min(i10, i11));
    }

    @Override // h7.a
    public final int l(View view) {
        int O2;
        int R;
        if (k()) {
            O2 = RecyclerView.m.T(view);
            R = RecyclerView.m.G(view);
        } else {
            O2 = RecyclerView.m.O(view);
            R = RecyclerView.m.R(view);
        }
        return R + O2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void l0(int i10, int i11) {
        h1(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void m0(int i10) {
        h1(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void n0(RecyclerView recyclerView, int i10, int i11) {
        h1(i10);
        h1(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0240  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o0(androidx.recyclerview.widget.RecyclerView.t r21, androidx.recyclerview.widget.RecyclerView.y r22) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.o0(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean p() {
        int i10;
        if (this.f9958q == 0) {
            return k();
        }
        if (k()) {
            int i11 = this.f4297n;
            View view = this.L;
            if (view != null) {
                i10 = view.getWidth();
            } else {
                i10 = 0;
            }
            if (i11 <= i10) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void p0(RecyclerView.y yVar) {
        this.E = null;
        this.F = -1;
        this.G = SlideAtom.USES_MASTER_SLIDE_ID;
        this.M = -1;
        a.b(this.B);
        this.J.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean q() {
        int i10;
        if (this.f9958q == 0) {
            return !k();
        }
        if (k()) {
            return true;
        }
        int i11 = this.f4298o;
        View view = this.L;
        if (view != null) {
            i10 = view.getHeight();
        } else {
            i10 = 0;
        }
        if (i11 > i10) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void q0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.E = (d) parcelable;
            z0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean r(RecyclerView.n nVar) {
        return nVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final Parcelable r0() {
        d dVar = this.E;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (I() > 0) {
            View H = H(0);
            dVar2.f9993a = RecyclerView.m.P(H);
            dVar2.f9994b = this.C.e(H) - this.C.k();
        } else {
            dVar2.f9993a = -1;
        }
        return dVar2;
    }

    @Override // h7.a
    public final void setFlexLines(List<h7.c> list) {
        this.f9964w = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int v(RecyclerView.y yVar) {
        return O0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int w(RecyclerView.y yVar) {
        return P0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int x(RecyclerView.y yVar) {
        return Q0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int y(RecyclerView.y yVar) {
        return O0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int z(RecyclerView.y yVar) {
        return P0(yVar);
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.n implements h7.b {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        public final float f9975e;

        /* renamed from: f  reason: collision with root package name */
        public final float f9976f;

        /* renamed from: g  reason: collision with root package name */
        public final int f9977g;

        /* renamed from: h  reason: collision with root package name */
        public final float f9978h;

        /* renamed from: i  reason: collision with root package name */
        public int f9979i;

        /* renamed from: j  reason: collision with root package name */
        public int f9980j;

        /* renamed from: k  reason: collision with root package name */
        public final int f9981k;

        /* renamed from: l  reason: collision with root package name */
        public final int f9982l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f9983m;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9975e = 0.0f;
            this.f9976f = 1.0f;
            this.f9977g = -1;
            this.f9978h = -1.0f;
            this.f9981k = 16777215;
            this.f9982l = 16777215;
        }

        @Override // h7.b
        public final float Q() {
            return this.f9975e;
        }

        @Override // h7.b
        public final float T() {
            return this.f9978h;
        }

        @Override // h7.b
        public final int a0() {
            return this.f9980j;
        }

        @Override // h7.b
        public final boolean b0() {
            return this.f9983m;
        }

        @Override // h7.b
        public final int d0() {
            return this.f9982l;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // h7.b
        public final int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // h7.b
        public final int getMarginBottom() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // h7.b
        public final int getMarginLeft() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // h7.b
        public final int getMarginRight() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // h7.b
        public final int getMarginTop() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // h7.b
        public final int getOrder() {
            return 1;
        }

        @Override // h7.b
        public final int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // h7.b
        public final int k0() {
            return this.f9981k;
        }

        @Override // h7.b
        public final void setMinWidth(int i10) {
            this.f9979i = i10;
        }

        @Override // h7.b
        public final int u() {
            return this.f9977g;
        }

        @Override // h7.b
        public final float v() {
            return this.f9976f;
        }

        @Override // h7.b
        public final int w() {
            return this.f9979i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeFloat(this.f9975e);
            parcel.writeFloat(this.f9976f);
            parcel.writeInt(this.f9977g);
            parcel.writeFloat(this.f9978h);
            parcel.writeInt(this.f9979i);
            parcel.writeInt(this.f9980j);
            parcel.writeInt(this.f9981k);
            parcel.writeInt(this.f9982l);
            parcel.writeByte(this.f9983m ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // h7.b
        public final void x(int i10) {
            this.f9980j = i10;
        }

        public b() {
            super(-2, -2);
            this.f9975e = 0.0f;
            this.f9976f = 1.0f;
            this.f9977g = -1;
            this.f9978h = -1.0f;
            this.f9981k = 16777215;
            this.f9982l = 16777215;
        }

        public b(Parcel parcel) {
            super(-2, -2);
            this.f9975e = 0.0f;
            this.f9976f = 1.0f;
            this.f9977g = -1;
            this.f9978h = -1.0f;
            this.f9981k = 16777215;
            this.f9982l = 16777215;
            this.f9975e = parcel.readFloat();
            this.f9976f = parcel.readFloat();
            this.f9977g = parcel.readInt();
            this.f9978h = parcel.readFloat();
            this.f9979i = parcel.readInt();
            this.f9980j = parcel.readInt();
            this.f9981k = parcel.readInt();
            this.f9982l = parcel.readInt();
            this.f9983m = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a();
        this.B = aVar;
        this.F = -1;
        this.G = SlideAtom.USES_MASTER_SLIDE_ID;
        this.H = SlideAtom.USES_MASTER_SLIDE_ID;
        this.I = SlideAtom.USES_MASTER_SLIDE_ID;
        this.J = new SparseArray<>();
        this.M = -1;
        this.N = new a.C0156a();
        RecyclerView.m.d Q = RecyclerView.m.Q(context, attributeSet, i10, i11);
        int i12 = Q.f4301a;
        if (i12 != 0) {
            if (i12 == 1) {
                if (Q.c) {
                    e1(3);
                } else {
                    e1(2);
                }
            }
        } else if (Q.c) {
            e1(1);
        } else {
            e1(0);
        }
        f1(1);
        if (this.f9960s != 4) {
            u0();
            this.f9964w.clear();
            a.b(aVar);
            aVar.f9970d = 0;
            this.f9960s = 4;
            z0();
        }
        this.K = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void c0(RecyclerView recyclerView) {
    }

    @Override // h7.a
    public final void d(h7.c cVar) {
    }
}
