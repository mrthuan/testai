package com.airbnb.lottie.parser.moshi;

import a0.d;
import java.io.Closeable;
import java.util.Arrays;
import kk.p;

/* loaded from: classes.dex */
public abstract class JsonReader implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f6153e = new String[128];

    /* renamed from: a  reason: collision with root package name */
    public int f6154a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f6155b = new int[32];
    public String[] c = new String[32];

    /* renamed from: d  reason: collision with root package name */
    public int[] f6156d = new int[32];

    /* loaded from: classes.dex */
    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f6158a;

        /* renamed from: b  reason: collision with root package name */
        public final p f6159b;

        public a(String[] strArr, p pVar) {
            this.f6158a = strArr;
            this.f6159b = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x006b, TryCatch #0 {IOException -> 0x006b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.airbnb.lottie.parser.moshi.JsonReader.a a(java.lang.String... r12) {
            /*
                int r0 = r12.length     // Catch: java.io.IOException -> L6b
                okio.ByteString[] r0 = new okio.ByteString[r0]     // Catch: java.io.IOException -> L6b
                kk.f r1 = new kk.f     // Catch: java.io.IOException -> L6b
                r1.<init>()     // Catch: java.io.IOException -> L6b
                r2 = 0
                r3 = r2
            La:
                int r4 = r12.length     // Catch: java.io.IOException -> L6b
                if (r3 >= r4) goto L5b
                r4 = r12[r3]     // Catch: java.io.IOException -> L6b
                java.lang.String[] r5 = com.airbnb.lottie.parser.moshi.JsonReader.f6153e     // Catch: java.io.IOException -> L6b
                r6 = 34
                r1.q(r6)     // Catch: java.io.IOException -> L6b
                int r7 = r4.length()     // Catch: java.io.IOException -> L6b
                r8 = r2
                r9 = r8
            L1c:
                if (r8 >= r7) goto L45
                char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6b
                r11 = 128(0x80, float:1.8E-43)
                if (r10 >= r11) goto L2b
                r10 = r5[r10]     // Catch: java.io.IOException -> L6b
                if (r10 != 0) goto L38
                goto L42
            L2b:
                r11 = 8232(0x2028, float:1.1535E-41)
                if (r10 != r11) goto L32
                java.lang.String r10 = "\\u2028"
                goto L38
            L32:
                r11 = 8233(0x2029, float:1.1537E-41)
                if (r10 != r11) goto L42
                java.lang.String r10 = "\\u2029"
            L38:
                if (r9 >= r8) goto L3d
                r1.w(r9, r8, r4)     // Catch: java.io.IOException -> L6b
            L3d:
                r1.x(r10)     // Catch: java.io.IOException -> L6b
                int r9 = r8 + 1
            L42:
                int r8 = r8 + 1
                goto L1c
            L45:
                if (r9 >= r7) goto L4a
                r1.w(r9, r7, r4)     // Catch: java.io.IOException -> L6b
            L4a:
                r1.q(r6)     // Catch: java.io.IOException -> L6b
                r1.readByte()     // Catch: java.io.IOException -> L6b
                long r4 = r1.f19826b     // Catch: java.io.IOException -> L6b
                okio.ByteString r4 = r1.e(r4)     // Catch: java.io.IOException -> L6b
                r0[r3] = r4     // Catch: java.io.IOException -> L6b
                int r3 = r3 + 1
                goto La
            L5b:
                com.airbnb.lottie.parser.moshi.JsonReader$a r1 = new com.airbnb.lottie.parser.moshi.JsonReader$a     // Catch: java.io.IOException -> L6b
                java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6b
                java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6b
                kk.p r0 = kk.p.a.b(r0)     // Catch: java.io.IOException -> L6b
                r1.<init>(r12, r0)     // Catch: java.io.IOException -> L6b
                return r1
            L6b:
                r12 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.JsonReader.a.a(java.lang.String[]):com.airbnb.lottie.parser.moshi.JsonReader$a");
        }
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f6153e[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f6153e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public final String f() {
        int i10 = this.f6154a;
        int[] iArr = this.f6155b;
        String[] strArr = this.c;
        int[] iArr2 = this.f6156d;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 != 1 && i12 != 2) {
                if (i12 == 3 || i12 == 4 || i12 == 5) {
                    sb2.append('.');
                    String str = strArr[i11];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            } else {
                sb2.append('[');
                sb2.append(iArr2[i11]);
                sb2.append(']');
            }
        }
        return sb2.toString();
    }

    public abstract boolean h();

    public abstract boolean i();

    public abstract double j();

    public abstract int k();

    public abstract String l();

    public abstract Token m();

    public final void n(int i10) {
        int i11 = this.f6154a;
        int[] iArr = this.f6155b;
        if (i11 == iArr.length) {
            if (i11 != 256) {
                this.f6155b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.c;
                this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f6156d;
                this.f6156d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new JsonDataException("Nesting too deep at " + f());
            }
        }
        int[] iArr3 = this.f6155b;
        int i12 = this.f6154a;
        this.f6154a = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int o(a aVar);

    public abstract void p();

    public abstract void q();

    public final void r(String str) {
        StringBuilder g10 = d.g(str, " at path ");
        g10.append(f());
        throw new JsonEncodingException(g10.toString());
    }
}
