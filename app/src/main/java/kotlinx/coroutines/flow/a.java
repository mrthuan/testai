package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: Channels.kt */
/* loaded from: classes.dex */
public final class a<T> extends kotlinx.coroutines.flow.internal.c<T> {

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20089f = AtomicIntegerFieldUpdater.newUpdater(a.class, "consumed");
    private volatile int consumed;

    /* renamed from: d  reason: collision with root package name */
    public final kotlinx.coroutines.channels.l<T> f20090d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f20091e;

    public /* synthetic */ a(kotlinx.coroutines.channels.l lVar, boolean z10) {
        this(lVar, z10, EmptyCoroutineContext.INSTANCE, -3, BufferOverflow.SUSPEND);
    }

    @Override // kotlinx.coroutines.flow.internal.c, kotlinx.coroutines.flow.c
    public final Object a(d<? super T> dVar, kotlin.coroutines.c<? super tf.d> cVar) {
        if (this.f20116b == -3) {
            m();
            Object a10 = FlowKt__ChannelsKt.a(dVar, this.f20090d, this.f20091e, cVar);
            if (a10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return a10;
            }
            return tf.d.f30009a;
        }
        Object a11 = super.a(dVar, cVar);
        if (a11 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a11;
        }
        return tf.d.f30009a;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    public final String h() {
        return "channel=" + this.f20090d;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    public final Object i(kotlinx.coroutines.channels.j<? super T> jVar, kotlin.coroutines.c<? super tf.d> cVar) {
        Object a10 = FlowKt__ChannelsKt.a(new kotlinx.coroutines.flow.internal.m(jVar), this.f20090d, this.f20091e, cVar);
        if (a10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a10;
        }
        return tf.d.f30009a;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    public final kotlinx.coroutines.flow.internal.c<T> j(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        return new a(this.f20090d, this.f20091e, coroutineContext, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.c
    public final c<T> k() {
        return new a(this.f20090d, this.f20091e);
    }

    @Override // kotlinx.coroutines.flow.internal.c
    public final kotlinx.coroutines.channels.l<T> l(kotlinx.coroutines.w wVar) {
        m();
        if (this.f20116b == -3) {
            return this.f20090d;
        }
        return super.l(wVar);
    }

    public final void m() {
        if (this.f20091e) {
            boolean z10 = true;
            if (f20089f.getAndSet(this, 1) != 0) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(kotlinx.coroutines.channels.l<? extends T> lVar, boolean z10, CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        super(coroutineContext, i10, bufferOverflow);
        this.f20090d = lVar;
        this.f20091e = z10;
        this.consumed = 0;
    }
}
