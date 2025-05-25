package ei;

import ii.e;
import java.util.HashMap;
import lib.zj.office.system.q;
import zh.l;

/* compiled from: Workbook.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public q f16624a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16625b;

    /* renamed from: j  reason: collision with root package name */
    public ji.d f16632j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f16633k;
    public final HashMap c = new HashMap(5);

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f16626d = new HashMap(20);

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f16627e = new HashMap(20);

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f16628f = new HashMap(80);

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f16629g = new HashMap(20);

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f16631i = new HashMap(20);

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f16630h = new HashMap(20);

    public d(boolean z10) {
        new HashMap();
        this.f16633k = z10;
    }

    public static boolean s(e eVar) {
        if (eVar == null) {
            return false;
        }
        if (eVar.e() <= 0 && eVar.g() <= 0 && eVar.f() <= 0 && eVar.d() <= 0 && eVar.h() == -1) {
            return false;
        }
        return true;
    }

    public final synchronized int a(int i10) {
        if (this.f16627e.containsValue(Integer.valueOf(i10))) {
            int i11 = 0;
            for (Integer num : this.f16627e.keySet()) {
                i11 = num.intValue();
                if (((Integer) this.f16627e.get(Integer.valueOf(i11))).intValue() == i10) {
                    break;
                }
            }
            return i11;
        }
        int size = this.f16627e.size() - 1;
        while (this.f16627e.get(Integer.valueOf(size)) != null) {
            size++;
        }
        this.f16627e.put(Integer.valueOf(size), Integer.valueOf(i10));
        return size;
    }

    public final synchronized void b(int i10, int i11) {
        this.f16627e.put(Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public final synchronized void c(int i10, yh.a aVar) {
        this.f16626d.put(Integer.valueOf(i10), aVar);
    }

    public final synchronized void d(int i10, String str) {
        this.f16631i.put(str, Integer.valueOf(i10));
    }

    public final synchronized int e(Object obj) {
        if (obj == null) {
            return -1;
        }
        HashMap hashMap = this.f16629g;
        hashMap.put(Integer.valueOf(hashMap.size()), obj);
        return this.f16629g.size() - 1;
    }

    public final synchronized void f(int i10, Object obj) {
        this.f16629g.put(Integer.valueOf(i10), obj);
    }

    public final synchronized void g(int i10, int i11) {
        this.f16630h.put(Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public final synchronized e h(int i10) {
        return (e) this.f16628f.get(Integer.valueOf(i10));
    }

    public final synchronized int i(int i10) {
        return j(i10, false);
    }

    public final synchronized int j(int i10, boolean z10) {
        Integer num = (Integer) this.f16627e.get(Integer.valueOf(i10));
        if (num == null && i10 >= 0 && i10 <= 7) {
            num = (Integer) this.f16627e.get(8);
        }
        if (num == null) {
            if (z10) {
                return -16777216;
            }
            return -1;
        }
        return num.intValue();
    }

    public final synchronized yh.a k(int i10) {
        return (yh.a) this.f16626d.get(Integer.valueOf(i10));
    }

    public final synchronized int l(String str) {
        Integer num = (Integer) this.f16627e.get(this.f16631i.get(str));
        if (num != null) {
            return num.intValue();
        }
        return -16777216;
    }

    public final synchronized Object m(int i10) {
        return this.f16629g.get(Integer.valueOf(i10));
    }

    public final synchronized String n(int i10) {
        String str;
        Object obj = this.f16629g.get(Integer.valueOf(i10));
        if (obj instanceof l) {
            str = ((l) obj).getText();
        } else if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        return str;
    }

    public final synchronized c o(int i10) {
        if (i10 >= 0) {
            if (i10 < this.c.size()) {
                return (c) this.c.get(Integer.valueOf(i10));
            }
        }
        return null;
    }

    public final synchronized c p(String str) {
        for (c cVar : this.c.values()) {
            if (cVar.f16612m.equals(str)) {
                return cVar;
            }
        }
        return null;
    }

    public final synchronized int q() {
        return this.c.size();
    }

    public synchronized int r(c cVar) {
        for (Integer num : this.c.keySet()) {
            int intValue = num.intValue();
            if (((c) this.c.get(Integer.valueOf(intValue))).equals(cVar)) {
                return intValue;
            }
        }
        return -1;
    }
}
