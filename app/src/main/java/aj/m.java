package aj;

/* compiled from: nsEUCTWVerifier.java */
/* loaded from: classes3.dex */
public final class m extends r.d {

    /* renamed from: b  reason: collision with root package name */
    public static int[] f644b;
    public static int[] c;

    /* renamed from: d  reason: collision with root package name */
    public static int f645d;

    /* renamed from: e  reason: collision with root package name */
    public static String f646e;

    /* renamed from: f  reason: collision with root package name */
    public static int[] f647f;

    /* renamed from: g  reason: collision with root package name */
    public static int[] f648g;

    /* renamed from: h  reason: collision with root package name */
    public static int f649h;

    /* renamed from: i  reason: collision with root package name */
    public static String f650i;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f651a;

    public m(int i10) {
        this.f651a = i10;
        if (i10 != 1) {
            f644b = r1;
            int[] iArr = {572662306, 2236962, 572662306, 572654114, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 0, 100663296, 0, 0, 1145324592, 286331221, 286331153, 286331153, 858985233, 858993459, 858993459, 858993459, 858993459, 858993459, 858993459, 53687091};
            c = r1;
            int[] iArr2 = {338898961, 571543825, 269623842, 286330880, 1052949, 16};
            f646e = "x-euc-tw";
            f645d = 7;
            return;
        }
        f647f = r1;
        int[] iArr3 = {286331152, 1118481, 286331153, 286327057, 286331153, 286331153, 286331153, 286331153, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 304226850, 858993459, 858993459, 858993459, 858993459, 572662308, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 858993459, 1145393971, 1145324612, 279620};
        f648g = r1;
        int[] iArr4 = {286339073, 572657937, 4386};
        f650i = "Shift_JIS";
        f649h = 6;
    }

    @Override // r.d
    public final int[] b() {
        switch (this.f651a) {
            case 0:
                return f644b;
            default:
                return f647f;
        }
    }

    @Override // r.d
    public final String c() {
        switch (this.f651a) {
            case 0:
                return f646e;
            default:
                return f650i;
        }
    }

    @Override // r.d
    public final boolean e() {
        return false;
    }

    @Override // r.d
    public final int k() {
        switch (this.f651a) {
            case 0:
                return f645d;
            default:
                return f649h;
        }
    }

    @Override // r.d
    public final int[] l() {
        switch (this.f651a) {
            case 0:
                return c;
            default:
                return f648g;
        }
    }
}
