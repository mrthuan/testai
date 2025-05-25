package androidx.fragment.app;

import java.io.Writer;

/* compiled from: LogWriter.java */
/* loaded from: classes.dex */
public final class z0 extends Writer {

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f3965a = new StringBuilder(128);

    public final void a() {
        StringBuilder sb2 = this.f3965a;
        if (sb2.length() > 0) {
            sb2.toString();
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c = cArr[i10 + i12];
            if (c == '\n') {
                a();
            } else {
                this.f3965a.append(c);
            }
        }
    }
}
