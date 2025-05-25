package n0;

/* compiled from: ViewingConditions.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: k  reason: collision with root package name */
    public static final j f22303k;

    /* renamed from: a  reason: collision with root package name */
    public final float f22304a;

    /* renamed from: b  reason: collision with root package name */
    public final float f22305b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f22306d;

    /* renamed from: e  reason: collision with root package name */
    public final float f22307e;

    /* renamed from: f  reason: collision with root package name */
    public final float f22308f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f22309g;

    /* renamed from: h  reason: collision with root package name */
    public final float f22310h;

    /* renamed from: i  reason: collision with root package name */
    public final float f22311i;

    /* renamed from: j  reason: collision with root package name */
    public final float f22312j;

    static {
        float f10;
        float f11;
        float[] fArr = ge.a.f17761l;
        float g02 = (float) ((ge.a.g0() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = ge.a.f17759j;
        float f12 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f13 = fArr[1];
        float f14 = fArr3[1] * f13;
        float f15 = fArr[2];
        float f16 = (fArr3[2] * f15) + f14 + (fArr3[0] * f12);
        float[] fArr4 = fArr2[1];
        float f17 = (fArr4[2] * f15) + (fArr4[1] * f13) + (fArr4[0] * f12);
        float[] fArr5 = fArr2[2];
        float f18 = (f15 * fArr5[2]) + (f13 * fArr5[1]) + (f12 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f10 = 0.100000046f;
            f11 = 0.59f;
        } else {
            f10 = 0.12999998f;
            f11 = 0.525f;
        }
        float f19 = f10 + f11;
        float exp = (1.0f - (((float) Math.exp(((-g02) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d10 = exp;
        if (d10 > 1.0d) {
            exp = 1.0f;
        } else if (d10 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f16) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp, (((100.0f / f18) * exp) + 1.0f) - exp};
        float f20 = 1.0f / ((5.0f * g02) + 1.0f);
        float f21 = f20 * f20 * f20 * f20;
        float f22 = 1.0f - f21;
        float cbrt = (0.1f * f22 * f22 * ((float) Math.cbrt(g02 * 5.0d))) + (f21 * g02);
        float g03 = ge.a.g0() / fArr[1];
        double d11 = g03;
        float sqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f18) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f17) / 100.0d, 0.42d), pow2};
        float f23 = fArr7[0];
        float f24 = fArr7[1];
        f22303k = new j(g03, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f23 * 400.0f) / (f23 + 27.13f)) * 2.0f) + ((f24 * 400.0f) / (f24 + 27.13f))) * pow, pow, pow, f19, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public j(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f22308f = f10;
        this.f22304a = f11;
        this.f22305b = f12;
        this.c = f13;
        this.f22306d = f14;
        this.f22307e = f15;
        this.f22309g = fArr;
        this.f22310h = f16;
        this.f22311i = f17;
        this.f22312j = f18;
    }
}
