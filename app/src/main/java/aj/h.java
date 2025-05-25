package aj;

import lib.zj.office.fc.codec.CharEncoding;

/* compiled from: nsCP1252Verifier.java */
/* loaded from: classes3.dex */
public final class h extends r.d {

    /* renamed from: b  reason: collision with root package name */
    public static int[] f603b;
    public static int[] c;

    /* renamed from: d  reason: collision with root package name */
    public static int f604d;

    /* renamed from: e  reason: collision with root package name */
    public static String f605e;

    /* renamed from: f  reason: collision with root package name */
    public static int[] f606f;

    /* renamed from: g  reason: collision with root package name */
    public static int[] f607g;

    /* renamed from: h  reason: collision with root package name */
    public static int f608h;

    /* renamed from: i  reason: collision with root package name */
    public static String f609i;

    /* renamed from: j  reason: collision with root package name */
    public static int[] f610j;

    /* renamed from: k  reason: collision with root package name */
    public static int[] f611k;

    /* renamed from: l  reason: collision with root package name */
    public static int f612l;

    /* renamed from: m  reason: collision with root package name */
    public static String f613m;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f614a;

    public h(int i10) {
        this.f614a = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                f603b = r1;
                int[] iArr = {572662305, 2236962, 572662306, 572654114, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662274, 16851234, 572662304, 285286690, 572662306, 572662306, 572662306, 572662306, 286331153, 286331153, 554766609, 286331153, 286331153, 286331153, 554766609, 286331153};
                c = r1;
                int[] iArr2 = {571543601, 340853778, 65};
                f605e = "windows-1252";
                f604d = 3;
                return;
            }
            f610j = r1;
            int[] iArr3 = {0, 2097408, 0, 12288, 0, 3355440, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1409286144};
            f611k = r1;
            int[] iArr4 = {288647014, 572657937, 303387938, 1712657749, 357927015, 1427182933, 1381717};
            f613m = CharEncoding.UTF_16LE;
            f612l = 6;
            return;
        }
        f606f = r1;
        int[] iArr5 = {286331153, 1118481, 286331153, 286327057, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 286331153, 0, 0, 0, 0, 572662304, 858993442, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 35791394};
        f607g = r1;
        int[] iArr6 = {286331649, 1122850};
        f609i = "GB2312";
        f608h = 4;
    }

    @Override // r.d
    public final int[] b() {
        switch (this.f614a) {
            case 0:
                return f603b;
            case 1:
                return f606f;
            default:
                return f610j;
        }
    }

    @Override // r.d
    public final String c() {
        switch (this.f614a) {
            case 0:
                return f605e;
            case 1:
                return f609i;
            default:
                return f613m;
        }
    }

    @Override // r.d
    public final boolean e() {
        switch (this.f614a) {
            case 0:
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // r.d
    public final int k() {
        switch (this.f614a) {
            case 0:
                return f604d;
            case 1:
                return f608h;
            default:
                return f612l;
        }
    }

    @Override // r.d
    public final int[] l() {
        switch (this.f614a) {
            case 0:
                return c;
            case 1:
                return f607g;
            default:
                return f611k;
        }
    }
}
