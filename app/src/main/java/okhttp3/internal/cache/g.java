package okhttp3.internal.cache;

import cg.l;
import java.io.IOException;
import kk.i;
import kk.w;

/* compiled from: FaultHidingSink.kt */
/* loaded from: classes3.dex */
public final class g extends i {

    /* renamed from: b  reason: collision with root package name */
    public final l<IOException, tf.d> f23264b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(w delegate, l<? super IOException, tf.d> lVar) {
        super(delegate);
        kotlin.jvm.internal.g.e(delegate, "delegate");
        this.f23264b = lVar;
    }

    @Override // kk.i, kk.w
    public final void D(kk.f source, long j10) {
        kotlin.jvm.internal.g.e(source, "source");
        if (this.c) {
            source.skip(j10);
            return;
        }
        try {
            super.D(source, j10);
        } catch (IOException e10) {
            this.c = true;
            this.f23264b.invoke(e10);
        }
    }

    @Override // kk.i, kk.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.c = true;
            this.f23264b.invoke(e10);
        }
    }

    @Override // kk.i, kk.w, java.io.Flushable
    public final void flush() {
        if (this.c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.c = true;
            this.f23264b.invoke(e10);
        }
    }
}
