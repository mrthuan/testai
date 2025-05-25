package b0;

/* compiled from: SpringStopEngine.java */
/* loaded from: classes.dex */
public final class k implements m {

    /* renamed from: b  reason: collision with root package name */
    public double f5238b;
    public double c;

    /* renamed from: d  reason: collision with root package name */
    public float f5239d;

    /* renamed from: e  reason: collision with root package name */
    public float f5240e;

    /* renamed from: f  reason: collision with root package name */
    public float f5241f;

    /* renamed from: g  reason: collision with root package name */
    public float f5242g;

    /* renamed from: h  reason: collision with root package name */
    public float f5243h;

    /* renamed from: a  reason: collision with root package name */
    public double f5237a = 0.5d;

    /* renamed from: i  reason: collision with root package name */
    public int f5244i = 0;

    @Override // b0.m
    public final boolean a() {
        double d10 = this.f5240e - this.c;
        double d11 = this.f5238b;
        double d12 = this.f5241f;
        if (Math.sqrt((((d11 * d10) * d10) + ((d12 * d12) * this.f5242g)) / d11) <= this.f5243h) {
            return true;
        }
        return false;
    }

    @Override // b0.m
    public final float b() {
        return 0.0f;
    }

    @Override // b0.m
    public final float getInterpolation(float f10) {
        k kVar = this;
        float f11 = f10;
        double d10 = f11 - kVar.f5239d;
        double d11 = kVar.f5238b;
        double d12 = kVar.f5237a;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d11 / kVar.f5242g) * d10) * 4.0d)) + 1.0d);
        double d13 = d10 / sqrt;
        int i10 = 0;
        while (i10 < sqrt) {
            double d14 = kVar.f5240e;
            double d15 = kVar.c;
            int i11 = sqrt;
            int i12 = i10;
            double d16 = kVar.f5241f;
            double d17 = kVar.f5242g;
            double d18 = ((((((-d11) * (d14 - d15)) - (d16 * d12)) / d17) * d13) / 2.0d) + d16;
            double d19 = ((((-((((d13 * d18) / 2.0d) + d14) - d15)) * d11) - (d18 * d12)) / d17) * d13;
            float f12 = (float) (d16 + d19);
            this.f5241f = f12;
            float f13 = (float) ((((d19 / 2.0d) + d16) * d13) + d14);
            this.f5240e = f13;
            int i13 = this.f5244i;
            if (i13 > 0) {
                if (f13 < 0.0f && (i13 & 1) == 1) {
                    this.f5240e = -f13;
                    this.f5241f = -f12;
                }
                float f14 = this.f5240e;
                if (f14 > 1.0f && (i13 & 2) == 2) {
                    this.f5240e = 2.0f - f14;
                    this.f5241f = -this.f5241f;
                }
            }
            f11 = f10;
            sqrt = i11;
            i10 = i12 + 1;
            kVar = this;
        }
        k kVar2 = kVar;
        kVar2.f5239d = f11;
        return kVar2.f5240e;
    }
}
