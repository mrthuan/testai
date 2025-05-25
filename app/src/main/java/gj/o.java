package gj;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Vector;

/* compiled from: TableLayoutKit.java */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public boolean f17866a;

    /* renamed from: b  reason: collision with root package name */
    public short f17867b;
    public fj.c c;

    /* renamed from: d  reason: collision with root package name */
    public m f17868d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f17869e;

    /* renamed from: f  reason: collision with root package name */
    public final ai.i f17870f;

    /* renamed from: g  reason: collision with root package name */
    public final Vector<c> f17871g = new Vector<>();

    public o(ai.i iVar) {
        this.f17870f = new ai.i();
        if (iVar == null) {
            this.f17870f = new ai.i();
        } else {
            ai.i clone = iVar.clone();
            this.f17870f = clone;
            clone.f548l = true;
        }
        this.f17869e = new LinkedHashMap();
    }

    public static boolean c(m mVar) {
        for (ai.e eVar = mVar.f490m; eVar != null; eVar = eVar.o()) {
            if (eVar.a() != eVar.r().a() && eVar.getWidth() > 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        this.f17867b = (short) 0;
        this.c = null;
        this.f17869e.clear();
        this.f17868d = null;
    }

    public final void b(zh.h hVar) {
        Vector vector = new Vector();
        LinkedHashMap linkedHashMap = this.f17869e;
        for (Integer num : linkedHashMap.keySet()) {
            b bVar = (b) linkedHashMap.get(num);
            if (bVar.f17812a.f32371a >= hVar.b() && bVar.f17812a.f32372b <= hVar.a()) {
                vector.add(num);
            }
        }
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((Integer) it.next());
        }
    }

    public final void d(c cVar) {
        if (this.f17870f.f542f == 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        for (ai.e eVar = cVar.f490m; eVar != null; eVar = eVar.o()) {
            i11 += eVar.e((byte) 1);
        }
        int e10 = cVar.e((byte) 1) - i11;
        zh.b bVar = zh.b.f32374b;
        zh.f d10 = cVar.f479a.d();
        bVar.getClass();
        int b10 = ((zh.c) d10).b((short) 12304, true);
        if (b10 != Integer.MIN_VALUE) {
            i10 = b10;
        }
        if (i10 == 1 || i10 == 2) {
            if (i10 == 1) {
                e10 /= 2;
            }
            for (ai.e eVar2 = cVar.f490m; eVar2 != null; eVar2 = eVar2.o()) {
                eVar2.v(eVar2.getY() + e10);
            }
        }
    }

    public final void e(m mVar, fj.c cVar, boolean z10) {
        boolean z11;
        if (mVar == null) {
            return;
        }
        int e10 = mVar.e((byte) 1) + mVar.c;
        Vector<c> vector = this.f17871g;
        if (z10) {
            Iterator<c> it = vector.iterator();
            while (it.hasNext()) {
                c next = it.next();
                ai.e eVar = next.f489l;
                if (eVar != null) {
                    next.f482e = e10 - eVar.getY();
                    d(next);
                }
            }
            vector.clear();
            return;
        }
        Iterator<c> it2 = vector.iterator();
        while (it2.hasNext()) {
            c next2 = it2.next();
            e10 = Math.max(e10, next2.e((byte) 1) + next2.f489l.getY());
        }
        Vector vector2 = new Vector();
        Iterator<c> it3 = vector.iterator();
        while (it3.hasNext()) {
            c next3 = it3.next();
            zh.h d10 = cVar.f17299e.d(next3.f17816r);
            if (d10 != null) {
                zh.b bVar = zh.b.f32374b;
                zh.f d11 = d10.d();
                bVar.getClass();
                int b10 = ((zh.c) d11).b((short) 12303, true);
                boolean z12 = false;
                if (b10 != Integer.MIN_VALUE && b10 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    int b11 = ((zh.c) d10.d()).b((short) 12302, true);
                    if (b11 != Integer.MIN_VALUE && b11 == 1) {
                        z12 = true;
                    }
                    if (z12) {
                    }
                }
                if (next3.f489l.getY() + next3.e((byte) 1) < e10) {
                    next3.f482e = e10 - next3.f489l.getY();
                    d(next3);
                } else {
                    mVar.f482e = e10 - mVar.c;
                    for (c cVar2 = (c) mVar.f490m; cVar2 != null; cVar2 = (c) cVar2.f492o) {
                        if (!cVar2.f17815q) {
                            int i10 = cVar2.f482e;
                            int y10 = e10 - cVar2.f489l.getY();
                            cVar2.f482e = y10;
                            if (i10 != y10) {
                                d(cVar2);
                            }
                        }
                    }
                }
                vector2.add(next3);
            }
        }
        Iterator it4 = vector2.iterator();
        while (it4.hasNext()) {
            c cVar3 = (c) it4.next();
            if (cVar3.e((byte) 1) + cVar3.f489l.getY() > mVar.e((byte) 1) + mVar.c) {
                cVar3.f482e = (mVar.e((byte) 1) + mVar.c) - cVar3.c;
            }
            vector.remove(cVar3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0437, code lost:
        r62 = r79;
        r67 = r84;
        r14 = r3;
        r83 = r4;
        r80 = r7;
        r0 = r8;
        r65 = r9;
        r63 = r26;
        r26 = r36;
        r24 = r37;
        r66 = r38;
        r18 = r39;
        r27 = r40;
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0450, code lost:
        r40 = r6;
        r36 = r29;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x05d2, code lost:
        r9 = r2;
        r63 = r4;
        r4 = r6;
        r5 = r13;
        r21 = r14;
        r25 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x05dd, code lost:
        r1 = r19;
        r11 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        r12 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0437 A[ADDED_TO_REGION, EDGE_INSN: B:211:0x0437->B:118:0x0437 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(lib.zj.office.system.f r72, zh.g r73, ai.d r74, ai.c r75, ai.f r76, ai.g r77, gj.p r78, long r79, int r81, int r82, int r83, boolean r84) {
        /*
            Method dump skipped, instructions count: 1581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gj.o.f(lib.zj.office.system.f, zh.g, ai.d, ai.c, ai.f, ai.g, gj.p, long, int, int, int, boolean):int");
    }
}
