package b0;

/* compiled from: Schlick.java */
/* loaded from: classes.dex */
public final class i extends c {

    /* renamed from: d  reason: collision with root package name */
    public final double f5231d;

    /* renamed from: e  reason: collision with root package name */
    public final double f5232e;

    public i(String str) {
        this.f5200a = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f5231d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i10 = indexOf2 + 1;
        this.f5232e = Double.parseDouble(str.substring(i10, str.indexOf(44, i10)).trim());
    }

    @Override // b0.c
    public final double a(double d10) {
        double d11 = this.f5232e;
        int i10 = (d10 > d11 ? 1 : (d10 == d11 ? 0 : -1));
        double d12 = this.f5231d;
        if (i10 < 0) {
            return (d11 * d10) / (((d11 - d10) * d12) + d10);
        }
        return ((d10 - 1.0d) * (1.0d - d11)) / ((1.0d - d10) - ((d11 - d10) * d12));
    }

    @Override // b0.c
    public final double b(double d10) {
        double d11 = this.f5232e;
        int i10 = (d10 > d11 ? 1 : (d10 == d11 ? 0 : -1));
        double d12 = this.f5231d;
        if (i10 < 0) {
            double d13 = d12 * d11 * d11;
            double d14 = ((d11 - d10) * d12) + d10;
            return d13 / (d14 * d14);
        }
        double d15 = d11 - 1.0d;
        double d16 = (((d11 - d10) * (-d12)) - d10) + 1.0d;
        return ((d15 * d12) * d15) / (d16 * d16);
    }
}
