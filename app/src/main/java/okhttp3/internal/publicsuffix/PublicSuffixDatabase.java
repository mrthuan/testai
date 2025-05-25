package okhttp3.internal.publicsuffix;

import ak.b;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kk.l;
import kk.t;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import kotlin.text.k;
import tf.d;

/* compiled from: PublicSuffixDatabase.kt */
/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f23345e;

    /* renamed from: f  reason: collision with root package name */
    public static final List<String> f23346f;

    /* renamed from: g  reason: collision with root package name */
    public static final PublicSuffixDatabase f23347g;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f23348a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f23349b = new CountDownLatch(1);
    public byte[] c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f23350d;

    /* compiled from: PublicSuffixDatabase.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final String a(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            boolean z10;
            int i12;
            int i13;
            byte[] bArr3 = PublicSuffixDatabase.f23345e;
            int length = bArr.length;
            int i14 = 0;
            while (i14 < length) {
                int i15 = (i14 + length) / 2;
                while (i15 > -1 && bArr[i15] != 10) {
                    i15--;
                }
                int i16 = i15 + 1;
                int i17 = 1;
                while (true) {
                    i11 = i16 + i17;
                    if (bArr[i11] == 10) {
                        break;
                    }
                    i17++;
                }
                int i18 = i11 - i16;
                int i19 = i10;
                boolean z11 = false;
                int i20 = 0;
                int i21 = 0;
                while (true) {
                    if (z11) {
                        i12 = 46;
                        z10 = false;
                    } else {
                        byte b10 = bArr2[i19][i20];
                        byte[] bArr4 = b.f665a;
                        int i22 = b10 & 255;
                        z10 = z11;
                        i12 = i22;
                    }
                    byte b11 = bArr[i16 + i21];
                    byte[] bArr5 = b.f665a;
                    i13 = i12 - (b11 & 255);
                    if (i13 != 0) {
                        break;
                    }
                    i21++;
                    i20++;
                    if (i21 == i18) {
                        break;
                    } else if (bArr2[i19].length == i20) {
                        if (i19 == bArr2.length - 1) {
                            break;
                        }
                        i19++;
                        i20 = -1;
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                }
                if (i13 >= 0) {
                    if (i13 <= 0) {
                        int i23 = i18 - i21;
                        int length2 = bArr2[i19].length - i20;
                        int length3 = bArr2.length;
                        for (int i24 = i19 + 1; i24 < length3; i24++) {
                            length2 += bArr2[i24].length;
                        }
                        if (length2 >= i23) {
                            if (length2 <= i23) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                g.d(UTF_8, "UTF_8");
                                return new String(bArr, i16, i18, UTF_8);
                            }
                        }
                    }
                    i14 = i11 + 1;
                }
                length = i16 - 1;
            }
            return null;
        }
    }

    static {
        new a();
        f23345e = new byte[]{42};
        f23346f = ge.a.H("*");
        f23347g = new PublicSuffixDatabase();
    }

    public static List c(String str) {
        int i10 = 0;
        List g02 = k.g0(str, new char[]{'.'});
        if (g.a(m.x0(g02), "")) {
            List list = g02;
            int size = g02.size() - 1;
            if (size >= 0) {
                i10 = size;
            }
            return m.B0(list, i10);
        }
        return g02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r1 == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r1 != false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String");
    }

    public final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        t m10 = ge.a.m(new l(ge.a.Z(resourceAsStream)));
        try {
            long readInt = m10.readInt();
            m10.g0(readInt);
            byte[] h10 = m10.f19848b.h(readInt);
            long readInt2 = m10.readInt();
            m10.g0(readInt2);
            byte[] h11 = m10.f19848b.h(readInt2);
            d dVar = d.f30009a;
            o9.d.l(m10, null);
            synchronized (this) {
                this.c = h10;
                this.f23350d = h11;
            }
            this.f23349b.countDown();
        } finally {
        }
    }
}
