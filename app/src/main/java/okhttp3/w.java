package okhttp3;

/* compiled from: RequestBody.kt */
/* loaded from: classes3.dex */
public abstract class w {

    /* compiled from: RequestBody.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static v a(byte[] bArr, r rVar, int i10) {
            int i11;
            if ((i10 & 1) != 0) {
                rVar = null;
            }
            if ((i10 & 4) != 0) {
                i11 = bArr.length;
            } else {
                i11 = 0;
            }
            long length = bArr.length;
            long j10 = 0;
            long j11 = i11;
            byte[] bArr2 = ak.b.f665a;
            if ((j10 | j11) >= 0 && j10 <= length && length - j10 >= j11) {
                return new v(i11, 0, rVar, bArr);
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    static {
        new a();
    }

    public abstract long a();

    public abstract r b();

    public abstract void c(kk.g gVar);
}
