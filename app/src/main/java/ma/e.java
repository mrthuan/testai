package ma;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: BytesBackedNativeSessionFile.java */
/* loaded from: classes2.dex */
public final class e implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f21888a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21889b;
    public final String c;

    public e(String str, byte[] bArr, String str2) {
        this.f21889b = str;
        this.c = str2;
        this.f21888a = bArr;
    }

    @Override // ma.h0
    public final String a() {
        return this.c;
    }

    @Override // ma.h0
    public final InputStream b() {
        boolean z10;
        byte[] bArr = this.f21888a;
        if (bArr != null && bArr.length != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return null;
        }
        return new ByteArrayInputStream(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // ma.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final oa.g c() {
        /*
            r4 = this;
            byte[] r0 = r4.f21888a
            if (r0 == 0) goto La
            int r1 = r0.length
            if (r1 != 0) goto L8
            goto La
        L8:
            r1 = 0
            goto Lb
        La:
            r1 = 1
        Lb:
            r2 = 0
            if (r1 == 0) goto Lf
            goto L3e
        Lf:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L3e
            r1.<init>()     // Catch: java.io.IOException -> L3e
            java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L34
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L34
            r3.write(r0)     // Catch: java.lang.Throwable -> L2a
            r3.finish()     // Catch: java.lang.Throwable -> L2a
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L2a
            r3.close()     // Catch: java.lang.Throwable -> L34
            r1.close()     // Catch: java.io.IOException -> L3e
            goto L3f
        L2a:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L2f
            goto L33
        L2f:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Throwable -> L34
        L33:
            throw r0     // Catch: java.lang.Throwable -> L34
        L34:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L39
            goto L3d
        L39:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.io.IOException -> L3e
        L3d:
            throw r0     // Catch: java.io.IOException -> L3e
        L3e:
            r0 = r2
        L3f:
            if (r0 != 0) goto L42
            goto L4b
        L42:
            java.lang.String r1 = r4.f21889b
            if (r1 == 0) goto L4c
            oa.g r2 = new oa.g
            r2.<init>(r1, r0)
        L4b:
            return r2
        L4c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null filename"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.e.c():oa.g");
    }
}
