package g1;

import g1.b;

/* compiled from: SpringForce.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public double f17403a;

    /* renamed from: b  reason: collision with root package name */
    public double f17404b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public double f17405d;

    /* renamed from: e  reason: collision with root package name */
    public double f17406e;

    /* renamed from: f  reason: collision with root package name */
    public double f17407f;

    /* renamed from: g  reason: collision with root package name */
    public double f17408g;

    /* renamed from: h  reason: collision with root package name */
    public double f17409h;

    /* renamed from: i  reason: collision with root package name */
    public double f17410i;

    /* renamed from: j  reason: collision with root package name */
    public final b.g f17411j;

    public e() {
        this.f17403a = Math.sqrt(1500.0d);
        this.f17404b = 0.5d;
        this.c = false;
        this.f17410i = Double.MAX_VALUE;
        this.f17411j = new b.g();
    }

    public final b.g a(double d10, double d11, long j10) {
        double cos;
        double d12;
        if (!this.c) {
            if (this.f17410i != Double.MAX_VALUE) {
                double d13 = this.f17404b;
                if (d13 > 1.0d) {
                    double d14 = this.f17403a;
                    this.f17407f = (Math.sqrt((d13 * d13) - 1.0d) * d14) + ((-d13) * d14);
                    double d15 = this.f17404b;
                    double d16 = this.f17403a;
                    this.f17408g = ((-d15) * d16) - (Math.sqrt((d15 * d15) - 1.0d) * d16);
                } else if (d13 >= 0.0d && d13 < 1.0d) {
                    this.f17409h = Math.sqrt(1.0d - (d13 * d13)) * this.f17403a;
                }
                this.c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d17 = j10 / 1000.0d;
        double d18 = d10 - this.f17410i;
        double d19 = this.f17404b;
        if (d19 > 1.0d) {
            double d20 = this.f17408g;
            double d21 = this.f17407f;
            double d22 = d18 - (((d20 * d18) - d11) / (d20 - d21));
            double d23 = ((d18 * d20) - d11) / (d20 - d21);
            d12 = (Math.pow(2.718281828459045d, this.f17407f * d17) * d23) + (Math.pow(2.718281828459045d, d20 * d17) * d22);
            double d24 = this.f17408g;
            double pow = Math.pow(2.718281828459045d, d24 * d17) * d22 * d24;
            double d25 = this.f17407f;
            cos = (Math.pow(2.718281828459045d, d25 * d17) * d23 * d25) + pow;
        } else if (d19 == 1.0d) {
            double d26 = this.f17403a;
            double d27 = (d26 * d18) + d11;
            double d28 = (d27 * d17) + d18;
            double pow2 = Math.pow(2.718281828459045d, (-d26) * d17) * d28;
            double pow3 = Math.pow(2.718281828459045d, (-this.f17403a) * d17) * d28;
            double d29 = this.f17403a;
            cos = (Math.pow(2.718281828459045d, (-d29) * d17) * d27) + (pow3 * (-d29));
            d12 = pow2;
        } else {
            double d30 = 1.0d / this.f17409h;
            double d31 = this.f17403a;
            double d32 = ((d19 * d31 * d18) + d11) * d30;
            double sin = ((Math.sin(this.f17409h * d17) * d32) + (Math.cos(this.f17409h * d17) * d18)) * Math.pow(2.718281828459045d, (-d19) * d31 * d17);
            double d33 = this.f17403a;
            double d34 = this.f17404b;
            double d35 = (-d33) * sin * d34;
            double pow4 = Math.pow(2.718281828459045d, (-d34) * d33 * d17);
            double d36 = this.f17409h;
            double d37 = (-d36) * d18;
            double d38 = this.f17409h;
            cos = (((Math.cos(d38 * d17) * d32 * d38) + (Math.sin(d36 * d17) * d37)) * pow4) + d35;
            d12 = sin;
        }
        b.g gVar = this.f17411j;
        gVar.f17397a = (float) (d12 + this.f17410i);
        gVar.f17398b = (float) cos;
        return gVar;
    }

    public e(float f10) {
        this.f17403a = Math.sqrt(1500.0d);
        this.f17404b = 0.5d;
        this.c = false;
        this.f17411j = new b.g();
        this.f17410i = f10;
    }
}
