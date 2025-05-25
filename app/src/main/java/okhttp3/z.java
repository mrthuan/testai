package okhttp3;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: ResponseBody.kt */
/* loaded from: classes3.dex */
public abstract class z implements Closeable {
    public abstract long a();

    public abstract InputStream b(long j10, long j11);

    public abstract long c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ak.b.c(f());
    }

    public abstract r d();

    public abstract kk.h f();

    public String h() {
        Charset a10;
        kk.h f10 = f();
        try {
            r d10 = d();
            if (d10 == null) {
                a10 = null;
            } else {
                a10 = d10.a(kotlin.text.a.f19966b);
            }
            if (a10 == null) {
                a10 = kotlin.text.a.f19966b;
            }
            String O = f10.O(ak.b.r(f10, a10));
            o9.d.l(f10, null);
            return O;
        } finally {
        }
    }
}
