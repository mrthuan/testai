package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import x0.f0;
import x0.n0;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class h extends h0 {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f4428s;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f4429h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f4430i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<e> f4431j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<d> f4432k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<ArrayList<RecyclerView.b0>> f4433l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<ArrayList<e>> f4434m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<ArrayList<d>> f4435n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f4436o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f4437p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f4438q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f4439r = new ArrayList<>();

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4440a;

        public a(ArrayList arrayList) {
            this.f4440a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f4440a;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                h hVar = h.this;
                if (hasNext) {
                    e eVar = (e) it.next();
                    RecyclerView.b0 b0Var = eVar.f4451a;
                    hVar.getClass();
                    View view = b0Var.itemView;
                    int i10 = eVar.f4453d - eVar.f4452b;
                    int i11 = eVar.f4454e - eVar.c;
                    if (i10 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i11 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    hVar.f4437p.add(b0Var);
                    animate.setDuration(hVar.f4280e).setListener(new k(hVar, b0Var, i10, view, i11, animate)).start();
                } else {
                    arrayList.clear();
                    hVar.f4434m.remove(arrayList);
                    return;
                }
            }
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4442a;

        public b(ArrayList arrayList) {
            this.f4442a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view;
            ArrayList arrayList = this.f4442a;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                h hVar = h.this;
                if (hasNext) {
                    d dVar = (d) it.next();
                    hVar.getClass();
                    RecyclerView.b0 b0Var = dVar.f4446a;
                    View view2 = null;
                    if (b0Var == null) {
                        view = null;
                    } else {
                        view = b0Var.itemView;
                    }
                    RecyclerView.b0 b0Var2 = dVar.f4447b;
                    if (b0Var2 != null) {
                        view2 = b0Var2.itemView;
                    }
                    ArrayList<RecyclerView.b0> arrayList2 = hVar.f4439r;
                    if (view != null) {
                        ViewPropertyAnimator duration = view.animate().setDuration(hVar.f4281f);
                        arrayList2.add(dVar.f4446a);
                        duration.translationX(dVar.f4449e - dVar.c);
                        duration.translationY(dVar.f4450f - dVar.f4448d);
                        duration.alpha(0.0f).setListener(new l(hVar, dVar, duration, view)).start();
                    }
                    if (view2 != null) {
                        ViewPropertyAnimator animate = view2.animate();
                        arrayList2.add(dVar.f4447b);
                        animate.translationX(0.0f).translationY(0.0f).setDuration(hVar.f4281f).alpha(1.0f).setListener(new m(hVar, dVar, animate, view2)).start();
                    }
                } else {
                    arrayList.clear();
                    hVar.f4435n.remove(arrayList);
                    return;
                }
            }
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4444a;

        public c(ArrayList arrayList) {
            this.f4444a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f4444a;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                h hVar = h.this;
                if (hasNext) {
                    RecyclerView.b0 b0Var = (RecyclerView.b0) it.next();
                    hVar.getClass();
                    View view = b0Var.itemView;
                    ViewPropertyAnimator animate = view.animate();
                    hVar.f4436o.add(b0Var);
                    animate.alpha(1.0f).setDuration(hVar.c).setListener(new j(view, animate, hVar, b0Var)).start();
                } else {
                    arrayList.clear();
                    hVar.f4433l.remove(arrayList);
                    return;
                }
            }
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.b0 f4446a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.b0 f4447b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f4448d;

        /* renamed from: e  reason: collision with root package name */
        public final int f4449e;

        /* renamed from: f  reason: collision with root package name */
        public final int f4450f;

        public d(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, int i10, int i11, int i12, int i13) {
            this.f4446a = b0Var;
            this.f4447b = b0Var2;
            this.c = i10;
            this.f4448d = i11;
            this.f4449e = i12;
            this.f4450f = i13;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeInfo{oldHolder=");
            sb2.append(this.f4446a);
            sb2.append(", newHolder=");
            sb2.append(this.f4447b);
            sb2.append(", fromX=");
            sb2.append(this.c);
            sb2.append(", fromY=");
            sb2.append(this.f4448d);
            sb2.append(", toX=");
            sb2.append(this.f4449e);
            sb2.append(", toY=");
            return androidx.activity.f.n(sb2, this.f4450f, '}');
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final RecyclerView.b0 f4451a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4452b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f4453d;

        /* renamed from: e  reason: collision with root package name */
        public final int f4454e;

        public e(RecyclerView.b0 b0Var, int i10, int i11, int i12, int i13) {
            this.f4451a = b0Var;
            this.f4452b = i10;
            this.c = i11;
            this.f4453d = i12;
            this.f4454e = i13;
        }
    }

    public static void q(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((RecyclerView.b0) arrayList.get(size)).itemView.animate().cancel();
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean g(RecyclerView.b0 b0Var, List<Object> list) {
        if (list.isEmpty() && !f(b0Var)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void i(RecyclerView.b0 b0Var) {
        View view = b0Var.itemView;
        view.animate().cancel();
        ArrayList<e> arrayList = this.f4431j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (arrayList.get(size).f4451a == b0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                h(b0Var);
                arrayList.remove(size);
            }
        }
        s(b0Var, this.f4432k);
        if (this.f4429h.remove(b0Var)) {
            view.setAlpha(1.0f);
            h(b0Var);
        }
        if (this.f4430i.remove(b0Var)) {
            view.setAlpha(1.0f);
            h(b0Var);
        }
        ArrayList<ArrayList<d>> arrayList2 = this.f4435n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<d> arrayList3 = arrayList2.get(size2);
            s(b0Var, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<e>> arrayList4 = this.f4434m;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<e> arrayList5 = arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (arrayList5.get(size4).f4451a == b0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    h(b0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.b0>> arrayList6 = this.f4433l;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList<RecyclerView.b0> arrayList7 = arrayList6.get(size5);
                if (arrayList7.remove(b0Var)) {
                    view.setAlpha(1.0f);
                    h(b0Var);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
            } else {
                this.f4438q.remove(b0Var);
                this.f4436o.remove(b0Var);
                this.f4439r.remove(b0Var);
                this.f4437p.remove(b0Var);
                r();
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void j() {
        ArrayList<e> arrayList = this.f4431j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e eVar = arrayList.get(size);
            View view = eVar.f4451a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            h(eVar.f4451a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.b0> arrayList2 = this.f4429h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            h(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.b0> arrayList3 = this.f4430i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.b0 b0Var = arrayList3.get(size3);
            b0Var.itemView.setAlpha(1.0f);
            h(b0Var);
            arrayList3.remove(size3);
        }
        ArrayList<d> arrayList4 = this.f4432k;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            d dVar = arrayList4.get(size4);
            RecyclerView.b0 b0Var2 = dVar.f4446a;
            if (b0Var2 != null) {
                t(dVar, b0Var2);
            }
            RecyclerView.b0 b0Var3 = dVar.f4447b;
            if (b0Var3 != null) {
                t(dVar, b0Var3);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList<ArrayList<e>> arrayList5 = this.f4434m;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<e> arrayList6 = arrayList5.get(size5);
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    e eVar2 = arrayList6.get(size6);
                    View view2 = eVar2.f4451a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    h(eVar2.f4451a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.b0>> arrayList7 = this.f4433l;
        int size7 = arrayList7.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.b0> arrayList8 = arrayList7.get(size7);
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.b0 b0Var4 = arrayList8.get(size8);
                    b0Var4.itemView.setAlpha(1.0f);
                    h(b0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList<ArrayList<d>> arrayList9 = this.f4435n;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                break;
            }
            ArrayList<d> arrayList10 = arrayList9.get(size9);
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    d dVar2 = arrayList10.get(size10);
                    RecyclerView.b0 b0Var5 = dVar2.f4446a;
                    if (b0Var5 != null) {
                        t(dVar2, b0Var5);
                    }
                    RecyclerView.b0 b0Var6 = dVar2.f4447b;
                    if (b0Var6 != null) {
                        t(dVar2, b0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
        q(this.f4438q);
        q(this.f4437p);
        q(this.f4436o);
        q(this.f4439r);
        ArrayList<RecyclerView.j.a> arrayList11 = this.f4278b;
        int size11 = arrayList11.size();
        for (int i10 = 0; i10 < size11; i10++) {
            arrayList11.get(i10).a();
        }
        arrayList11.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean k() {
        if (this.f4430i.isEmpty() && this.f4432k.isEmpty() && this.f4431j.isEmpty() && this.f4429h.isEmpty() && this.f4437p.isEmpty() && this.f4438q.isEmpty() && this.f4436o.isEmpty() && this.f4439r.isEmpty() && this.f4434m.isEmpty() && this.f4433l.isEmpty() && this.f4435n.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void l() {
        long j10;
        long j11;
        ArrayList<RecyclerView.b0> arrayList = this.f4429h;
        boolean z10 = !arrayList.isEmpty();
        ArrayList<e> arrayList2 = this.f4431j;
        boolean z11 = !arrayList2.isEmpty();
        ArrayList<d> arrayList3 = this.f4432k;
        boolean z12 = !arrayList3.isEmpty();
        ArrayList<RecyclerView.b0> arrayList4 = this.f4430i;
        boolean z13 = !arrayList4.isEmpty();
        if (!z10 && !z11 && !z13 && !z12) {
            return;
        }
        Iterator<RecyclerView.b0> it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            j10 = this.f4279d;
            if (!hasNext) {
                break;
            }
            RecyclerView.b0 next = it.next();
            View view = next.itemView;
            ViewPropertyAnimator animate = view.animate();
            this.f4438q.add(next);
            animate.setDuration(j10).alpha(0.0f).setListener(new i(view, animate, this, next)).start();
        }
        arrayList.clear();
        if (z11) {
            ArrayList<e> arrayList5 = new ArrayList<>();
            arrayList5.addAll(arrayList2);
            this.f4434m.add(arrayList5);
            arrayList2.clear();
            a aVar = new a(arrayList5);
            if (z10) {
                View view2 = arrayList5.get(0).f4451a.itemView;
                WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
                f0.d.n(view2, aVar, j10);
            } else {
                aVar.run();
            }
        }
        if (z12) {
            ArrayList<d> arrayList6 = new ArrayList<>();
            arrayList6.addAll(arrayList3);
            this.f4435n.add(arrayList6);
            arrayList3.clear();
            b bVar = new b(arrayList6);
            if (z10) {
                View view3 = arrayList6.get(0).f4446a.itemView;
                WeakHashMap<View, n0> weakHashMap2 = x0.f0.f31435a;
                f0.d.n(view3, bVar, j10);
            } else {
                bVar.run();
            }
        }
        if (z13) {
            ArrayList<RecyclerView.b0> arrayList7 = new ArrayList<>();
            arrayList7.addAll(arrayList4);
            this.f4433l.add(arrayList7);
            arrayList4.clear();
            c cVar = new c(arrayList7);
            if (!z10 && !z11 && !z12) {
                cVar.run();
                return;
            }
            long j12 = 0;
            if (!z10) {
                j10 = 0;
            }
            if (z11) {
                j11 = this.f4280e;
            } else {
                j11 = 0;
            }
            if (z12) {
                j12 = this.f4281f;
            }
            View view4 = arrayList7.get(0).itemView;
            WeakHashMap<View, n0> weakHashMap3 = x0.f0.f31435a;
            f0.d.n(view4, cVar, Math.max(j11, j12) + j10);
        }
    }

    @Override // androidx.recyclerview.widget.h0
    public final void m(RecyclerView.b0 b0Var) {
        u(b0Var);
        b0Var.itemView.setAlpha(0.0f);
        this.f4430i.add(b0Var);
    }

    @Override // androidx.recyclerview.widget.h0
    public final boolean n(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, int i10, int i11, int i12, int i13) {
        if (b0Var == b0Var2) {
            return o(b0Var, i10, i11, i12, i13);
        }
        float translationX = b0Var.itemView.getTranslationX();
        float translationY = b0Var.itemView.getTranslationY();
        float alpha = b0Var.itemView.getAlpha();
        u(b0Var);
        b0Var.itemView.setTranslationX(translationX);
        b0Var.itemView.setTranslationY(translationY);
        b0Var.itemView.setAlpha(alpha);
        u(b0Var2);
        b0Var2.itemView.setTranslationX(-((int) ((i12 - i10) - translationX)));
        b0Var2.itemView.setTranslationY(-((int) ((i13 - i11) - translationY)));
        b0Var2.itemView.setAlpha(0.0f);
        this.f4432k.add(new d(b0Var, b0Var2, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.h0
    public final boolean o(RecyclerView.b0 b0Var, int i10, int i11, int i12, int i13) {
        View view = b0Var.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) b0Var.itemView.getTranslationY());
        u(b0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            h(b0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f4431j.add(new e(b0Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.h0
    public final void p(RecyclerView.b0 b0Var) {
        u(b0Var);
        this.f4429h.add(b0Var);
    }

    public final void r() {
        if (!k()) {
            ArrayList<RecyclerView.j.a> arrayList = this.f4278b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.get(i10).a();
            }
            arrayList.clear();
        }
    }

    public final void s(RecyclerView.b0 b0Var, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                d dVar = (d) arrayList.get(size);
                if (t(dVar, b0Var) && dVar.f4446a == null && dVar.f4447b == null) {
                    arrayList.remove(dVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean t(d dVar, RecyclerView.b0 b0Var) {
        if (dVar.f4447b == b0Var) {
            dVar.f4447b = null;
        } else if (dVar.f4446a == b0Var) {
            dVar.f4446a = null;
        } else {
            return false;
        }
        b0Var.itemView.setAlpha(1.0f);
        b0Var.itemView.setTranslationX(0.0f);
        b0Var.itemView.setTranslationY(0.0f);
        h(b0Var);
        return true;
    }

    public final void u(RecyclerView.b0 b0Var) {
        if (f4428s == null) {
            f4428s = new ValueAnimator().getInterpolator();
        }
        b0Var.itemView.animate().setInterpolator(f4428s);
        i(b0Var);
    }
}
