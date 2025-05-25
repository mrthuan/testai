package aj;

/* compiled from: nsEUCJPVerifier.java */
/* loaded from: classes3.dex */
public final class j extends r.d {

    /* renamed from: b  reason: collision with root package name */
    public static int[] f623b;
    public static int[] c;

    /* renamed from: d  reason: collision with root package name */
    public static int f624d;

    /* renamed from: e  reason: collision with root package name */
    public static String f625e;

    /* renamed from: f  reason: collision with root package name */
    public static int[] f626f;

    /* renamed from: g  reason: collision with root package name */
    public static int[] f627g;

    /* renamed from: h  reason: collision with root package name */
    public static int f628h;

    /* renamed from: i  reason: collision with root package name */
    public static String f629i;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f630a;

    public j(int i10) {
        this.f630a = i10;
        if (i10 != 1) {
            f623b = r1;
            int[] iArr = {1145324612, 1430537284, 1145324612, 1145328708, 1145324612, 1145324612, 1145324612, 1145324612, 1145324612, 1145324612, 1145324612, 1145324612, 1145324612, 1145324612, 1145324612, 1145324612, 1431655765, 827675989, 1431655765, 1431655765, 572662309, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 0, 0, 0, 1342177280};
            c = r1;
            int[] iArr2 = {286282563, 572657937, 286265378, 319885329, 4371};
            f625e = "EUC-JP";
            f624d = 6;
            return;
        }
        f626f = r1;
        int[] iArr3 = {2, 0, 0, 4096, 0, 48, 0, 0, 16384, 0, 0, 0, 0, 0, 0, 0, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306};
        f627g = r1;
        int[] iArr4 = {304, 286331152, 572662289, 336663074, 286335249, 286331237, 286335249, 18944273};
        f629i = "ISO-2022-CN";
        f628h = 9;
    }

    @Override // r.d
    public final int[] b() {
        switch (this.f630a) {
            case 0:
                return f623b;
            default:
                return f626f;
        }
    }

    @Override // r.d
    public final String c() {
        switch (this.f630a) {
            case 0:
                return f625e;
            default:
                return f629i;
        }
    }

    @Override // r.d
    public final boolean e() {
        return false;
    }

    @Override // r.d
    public final int k() {
        switch (this.f630a) {
            case 0:
                return f624d;
            default:
                return f628h;
        }
    }

    @Override // r.d
    public final int[] l() {
        switch (this.f630a) {
            case 0:
                return c;
            default:
                return f627g;
        }
    }
}
