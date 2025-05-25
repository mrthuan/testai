package y;

/* compiled from: CircularIntArray.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public int[] f31919a;

    /* renamed from: b  reason: collision with root package name */
    public int f31920b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f31921d;

    public e() {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f31921d = highestOneBit - 1;
        this.f31919a = new int[highestOneBit];
    }

    public final void a(int i10) {
        int[] iArr = this.f31919a;
        int i11 = this.c;
        iArr[i11] = i10;
        int i12 = this.f31921d & (i11 + 1);
        this.c = i12;
        int i13 = this.f31920b;
        if (i12 == i13) {
            int length = iArr.length;
            int i14 = length - i13;
            int i15 = length << 1;
            if (i15 >= 0) {
                int[] iArr2 = new int[i15];
                System.arraycopy(iArr, i13, iArr2, 0, i14);
                System.arraycopy(this.f31919a, 0, iArr2, i14, this.f31920b);
                this.f31919a = iArr2;
                this.f31920b = 0;
                this.c = length;
                this.f31921d = i15 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }
}
