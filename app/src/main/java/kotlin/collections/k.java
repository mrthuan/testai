package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: ReversedViews.kt */
/* loaded from: classes.dex */
public class k extends j {
    public static final void k0(Iterable elements, ArrayList arrayList) {
        kotlin.jvm.internal.g.e(elements, "elements");
        if (elements instanceof Collection) {
            arrayList.addAll((Collection) elements);
            return;
        }
        for (Object obj : elements) {
            arrayList.add(obj);
        }
    }

    public static final boolean l0(Iterable iterable, cg.l lVar, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static final void m0(List list, cg.l lVar) {
        int A;
        kotlin.jvm.internal.g.e(list, "<this>");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof dg.a) && !(list instanceof dg.b)) {
                kotlin.jvm.internal.k.d(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                l0(list, lVar, true);
                return;
            } catch (ClassCastException e10) {
                kotlin.jvm.internal.g.g(kotlin.jvm.internal.k.class.getName(), e10);
                throw e10;
            }
        }
        int i10 = 0;
        hg.b it = new hg.c(0, ge.a.A(list)).iterator();
        while (it.c) {
            int a10 = it.a();
            Object obj = list.get(a10);
            if (!((Boolean) lVar.invoke(obj)).booleanValue()) {
                if (i10 != a10) {
                    list.set(i10, obj);
                }
                i10++;
            }
        }
        if (i10 >= list.size() || i10 > (A = ge.a.A(list))) {
            return;
        }
        while (true) {
            list.remove(A);
            if (A != i10) {
                A--;
            } else {
                return;
            }
        }
    }
}
