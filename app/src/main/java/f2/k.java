package f2;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import x0.f0;
import x0.n0;

/* compiled from: Transition.java */
/* loaded from: classes.dex */
public abstract class k implements Cloneable {

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f17033v = {2, 1, 3, 4};

    /* renamed from: w  reason: collision with root package name */
    public static final a f17034w = new a();

    /* renamed from: x  reason: collision with root package name */
    public static final ThreadLocal<y.b<Animator, b>> f17035x = new ThreadLocal<>();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<r> f17045k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<r> f17046l;

    /* renamed from: s  reason: collision with root package name */
    public androidx.fragment.app.w f17053s;

    /* renamed from: t  reason: collision with root package name */
    public c f17054t;

    /* renamed from: a  reason: collision with root package name */
    public final String f17036a = getClass().getName();

    /* renamed from: b  reason: collision with root package name */
    public long f17037b = -1;
    public long c = -1;

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f17038d = null;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<Integer> f17039e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<View> f17040f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public i0.a f17041g = new i0.a(1);

    /* renamed from: h  reason: collision with root package name */
    public i0.a f17042h = new i0.a(1);

    /* renamed from: i  reason: collision with root package name */
    public p f17043i = null;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f17044j = f17033v;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<Animator> f17047m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public int f17048n = 0;

    /* renamed from: o  reason: collision with root package name */
    public boolean f17049o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f17050p = false;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<d> f17051q = null;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<Animator> f17052r = new ArrayList<>();

