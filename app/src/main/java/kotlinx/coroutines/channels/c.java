package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.JobCancellationException;

/* compiled from: ChannelCoroutine.kt */
/* loaded from: classes.dex */
public class c<E> extends kotlinx.coroutines.a<tf.d> implements b<E> {

    /* renamed from: d  reason: collision with root package name */
    public final b<E> f20036d;

    public c(CoroutineContext coroutineContext, BufferedChannel bufferedChannel) {
        super(coroutineContext, true);
        this.f20036d = bufferedChannel;
    }

    @Override // kotlinx.coroutines.c1
    public final void F(CancellationException cancellationException) {
        this.f20036d.b(cancellationException);
        E(cancellationException);
    }

    @Override // kotlinx.coroutines.c1, kotlinx.coroutines.y0
    public final void b(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(H(), null, this);
        }
        F(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.l
    public final Object e() {
        return this.f20036d.e();
    }

    @Override // kotlinx.coroutines.channels.l
    public final d<E> iterator() {
        return this.f20036d.iterator();
    }

    @Override // kotlinx.coroutines.channels.l
    public final Object j(kotlin.coroutines.c<? super f<? extends E>> cVar) {
        Object j10 = this.f20036d.j(cVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return j10;
    }

    @Override // kotlinx.coroutines.channels.m
    public final boolean m(Throwable th2) {
        return this.f20036d.m(th2);
    }

    @Override // kotlinx.coroutines.channels.m
    public final void p(cg.l<? super Throwable, tf.d> lVar) {
        this.f20036d.p(lVar);
    }

    @Override // kotlinx.coroutines.channels.m
    public final Object v(E e10) {
        return this.f20036d.v(e10);
    }

    @Override // kotlinx.coroutines.channels.m
    public final Object x(E e10, kotlin.coroutines.c<? super tf.d> cVar) {
        return this.f20036d.x(e10, cVar);
    }

    @Override // kotlinx.coroutines.channels.m
    public final boolean y() {
        return this.f20036d.y();
    }
}
