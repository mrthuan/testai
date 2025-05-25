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
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;
import lib.zj.office.fc.hslf.record.SlideAtom;
import x0.f0;
import x0.n0;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.m implements RecyclerView.x.b {
    public final d B;
    public final int C;
    public boolean D;
    public boolean E;
    public e F;
    public final Rect G;
    public final b H;
    public final boolean I;
    public int[] J;
    public final a K;

    /* renamed from: p  reason: collision with root package name */
    public int f4344p;

    /* renamed from: q  reason: collision with root package name */
    public f[] f4345q;

    /* renamed from: r  reason: collision with root package name */
    public a0 f4346r;

    /* renamed from: s  reason: collision with root package name */
    public a0 f4347s;

    /* renamed from: t  reason: collision with root package name */
    public int f4348t;

    /* renamed from: u  reason: collision with root package name */
    public int f4349u;

    /* renamed from: v  reason: collision with root package name */
    public final u f4350v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f4351w;

    /* renamed from: y  reason: collision with root package name */
    public BitSet f4353y;

    /* renamed from: x  reason: collision with root package name */
    public boolean f4352x = false;

    /* renamed from: z  reason: collision with root package name */
    public int f4354z = -1;
    public int A = SlideAtom.USES_MASTER_SLIDE_ID;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.P0();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f4356a;

        /* renamed from: b  reason: collision with root package name */
        public int f4357b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4358d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4359e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f4360f;

        public b() {
            a();
        }

        public final void a() {
            this.f4356a = -1;
            this.f4357b = SlideAtom.USES_MASTER_SLIDE_ID;
            this.c = false;
            this.f4358d = false;
            this.f4359e = false;
            int[] iArr = this.f4360f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.n {

        /* renamed from: e  reason: collision with root package name */
        public f f4362e;
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f4368a;

        /* renamed from: b  reason: collision with root package name */
        public int f4369b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int[] f4370d;

        /* renamed from: e  reason: collision with root package name */
        public int f4371e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f4372f;

        /* renamed from: g  reason: collision with root package name */
        public List<d.a> f4373g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f4374h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f4375i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f4376j;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4368a);
            parcel.writeInt(this.f4369b);
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.f4370d);
            }
            parcel.writeInt(this.f4371e);
            if (this.f4371e > 0) {
                parcel.writeIntArray(this.f4372f);
            }
            parcel.writeInt(this.f4374h ? 1 : 0);
            parcel.writeInt(this.f4375i ? 1 : 0);
            parcel.writeInt(this.f4376j ? 1 : 0);
            parcel.writeList(this.f4373g);
        }

        public e(Parcel parcel) {
            this.f4368a = parcel.readInt();
            this.f4369b = parcel.readInt();
            int readInt = parcel.readInt();
            this.c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f4370d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f4371e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f4372f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f4374h = parcel.readInt() == 1;
            this.f4375i = parcel.readInt() == 1;
            this.f4376j = parcel.readInt() == 1;
            this.f4373g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.c = eVar.c;
            this.f4368a = eVar.f4368a;
            this.f4369b = eVar.f4369b;
            this.f4370d = eVar.f4370d;
            this.f4371e = eVar.f4371e;
            this.f4372f = eVar.f4372f;
            this.f4374h = eVar.f4374h;
            this.f4375i = eVar.f4375i;
            this.f4376j = eVar.f4376j;
            this.f4373g = eVar.f4373g;
        }
    }

    /* loaded from: classes.dex */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<View> f4377a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f4378b = SlideAtom.USES_MASTER_SLIDE_ID;
        public int c = SlideAtom.USES_MASTER_SLIDE_ID;

        /* renamed from: d  reason: collision with root package name */
        public int f4379d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f4380e;

        public f(int i10) {
            this.f4380e = i10;
        }

        public static c h(View view) {
            return (c) view.getLayoutParams();
        }

        public final void a() {
            ArrayList<View> arrayList = this.f4377a;
            View view = arrayList.get(arrayList.size() - 1);
            c h10 = h(view);
            this.c = StaggeredGridLayoutManager.this.f4346r.b(view);
            h10.getClass();
        }

        public final void b() {
            this.f4377a.clear();
            this.f4378b = SlideAtom.USES_MASTER_SLIDE_ID;
            this.c = SlideAtom.USES_MASTER_SLIDE_ID;
            this.f4379d = 0;
        }

        public final int c() {
            boolean z10 = StaggeredGridLayoutManager.this.f4351w;
            ArrayList<View> arrayList = this.f4377a;
            if (z10) {
                return e(arrayList.size() - 1, -1);
            }
            return e(0, arrayList.size());
        }

        public final int d() {
            boolean z10 = StaggeredGridLayoutManager.this.f4351w;
            ArrayList<View> arrayList = this.f4377a;
            if (z10) {
                return e(0, arrayList.size());
            }
            return e(arrayList.size() - 1, -1);
        }

        public final int e(int i10, int i11) {
            int i12;
            boolean z10;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int k10 = staggeredGridLayoutManager.f4346r.k();
            int g10 = staggeredGridLayoutManager.f4346r.g();
            if (i11 > i10) {
                i12 = 1;
            } else {
                i12 = -1;
            }
            while (i10 != i11) {
                View view = this.f4377a.get(i10);
                int e10 = staggeredGridLayoutManager.f4346r.e(view);
                int b10 = staggeredGridLayoutManager.f4346r.b(view);
                boolean z11 = false;
                if (e10 <= g10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (b10 >= k10) {
                    z11 = true;
                }
                if (z10 && z11 && (e10 < k10 || b10 > g10)) {
                    return RecyclerView.m.P(view);
                }
                i10 += i12;
            }
            return -1;
        }

        public final int f(int i10) {
            int i11 = this.c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f4377a.size() == 0) {
                return i10;
            }
            a();
            return this.c;
        }

        public final View g(int i10, int i11) {
            ArrayList<View> arrayList = this.f4377a;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            View view = null;
            if (i11 == -1) {
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    View view2 = arrayList.get(i12);
                    if ((staggeredGridLayoutManager.f4351w && RecyclerView.m.P(view2) <= i10) || ((!staggeredGridLayoutManager.f4351w && RecyclerView.m.P(view2) >= i10) || !view2.hasFocusable())) {
                        break;
                    }
                    i12++;
                    view = view2;
                }
            } else {
                int size2 = arrayList.size() - 1;
                while (size2 >= 0) {
                    View view3 = arrayList.get(size2);
                    if ((staggeredGridLayoutManager.f4351w && RecyclerView.m.P(view3) >= i10) || ((!staggeredGridLayoutManager.f4351w && RecyclerView.m.P(view3) <= i10) || !view3.hasFocusable())) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        public final int i(int i10) {
            int i11 = this.f4378b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            ArrayList<View> arrayList = this.f4377a;
            if (arrayList.size() == 0) {
                return i10;
            }
            View view = arrayList.get(0);
            c h10 = h(view);
            this.f4378b = StaggeredGridLayoutManager.this.f4346r.e(view);
            h10.getClass();
            return this.f4378b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f4344p = -1;
        this.f4351w = false;
        d dVar = new d();
        this.B = dVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new b();
        this.I = true;
        this.K = new a();
        RecyclerView.m.d Q = RecyclerView.m.Q(context, attributeSet, i10, i11);
        int i12 = Q.f4301a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        n(null);
        if (i12 != this.f4348t) {
            this.f4348t = i12;
            a0 a0Var = this.f4346r;
            this.f4346r = this.f4347s;
            this.f4347s = a0Var;
            z0();
        }
        int i13 = Q.f4302b;
        n(null);
        if (i13 != this.f4344p) {
            dVar.a();
            z0();
            this.f4344p = i13;
            this.f4353y = new BitSet(this.f4344p);
            this.f4345q = new f[this.f4344p];
            for (int i14 = 0; i14 < this.f4344p; i14++) {
                this.f4345q[i14] = new f(i14);
            }
            z0();
        }
        boolean z10 = Q.c;
        n(null);
        e eVar = this.F;
        if (eVar != null && eVar.f4374h != z10) {
            eVar.f4374h = z10;
        }
        this.f4351w = z10;
        z0();
        this.f4350v = new u();
        this.f4346r = a0.a(this, this.f4348t);
        this.f4347s = a0.a(this, 1 - this.f4348t);
    }

    public static int r1(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int A(RecyclerView.y yVar) {
        return S0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int A0(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        return n1(i10, tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void B0(int i10) {
        e eVar = this.F;
        if (eVar != null && eVar.f4368a != i10) {
            eVar.f4370d = null;
            eVar.c = 0;
            eVar.f4368a = -1;
            eVar.f4369b = -1;
        }
        this.f4354z = i10;
        this.A = SlideAtom.USES_MASTER_SLIDE_ID;
        z0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int C0(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        return n1(i10, tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n D() {
        if (this.f4348t == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n E(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void F0(Rect rect, int i10, int i11) {
        int s4;
        int s10;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f4348t == 1) {
            int height = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.f4286b;
            WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
            s10 = RecyclerView.m.s(i11, height, f0.d.d(recyclerView));
            s4 = RecyclerView.m.s(i10, (this.f4349u * this.f4344p) + paddingRight, f0.d.e(this.f4286b));
        } else {
            int width = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.f4286b;
            WeakHashMap<View, n0> weakHashMap2 = x0.f0.f31435a;
            s4 = RecyclerView.m.s(i10, width, f0.d.e(recyclerView2));
            s10 = RecyclerView.m.s(i11, (this.f4349u * this.f4344p) + paddingBottom, f0.d.d(this.f4286b));
        }
        this.f4286b.setMeasuredDimension(s4, s10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void L0(RecyclerView recyclerView, int i10) {
        v vVar = new v(recyclerView.getContext());
        vVar.f4320a = i10;
        M0(vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean N0() {
        if (this.F == null) {
            return true;
        }
        return false;
    }

    public final int O0(int i10) {
        boolean z10;
        if (I() == 0) {
            if (!this.f4352x) {
                return -1;
            }
            return 1;
        }
        if (i10 < Y0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f4352x) {
            return -1;
        }
        return 1;
    }

    public final boolean P0() {
        int Y0;
        if (I() != 0 && this.C != 0 && this.f4290g) {
            if (this.f4352x) {
                Y0 = Z0();
                Y0();
            } else {
                Y0 = Y0();
                Z0();
            }
            if (Y0 == 0 && d1() != null) {
                this.B.a();
                this.f4289f = true;
                z0();
                return true;
            }
        }
        return false;
    }

    public final int Q0(RecyclerView.y yVar) {
        if (I() == 0) {
            return 0;
        }
        a0 a0Var = this.f4346r;
        boolean z10 = this.I;
        return g0.a(yVar, a0Var, V0(!z10), U0(!z10), this, this.I);
    }

    public final int R0(RecyclerView.y yVar) {
        if (I() == 0) {
            return 0;
        }
        a0 a0Var = this.f4346r;
        boolean z10 = this.I;
        return g0.b(yVar, a0Var, V0(!z10), U0(!z10), this, this.I, this.f4352x);
    }

    public final int S0(RecyclerView.y yVar) {
        if (I() == 0) {
            return 0;
        }
        a0 a0Var = this.f4346r;
        boolean z10 = this.I;
        return g0.c(yVar, a0Var, V0(!z10), U0(!z10), this, this.I);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v19 */
    public final int T0(RecyclerView.t tVar, u uVar, RecyclerView.y yVar) {
        int i10;
        int k10;
        int i11;
        int a12;
        int i12;
        int i13;
        f fVar;
        ?? r82;
        int i14;
        int c10;
        int k11;
        int c11;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = 0;
        int i20 = 1;
        this.f4353y.set(0, this.f4344p, true);
        u uVar2 = this.f4350v;
        if (uVar2.f4607i) {
            if (uVar.f4603e == 1) {
                i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            } else {
                i10 = SlideAtom.USES_MASTER_SLIDE_ID;
            }
        } else if (uVar.f4603e == 1) {
            i10 = uVar.f4605g + uVar.f4601b;
        } else {
            i10 = uVar.f4604f - uVar.f4601b;
        }
        int i21 = uVar.f4603e;
        for (int i22 = 0; i22 < this.f4344p; i22++) {
            if (!this.f4345q[i22].f4377a.isEmpty()) {
                q1(this.f4345q[i22], i21, i10);
            }
        }
        if (this.f4352x) {
            k10 = this.f4346r.g();
        } else {
            k10 = this.f4346r.k();
        }
        boolean z10 = false;
        while (true) {
            int i23 = uVar.c;
            if (i23 >= 0 && i23 < yVar.b()) {
                i11 = i20;
            } else {
                i11 = i19;
            }
            if (i11 == 0 || (!uVar2.f4607i && this.f4353y.isEmpty())) {
                break;
            }
            View d10 = tVar.d(uVar.c);
            uVar.c += uVar.f4602d;
            c cVar = (c) d10.getLayoutParams();
            int a10 = cVar.a();
            d dVar = this.B;
            int[] iArr = dVar.f4363a;
            if (iArr != null && a10 < iArr.length) {
                i12 = iArr[a10];
            } else {
                i12 = -1;
            }
            if (i12 == -1) {
                i13 = i20;
            } else {
                i13 = i19;
            }
            if (i13 != 0) {
                if (h1(uVar.f4603e)) {
                    i18 = this.f4344p - i20;
                    i17 = -1;
                    i16 = -1;
                } else {
                    i16 = i20;
                    i17 = this.f4344p;
                    i18 = i19;
                }
                f fVar2 = null;
                if (uVar.f4603e == i20) {
                    int k12 = this.f4346r.k();
                    int i24 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    while (i18 != i17) {
                        f fVar3 = this.f4345q[i18];
                        int f10 = fVar3.f(k12);
                        if (f10 < i24) {
                            i24 = f10;
                            fVar2 = fVar3;
                        }
                        i18 += i16;
                    }
                } else {
                    int g10 = this.f4346r.g();
                    int i25 = SlideAtom.USES_MASTER_SLIDE_ID;
                    while (i18 != i17) {
                        f fVar4 = this.f4345q[i18];
                        int i26 = fVar4.i(g10);
                        if (i26 > i25) {
                            fVar2 = fVar4;
                            i25 = i26;
                        }
                        i18 += i16;
                    }
                }
                fVar = fVar2;
                dVar.b(a10);
                dVar.f4363a[a10] = fVar.f4380e;
            } else {
                fVar = this.f4345q[i12];
            }
            cVar.f4362e = fVar;
            if (uVar.f4603e == 1) {
                r82 = 0;
                m(d10, false, -1);
            } else {
                r82 = 0;
                m(d10, false, 0);
            }
            if (this.f4348t == 1) {
                f1(d10, RecyclerView.m.J(this.f4349u, this.f4295l, r82, ((ViewGroup.MarginLayoutParams) cVar).width, r82), RecyclerView.m.J(this.f4298o, this.f4296m, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) cVar).height, true), r82);
            } else {
                f1(d10, RecyclerView.m.J(this.f4297n, this.f4295l, getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.m.J(this.f4349u, this.f4296m, 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), false);
            }
            if (uVar.f4603e == 1) {
                c10 = fVar.f(k10);
                i14 = this.f4346r.c(d10) + c10;
            } else {
                i14 = fVar.i(k10);
                c10 = i14 - this.f4346r.c(d10);
            }
            if (uVar.f4603e == 1) {
                f fVar5 = cVar.f4362e;
                fVar5.getClass();
                c cVar2 = (c) d10.getLayoutParams();
                cVar2.f4362e = fVar5;
                ArrayList<View> arrayList = fVar5.f4377a;
                arrayList.add(d10);
                fVar5.c = SlideAtom.USES_MASTER_SLIDE_ID;
                if (arrayList.size() == 1) {
                    fVar5.f4378b = SlideAtom.USES_MASTER_SLIDE_ID;
                }
                if (cVar2.d() || cVar2.b()) {
                    fVar5.f4379d = StaggeredGridLayoutManager.this.f4346r.c(d10) + fVar5.f4379d;
                }
            } else {
                f fVar6 = cVar.f4362e;
                fVar6.getClass();
                c cVar3 = (c) d10.getLayoutParams();
                cVar3.f4362e = fVar6;
                ArrayList<View> arrayList2 = fVar6.f4377a;
                arrayList2.add(0, d10);
                fVar6.f4378b = SlideAtom.USES_MASTER_SLIDE_ID;
                if (arrayList2.size() == 1) {
                    fVar6.c = SlideAtom.USES_MASTER_SLIDE_ID;
                }
                if (cVar3.d() || cVar3.b()) {
                    fVar6.f4379d = StaggeredGridLayoutManager.this.f4346r.c(d10) + fVar6.f4379d;
                }
            }
            if (e1() && this.f4348t == 1) {
                c11 = this.f4347s.g() - (((this.f4344p - 1) - fVar.f4380e) * this.f4349u);
                k11 = c11 - this.f4347s.c(d10);
            } else {
                k11 = this.f4347s.k() + (fVar.f4380e * this.f4349u);
                c11 = this.f4347s.c(d10) + k11;
            }
            if (this.f4348t == 1) {
                RecyclerView.m.X(d10, k11, c10, c11, i14);
            } else {
                RecyclerView.m.X(d10, c10, k11, i14, c11);
            }
            q1(fVar, uVar2.f4603e, i10);
            j1(tVar, uVar2);
            if (uVar2.f4606h && d10.hasFocusable()) {
                i15 = 0;
                this.f4353y.set(fVar.f4380e, false);
            } else {
                i15 = 0;
            }
            i19 = i15;
            i20 = 1;
            z10 = true;
        }
        int i27 = i19;
        if (!z10) {
            j1(tVar, uVar2);
        }
        if (uVar2.f4603e == -1) {
            a12 = this.f4346r.k() - b1(this.f4346r.k());
        } else {
            a12 = a1(this.f4346r.g()) - this.f4346r.g();
        }
        if (a12 > 0) {
            return Math.min(uVar.f4601b, a12);
        }
        return i27;
    }

    public final View U0(boolean z10) {
        int k10 = this.f4346r.k();
        int g10 = this.f4346r.g();
        View view = null;
        for (int I = I() - 1; I >= 0; I--) {
            View H = H(I);
            int e10 = this.f4346r.e(H);
            int b10 = this.f4346r.b(H);
            if (b10 > k10 && e10 < g10) {
                if (b10 > g10 && z10) {
                    if (view == null) {
                        view = H;
                    }
                } else {
                    return H;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean V() {
        if (this.C != 0) {
            return true;
        }
        return false;
    }

    public final View V0(boolean z10) {
        int k10 = this.f4346r.k();
        int g10 = this.f4346r.g();
        int I = I();
        View view = null;
        for (int i10 = 0; i10 < I; i10++) {
            View H = H(i10);
            int e10 = this.f4346r.e(H);
            if (this.f4346r.b(H) > k10 && e10 < g10) {
                if (e10 < k10 && z10) {
                    if (view == null) {
                        view = H;
                    }
                } else {
                    return H;
                }
            }
        }
        return view;
    }

    public final void W0(RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        int g10;
        int a12 = a1(SlideAtom.USES_MASTER_SLIDE_ID);
        if (a12 != Integer.MIN_VALUE && (g10 = this.f4346r.g() - a12) > 0) {
            int i10 = g10 - (-n1(-g10, tVar, yVar));
            if (z10 && i10 > 0) {
                this.f4346r.p(i10);
            }
        }
    }

    public final void X0(RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        int k10;
        int b12 = b1(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (b12 != Integer.MAX_VALUE && (k10 = b12 - this.f4346r.k()) > 0) {
            int n12 = k10 - n1(k10, tVar, yVar);
            if (z10 && n12 > 0) {
                this.f4346r.p(-n12);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Y(int i10) {
        super.Y(i10);
        for (int i11 = 0; i11 < this.f4344p; i11++) {
            f fVar = this.f4345q[i11];
            int i12 = fVar.f4378b;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f4378b = i12 + i10;
            }
            int i13 = fVar.c;
            if (i13 != Integer.MIN_VALUE) {
                fVar.c = i13 + i10;
            }
        }
    }

    public final int Y0() {
        if (I() == 0) {
            return 0;
        }
        return RecyclerView.m.P(H(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Z(int i10) {
        super.Z(i10);
        for (int i11 = 0; i11 < this.f4344p; i11++) {
            f fVar = this.f4345q[i11];
            int i12 = fVar.f4378b;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f4378b = i12 + i10;
            }
            int i13 = fVar.c;
            if (i13 != Integer.MIN_VALUE) {
                fVar.c = i13 + i10;
            }
        }
    }

    public final int Z0() {
        int I = I();
        if (I == 0) {
            return 0;
        }
        return RecyclerView.m.P(H(I - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x.b
    public final PointF a(int i10) {
        int O0 = O0(i10);
        PointF pointF = new PointF();
        if (O0 == 0) {
            return null;
        }
        if (this.f4348t == 0) {
            pointF.x = O0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = O0;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void a0() {
        this.B.a();
        for (int i10 = 0; i10 < this.f4344p; i10++) {
            this.f4345q[i10].b();
        }
    }

    public final int a1(int i10) {
        int f10 = this.f4345q[0].f(i10);
        for (int i11 = 1; i11 < this.f4344p; i11++) {
            int f11 = this.f4345q[i11].f(i10);
            if (f11 > f10) {
                f10 = f11;
            }
        }
        return f10;
    }

    public final int b1(int i10) {
        int i11 = this.f4345q[0].i(i10);
        for (int i12 = 1; i12 < this.f4344p; i12++) {
            int i13 = this.f4345q[i12].i(i10);
            if (i13 < i11) {
                i11 = i13;
            }
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void c0(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4286b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i10 = 0; i10 < this.f4344p; i10++) {
            this.f4345q[i10].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c1(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f4352x
            if (r0 == 0) goto L9
            int r0 = r7.Z0()
            goto Ld
        L9:
            int r0 = r7.Y0()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1a
            if (r8 >= r9) goto L16
            int r2 = r9 + 1
            goto L1c
        L16:
            int r2 = r8 + 1
            r3 = r9
            goto L1d
        L1a:
            int r2 = r8 + r9
        L1c:
            r3 = r8
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r7.B
            r4.c(r3)
            r5 = 1
            if (r10 == r5) goto L36
            r6 = 2
            if (r10 == r6) goto L32
            if (r10 == r1) goto L2b
            goto L39
        L2b:
            r4.e(r8, r5)
            r4.d(r9, r5)
            goto L39
        L32:
            r4.e(r8, r9)
            goto L39
        L36:
            r4.d(r8, r9)
        L39:
            if (r2 > r0) goto L3c
            return
        L3c:
            boolean r8 = r7.f4352x
            if (r8 == 0) goto L45
            int r8 = r7.Y0()
            goto L49
        L45:
            int r8 = r7.Z0()
        L49:
            if (r3 > r8) goto L4e
            r7.z0()
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c1(int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004a, code lost:
        if (r8.f4348t == 1) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004f, code lost:
        if (r8.f4348t == 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005d, code lost:
        if (e1() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0069, code lost:
        if (e1() == false) goto L113;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View d0(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.t r11, androidx.recyclerview.widget.RecyclerView.y r12) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cc, code lost:
        if (r10 == r11) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00de, code lost:
        if (r10 == r11) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e0, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e2, code lost:
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View d1() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d1():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void e0(AccessibilityEvent accessibilityEvent) {
        super.e0(accessibilityEvent);
        if (I() > 0) {
            View V0 = V0(false);
            View U0 = U0(false);
            if (V0 != null && U0 != null) {
                int P = RecyclerView.m.P(V0);
                int P2 = RecyclerView.m.P(U0);
                if (P < P2) {
                    accessibilityEvent.setFromIndex(P);
                    accessibilityEvent.setToIndex(P2);
                    return;
                }
                accessibilityEvent.setFromIndex(P2);
                accessibilityEvent.setToIndex(P);
            }
        }
    }

    public final boolean e1() {
        if (N() == 1) {
            return true;
        }
        return false;
    }

    public final void f1(View view, int i10, int i11, boolean z10) {
        Rect rect = this.G;
        o(rect, view);
        c cVar = (c) view.getLayoutParams();
        int r12 = r1(i10, ((ViewGroup.MarginLayoutParams) cVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int r13 = r1(i11, ((ViewGroup.MarginLayoutParams) cVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect.bottom);
        if (I0(view, r12, r13, cVar)) {
            view.measure(r12, r13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:251:0x0408, code lost:
        if (P0() != false) goto L262;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g1(androidx.recyclerview.widget.RecyclerView.t r17, androidx.recyclerview.widget.RecyclerView.y r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.g1(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y, boolean):void");
    }

    public final boolean h1(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f4348t == 0) {
            if (i10 == -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.f4352x) {
                return true;
            }
            return false;
        }
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == this.f4352x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 == e1()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void i0(int i10, int i11) {
        c1(i10, i11, 1);
    }

    public final void i1(int i10, RecyclerView.y yVar) {
        int Y0;
        int i11;
        if (i10 > 0) {
            Y0 = Z0();
            i11 = 1;
        } else {
            Y0 = Y0();
            i11 = -1;
        }
        u uVar = this.f4350v;
        uVar.f4600a = true;
        p1(Y0, yVar);
        o1(i11);
        uVar.c = Y0 + uVar.f4602d;
        uVar.f4601b = Math.abs(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void j0() {
        this.B.a();
        z0();
    }

    public final void j1(RecyclerView.t tVar, u uVar) {
        int min;
        int min2;
        if (uVar.f4600a && !uVar.f4607i) {
            if (uVar.f4601b == 0) {
                if (uVar.f4603e == -1) {
                    k1(uVar.f4605g, tVar);
                    return;
                } else {
                    l1(uVar.f4604f, tVar);
                    return;
                }
            }
            int i10 = 1;
            if (uVar.f4603e == -1) {
                int i11 = uVar.f4604f;
                int i12 = this.f4345q[0].i(i11);
                while (i10 < this.f4344p) {
                    int i13 = this.f4345q[i10].i(i11);
                    if (i13 > i12) {
                        i12 = i13;
                    }
                    i10++;
                }
                int i14 = i11 - i12;
                if (i14 < 0) {
                    min2 = uVar.f4605g;
                } else {
                    min2 = uVar.f4605g - Math.min(i14, uVar.f4601b);
                }
                k1(min2, tVar);
                return;
            }
            int i15 = uVar.f4605g;
            int f10 = this.f4345q[0].f(i15);
            while (i10 < this.f4344p) {
                int f11 = this.f4345q[i10].f(i15);
                if (f11 < f10) {
                    f10 = f11;
                }
                i10++;
            }
            int i16 = f10 - uVar.f4605g;
            if (i16 < 0) {
                min = uVar.f4604f;
            } else {
                min = Math.min(i16, uVar.f4601b) + uVar.f4604f;
            }
            l1(min, tVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void k0(int i10, int i11) {
        c1(i10, i11, 8);
    }

    public final void k1(int i10, RecyclerView.t tVar) {
        for (int I = I() - 1; I >= 0; I--) {
            View H = H(I);
            if (this.f4346r.e(H) >= i10 && this.f4346r.o(H) >= i10) {
                c cVar = (c) H.getLayoutParams();
                cVar.getClass();
                if (cVar.f4362e.f4377a.size() == 1) {
                    return;
                }
                f fVar = cVar.f4362e;
                ArrayList<View> arrayList = fVar.f4377a;
                int size = arrayList.size();
                View remove = arrayList.remove(size - 1);
                c h10 = f.h(remove);
                h10.f4362e = null;
                if (h10.d() || h10.b()) {
                    fVar.f4379d -= StaggeredGridLayoutManager.this.f4346r.c(remove);
                }
                if (size == 1) {
                    fVar.f4378b = SlideAtom.USES_MASTER_SLIDE_ID;
                }
                fVar.c = SlideAtom.USES_MASTER_SLIDE_ID;
                x0(H, tVar);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void l0(int i10, int i11) {
        c1(i10, i11, 2);
    }

    public final void l1(int i10, RecyclerView.t tVar) {
        while (I() > 0) {
            View H = H(0);
            if (this.f4346r.b(H) <= i10 && this.f4346r.n(H) <= i10) {
                c cVar = (c) H.getLayoutParams();
                cVar.getClass();
                if (cVar.f4362e.f4377a.size() == 1) {
                    return;
                }
                f fVar = cVar.f4362e;
                ArrayList<View> arrayList = fVar.f4377a;
                View remove = arrayList.remove(0);
                c h10 = f.h(remove);
                h10.f4362e = null;
                if (arrayList.size() == 0) {
                    fVar.c = SlideAtom.USES_MASTER_SLIDE_ID;
                }
                if (h10.d() || h10.b()) {
                    fVar.f4379d -= StaggeredGridLayoutManager.this.f4346r.c(remove);
                }
                fVar.f4378b = SlideAtom.USES_MASTER_SLIDE_ID;
                x0(H, tVar);
            } else {
                return;
            }
        }
    }

    public final void m1() {
        if (this.f4348t != 1 && e1()) {
            this.f4352x = !this.f4351w;
        } else {
            this.f4352x = this.f4351w;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void n(String str) {
        if (this.F == null) {
            super.n(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void n0(RecyclerView recyclerView, int i10, int i11) {
        c1(i10, i11, 4);
    }

    public final int n1(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (I() == 0 || i10 == 0) {
            return 0;
        }
        i1(i10, yVar);
        u uVar = this.f4350v;
        int T0 = T0(tVar, uVar, yVar);
        if (uVar.f4601b >= T0) {
            if (i10 < 0) {
                i10 = -T0;
            } else {
                i10 = T0;
            }
        }
        this.f4346r.p(-i10);
        this.D = this.f4352x;
        uVar.f4601b = 0;
        j1(tVar, uVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void o0(RecyclerView.t tVar, RecyclerView.y yVar) {
        g1(tVar, yVar, true);
    }

    public final void o1(int i10) {
        boolean z10;
        u uVar = this.f4350v;
        uVar.f4603e = i10;
        boolean z11 = this.f4352x;
        int i11 = 1;
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            i11 = -1;
        }
        uVar.f4602d = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean p() {
        if (this.f4348t == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void p0(RecyclerView.y yVar) {
        this.f4354z = -1;
        this.A = SlideAtom.USES_MASTER_SLIDE_ID;
        this.F = null;
        this.H.a();
    }

    public final void p1(int i10, RecyclerView.y yVar) {
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        u uVar = this.f4350v;
        boolean z13 = false;
        uVar.f4601b = 0;
        uVar.c = i10;
        RecyclerView.x xVar = this.f4288e;
        if (xVar != null && xVar.f4323e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (i13 = yVar.f4331a) != -1) {
            boolean z14 = this.f4352x;
            if (i13 < i10) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z14 == z12) {
                i11 = this.f4346r.l();
                i12 = 0;
            } else {
                i12 = this.f4346r.l();
                i11 = 0;
            }
        } else {
            i11 = 0;
            i12 = 0;
        }
        RecyclerView recyclerView = this.f4286b;
        if (recyclerView != null && recyclerView.f4226g) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            uVar.f4604f = this.f4346r.k() - i12;
            uVar.f4605g = this.f4346r.g() + i11;
        } else {
            uVar.f4605g = this.f4346r.f() + i11;
            uVar.f4604f = -i12;
        }
        uVar.f4606h = false;
        uVar.f4600a = true;
        if (this.f4346r.i() == 0 && this.f4346r.f() == 0) {
            z13 = true;
        }
        uVar.f4607i = z13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean q() {
        if (this.f4348t == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void q0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.F = eVar;
            if (this.f4354z != -1) {
                eVar.f4370d = null;
                eVar.c = 0;
                eVar.f4368a = -1;
                eVar.f4369b = -1;
                eVar.f4370d = null;
                eVar.c = 0;
                eVar.f4371e = 0;
                eVar.f4372f = null;
                eVar.f4373g = null;
            }
            z0();
        }
    }

    public final void q1(f fVar, int i10, int i11) {
        int i12 = fVar.f4379d;
        int i13 = fVar.f4380e;
        if (i10 == -1) {
            int i14 = fVar.f4378b;
            if (i14 == Integer.MIN_VALUE) {
                View view = fVar.f4377a.get(0);
                c h10 = f.h(view);
                fVar.f4378b = StaggeredGridLayoutManager.this.f4346r.e(view);
                h10.getClass();
                i14 = fVar.f4378b;
            }
            if (i14 + i12 <= i11) {
                this.f4353y.set(i13, false);
                return;
            }
            return;
        }
        int i15 = fVar.c;
        if (i15 == Integer.MIN_VALUE) {
            fVar.a();
            i15 = fVar.c;
        }
        if (i15 - i12 >= i11) {
            this.f4353y.set(i13, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean r(RecyclerView.n nVar) {
        return nVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final Parcelable r0() {
        int Y0;
        View V0;
        int i10;
        int k10;
        int[] iArr;
        e eVar = this.F;
        if (eVar != null) {
            return new e(eVar);
        }
        e eVar2 = new e();
        eVar2.f4374h = this.f4351w;
        eVar2.f4375i = this.D;
        eVar2.f4376j = this.E;
        d dVar = this.B;
        if (dVar != null && (iArr = dVar.f4363a) != null) {
            eVar2.f4372f = iArr;
            eVar2.f4371e = iArr.length;
            eVar2.f4373g = dVar.f4364b;
        } else {
            eVar2.f4371e = 0;
        }
        int i11 = -1;
        if (I() > 0) {
            if (this.D) {
                Y0 = Z0();
            } else {
                Y0 = Y0();
            }
            eVar2.f4368a = Y0;
            if (this.f4352x) {
                V0 = U0(true);
            } else {
                V0 = V0(true);
            }
            if (V0 != null) {
                i11 = RecyclerView.m.P(V0);
            }
            eVar2.f4369b = i11;
            int i12 = this.f4344p;
            eVar2.c = i12;
            eVar2.f4370d = new int[i12];
            for (int i13 = 0; i13 < this.f4344p; i13++) {
                if (this.D) {
                    i10 = this.f4345q[i13].f(SlideAtom.USES_MASTER_SLIDE_ID);
                    if (i10 != Integer.MIN_VALUE) {
                        k10 = this.f4346r.g();
                        i10 -= k10;
                        eVar2.f4370d[i13] = i10;
                    } else {
                        eVar2.f4370d[i13] = i10;
                    }
                } else {
                    i10 = this.f4345q[i13].i(SlideAtom.USES_MASTER_SLIDE_ID);
                    if (i10 != Integer.MIN_VALUE) {
                        k10 = this.f4346r.k();
                        i10 -= k10;
                        eVar2.f4370d[i13] = i10;
                    } else {
                        eVar2.f4370d[i13] = i10;
                    }
                }
            }
        } else {
            eVar2.f4368a = -1;
            eVar2.f4369b = -1;
            eVar2.c = 0;
        }
        return eVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void s0(int i10) {
        if (i10 == 0) {
            P0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void t(int i10, int i11, RecyclerView.y yVar, RecyclerView.m.c cVar) {
        u uVar;
        boolean z10;
        int f10;
        int i12;
        if (this.f4348t != 0) {
            i10 = i11;
        }
        if (I() != 0 && i10 != 0) {
            i1(i10, yVar);
            int[] iArr = this.J;
            if (iArr == null || iArr.length < this.f4344p) {
                this.J = new int[this.f4344p];
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int i15 = this.f4344p;
                uVar = this.f4350v;
                if (i13 >= i15) {
                    break;
                }
                if (uVar.f4602d == -1) {
                    f10 = uVar.f4604f;
                    i12 = this.f4345q[i13].i(f10);
                } else {
                    f10 = this.f4345q[i13].f(uVar.f4605g);
                    i12 = uVar.f4605g;
                }
                int i16 = f10 - i12;
                if (i16 >= 0) {
                    this.J[i14] = i16;
                    i14++;
                }
                i13++;
            }
            Arrays.sort(this.J, 0, i14);
            for (int i17 = 0; i17 < i14; i17++) {
                int i18 = uVar.c;
                if (i18 >= 0 && i18 < yVar.b()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ((q.b) cVar).a(uVar.c, this.J[i17]);
                    uVar.c += uVar.f4602d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int v(RecyclerView.y yVar) {
        return Q0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int w(RecyclerView.y yVar) {
        return R0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int x(RecyclerView.y yVar) {
        return S0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int y(RecyclerView.y yVar) {
        return Q0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int z(RecyclerView.y yVar) {
        return R0(yVar);
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int[] f4363a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f4364b;

        public final void a() {
            int[] iArr = this.f4363a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4364b = null;
        }

        public final void b(int i10) {
            int[] iArr = this.f4363a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f4363a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int length = iArr.length;
                while (length <= i10) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f4363a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4363a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int c(int r6) {
            /*
                r5 = this;
                int[] r0 = r5.f4363a
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.length
                if (r6 < r0) goto La
                return r1
            La:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f4364b
                if (r0 != 0) goto Lf
                goto L5e
            Lf:
                r2 = 0
                if (r0 != 0) goto L13
                goto L2b
            L13:
                int r0 = r0.size()
                int r0 = r0 + r1
            L18:
                if (r0 < 0) goto L2b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f4364b
                java.lang.Object r3 = r3.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r4 = r3.f4365a
                if (r4 != r6) goto L28
                r2 = r3
                goto L2b
            L28:
                int r0 = r0 + (-1)
                goto L18
            L2b:
                if (r2 == 0) goto L32
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f4364b
                r0.remove(r2)
            L32:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f4364b
                int r0 = r0.size()
                r2 = 0
            L39:
                if (r2 >= r0) goto L4b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f4364b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r3 = r3.f4365a
                if (r3 < r6) goto L48
                goto L4c
            L48:
                int r2 = r2 + 1
                goto L39
            L4b:
                r2 = r1
            L4c:
                if (r2 == r1) goto L5e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f4364b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f4364b
                r3.remove(r2)
                int r0 = r0.f4365a
                goto L5f
            L5e:
                r0 = r1
            L5f:
                if (r0 != r1) goto L6b
                int[] r0 = r5.f4363a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r6, r2, r1)
                int[] r6 = r5.f4363a
                int r6 = r6.length
                return r6
            L6b:
                int r0 = r0 + 1
                int[] r2 = r5.f4363a
                int r2 = r2.length
                int r0 = java.lang.Math.min(r0, r2)
                int[] r2 = r5.f4363a
                java.util.Arrays.fill(r2, r6, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d.c(int):int");
        }

        public final void d(int i10, int i11) {
            int[] iArr = this.f4363a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                b(i12);
                int[] iArr2 = this.f4363a;
                System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
                Arrays.fill(this.f4363a, i10, i12, -1);
                List<a> list = this.f4364b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f4364b.get(size);
                        int i13 = aVar.f4365a;
                        if (i13 >= i10) {
                            aVar.f4365a = i13 + i11;
                        }
                    }
                }
            }
        }

        public final void e(int i10, int i11) {
            int[] iArr = this.f4363a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                b(i12);
                int[] iArr2 = this.f4363a;
                System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
                int[] iArr3 = this.f4363a;
                Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
                List<a> list = this.f4364b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f4364b.get(size);
                        int i13 = aVar.f4365a;
                        if (i13 >= i10) {
                            if (i13 < i12) {
                                this.f4364b.remove(size);
                            } else {
                                aVar.f4365a = i13 - i11;
                            }
                        }
                    }
                }
            }
        }

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0022a();

            /* renamed from: a  reason: collision with root package name */
            public int f4365a;

            /* renamed from: b  reason: collision with root package name */
            public int f4366b;
            public int[] c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f4367d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0022a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            public a(Parcel parcel) {
                this.f4365a = parcel.readInt();
                this.f4366b = parcel.readInt();
                this.f4367d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f4365a + ", mGapDir=" + this.f4366b + ", mHasUnwantedGapAfter=" + this.f4367d + ", mGapPerSpan=" + Arrays.toString(this.c) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f4365a);
                parcel.writeInt(this.f4366b);
                parcel.writeInt(this.f4367d ? 1 : 0);
                int[] iArr = this.c;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.c);
                    return;
                }
                parcel.writeInt(0);
            }

            public a() {
            }
        }
    }
}
