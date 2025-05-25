package kk;

import java.io.IOException;

/* compiled from: AsyncTimeout.kt */
/* loaded from: classes3.dex */
public final class c implements y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f19822a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y f19823b;

    public c(x xVar, n nVar) {
        this.f19822a = xVar;
        this.f19823b = nVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        y yVar = this.f19823b;
        a aVar = this.f19822a;
        aVar.h();
        try {
            yVar.close();
            tf.d dVar = tf.d.f30009a;
            if (!aVar.i()) {
                return;
            }
            throw aVar.j(null);
        } catch (IOException e10) {
            if (!aVar.i()) {
                throw e10;
            }
            throw aVar.j(e10);
        } finally {
            aVar.i();
        }
    }

    @Override // kk.y
    public final long g(f sink, long j10) {
        kotlin.jvm.internal.g.e(sink, "sink");
        y yVar = this.f19823b;
        a aVar = this.f19822a;
        aVar.h();
        try {
            long g10 = yVar.g(sink, 8192L);
            if (!aVar.i()) {
                return g10;
            }
            throw aVar.j(null);
        } catch (IOException e10) {
            if (!aVar.i()) {
                throw e10;
            }
            throw aVar.j(e10);
        } finally {
            aVar.i();
        }
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.f19823b + ')';
    }

    @Override // kk.y
    public final z z() {
        return this.f19822a;
    }
}
