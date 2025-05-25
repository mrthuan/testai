package d6;

/* compiled from: MTensor.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int[] f16118a;

    /* renamed from: b  reason: collision with root package name */
    public int f16119b;
    public float[] c;

    /* compiled from: MTensor.kt */
    /* renamed from: d6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0193a {
        public static final int a(int[] iArr) {
            boolean z10;
            if (iArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int i10 = iArr[0];
                hg.b it = new hg.c(1, iArr.length - 1).iterator();
                while (it.c) {
                    i10 *= iArr[it.a()];
                }
                return i10;
            }
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
    }

    static {
        new C0193a();
    }

    public a(int[] iArr) {
        this.f16118a = iArr;
        int a10 = C0193a.a(iArr);
        this.f16119b = a10;
        this.c = new float[a10];
    }
}
