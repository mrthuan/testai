package f9;

/* compiled from: RoundedCornerTreatment.java */
/* loaded from: classes2.dex */
public final class l extends ge.a {

    /* renamed from: o  reason: collision with root package name */
    public final float f17210o;

    public l() {
        super(4);
        this.f17210o = -1.0f;
    }

    @Override // ge.a
    public final void x(float f10, float f11, p pVar) {
        pVar.e(0.0f, f11 * f10, 180.0f, 90.0f);
        float f12 = f11 * 2.0f * f10;
        pVar.a(0.0f, 0.0f, f12, f12, 180.0f, 90.0f);
    }
}
