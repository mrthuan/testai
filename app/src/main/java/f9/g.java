package f9;

/* compiled from: MarkerEdgeTreatment.java */
/* loaded from: classes2.dex */
public final class g extends f {

    /* renamed from: a  reason: collision with root package name */
    public final float f17162a;

    public g(float f10) {
        this.f17162a = f10 - 0.001f;
    }

    @Override // f9.f
    public final void c(float f10, float f11, float f12, p pVar) {
        double d10 = this.f17162a;
        float sqrt = (float) ((Math.sqrt(2.0d) * d10) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(d10, 2.0d) - Math.pow(sqrt, 2.0d));
        pVar.e(f11 - sqrt, ((float) (-((Math.sqrt(2.0d) * d10) - d10))) + sqrt2, 270.0f, 0.0f);
        pVar.d(f11, (float) (-((Math.sqrt(2.0d) * d10) - d10)));
        pVar.d(f11 + sqrt, ((float) (-((Math.sqrt(2.0d) * d10) - d10))) + sqrt2);
    }
}
