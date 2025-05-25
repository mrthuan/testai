package f9;

/* compiled from: CutCornerTreatment.java */
/* loaded from: classes2.dex */
public final class e extends ge.a {

    /* renamed from: o  reason: collision with root package name */
    public final float f17161o;

    public e() {
        super(4);
        this.f17161o = -1.0f;
    }

    @Override // ge.a
    public final void x(float f10, float f11, p pVar) {
        pVar.e(0.0f, f11 * f10, 180.0f, 90.0f);
        double d10 = f11;
        double d11 = f10;
        pVar.d((float) (Math.sin(Math.toRadians(90.0f)) * d10 * d11), (float) (Math.sin(Math.toRadians(0.0f)) * d10 * d11));
    }
}
