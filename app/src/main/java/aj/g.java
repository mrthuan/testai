package aj;

import lib.zj.office.fc.codec.CharEncoding;

/* compiled from: nsBIG5Verifier.java */
/* loaded from: classes3.dex */
public final class g extends r.d {

    /* renamed from: b  reason: collision with root package name */
    public static int[] f591b;
    public static int[] c;

    /* renamed from: d  reason: collision with root package name */
    public static int f592d;

    /* renamed from: e  reason: collision with root package name */
    public static String f593e;

    /* renamed from: f  reason: collision with root package name */
    public static int[] f594f;

    /* renamed from: g  reason: collision with root package name */
    public static int[] f595g;

    /* renamed from: h  reason: collision with root package name */
    public static int f596h;

    /* renamed from: i  reason: collision with root package name */
    public static String f597i;

    /* renamed from: j  reason: collision with root package name */
    public static int[] f598j;

    /* renamed from: k  reason: collision with root package name */
    public static int[] f599k;

    /* renamed from: l  reason: collision with root package name */
    public static int f600l;

    /* renamed from: m  reason: collision with root package name */
    public static String f601m;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f602a;

    public g(int i10) {
        this.f602a = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                f591b = r1;
                int[] iArr = {286331153, 1118481, 286331153, 286327057, 286331153, 286331153, 286331153, 286331153, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 304226850, 1145324612, 1145324612, 1145324612, 1145324612, 858993460, 858993459, 858993459, 858993459, 858993459, 858993459, 858993459, 858993459, 858993459, 858993459, 858993459, 53687091};
                c = r1;
                int[] iArr2 = {286339073, 304226833, 1};
                f593e = "Big5";
                f592d = 5;
                return;
            }
            f598j = r1;
            int[] iArr3 = {0, 2097408, 0, 12288, 0, 3355440, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1409286144};
            f599k = r1;
            int[] iArr4 = {288626549, 572657937, 291923490, 1713792614, 393569894, 1717659269, 1140326};
            f601m = CharEncoding.UTF_16BE;
            f600l = 6;
            return;
        }
        f594f = r1;
        int[] iArr5 = {286331153, 1118481, 286331153, 286327057, 286331153, 286331153, 858993459, 286331187, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 572662306, 1109533218, 1717986917, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 107374182};
        f595g = r1;
        int[] iArr6 = {318767105, 571543825, 17965602, 286326804, 303109393, 17};
        f597i = "GB18030";
        f596h = 7;
    }

    @Override // r.d
    public final int[] b() {
        switch (this.f602a) {
            case 0:
                return f591b;
            case 1:
                return f594f;
            default:
                return f598j;
        }
    }

    @Override // r.d
    public final String c() {
        switch (this.f602a) {
            case 0:
                return f593e;
            case 1:
                return f597i;
            default:
                return f601m;
        }
    }

    @Override // r.d
    public final boolean e() {
        switch (this.f602a) {
            case 0:
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // r.d
    public final int k() {
        switch (this.f602a) {
            case 0:
                return f592d;
            case 1:
                return f596h;
            default:
                return f600l;
        }
    }

    @Override // r.d
    public final int[] l() {
        switch (this.f602a) {
            case 0:
                return c;
            case 1:
                return f595g;
            default:
                return f599k;
        }
    }
}
