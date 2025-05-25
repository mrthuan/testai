package f9;

/* compiled from: OffsetEdgeTreatment.java */
/* loaded from: classes2.dex */
public final class j extends f {

    /* renamed from: a  reason: collision with root package name */
    public final f f17207a;

    /* renamed from: b  reason: collision with root package name */
    public final float f17208b;

    public j(g gVar, float f10) {
        this.f17207a = gVar;
        this.f17208b = f10;
    }

    @Override // f9.f
    public final boolean a() {
        return this.f17207a.a();
    }

    @Override // f9.f
    public final void c(float f10, float f11, float f12, p pVar) {
        this.f17207a.c(f10, f11 - this.f17208b, f12, pVar);
    }
}
