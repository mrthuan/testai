package ki;

/* compiled from: SheetScroller.java */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public int f19779a;

    /* renamed from: b  reason: collision with root package name */
    public int f19780b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public float f19781d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f19782e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f19783f = true;

    /* renamed from: g  reason: collision with root package name */
    public double f19784g;

    /* renamed from: h  reason: collision with root package name */
    public double f19785h;

    public final void a(ei.c cVar, int i10, int i11) {
        int i12;
        int i13;
        double d10;
        int i14;
        double d11;
        int i15;
        ei.b bVar;
        float f10;
        this.f19779a = 0;
        this.f19780b = 0;
        this.f19781d = 0.0f;
        this.c = 0.0f;
        this.f19782e = true;
        this.f19783f = true;
        this.f19784g = i11;
        this.f19785h = i10;
        cVar.getClass();
        boolean z10 = cVar.f16601a.f16633k;
        if (z10) {
            i12 = 65536;
        } else {
            i12 = 1048576;
        }
        if (z10) {
            i13 = 256;
        } else {
            i13 = 16384;
        }
        if (i11 > 0) {
            int i16 = cVar.f16602b;
            int i17 = cVar.c;
            int i18 = cVar.f16618s;
            while (true) {
                d11 = this.f19784g;
                if (d11 < 1.0d || (i15 = this.f19779a) > i12) {
                    break;
                }
                if (i15 >= i16 && i15 <= i17) {
                    bVar = cVar.g(i15);
                } else {
                    bVar = null;
                }
                if (bVar == null || !bVar.d()) {
                    if (bVar == null) {
                        f10 = i18;
                    } else {
                        f10 = bVar.f16598f;
                    }
                    this.f19781d = f10;
                    this.f19784g -= f10;
                }
                this.f19779a++;
            }
            int i19 = this.f19779a;
            if (i19 != i12) {
                this.f19779a = i19 - 1;
                double abs = Math.abs(d11);
                this.f19784g = abs;
                if (abs < 1.0d) {
                    this.f19779a++;
                    this.f19784g = 0.0d;
                } else {
                    this.f19782e = false;
                }
            } else {
                int i20 = i19 - 1;
                this.f19779a = i20;
                ei.b g10 = cVar.g(i20);
                while (g10 != null && g10.d()) {
                    int i21 = this.f19779a - 1;
                    this.f19779a = i21;
                    g10 = cVar.g(i21);
                }
                this.f19784g = 0.0d;
            }
        }
        if (i10 > 0) {
            while (true) {
                d10 = this.f19785h;
                if (d10 < 1.0d || (i14 = this.f19780b) > i13) {
                    break;
                }
                if (!cVar.l(i14)) {
                    float d12 = cVar.d(this.f19780b);
                    this.c = d12;
                    this.f19785h -= d12;
                }
                this.f19780b++;
            }
            int i22 = this.f19780b;
            if (i22 != i13) {
                this.f19780b = i22 - 1;
                double abs2 = Math.abs(d10);
                this.f19785h = abs2;
                if (abs2 < 1.0d) {
                    this.f19780b++;
                    this.f19785h = 0.0d;
                    return;
                }
                this.f19783f = false;
                return;
            }
            this.f19780b = i22 - 1;
            while (cVar.l(this.f19780b)) {
                this.f19780b--;
            }
            this.f19785h = 0.0d;
        }
    }
}
