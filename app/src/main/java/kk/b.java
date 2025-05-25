package kk;

import java.io.IOException;

/* compiled from: AsyncTimeout.kt */
/* loaded from: classes3.dex */
public final class b implements w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f19820a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f19821b;

    public b(x xVar, q qVar) {
        this.f19820a = xVar;
        this.f19821b = qVar;
    }

    @Override // kk.w
    public final void D(f source, long j10) {
        kotlin.jvm.internal.g.e(source, "source");
        androidx.activity.s.u(source.f19826b, 0L, j10);
        while (true) {
            long j11 = 0;
            if (j10 > 0) {
                u uVar = source.f19825a;
                kotlin.jvm.internal.g.b(uVar);
                while (true) {
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += uVar.c - uVar.f19850b;
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        uVar = uVar.f19853f;
                        kotlin.jvm.internal.g.b(uVar);
                    }
                }
                w wVar = this.f19821b;
                a aVar = this.f19820a;
                aVar.h();
                try {
                    wVar.D(source, j11);
                    tf.d dVar = tf.d.f30009a;
                    if (!aVar.i()) {
                        j10 -= j11;
                    } else {
                        throw aVar.j(null);
                    }
                } catch (IOException e10) {
                    if (!aVar.i()) {
                        throw e10;
                    }
                    throw aVar.j(e10);
                } finally {
                    aVar.i();
                }
            } else {
                return;
            }
        }
    }

    @Override // kk.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        w wVar = this.f19821b;
        a aVar = this.f19820a;
        aVar.h();
        try {
            wVar.close();
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

    @Override // kk.w, java.io.Flushable
    public final void flush() {
        w wVar = this.f19821b;
        a aVar = this.f19820a;
        aVar.h();
        try {
            wVar.flush();
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

    public final String toString() {
        return "AsyncTimeout.sink(" + this.f19821b + ')';
    }

    @Override // kk.w
    public final z z() {
        return this.f19820a;
    }
}
