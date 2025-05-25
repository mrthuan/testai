package b0;

/* compiled from: StopLogicEngine.java */
/* loaded from: classes.dex */
public final class n implements m {

    /* renamed from: a  reason: collision with root package name */
    public float f5246a;

    /* renamed from: b  reason: collision with root package name */
    public float f5247b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public float f5248d;

    /* renamed from: e  reason: collision with root package name */
    public float f5249e;

    /* renamed from: f  reason: collision with root package name */
    public float f5250f;

    /* renamed from: g  reason: collision with root package name */
    public float f5251g;

    /* renamed from: h  reason: collision with root package name */
    public float f5252h;

    /* renamed from: i  reason: collision with root package name */
    public float f5253i;

    /* renamed from: j  reason: collision with root package name */
    public int f5254j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5255k = false;

    /* renamed from: l  reason: collision with root package name */
    public float f5256l;

    /* renamed from: m  reason: collision with root package name */
    public float f5257m;

    @Override // b0.m
    public final boolean a() {
        if (b() < 1.0E-5f && Math.abs(this.f5253i - this.f5257m) < 1.0E-5f) {
            return true;
        }
        return false;
    }

    @Override // b0.m
    public final float b() {
        if (this.f5255k) {
            return -c(this.f5257m);
        }
        return c(this.f5257m);
    }

    public final float c(float f10) {
        float f11;
        float f12;
        float f13 = this.f5248d;
        if (f10 <= f13) {
            f11 = this.f5246a;
            f12 = this.f5247b;
        } else {
            int i10 = this.f5254j;
            if (i10 == 1) {
                return 0.0f;
            }
            f10 -= f13;
            f13 = this.f5249e;
            if (f10 < f13) {
                f11 = this.f5247b;
                f12 = this.c;
            } else if (i10 == 2) {
                return this.f5252h;
            } else {
                float f14 = f10 - f13;
                float f15 = this.f5250f;
                if (f14 < f15) {
                    float f16 = this.c;
                    return f16 - ((f14 * f16) / f15);
                }
                return this.f5253i;
            }
        }
        return (((f12 - f11) * f10) / f13) + f11;
    }

    public final void d(float f10, float f11, float f12, float f13, float f14) {
        if (f10 == 0.0f) {
            f10 = 1.0E-4f;
        }
        this.f5246a = f10;
        float f15 = f10 / f12;
        float f16 = (f15 * f10) / 2.0f;
        if (f10 < 0.0f) {
            float sqrt = (float) Math.sqrt((f11 - ((((-f10) / f12) * f10) / 2.0f)) * f12);
            if (sqrt < f13) {
                this.f5254j = 2;
                this.f5246a = f10;
                this.f5247b = sqrt;
                this.c = 0.0f;
                float f17 = (sqrt - f10) / f12;
                this.f5248d = f17;
                this.f5249e = sqrt / f12;
                this.f5251g = ((f10 + sqrt) * f17) / 2.0f;
                this.f5252h = f11;
                this.f5253i = f11;
                return;
            }
            this.f5254j = 3;
            this.f5246a = f10;
            this.f5247b = f13;
            this.c = f13;
            float f18 = (f13 - f10) / f12;
            this.f5248d = f18;
            float f19 = f13 / f12;
            this.f5250f = f19;
            float f20 = ((f10 + f13) * f18) / 2.0f;
            float f21 = (f19 * f13) / 2.0f;
            this.f5249e = ((f11 - f20) - f21) / f13;
            this.f5251g = f20;
            this.f5252h = f11 - f21;
            this.f5253i = f11;
        } else if (f16 >= f11) {
            this.f5254j = 1;
            this.f5246a = f10;
            this.f5247b = 0.0f;
            this.f5251g = f11;
            this.f5248d = (2.0f * f11) / f10;
        } else {
            float f22 = f11 - f16;
            float f23 = f22 / f10;
            if (f23 + f15 < f14) {
                this.f5254j = 2;
                this.f5246a = f10;
                this.f5247b = f10;
                this.c = 0.0f;
                this.f5251g = f22;
                this.f5252h = f11;
                this.f5248d = f23;
                this.f5249e = f15;
                return;
            }
            float sqrt2 = (float) Math.sqrt(((f10 * f10) / 2.0f) + (f12 * f11));
            float f24 = (sqrt2 - f10) / f12;
            this.f5248d = f24;
            float f25 = sqrt2 / f12;
            this.f5249e = f25;
            if (sqrt2 < f13) {
                this.f5254j = 2;
                this.f5246a = f10;
                this.f5247b = sqrt2;
                this.c = 0.0f;
                this.f5248d = f24;
                this.f5249e = f25;
                this.f5251g = ((f10 + sqrt2) * f24) / 2.0f;
                this.f5252h = f11;
                return;
            }
            this.f5254j = 3;
            this.f5246a = f10;
            this.f5247b = f13;
            this.c = f13;
            float f26 = (f13 - f10) / f12;
            this.f5248d = f26;
            float f27 = f13 / f12;
            this.f5250f = f27;
            float f28 = ((f10 + f13) * f26) / 2.0f;
            float f29 = (f27 * f13) / 2.0f;
            this.f5249e = ((f11 - f28) - f29) / f13;
            this.f5251g = f28;
            this.f5252h = f11 - f29;
            this.f5253i = f11;
        }
    }

    @Override // b0.m
    public final float getInterpolation(float f10) {
        float f11;
        float f12 = this.f5248d;
        if (f10 <= f12) {
            float f13 = this.f5246a;
            f11 = ((((this.f5247b - f13) * f10) * f10) / (f12 * 2.0f)) + (f13 * f10);
        } else {
            int i10 = this.f5254j;
            if (i10 == 1) {
                f11 = this.f5251g;
            } else {
                float f14 = f10 - f12;
                float f15 = this.f5249e;
                if (f14 < f15) {
                    float f16 = this.f5251g;
                    float f17 = this.f5247b;
                    f11 = ((((this.c - f17) * f14) * f14) / (f15 * 2.0f)) + (f17 * f14) + f16;
                } else if (i10 == 2) {
                    f11 = this.f5252h;
                } else {
                    float f18 = f14 - f15;
                    float f19 = this.f5250f;
                    if (f18 <= f19) {
                        float f20 = this.f5252h;
                        float f21 = this.c * f18;
                        f11 = (f20 + f21) - ((f21 * f18) / (f19 * 2.0f));
                    } else {
                        f11 = this.f5253i;
                    }
                }
            }
        }
        this.f5257m = f10;
        if (this.f5255k) {
            return this.f5256l - f11;
        }
        return this.f5256l + f11;
    }
}
