package b0;

/* compiled from: CurveFit.java */
/* loaded from: classes.dex */
public abstract class b {

    /* compiled from: CurveFit.java */
    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final double f5197a;

        /* renamed from: b  reason: collision with root package name */
        public final double[] f5198b;

        public a(double d10, double[] dArr) {
            this.f5197a = d10;
            this.f5198b = dArr;
        }

        @Override // b0.b
        public final double b(double d10) {
            return this.f5198b[0];
        }

        @Override // b0.b
        public final void c(double d10, double[] dArr) {
            double[] dArr2 = this.f5198b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // b0.b
        public final void d(double d10, float[] fArr) {
            int i10 = 0;
            while (true) {
                double[] dArr = this.f5198b;
                if (i10 < dArr.length) {
                    fArr[i10] = (float) dArr[i10];
                    i10++;
                } else {
                    return;
                }
            }
        }

        @Override // b0.b
        public final double e(double d10) {
            return 0.0d;
        }

        @Override // b0.b
        public final void f(double d10, double[] dArr) {
            for (int i10 = 0; i10 < this.f5198b.length; i10++) {
                dArr[i10] = 0.0d;
            }
        }

        @Override // b0.b
        public final double[] g() {
            return new double[]{this.f5197a};
        }
    }

    public static b a(int i10, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i10 = 2;
        }
        if (i10 != 0) {
            if (i10 != 2) {
                return new f(dArr, dArr2);
            }
            return new a(dArr[0], dArr2[0]);
        }
        return new g(dArr, dArr2);
    }

    public abstract double b(double d10);

    public abstract void c(double d10, double[] dArr);

    public abstract void d(double d10, float[] fArr);

    public abstract double e(double d10);

    public abstract void f(double d10, double[] dArr);

    public abstract double[] g();
}
