package kotlinx.coroutines.channels;

import kotlinx.coroutines.v;

/* compiled from: Produce.kt */
/* loaded from: classes.dex */
public final class i<E> extends c<E> implements j<E> {
    @Override // kotlinx.coroutines.a, kotlinx.coroutines.c1, kotlinx.coroutines.y0
    public final boolean a() {
        return super.a();
    }

    @Override // kotlinx.coroutines.a
    public final void k0(boolean z10, Throwable th2) {
        if (!this.f20036d.m(th2) && !z10) {
            v.a(this.c, th2);
        }
    }

    @Override // kotlinx.coroutines.a
    public final void l0(tf.d dVar) {
        this.f20036d.m(null);
    }

    @Override // kotlinx.coroutines.channels.j
    public final i l() {
        return this;
    }
}
