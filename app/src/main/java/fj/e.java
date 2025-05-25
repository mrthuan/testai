package fj;

import zh.f;
import zh.h;
import zh.k;
import zh.l;

/* compiled from: WPDocument.java */
/* loaded from: classes3.dex */
public final class e extends k {

    /* renamed from: b  reason: collision with root package name */
    public final zh.e[] f17303b;
    public final zh.e[] c;

    /* renamed from: d  reason: collision with root package name */
    public final zh.e[] f17304d;

    /* renamed from: e  reason: collision with root package name */
    public eh.b f17305e;

    public e() {
        this.f17303b = r1;
        this.c = r0;
        this.f17304d = r3;
        zh.e[] eVarArr = {new zh.e(5), new zh.e(3), new zh.e(3), new zh.e(5), new zh.e(5), new zh.e(5)};
        zh.e[] eVarArr2 = {new zh.e(100), new zh.e(3), new zh.e(3), new zh.e(5), new zh.e(5), new zh.e(5)};
        zh.e[] eVarArr3 = {new zh.e(5), new zh.e(5), new zh.e(5), new zh.e(5)};
    }

    @Override // zh.k, zh.g
    public final h a(long j10) {
        zh.e o10 = o(j10);
        if (o10 != null) {
            return o10.c(j10);
        }
        return null;
    }

    @Override // zh.k, zh.g
    public final h c(int i10) {
        zh.e m10 = m(0L);
        if (m10 != null) {
            return m10.d(i10);
        }
        return null;
    }

    @Override // zh.k, zh.g
    public final void dispose() {
        super.dispose();
        zh.e[] eVarArr = this.f17303b;
        if (eVarArr != null) {
            for (int i10 = 0; i10 < eVarArr.length; i10++) {
                zh.e eVar = eVarArr[i10];
                if (eVar != null) {
                    eVar.b();
                    eVarArr[i10] = null;
                }
            }
        }
        zh.e[] eVarArr2 = this.c;
        if (eVarArr2 != null) {
            for (int i11 = 0; i11 < eVarArr2.length; i11++) {
                zh.e eVar2 = eVarArr2[i11];
                if (eVar2 != null) {
                    eVar2.b();
                    eVarArr2[i11] = null;
                }
            }
        }
        zh.e[] eVarArr3 = this.f17304d;
        if (eVarArr3 != null) {
            for (int i12 = 0; i12 < eVarArr3.length; i12++) {
                zh.e eVar3 = eVarArr3[i12];
                if (eVar3 != null) {
                    eVar3.b();
                    eVarArr3[i12] = null;
                }
            }
        }
    }

    @Override // zh.k, zh.g
    public final int e(long j10) {
        h q5;
        if (((-1152921504606846976L) & j10) == 5764607523034234880L && (q5 = q(j10)) != null) {
            return ((l) q5).f32391e.f32384a;
        }
        zh.e m10 = m(j10);
        if (m10 != null) {
            return m10.f32384a;
        }
        return 0;
    }

    @Override // zh.k, zh.g
    public final h g(long j10) {
        h q5;
        if (((-1152921504606846976L) & j10) == 5764607523034234880L && (q5 = q(j10)) != null) {
            return ((l) q5).f32391e.c(j10);
        }
        zh.e m10 = m(j10);
        if (m10 != null) {
            return m10.c(j10);
        }
        return null;
    }

    @Override // zh.k, zh.g
    public final void h(h hVar) {
        this.f17303b[0].a(hVar);
    }

    @Override // zh.k, zh.g
    public final h i() {
        return this.f17303b[0].c(0L);
    }

    @Override // zh.k, zh.g
    public final void j(h hVar, long j10) {
        h q5;
        if (hVar.getType() == 2) {
            zh.e p10 = p(j10);
            if (p10 != null) {
                p10.a(hVar);
            }
        } else if (((-1152921504606846976L) & j10) == 5764607523034234880L && (q5 = q(j10)) != null) {
            ((l) q5).e((zh.a) hVar);
        } else {
            zh.e m10 = m(j10);
            if (m10 != null) {
                m10.a(hVar);
            }
        }
    }

    @Override // zh.k
    public final long k() {
        zh.e o10 = o(0L);
        if (o10 == null) {
            return 0L;
        }
        return o10.d(o10.f32384a - 1).a() - o10.d(0).b();
    }

    public final void l(zh.a aVar, long j10) {
        if (aVar.getType() == 1) {
            j(aVar, j10);
        }
        zh.e o10 = o(j10);
        if (o10 != null) {
            o10.a(aVar);
        }
    }

    public final zh.e m(long j10) {
        long j11 = j10 & (-1152921504606846976L);
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        zh.e[] eVarArr = this.c;
        if (i10 == 0) {
            return eVarArr[0];
        }
        if (j11 == 1152921504606846976L) {
            return eVarArr[1];
        }
        if (j11 == 2305843009213693952L) {
            return eVarArr[2];
        }
        if (j11 == 3458764513820540928L) {
            return eVarArr[3];
        }
        if (j11 == 4611686018427387904L) {
            return eVarArr[4];
        }
        if (j11 == 5764607523034234880L) {
            return eVarArr[5];
        }
        return null;
    }

    public final h n(long j10) {
        zh.e p10;
        h g10 = g(j10);
        zh.b bVar = zh.b.f32374b;
        f d10 = g10.d();
        bVar.getClass();
        int b10 = ((zh.c) d10).b((short) 4107, true);
        if (b10 == Integer.MIN_VALUE) {
            b10 = -1;
        }
        if (b10 >= 0 && (p10 = p(j10)) != null) {
            return p10.c(j10);
        }
        return g10;
    }

    public final zh.e o(long j10) {
        long j11 = j10 & (-1152921504606846976L);
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        zh.e[] eVarArr = this.f17303b;
        if (i10 == 0) {
            return eVarArr[0];
        }
        if (j11 == 1152921504606846976L) {
            return eVarArr[1];
        }
        if (j11 == 2305843009213693952L) {
            return eVarArr[2];
        }
        if (j11 == 3458764513820540928L) {
            return eVarArr[3];
        }
        if (j11 == 4611686018427387904L) {
            return eVarArr[4];
        }
        if (j11 == 5764607523034234880L) {
            return eVarArr[5];
        }
        return null;
    }

    public final zh.e p(long j10) {
        long j11 = j10 & (-1152921504606846976L);
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        zh.e[] eVarArr = this.f17304d;
        if (i10 == 0) {
            return eVarArr[0];
        }
        if (j11 == 1152921504606846976L) {
            return eVarArr[1];
        }
        if (j11 == 2305843009213693952L) {
            return eVarArr[2];
        }
        if (j11 == 5764607523034234880L) {
            return eVarArr[3];
        }
        return null;
    }

    public final h q(long j10) {
        long j11 = (j10 & 1152921500311879680L) >> 32;
        zh.e eVar = this.f17303b[5];
        if (eVar != null) {
            return eVar.d((int) j11);
        }
        return null;
    }
}
