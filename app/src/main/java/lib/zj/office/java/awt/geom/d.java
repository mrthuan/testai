package lib.zj.office.java.awt.geom;

/* compiled from: ChainEnd.java */
/* loaded from: classes3.dex */
public final class d implements lib.zj.office.system.k {

    /* renamed from: a  reason: collision with root package name */
    public int f20751a;

    /* renamed from: b  reason: collision with root package name */
    public Object f20752b;
    public Object c;

    /* renamed from: d  reason: collision with root package name */
    public Object f20753d;

    public d(f fVar, d dVar) {
        this.f20752b = fVar;
        this.c = fVar;
        this.f20753d = dVar;
        this.f20751a = fVar.f20757d;
    }

    @Override // lib.zj.office.system.k
    public final void a() {
        qh.d dVar = (qh.d) this.f20752b;
        if (dVar != null && dVar.b() != 2) {
            int i10 = this.f20751a + 1;
            this.f20751a = i10;
            ((qh.d) this.f20752b).c(i10);
            ((lib.zj.office.system.f) this.f20753d).r(1342177281, null);
            pi.c cVar = (pi.c) this.c;
            if (cVar != null) {
                cVar.b();
                cVar.a();
                return;
            }
            return;
        }
        pi.c cVar2 = (pi.c) this.c;
        if (cVar2 != null) {
            cVar2.b();
        }
        if (((lib.zj.office.system.f) this.f20753d).n() != null) {
            ((lib.zj.office.system.f) this.f20753d).n().b();
        }
        ((lib.zj.office.system.f) this.f20753d).r(536870922, null);
    }

    public final void b(int i10) {
        if (((pi.c) this.c) == null) {
            this.c = new pi.c(i10, this);
        }
        qh.d dVar = (qh.d) this.f20752b;
        if (dVar != null) {
            this.f20751a = 0;
            dVar.start();
            ((pi.c) this.c).a();
            if (((lib.zj.office.system.f) this.f20753d).n() != null) {
                ((lib.zj.office.system.f) this.f20753d).n().b();
            }
        }
    }

    public final double c() {
        if (this.f20751a == 1) {
            f fVar = (f) this.c;
            return fVar.f20755a.c(fVar.c);
        }
        f fVar2 = (f) this.f20752b;
        return fVar2.f20755a.c(fVar2.c);
    }

    public final f d(d dVar) {
        int i10;
        d dVar2;
        d dVar3;
        int i11 = this.f20751a;
        if (i11 != 0 && (i10 = dVar.f20751a) != 0) {
            if (i11 != i10) {
                if (i11 == 1) {
                    dVar3 = this;
                    dVar2 = dVar;
                } else {
                    dVar2 = this;
                    dVar3 = dVar;
                }
                this.f20751a = 0;
                dVar.f20751a = 0;
                ((f) dVar3.c).f20758e = (f) dVar2.f20752b;
                f fVar = (f) dVar2.c;
                dVar3.c = fVar;
                if (((d) this.f20753d) == dVar) {
                    return (f) dVar3.f20752b;
                }
                d dVar4 = (d) dVar2.f20753d;
                d dVar5 = (d) dVar3.f20753d;
                dVar4.f20753d = dVar5;
                dVar5.f20753d = dVar4;
                Object obj = dVar3.f20752b;
                double d10 = ((f) obj).f20756b;
                Object obj2 = dVar4.f20752b;
                if (d10 < ((f) obj2).f20756b) {
                    fVar.f20758e = (f) obj2;
                    dVar4.f20752b = (f) obj;
                    return null;
                }
                ((f) dVar5.c).f20758e = (f) obj;
                dVar5.c = fVar;
                return null;
            }
            throw new InternalError("Linking chains of the same type!");
        }
        throw new InternalError("ChainEnd linked more than once!");
    }

    public final void e(qh.d dVar) {
        if (((qh.d) this.f20752b) != null) {
            Object obj = this.c;
            if (((pi.c) obj) != null && ((pi.c) obj).f28961a) {
                ((pi.c) obj).b();
                ((qh.d) this.f20752b).stop();
            }
        }
        this.f20752b = dVar;
    }

    public final void f() {
        if (((qh.d) this.f20752b) != null) {
            pi.c cVar = (pi.c) this.c;
            if (cVar != null) {
                cVar.b();
            }
            qh.d dVar = (qh.d) this.f20752b;
            if (dVar != null) {
                dVar.stop();
            }
            if (((lib.zj.office.system.f) this.f20753d).n() != null) {
                ((lib.zj.office.system.f) this.f20753d).n().b();
            }
            ((lib.zj.office.system.f) this.f20753d).r(1342177281, null);
        }
    }

    public d(lib.zj.office.system.f fVar) {
        this.f20753d = fVar;
    }
}
