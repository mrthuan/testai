package b0;

/* compiled from: VelocityMatrix.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public float f5267a;

    /* renamed from: b  reason: collision with root package name */
    public float f5268b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public float f5269d;

    /* renamed from: e  reason: collision with root package name */
    public float f5270e;

    /* renamed from: f  reason: collision with root package name */
    public float f5271f;

    public final void a(float f10, float f11, int i10, int i11, float[] fArr) {
        float f12;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = (f11 - 0.5f) * 2.0f;
        float f16 = f13 + this.c;
        float f17 = f14 + this.f5269d;
        float f18 = (this.f5267a * (f10 - 0.5f) * 2.0f) + f16;
        float f19 = (this.f5268b * f15) + f17;
        float radians = (float) Math.toRadians(this.f5271f);
        float radians2 = (float) Math.toRadians(this.f5270e);
        double d10 = radians;
        double sin = Math.sin(d10);
        double d11 = i11 * f15;
        double cos = Math.cos(d10);
        fArr[0] = (((float) ((sin * ((-i10) * f12)) - (Math.cos(d10) * d11))) * radians2) + f18;
        fArr[1] = (radians2 * ((float) ((cos * (i10 * f12)) - (Math.sin(d10) * d11)))) + f19;
    }
}
