package f2;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import f2.k;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionSet.java */
/* loaded from: classes.dex */
public class p extends k {
    public int A;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<k> f17069y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public boolean f17070z = true;
    public boolean B = false;
    public int C = 0;

    /* compiled from: TransitionSet.java */
    /* loaded from: classes.dex */
    public class a extends n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f17071a;

        public a(k kVar) {
            this.f17071a = kVar;
        }

        @Override // f2.k.d
        public final void c(k kVar) {
            this.f17071a.A();
            kVar.x(this);
        }
    }

    /* compiled from: TransitionSet.java */
    /* loaded from: classes.dex */
    public static class b extends n {

        /* renamed from: a  reason: collision with root package name */
        public final p f17072a;

        public b(p pVar) {
            this.f17072a = pVar;
        }

        @Override // f2.k.d
        public final void c(k kVar) {
            p pVar = this.f17072a;
            int i10 = pVar.A - 1;
            pVar.A = i10;
            if (i10 == 0) {
                pVar.B = false;
                pVar.n();
            }
            kVar.x(this);
        }

        @Override // f2.n, f2.k.d
        public final void d() {
            p pVar = this.f17072a;
            if (!pVar.B) {
                pVar.H();
                pVar.B = true;
            }
        }
    }

    @Override // f2.k
    public final void A() {
        if (this.f17069y.isEmpty()) {
            H();
            n();
            return;
        }
        b bVar = new b(this);
        Iterator<k> it = this.f17069y.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.A = this.f17069y.size();
        if (!this.f17070z) {
            for (int i10 = 1; i10 < this.f17069y.size(); i10++) {
                this.f17069y.get(i10 - 1).a(new a(this.f17069y.get(i10)));
            }
            k kVar = this.f17069y.get(0);
            if (kVar != null) {
                kVar.A();
                return;
            }
            return;
        }
        Iterator<k> it2 = this.f17069y.iterator();
        while (it2.hasNext()) {
            it2.next().A();
        }
    }

    @Override // f2.k
    public final void C(k.c cVar) {
        this.f17054t = cVar;
        this.C |= 8;
        int size = this.f17069y.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f17069y.get(i10).C(cVar);
        }
    }

    @Override // f2.k
    public final void E(r.d dVar) {
        super.E(dVar);
        this.C |= 4;
        if (this.f17069y != null) {
            for (int i10 = 0; i10 < this.f17069y.size(); i10++) {
                this.f17069y.get(i10).E(dVar);
            }
        }
    }

    @Override // f2.k
    public final void F(androidx.fragment.app.w wVar) {
        this.f17053s = wVar;
        this.C |= 2;
        int size = this.f17069y.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f17069y.get(i10).F(wVar);
        }
    }

    @Override // f2.k
    public final void G(long j10) {
        this.f17037b = j10;
    }

    @Override // f2.k
    public final String I(String str) {
        String I = super.I(str);
        for (int i10 = 0; i10 < this.f17069y.size(); i10++) {
            StringBuilder g10 = a0.d.g(I, "\n");
            g10.append(this.f17069y.get(i10).I(str + "  "));
            I = g10.toString();
        }
        return I;
    }

    public final void J(k kVar) {
        this.f17069y.add(kVar);
        kVar.f17043i = this;
        long j10 = this.c;
        if (j10 >= 0) {
            kVar.B(j10);
        }
        if ((this.C & 1) != 0) {
            kVar.D(this.f17038d);
        }
        if ((this.C & 2) != 0) {
            kVar.F(this.f17053s);
        }
        if ((this.C & 4) != 0) {
            kVar.E(this.f17055u);
        }
        if ((this.C & 8) != 0) {
            kVar.C(this.f17054t);
        }
    }

    @Override // f2.k
    /* renamed from: K */
    public final void B(long j10) {
        ArrayList<k> arrayList;
        this.c = j10;
        if (j10 >= 0 && (arrayList = this.f17069y) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f17069y.get(i10).B(j10);
            }
        }
    }

    @Override // f2.k
    /* renamed from: L */
    public final void D(TimeInterpolator timeInterpolator) {
        this.C |= 1;
        ArrayList<k> arrayList = this.f17069y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f17069y.get(i10).D(timeInterpolator);
            }
        }
        this.f17038d = timeInterpolator;
    }

    public final void M(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                this.f17070z = false;
                return;
            }
            throw new AndroidRuntimeException(b.a.c("Invalid parameter for TransitionSet ordering: ", i10));
        }
        this.f17070z = true;
    }

    @Override // f2.k
    public final void a(k.d dVar) {
        super.a(dVar);
    }

    @Override // f2.k
    public final void c(View view) {
        for (int i10 = 0; i10 < this.f17069y.size(); i10++) {
            this.f17069y.get(i10).c(view);
        }
        this.f17040f.add(view);
    }

    @Override // f2.k
    public final void e(r rVar) {
        View view = rVar.f17076b;
        if (u(view)) {
            Iterator<k> it = this.f17069y.iterator();
            while (it.hasNext()) {
                k next = it.next();
                if (next.u(view)) {
                    next.e(rVar);
                    rVar.c.add(next);
                }
            }
        }
    }

    @Override // f2.k
    public final void g(r rVar) {
        super.g(rVar);
        int size = this.f17069y.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f17069y.get(i10).g(rVar);
        }
    }

    @Override // f2.k
    public final void h(r rVar) {
        View view = rVar.f17076b;
        if (u(view)) {
            Iterator<k> it = this.f17069y.iterator();
            while (it.hasNext()) {
                k next = it.next();
                if (next.u(view)) {
                    next.h(rVar);
                    rVar.c.add(next);
                }
            }
        }
    }

    @Override // f2.k
    /* renamed from: k */
    public final k clone() {
        p pVar = (p) super.clone();
        pVar.f17069y = new ArrayList<>();
        int size = this.f17069y.size();
        for (int i10 = 0; i10 < size; i10++) {
            k clone = this.f17069y.get(i10).clone();
            pVar.f17069y.add(clone);
            clone.f17043i = pVar;
        }
        return pVar;
    }

    @Override // f2.k
    public final void m(ViewGroup viewGroup, i0.a aVar, i0.a aVar2, ArrayList<r> arrayList, ArrayList<r> arrayList2) {
        long j10 = this.f17037b;
        int size = this.f17069y.size();
        for (int i10 = 0; i10 < size; i10++) {
            k kVar = this.f17069y.get(i10);
            if (j10 > 0 && (this.f17070z || i10 == 0)) {
                long j11 = kVar.f17037b;
                if (j11 > 0) {
                    kVar.G(j11 + j10);
                } else {
                    kVar.G(j10);
                }
            }
            kVar.m(viewGroup, aVar, aVar2, arrayList, arrayList2);
        }
    }

    @Override // f2.k
    public final void o(ViewGroup viewGroup) {
        super.o(viewGroup);
        int size = this.f17069y.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f17069y.get(i10).o(viewGroup);
        }
    }

    @Override // f2.k
    public final void w(View view) {
        super.w(view);
        int size = this.f17069y.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f17069y.get(i10).w(view);
        }
    }

    @Override // f2.k
    public final void x(k.d dVar) {
        super.x(dVar);
    }

    @Override // f2.k
    public final void y(View view) {
        for (int i10 = 0; i10 < this.f17069y.size(); i10++) {
            this.f17069y.get(i10).y(view);
        }
        this.f17040f.remove(view);
    }

    @Override // f2.k
    public final void z(ViewGroup viewGroup) {
        super.z(viewGroup);
        int size = this.f17069y.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f17069y.get(i10).z(viewGroup);
        }
    }
}
