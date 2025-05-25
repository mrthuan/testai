package lib.zj.office.java.awt.geom;

/* compiled from: CurveLink.java */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final e f20755a;

    /* renamed from: b  reason: collision with root package name */
    public double f20756b;
    public double c;

    /* renamed from: d  reason: collision with root package name */
    public final int f20757d;

    /* renamed from: e  reason: collision with root package name */
    public f f20758e;

    public f(e eVar, double d10, double d11, int i10) {
        this.f20755a = eVar;
        this.f20756b = d10;
        this.c = d11;
        this.f20757d = i10;
        if (d10 >= eVar.v() && this.c <= eVar.u()) {
            return;
        }
        throw new InternalError("bad curvelink [" + this.f20756b + "=>" + this.c + "] for " + eVar);
    }

    public final e a() {
        double d10 = this.f20756b;
        e eVar = this.f20755a;
        if (d10 == eVar.v() && this.c == eVar.u()) {
            if (eVar.f20754a != this.f20757d) {
                return eVar.k();
            }
            return eVar;
        }
        return this.f20755a.m(this.f20756b, this.c, this.f20757d);
    }
}
