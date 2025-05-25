package f2;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.w0;
import f2.k;
import java.util.ArrayList;

/* compiled from: FragmentTransitionSupport.java */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class f extends w0 {

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    public class b extends k.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f17024a;

        public b(Rect rect) {
            this.f17024a = rect;
        }

        @Override // f2.k.c
        public final Rect a() {
            Rect rect = this.f17024a;
            if (rect != null && !rect.isEmpty()) {
                return rect;
            }
            return null;
        }
    }

    @Override // androidx.fragment.app.w0
    public final void a(View view, Object obj) {
        ((k) obj).c(view);
    }

    @Override // androidx.fragment.app.w0
    public final void b(Object obj, ArrayList<View> arrayList) {
        boolean z10;
        k kVar;
        k kVar2 = (k) obj;
        if (kVar2 == null) {
            return;
        }
        int i10 = 0;
        if (kVar2 instanceof p) {
            p pVar = (p) kVar2;
            int size = pVar.f17069y.size();
            while (i10 < size) {
                if (i10 >= 0 && i10 < pVar.f17069y.size()) {
                    kVar = pVar.f17069y.get(i10);
                } else {
                    kVar = null;
                }
                b(kVar, arrayList);
                i10++;
            }
            return;
        }
        if (w0.h(kVar2.f17039e) && w0.h(null) && w0.h(null)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && w0.h(kVar2.f17040f)) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                kVar2.c(arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.w0
    public final void c(ViewGroup viewGroup, Object obj) {
        o.a(viewGroup, (k) obj);
    }

    @Override // androidx.fragment.app.w0
    public final boolean e(Object obj) {
        return obj instanceof k;
    }

    @Override // androidx.fragment.app.w0
    public final Object f(Object obj) {
        if (obj != null) {
            return ((k) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.w0
    public final Object i(Object obj, Object obj2, Object obj3) {
        k kVar = (k) obj;
        k kVar2 = (k) obj2;
        k kVar3 = (k) obj3;
        if (kVar != null && kVar2 != null) {
            p pVar = new p();
            pVar.J(kVar);
            pVar.J(kVar2);
            pVar.M(1);
            kVar = pVar;
        } else if (kVar == null) {
            if (kVar2 != null) {
                kVar = kVar2;
            } else {
                kVar = null;
            }
        }
        if (kVar3 != null) {
            p pVar2 = new p();
            if (kVar != null) {
                pVar2.J(kVar);
            }
            pVar2.J(kVar3);
            return pVar2;
        }
        return kVar;
    }

    @Override // androidx.fragment.app.w0
    public final Object j(Object obj, Object obj2) {
        p pVar = new p();
        if (obj != null) {
            pVar.J((k) obj);
        }
        pVar.J((k) obj2);
        return pVar;
    }

    @Override // androidx.fragment.app.w0
    public final void k(Object obj, View view, ArrayList<View> arrayList) {
        ((k) obj).a(new a(view, arrayList));
    }

    @Override // androidx.fragment.app.w0
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((k) obj).a(new g(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.w0
    public final void m(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            w0.g(rect, view);
            ((k) obj).C(new e(rect));
        }
    }

    @Override // androidx.fragment.app.w0
    public final void n(Object obj, Rect rect) {
        ((k) obj).C(new b(rect));
    }

    @Override // androidx.fragment.app.w0
    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        p pVar = (p) obj;
        ArrayList<View> arrayList2 = pVar.f17040f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            w0.d(arrayList.get(i10), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(pVar, arrayList);
    }

    @Override // androidx.fragment.app.w0
    public final void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        p pVar = (p) obj;
        if (pVar != null) {
            ArrayList<View> arrayList3 = pVar.f17040f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(pVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.w0
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        p pVar = new p();
        pVar.J((k) obj);
        return pVar;
    }

    public final void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        boolean z10;
        int size;
        k kVar;
        k kVar2 = (k) obj;
        int i10 = 0;
        if (kVar2 instanceof p) {
            p pVar = (p) kVar2;
            int size2 = pVar.f17069y.size();
            while (i10 < size2) {
                if (i10 >= 0 && i10 < pVar.f17069y.size()) {
                    kVar = pVar.f17069y.get(i10);
                } else {
                    kVar = null;
                }
                s(kVar, arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (w0.h(kVar2.f17039e) && w0.h(null) && w0.h(null)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            ArrayList<View> arrayList3 = kVar2.f17040f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i10 < size) {
                    kVar2.c(arrayList2.get(i10));
                    i10++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        kVar2.y(arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    public class a implements k.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f17022a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f17023b;

        public a(View view, ArrayList arrayList) {
            this.f17022a = view;
            this.f17023b = arrayList;
        }

        @Override // f2.k.d
        public final void c(k kVar) {
            kVar.x(this);
            this.f17022a.setVisibility(8);
            ArrayList arrayList = this.f17023b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) arrayList.get(i10)).setVisibility(0);
            }
        }

        @Override // f2.k.d
        public final void a() {
        }

        @Override // f2.k.d
        public final void b() {
        }

        @Override // f2.k.d
        public final void d() {
        }

        @Override // f2.k.d
        public final void e() {
        }
    }
}
