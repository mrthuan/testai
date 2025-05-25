package lib.zj.office.java.awt.geom;

import java.util.Comparator;
import java.util.Enumeration;
import java.util.Vector;

/* compiled from: AreaOp.java */
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f20744a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final lib.zj.office.java.awt.geom.f[] f20745b = new lib.zj.office.java.awt.geom.f[2];
    public static final lib.zj.office.java.awt.geom.d[] c = new lib.zj.office.java.awt.geom.d[2];

    /* compiled from: AreaOp.java */
    /* loaded from: classes3.dex */
    public class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            lib.zj.office.java.awt.geom.e eVar = ((h) obj).f20759a;
            lib.zj.office.java.awt.geom.e eVar2 = ((h) obj2).f20759a;
            double v10 = eVar.v();
            double v11 = eVar2.v();
            if (v10 == v11) {
                v10 = eVar.r();
                v11 = eVar2.r();
                if (v10 == v11) {
                    return 0;
                }
            }
            if (v10 < v11) {
                return -1;
            }
            return 1;
        }
    }

    /* compiled from: AreaOp.java */
    /* loaded from: classes3.dex */
    public static abstract class b extends c {

        /* renamed from: d  reason: collision with root package name */
        public boolean f20746d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f20747e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f20748f;

        @Override // lib.zj.office.java.awt.geom.c
        public final int c(h hVar) {
            if (hVar.f20760b == 0) {
                this.f20746d = !this.f20746d;
            } else {
                this.f20747e = !this.f20747e;
            }
            boolean g10 = g(this.f20746d, this.f20747e);
            if (this.f20748f == g10) {
                return 0;
            }
            this.f20748f = g10;
            if (g10) {
                return 1;
            }
            return -1;
        }

        @Override // lib.zj.office.java.awt.geom.c
        public final int e() {
            if (this.f20748f) {
                return 1;
            }
            return -1;
        }

        @Override // lib.zj.office.java.awt.geom.c
        public final void f() {
            this.f20746d = false;
            this.f20747e = false;
            this.f20748f = false;
        }

        public abstract boolean g(boolean z10, boolean z11);
    }

    /* compiled from: AreaOp.java */
    /* renamed from: lib.zj.office.java.awt.geom.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0281c extends c {

        /* renamed from: d  reason: collision with root package name */
        public boolean f20749d;

        @Override // lib.zj.office.java.awt.geom.c
        public final int c(h hVar) {
            boolean z10 = !this.f20749d;
            this.f20749d = z10;
            if (z10) {
                return 1;
            }
            return -1;
        }

        @Override // lib.zj.office.java.awt.geom.c
        public final int e() {
            if (this.f20749d) {
                return 1;
            }
            return -1;
        }

        @Override // lib.zj.office.java.awt.geom.c
        public final void f() {
            this.f20749d = false;
        }
    }

    /* compiled from: AreaOp.java */
    /* loaded from: classes3.dex */
    public static class d extends c {

        /* renamed from: d  reason: collision with root package name */
        public int f20750d;

        @Override // lib.zj.office.java.awt.geom.c
        public final int c(h hVar) {
            int i10;
            int i11 = this.f20750d;
            if (i11 == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            int i12 = i11 + hVar.f20759a.f20754a;
            this.f20750d = i12;
            if (i12 == 0) {
                return -1;
            }
            return i10;
        }

        @Override // lib.zj.office.java.awt.geom.c
        public final int e() {
            if (this.f20750d == 0) {
                return -1;
            }
            return 1;
        }

        @Override // lib.zj.office.java.awt.geom.c
        public final void f() {
            this.f20750d = 0;
        }
    }

    /* compiled from: AreaOp.java */
    /* loaded from: classes3.dex */
    public static class e extends b {
        @Override // lib.zj.office.java.awt.geom.c.b
        public final boolean g(boolean z10, boolean z11) {
            if (z10 && !z11) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: AreaOp.java */
    /* loaded from: classes3.dex */
    public static class f extends b {
        @Override // lib.zj.office.java.awt.geom.c.b
        public final boolean g(boolean z10, boolean z11) {
            if (z10 != z11) {
                return true;
            }
            return false;
        }
    }

    public static void a(Vector vector, Vector vector2, int i10) {
        Enumeration elements = vector2.elements();
        while (elements.hasMoreElements()) {
            lib.zj.office.java.awt.geom.e eVar = (lib.zj.office.java.awt.geom.e) elements.nextElement();
            if (eVar.j() > 0) {
                vector.add(new h(eVar, i10));
            }
        }
    }

    public static void d(Vector vector, Vector vector2) {
        int size = vector2.size();
        if (size == 0) {
            return;
        }
        if ((size & 1) == 0) {
            lib.zj.office.java.awt.geom.d[] dVarArr = new lib.zj.office.java.awt.geom.d[size];
            vector2.toArray(dVarArr);
            for (int i10 = 1; i10 < size; i10 += 2) {
                lib.zj.office.java.awt.geom.f d10 = dVarArr[i10 - 1].d(dVarArr[i10]);
                if (d10 != null) {
                    vector.add(d10);
                }
            }
            vector2.clear();
            return;
        }
        throw new InternalError("Odd number of chains!");
    }

    /* JADX WARN: Code restructure failed: missing block: B:223:0x0473, code lost:
        d(r4, r6);
        r0 = new java.util.Vector();
        r1 = r4.elements();
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0483, code lost:
        if (r1.hasMoreElements() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0485, code lost:
        r2 = (lib.zj.office.java.awt.geom.f) r1.nextElement();
        r0.add(new lib.zj.office.java.awt.geom.l(r2.f20755a.c(r2.f20756b), r2.f20756b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x049d, code lost:
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x049e, code lost:
        r3 = r3.f20758e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04a0, code lost:
        if (r3 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x04a2, code lost:
        r4 = r3.f20756b;
        r6 = r3.c;
        r9 = r2.f20755a;
        r10 = r3.f20755a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04aa, code lost:
        if (r9 != r10) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04b0, code lost:
        if (r2.f20757d != r3.f20757d) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x04b6, code lost:
        if (r2.c < r4) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04bc, code lost:
        if (r2.f20756b <= r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04c5, code lost:
        if (r4 < r10.v()) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04cd, code lost:
        if (r6 > r10.u()) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04cf, code lost:
        r2.f20756b = java.lang.Math.min(r2.f20756b, r4);
        r2.c = java.lang.Math.max(r2.c, r6);
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0504, code lost:
        throw new java.lang.InternalError("bad curvelink [" + r4 + "=>" + r6 + "] for " + r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0505, code lost:
        r4 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0507, code lost:
        if (r4 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0509, code lost:
        r0.add(r2.a());
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0512, code lost:
        r0.add(r2.a());
     */
    /* JADX WARN: Removed duplicated region for block: B:255:0x013d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Vector b(java.util.Vector r32, java.util.Vector r33) {
        /*
            Method dump skipped, instructions count: 1308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.java.awt.geom.c.b(java.util.Vector, java.util.Vector):java.util.Vector");
    }

    public abstract int c(h hVar);

    public abstract int e();

    public abstract void f();
}
