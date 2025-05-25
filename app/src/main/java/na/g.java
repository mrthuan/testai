package na;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Objects;

/* compiled from: QueueFileLogStore.java */
/* loaded from: classes2.dex */
public final class g implements na.a {

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f22387d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final File f22388a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22389b = 65536;
    public f c;

    /* compiled from: QueueFileLogStore.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f22390a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22391b;

        public a(byte[] bArr, int i10) {
            this.f22390a = bArr;
            this.f22391b = i10;
        }
    }

    public g(File file) {
        this.f22388a = file;
    }

    @Override // na.a
    public final void a() {
        CommonUtils.a(this.c);
        this.c = null;
    }

    @Override // na.a
    public final String b() {
        byte[] c = c();
        if (c != null) {
            return new String(c, f22387d);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    @Override // na.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] c() {
        /*
            r10 = this;
            java.io.File r0 = r10.f22388a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lb
            goto L20
        Lb:
            java.io.File r0 = r10.f22388a
            na.f r3 = r10.c
            if (r3 != 0) goto L1c
            na.f r3 = new na.f     // Catch: java.io.IOException -> L19
            r3.<init>(r0)     // Catch: java.io.IOException -> L19
            r10.c = r3     // Catch: java.io.IOException -> L19
            goto L1c
        L19:
            java.util.Objects.toString(r0)
        L1c:
            na.f r0 = r10.c
            if (r0 != 0) goto L22
        L20:
            r4 = r1
            goto L6f
        L22:
            int[] r3 = new int[]{r2}
            int r0 = r0.k()
            byte[] r0 = new byte[r0]
            na.f r4 = r10.c     // Catch: java.io.IOException -> L68
            monitor-enter(r4)     // Catch: java.io.IOException -> L68
            na.f$a r5 = r4.f22380d     // Catch: java.lang.Throwable -> L65
            int r5 = r5.f22383a     // Catch: java.lang.Throwable -> L65
            r6 = r2
        L34:
            int r7 = r4.c     // Catch: java.lang.Throwable -> L65
            if (r6 >= r7) goto L63
            na.f$a r5 = r4.d(r5)     // Catch: java.lang.Throwable -> L65
            na.f$b r7 = new na.f$b     // Catch: java.lang.Throwable -> L65
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L65
            int r8 = r5.f22384b     // Catch: java.lang.Throwable -> L65
            r9 = r3[r2]     // Catch: java.lang.Throwable -> L5e
            r7.read(r0, r9, r8)     // Catch: java.lang.Throwable -> L5e
            r9 = r3[r2]     // Catch: java.lang.Throwable -> L5e
            int r9 = r9 + r8
            r3[r2] = r9     // Catch: java.lang.Throwable -> L5e
            r7.close()     // Catch: java.lang.Throwable -> L65
            int r7 = r5.f22383a     // Catch: java.lang.Throwable -> L65
            int r7 = r7 + 4
            int r5 = r5.f22384b     // Catch: java.lang.Throwable -> L65
            int r7 = r7 + r5
            int r5 = r4.l(r7)     // Catch: java.lang.Throwable -> L65
            int r6 = r6 + 1
            goto L34
        L5e:
            r5 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L65
            throw r5     // Catch: java.lang.Throwable -> L65
        L63:
            monitor-exit(r4)     // Catch: java.io.IOException -> L68
            goto L68
        L65:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.io.IOException -> L68
            throw r5     // Catch: java.io.IOException -> L68
        L68:
            na.g$a r4 = new na.g$a
            r3 = r3[r2]
            r4.<init>(r0, r3)
        L6f:
            if (r4 != 0) goto L72
            return r1
        L72:
            int r0 = r4.f22391b
            byte[] r1 = new byte[r0]
            byte[] r3 = r4.f22390a
            java.lang.System.arraycopy(r3, r2, r1, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: na.g.c():byte[]");
    }

    @Override // na.a
    public final void d() {
        a();
        this.f22388a.delete();
    }

    @Override // na.a
    public final void e(long j10, String str) {
        int i10;
        File file = this.f22388a;
        if (this.c == null) {
            try {
                this.c = new f(file);
            } catch (IOException unused) {
                Objects.toString(file);
            }
        }
        int i11 = this.f22389b;
        if (this.c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                if (str.length() > i11 / 4) {
                    str = "..." + str.substring(str.length() - i10);
                }
                this.c.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f22387d));
                while (!this.c.c() && this.c.k() > i11) {
                    this.c.h();
                }
            } catch (IOException unused2) {
            }
        }
    }
}
