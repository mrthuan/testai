package ma;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* compiled from: FileBackedNativeSessionFile.java */
/* loaded from: classes2.dex */
public final class e0 implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public final File f21890a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21891b;
    public final String c;

    public e0(String str, String str2, File file) {
        this.f21891b = str;
        this.c = str2;
        this.f21890a = file;
    }

    @Override // ma.h0
    public final String a() {
        return this.c;
    }

    @Override // ma.h0
    public final InputStream b() {
        File file = this.f21890a;
        if (file.exists() && file.isFile()) {
            try {
                return new FileInputStream(file);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0073 A[ORIG_RETURN, RETURN] */
    @Override // ma.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final oa.g c() {
        /*
            r7 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1 = 0
            java.io.InputStream r2 = r7.b()     // Catch: java.io.IOException -> L5d
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L51
            r3.<init>()     // Catch: java.lang.Throwable -> L51
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L47
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L21
            r4.close()     // Catch: java.lang.Throwable -> L47
            r3.close()     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L5d
            r2.close()     // Catch: java.io.IOException -> L5d
            goto L5d
        L21:
            int r5 = r2.read(r0)     // Catch: java.lang.Throwable -> L3d
            if (r5 <= 0) goto L2c
            r6 = 0
            r4.write(r0, r6, r5)     // Catch: java.lang.Throwable -> L3d
            goto L21
        L2c:
            r4.finish()     // Catch: java.lang.Throwable -> L3d
            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Throwable -> L3d
            r4.close()     // Catch: java.lang.Throwable -> L47
            r3.close()     // Catch: java.lang.Throwable -> L51
            r2.close()     // Catch: java.io.IOException -> L5d
            goto L5e
        L3d:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r4 = move-exception
            r0.addSuppressed(r4)     // Catch: java.lang.Throwable -> L47
        L46:
            throw r0     // Catch: java.lang.Throwable -> L47
        L47:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L4c
            goto L50
        L4c:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Throwable -> L51
        L50:
            throw r0     // Catch: java.lang.Throwable -> L51
        L51:
            r0 = move-exception
            if (r2 == 0) goto L5c
            r2.close()     // Catch: java.lang.Throwable -> L58
            goto L5c
        L58:
            r2 = move-exception
            r0.addSuppressed(r2)     // Catch: java.io.IOException -> L5d
        L5c:
            throw r0     // Catch: java.io.IOException -> L5d
        L5d:
            r0 = r1
        L5e:
            if (r0 == 0) goto L73
            java.lang.String r1 = r7.f21891b
            if (r1 == 0) goto L6b
            oa.g r2 = new oa.g
            r2.<init>(r1, r0)
            r1 = r2
            goto L73
        L6b:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null filename"
            r0.<init>(r1)
            throw r0
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.e0.c():oa.g");
    }
}
