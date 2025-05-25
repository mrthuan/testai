package kotlin.random;

import java.io.Serializable;

/* compiled from: XorWowRandom.kt */
/* loaded from: classes.dex */
public final class XorWowRandom extends Random implements Serializable {
    private static final long serialVersionUID = 0;
    private int addend;

    /* renamed from: v  reason: collision with root package name */
    private int f19952v;

    /* renamed from: w  reason: collision with root package name */
    private int f19953w;

    /* renamed from: x  reason: collision with root package name */
    private int f19954x;

    /* renamed from: y  reason: collision with root package name */
    private int f19955y;

    /* renamed from: z  reason: collision with root package name */
    private int f19956z;

    public XorWowRandom(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f19954x = i10;
        this.f19955y = i11;
        this.f19956z = i12;
        this.f19953w = i13;
        this.f19952v = i14;
        this.addend = i15;
        int i16 = i10 | i11 | i12 | i13 | i14;
        if (!(i16 != 0)) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
        for (int i17 = 0; i17 < 64; i17++) {
            nextInt();
        }
    }

    @Override // kotlin.random.Random
    public int nextBits(int i10) {
        return ((-i10) >> 31) & (nextInt() >>> (32 - i10));
    }

    @Override // kotlin.random.Random
    public int nextInt() {
        int i10 = this.f19954x;
        int i11 = i10 ^ (i10 >>> 2);
        this.f19954x = this.f19955y;
        this.f19955y = this.f19956z;
        this.f19956z = this.f19953w;
        int i12 = this.f19952v;
        this.f19953w = i12;
        int i13 = ((i11 ^ (i11 << 1)) ^ i12) ^ (i12 << 4);
        this.f19952v = i13;
        int i14 = this.addend + 362437;
        this.addend = i14;
        return i13 + i14;
    }

    public XorWowRandom(int i10, int i11) {
        this(i10, i11, 0, 0, ~i10, (i10 << 10) ^ (i11 >>> 4));
    }
}
