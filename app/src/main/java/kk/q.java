package kk;

import java.io.OutputStream;

/* compiled from: JvmOkio.kt */
/* loaded from: classes3.dex */
public final class q implements w {

    /* renamed from: a  reason: collision with root package name */
    public final OutputStream f19842a;

    /* renamed from: b  reason: collision with root package name */
    public final z f19843b;

    public q(OutputStream outputStream, z zVar) {
        this.f19842a = outputStream;
        this.f19843b = zVar;
    }

    @Override // kk.w
    public final void D(f source, long j10) {
        kotlin.jvm.internal.g.e(source, "source");
        androidx.activity.s.u(source.f19826b, 0L, j10);
        while (j10 > 0) {
            this.f19843b.f();
            u uVar = source.f19825a;
            kotlin.jvm.internal.g.b(uVar);
            int min = (int) Math.min(j10, uVar.c - uVar.f19850b);
            this.f19842a.write(uVar.f19849a, uVar.f19850b, min);
            int i10 = uVar.f19850b + min;
            uVar.f19850b = i10;
            long j11 = min;
            j10 -= j11;
            source.f19826b -= j11;
            if (i10 == uVar.c) {
                source.f19825a = uVar.a();
                v.a(uVar);
            }
        }
    }

    @Override // kk.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f19842a.close();
    }

    @Override // kk.w, java.io.Flushable
    public final void flush() {
        this.f19842a.flush();
    }

    public final String toString() {
        return "sink(" + this.f19842a + ')';
    }

    @Override // kk.w
    public final z z() {
        return this.f19843b;
    }
}
