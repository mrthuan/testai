package ei;

import java.util.Hashtable;
import java.util.List;
import jf.o;

/* compiled from: Row.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public c f16594a;

    /* renamed from: b  reason: collision with root package name */
    public int f16595b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f16596d;

    /* renamed from: e  reason: collision with root package name */
    public int f16597e;

    /* renamed from: f  reason: collision with root package name */
    public float f16598f = 18.0f;

    /* renamed from: g  reason: collision with root package name */
    public final o f16599g = new o(2);

    /* renamed from: h  reason: collision with root package name */
    public final Hashtable<Integer, a> f16600h;

    public b(int i10) {
        this.c = i10;
        this.f16600h = new Hashtable<>(i10);
    }

    public final void a(a aVar) {
        int i10 = aVar.f16590d;
        this.f16600h.put(Integer.valueOf(i10), aVar);
        this.f16595b = Math.min(this.f16595b, i10);
        this.c = Math.max(this.c, i10 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r0.d() <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if ((r0.f18505e.f16571d & 16777215) == 16777215) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ei.a b(int r4, int r5) {
        /*
            r3 = this;
            ei.c r0 = r3.f16594a
            ei.d r0 = r0.f16601a
            ii.e r0 = r0.h(r4)
            if (r0 == 0) goto L51
            byte r1 = r0.h()
            if (r1 != 0) goto L1d
            r0.c()
            eh.b r1 = r0.f18505e
            int r1 = r1.f16571d
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r2
            if (r1 != r2) goto L35
        L1d:
            short r1 = r0.e()
            if (r1 > 0) goto L35
            short r1 = r0.g()
            if (r1 > 0) goto L35
            short r1 = r0.f()
            if (r1 > 0) goto L35
            short r0 = r0.d()
            if (r0 <= 0) goto L51
        L35:
            ei.a r0 = new ei.a
            r1 = 0
            r0.<init>(r1)
            r0.f16590d = r5
            int r1 = r3.f16596d
            r0.c = r1
            r0.f16591e = r4
            ei.c r4 = r3.f16594a
            r0.f16588a = r4
            java.util.Hashtable<java.lang.Integer, ei.a> r4 = r3.f16600h
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.put(r5, r0)
            goto L52
        L51:
            r0 = 0
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ei.b.b(int, int):ei.a");
    }

    public final ki.b c(int i10) {
        List list = (List) this.f16599g.f19201a.get((short) 3);
        if (list == null) {
            return null;
        }
        return (ki.b) list.get(i10);
    }

    public final boolean d() {
        Object obj = this.f16599g.f19201a.get((short) 0);
        if (obj == null) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }

    public final a e(int i10, boolean z10) {
        if (i10 < 0) {
            return null;
        }
        try {
            a aVar = this.f16600h.get(Integer.valueOf(i10));
            if (aVar == null && z10) {
                a b10 = b(this.f16597e, i10);
                if (b10 == null) {
                    return b(this.f16594a.e(i10), i10);
                }
                return b10;
            }
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void f(boolean z10) {
        this.f16599g.a((short) 2, Boolean.valueOf(z10));
    }
}
