package th;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import lh.g;
import lh.l;
import lh.m;
import lh.n;

/* compiled from: PGSlide.java */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f30035a;

    /* renamed from: b  reason: collision with root package name */
    public int f30036b;
    public int c;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f30039f;

    /* renamed from: g  reason: collision with root package name */
    public s5.a f30040g;

    /* renamed from: h  reason: collision with root package name */
    public eh.b f30041h;

    /* renamed from: j  reason: collision with root package name */
    public boolean f30043j;

    /* renamed from: k  reason: collision with root package name */
    public HashMap f30044k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f30045l;

    /* renamed from: m  reason: collision with root package name */
    public HashMap f30046m;

    /* renamed from: d  reason: collision with root package name */
    public int f30037d = -1;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f30042i = {-1, -1};

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f30038e = new ArrayList();

    public final void a(int i10, ArrayList arrayList) {
        if (this.f30044k == null) {
            this.f30044k = new HashMap();
        }
        int size = arrayList.size();
        Integer[] numArr = new Integer[size];
        arrayList.toArray(numArr);
        for (int i11 = 0; i11 < size; i11++) {
            Integer num = numArr[i11];
            if (this.f30044k.containsKey(num)) {
                arrayList.remove(num);
                arrayList.addAll((List) this.f30044k.remove(num));
            }
        }
        this.f30044k.put(Integer.valueOf(i10), arrayList);
    }

    public final void b(qh.e eVar) {
        if (this.f30045l == null) {
            this.f30045l = new ArrayList();
        }
        if (eVar != null) {
            this.f30045l.add(eVar);
        }
    }

    public final void c(lh.b bVar) {
        boolean z10;
        if (bVar == null) {
            return;
        }
        if (!this.f30035a) {
            if (bVar.getType() == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f30035a = z10;
        }
        this.f30038e.add(bVar);
    }

    public final void d() {
        eh.a aVar;
        ArrayList arrayList = this.f30039f;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f30038e;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((g) it.next()).dispose();
            }
            arrayList2.clear();
        }
        eh.b bVar = this.f30041h;
        if (bVar != null && (aVar = bVar.f16573f) != null) {
            aVar.b();
        }
        ArrayList arrayList3 = this.f30045l;
        if (arrayList3 != null) {
            arrayList3.clear();
        }
    }

    public final g e(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f30038e;
            if (i10 < arrayList.size()) {
                return (g) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final int f() {
        return this.f30038e.size();
    }

    public final int g() {
        l lVar;
        n nVar;
        if (!this.f30035a) {
            return f();
        }
        int i10 = this.f30037d;
        if (i10 > 0) {
            return i10;
        }
        this.f30039f = new ArrayList();
        Iterator it = this.f30038e.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (gVar.getType() == 6) {
                int i12 = 0;
                while (true) {
                    l[] lVarArr = ((m) gVar).f20633m;
                    if (i12 < lVarArr.length) {
                        if (i12 >= lVarArr.length) {
                            lVar = null;
                        } else {
                            lVar = lVarArr[i12];
                        }
                        if (lVar != null && (nVar = lVar.f20630e) != null) {
                            this.f30039f.add(nVar);
                            i11++;
                        }
                        i12++;
                    }
                }
            } else {
                this.f30039f.add(gVar);
                i11++;
            }
        }
        this.f30037d = i11;
        return i11;
    }

    public final g h(int i10) {
        if (!this.f30035a) {
            return e(i10);
        }
        if (i10 >= 0 && i10 < this.f30039f.size()) {
            return (g) this.f30039f.get(i10);
        }
        return null;
    }

    public final g[] i() {
        ArrayList arrayList = this.f30038e;
        return (g[]) arrayList.toArray(new g[arrayList.size()]);
    }

    public final g j(int i10) {
        ArrayList arrayList = this.f30038e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) arrayList.get(i11);
            if (gVar.getType() == 1 && gVar.g() == i10) {
                return gVar;
            }
        }
        return null;
    }
}
