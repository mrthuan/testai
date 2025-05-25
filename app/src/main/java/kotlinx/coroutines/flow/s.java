package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.y0;

/* compiled from: Share.kt */
/* loaded from: classes.dex */
public final class s<T> implements a0<T>, c, kotlinx.coroutines.flow.internal.j<T> {

    /* renamed from: a  reason: collision with root package name */
    public final y0 f20133a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0<T> f20134b;

    public s(r rVar, l1 l1Var) {
        this.f20133a = l1Var;
        this.f20134b = rVar;
    }

    @Override // kotlinx.coroutines.flow.c
    public final Object a(d<? super T> dVar, kotlin.coroutines.c<?> cVar) {
        return this.f20134b.a(dVar, cVar);
    }

    @Override // kotlinx.coroutines.flow.a0
    public final T b() {
        return this.f20134b.b();
    }

    @Override // kotlinx.coroutines.flow.internal.j
    public final c<T> g(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        boolean z10;
        if (i10 >= 0 && i10 < 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (((z10 || i10 == -2) && bufferOverflow == BufferOverflow.DROP_OLDEST) || ((i10 == 0 || i10 == -3) && bufferOverflow == BufferOverflow.SUSPEND)) {
            return this;
        }
        return new kotlinx.coroutines.flow.internal.e(i10, coroutineContext, bufferOverflow, this);
    }
}
