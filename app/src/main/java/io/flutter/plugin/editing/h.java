package io.flutter.plugin.editing;

/* compiled from: TextInputPlugin.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f18779a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ double[] f18780b;
    public final /* synthetic */ double[] c;

    public h(boolean z10, double[] dArr, double[] dArr2) {
        this.f18779a = z10;
        this.f18780b = dArr;
        this.c = dArr2;
    }

    public final void a(double d10, double d11) {
        boolean z10 = this.f18779a;
        double[] dArr = this.f18780b;
        double d12 = 1.0d;
        if (!z10) {
            d12 = 1.0d / (((dArr[7] * d11) + (dArr[3] * d10)) + dArr[15]);
        }
        double d13 = ((dArr[4] * d11) + (dArr[0] * d10) + dArr[12]) * d12;
        double d14 = ((dArr[5] * d11) + (dArr[1] * d10) + dArr[13]) * d12;
        double[] dArr2 = this.c;
        if (d13 < dArr2[0]) {
            dArr2[0] = d13;
        } else if (d13 > dArr2[1]) {
            dArr2[1] = d13;
        }
        if (d14 < dArr2[2]) {
            dArr2[2] = d14;
        } else if (d14 > dArr2[3]) {
            dArr2[3] = d14;
        }
    }
}
