package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import androidx.recyclerview.widget.r;
import com.google.android.gms.common.api.Api;
import java.util.List;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.m implements r.g, RecyclerView.x.b {
    public final a A;
    public final b B;
    public final int C;
    public final int[] D;

    /* renamed from: p  reason: collision with root package name */
    public int f4184p;

    /* renamed from: q  reason: collision with root package name */
    public c f4185q;

    /* renamed from: r  reason: collision with root package name */
    public a0 f4186r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4187s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4188t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4189u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4190v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f4191w;

    /* renamed from: x  reason: collision with root package name */
    public int f4192x;

    /* renamed from: y  reason: collision with root package name */
    public int f4193y;

    /* renamed from: z  reason: collision with root package name */
    public d f4194z;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public a0 f4195a;

        /* renamed from: b  reason: collision with root package name */
        public int f4196b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4197d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4198e;

        public a() {
            d();
        }

        public final void a() {
            int k10;
            if (this.f4197d) {
                k10 = this.f4195a.g();
            } else {
                k10 = this.f4195a.k();
            }
            this.c = k10;
        }

        public final void b(View view, int i10) {
            if (this.f4197d) {
                this.c = this.f4195a.m() + this.f4195a.b(view);
            } else {
                this.c = this.f4195a.e(view);
            }
            this.f4196b = i10;
        }

        public final void c(View view, int i10) {
            int m10 = this.f4195a.m();
            if (m10 >= 0) {
                b(view, i10);
                return;
            }
            this.f4196b = i10;
            if (this.f4197d) {
                int g10 = (this.f4195a.g() - m10) - this.f4195a.b(view);
                this.c = this.f4195a.g() - g10;
                if (g10 > 0) {
                    int c = this.c - this.f4195a.c(view);
                    int k10 = this.f4195a.k();
                    int min = c - (Math.min(this.f4195a.e(view) - k10, 0) + k10);
                    if (min < 0) {
                        this.c = Math.min(g10, -min) + this.c;
                        return;
                    }
                    return;
                }
                return;
            }
            int e10 = this.f4195a.e(view);
            int k11 = e10 - this.f4195a.k();
            this.c = e10;
            if (k11 > 0) {
                int g11 = (this.f4195a.g() - Math.min(0, (this.f4195a.g() - m10) - this.f4195a.b(view))) - (this.f4195a.c(view) + e10);
                if (g11 < 0) {
                    this.c -= Math.min(k11, -g11);
                }
            }
        }

        public final void d() {
            this.f4196b = -1;
            this.c = SlideAtom.USES_MASTER_SLIDE_ID;
            this.f4197d = false;
            this.f4198e = false;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.f4196b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.f4197d + ", mValid=" + this.f4198e + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f4199a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4200b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4201d;
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: b  reason: collision with root package name */
        public int f4203b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f4204d;

        /* renamed from: e  reason: collision with root package name */
        public int f4205e;

        /* renamed from: f  reason: collision with root package name */
        public int f4206f;

        /* renamed from: g  reason: collision with root package name */
        public int f4207g;

        /* renamed from: j  reason: collision with root package name */
        public int f4210j;

        /* renamed from: l  reason: collision with root package name */
        public boolean f4212l;

        /* renamed from: a  reason: collision with root package name */
        public boolean f4202a = true;

        /* renamed from: h  reason: collision with root package name */
        public int f4208h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f4209i = 0;

        /* renamed from: k  reason: collision with root package name */
        public List<RecyclerView.b0> f4211k = null;

        public final void a(View view) {
            int a10;
            int size = this.f4211k.size();
            View view2 = null;
            int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f4211k.get(i11).itemView;
                RecyclerView.n nVar = (RecyclerView.n) view3.getLayoutParams();
                if (view3 != view && !nVar.d() && (a10 = (nVar.a() - this.f4204d) * this.f4205e) >= 0 && a10 < i10) {
                    view2 = view3;
                    if (a10 == 0) {
                        break;
                    }
                    i10 = a10;
                }
            }
            if (view2 == null) {
                this.f4204d = -1;
            } else {
                this.f4204d = ((RecyclerView.n) view2.getLayoutParams()).a();
            }
        }

        public final View b(RecyclerView.t tVar) {
            List<RecyclerView.b0> list = this.f4211k;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    View view = this.f4211k.get(i10).itemView;
                    RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
                    if (!nVar.d() && this.f4204d == nVar.a()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View d10 = tVar.d(this.f4204d);
            this.f4204d += this.f4205e;
            return d10;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f4213a;

        /* renamed from: b  reason: collision with root package name */
        public int f4214b;
        public boolean c;

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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4213a);
            parcel.writeInt(this.f4214b);
            parcel.writeInt(this.c ? 1 : 0);
        }

        public d(Parcel parcel) {
            this.f4213a = parcel.readInt();
            this.f4214b = parcel.readInt();
            this.c = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f4213a = dVar.f4213a;
            this.f4214b = dVar.f4214b;
            this.c = dVar.c;
        }
    }

    public LinearLayoutManager() {
        this(1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int A(RecyclerView.y yVar) {
        return S0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int A0(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.f4184p == 1) {
            return 0;
        }
        return n1(i10, tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void B0(int i10) {
        this.f4192x = i10;
        this.f4193y = SlideAtom.USES_MASTER_SLIDE_ID;
        d dVar = this.f4194z;
        if (dVar != null) {
            dVar.f4213a = -1;
        }
        z0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final View C(int i10) {
        int I = I();
        if (I == 0) {
            return null;
        }
        int P = i10 - RecyclerView.m.P(H(0));
        if (P >= 0 && P < I) {
            View H = H(P);
            if (RecyclerView.m.P(H) == i10) {
                return H;
            }
        }
        return super.C(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int C0(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.f4184p == 0) {
            return 0;
        }
        return n1(i10, tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n D() {
        return new RecyclerView.n(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean J0() {
        boolean z10;
        if (this.f4296m == 1073741824 || this.f4295l == 1073741824) {
            return false;
        }
        int I = I();
        int i10 = 0;
        while (true) {
            if (i10 < I) {
                ViewGroup.LayoutParams layoutParams = H(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void L0(RecyclerView recyclerView, int i10) {
        v vVar = new v(recyclerView.getContext());
        vVar.f4320a = i10;
        M0(vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean N0() {
        if (this.f4194z == null && this.f4187s == this.f4190v) {
            return true;
        }
        return false;
    }

    public void O0(RecyclerView.y yVar, int[] iArr) {
        boolean z10;
        int i10;
        int i11;
        if (yVar.f4331a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = this.f4186r.l();
        } else {
            i10 = 0;
        }
        if (this.f4185q.f4206f == -1) {
            i11 = 0;
        } else {
            i11 = i10;
            i10 = 0;
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public void P0(RecyclerView.y yVar, c cVar, RecyclerView.m.c cVar2) {
        int i10 = cVar.f4204d;
        if (i10 >= 0 && i10 < yVar.b()) {
            ((q.b) cVar2).a(i10, Math.max(0, cVar.f4207g));
        }
    }

    public final int Q0(RecyclerView.y yVar) {
        if (I() == 0) {
            return 0;
        }
        U0();
        a0 a0Var = this.f4186r;
        boolean z10 = !this.f4191w;
        return g0.a(yVar, a0Var, X0(z10), W0(z10), this, this.f4191w);
    }

    public final int R0(RecyclerView.y yVar) {
        if (I() == 0) {
            return 0;
        }
        U0();
        a0 a0Var = this.f4186r;
        boolean z10 = !this.f4191w;
        return g0.b(yVar, a0Var, X0(z10), W0(z10), this, this.f4191w, this.f4189u);
    }

    public final int S0(RecyclerView.y yVar) {
        if (I() == 0) {
            return 0;
        }
        U0();
        a0 a0Var = this.f4186r;
        boolean z10 = !this.f4191w;
        return g0.c(yVar, a0Var, X0(z10), W0(z10), this, this.f4191w);
    }

    public final int T0(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 == 130 && this.f4184p == 1) {
                                return 1;
                            }
                            return SlideAtom.USES_MASTER_SLIDE_ID;
                        } else if (this.f4184p == 0) {
                            return 1;
                        } else {
                            return SlideAtom.USES_MASTER_SLIDE_ID;
                        }
                    } else if (this.f4184p == 1) {
                        return -1;
                    } else {
                        return SlideAtom.USES_MASTER_SLIDE_ID;
                    }
                } else if (this.f4184p == 0) {
                    return -1;
                } else {
                    return SlideAtom.USES_MASTER_SLIDE_ID;
                }
            } else if (this.f4184p != 1 && h1()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f4184p == 1 || !h1()) {
            return -1;
        } else {
            return 1;
        }
    }

    public final void U0() {
        if (this.f4185q == null) {
            this.f4185q = new c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean V() {
        return true;
    }

    public final int V0(RecyclerView.t tVar, c cVar, RecyclerView.y yVar, boolean z10) {
        boolean z11;
        int i10 = cVar.c;
        int i11 = cVar.f4207g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f4207g = i11 + i10;
            }
            k1(tVar, cVar);
        }
        int i12 = cVar.c + cVar.f4208h;
        while (true) {
            if (!cVar.f4212l && i12 <= 0) {
                break;
            }
            int i13 = cVar.f4204d;
            if (i13 >= 0 && i13 < yVar.b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                break;
            }
            b bVar = this.B;
            bVar.f4199a = 0;
            bVar.f4200b = false;
            bVar.c = false;
            bVar.f4201d = false;
            i1(tVar, yVar, cVar, bVar);
            if (!bVar.f4200b) {
                int i14 = cVar.f4203b;
                int i15 = bVar.f4199a;
                cVar.f4203b = (cVar.f4206f * i15) + i14;
                if (!bVar.c || cVar.f4211k != null || !yVar.f4336g) {
                    cVar.c -= i15;
                    i12 -= i15;
                }
                int i16 = cVar.f4207g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    cVar.f4207g = i17;
                    int i18 = cVar.c;
                    if (i18 < 0) {
                        cVar.f4207g = i17 + i18;
                    }
                    k1(tVar, cVar);
                }
                if (z10 && bVar.f4201d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.c;
    }

    public final View W0(boolean z10) {
        if (this.f4189u) {
            return b1(0, I(), z10, true);
        }
        return b1(I() - 1, -1, z10, true);
    }

    public final View X0(boolean z10) {
        if (this.f4189u) {
            return b1(I() - 1, -1, z10, true);
        }
        return b1(0, I(), z10, true);
    }

    public final int Y0() {
        View b12 = b1(0, I(), false, true);
        if (b12 == null) {
            return -1;
        }
        return RecyclerView.m.P(b12);
    }

    public final int Z0() {
        View b12 = b1(I() - 1, -1, false, true);
        if (b12 == null) {
            return -1;
        }
        return RecyclerView.m.P(b12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x.b
    public final PointF a(int i10) {
        if (I() == 0) {
            return null;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < RecyclerView.m.P(H(0))) {
            z10 = true;
        }
        if (z10 != this.f4189u) {
            i11 = -1;
        }
        if (this.f4184p == 0) {
            return new PointF(i11, 0.0f);
        }
        return new PointF(0.0f, i11);
    }

    public final View a1(int i10, int i11) {
        char c10;
        int i12;
        int i13;
        U0();
        if (i11 > i10) {
            c10 = 1;
        } else if (i11 < i10) {
            c10 = 65535;
        } else {
            c10 = 0;
        }
        if (c10 == 0) {
            return H(i10);
        }
        if (this.f4186r.e(H(i10)) < this.f4186r.k()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        if (this.f4184p == 0) {
            return this.c.a(i10, i11, i12, i13);
        }
        return this.f4287d.a(i10, i11, i12, i13);
    }

    public final View b1(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        U0();
        int i13 = 320;
        if (z10) {
            i12 = 24579;
        } else {
            i12 = 320;
        }
        if (!z11) {
            i13 = 0;
        }
        if (this.f4184p == 0) {
            return this.c.a(i10, i11, i12, i13);
        }
        return this.f4287d.a(i10, i11, i12, i13);
    }

    public View c1(RecyclerView.t tVar, RecyclerView.y yVar, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        boolean z12;
        boolean z13;
        U0();
        int I = I();
        if (z11) {
            i11 = I() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = I;
            i11 = 0;
            i12 = 1;
        }
        int b10 = yVar.b();
        int k10 = this.f4186r.k();
        int g10 = this.f4186r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i11 != i10) {
            View H = H(i11);
            int P = RecyclerView.m.P(H);
            int e10 = this.f4186r.e(H);
            int b11 = this.f4186r.b(H);
            if (P >= 0 && P < b10) {
                if (((RecyclerView.n) H.getLayoutParams()).d()) {
                    if (view3 == null) {
                        view3 = H;
                    }
                } else {
                    if (b11 <= k10 && e10 < k10) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (e10 >= g10 && b11 > g10) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z12 && !z13) {
                        return H;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = H;
                        }
                        view2 = H;
                    } else {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = H;
                        }
                        view2 = H;
                    }
                }
            }
            i11 += i12;
        }
        if (view == null) {
            if (view2 != null) {
                return view2;
            }
            return view3;
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public View d0(View view, int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        int T0;
        View a12;
        View f12;
        m1();
        if (I() == 0 || (T0 = T0(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        U0();
        r1(T0, (int) (this.f4186r.l() * 0.33333334f), false, yVar);
        c cVar = this.f4185q;
        cVar.f4207g = SlideAtom.USES_MASTER_SLIDE_ID;
        cVar.f4202a = false;
        V0(tVar, cVar, yVar, true);
        if (T0 == -1) {
            if (this.f4189u) {
                a12 = a1(I() - 1, -1);
            } else {
                a12 = a1(0, I());
            }
        } else if (this.f4189u) {
            a12 = a1(0, I());
        } else {
            a12 = a1(I() - 1, -1);
        }
        if (T0 == -1) {
            f12 = g1();
        } else {
            f12 = f1();
        }
        if (f12.hasFocusable()) {
            if (a12 == null) {
                return null;
            }
            return f12;
        }
        return a12;
    }

    public final int d1(int i10, RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        int g10;
        int g11 = this.f4186r.g() - i10;
        if (g11 > 0) {
            int i11 = -n1(-g11, tVar, yVar);
            int i12 = i10 + i11;
            if (z10 && (g10 = this.f4186r.g() - i12) > 0) {
                this.f4186r.p(g10);
                return g10 + i11;
            }
            return i11;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void e0(AccessibilityEvent accessibilityEvent) {
        super.e0(accessibilityEvent);
        if (I() > 0) {
            accessibilityEvent.setFromIndex(Y0());
            accessibilityEvent.setToIndex(Z0());
        }
    }

    public final int e1(int i10, RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        int k10;
        int k11 = i10 - this.f4186r.k();
        if (k11 > 0) {
            int i11 = -n1(k11, tVar, yVar);
            int i12 = i10 + i11;
            if (z10 && (k10 = i12 - this.f4186r.k()) > 0) {
                this.f4186r.p(-k10);
                return i11 - k10;
            }
            return i11;
        }
        return 0;
    }

    public final View f1() {
        int I;
        if (this.f4189u) {
            I = 0;
        } else {
            I = I() - 1;
        }
        return H(I);
    }

    public final View g1() {
        int i10;
        if (this.f4189u) {
            i10 = I() - 1;
        } else {
            i10 = 0;
        }
        return H(i10);
    }

    public final boolean h1() {
        if (N() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.r.g
    public final void i(View view, View view2) {
        boolean z10;
        n("Cannot drop a view during a scroll or layout calculation");
        U0();
        m1();
        int P = RecyclerView.m.P(view);
        int P2 = RecyclerView.m.P(view2);
        if (P < P2) {
            z10 = true;
        } else {
            z10 = true;
        }
        if (this.f4189u) {
            if (z10) {
                o1(P2, this.f4186r.g() - (this.f4186r.c(view) + this.f4186r.e(view2)));
                return;
            }
            o1(P2, this.f4186r.g() - this.f4186r.b(view2));
        } else if (z10) {
            o1(P2, this.f4186r.e(view2));
        } else {
            o1(P2, this.f4186r.b(view2) - this.f4186r.c(view));
        }
    }

    public void i1(RecyclerView.t tVar, RecyclerView.y yVar, c cVar, b bVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        View b10 = cVar.b(tVar);
        if (b10 == null) {
            bVar.f4200b = true;
            return;
        }
        RecyclerView.n nVar = (RecyclerView.n) b10.getLayoutParams();
        if (cVar.f4211k == null) {
            boolean z12 = this.f4189u;
            if (cVar.f4206f == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12 == z11) {
                m(b10, false, -1);
            } else {
                m(b10, false, 0);
            }
        } else {
            boolean z13 = this.f4189u;
            if (cVar.f4206f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z13 == z10) {
                m(b10, true, -1);
            } else {
                m(b10, true, 0);
            }
        }
        RecyclerView.n nVar2 = (RecyclerView.n) b10.getLayoutParams();
        Rect Z = this.f4286b.Z(b10);
        int J = RecyclerView.m.J(this.f4297n, this.f4295l, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) nVar2).leftMargin + ((ViewGroup.MarginLayoutParams) nVar2).rightMargin + Z.left + Z.right + 0, ((ViewGroup.MarginLayoutParams) nVar2).width, p());
        int J2 = RecyclerView.m.J(this.f4298o, this.f4296m, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) nVar2).topMargin + ((ViewGroup.MarginLayoutParams) nVar2).bottomMargin + Z.top + Z.bottom + 0, ((ViewGroup.MarginLayoutParams) nVar2).height, q());
        if (I0(b10, J, J2, nVar2)) {
            b10.measure(J, J2);
        }
        bVar.f4199a = this.f4186r.c(b10);
        if (this.f4184p == 1) {
            if (h1()) {
                i13 = this.f4297n - getPaddingRight();
                i10 = i13 - this.f4186r.d(b10);
            } else {
                i10 = getPaddingLeft();
                i13 = this.f4186r.d(b10) + i10;
            }
            if (cVar.f4206f == -1) {
                i11 = cVar.f4203b;
                i12 = i11 - bVar.f4199a;
            } else {
                i12 = cVar.f4203b;
                i11 = bVar.f4199a + i12;
            }
        } else {
            int paddingTop = getPaddingTop();
            int d10 = this.f4186r.d(b10) + paddingTop;
            if (cVar.f4206f == -1) {
                int i14 = cVar.f4203b;
                int i15 = i14 - bVar.f4199a;
                i13 = i14;
                i11 = d10;
                i10 = i15;
                i12 = paddingTop;
            } else {
                int i16 = cVar.f4203b;
                int i17 = bVar.f4199a + i16;
                i10 = i16;
                i11 = d10;
                i12 = paddingTop;
                i13 = i17;
            }
        }
        RecyclerView.m.X(b10, i10, i12, i13, i11);
        if (nVar.d() || nVar.b()) {
            bVar.c = true;
        }
        bVar.f4201d = b10.hasFocusable();
    }

    public final void k1(RecyclerView.t tVar, c cVar) {
        if (cVar.f4202a && !cVar.f4212l) {
            int i10 = cVar.f4207g;
            int i11 = cVar.f4209i;
            if (cVar.f4206f == -1) {
                int I = I();
                if (i10 >= 0) {
                    int f10 = (this.f4186r.f() - i10) + i11;
                    if (this.f4189u) {
                        for (int i12 = 0; i12 < I; i12++) {
                            View H = H(i12);
                            if (this.f4186r.e(H) < f10 || this.f4186r.o(H) < f10) {
                                l1(tVar, 0, i12);
                                return;
                            }
                        }
                        return;
                    }
                    int i13 = I - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View H2 = H(i14);
                        if (this.f4186r.e(H2) < f10 || this.f4186r.o(H2) < f10) {
                            l1(tVar, i13, i14);
                            return;
                        }
                    }
                }
            } else if (i10 >= 0) {
                int i15 = i10 - i11;
                int I2 = I();
                if (this.f4189u) {
                    int i16 = I2 - 1;
                    for (int i17 = i16; i17 >= 0; i17--) {
                        View H3 = H(i17);
                        if (this.f4186r.b(H3) > i15 || this.f4186r.n(H3) > i15) {
                            l1(tVar, i16, i17);
                            return;
                        }
                    }
                    return;
                }
                for (int i18 = 0; i18 < I2; i18++) {
                    View H4 = H(i18);
                    if (this.f4186r.b(H4) > i15 || this.f4186r.n(H4) > i15) {
                        l1(tVar, 0, i18);
                        return;
                    }
                }
            }
        }
    }

    public final void l1(RecyclerView.t tVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                View H = H(i10);
                if (H(i10) != null) {
                    this.f4285a.k(i10);
                }
                tVar.g(H);
                i10--;
            }
            return;
        }
        while (true) {
            i11--;
            if (i11 >= i10) {
                View H2 = H(i11);
                if (H(i11) != null) {
                    this.f4285a.k(i11);
                }
                tVar.g(H2);
            } else {
                return;
            }
        }
    }

    public final void m1() {
        if (this.f4184p != 1 && h1()) {
            this.f4189u = !this.f4188t;
        } else {
            this.f4189u = this.f4188t;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void n(String str) {
        if (this.f4194z == null) {
            super.n(str);
        }
    }

    public final int n1(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        int i11;
        if (I() == 0 || i10 == 0) {
            return 0;
        }
        U0();
        this.f4185q.f4202a = true;
        if (i10 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        r1(i11, abs, true, yVar);
        c cVar = this.f4185q;
        int V0 = V0(tVar, cVar, yVar, false) + cVar.f4207g;
        if (V0 < 0) {
            return 0;
        }
        if (abs > V0) {
            i10 = i11 * V0;
        }
        this.f4186r.p(-i10);
        this.f4185q.f4210j = i10;
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018b  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o0(androidx.recyclerview.widget.RecyclerView.t r18, androidx.recyclerview.widget.RecyclerView.y r19) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.o0(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y):void");
    }

    public final void o1(int i10, int i11) {
        this.f4192x = i10;
        this.f4193y = i11;
        d dVar = this.f4194z;
        if (dVar != null) {
            dVar.f4213a = -1;
        }
        z0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean p() {
        if (this.f4184p == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void p0(RecyclerView.y yVar) {
        this.f4194z = null;
        this.f4192x = -1;
        this.f4193y = SlideAtom.USES_MASTER_SLIDE_ID;
        this.A.d();
    }

    public final void p1(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(b.a.c("invalid orientation:", i10));
        }
        n(null);
        if (i10 != this.f4184p || this.f4186r == null) {
            a0 a10 = a0.a(this, i10);
            this.f4186r = a10;
            this.A.f4195a = a10;
            this.f4184p = i10;
            z0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean q() {
        if (this.f4184p == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void q0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f4194z = dVar;
            if (this.f4192x != -1) {
                dVar.f4213a = -1;
            }
            z0();
        }
    }

    public void q1(boolean z10) {
        n(null);
        if (this.f4190v == z10) {
            return;
        }
        this.f4190v = z10;
        z0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final Parcelable r0() {
        d dVar = this.f4194z;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (I() > 0) {
            U0();
            boolean z10 = this.f4187s ^ this.f4189u;
            dVar2.c = z10;
            if (z10) {
                View f12 = f1();
                dVar2.f4214b = this.f4186r.g() - this.f4186r.b(f12);
                dVar2.f4213a = RecyclerView.m.P(f12);
            } else {
                View g12 = g1();
                dVar2.f4213a = RecyclerView.m.P(g12);
                dVar2.f4214b = this.f4186r.e(g12) - this.f4186r.k();
            }
        } else {
            dVar2.f4213a = -1;
        }
        return dVar2;
    }

    public final void r1(int i10, int i11, boolean z10, RecyclerView.y yVar) {
        boolean z11;
        int i12;
        int k10;
        c cVar = this.f4185q;
        int i13 = 1;
        boolean z12 = false;
        if (this.f4186r.i() == 0 && this.f4186r.f() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        cVar.f4212l = z11;
        this.f4185q.f4206f = i10;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        O0(yVar, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i10 == 1) {
            z12 = true;
        }
        c cVar2 = this.f4185q;
        if (z12) {
            i12 = max2;
        } else {
            i12 = max;
        }
        cVar2.f4208h = i12;
        if (!z12) {
            max = max2;
        }
        cVar2.f4209i = max;
        if (z12) {
            cVar2.f4208h = this.f4186r.h() + i12;
            View f12 = f1();
            c cVar3 = this.f4185q;
            if (this.f4189u) {
                i13 = -1;
            }
            cVar3.f4205e = i13;
            int P = RecyclerView.m.P(f12);
            c cVar4 = this.f4185q;
            cVar3.f4204d = P + cVar4.f4205e;
            cVar4.f4203b = this.f4186r.b(f12);
            k10 = this.f4186r.b(f12) - this.f4186r.g();
        } else {
            View g12 = g1();
            c cVar5 = this.f4185q;
            cVar5.f4208h = this.f4186r.k() + cVar5.f4208h;
            c cVar6 = this.f4185q;
            if (!this.f4189u) {
                i13 = -1;
            }
            cVar6.f4205e = i13;
            int P2 = RecyclerView.m.P(g12);
            c cVar7 = this.f4185q;
            cVar6.f4204d = P2 + cVar7.f4205e;
            cVar7.f4203b = this.f4186r.e(g12);
            k10 = (-this.f4186r.e(g12)) + this.f4186r.k();
        }
        c cVar8 = this.f4185q;
        cVar8.c = i11;
        if (z10) {
            cVar8.c = i11 - k10;
        }
        cVar8.f4207g = k10;
    }

    public final void s1(int i10, int i11) {
        int i12;
        this.f4185q.c = this.f4186r.g() - i11;
        c cVar = this.f4185q;
        if (this.f4189u) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        cVar.f4205e = i12;
        cVar.f4204d = i10;
        cVar.f4206f = 1;
        cVar.f4203b = i11;
        cVar.f4207g = SlideAtom.USES_MASTER_SLIDE_ID;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void t(int i10, int i11, RecyclerView.y yVar, RecyclerView.m.c cVar) {
        int i12;
        if (this.f4184p != 0) {
            i10 = i11;
        }
        if (I() != 0 && i10 != 0) {
            U0();
            if (i10 > 0) {
                i12 = 1;
            } else {
                i12 = -1;
            }
            r1(i12, Math.abs(i10), true, yVar);
            P0(yVar, this.f4185q, cVar);
        }
    }

    public final void t1(int i10, int i11) {
        int i12;
        this.f4185q.c = i11 - this.f4186r.k();
        c cVar = this.f4185q;
        cVar.f4204d = i10;
        if (this.f4189u) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        cVar.f4205e = i12;
        cVar.f4206f = -1;
        cVar.f4203b = i11;
        cVar.f4207g = SlideAtom.USES_MASTER_SLIDE_ID;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(int r7, androidx.recyclerview.widget.RecyclerView.m.c r8) {
        /*
            r6 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r6.f4194z
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L13
            int r4 = r0.f4213a
            if (r4 < 0) goto Ld
            r5 = r1
            goto Le
        Ld:
            r5 = r3
        Le:
            if (r5 == 0) goto L13
            boolean r0 = r0.c
            goto L22
        L13:
            r6.m1()
            boolean r0 = r6.f4189u
            int r4 = r6.f4192x
            if (r4 != r2) goto L22
            if (r0 == 0) goto L21
            int r4 = r7 + (-1)
            goto L22
        L21:
            r4 = r3
        L22:
            if (r0 == 0) goto L25
            r1 = r2
        L25:
            r0 = r3
        L26:
            int r2 = r6.C
            if (r0 >= r2) goto L38
            if (r4 < 0) goto L38
            if (r4 >= r7) goto L38
            r2 = r8
            androidx.recyclerview.widget.q$b r2 = (androidx.recyclerview.widget.q.b) r2
            r2.a(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L26
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.u(int, androidx.recyclerview.widget.RecyclerView$m$c):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int v(RecyclerView.y yVar) {
        return Q0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int w(RecyclerView.y yVar) {
        return R0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int x(RecyclerView.y yVar) {
        return S0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int y(RecyclerView.y yVar) {
        return Q0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int z(RecyclerView.y yVar) {
        return R0(yVar);
    }

    public LinearLayoutManager(int i10) {
        this.f4184p = 1;
        this.f4188t = false;
        this.f4189u = false;
        this.f4190v = false;
        this.f4191w = true;
        this.f4192x = -1;
        this.f4193y = SlideAtom.USES_MASTER_SLIDE_ID;
        this.f4194z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        p1(i10);
        n(null);
        if (this.f4188t) {
            this.f4188t = false;
            z0();
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f4184p = 1;
        this.f4188t = false;
        this.f4189u = false;
        this.f4190v = false;
        this.f4191w = true;
        this.f4192x = -1;
        this.f4193y = SlideAtom.USES_MASTER_SLIDE_ID;
        this.f4194z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        RecyclerView.m.d Q = RecyclerView.m.Q(context, attributeSet, i10, i11);
        p1(Q.f4301a);
        boolean z10 = Q.c;
        n(null);
        if (z10 != this.f4188t) {
            this.f4188t = z10;
            z0();
        }
        q1(Q.f4303d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void c0(RecyclerView recyclerView) {
    }

    public void j1(RecyclerView.t tVar, RecyclerView.y yVar, a aVar, int i10) {
    }
}
