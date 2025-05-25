package ei;

import ai.h;
import ii.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lh.g;
import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.ss.control.Spreadsheet;
import lib.zj.office.system.f;

/* compiled from: Sheet.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public d f16601a;

    /* renamed from: b  reason: collision with root package name */
    public int f16602b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f16603d;

    /* renamed from: e  reason: collision with root package name */
    public int f16604e;

    /* renamed from: h  reason: collision with root package name */
    public int f16607h;

    /* renamed from: i  reason: collision with root package name */
    public int f16608i;

    /* renamed from: j  reason: collision with root package name */
    public short f16609j;

    /* renamed from: m  reason: collision with root package name */
    public String f16612m;

    /* renamed from: n  reason: collision with root package name */
    public a f16613n;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f16616q;

    /* renamed from: u  reason: collision with root package name */
    public short f16620u;

    /* renamed from: v  reason: collision with root package name */
    public gi.a f16621v;

    /* renamed from: w  reason: collision with root package name */
    public ArrayList f16622w;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList f16623x;

    /* renamed from: l  reason: collision with root package name */
    public float f16611l = 2.0f;

    /* renamed from: s  reason: collision with root package name */
    public int f16618s = 18;

    /* renamed from: t  reason: collision with root package name */
    public int f16619t = 72;

    /* renamed from: k  reason: collision with root package name */
    public short f16610k = 0;

    /* renamed from: o  reason: collision with root package name */
    public final HashMap f16614o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f16615p = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public float f16605f = 2.1474836E9f;

    /* renamed from: g  reason: collision with root package name */
    public float f16606g = 2.1474836E9f;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f16617r = new ArrayList();

    public final void a(b bVar) {
        if (bVar == null) {
            return;
        }
        HashMap hashMap = this.f16614o;
        hashMap.put(Integer.valueOf(bVar.f16596d), bVar);
        if (hashMap.size() == 1) {
            int i10 = bVar.f16596d;
            this.f16602b = i10;
            this.c = i10;
            return;
        }
        this.f16602b = Math.min(this.f16602b, bVar.f16596d);
        this.c = Math.max(this.c, bVar.f16596d);
    }

    public final void b(lh.b bVar) {
        this.f16617r.add(bVar);
    }

    public final void c() {
        if (this.f16601a.f16633k) {
            this.f16603d = Math.min(this.f16603d, (int) Variant.VT_ILLEGAL);
            this.f16604e = Math.min(this.f16604e, (int) FunctionEval.FunctionID.EXTERNAL_FUNC);
            return;
        }
        this.f16603d = Math.min(this.f16603d, 1048575);
        this.f16604e = Math.min(this.f16604e, 16383);
    }

    public final float d(int i10) {
        if (this.f16616q != null) {
            int i11 = 0;
            while (i11 < this.f16616q.size()) {
                int i12 = i11 + 1;
                hi.a aVar = (hi.a) this.f16616q.get(i11);
                if (aVar.f18343a <= i10 && aVar.f18344b >= i10) {
                    return aVar.c;
                }
                i11 = i12;
            }
        }
        return this.f16619t;
    }

    public final int e(int i10) {
        if (this.f16616q != null) {
            int i11 = 0;
            while (i11 < this.f16616q.size()) {
                int i12 = i11 + 1;
                hi.a aVar = (hi.a) this.f16616q.get(i11);
                if (aVar.f18343a <= i10 && aVar.f18344b >= i10) {
                    return aVar.f18346e;
                }
                i11 = i12;
            }
        }
        return 0;
    }

    public final ci.a f(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f16615p;
            if (i10 < arrayList.size()) {
                return (ci.a) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final b g(int i10) {
        return (b) this.f16614o.get(Integer.valueOf(i10));
    }

    public final b h(int i10) {
        HashMap hashMap = this.f16614o;
        b bVar = (b) hashMap.get(Integer.valueOf(i10));
        if (bVar != null) {
            return bVar;
        }
        ArrayList arrayList = this.f16616q;
        if (arrayList != null && arrayList.size() != 0) {
            int i11 = 0;
            while (i11 < this.f16616q.size()) {
                int i12 = i11 + 1;
                e h10 = this.f16601a.h(((hi.a) this.f16616q.get(i11)).f18346e);
                if (h10 != null) {
                    if (h10.h() == 0) {
                        h10.c();
                        if ((h10.f18505e.f16571d & 16777215) != 16777215) {
                            b bVar2 = new b(1);
                            bVar2.f16596d = i10;
                            bVar2.f16598f = this.f16618s;
                            bVar2.f16594a = this;
                            bVar2.f16599g.a((short) 1, Boolean.TRUE);
                            hashMap.put(Integer.valueOf(i10), bVar2);
                            return bVar2;
                        }
                    }
                    if (h10.e() <= 0 && h10.g() <= 0 && h10.f() <= 0 && h10.d() <= 0) {
                    }
                    b bVar22 = new b(1);
                    bVar22.f16596d = i10;
                    bVar22.f16598f = this.f16618s;
                    bVar22.f16594a = this;
                    bVar22.f16599g.a((short) 1, Boolean.TRUE);
                    hashMap.put(Integer.valueOf(i10), bVar22);
                    return bVar22;
                }
                i11 = i12;
            }
            return null;
        }
        return null;
    }

    public final g i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f16617r;
            if (i10 < arrayList.size()) {
                return (g) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final synchronized short j() {
        return this.f16620u;
    }

    public final boolean k() {
        if (this.f16620u == 2) {
            return true;
        }
        return false;
    }

    public final boolean l(int i10) {
        if (this.f16616q != null) {
            int i11 = 0;
            while (i11 < this.f16616q.size()) {
                int i12 = i11 + 1;
                hi.a aVar = (hi.a) this.f16616q.get(i11);
                if (aVar.f18343a <= i10 && aVar.f18344b >= i10) {
                    return aVar.f18345d;
                }
                i11 = i12;
            }
        }
        return false;
    }

    public final void m() {
        ArrayList arrayList = this.f16622w;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                h hVar = (h) this.f16622w.get(i10);
                if (hVar != null) {
                    hVar.dispose();
                }
                i10 = i11;
            }
            this.f16622w.clear();
        }
        int i12 = this.f16602b;
        while (i12 <= this.c) {
            int i13 = i12 + 1;
            b g10 = g(i12);
            if (g10 != null && !g10.d()) {
                g10.f(false);
                for (a aVar : g10.f16600h.values()) {
                    ((Map) aVar.f16593g.f6179b).remove((short) 4);
                }
            }
            i12 = i13;
        }
    }

    public final void n(int i10, int i11) {
        this.f16610k = (short) 0;
        this.f16603d = i10;
        this.f16604e = i11;
        c();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f16615p;
            boolean z10 = true;
            if (i12 >= arrayList.size()) {
                break;
            }
            int i13 = i12 + 1;
            ci.a aVar = (ci.a) arrayList.get(i12);
            if (aVar != null) {
                int i14 = aVar.f5690a;
                if (i14 > i10 || i10 > aVar.c || aVar.f5691b > i11 || i11 > aVar.f5692d) {
                    z10 = false;
                }
                if (z10) {
                    this.f16603d = i14;
                    this.f16604e = aVar.f5691b;
                }
            }
            i12 = i13;
        }
        if (g(i10) != null) {
            this.f16613n = g(i10).e(i11, true);
        } else {
            this.f16613n = null;
        }
    }

    public final void o(short s4) {
        gi.a aVar;
        Spreadsheet spreadsheet;
        f fVar;
        this.f16620u = s4;
        if (s4 == 2 && (aVar = this.f16621v) != null && (fVar = (spreadsheet = (Spreadsheet) aVar).f20956i) != null && fVar.s().m() != null) {
            spreadsheet.post(new bi.e(spreadsheet));
        }
        this.f16605f = 0.0f;
        this.f16606g = 0.0f;
        ArrayList arrayList = this.f16616q;
        int i10 = 0;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hi.a aVar2 = (hi.a) it.next();
                int i11 = (aVar2.f18344b - aVar2.f18343a) + 1;
                i10 += i11;
                if (!aVar2.f18345d) {
                    this.f16605f = (aVar2.c * i11) + this.f16605f;
                }
            }
        }
        HashMap hashMap = this.f16614o;
        int size = hashMap.size();
        for (b bVar : hashMap.values()) {
            this.f16606g += bVar.f16598f;
        }
        if (!this.f16601a.f16633k) {
            this.f16605f += (16384 - i10) * this.f16619t;
            this.f16606g += (1048576 - size) * this.f16618s;
            return;
        }
        this.f16605f += (256 - i10) * this.f16619t;
        this.f16606g += (65536 - size) * this.f16618s;
    }
}