    /* renamed from: u  reason: collision with root package name */
    public r.d f17055u = f17034w;

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static class a extends r.d {
        @Override // r.d
        public final Path d(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final View f17056a;

        /* renamed from: b  reason: collision with root package name */
        public final String f17057b;
        public final r c;

        /* renamed from: d  reason: collision with root package name */
        public final f0 f17058d;

        /* renamed from: e  reason: collision with root package name */
        public final k f17059e;

        public b(View view, String str, k kVar, e0 e0Var, r rVar) {
            this.f17056a = view;
            this.f17057b = str;
            this.c = rVar;
            this.f17058d = e0Var;
            this.f17059e = kVar;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract Rect a();
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b();

        void c(k kVar);

        void d();

        void e();
    }

    public static void d(i0.a aVar, View view, r rVar) {
        ((y.b) aVar.f18402a).put(view, rVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (((SparseArray) aVar.f18403b).indexOfKey(id2) >= 0) {
                ((SparseArray) aVar.f18403b).put(id2, null);
            } else {
                ((SparseArray) aVar.f18403b).put(id2, view);
            }
        }
        WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
        String k10 = f0.i.k(view);
        if (k10 != null) {
            if (((y.b) aVar.f18404d).containsKey(k10)) {
                ((y.b) aVar.f18404d).put(k10, null);
            } else {
                ((y.b) aVar.f18404d).put(k10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                y.f fVar = (y.f) aVar.c;
                if (fVar.f31923a) {
                    fVar.e();
                }
                if (b.b.k(fVar.f31924b, fVar.f31925d, itemIdAtPosition) >= 0) {
                    View view2 = (View) ((y.f) aVar.c).f(itemIdAtPosition, null);
                    if (view2 != null) {
                        f0.d.r(view2, false);
                        ((y.f) aVar.c).h(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                f0.d.r(view, true);
                ((y.f) aVar.c).h(itemIdAtPosition, view);
            }
        }
    }

    public static y.b<Animator, b> q() {
        ThreadLocal<y.b<Animator, b>> threadLocal = f17035x;
        y.b<Animator, b> bVar = threadLocal.get();
        if (bVar == null) {
            y.b<Animator, b> bVar2 = new y.b<>();
            threadLocal.set(bVar2);
            return bVar2;
        }
        return bVar;
    }

    public static boolean v(r rVar, r rVar2, String str) {
        Object obj = rVar.f17075a.get(str);
        Object obj2 = rVar2.f17075a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A() {
        H();
        y.b<Animator, b> q5 = q();
        Iterator<Animator> it = this.f17052r.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (q5.containsKey(next)) {
                H();
                if (next != null) {
                    next.addListener(new l(this, q5));
                    long j10 = this.c;
                    if (j10 >= 0) {
                        next.setDuration(j10);
                    }
                    long j11 = this.f17037b;
                    if (j11 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j11);
                    }
                    TimeInterpolator timeInterpolator = this.f17038d;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new m(this));
                    next.start();
                }
            }
        }
        this.f17052r.clear();
        n();
    }

    public void B(long j10) {
        this.c = j10;
    }

    public void C(c cVar) {
        this.f17054t = cVar;
    }

    public void D(TimeInterpolator timeInterpolator) {
        this.f17038d = timeInterpolator;
    }

    public void E(r.d dVar) {
        if (dVar == null) {
            this.f17055u = f17034w;
        } else {
            this.f17055u = dVar;
        }
    }

    public void F(androidx.fragment.app.w wVar) {
        this.f17053s = wVar;
    }

    public void G(long j10) {
        this.f17037b = j10;
    }

    public final void H() {
        if (this.f17048n == 0) {
            ArrayList<d> arrayList = this.f17051q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f17051q.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((d) arrayList2.get(i10)).d();
                }
            }
            this.f17050p = false;
        }
        this.f17048n++;
    }

    public String I(String str) {
        StringBuilder k10 = a0.a.k(str);
        k10.append(getClass().getSimpleName());
        k10.append("@");
        k10.append(Integer.toHexString(hashCode()));
        k10.append(": ");
        String sb2 = k10.toString();
        if (this.c != -1) {
            sb2 = android.support.v4.media.session.h.e(a0.d.g(sb2, "dur("), this.c, ") ");
        }
        if (this.f17037b != -1) {
            sb2 = android.support.v4.media.session.h.e(a0.d.g(sb2, "dly("), this.f17037b, ") ");
        }
        if (this.f17038d != null) {
            StringBuilder g10 = a0.d.g(sb2, "interp(");
            g10.append(this.f17038d);
            g10.append(") ");
            sb2 = g10.toString();
        }
        ArrayList<Integer> arrayList = this.f17039e;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f17040f;
        if (size > 0 || arrayList2.size() > 0) {
            String c10 = a6.h.c(sb2, "tgts(");
            if (arrayList.size() > 0) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (i10 > 0) {
                        c10 = a6.h.c(c10, ", ");
                    }
                    StringBuilder k11 = a0.a.k(c10);
                    k11.append(arrayList.get(i10));
                    c10 = k11.toString();
                }
            }
            if (arrayList2.size() > 0) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (i11 > 0) {
                        c10 = a6.h.c(c10, ", ");
                    }
                    StringBuilder k12 = a0.a.k(c10);
                    k12.append(arrayList2.get(i11));
                    c10 = k12.toString();
                }
            }
            return a6.h.c(c10, ")");
        }
        return sb2;
    }

    public void a(d dVar) {
        if (this.f17051q == null) {
            this.f17051q = new ArrayList<>();
        }
        this.f17051q.add(dVar);
    }

    public void c(View view) {
        this.f17040f.add(view);
    }

    public abstract void e(r rVar);

    public final void f(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            r rVar = new r(view);
            if (z10) {
                h(rVar);
            } else {
                e(rVar);
            }
            rVar.c.add(this);
            g(rVar);
            if (z10) {
                d(this.f17041g, view, rVar);
            } else {
                d(this.f17042h, view, rVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), z10);
            }
        }
    }

    public void g(r rVar) {
        if (this.f17053s != null) {
            HashMap hashMap = rVar.f17075a;
            if (!hashMap.isEmpty()) {
                this.f17053s.z();
                String[] strArr = i.f17031e;
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < 2) {
                        if (!hashMap.containsKey(strArr[i10])) {
                            break;
                        }
                        i10++;
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    this.f17053s.y(rVar);
                }
            }
        }
    }

    public abstract void h(r rVar);

    public final void i(ViewGroup viewGroup, boolean z10) {
        j(z10);
        ArrayList<Integer> arrayList = this.f17039e;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f17040f;
        if (size <= 0 && arrayList2.size() <= 0) {
            f(viewGroup, z10);
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View findViewById = viewGroup.findViewById(arrayList.get(i10).intValue());
            if (findViewById != null) {
                r rVar = new r(findViewById);
                if (z10) {
                    h(rVar);
                } else {
                    e(rVar);
                }
                rVar.c.add(this);
                g(rVar);
                if (z10) {
                    d(this.f17041g, findViewById, rVar);
                } else {
                    d(this.f17042h, findViewById, rVar);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            View view = arrayList2.get(i11);
            r rVar2 = new r(view);
            if (z10) {
                h(rVar2);
            } else {
                e(rVar2);
            }
            rVar2.c.add(this);
            g(rVar2);
            if (z10) {
                d(this.f17041g, view, rVar2);
            } else {
                d(this.f17042h, view, rVar2);
            }
        }
    }

    public final void j(boolean z10) {
        if (z10) {
            ((y.b) this.f17041g.f18402a).clear();
            ((SparseArray) this.f17041g.f18403b).clear();
            ((y.f) this.f17041g.c).c();
            return;
        }
        ((y.b) this.f17042h.f18402a).clear();
        ((SparseArray) this.f17042h.f18403b).clear();
        ((y.f) this.f17042h.c).c();
    }

    @Override // 
    /* renamed from: k */
    public k clone() {
        try {
            k kVar = (k) super.clone();
            kVar.f17052r = new ArrayList<>();
            kVar.f17041g = new i0.a(1);
            kVar.f17042h = new i0.a(1);
            kVar.f17045k = null;
            kVar.f17046l = null;
            return kVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator l(ViewGroup viewGroup, r rVar, r rVar2) {
        return null;
    }

    public void m(ViewGroup viewGroup, i0.a aVar, i0.a aVar2, ArrayList<r> arrayList, ArrayList<r> arrayList2) {
        boolean z10;
        Animator l10;
        int i10;
        View view;
        Animator animator;
        r rVar;
        Animator animator2;
        r rVar2;
        y.b<Animator, b> q5 = q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        int i11 = 0;
        while (i11 < size) {
            r rVar3 = arrayList.get(i11);
            r rVar4 = arrayList2.get(i11);
            if (rVar3 != null && !rVar3.c.contains(this)) {
                rVar3 = null;
            }
            if (rVar4 != null && !rVar4.c.contains(this)) {
                rVar4 = null;
            }
            if (rVar3 != null || rVar4 != null) {
                if (rVar3 != null && rVar4 != null && !t(rVar3, rVar4)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10 && (l10 = l(viewGroup, rVar3, rVar4)) != null) {
                    if (rVar4 != null) {
                        String[] r4 = r();
                        view = rVar4.f17076b;
                        if (r4 != null && r4.length > 0) {
                            r rVar5 = new r(view);
                            i10 = size;
                            r rVar6 = (r) ((y.b) aVar2.f18402a).getOrDefault(view, null);
                            if (rVar6 != null) {
                                int i12 = 0;
                                while (i12 < r4.length) {
                                    HashMap hashMap = rVar5.f17075a;
                                    String str = r4[i12];
                                    hashMap.put(str, rVar6.f17075a.get(str));
                                    i12++;
                                    r4 = r4;
                                }
                            }
                            int i13 = q5.c;
                            int i14 = 0;
                            while (true) {
                                if (i14 < i13) {
                                    b orDefault = q5.getOrDefault(q5.h(i14), null);
                                    if (orDefault.c != null && orDefault.f17056a == view && orDefault.f17057b.equals(this.f17036a) && orDefault.c.equals(rVar5)) {
                                        rVar2 = rVar5;
                                        animator2 = null;
                                        break;
                                    }
                                    i14++;
                                } else {
                                    rVar2 = rVar5;
                                    animator2 = l10;
                                    break;
                                }
                            }
                        } else {
                            i10 = size;
                            animator2 = l10;
                            rVar2 = null;
                        }
                        animator = animator2;
                        rVar = rVar2;
                    } else {
                        i10 = size;
                        view = rVar3.f17076b;
                        animator = l10;
                        rVar = null;
                    }
                    if (animator != null) {
                        androidx.fragment.app.w wVar = this.f17053s;
                        if (wVar != null) {
                            long A = wVar.A(viewGroup, this, rVar3, rVar4);
                            sparseIntArray.put(this.f17052r.size(), (int) A);
                            j10 = Math.min(A, j10);
                        }
                        long j11 = j10;
                        String str2 = this.f17036a;
                        a0 a0Var = w.f17090a;
                        q5.put(animator, new b(view, str2, this, new e0(viewGroup), rVar));
                        this.f17052r.add(animator);
                        j10 = j11;
                    }
                    i11++;
                    size = i10;
                }
            }
            i10 = size;
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                Animator animator3 = this.f17052r.get(sparseIntArray.keyAt(i15));
                animator3.setStartDelay(animator3.getStartDelay() + (sparseIntArray.valueAt(i15) - j10));
            }
        }
    }

    public final void n() {
        int i10 = this.f17048n - 1;
        this.f17048n = i10;
        if (i10 == 0) {
            ArrayList<d> arrayList = this.f17051q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f17051q.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((d) arrayList2.get(i11)).c(this);
                }
            }
            for (int i12 = 0; i12 < ((y.f) this.f17041g.c).j(); i12++) {
                View view = (View) ((y.f) this.f17041g.c).k(i12);
                if (view != null) {
                    WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
                    f0.d.r(view, false);
                }
            }
            for (int i13 = 0; i13 < ((y.f) this.f17042h.c).j(); i13++) {
                View view2 = (View) ((y.f) this.f17042h.c).k(i13);
                if (view2 != null) {
                    WeakHashMap<View, n0> weakHashMap2 = x0.f0.f31435a;
                    f0.d.r(view2, false);
                }
            }
            this.f17050p = true;
        }
    }

    public void o(ViewGroup viewGroup) {
        boolean z10;
        y.b<Animator, b> q5 = q();
        int i10 = q5.c;
        if (viewGroup != null && i10 != 0) {
            a0 a0Var = w.f17090a;
            WindowId windowId = viewGroup.getWindowId();
            y.b bVar = new y.b(q5);
            q5.clear();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                b bVar2 = (b) bVar.l(i11);
                if (bVar2.f17056a != null) {
                    f0 f0Var = bVar2.f17058d;
                    if ((f0Var instanceof e0) && ((e0) f0Var).f17021a.equals(windowId)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        ((Animator) bVar.h(i11)).end();
                    }
                }
            }
        }
    }

    public final r p(View view, boolean z10) {
        ArrayList<r> arrayList;
        ArrayList<r> arrayList2;
        p pVar = this.f17043i;
        if (pVar != null) {
            return pVar.p(view, z10);
        }
        if (z10) {
            arrayList = this.f17045k;
        } else {
            arrayList = this.f17046l;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                r rVar = arrayList.get(i10);
                if (rVar == null) {
                    return null;
                }
                if (rVar.f17076b == view) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0) {
            return null;
        }
        if (z10) {
            arrayList2 = this.f17046l;
        } else {
            arrayList2 = this.f17045k;
        }
        return arrayList2.get(i10);
    }

    public String[] r() {
        return null;
    }

    public final r s(View view, boolean z10) {
        i0.a aVar;
        p pVar = this.f17043i;
        if (pVar != null) {
            return pVar.s(view, z10);
        }
        if (z10) {
            aVar = this.f17041g;
        } else {
            aVar = this.f17042h;
        }
        return (r) ((y.b) aVar.f18402a).getOrDefault(view, null);
    }

    public boolean t(r rVar, r rVar2) {
        if (rVar == null || rVar2 == null) {
            return false;
        }
        String[] r4 = r();
        if (r4 != null) {
            for (String str : r4) {
                if (!v(rVar, rVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : rVar.f17075a.keySet()) {
            if (v(rVar, rVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public final String toString() {
        return I("");
    }

    public final boolean u(View view) {
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f17039e;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f17040f;
        if ((size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id2)) || arrayList2.contains(view)) {
            return true;
        }
        return false;
    }

    public void w(View view) {
        int i10;
        if (!this.f17050p) {
            y.b<Animator, b> q5 = q();
            int i11 = q5.c;
            a0 a0Var = w.f17090a;
            WindowId windowId = view.getWindowId();
            int i12 = i11 - 1;
            while (true) {
                i10 = 0;
                if (i12 < 0) {
                    break;
                }
                b l10 = q5.l(i12);
                if (l10.f17056a != null) {
                    f0 f0Var = l10.f17058d;
                    if ((f0Var instanceof e0) && ((e0) f0Var).f17021a.equals(windowId)) {
                        i10 = 1;
                    }
                    if (i10 != 0) {
                        q5.h(i12).pause();
                    }
                }
                i12--;
            }
            ArrayList<d> arrayList = this.f17051q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f17051q.clone();
                int size = arrayList2.size();
                while (i10 < size) {
                    ((d) arrayList2.get(i10)).a();
                    i10++;
                }
            }
            this.f17049o = true;
        }
    }

    public void x(d dVar) {
        ArrayList<d> arrayList = this.f17051q;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(dVar);
        if (this.f17051q.size() == 0) {
            this.f17051q = null;
        }
    }

    public void y(View view) {
        this.f17040f.remove(view);
    }

    public void z(ViewGroup viewGroup) {
        boolean z10;
        if (this.f17049o) {
            if (!this.f17050p) {
                y.b<Animator, b> q5 = q();
                int i10 = q5.c;
                a0 a0Var = w.f17090a;
                WindowId windowId = viewGroup.getWindowId();
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    b l10 = q5.l(i11);
                    if (l10.f17056a != null) {
                        f0 f0Var = l10.f17058d;
                        if ((f0Var instanceof e0) && ((e0) f0Var).f17021a.equals(windowId)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            q5.h(i11).resume();
                        }
                    }
                }
                ArrayList<d> arrayList = this.f17051q;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f17051q.clone();
                    int size = arrayList2.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((d) arrayList2.get(i12)).e();
                    }
                }
            }
            this.f17049o = false;
        }
    }
}
