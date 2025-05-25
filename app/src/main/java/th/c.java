package th;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import lib.zj.office.java.awt.Dimension;
import zh.k;

/* compiled from: PGModel.java */
/* loaded from: classes3.dex */
public final class c {
    public Dimension c;

    /* renamed from: f  reason: collision with root package name */
    public HashMap f30032f;

    /* renamed from: e  reason: collision with root package name */
    public int f30031e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final k f30028a = new k();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f30029b = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f30030d = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public int f30033g = 0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f30034h = false;

    public final int a(d dVar) {
        ArrayList arrayList = this.f30030d;
        int size = arrayList.size();
        arrayList.add(dVar);
        return size;
    }

    public final synchronized void b() {
        k kVar = this.f30028a;
        if (kVar != null) {
            kVar.dispose();
        }
        ArrayList arrayList = this.f30029b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((d) it.next()).d();
            }
            this.f30029b.clear();
        }
        ArrayList arrayList2 = this.f30030d;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((d) it2.next()).d();
            }
            this.f30030d.clear();
        }
        HashMap hashMap = this.f30032f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final int c() {
        ArrayList arrayList = this.f30029b;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final d d(int i10) {
        ArrayList arrayList = this.f30029b;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return (d) arrayList.get(i10);
    }

    public final d e(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f30030d;
            if (i10 < arrayList.size()) {
                return (d) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }
}
