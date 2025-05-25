package aj;

/* compiled from: nsEUCKRVerifier.java */
/* loaded from: classes3.dex */
public final class k extends r.d {

    /* renamed from: b  reason: collision with root package name */
    public static int[] f631b;
    public static int[] c;

    /* renamed from: d  reason: collision with root package name */
    public static int f632d;

    /* renamed from: e  reason: collision with root package name */
    public static String f633e;

    /* renamed from: f  reason: collision with root package name */
    public static int[] f634f;

    /* renamed from: g  reason: collision with root package name */
    public static int[] f635g;

    /* renamed from: h  reason: collision with root package name */
    public static int f636h;

    /* renamed from: i  reason: collision with root package name */
    public static String f637i;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f638a;

    public k(int i10) {
        this.f638a = i10;
        if (i10 != 1) {
            f631b = r1;
            int[] iArr = {286331153, 1118481, 286331153, 286327057, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 0, 0, 0, 0, 572662304, 858923554, 572662306, 572662306, 572662306, 572662322, 572662306, 572662306, 572662306, 572662306, 572662306, 35791394};
            c = r1;
            int[] iArr2 = {286331649, 1122850};
            f633e = "EUC-KR";
            f632d = 4;
            return;
        }
        f634f = r1;
        int[] iArr3 = {2, 570425344, 0, 4096, 458752, 3, 0, 0, 1030, 1280, 0, 0, 0, 0, 0, 0, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306};
        f635g = r1;
        int[] iArr4 = {304, 286331153, 572662306, 1091653905, 303173905, 287445265};
        f637i = "ISO-2022-JP";
        f636h = 8;
    }

    @Override // r.d
    public final int[] b() {
        switch (this.f638a) {
            case 0:
                return f631b;
            default:
                return f634f;
        }
    }

    @Override // r.d
    public final String c() {
        switch (this.f638a) {
            case 0:
                return f633e;
            default:
                return f637i;
        }
    }

    @Override // r.d
    public final boolean e() {
        return false;
    }

    @Override // r.d
    public final int k() {
        switch (this.f638a) {
            case 0:
                return f632d;
            default:
                return f636h;
        }
    }

    @Override // r.d
    public final int[] l() {
        switch (this.f638a) {
            case 0:
                return c;
            default:
                return f635g;
        }
    }
}
